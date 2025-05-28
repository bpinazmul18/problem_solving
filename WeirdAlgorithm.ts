const readline = require("node:readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let inputNum: number;

const askQuestion = (question: string): Promise<number> => {
  return new Promise((resolve) => {
    rl.question(question, (answer) => {
      resolve(parseInt(answer));
      rl.close();
    });
  });
};

const main = async () => {
  inputNum = await askQuestion("Input: ");

  while (inputNum !== 1) {
    console.log(inputNum);
    // even
    if (inputNum % 2 === 0) {
      inputNum = inputNum / 2;
    } else {
      // odd
      inputNum = inputNum * 3 + 1;
    }
  }
};

main();
