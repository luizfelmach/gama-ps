let tasks = [];


function addTaskEnter(event) {
  if (event.key === 'Enter') {
      event.preventDefault();
      addTask();
  }
}

function addTask() {
  let taskTextSelector = document.querySelector("#task-text");

  let task = {
    key: new Date().getTime(),
    name: taskTextSelector.value,
    date: "13/03/2024",
    finished: false,
    priority: 1,
  };

  taskTextSelector.value = "";

  tasks.push(task);
  addTaksHtml(task);
}

function toggleTask(key) {
  const taskDiv = document.querySelector(`[data-key='task-${key}']`);
  const index = tasks.findIndex(t => t.key == key);
  tasks[index].finished = !tasks[index].finished;

  const newHtml = TaskComponent(tasks[index]);
  taskDiv.outerHTML = newHtml;
}

function deleteTask(key) {
    const taskDiv = document.querySelector(`[data-key='task-${key}']`);
    taskDiv.remove();
    tasks = tasks.filter(task => task.key !== key);
}

function rerenderTaskHtml(task) {
  const { key } = task;
  const taskDiv = document.querySelector(`[data-key='task-${key}']`);
  const newHtml = TaskComponent(task);
  taskDiv.innerHTML = newHtml;
}

function addTaksHtml(task) {
  let tasksDiv = document.getElementById("tasks");

  let taskComponent = TaskComponent(task);

  var tempDiv = document.createElement("div");
  tempDiv.innerHTML = taskComponent;
  var newElement = tempDiv.firstChild;

  tasksDiv.appendChild(newElement);
}

function TaskComponent(task) {
  const { key, name, date, finished, priority } = task;

  return `
    <div
      id="task"
      class="bg-white-2 p-2 rounded my-4"
      data-key="task-${key}"
      >
      <div class="flex gap-4 m-4">
        <input
          id="checkbox"
          type="checkbox"
          ${finished ? "checked" : ""}
          onclick="toggleTask(${key})"
        >
        <h4 class="flex-1 ${finished ? 'line-through' : ''}">${name}</h4>
        <button
          id="button-1"
          class="p-2"
          onclick="deleteTask(${key})"
        >
        </button>
      </div>
      <div class="m-4 flex gap-4">
        <div id="icon-date" class="flex items-center">
          ${date}
        </div>
        <div>
          Prioridade: <span class="p-1 bg-red rounded">${priority}</span>
        </div>
      </div>
    </div>`.trim();
}
