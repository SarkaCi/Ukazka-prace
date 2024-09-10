import React from 'react';
import './App.css';

function App() {
    const sarka = [
        {name: 'shoppingInStore', paid:(1000+1+1+1+1)},
        {name: 'electricity', paid: 1},
        {name: 'gas', paid: 1},
        {name: 'rental', paid: 1},
        {name: 'car', paid: 0},
        {name: 'petrol', paid: 1},
        {name: 'internet', paid: 1},
    ];

    const michal = [
        {
            name: 'shoppingInStore',
            paid:(1+1+1+1+1)-(11)
        },
        {name: 'electricity', paid: 0},
        {name: 'gas', paid: 0},
        {name: 'rental', paid: 0},
        {name: 'car', paid: 0},
        {name: 'petrol', paid: 0},
        {name: 'internet', paid: 0},
    ];
//hbt = homeBudgetTotal
    let homeBudgetTotal = 1000;

    function calcSalaryRatio(s, m, hbt) {
        let mCalc = (m / (s + m)) * hbt;
        let sCalc = hbt - mCalc
        return {mCalc, sCalc};
    }
    const {mCalc, sCalc} = calcSalaryRatio(500, 500, homeBudgetTotal);

    function calculateArraySum(array) {
        return Math.trunc(array.reduce((acc, cur) => acc + cur.paid, 0));
    };
    const sumSarka = calculateArraySum(sarka)
    const sumMichal = calculateArraySum(michal)

    const paidValue = (array) => {
        return array.map((item) => {
            return {...item};
        });
    };
   
    const costsHome = (sum, calc) => calc - sum;
    const totalSarka = costsHome(sumSarka, sCalc);
    const totalMichal = costsHome(sumMichal, mCalc);

    const payGet = pay => pay >= 0 ? 'pay' : 'will get';
    const payGetS = payGet(totalSarka);
    const payGetM = payGet(totalMichal);

      return (
        <div className="App">

            <header className="App-header">HOME BUDGET 🏙️❤️ for Sarka and Michal
            </header>

            <div className="container">

                <div className="App-header1">

                    <h3>Sarka paid value</h3>
                    <ul className="App-text">
                        {paidValue(sarka).map((item, index) => (
                            <li key={index}>{`${item.name}: ${item.paid}`}</li>
                        ))}
                    </ul>
                </div>


                <div className="App-header2">
                                        <h3>Michal paid value</h3>
                    <ul className="App-text">
                        {paidValue(michal).map((item, index) => (
                            <li key={index}>{`${item.name}: ${item.paid}`}</li>
                        ))}
                    </ul>
                </div>
            </div>
            <div
                className="App-banner1"> {`Home budget for Sarka is ${sCalc} Kc/month and Michal is ${mCalc} Kc/month.`}</div>
            <p className="App-banner2">{`Sarka has total costs ${sumSarka} Kc and Michal ${sumMichal} Kc.`}</p>
            <h1 className="App-banner3">{`👩 Sarka ${payGetS} ${Math.abs(totalSarka)} Kc 
        and 👨‍Michal ${payGetM} ${Math.abs(totalMichal)} Kc.`}</h1>

        </div>
    );
}

export default App;
