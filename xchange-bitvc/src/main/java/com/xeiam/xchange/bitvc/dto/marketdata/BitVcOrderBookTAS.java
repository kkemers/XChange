package com.xeiam.xchange.bitvc.dto.marketdata;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Order book and TAS(Times and sales)
 */
public class BitVcOrderBookTAS {

	/**
	 * Sell 10.
	 */
	private final BitVcOrderBookObject[] sells;

	/**
	 * Buy 10.
	 */
	private final BitVcOrderBookObject[] buys;

	/**
	 * Times and sales.
	 */
	private final BitVcTradeObject[] trades;

	/**
	 * Latest.
	 */
	private final BigDecimal pNew;

	/**
	 * Percent change.
	 */
	private final BigDecimal level;

	/**
	 * Volume.
	 */
	private final BigDecimal amount;

	/**
	 * Total(RMB).
	 */
	private final BigDecimal total;

	private final BigDecimal amp;

	/**
	 * Open.
	 */
	private final BigDecimal pOpen;

	/**
	 * High.
	 */
	private final BigDecimal pHigh;

	/**
	 * Low.
	 */
	private final BigDecimal pLow;

	/**
	 * Close.
	 */
	private final BigDecimal pLast;

	/**
	 * Sell 5.
	 */
	private final BitVcTopObject[] topSell;

	/**
	 * Buy 5.
	 */
	private final BitVcTopObject[] topBuy;

	public BitVcOrderBookTAS(
			@JsonProperty("sells") final BitVcOrderBookObject[] sells,
			@JsonProperty("buys") final BitVcOrderBookObject[] buys,
			@JsonProperty("trades") final BitVcTradeObject[] trades,
			@JsonProperty("p_new") final BigDecimal pNew,
			@JsonProperty("level") final BigDecimal level,
			@JsonProperty("amount") final BigDecimal amount,
			@JsonProperty("total") final BigDecimal total,
			@JsonProperty("amp") final BigDecimal amp,
			@JsonProperty("p_open") final BigDecimal pOpen,
			@JsonProperty("p_high") final BigDecimal pHigh,
			@JsonProperty("p_low") final BigDecimal pLow,
			@JsonProperty("p_last") final BigDecimal pLast,
			@JsonProperty("top_sell") final BitVcTopObject[] topSell,
			@JsonProperty("top_buy") final BitVcTopObject[] topBuy){
		this.sells = sells;
		this.buys = buys;
		this.trades = trades;
		this.pNew = pNew;
		this.level = level;
		this.amount = amount;
		this.total = total;
		this.amp = amp;
		this.pOpen = pOpen;
		this.pHigh = pHigh;
		this.pLow = pLow;
		this.pLast = pLast;
		this.topSell = topSell;
		this.topBuy = topBuy;
	}

	public BitVcOrderBookObject[] getSells() {
		return sells;
	}

	public BitVcOrderBookObject[] getBuys() {
		return buys;
	}

	public BitVcTradeObject[] getTrades() {
		return trades;
	}

	public BigDecimal getPNew() {
		return pNew;
	}

	public BigDecimal getLevel() {
		return level;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public BigDecimal getAmp() {
		return amp;
	}

	public BigDecimal getPOpen() {
		return pOpen;
	}

	public BigDecimal getPHigh() {
		return pHigh;
	}

	public BigDecimal getPLow() {
		return pLow;
	}

	public BigDecimal getPLast() {
		return pLast;
	}

	public BitVcTopObject[] getTopSell() {
		return topSell;
	}

	public BitVcTopObject[] getTopBuy() {
		return topBuy;
	}

}
