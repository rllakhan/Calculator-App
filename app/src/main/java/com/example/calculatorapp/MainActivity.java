package com.example.calculatorapp;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        EditText etInput = findViewById(R.id.etInput);
        TextView tvOutput = findViewById(R.id.tvOutput);

        Button btn00 = findViewById(R.id.btn00);
        Button btn0 = findViewById(R.id.btn0);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);

        Button btnMod = findViewById(R.id.btnMod);
        Button btnDiv = findViewById(R.id.btnDiv);
        Button btnMul = findViewById(R.id.btnMul);
        Button btnSub = findViewById(R.id.btnSub);
        Button btnAdd = findViewById(R.id.btnAdd);

        Button btnAC = findViewById(R.id.btnAC);
        Button btnC = findViewById(R.id.btnC);
        Button btnEqual = findViewById(R.id.btnEqual);


        btn00.setOnClickListener(v -> {
            if (etInput.getText().toString().length() < 10) {
                String str = etInput.getText().toString();
                etInput.setText(str + "00");
            } else {
                etInput.setTextSize(30);
                String str = etInput.getText().toString();
                etInput.setText(str + "00");
            }
        });

        btn0.setOnClickListener(v -> {
            if (etInput.getText().toString().length() < 10) {
                String str = etInput.getText().toString();
                etInput.setText(str + "0");
            } else {
                etInput.setTextSize(30);
                String str = etInput.getText().toString();
                etInput.setText(str + "0");
            }
        });

        btn1.setOnClickListener(v -> {
            if (etInput.getText().toString().length() < 10) {
                String str = etInput.getText().toString();
                etInput.setText(str + "1");
            } else {
                etInput.setTextSize(30);
                String str = etInput.getText().toString();
                etInput.setText(str + "1");
            }
        });

        btn2.setOnClickListener(v -> {
            if (etInput.getText().toString().length() < 10) {
                String str = etInput.getText().toString();
                etInput.setText(str + "2");
            } else {
                etInput.setTextSize(30);
                String str = etInput.getText().toString();
                etInput.setText(str + "2");
            }
        });

        btn3.setOnClickListener(v -> {
            if (etInput.getText().toString().length() < 10) {
                String str = etInput.getText().toString();
                etInput.setText(str + "3");
            } else {
                etInput.setTextSize(30);
                String str = etInput.getText().toString();
                etInput.setText(str + "3");
            }
        });

        btn4.setOnClickListener(v -> {
            if (etInput.getText().toString().length() < 10) {
                String str = etInput.getText().toString();
                etInput.setText(str + "4");
            } else {
                etInput.setTextSize(30);
                String str = etInput.getText().toString();
                etInput.setText(str + "4");
            }
        });

        btn5.setOnClickListener(v -> {
            if (etInput.getText().toString().length() < 10) {
                String str = etInput.getText().toString();
                etInput.setText(str + "5");
            } else {
                etInput.setTextSize(30);
                String str = etInput.getText().toString();
                etInput.setText(str + "5");
            }
        });

        btn6.setOnClickListener(v -> {
            if (etInput.getText().toString().length() < 10) {
                String str = etInput.getText().toString();
                etInput.setText(str + "6");
            } else {
                etInput.setTextSize(30);
                String str = etInput.getText().toString();
                etInput.setText(str + "6");
            }
        });

        btn7.setOnClickListener(v -> {
            if (etInput.getText().toString().length() < 10) {
                String str = etInput.getText().toString();
                etInput.setText(str + "7");
            } else {
                etInput.setTextSize(30);
                String str = etInput.getText().toString();
                etInput.setText(str + "7");
            }
        });

        btn8.setOnClickListener(v -> {
            if (etInput.getText().toString().length() < 10) {
                String str = etInput.getText().toString();
                etInput.setText(str + "8");
            } else {
                etInput.setTextSize(30);
                String str = etInput.getText().toString();
                etInput.setText(str + "8");
            }
        });

        btn9.setOnClickListener(v -> {
            if (etInput.getText().toString().length() < 10) {
                String str = etInput.getText().toString();
                etInput.setText(str + "9");
            } else {
                etInput.setTextSize(30);
                String str = etInput.getText().toString();
                etInput.setText(str + "9");
            }
        });

        btnMod.setOnClickListener(v -> {
            if (etInput.getText().toString().length() < 10) {
                String str = etInput.getText().toString();
                etInput.setText(str + "%");
            } else {
                etInput.setTextSize(30);
                String str = etInput.getText().toString();
                etInput.setText(str + "%");
            }
        });

        btnDiv.setOnClickListener(v -> {
            if (etInput.getText().toString().length() < 10) {
                String str = etInput.getText().toString();
                etInput.setText(str + "÷");
            } else {
                etInput.setTextSize(30);
                String str = etInput.getText().toString();
                etInput.setText(str + "÷");
            }
        });

        btnMul.setOnClickListener(v -> {
            if (etInput.getText().toString().length() < 10) {
                String str = etInput.getText().toString();
                etInput.setText(str + "×");
            } else {
                etInput.setTextSize(30);
                String str = etInput.getText().toString();
                etInput.setText(str + "×");
            }
        });

        btnSub.setOnClickListener(v -> {
            if (etInput.getText().toString().length() < 10) {
                String str = etInput.getText().toString();
                etInput.setText(str + "-");
            } else {
                etInput.setTextSize(30);
                String str = etInput.getText().toString();
                etInput.setText(str + "-");
            }
        });

        btnAdd.setOnClickListener(v -> {
            if (etInput.getText().toString().length() < 10) {
                String str = etInput.getText().toString();
                etInput.setText(str + "+");
            } else {
                etInput.setTextSize(30);
                String str = etInput.getText().toString();
                etInput.setText(str + "+");
            }
        });

        btnAC.setOnClickListener(v -> {
            etInput.setText("");
            etInput.setTextSize(60);
            tvOutput.setText("");
        });

        btnC.setOnClickListener(v -> {
            String str = etInput.getText().toString();
            etInput.setText(str.substring(0, str.length() - 1));
            if (str.length() < 12) etInput.setTextSize(60);
        });

        btnEqual.setOnClickListener(v -> {
            String str = etInput.getText().toString();
            String expression = str.replace('÷', '/').replace('×', '*');

            if (isNotValidExpression(expression)) {
                tvOutput.setText("Invalid Expression!");
            } else {
                String res = evaluateExpression(expression);
                tvOutput.setText(res);
            }
        });

    }

    private boolean isNotValidExpression(String expression) {
        if (!Character.isDigit(expression.charAt(expression.length() - 1))) return true;
        for (int i = 0; i < expression.length() - 1; i++) {
            if (!Character.isDigit(expression.charAt(i)) && !Character.isDigit(expression.charAt(i + 1))) {
                return true;
            }
        }
        return false;
    }

    private String evaluateExpression(String expression) {
        Stack<String> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isDigit(c)) {
                int num = 0;
                while (Character.isDigit(c)) {
                    num = num * 10 + (c - '0');
                    i++;
                    if (i < expression.length()) {
                        c = expression.charAt(i);
                    } else {
                        break;
                    }
                }
                i--;
                operands.push(String.valueOf(num));
            } else if (isOperator(c)) {
                while (!operators.isEmpty() && precedence(c) <= precedence(operators.peek())) {
                    char op = operators.pop();
                    int n2 = Integer.parseInt(operands.pop());
                    int n1 = Integer.parseInt(operands.pop());
                    if (op == '+') {
                        operands.push(String.valueOf((n1 + n2)));
                    } else if (op == '-') {
                        operands.push(String.valueOf((n1 - n2)));
                    } else if (op == '*') {
                        operands.push(String.valueOf((n1 * n2)));
                    } else if (op == '/') {
                        if (n2 != 0) {
                            double res = 0;
                            res = (double) n1 / n2;
                            operands.push(String.valueOf(res));
                        } else {
                            operands.push("Cannot divide by 0");
                        }

                    } else if (op == '%') {
                        operands.push(String.valueOf((n1 % n2)));
                    }

                }
                operators.push(c);
            }
        }
        while (!operators.isEmpty()) {
            char op = operators.pop();
            int n2 = Integer.parseInt(operands.pop());
            int n1 = Integer.parseInt(operands.pop());
            if (op == '+') {
                operands.push(String.valueOf((n1 + n2)));
            } else if (op == '-') {
                operands.push(String.valueOf((n1 - n2)));
            } else if (op == '*') {
                operands.push(String.valueOf((n1 * n2)));
            } else if (op == '/') {
                if (n2 != 0) {
                    double res = 0;
                    res = (double) n1 / n2;
                    operands.push(String.valueOf(res));
                } else {
                    operands.push("Cannot divide by 0");
                }

            } else if (op == '%') {
                operands.push(String.valueOf((n1 % n2)));
            }

        }
        return operands.pop();
    }


    private int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
            case '%':
                return 2;
        }
        return -1;
    }

    private boolean isOperator(char c) {
        return c == '%' || c == '/' || c == '*' || c == '-' || c == '+';
    }

}