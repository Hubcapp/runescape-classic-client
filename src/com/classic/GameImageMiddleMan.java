package com.classic;

import java.applet.Applet;
import java.awt.Component;

final class GameImageMiddleMan extends GameImage
{
	static char[] aCharArray2 = { ' ', '\u00a0', '_', '-', '\u00e0', '\u00e1', '\u00e2', '\u00e4', '\u00e3', '\u00c0',
	        '\u00c1', '\u00c2', '\u00c4', '\u00c3', '\u00e8', '\u00e9', '\u00ea', '\u00eb', '\u00c8', '\u00c9',
	        '\u00ca', '\u00cb', '\u00ed', '\u00ee', '\u00ef', '\u00cd', '\u00ce', '\u00cf', '\u00f2', '\u00f3',
	        '\u00f4', '\u00f6', '\u00f5', '\u00d2', '\u00d3', '\u00d4', '\u00d6', '\u00d5', '\u00f9', '\u00fa',
	        '\u00fb', '\u00fc', '\u00d9', '\u00da', '\u00db', '\u00dc', '\u00e7', '\u00c7', '\u00ff', '\u0178',
	        '\u00f1', '\u00d1', '\u00df' };
	static Applet anApplet2;
	mudclient aclient1;

	@Override
	void drawEntity(final int i, final int i_0_, final int i_1_, final int i_2_, final int id, final int i_4_, final int i_5_, final int i_6_)
	{
		if (i_6_ != -1)
		{
			aCharArray2 = null;
		}
		if (id < 50000)
		{
			if (id < 40000)
			{
				if (20000 <= id)
				{
					this.aclient1.drawNpc(i_4_, id - 20000, i_1_, i_5_, i_0_, i_2_, i);
				}
				else if (5000 <= id)
				{
					this.aclient1.drawPlayer(id - 5000, i_0_, i_2_, i_1_, i, i_4_, i_5_);
				}
				else
				{
					// NOTE: Projectiles get rendered here (both ranged and magic).
					super.spriteClip1(i, i_5_, id, i_2_, i_0_);
				}
			}
			else
			{
				this.aclient1.drawGroundItem(i_4_, id - 40000, i_0_, i_5_, i_2_, i);
			}
		}
		else
		{
			// NOTE: Think this is the teleport bubble.
			this.aclient1.method515(i_2_, id - 50000, i_0_, i, i_5_);
		}
	}

	GameImageMiddleMan(final int maybe_width, final int maybe_height, final int i_8_, final Component component)
	{
		super(maybe_width, maybe_height, i_8_, component);
	}

	static byte[] maybe_stringToByteArray(final CharSequence charsequence)
	{
		final int i = charsequence.length();
		final byte[] is = new byte[i];
		for (int i_9_ = 0; i > i_9_; i_9_++)
		{
			final char c = charsequence.charAt(i_9_);
			if ((('\0' >= c) || ('\u0080' <= c)) && (('\u00a0' > c) || ('\u00ff' < c)))
			{
				if (c != '\u20ac')
				{
					if (c == '\u201a')
					{
						is[i_9_] = (byte) -126;
					}
					else if (c == '\u0192')
					{
						is[i_9_] = (byte) -125;
					}
					else if (c != '\u201e')
					{
						if (c != '\u2026')
						{
							if (c != '\u2020')
							{
								if (c != '\u2021')
								{
									if (c == '\u02c6')
									{
										is[i_9_] = (byte) -120;
									}
									else if (c != '\u2030')
									{
										if (c == '\u0160')
										{
											is[i_9_] = (byte) -118;
										}
										else if (c == '\u2039')
										{
											is[i_9_] = (byte) -117;
										}
										else if (c == '\u0152')
										{
											is[i_9_] = (byte) -116;
										}
										else if (c == '\u017d')
										{
											is[i_9_] = (byte) -114;
										}
										else if (c != '\u2018')
										{
											if (c == '\u2019')
											{
												is[i_9_] = (byte) -110;
											}
											else if (c != '\u201c')
											{
												if (c != '\u201d')
												{
													if (c != '\u2022')
													{
														if (c != '\u2013')
														{
															if (c != '\u2014')
															{
																if (c == '\u02dc')
																{
																	is[i_9_] = (byte) -104;
																}
																else if (c == '\u2122')
																{
																	is[i_9_] = (byte) -103;
																}
																else if (c == '\u0161')
																{
																	is[i_9_] = (byte) -102;
																}
																else if (c != '\u203a')
																{
																	if (c != '\u0153')
																	{
																		if (c == '\u017e')
																		{
																			is[i_9_] = (byte) -98;
																		}
																		else if (c != '\u0178')
																		{
																			is[i_9_] = (byte) 63;
																		}
																		else
																		{
																			is[i_9_] = (byte) -97;
																		}
																	}
																	else
																	{
																		is[i_9_] = (byte) -100;
																	}
																}
																else
																{
																	is[i_9_] = (byte) -101;
																}
															}
															else
															{
																is[i_9_] = (byte) -105;
															}
														}
														else
														{
															is[i_9_] = (byte) -106;
														}
													}
													else
													{
														is[i_9_] = (byte) -107;
													}
												}
												else
												{
													is[i_9_] = (byte) -108;
												}
											}
											else
											{
												is[i_9_] = (byte) -109;
											}
										}
										else
										{
											is[i_9_] = (byte) -111;
										}
									}
									else
									{
										is[i_9_] = (byte) -119;
									}
								}
								else
								{
									is[i_9_] = (byte) -121;
								}
							}
							else
							{
								is[i_9_] = (byte) -122;
							}
						}
						else
						{
							is[i_9_] = (byte) -123;
						}
					}
					else
					{
						is[i_9_] = (byte) -124;
					}
				}
				else
				{
					is[i_9_] = (byte) -128;
				}
			}
			else
			{
				is[i_9_] = (byte) c;
			}
		}
		return is;
	}

	static void method410(final int[] is, final Object[] objects)
	{
		Class51.method375(objects, 0, is.length + -1, is, 1);
	}
}
