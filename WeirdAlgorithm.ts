let inputNum: number = 3;

while (inputNum !== 1) {
  // even
  if (inputNum % 2 === 0) {
    inputNum = inputNum / 2;
  } else {
    // odd
    inputNum = inputNum * 3 + 1;
  }
}
