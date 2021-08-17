package com.github.ellemarshall5.cs3230.GUI;

import com.github.ellemarshall5.cs3230.models.CurrentRate;

import javax.swing.*;
import java.io.IOException;

public class CryptoClient {
    public JPanel getRootPanel() {
        return rootPanel;
    }

    private JPanel rootPanel;
    private JTextArea bitcoinTextArea;
    private JTextArea ethereumTextArea;
    private JTextArea bianaceTextArea;
    private JTextArea tetherTextArea;
    private JTextArea dogeCoinTextArea;
    private JTextArea cardanoTextArea;
    private JTextArea USDCoinTextArea;
    private JTextArea uniswapTextArea;
    private JTextArea XRPTextArea;
    private JTextArea polkadotTextArea;
    private JButton USDButton;
    private JButton EUROButton;
    private JButton yenButton;
    private JLabel polkadotLabel;
    private JLabel XRPLabel;
    private JLabel uniswapLabel;
    private JLabel USDCoinLabel;
    private JLabel cardanoLabel;
    private JLabel dogecoinLabel;
    private JLabel tetherLabel;
    private JLabel bianaceLabel;
    private JLabel ethereumLabel;
    private JLabel bitcoinLabel;

    public CryptoClient() {
        USDButton.addActionListener(e -> {
            try {
                bitcoinTextArea.setText("$" + CurrentRate.exchange("USD", "BTC"));
                ethereumTextArea.setText("$" + CurrentRate.exchange("USD", "ETH"));
                bianaceTextArea.setText("$" + CurrentRate.exchange("USD","BNB"));
                tetherTextArea.setText("$" + CurrentRate.exchange("USD", "USDT"));
                dogeCoinTextArea.setText("$" + CurrentRate.exchange("USD", "DOGE"));
                cardanoTextArea.setText("$" + CurrentRate.exchange("USD", "ADA"));
                USDCoinTextArea.setText("$" + CurrentRate.exchange("USD", "USDC"));
                uniswapTextArea.setText("$" + CurrentRate.exchange("USD", "UNI"));
                XRPTextArea.setText("$" + CurrentRate.exchange("USD","XRP"));
                polkadotTextArea.setText("$" + CurrentRate.exchange("USD", "DOT"));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });

        EUROButton.addActionListener(e -> {
            try {
                bitcoinTextArea.setText("€" + CurrentRate.exchange("EUR", "BTC"));
                ethereumTextArea.setText("€" + CurrentRate.exchange("EUR", "ETH"));
                bianaceTextArea.setText("€" + CurrentRate.exchange("EUR","BNB"));
                tetherTextArea.setText("€" + CurrentRate.exchange("EUR", "USDT"));
                dogeCoinTextArea.setText("€" + CurrentRate.exchange("EUR", "DOGE"));
                cardanoTextArea.setText("€" + CurrentRate.exchange("EUR", "ADA"));
                USDCoinTextArea.setText("€" + CurrentRate.exchange("EUR", "USDC"));
                uniswapTextArea.setText("€" + CurrentRate.exchange("EUR", "UNI"));
                XRPTextArea.setText("€" + CurrentRate.exchange("EUR","XRP"));
                polkadotTextArea.setText("€" + CurrentRate.exchange("EUR", "DOT"));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });

        yenButton.addActionListener(e -> {
            try {
                bitcoinTextArea.setText("¥" + CurrentRate.exchange("JPY", "BTC"));
                ethereumTextArea.setText("¥" + CurrentRate.exchange("JPY", "ETH"));
                bianaceTextArea.setText("¥" + CurrentRate.exchange("JPY","BNB"));
                tetherTextArea.setText("¥" + CurrentRate.exchange("JPY", "USDT"));
                dogeCoinTextArea.setText("¥" + CurrentRate.exchange("JPY", "DOGE"));
                cardanoTextArea.setText("¥" + CurrentRate.exchange("JPY", "ADA"));
                USDCoinTextArea.setText("¥" + CurrentRate.exchange("JPY", "USDC"));
                uniswapTextArea.setText("¥" + CurrentRate.exchange("JPY", "UNI"));
                XRPTextArea.setText("¥" + CurrentRate.exchange("JPY","XRP"));
                polkadotTextArea.setText("¥" + CurrentRate.exchange("JPY", "DOT"));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
    }
}
