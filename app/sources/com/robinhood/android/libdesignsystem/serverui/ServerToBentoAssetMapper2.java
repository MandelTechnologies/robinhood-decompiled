package com.robinhood.android.libdesignsystem.serverui;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equities.companyfinancials.p116ui.CompanyFinancialsSection;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.waitlist.spot.WaitlistAnimationConstants;
import com.robinhood.enums.RhEnum;
import com.robinhood.utils.http.HttpStatusCode;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ServerToBentoAssetMapper.kt */
@Metadata(m3635d1 = {"\u0000\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0003\b\u008c\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u0094\u00042\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0002\u0094\u0004B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0090\u0004\u001a\u00030\u0091\u00048VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0092\u0004\u0010\u0093\u0004j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001j\u0003\b\u0098\u0001j\u0003\b\u0099\u0001j\u0003\b\u009a\u0001j\u0003\b\u009b\u0001j\u0003\b\u009c\u0001j\u0003\b\u009d\u0001j\u0003\b\u009e\u0001j\u0003\b\u009f\u0001j\u0003\b \u0001j\u0003\b¡\u0001j\u0003\b¢\u0001j\u0003\b£\u0001j\u0003\b¤\u0001j\u0003\b¥\u0001j\u0003\b¦\u0001j\u0003\b§\u0001j\u0003\b¨\u0001j\u0003\b©\u0001j\u0003\bª\u0001j\u0003\b«\u0001j\u0003\b¬\u0001j\u0003\b\u00ad\u0001j\u0003\b®\u0001j\u0003\b¯\u0001j\u0003\b°\u0001j\u0003\b±\u0001j\u0003\b²\u0001j\u0003\b³\u0001j\u0003\b´\u0001j\u0003\bµ\u0001j\u0003\b¶\u0001j\u0003\b·\u0001j\u0003\b¸\u0001j\u0003\b¹\u0001j\u0003\bº\u0001j\u0003\b»\u0001j\u0003\b¼\u0001j\u0003\b½\u0001j\u0003\b¾\u0001j\u0003\b¿\u0001j\u0003\bÀ\u0001j\u0003\bÁ\u0001j\u0003\bÂ\u0001j\u0003\bÃ\u0001j\u0003\bÄ\u0001j\u0003\bÅ\u0001j\u0003\bÆ\u0001j\u0003\bÇ\u0001j\u0003\bÈ\u0001j\u0003\bÉ\u0001j\u0003\bÊ\u0001j\u0003\bË\u0001j\u0003\bÌ\u0001j\u0003\bÍ\u0001j\u0003\bÎ\u0001j\u0003\bÏ\u0001j\u0003\bÐ\u0001j\u0003\bÑ\u0001j\u0003\bÒ\u0001j\u0003\bÓ\u0001j\u0003\bÔ\u0001j\u0003\bÕ\u0001j\u0003\bÖ\u0001j\u0003\b×\u0001j\u0003\bØ\u0001j\u0003\bÙ\u0001j\u0003\bÚ\u0001j\u0003\bÛ\u0001j\u0003\bÜ\u0001j\u0003\bÝ\u0001j\u0003\bÞ\u0001j\u0003\bß\u0001j\u0003\bà\u0001j\u0003\bá\u0001j\u0003\bâ\u0001j\u0003\bã\u0001j\u0003\bä\u0001j\u0003\bå\u0001j\u0003\bæ\u0001j\u0003\bç\u0001j\u0003\bè\u0001j\u0003\bé\u0001j\u0003\bê\u0001j\u0003\bë\u0001j\u0003\bì\u0001j\u0003\bí\u0001j\u0003\bî\u0001j\u0003\bï\u0001j\u0003\bð\u0001j\u0003\bñ\u0001j\u0003\bò\u0001j\u0003\bó\u0001j\u0003\bô\u0001j\u0003\bõ\u0001j\u0003\bö\u0001j\u0003\b÷\u0001j\u0003\bø\u0001j\u0003\bù\u0001j\u0003\bú\u0001j\u0003\bû\u0001j\u0003\bü\u0001j\u0003\bý\u0001j\u0003\bþ\u0001j\u0003\bÿ\u0001j\u0003\b\u0080\u0002j\u0003\b\u0081\u0002j\u0003\b\u0082\u0002j\u0003\b\u0083\u0002j\u0003\b\u0084\u0002j\u0003\b\u0085\u0002j\u0003\b\u0086\u0002j\u0003\b\u0087\u0002j\u0003\b\u0088\u0002j\u0003\b\u0089\u0002j\u0003\b\u008a\u0002j\u0003\b\u008b\u0002j\u0003\b\u008c\u0002j\u0003\b\u008d\u0002j\u0003\b\u008e\u0002j\u0003\b\u008f\u0002j\u0003\b\u0090\u0002j\u0003\b\u0091\u0002j\u0003\b\u0092\u0002j\u0003\b\u0093\u0002j\u0003\b\u0094\u0002j\u0003\b\u0095\u0002j\u0003\b\u0096\u0002j\u0003\b\u0097\u0002j\u0003\b\u0098\u0002j\u0003\b\u0099\u0002j\u0003\b\u009a\u0002j\u0003\b\u009b\u0002j\u0003\b\u009c\u0002j\u0003\b\u009d\u0002j\u0003\b\u009e\u0002j\u0003\b\u009f\u0002j\u0003\b \u0002j\u0003\b¡\u0002j\u0003\b¢\u0002j\u0003\b£\u0002j\u0003\b¤\u0002j\u0003\b¥\u0002j\u0003\b¦\u0002j\u0003\b§\u0002j\u0003\b¨\u0002j\u0003\b©\u0002j\u0003\bª\u0002j\u0003\b«\u0002j\u0003\b¬\u0002j\u0003\b\u00ad\u0002j\u0003\b®\u0002j\u0003\b¯\u0002j\u0003\b°\u0002j\u0003\b±\u0002j\u0003\b²\u0002j\u0003\b³\u0002j\u0003\b´\u0002j\u0003\bµ\u0002j\u0003\b¶\u0002j\u0003\b·\u0002j\u0003\b¸\u0002j\u0003\b¹\u0002j\u0003\bº\u0002j\u0003\b»\u0002j\u0003\b¼\u0002j\u0003\b½\u0002j\u0003\b¾\u0002j\u0003\b¿\u0002j\u0003\bÀ\u0002j\u0003\bÁ\u0002j\u0003\bÂ\u0002j\u0003\bÃ\u0002j\u0003\bÄ\u0002j\u0003\bÅ\u0002j\u0003\bÆ\u0002j\u0003\bÇ\u0002j\u0003\bÈ\u0002j\u0003\bÉ\u0002j\u0003\bÊ\u0002j\u0003\bË\u0002j\u0003\bÌ\u0002j\u0003\bÍ\u0002j\u0003\bÎ\u0002j\u0003\bÏ\u0002j\u0003\bÐ\u0002j\u0003\bÑ\u0002j\u0003\bÒ\u0002j\u0003\bÓ\u0002j\u0003\bÔ\u0002j\u0003\bÕ\u0002j\u0003\bÖ\u0002j\u0003\b×\u0002j\u0003\bØ\u0002j\u0003\bÙ\u0002j\u0003\bÚ\u0002j\u0003\bÛ\u0002j\u0003\bÜ\u0002j\u0003\bÝ\u0002j\u0003\bÞ\u0002j\u0003\bß\u0002j\u0003\bà\u0002j\u0003\bá\u0002j\u0003\bâ\u0002j\u0003\bã\u0002j\u0003\bä\u0002j\u0003\bå\u0002j\u0003\bæ\u0002j\u0003\bç\u0002j\u0003\bè\u0002j\u0003\bé\u0002j\u0003\bê\u0002j\u0003\bë\u0002j\u0003\bì\u0002j\u0003\bí\u0002j\u0003\bî\u0002j\u0003\bï\u0002j\u0003\bð\u0002j\u0003\bñ\u0002j\u0003\bò\u0002j\u0003\bó\u0002j\u0003\bô\u0002j\u0003\bõ\u0002j\u0003\bö\u0002j\u0003\b÷\u0002j\u0003\bø\u0002j\u0003\bù\u0002j\u0003\bú\u0002j\u0003\bû\u0002j\u0003\bü\u0002j\u0003\bý\u0002j\u0003\bþ\u0002j\u0003\bÿ\u0002j\u0003\b\u0080\u0003j\u0003\b\u0081\u0003j\u0003\b\u0082\u0003j\u0003\b\u0083\u0003j\u0003\b\u0084\u0003j\u0003\b\u0085\u0003j\u0003\b\u0086\u0003j\u0003\b\u0087\u0003j\u0003\b\u0088\u0003j\u0003\b\u0089\u0003j\u0003\b\u008a\u0003j\u0003\b\u008b\u0003j\u0003\b\u008c\u0003j\u0003\b\u008d\u0003j\u0003\b\u008e\u0003j\u0003\b\u008f\u0003j\u0003\b\u0090\u0003j\u0003\b\u0091\u0003j\u0003\b\u0092\u0003j\u0003\b\u0093\u0003j\u0003\b\u0094\u0003j\u0003\b\u0095\u0003j\u0003\b\u0096\u0003j\u0003\b\u0097\u0003j\u0003\b\u0098\u0003j\u0003\b\u0099\u0003j\u0003\b\u009a\u0003j\u0003\b\u009b\u0003j\u0003\b\u009c\u0003j\u0003\b\u009d\u0003j\u0003\b\u009e\u0003j\u0003\b\u009f\u0003j\u0003\b \u0003j\u0003\b¡\u0003j\u0003\b¢\u0003j\u0003\b£\u0003j\u0003\b¤\u0003j\u0003\b¥\u0003j\u0003\b¦\u0003j\u0003\b§\u0003j\u0003\b¨\u0003j\u0003\b©\u0003j\u0003\bª\u0003j\u0003\b«\u0003j\u0003\b¬\u0003j\u0003\b\u00ad\u0003j\u0003\b®\u0003j\u0003\b¯\u0003j\u0003\b°\u0003j\u0003\b±\u0003j\u0003\b²\u0003j\u0003\b³\u0003j\u0003\b´\u0003j\u0003\bµ\u0003j\u0003\b¶\u0003j\u0003\b·\u0003j\u0003\b¸\u0003j\u0003\b¹\u0003j\u0003\bº\u0003j\u0003\b»\u0003j\u0003\b¼\u0003j\u0003\b½\u0003j\u0003\b¾\u0003j\u0003\b¿\u0003j\u0003\bÀ\u0003j\u0003\bÁ\u0003j\u0003\bÂ\u0003j\u0003\bÃ\u0003j\u0003\bÄ\u0003j\u0003\bÅ\u0003j\u0003\bÆ\u0003j\u0003\bÇ\u0003j\u0003\bÈ\u0003j\u0003\bÉ\u0003j\u0003\bÊ\u0003j\u0003\bË\u0003j\u0003\bÌ\u0003j\u0003\bÍ\u0003j\u0003\bÎ\u0003j\u0003\bÏ\u0003j\u0003\bÐ\u0003j\u0003\bÑ\u0003j\u0003\bÒ\u0003j\u0003\bÓ\u0003j\u0003\bÔ\u0003j\u0003\bÕ\u0003j\u0003\bÖ\u0003j\u0003\b×\u0003j\u0003\bØ\u0003j\u0003\bÙ\u0003j\u0003\bÚ\u0003j\u0003\bÛ\u0003j\u0003\bÜ\u0003j\u0003\bÝ\u0003j\u0003\bÞ\u0003j\u0003\bß\u0003j\u0003\bà\u0003j\u0003\bá\u0003j\u0003\bâ\u0003j\u0003\bã\u0003j\u0003\bä\u0003j\u0003\bå\u0003j\u0003\bæ\u0003j\u0003\bç\u0003j\u0003\bè\u0003j\u0003\bé\u0003j\u0003\bê\u0003j\u0003\bë\u0003j\u0003\bì\u0003j\u0003\bí\u0003j\u0003\bî\u0003j\u0003\bï\u0003j\u0003\bð\u0003j\u0003\bñ\u0003j\u0003\bò\u0003j\u0003\bó\u0003j\u0003\bô\u0003j\u0003\bõ\u0003j\u0003\bö\u0003j\u0003\b÷\u0003j\u0003\bø\u0003j\u0003\bù\u0003j\u0003\bú\u0003j\u0003\bû\u0003j\u0003\bü\u0003j\u0003\bý\u0003j\u0003\bþ\u0003j\u0003\bÿ\u0003j\u0003\b\u0080\u0004j\u0003\b\u0081\u0004j\u0003\b\u0082\u0004j\u0003\b\u0083\u0004j\u0003\b\u0084\u0004j\u0003\b\u0085\u0004j\u0003\b\u0086\u0004j\u0003\b\u0087\u0004j\u0003\b\u0088\u0004j\u0003\b\u0089\u0004j\u0003\b\u008a\u0004j\u0003\b\u008b\u0004j\u0003\b\u008c\u0004j\u0003\b\u008d\u0004j\u0003\b\u008e\u0004j\u0003\b\u008f\u0004¨\u0006\u0095\u0004"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "Lcom/robinhood/enums/RhEnum;", "", "resourceId", "", "<init>", "(Ljava/lang/String;II)V", "getResourceId", "()I", "UNKNOWN", "ACCOUNT_SUMMARY_12", "ACCOUNT_SUMMARY_24", "ACTION_REMOVE_24", "ACTIONS_ALERTS_32", "ACTIONS_ATM_32", "ACTIONS_CHECK_32", "ACTIONS_STATEMENTS_32", "ACTIONS_TRANSFERS_32", "AGENT_16", "AGENT_24", "ALERT_12", "ALERT_16", "ALERT_24", "ALERT_FILLED_12", "ALERT_FILLED_16", "ALERT_FILLED_24", "ALL_DAY_TRADING_12", "ALL_DAY_TRADING_16", "ALL_DAY_TRADING_24", "ANNOUNCEMENT_12", "ANNOUNCEMENT_16", "ANNOUNCEMENT_24", "ARCHIVE_24", "ARROW_DIAGONAL_UP_16", "ARROW_DOWN_12", "ARROW_DOWN_16", "ARROW_DOWN_24", "ARROW_DOWN_FILL_12", "ARROW_DOWN_FILL_16", "ARROW_DOWN_FILL_24", "ARROW_DOWN_RIGHT_12", "ARROW_LEFT_12", "ARROW_LEFT_16", "ARROW_LEFT_24", "ARROW_LEFT_FILL_12", "ARROW_LEFT_FILL_16", "ARROW_LEFT_FILL_24", "ARROW_RIGHT_12", "ARROW_RIGHT_16", "ARROW_RIGHT_24", "ARROW_RIGHT_FILL_12", "ARROW_RIGHT_FILL_16", "ARROW_RIGHT_FILL_24", "ARROW_UP_12", "ARROW_UP_16", "ARROW_UP_24", "ARROW_UP_FILL_12", "ARROW_UP_FILL_16", "ARROW_UP_FILL_24", "ARROW_UP_RIGHT_12", "ARROW_UP_RIGHT_16", "ATTACH_24", "BACKSPACE_24", "BACKSPACE_32", "BANKING_16", "BANKING_24", "BANKING_32", "BAR_CHART_16", "BAR_CHART_24", "BOOKMARK_POST_FILLED_16", "BOOKMARK_POST_OUTLINE_16", "BUBBLE_CHECKED_12", "BUBBLE_CHECKED_16", "BUBBLE_CHECKED_24", "BUBBLE_DOT_24", "BUBBLE_EMPTY_24", "BUBBLE_MINUS_16", "BUBBLE_MINUS_24", "BUBBLE_PAUSE_24", "BUBBLE_PLUS_16", "BUBBLE_PLUS_24", "BUBBLE_PLUS_FILLED_24", "BUBBLE_RADIO_BUTTON_24", "BUBBLE_REMOVE_16", "BUBBLE_REMOVE_24", "BUBBLE_REMOVE_FILLED_16", "BUBBLE_REMOVE_FILLED_24", "BUBBLE_REVERSE_24", "BUBBLE_UK_POUNDS_16", "BUBBLE_UK_POUNDS_24", "BUBBLE_UK_POUNDS_FILLED_16", "BUBBLE_UK_POUNDS_FILLED_24", "BUILDER_16", "BUILDER_24", "CALENDAR_12", "CALENDAR_16", "CALENDAR_24", "CAMERA_16", "CAMERA_24", "CARET_DOWN_12", "CARET_DOWN_16", "CARET_DOWN_24", "CARET_LEFT_12", "CARET_LEFT_16", "CARET_LEFT_24", "CARET_RIGHT_12", "CARET_RIGHT_16", "CARET_RIGHT_24", "CARET_UP_12", "CARET_UP_16", "CARET_UP_24", "CASH_24", "CHART_16", "CHART_24", "CHART_BAR_24", "CHART_CANDLESTICKS_16", "CHART_CANDLESTICKS_24", "CHART_LINE_16", "CHART_LINE_24", "CHART_STACKED_BAR_16", "CHAT_16", "CHAT_24", "CHATBOT_16", "CHATBOT_24", "CHECKBOX_EMPTY_16", "CHECKBOX_EMPTY_24", "CHECKBOX_FILLED_16", "CHECKBOX_FILLED_24", "CHECKMARK_12", "CHECKMARK_16", "CHECKMARK_24", "CLIPBOARD_16", "CLIPBOARD_24", "CLOCK_12", "CLOCK_16", "CLOCK_24", "CLOSE_12", "CLOSE_16", "CLOSE_24", "CLOUD_16", "CLOUD_24", "COLLAPSE_16", "COLLAPSE_24", "COMMENT_FILLED_16", "COMMENT_FILLED_20", "COMMENT_OUTLINE_16", "COMMENT_OUTLINE_20", "CONSUMER_GOODS_12", "CONSUMER_GOODS_16", "CONSUMER_GOODS_24", "CONTROLS_16", "CONTROLS_24", "CONVERSATION_16", "CONVERSATION_24", "CONVERT_24", "COPY_12", "COPY_16", "COPY_24", "COPY_TRADE_FILLED_16", "COPY_TRADE_OUTLINE_16", "CORN_FUTURES_24", "CORPORATE_16", "CORPORATE_24", "CORTEX_12", "CORTEX_16", "CORTEX_24", "CRYPTO_12", "CRYPTO_16", "CRYPTO_24", "CRYPTO_C_12", "CRYPTO_C_16", "CRYPTO_C_24", "CUSTODIAL_16", "CUSTODIAL_24", "DEPOSIT_16", "DEPOSIT_24", "DINING_24", "DISCLOSURES_16", "DISCLOSURES_24", "DIVIDEND_16", "DIVIDEND_24", "DOCUMENTS_24", "DOLLAR_SIGN_12", "DOLLAR_SIGN_16", "DOLLAR_SIGN_24", "DOT_12", "DOT_16", "DOT_24", "DOTS_16", "DOTS_24", "DOTS_ANDROID_16", "DOTS_ANDROID_24", "DOWNLOAD_12", "DOWNLOAD_16", "DOWNLOAD_24", "DRAG_12", "DRAG_16", "DRAG_24", "DROPDOWN_12", "DROPDOWN_16", "DROPDOWN_24", "ECONOMIC_MOAT_24", "EDIT_12", "EDIT_16", "EDIT_24", "EDIT_SURFACE_24", "EMAIL_FILLED_16", "EMAIL_FILLED_24", "EMAIL_OUTLINE_24", "ENERGY_12", "ENERGY_24", "ENTERTAINMENT_24", "ETF_12", "ETF_24", "EURO_SIGN_12", "EURO_SIGN_16", "EURO_SIGN_24", "EXCLAMATION_12", "EXCLAMATION_16", "EXCLAMATION_24", "EXPAND_16", "EXPAND_24", "EYE_16", "EYE_24", "EYE_CLOSED_16", "EYE_CLOSED_24", "FACE_ID_ANDROID_16", "FACE_ID_ANDROID_24", "FACE_ID_IOS_16", "FACE_ID_IOS_24", "FAIR_VALUE_24", "FEATURED_16", "FEATURED_24", "FILTER_12", "FILTER_16", "FILTER_24", "FINANCE_12", "FINANCE_16", "FINANCE_24", "FLASH_OFF_24", "FLASH_ON_24", "FLASHLIGHT_OFF_24", "FLASHLIGHT_ON_24", "FLOWER_16", "FOLDER_16", "FOLDER_24", "FULLSCREEN_ENTER_24", "FULLSCREEN_EXIT_24", "GIFT_12", "GIFT_16", "GIFT_24", "GOLD_16", "GOLD_24", "GROCERIES_24", "HAMBURGER_12", "HAMBURGER_16", "HAMBURGER_24", "HEALTHCARE_12", "HEALTHCARE_24", "HELP_24", "HISTORY_16", "HISTORY_24", "HOME_24", "HOSPITALITY_12", "HOSPITALITY_24", "HOURGLASS_12", "HOURGLASS_16", "HOURGLASS_24", "ICLOUD_RESTORE_16", "ICLOUD_RESTORE_24", "IMAGE_16", "IMAGE_24", "IMAGE_FAIL_16", "IMAGE_FAIL_24", "INFO_12", "INFO_16", "INFO_24", "INFO_FILLED_12", "INFO_FILLED_16", "INFO_FILLED_24", "ISA_16", "ISA_24", "JOINT_ACCOUNT_12", "JOINT_ACCOUNT_16", "JOINT_ACCOUNT_24", "L2_HEADER_ARROW_24", "LIGHTBULB_16", "LIGHTBULB_24", "LIGHTNING_12", "LIGHTNING_16", "LIGHTNING_24", "LIGHTNING_OFF_16", "LIKE_POST_FILLED_16", "LIKE_POST_FILLED_20", "LIKE_POST_OUTLINE_16", "LIKE_POST_OUTLINE_20", "LIKE_POST_OUTLINE_24", "LINK_16", "LINK_24", "LINK_OUT_12", "LINK_OUT_16", "LINK_OUT_24", "LIST_24", "LOCATION_FILL_16", "LOCATION_FILL_24", "LOCATION_OUTLINE_24", "LOCK_12", "LOCK_16", "LOCK_24", "LOG_OUT_24", "MANAGED_ACCOUNTS_16", "MANAGED_ACCOUNTS_24", "MANAGED_INDIVIDUAL_24", "MANAGED_JOINT_24", "MANAGED_RETIREMENT_24", "MANUFACTURING_12", "MANUFACTURING_24", "MAPS_24", "MARGIN_12", "MARGIN_16", "MARGIN_24", "MAXIMUM_16", "MESSAGE_SEND_16", "MESSAGE_SEND_24", "MINIMUM_16", "MINUS_12", "MINUS_16", "MINUS_24", "MORE_MENU_16", "MORE_MENU_20", "NEWS_16", "NEWS_24", "NO_VALUE_24", "NO_VALUE_32", "NOTIFICATION_12", "NOTIFICATION_16", "NOTIFICATION_24", "NOTIFICATION_32", "NOTIFICATION_ADD_16", "NOTIFICATION_ADD_24", "NOTIFICATION_CHECK_16", "NOTIFICATION_CHECK_24", "NUMPAD_DOWN_24", "NUMPAD_UP_24", "ONLINE_16", "ONLINE_24", "OPTIONS_DOWN_24", "OPTIONS_FLAT_24", "OPTIONS_UP_24", "OPTIONS_VOLATILE_24", "ORDER_16", "ORDER_24", "PAUSE_HERO_40", "PAUSE_INLINE_24", "PAYCHECK_24", "PAYMENT_12", "PAYMENT_16", "PAYMENT_24", "PAYMENT_32", "PERCENT_SIGN_12", "PERCENT_SIGN_16", "PERCENT_SIGN_24", "PERPETUAL_FUTURES_32", "PERSON_12", "PERSON_16", "PERSON_24", "PHONE_16", "PHONE_24", "PHONE_CONNECTED_16", "PHONE_MISSED_CALL_16", "PHONE_WAITING_16", "PICTURE_IN_PICTURE_24", "PIE_CHART_16", "PIE_CHART_24", "PIN_16", "PIN_24", "PLAY_HERO_40", "PLAY_INLINE_16", "PLAY_INLINE_24", "PLUS_12", "PLUS_16", "PLUS_24", "POP_OUT_16", "POP_OUT_24", "PRINT_24", "QR_16", "QR_24", "QR_SCAN_24", "QUANTITY_16", "QUANTITY_24", "QUESTION_12", "QUESTION_16", "QUESTION_24", "QUESTION_FILLED_12", "QUESTION_FILLED_16", "QUESTION_FILLED_24", "RECURRING_12", "RECURRING_16", "RECURRING_24", "RECURRING_HUB_24", "REPEAT_16", "REPLAY_HERO_40", "RESEND_16", "RESEND_24", "RETIREMENT_12", "RETIREMENT_16", "RETIREMENT_24", "RETIREMENT_32", "RHW_BROWSER_TAB_24", "RHW_CHART_TAB_24", "RHW_SEARCH_TAB_24", "RISK_AND_UNCERTAINTY_24", "ROBINHOOD_12", "ROBINHOOD_16", "ROBINHOOD_24", "ROLLING_POSITION_12", "ROLLING_POSITION_16", "ROLLING_POSITION_24", "SCAN_16", "SCAN_24", "SEARCH_16", "SEARCH_24", "SETTINGS_12", "SETTINGS_16", "SETTINGS_24", "SHARE_ANDROID_16", "SHARE_ANDROID_24", "SHARE_IOS_16", "SHARE_IOS_24", "SMILEY_24", "SOCIAL_CREATE_POST_16", "SORT_12", "SOUND_OFF_24", "SOUND_ON_24", "SPARKLE_BULLET_12", "SPARKLE_BULLET_16", "SPARKLE_BULLET_24", "SPARKLE_DOUBLE_16", "SPARKLE_DOUBLE_24", "SPEED_DOWN_24", "SPEED_UP_24", "STAR_FILLED_12", "STAR_FILLED_16", "STAR_FILLED_24", "STAR_OUTLINE_16", "STAR_OUTLINE_24", "STAR_PASSWORD_16", "STEWARDSHIP_24", "STOCK_DOWN_12", "STOCK_DOWN_16", "STOCK_DOWN_24", "STOCK_UP_12", "STOCK_UP_16", "STOCK_UP_24", "STOPWATCH_16", "STOPWATCH_24", "STOPWATCH_32", "STRATEGY_OUTLOOK_24", "SWIPE_DOWN_16", "SWIPE_DOWN_24", "SWIPE_UP_16", "SWIPE_UP_24", "SWITCH_12", "SWITCH_16", "SWITCH_24", "TAB_ACCOUNT_32", "TAB_CONTENT_32", "TAB_CRYPTO_32", "TAB_CRYPTO_C_32", "TAB_GOLD_32", "TAB_INVEST_32", "TAB_ISA_32", "TAB_MESSAGES_32", "TAB_MONEY_32", "TAB_RETIREMENT_32", "TAB_SEARCH_32", "TAB_SOCIAL_32", "TAB_WATCHLIST_32", "TAG_16", "TAG_24", "TAX_LOTS_LONG_TERM_16", "TAX_LOTS_SHORT_TERM_16", "TECHNOLOGY_12", "TECHNOLOGY_24", "THUMBPRINT_16", "THUMBPRINT_24", "THUMBS_DOWN_16", "THUMBS_DOWN_24", "THUMBS_UP_16", "THUMBS_UP_24", "TICKET_16", "TICKET_24", "TOUCH_ID_ANDROID_16", "TOUCH_ID_ANDROID_24", "TRADE_SOCIAL_FILLED_20", "TRADE_SOCIAL_OUTLINE_20", "TRANSFERS_12", "TRANSFERS_16", "TRANSFERS_24", "TRANSPORT_24", "TRASH_12", "TRASH_16", "TRASH_24", "TRIANGLE_ALERT_16", "TRIANGLE_ALERT_24", "TUNER_16", "TUNER_24", "UNLOCK_12", "UNLOCK_16", "UNLOCK_24", "UPLOAD_24", "VIDEO_CALL_12", "VIDEO_CALL_16", "VIDEO_CALL_24", "VIDEO_FAST_FORWARD_24", "VIDEO_REPLAY_24", "VIDEO_REWIND_15_32", "VIDEO_REWIND_24", "VIDEO_SKIP_15_32", "WALLET_24", "WALLET_32", "WALLETCONNECT_16", "WALLETCONNECT_24", "WC_SCAN_24", "WITHDRAW_16", "WITHDRAW_24", "ZOOM_IN_24", "ZOOM_OUT_24", "serverValue", "", "getServerValue", "()Ljava/lang/String;", "Companion", "lib-design-system-res_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.IconAsset, reason: use source file name */
/* loaded from: classes17.dex */
public final class ServerToBentoAssetMapper2 implements RhEnum<ServerToBentoAssetMapper2> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ServerToBentoAssetMapper2[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int resourceId;
    public static final ServerToBentoAssetMapper2 UNKNOWN = new ServerToBentoAssetMapper2("UNKNOWN", 0, C20690R.drawable.empty);
    public static final ServerToBentoAssetMapper2 ACCOUNT_SUMMARY_12 = new ServerToBentoAssetMapper2("ACCOUNT_SUMMARY_12", 1, C20690R.drawable.ic_rds_account_summary_12dp);
    public static final ServerToBentoAssetMapper2 ACCOUNT_SUMMARY_24 = new ServerToBentoAssetMapper2("ACCOUNT_SUMMARY_24", 2, C20690R.drawable.ic_rds_account_summary_24dp);
    public static final ServerToBentoAssetMapper2 ACTION_REMOVE_24 = new ServerToBentoAssetMapper2("ACTION_REMOVE_24", 3, C20690R.drawable.ic_rds_action_remove_24dp);
    public static final ServerToBentoAssetMapper2 ACTIONS_ALERTS_32 = new ServerToBentoAssetMapper2("ACTIONS_ALERTS_32", 4, C20690R.drawable.ic_rds_actions_alerts_32dp);
    public static final ServerToBentoAssetMapper2 ACTIONS_ATM_32 = new ServerToBentoAssetMapper2("ACTIONS_ATM_32", 5, C20690R.drawable.ic_rds_actions_atm_32dp);
    public static final ServerToBentoAssetMapper2 ACTIONS_CHECK_32 = new ServerToBentoAssetMapper2("ACTIONS_CHECK_32", 6, C20690R.drawable.ic_rds_actions_check_32dp);
    public static final ServerToBentoAssetMapper2 ACTIONS_STATEMENTS_32 = new ServerToBentoAssetMapper2("ACTIONS_STATEMENTS_32", 7, C20690R.drawable.ic_rds_actions_statements_32dp);
    public static final ServerToBentoAssetMapper2 ACTIONS_TRANSFERS_32 = new ServerToBentoAssetMapper2("ACTIONS_TRANSFERS_32", 8, C20690R.drawable.ic_rds_actions_transfers_32dp);
    public static final ServerToBentoAssetMapper2 AGENT_16 = new ServerToBentoAssetMapper2("AGENT_16", 9, C20690R.drawable.ic_rds_agent_16dp);
    public static final ServerToBentoAssetMapper2 AGENT_24 = new ServerToBentoAssetMapper2("AGENT_24", 10, C20690R.drawable.ic_rds_agent_24dp);
    public static final ServerToBentoAssetMapper2 ALERT_12 = new ServerToBentoAssetMapper2("ALERT_12", 11, C20690R.drawable.ic_rds_alert_12dp);
    public static final ServerToBentoAssetMapper2 ALERT_16 = new ServerToBentoAssetMapper2("ALERT_16", 12, C20690R.drawable.ic_rds_alert_16dp);
    public static final ServerToBentoAssetMapper2 ALERT_24 = new ServerToBentoAssetMapper2("ALERT_24", 13, C20690R.drawable.ic_rds_alert_24dp);
    public static final ServerToBentoAssetMapper2 ALERT_FILLED_12 = new ServerToBentoAssetMapper2("ALERT_FILLED_12", 14, C20690R.drawable.ic_rds_alert_filled_12dp);
    public static final ServerToBentoAssetMapper2 ALERT_FILLED_16 = new ServerToBentoAssetMapper2("ALERT_FILLED_16", 15, C20690R.drawable.ic_rds_alert_filled_16dp);
    public static final ServerToBentoAssetMapper2 ALERT_FILLED_24 = new ServerToBentoAssetMapper2("ALERT_FILLED_24", 16, C20690R.drawable.ic_rds_alert_filled_24dp);
    public static final ServerToBentoAssetMapper2 ALL_DAY_TRADING_12 = new ServerToBentoAssetMapper2("ALL_DAY_TRADING_12", 17, C20690R.drawable.ic_rds_all_day_trading_12dp);
    public static final ServerToBentoAssetMapper2 ALL_DAY_TRADING_16 = new ServerToBentoAssetMapper2("ALL_DAY_TRADING_16", 18, C20690R.drawable.ic_rds_all_day_trading_16dp);
    public static final ServerToBentoAssetMapper2 ALL_DAY_TRADING_24 = new ServerToBentoAssetMapper2("ALL_DAY_TRADING_24", 19, C20690R.drawable.ic_rds_all_day_trading_24dp);
    public static final ServerToBentoAssetMapper2 ANNOUNCEMENT_12 = new ServerToBentoAssetMapper2("ANNOUNCEMENT_12", 20, C20690R.drawable.ic_rds_announcement_12dp);
    public static final ServerToBentoAssetMapper2 ANNOUNCEMENT_16 = new ServerToBentoAssetMapper2("ANNOUNCEMENT_16", 21, C20690R.drawable.ic_rds_announcement_16dp);
    public static final ServerToBentoAssetMapper2 ANNOUNCEMENT_24 = new ServerToBentoAssetMapper2("ANNOUNCEMENT_24", 22, C20690R.drawable.ic_rds_announcement_24dp);
    public static final ServerToBentoAssetMapper2 ARCHIVE_24 = new ServerToBentoAssetMapper2("ARCHIVE_24", 23, C20690R.drawable.ic_rds_archive_24dp);
    public static final ServerToBentoAssetMapper2 ARROW_DIAGONAL_UP_16 = new ServerToBentoAssetMapper2("ARROW_DIAGONAL_UP_16", 24, C20690R.drawable.ic_rds_arrow_diagonal_up_16dp);
    public static final ServerToBentoAssetMapper2 ARROW_DOWN_12 = new ServerToBentoAssetMapper2("ARROW_DOWN_12", 25, C20690R.drawable.ic_rds_arrow_down_12dp);
    public static final ServerToBentoAssetMapper2 ARROW_DOWN_16 = new ServerToBentoAssetMapper2("ARROW_DOWN_16", 26, C20690R.drawable.ic_rds_arrow_down_16dp);
    public static final ServerToBentoAssetMapper2 ARROW_DOWN_24 = new ServerToBentoAssetMapper2("ARROW_DOWN_24", 27, C20690R.drawable.ic_rds_arrow_down_24dp);
    public static final ServerToBentoAssetMapper2 ARROW_DOWN_FILL_12 = new ServerToBentoAssetMapper2("ARROW_DOWN_FILL_12", 28, C20690R.drawable.ic_rds_arrow_down_fill_12dp);
    public static final ServerToBentoAssetMapper2 ARROW_DOWN_FILL_16 = new ServerToBentoAssetMapper2("ARROW_DOWN_FILL_16", 29, C20690R.drawable.ic_rds_arrow_down_fill_16dp);
    public static final ServerToBentoAssetMapper2 ARROW_DOWN_FILL_24 = new ServerToBentoAssetMapper2("ARROW_DOWN_FILL_24", 30, C20690R.drawable.ic_rds_arrow_down_fill_24dp);
    public static final ServerToBentoAssetMapper2 ARROW_DOWN_RIGHT_12 = new ServerToBentoAssetMapper2("ARROW_DOWN_RIGHT_12", 31, C20690R.drawable.ic_rds_arrow_down_right_12dp);
    public static final ServerToBentoAssetMapper2 ARROW_LEFT_12 = new ServerToBentoAssetMapper2("ARROW_LEFT_12", 32, C20690R.drawable.ic_rds_arrow_left_12dp);
    public static final ServerToBentoAssetMapper2 ARROW_LEFT_16 = new ServerToBentoAssetMapper2("ARROW_LEFT_16", 33, C20690R.drawable.ic_rds_arrow_left_16dp);
    public static final ServerToBentoAssetMapper2 ARROW_LEFT_24 = new ServerToBentoAssetMapper2("ARROW_LEFT_24", 34, C20690R.drawable.ic_rds_arrow_left_24dp);
    public static final ServerToBentoAssetMapper2 ARROW_LEFT_FILL_12 = new ServerToBentoAssetMapper2("ARROW_LEFT_FILL_12", 35, C20690R.drawable.ic_rds_arrow_left_fill_12dp);
    public static final ServerToBentoAssetMapper2 ARROW_LEFT_FILL_16 = new ServerToBentoAssetMapper2("ARROW_LEFT_FILL_16", 36, C20690R.drawable.ic_rds_arrow_left_fill_16dp);
    public static final ServerToBentoAssetMapper2 ARROW_LEFT_FILL_24 = new ServerToBentoAssetMapper2("ARROW_LEFT_FILL_24", 37, C20690R.drawable.ic_rds_arrow_left_fill_24dp);
    public static final ServerToBentoAssetMapper2 ARROW_RIGHT_12 = new ServerToBentoAssetMapper2("ARROW_RIGHT_12", 38, C20690R.drawable.ic_rds_arrow_right_12dp);
    public static final ServerToBentoAssetMapper2 ARROW_RIGHT_16 = new ServerToBentoAssetMapper2("ARROW_RIGHT_16", 39, C20690R.drawable.ic_rds_arrow_right_16dp);
    public static final ServerToBentoAssetMapper2 ARROW_RIGHT_24 = new ServerToBentoAssetMapper2("ARROW_RIGHT_24", 40, C20690R.drawable.ic_rds_arrow_right_24dp);
    public static final ServerToBentoAssetMapper2 ARROW_RIGHT_FILL_12 = new ServerToBentoAssetMapper2("ARROW_RIGHT_FILL_12", 41, C20690R.drawable.ic_rds_arrow_right_fill_12dp);
    public static final ServerToBentoAssetMapper2 ARROW_RIGHT_FILL_16 = new ServerToBentoAssetMapper2("ARROW_RIGHT_FILL_16", 42, C20690R.drawable.ic_rds_arrow_right_fill_16dp);
    public static final ServerToBentoAssetMapper2 ARROW_RIGHT_FILL_24 = new ServerToBentoAssetMapper2("ARROW_RIGHT_FILL_24", 43, C20690R.drawable.ic_rds_arrow_right_fill_24dp);
    public static final ServerToBentoAssetMapper2 ARROW_UP_12 = new ServerToBentoAssetMapper2("ARROW_UP_12", 44, C20690R.drawable.ic_rds_arrow_up_12dp);
    public static final ServerToBentoAssetMapper2 ARROW_UP_16 = new ServerToBentoAssetMapper2("ARROW_UP_16", 45, C20690R.drawable.ic_rds_arrow_up_16dp);
    public static final ServerToBentoAssetMapper2 ARROW_UP_24 = new ServerToBentoAssetMapper2("ARROW_UP_24", 46, C20690R.drawable.ic_rds_arrow_up_24dp);
    public static final ServerToBentoAssetMapper2 ARROW_UP_FILL_12 = new ServerToBentoAssetMapper2("ARROW_UP_FILL_12", 47, C20690R.drawable.ic_rds_arrow_up_fill_12dp);
    public static final ServerToBentoAssetMapper2 ARROW_UP_FILL_16 = new ServerToBentoAssetMapper2("ARROW_UP_FILL_16", 48, C20690R.drawable.ic_rds_arrow_up_fill_16dp);
    public static final ServerToBentoAssetMapper2 ARROW_UP_FILL_24 = new ServerToBentoAssetMapper2("ARROW_UP_FILL_24", 49, C20690R.drawable.ic_rds_arrow_up_fill_24dp);
    public static final ServerToBentoAssetMapper2 ARROW_UP_RIGHT_12 = new ServerToBentoAssetMapper2("ARROW_UP_RIGHT_12", 50, C20690R.drawable.ic_rds_arrow_up_right_12dp);
    public static final ServerToBentoAssetMapper2 ARROW_UP_RIGHT_16 = new ServerToBentoAssetMapper2("ARROW_UP_RIGHT_16", 51, C20690R.drawable.ic_rds_arrow_up_right_16dp);
    public static final ServerToBentoAssetMapper2 ATTACH_24 = new ServerToBentoAssetMapper2("ATTACH_24", 52, C20690R.drawable.ic_rds_attach_24dp);
    public static final ServerToBentoAssetMapper2 BACKSPACE_24 = new ServerToBentoAssetMapper2("BACKSPACE_24", 53, C20690R.drawable.ic_rds_backspace_24dp);
    public static final ServerToBentoAssetMapper2 BACKSPACE_32 = new ServerToBentoAssetMapper2("BACKSPACE_32", 54, C20690R.drawable.ic_rds_backspace_32dp);
    public static final ServerToBentoAssetMapper2 BANKING_16 = new ServerToBentoAssetMapper2("BANKING_16", 55, C20690R.drawable.ic_rds_banking_16dp);
    public static final ServerToBentoAssetMapper2 BANKING_24 = new ServerToBentoAssetMapper2("BANKING_24", 56, C20690R.drawable.ic_rds_banking_24dp);
    public static final ServerToBentoAssetMapper2 BANKING_32 = new ServerToBentoAssetMapper2("BANKING_32", 57, C20690R.drawable.ic_rds_banking_32dp);
    public static final ServerToBentoAssetMapper2 BAR_CHART_16 = new ServerToBentoAssetMapper2("BAR_CHART_16", 58, C20690R.drawable.ic_rds_bar_chart_16dp);
    public static final ServerToBentoAssetMapper2 BAR_CHART_24 = new ServerToBentoAssetMapper2("BAR_CHART_24", 59, C20690R.drawable.ic_rds_bar_chart_24dp);
    public static final ServerToBentoAssetMapper2 BOOKMARK_POST_FILLED_16 = new ServerToBentoAssetMapper2("BOOKMARK_POST_FILLED_16", 60, C20690R.drawable.ic_rds_bookmark_post_filled_16dp);
    public static final ServerToBentoAssetMapper2 BOOKMARK_POST_OUTLINE_16 = new ServerToBentoAssetMapper2("BOOKMARK_POST_OUTLINE_16", 61, C20690R.drawable.ic_rds_bookmark_post_outline_16dp);
    public static final ServerToBentoAssetMapper2 BUBBLE_CHECKED_12 = new ServerToBentoAssetMapper2("BUBBLE_CHECKED_12", 62, C20690R.drawable.ic_rds_bubble_checked_12dp);
    public static final ServerToBentoAssetMapper2 BUBBLE_CHECKED_16 = new ServerToBentoAssetMapper2("BUBBLE_CHECKED_16", 63, C20690R.drawable.ic_rds_bubble_checked_16dp);
    public static final ServerToBentoAssetMapper2 BUBBLE_CHECKED_24 = new ServerToBentoAssetMapper2("BUBBLE_CHECKED_24", 64, C20690R.drawable.ic_rds_bubble_checked_24dp);
    public static final ServerToBentoAssetMapper2 BUBBLE_DOT_24 = new ServerToBentoAssetMapper2("BUBBLE_DOT_24", 65, C20690R.drawable.ic_rds_bubble_dot_24dp);
    public static final ServerToBentoAssetMapper2 BUBBLE_EMPTY_24 = new ServerToBentoAssetMapper2("BUBBLE_EMPTY_24", 66, C20690R.drawable.ic_rds_bubble_empty_24dp);
    public static final ServerToBentoAssetMapper2 BUBBLE_MINUS_16 = new ServerToBentoAssetMapper2("BUBBLE_MINUS_16", 67, C20690R.drawable.ic_rds_bubble_minus_16dp);
    public static final ServerToBentoAssetMapper2 BUBBLE_MINUS_24 = new ServerToBentoAssetMapper2("BUBBLE_MINUS_24", 68, C20690R.drawable.ic_rds_bubble_minus_24dp);
    public static final ServerToBentoAssetMapper2 BUBBLE_PAUSE_24 = new ServerToBentoAssetMapper2("BUBBLE_PAUSE_24", 69, C20690R.drawable.ic_rds_bubble_pause_24dp);
    public static final ServerToBentoAssetMapper2 BUBBLE_PLUS_16 = new ServerToBentoAssetMapper2("BUBBLE_PLUS_16", 70, C20690R.drawable.ic_rds_bubble_plus_16dp);
    public static final ServerToBentoAssetMapper2 BUBBLE_PLUS_24 = new ServerToBentoAssetMapper2("BUBBLE_PLUS_24", 71, C20690R.drawable.ic_rds_bubble_plus_24dp);
    public static final ServerToBentoAssetMapper2 BUBBLE_PLUS_FILLED_24 = new ServerToBentoAssetMapper2("BUBBLE_PLUS_FILLED_24", 72, C20690R.drawable.ic_rds_bubble_plus_filled_24dp);
    public static final ServerToBentoAssetMapper2 BUBBLE_RADIO_BUTTON_24 = new ServerToBentoAssetMapper2("BUBBLE_RADIO_BUTTON_24", 73, C20690R.drawable.ic_rds_bubble_radio_button_24dp);
    public static final ServerToBentoAssetMapper2 BUBBLE_REMOVE_16 = new ServerToBentoAssetMapper2("BUBBLE_REMOVE_16", 74, C20690R.drawable.ic_rds_bubble_remove_16dp);
    public static final ServerToBentoAssetMapper2 BUBBLE_REMOVE_24 = new ServerToBentoAssetMapper2("BUBBLE_REMOVE_24", 75, C20690R.drawable.ic_rds_bubble_remove_24dp);
    public static final ServerToBentoAssetMapper2 BUBBLE_REMOVE_FILLED_16 = new ServerToBentoAssetMapper2("BUBBLE_REMOVE_FILLED_16", 76, C20690R.drawable.ic_rds_bubble_remove_filled_16dp);
    public static final ServerToBentoAssetMapper2 BUBBLE_REMOVE_FILLED_24 = new ServerToBentoAssetMapper2("BUBBLE_REMOVE_FILLED_24", 77, C20690R.drawable.ic_rds_bubble_remove_filled_24dp);
    public static final ServerToBentoAssetMapper2 BUBBLE_REVERSE_24 = new ServerToBentoAssetMapper2("BUBBLE_REVERSE_24", 78, C20690R.drawable.ic_rds_bubble_reverse_24dp);
    public static final ServerToBentoAssetMapper2 BUBBLE_UK_POUNDS_16 = new ServerToBentoAssetMapper2("BUBBLE_UK_POUNDS_16", 79, C20690R.drawable.ic_rds_bubble_uk_pounds_16dp);
    public static final ServerToBentoAssetMapper2 BUBBLE_UK_POUNDS_24 = new ServerToBentoAssetMapper2("BUBBLE_UK_POUNDS_24", 80, C20690R.drawable.ic_rds_bubble_uk_pounds_24dp);
    public static final ServerToBentoAssetMapper2 BUBBLE_UK_POUNDS_FILLED_16 = new ServerToBentoAssetMapper2("BUBBLE_UK_POUNDS_FILLED_16", 81, C20690R.drawable.ic_rds_bubble_uk_pounds_filled_16dp);
    public static final ServerToBentoAssetMapper2 BUBBLE_UK_POUNDS_FILLED_24 = new ServerToBentoAssetMapper2("BUBBLE_UK_POUNDS_FILLED_24", 82, C20690R.drawable.ic_rds_bubble_uk_pounds_filled_24dp);
    public static final ServerToBentoAssetMapper2 BUILDER_16 = new ServerToBentoAssetMapper2("BUILDER_16", 83, C20690R.drawable.ic_rds_builder_16dp);
    public static final ServerToBentoAssetMapper2 BUILDER_24 = new ServerToBentoAssetMapper2("BUILDER_24", 84, C20690R.drawable.ic_rds_builder_24dp);
    public static final ServerToBentoAssetMapper2 CALENDAR_12 = new ServerToBentoAssetMapper2("CALENDAR_12", 85, C20690R.drawable.ic_rds_calendar_12dp);
    public static final ServerToBentoAssetMapper2 CALENDAR_16 = new ServerToBentoAssetMapper2("CALENDAR_16", 86, C20690R.drawable.ic_rds_calendar_16dp);
    public static final ServerToBentoAssetMapper2 CALENDAR_24 = new ServerToBentoAssetMapper2("CALENDAR_24", 87, C20690R.drawable.ic_rds_calendar_24dp);
    public static final ServerToBentoAssetMapper2 CAMERA_16 = new ServerToBentoAssetMapper2("CAMERA_16", 88, C20690R.drawable.ic_rds_camera_16dp);
    public static final ServerToBentoAssetMapper2 CAMERA_24 = new ServerToBentoAssetMapper2("CAMERA_24", 89, C20690R.drawable.ic_rds_camera_24dp);
    public static final ServerToBentoAssetMapper2 CARET_DOWN_12 = new ServerToBentoAssetMapper2("CARET_DOWN_12", 90, C20690R.drawable.ic_rds_caret_down_12dp);
    public static final ServerToBentoAssetMapper2 CARET_DOWN_16 = new ServerToBentoAssetMapper2("CARET_DOWN_16", 91, C20690R.drawable.ic_rds_caret_down_16dp);
    public static final ServerToBentoAssetMapper2 CARET_DOWN_24 = new ServerToBentoAssetMapper2("CARET_DOWN_24", 92, C20690R.drawable.ic_rds_caret_down_24dp);
    public static final ServerToBentoAssetMapper2 CARET_LEFT_12 = new ServerToBentoAssetMapper2("CARET_LEFT_12", 93, C20690R.drawable.ic_rds_caret_left_12dp);
    public static final ServerToBentoAssetMapper2 CARET_LEFT_16 = new ServerToBentoAssetMapper2("CARET_LEFT_16", 94, C20690R.drawable.ic_rds_caret_left_16dp);
    public static final ServerToBentoAssetMapper2 CARET_LEFT_24 = new ServerToBentoAssetMapper2("CARET_LEFT_24", 95, C20690R.drawable.ic_rds_caret_left_24dp);
    public static final ServerToBentoAssetMapper2 CARET_RIGHT_12 = new ServerToBentoAssetMapper2("CARET_RIGHT_12", 96, C20690R.drawable.ic_rds_caret_right_12dp);
    public static final ServerToBentoAssetMapper2 CARET_RIGHT_16 = new ServerToBentoAssetMapper2("CARET_RIGHT_16", 97, C20690R.drawable.ic_rds_caret_right_16dp);
    public static final ServerToBentoAssetMapper2 CARET_RIGHT_24 = new ServerToBentoAssetMapper2("CARET_RIGHT_24", 98, C20690R.drawable.ic_rds_caret_right_24dp);
    public static final ServerToBentoAssetMapper2 CARET_UP_12 = new ServerToBentoAssetMapper2("CARET_UP_12", 99, C20690R.drawable.ic_rds_caret_up_12dp);
    public static final ServerToBentoAssetMapper2 CARET_UP_16 = new ServerToBentoAssetMapper2("CARET_UP_16", 100, C20690R.drawable.ic_rds_caret_up_16dp);
    public static final ServerToBentoAssetMapper2 CARET_UP_24 = new ServerToBentoAssetMapper2("CARET_UP_24", 101, C20690R.drawable.ic_rds_caret_up_24dp);
    public static final ServerToBentoAssetMapper2 CASH_24 = new ServerToBentoAssetMapper2("CASH_24", 102, C20690R.drawable.ic_rds_cash_24dp);
    public static final ServerToBentoAssetMapper2 CHART_16 = new ServerToBentoAssetMapper2("CHART_16", 103, C20690R.drawable.ic_rds_chart_16dp);
    public static final ServerToBentoAssetMapper2 CHART_24 = new ServerToBentoAssetMapper2("CHART_24", 104, C20690R.drawable.ic_rds_chart_24dp);
    public static final ServerToBentoAssetMapper2 CHART_BAR_24 = new ServerToBentoAssetMapper2("CHART_BAR_24", 105, C20690R.drawable.ic_rds_chart_bar_24dp);
    public static final ServerToBentoAssetMapper2 CHART_CANDLESTICKS_16 = new ServerToBentoAssetMapper2("CHART_CANDLESTICKS_16", 106, C20690R.drawable.ic_rds_chart_candlesticks_16dp);
    public static final ServerToBentoAssetMapper2 CHART_CANDLESTICKS_24 = new ServerToBentoAssetMapper2("CHART_CANDLESTICKS_24", 107, C20690R.drawable.ic_rds_chart_candlesticks_24dp);
    public static final ServerToBentoAssetMapper2 CHART_LINE_16 = new ServerToBentoAssetMapper2("CHART_LINE_16", 108, C20690R.drawable.ic_rds_chart_line_16dp);
    public static final ServerToBentoAssetMapper2 CHART_LINE_24 = new ServerToBentoAssetMapper2("CHART_LINE_24", 109, C20690R.drawable.ic_rds_chart_line_24dp);
    public static final ServerToBentoAssetMapper2 CHART_STACKED_BAR_16 = new ServerToBentoAssetMapper2("CHART_STACKED_BAR_16", 110, C20690R.drawable.ic_rds_chart_stacked_bar_16dp);
    public static final ServerToBentoAssetMapper2 CHAT_16 = new ServerToBentoAssetMapper2("CHAT_16", 111, C20690R.drawable.ic_rds_chat_16dp);
    public static final ServerToBentoAssetMapper2 CHAT_24 = new ServerToBentoAssetMapper2("CHAT_24", 112, C20690R.drawable.ic_rds_chat_24dp);
    public static final ServerToBentoAssetMapper2 CHATBOT_16 = new ServerToBentoAssetMapper2("CHATBOT_16", 113, C20690R.drawable.ic_rds_chatbot_16dp);
    public static final ServerToBentoAssetMapper2 CHATBOT_24 = new ServerToBentoAssetMapper2("CHATBOT_24", 114, C20690R.drawable.ic_rds_chatbot_24dp);
    public static final ServerToBentoAssetMapper2 CHECKBOX_EMPTY_16 = new ServerToBentoAssetMapper2("CHECKBOX_EMPTY_16", 115, C20690R.drawable.ic_rds_checkbox_empty_16dp);
    public static final ServerToBentoAssetMapper2 CHECKBOX_EMPTY_24 = new ServerToBentoAssetMapper2("CHECKBOX_EMPTY_24", 116, C20690R.drawable.ic_rds_checkbox_empty_24dp);
    public static final ServerToBentoAssetMapper2 CHECKBOX_FILLED_16 = new ServerToBentoAssetMapper2("CHECKBOX_FILLED_16", 117, C20690R.drawable.ic_rds_checkbox_filled_16dp);
    public static final ServerToBentoAssetMapper2 CHECKBOX_FILLED_24 = new ServerToBentoAssetMapper2("CHECKBOX_FILLED_24", 118, C20690R.drawable.ic_rds_checkbox_filled_24dp);
    public static final ServerToBentoAssetMapper2 CHECKMARK_12 = new ServerToBentoAssetMapper2("CHECKMARK_12", 119, C20690R.drawable.ic_rds_checkmark_12dp);
    public static final ServerToBentoAssetMapper2 CHECKMARK_16 = new ServerToBentoAssetMapper2("CHECKMARK_16", 120, C20690R.drawable.ic_rds_checkmark_16dp);
    public static final ServerToBentoAssetMapper2 CHECKMARK_24 = new ServerToBentoAssetMapper2("CHECKMARK_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE, C20690R.drawable.ic_rds_checkmark_24dp);
    public static final ServerToBentoAssetMapper2 CLIPBOARD_16 = new ServerToBentoAssetMapper2("CLIPBOARD_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, C20690R.drawable.ic_rds_clipboard_16dp);
    public static final ServerToBentoAssetMapper2 CLIPBOARD_24 = new ServerToBentoAssetMapper2("CLIPBOARD_24", 123, C20690R.drawable.ic_rds_clipboard_24dp);
    public static final ServerToBentoAssetMapper2 CLOCK_12 = new ServerToBentoAssetMapper2("CLOCK_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, C20690R.drawable.ic_rds_clock_12dp);
    public static final ServerToBentoAssetMapper2 CLOCK_16 = new ServerToBentoAssetMapper2("CLOCK_16", 125, C20690R.drawable.ic_rds_clock_16dp);
    public static final ServerToBentoAssetMapper2 CLOCK_24 = new ServerToBentoAssetMapper2("CLOCK_24", EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, C20690R.drawable.ic_rds_clock_24dp);
    public static final ServerToBentoAssetMapper2 CLOSE_12 = new ServerToBentoAssetMapper2("CLOSE_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, C20690R.drawable.ic_rds_close_12dp);
    public static final ServerToBentoAssetMapper2 CLOSE_16 = new ServerToBentoAssetMapper2("CLOSE_16", 128, C20690R.drawable.ic_rds_close_16dp);
    public static final ServerToBentoAssetMapper2 CLOSE_24 = new ServerToBentoAssetMapper2("CLOSE_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, C20690R.drawable.ic_rds_close_24dp);
    public static final ServerToBentoAssetMapper2 CLOUD_16 = new ServerToBentoAssetMapper2("CLOUD_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, C20690R.drawable.ic_rds_cloud_16dp);
    public static final ServerToBentoAssetMapper2 CLOUD_24 = new ServerToBentoAssetMapper2("CLOUD_24", 131, C20690R.drawable.ic_rds_cloud_24dp);
    public static final ServerToBentoAssetMapper2 COLLAPSE_16 = new ServerToBentoAssetMapper2("COLLAPSE_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, C20690R.drawable.ic_rds_collapse_16dp);
    public static final ServerToBentoAssetMapper2 COLLAPSE_24 = new ServerToBentoAssetMapper2("COLLAPSE_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, C20690R.drawable.ic_rds_collapse_24dp);
    public static final ServerToBentoAssetMapper2 COMMENT_FILLED_16 = new ServerToBentoAssetMapper2("COMMENT_FILLED_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE, C20690R.drawable.ic_rds_comment_filled_16dp);
    public static final ServerToBentoAssetMapper2 COMMENT_FILLED_20 = new ServerToBentoAssetMapper2("COMMENT_FILLED_20", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE, C20690R.drawable.ic_rds_comment_filled_20dp);
    public static final ServerToBentoAssetMapper2 COMMENT_OUTLINE_16 = new ServerToBentoAssetMapper2("COMMENT_OUTLINE_16", 136, C20690R.drawable.ic_rds_comment_outline_16dp);
    public static final ServerToBentoAssetMapper2 COMMENT_OUTLINE_20 = new ServerToBentoAssetMapper2("COMMENT_OUTLINE_20", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE, C20690R.drawable.ic_rds_comment_outline_20dp);
    public static final ServerToBentoAssetMapper2 CONSUMER_GOODS_12 = new ServerToBentoAssetMapper2("CONSUMER_GOODS_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, C20690R.drawable.ic_rds_consumer_goods_12dp);
    public static final ServerToBentoAssetMapper2 CONSUMER_GOODS_16 = new ServerToBentoAssetMapper2("CONSUMER_GOODS_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, C20690R.drawable.ic_rds_consumer_goods_16dp);
    public static final ServerToBentoAssetMapper2 CONSUMER_GOODS_24 = new ServerToBentoAssetMapper2("CONSUMER_GOODS_24", EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, C20690R.drawable.ic_rds_consumer_goods_24dp);
    public static final ServerToBentoAssetMapper2 CONTROLS_16 = new ServerToBentoAssetMapper2("CONTROLS_16", EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE, C20690R.drawable.ic_rds_controls_16dp);
    public static final ServerToBentoAssetMapper2 CONTROLS_24 = new ServerToBentoAssetMapper2("CONTROLS_24", EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE, C20690R.drawable.ic_rds_controls_24dp);
    public static final ServerToBentoAssetMapper2 CONVERSATION_16 = new ServerToBentoAssetMapper2("CONVERSATION_16", EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE, C20690R.drawable.ic_rds_conversation_16dp);
    public static final ServerToBentoAssetMapper2 CONVERSATION_24 = new ServerToBentoAssetMapper2("CONVERSATION_24", 144, C20690R.drawable.ic_rds_conversation_24dp);
    public static final ServerToBentoAssetMapper2 CONVERT_24 = new ServerToBentoAssetMapper2("CONVERT_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE, C20690R.drawable.ic_rds_convert_24dp);
    public static final ServerToBentoAssetMapper2 COPY_12 = new ServerToBentoAssetMapper2("COPY_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE, C20690R.drawable.ic_rds_copy_12dp);
    public static final ServerToBentoAssetMapper2 COPY_16 = new ServerToBentoAssetMapper2("COPY_16", 147, C20690R.drawable.ic_rds_copy_16dp);
    public static final ServerToBentoAssetMapper2 COPY_24 = new ServerToBentoAssetMapper2("COPY_24", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE, C20690R.drawable.ic_rds_copy_24dp);
    public static final ServerToBentoAssetMapper2 COPY_TRADE_FILLED_16 = new ServerToBentoAssetMapper2("COPY_TRADE_FILLED_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE, C20690R.drawable.ic_rds_copy_trade_filled_16dp);
    public static final ServerToBentoAssetMapper2 COPY_TRADE_OUTLINE_16 = new ServerToBentoAssetMapper2("COPY_TRADE_OUTLINE_16", 150, C20690R.drawable.ic_rds_copy_trade_outline_16dp);
    public static final ServerToBentoAssetMapper2 CORN_FUTURES_24 = new ServerToBentoAssetMapper2("CORN_FUTURES_24", 151, C20690R.drawable.ic_rds_corn_futures_24dp);
    public static final ServerToBentoAssetMapper2 CORPORATE_16 = new ServerToBentoAssetMapper2("CORPORATE_16", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, C20690R.drawable.ic_rds_corporate_16dp);
    public static final ServerToBentoAssetMapper2 CORPORATE_24 = new ServerToBentoAssetMapper2("CORPORATE_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE, C20690R.drawable.ic_rds_corporate_24dp);
    public static final ServerToBentoAssetMapper2 CORTEX_12 = new ServerToBentoAssetMapper2("CORTEX_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE, C20690R.drawable.ic_rds_cortex_12dp);
    public static final ServerToBentoAssetMapper2 CORTEX_16 = new ServerToBentoAssetMapper2("CORTEX_16", 155, C20690R.drawable.ic_rds_cortex_16dp);
    public static final ServerToBentoAssetMapper2 CORTEX_24 = new ServerToBentoAssetMapper2("CORTEX_24", 156, C20690R.drawable.ic_rds_cortex_24dp);
    public static final ServerToBentoAssetMapper2 CRYPTO_12 = new ServerToBentoAssetMapper2("CRYPTO_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE, C20690R.drawable.ic_rds_crypto_12dp);
    public static final ServerToBentoAssetMapper2 CRYPTO_16 = new ServerToBentoAssetMapper2("CRYPTO_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, C20690R.drawable.ic_rds_crypto_16dp);
    public static final ServerToBentoAssetMapper2 CRYPTO_24 = new ServerToBentoAssetMapper2("CRYPTO_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE, C20690R.drawable.ic_rds_crypto_24dp);
    public static final ServerToBentoAssetMapper2 CRYPTO_C_12 = new ServerToBentoAssetMapper2("CRYPTO_C_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, C20690R.drawable.ic_rds_crypto_c_12dp);
    public static final ServerToBentoAssetMapper2 CRYPTO_C_16 = new ServerToBentoAssetMapper2("CRYPTO_C_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE, C20690R.drawable.ic_rds_crypto_c_16dp);
    public static final ServerToBentoAssetMapper2 CRYPTO_C_24 = new ServerToBentoAssetMapper2("CRYPTO_C_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, C20690R.drawable.ic_rds_crypto_c_24dp);
    public static final ServerToBentoAssetMapper2 CUSTODIAL_16 = new ServerToBentoAssetMapper2("CUSTODIAL_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE, C20690R.drawable.ic_rds_custodial_16dp);
    public static final ServerToBentoAssetMapper2 CUSTODIAL_24 = new ServerToBentoAssetMapper2("CUSTODIAL_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, C20690R.drawable.ic_rds_custodial_24dp);
    public static final ServerToBentoAssetMapper2 DEPOSIT_16 = new ServerToBentoAssetMapper2("DEPOSIT_16", 165, C20690R.drawable.ic_rds_deposit_16dp);
    public static final ServerToBentoAssetMapper2 DEPOSIT_24 = new ServerToBentoAssetMapper2("DEPOSIT_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE, C20690R.drawable.ic_rds_deposit_24dp);
    public static final ServerToBentoAssetMapper2 DINING_24 = new ServerToBentoAssetMapper2("DINING_24", 167, C20690R.drawable.ic_rds_dining_24dp);
    public static final ServerToBentoAssetMapper2 DISCLOSURES_16 = new ServerToBentoAssetMapper2("DISCLOSURES_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, C20690R.drawable.ic_rds_disclosures_16dp);
    public static final ServerToBentoAssetMapper2 DISCLOSURES_24 = new ServerToBentoAssetMapper2("DISCLOSURES_24", EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, C20690R.drawable.ic_rds_disclosures_24dp);
    public static final ServerToBentoAssetMapper2 DIVIDEND_16 = new ServerToBentoAssetMapper2("DIVIDEND_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, C20690R.drawable.ic_rds_dividend_16dp);
    public static final ServerToBentoAssetMapper2 DIVIDEND_24 = new ServerToBentoAssetMapper2("DIVIDEND_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE, C20690R.drawable.ic_rds_dividend_24dp);
    public static final ServerToBentoAssetMapper2 DOCUMENTS_24 = new ServerToBentoAssetMapper2("DOCUMENTS_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, C20690R.drawable.ic_rds_documents_24dp);
    public static final ServerToBentoAssetMapper2 DOLLAR_SIGN_12 = new ServerToBentoAssetMapper2("DOLLAR_SIGN_12", EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, C20690R.drawable.ic_rds_dollar_sign_12dp);
    public static final ServerToBentoAssetMapper2 DOLLAR_SIGN_16 = new ServerToBentoAssetMapper2("DOLLAR_SIGN_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, C20690R.drawable.ic_rds_dollar_sign_16dp);
    public static final ServerToBentoAssetMapper2 DOLLAR_SIGN_24 = new ServerToBentoAssetMapper2("DOLLAR_SIGN_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE, C20690R.drawable.ic_rds_dollar_sign_24dp);
    public static final ServerToBentoAssetMapper2 DOT_12 = new ServerToBentoAssetMapper2("DOT_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE, C20690R.drawable.ic_rds_dot_12dp);
    public static final ServerToBentoAssetMapper2 DOT_16 = new ServerToBentoAssetMapper2("DOT_16", EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, C20690R.drawable.ic_rds_dot_16dp);
    public static final ServerToBentoAssetMapper2 DOT_24 = new ServerToBentoAssetMapper2("DOT_24", EnumC7081g.f2773x8d9721ad, C20690R.drawable.ic_rds_dot_24dp);
    public static final ServerToBentoAssetMapper2 DOTS_16 = new ServerToBentoAssetMapper2("DOTS_16", EnumC7081g.f2780x600b66fe, C20690R.drawable.ic_rds_dots_16dp);
    public static final ServerToBentoAssetMapper2 DOTS_24 = new ServerToBentoAssetMapper2("DOTS_24", EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, C20690R.drawable.ic_rds_dots_24dp);
    public static final ServerToBentoAssetMapper2 DOTS_ANDROID_16 = new ServerToBentoAssetMapper2("DOTS_ANDROID_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE, C20690R.drawable.ic_rds_dots_android_16dp);
    public static final ServerToBentoAssetMapper2 DOTS_ANDROID_24 = new ServerToBentoAssetMapper2("DOTS_ANDROID_24", 182, C20690R.drawable.ic_rds_dots_android_24dp);
    public static final ServerToBentoAssetMapper2 DOWNLOAD_12 = new ServerToBentoAssetMapper2("DOWNLOAD_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE, C20690R.drawable.ic_rds_download_12dp);
    public static final ServerToBentoAssetMapper2 DOWNLOAD_16 = new ServerToBentoAssetMapper2("DOWNLOAD_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, C20690R.drawable.ic_rds_download_16dp);
    public static final ServerToBentoAssetMapper2 DOWNLOAD_24 = new ServerToBentoAssetMapper2("DOWNLOAD_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE, C20690R.drawable.ic_rds_download_24dp);
    public static final ServerToBentoAssetMapper2 DRAG_12 = new ServerToBentoAssetMapper2("DRAG_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE, C20690R.drawable.ic_rds_drag_12dp);
    public static final ServerToBentoAssetMapper2 DRAG_16 = new ServerToBentoAssetMapper2("DRAG_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE, C20690R.drawable.ic_rds_drag_16dp);
    public static final ServerToBentoAssetMapper2 DRAG_24 = new ServerToBentoAssetMapper2("DRAG_24", 188, C20690R.drawable.ic_rds_drag_24dp);
    public static final ServerToBentoAssetMapper2 DROPDOWN_12 = new ServerToBentoAssetMapper2("DROPDOWN_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, C20690R.drawable.ic_rds_dropdown_12dp);
    public static final ServerToBentoAssetMapper2 DROPDOWN_16 = new ServerToBentoAssetMapper2("DROPDOWN_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, C20690R.drawable.ic_rds_dropdown_16dp);
    public static final ServerToBentoAssetMapper2 DROPDOWN_24 = new ServerToBentoAssetMapper2("DROPDOWN_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, C20690R.drawable.ic_rds_dropdown_24dp);
    public static final ServerToBentoAssetMapper2 ECONOMIC_MOAT_24 = new ServerToBentoAssetMapper2("ECONOMIC_MOAT_24", 192, C20690R.drawable.ic_rds_economic_moat_24dp);
    public static final ServerToBentoAssetMapper2 EDIT_12 = new ServerToBentoAssetMapper2("EDIT_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE, C20690R.drawable.ic_rds_edit_12dp);
    public static final ServerToBentoAssetMapper2 EDIT_16 = new ServerToBentoAssetMapper2("EDIT_16", EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE, C20690R.drawable.ic_rds_edit_16dp);
    public static final ServerToBentoAssetMapper2 EDIT_24 = new ServerToBentoAssetMapper2("EDIT_24", EnumC7081g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, C20690R.drawable.ic_rds_edit_24dp);
    public static final ServerToBentoAssetMapper2 EDIT_SURFACE_24 = new ServerToBentoAssetMapper2("EDIT_SURFACE_24", EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, C20690R.drawable.ic_rds_edit_surface_24dp);
    public static final ServerToBentoAssetMapper2 EMAIL_FILLED_16 = new ServerToBentoAssetMapper2("EMAIL_FILLED_16", EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE, C20690R.drawable.ic_rds_email_filled_16dp);
    public static final ServerToBentoAssetMapper2 EMAIL_FILLED_24 = new ServerToBentoAssetMapper2("EMAIL_FILLED_24", EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE, C20690R.drawable.ic_rds_email_filled_24dp);
    public static final ServerToBentoAssetMapper2 EMAIL_OUTLINE_24 = new ServerToBentoAssetMapper2("EMAIL_OUTLINE_24", EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE, C20690R.drawable.ic_rds_email_outline_24dp);
    public static final ServerToBentoAssetMapper2 ENERGY_12 = new ServerToBentoAssetMapper2("ENERGY_12", 200, C20690R.drawable.ic_rds_energy_12dp);
    public static final ServerToBentoAssetMapper2 ENERGY_24 = new ServerToBentoAssetMapper2("ENERGY_24", 201, C20690R.drawable.ic_rds_energy_24dp);
    public static final ServerToBentoAssetMapper2 ENTERTAINMENT_24 = new ServerToBentoAssetMapper2("ENTERTAINMENT_24", 202, C20690R.drawable.ic_rds_entertainment_24dp);
    public static final ServerToBentoAssetMapper2 ETF_12 = new ServerToBentoAssetMapper2("ETF_12", EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE, C20690R.drawable.ic_rds_etf_12dp);
    public static final ServerToBentoAssetMapper2 ETF_24 = new ServerToBentoAssetMapper2("ETF_24", 204, C20690R.drawable.ic_rds_etf_24dp);
    public static final ServerToBentoAssetMapper2 EURO_SIGN_12 = new ServerToBentoAssetMapper2("EURO_SIGN_12", EnumC7081g.SDK_ASSET_ICON_CLIPBOARD_VALUE, C20690R.drawable.ic_rds_euro_sign_12dp);
    public static final ServerToBentoAssetMapper2 EURO_SIGN_16 = new ServerToBentoAssetMapper2("EURO_SIGN_16", EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE, C20690R.drawable.ic_rds_euro_sign_16dp);
    public static final ServerToBentoAssetMapper2 EURO_SIGN_24 = new ServerToBentoAssetMapper2("EURO_SIGN_24", EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE, C20690R.drawable.ic_rds_euro_sign_24dp);
    public static final ServerToBentoAssetMapper2 EXCLAMATION_12 = new ServerToBentoAssetMapper2("EXCLAMATION_12", EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE, C20690R.drawable.ic_rds_exclamation_12dp);
    public static final ServerToBentoAssetMapper2 EXCLAMATION_16 = new ServerToBentoAssetMapper2("EXCLAMATION_16", EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE, C20690R.drawable.ic_rds_exclamation_16dp);
    public static final ServerToBentoAssetMapper2 EXCLAMATION_24 = new ServerToBentoAssetMapper2("EXCLAMATION_24", EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, C20690R.drawable.ic_rds_exclamation_24dp);
    public static final ServerToBentoAssetMapper2 EXPAND_16 = new ServerToBentoAssetMapper2("EXPAND_16", 211, C20690R.drawable.ic_rds_expand_16dp);
    public static final ServerToBentoAssetMapper2 EXPAND_24 = new ServerToBentoAssetMapper2("EXPAND_24", EnumC7081g.SDK_ASSET_ICON_OVERRIDE_VALUE, C20690R.drawable.ic_rds_expand_24dp);
    public static final ServerToBentoAssetMapper2 EYE_16 = new ServerToBentoAssetMapper2("EYE_16", EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE, C20690R.drawable.ic_rds_eye_16dp);
    public static final ServerToBentoAssetMapper2 EYE_24 = new ServerToBentoAssetMapper2("EYE_24", EnumC7081g.SDK_ASSET_ICON_PIN_VALUE, C20690R.drawable.ic_rds_eye_24dp);
    public static final ServerToBentoAssetMapper2 EYE_CLOSED_16 = new ServerToBentoAssetMapper2("EYE_CLOSED_16", EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE, C20690R.drawable.ic_rds_eye_closed_16dp);
    public static final ServerToBentoAssetMapper2 EYE_CLOSED_24 = new ServerToBentoAssetMapper2("EYE_CLOSED_24", EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, C20690R.drawable.ic_rds_eye_closed_24dp);
    public static final ServerToBentoAssetMapper2 FACE_ID_ANDROID_16 = new ServerToBentoAssetMapper2("FACE_ID_ANDROID_16", EnumC7081g.SDK_ASSET_ICON_PROGRESS_VALUE, C20690R.drawable.ic_rds_face_id_android_16dp);
    public static final ServerToBentoAssetMapper2 FACE_ID_ANDROID_24 = new ServerToBentoAssetMapper2("FACE_ID_ANDROID_24", EnumC7081g.SDK_ASSET_ICON_QUESTION_VALUE, C20690R.drawable.ic_rds_face_id_android_24dp);
    public static final ServerToBentoAssetMapper2 FACE_ID_IOS_16 = new ServerToBentoAssetMapper2("FACE_ID_IOS_16", EnumC7081g.SDK_ASSET_ICON_REJECTED_REC_VALUE, C20690R.drawable.ic_rds_face_id_ios_16dp);
    public static final ServerToBentoAssetMapper2 FACE_ID_IOS_24 = new ServerToBentoAssetMapper2("FACE_ID_IOS_24", EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, C20690R.drawable.ic_rds_face_id_ios_24dp);
    public static final ServerToBentoAssetMapper2 FAIR_VALUE_24 = new ServerToBentoAssetMapper2("FAIR_VALUE_24", EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE, C20690R.drawable.ic_rds_fair_value_24dp);
    public static final ServerToBentoAssetMapper2 FEATURED_16 = new ServerToBentoAssetMapper2("FEATURED_16", EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE, C20690R.drawable.ic_rds_featured_16dp);
    public static final ServerToBentoAssetMapper2 FEATURED_24 = new ServerToBentoAssetMapper2("FEATURED_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, C20690R.drawable.ic_rds_featured_24dp);
    public static final ServerToBentoAssetMapper2 FILTER_12 = new ServerToBentoAssetMapper2("FILTER_12", 224, C20690R.drawable.ic_rds_filter_12dp);
    public static final ServerToBentoAssetMapper2 FILTER_16 = new ServerToBentoAssetMapper2("FILTER_16", 225, C20690R.drawable.ic_rds_filter_16dp);
    public static final ServerToBentoAssetMapper2 FILTER_24 = new ServerToBentoAssetMapper2("FILTER_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE, C20690R.drawable.ic_rds_filter_24dp);
    public static final ServerToBentoAssetMapper2 FINANCE_12 = new ServerToBentoAssetMapper2("FINANCE_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE, C20690R.drawable.ic_rds_finance_12dp);
    public static final ServerToBentoAssetMapper2 FINANCE_16 = new ServerToBentoAssetMapper2("FINANCE_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, C20690R.drawable.ic_rds_finance_16dp);
    public static final ServerToBentoAssetMapper2 FINANCE_24 = new ServerToBentoAssetMapper2("FINANCE_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, C20690R.drawable.ic_rds_finance_24dp);
    public static final ServerToBentoAssetMapper2 FLASH_OFF_24 = new ServerToBentoAssetMapper2("FLASH_OFF_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, C20690R.drawable.ic_rds_flash_off_24dp);
    public static final ServerToBentoAssetMapper2 FLASH_ON_24 = new ServerToBentoAssetMapper2("FLASH_ON_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE, C20690R.drawable.ic_rds_flash_on_24dp);
    public static final ServerToBentoAssetMapper2 FLASHLIGHT_OFF_24 = new ServerToBentoAssetMapper2("FLASHLIGHT_OFF_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, C20690R.drawable.ic_rds_flashlight_off_24dp);
    public static final ServerToBentoAssetMapper2 FLASHLIGHT_ON_24 = new ServerToBentoAssetMapper2("FLASHLIGHT_ON_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, C20690R.drawable.ic_rds_flashlight_on_24dp);
    public static final ServerToBentoAssetMapper2 FLOWER_16 = new ServerToBentoAssetMapper2("FLOWER_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, C20690R.drawable.ic_rds_flower_16dp);
    public static final ServerToBentoAssetMapper2 FOLDER_16 = new ServerToBentoAssetMapper2("FOLDER_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, C20690R.drawable.ic_rds_folder_16dp);
    public static final ServerToBentoAssetMapper2 FOLDER_24 = new ServerToBentoAssetMapper2("FOLDER_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, C20690R.drawable.ic_rds_folder_24dp);
    public static final ServerToBentoAssetMapper2 FULLSCREEN_ENTER_24 = new ServerToBentoAssetMapper2("FULLSCREEN_ENTER_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, C20690R.drawable.ic_rds_fullscreen_enter_24dp);
    public static final ServerToBentoAssetMapper2 FULLSCREEN_EXIT_24 = new ServerToBentoAssetMapper2("FULLSCREEN_EXIT_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, C20690R.drawable.ic_rds_fullscreen_exit_24dp);
    public static final ServerToBentoAssetMapper2 GIFT_12 = new ServerToBentoAssetMapper2("GIFT_12", 239, C20690R.drawable.ic_rds_gift_12dp);
    public static final ServerToBentoAssetMapper2 GIFT_16 = new ServerToBentoAssetMapper2("GIFT_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, C20690R.drawable.ic_rds_gift_16dp);
    public static final ServerToBentoAssetMapper2 GIFT_24 = new ServerToBentoAssetMapper2("GIFT_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, C20690R.drawable.ic_rds_gift_24dp);
    public static final ServerToBentoAssetMapper2 GOLD_16 = new ServerToBentoAssetMapper2("GOLD_16", EnumC7081g.f2778x3356acf6, C20690R.drawable.ic_rds_gold_16dp);
    public static final ServerToBentoAssetMapper2 GOLD_24 = new ServerToBentoAssetMapper2("GOLD_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, C20690R.drawable.ic_rds_gold_24dp);
    public static final ServerToBentoAssetMapper2 GROCERIES_24 = new ServerToBentoAssetMapper2("GROCERIES_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, C20690R.drawable.ic_rds_groceries_24dp);
    public static final ServerToBentoAssetMapper2 HAMBURGER_12 = new ServerToBentoAssetMapper2("HAMBURGER_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, C20690R.drawable.ic_rds_hamburger_12dp);
    public static final ServerToBentoAssetMapper2 HAMBURGER_16 = new ServerToBentoAssetMapper2("HAMBURGER_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, C20690R.drawable.ic_rds_hamburger_16dp);
    public static final ServerToBentoAssetMapper2 HAMBURGER_24 = new ServerToBentoAssetMapper2("HAMBURGER_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, C20690R.drawable.ic_rds_hamburger_24dp);
    public static final ServerToBentoAssetMapper2 HEALTHCARE_12 = new ServerToBentoAssetMapper2("HEALTHCARE_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, C20690R.drawable.ic_rds_healthcare_12dp);
    public static final ServerToBentoAssetMapper2 HEALTHCARE_24 = new ServerToBentoAssetMapper2("HEALTHCARE_24", EnumC7081g.f2779x59907a3d, C20690R.drawable.ic_rds_healthcare_24dp);
    public static final ServerToBentoAssetMapper2 HELP_24 = new ServerToBentoAssetMapper2("HELP_24", 250, C20690R.drawable.ic_rds_help_24dp);
    public static final ServerToBentoAssetMapper2 HISTORY_16 = new ServerToBentoAssetMapper2("HISTORY_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, C20690R.drawable.ic_rds_history_16dp);
    public static final ServerToBentoAssetMapper2 HISTORY_24 = new ServerToBentoAssetMapper2("HISTORY_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, C20690R.drawable.ic_rds_history_24dp);
    public static final ServerToBentoAssetMapper2 HOME_24 = new ServerToBentoAssetMapper2("HOME_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, C20690R.drawable.ic_rds_home_24dp);
    public static final ServerToBentoAssetMapper2 HOSPITALITY_12 = new ServerToBentoAssetMapper2("HOSPITALITY_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, C20690R.drawable.ic_rds_hospitality_12dp);
    public static final ServerToBentoAssetMapper2 HOSPITALITY_24 = new ServerToBentoAssetMapper2("HOSPITALITY_24", 255, C20690R.drawable.ic_rds_hospitality_24dp);
    public static final ServerToBentoAssetMapper2 HOURGLASS_12 = new ServerToBentoAssetMapper2("HOURGLASS_12", 256, C20690R.drawable.ic_rds_hourglass_12dp);
    public static final ServerToBentoAssetMapper2 HOURGLASS_16 = new ServerToBentoAssetMapper2("HOURGLASS_16", EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE, C20690R.drawable.ic_rds_hourglass_16dp);
    public static final ServerToBentoAssetMapper2 HOURGLASS_24 = new ServerToBentoAssetMapper2("HOURGLASS_24", EnumC7081g.SDK_ASSET_HEADER_BOLT_VALUE, C20690R.drawable.ic_rds_hourglass_24dp);
    public static final ServerToBentoAssetMapper2 ICLOUD_RESTORE_16 = new ServerToBentoAssetMapper2("ICLOUD_RESTORE_16", EnumC7081g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE, C20690R.drawable.ic_rds_icloud_restore_16dp);
    public static final ServerToBentoAssetMapper2 ICLOUD_RESTORE_24 = new ServerToBentoAssetMapper2("ICLOUD_RESTORE_24", EnumC7081g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE, C20690R.drawable.ic_rds_icloud_restore_24dp);
    public static final ServerToBentoAssetMapper2 IMAGE_16 = new ServerToBentoAssetMapper2("IMAGE_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE, C20690R.drawable.ic_rds_image_16dp);
    public static final ServerToBentoAssetMapper2 IMAGE_24 = new ServerToBentoAssetMapper2("IMAGE_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, C20690R.drawable.ic_rds_image_24dp);
    public static final ServerToBentoAssetMapper2 IMAGE_FAIL_16 = new ServerToBentoAssetMapper2("IMAGE_FAIL_16", EnumC7081g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE, C20690R.drawable.ic_rds_image_fail_16dp);
    public static final ServerToBentoAssetMapper2 IMAGE_FAIL_24 = new ServerToBentoAssetMapper2("IMAGE_FAIL_24", EnumC7081g.SDK_ASSET_ICON_PLAID_LOGO_VALUE, C20690R.drawable.ic_rds_image_fail_24dp);
    public static final ServerToBentoAssetMapper2 INFO_12 = new ServerToBentoAssetMapper2("INFO_12", EnumC7081g.SDK_ASSET_HEADER_SHIELD_VALUE, C20690R.drawable.ic_rds_info_12dp);
    public static final ServerToBentoAssetMapper2 INFO_16 = new ServerToBentoAssetMapper2("INFO_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE, C20690R.drawable.ic_rds_info_16dp);
    public static final ServerToBentoAssetMapper2 INFO_24 = new ServerToBentoAssetMapper2("INFO_24", EnumC7081g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE, C20690R.drawable.ic_rds_info_24dp);
    public static final ServerToBentoAssetMapper2 INFO_FILLED_12 = new ServerToBentoAssetMapper2("INFO_FILLED_12", EnumC7081g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE, C20690R.drawable.ic_rds_info_filled_12dp);
    public static final ServerToBentoAssetMapper2 INFO_FILLED_16 = new ServerToBentoAssetMapper2("INFO_FILLED_16", EnumC7081g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE, C20690R.drawable.ic_rds_info_filled_16dp);
    public static final ServerToBentoAssetMapper2 INFO_FILLED_24 = new ServerToBentoAssetMapper2("INFO_FILLED_24", EnumC7081g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE, C20690R.drawable.ic_rds_info_filled_24dp);
    public static final ServerToBentoAssetMapper2 ISA_16 = new ServerToBentoAssetMapper2("ISA_16", 271, C20690R.drawable.ic_rds_isa_16dp);
    public static final ServerToBentoAssetMapper2 ISA_24 = new ServerToBentoAssetMapper2("ISA_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, C20690R.drawable.ic_rds_isa_24dp);
    public static final ServerToBentoAssetMapper2 JOINT_ACCOUNT_12 = new ServerToBentoAssetMapper2("JOINT_ACCOUNT_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, C20690R.drawable.ic_rds_joint_account_12dp);
    public static final ServerToBentoAssetMapper2 JOINT_ACCOUNT_16 = new ServerToBentoAssetMapper2("JOINT_ACCOUNT_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE, C20690R.drawable.ic_rds_joint_account_16dp);
    public static final ServerToBentoAssetMapper2 JOINT_ACCOUNT_24 = new ServerToBentoAssetMapper2("JOINT_ACCOUNT_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE, C20690R.drawable.ic_rds_joint_account_24dp);
    public static final ServerToBentoAssetMapper2 L2_HEADER_ARROW_24 = new ServerToBentoAssetMapper2("L2_HEADER_ARROW_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE, C20690R.drawable.ic_rds_l2_header_arrow_24dp);
    public static final ServerToBentoAssetMapper2 LIGHTBULB_16 = new ServerToBentoAssetMapper2("LIGHTBULB_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, C20690R.drawable.ic_rds_lightbulb_16dp);
    public static final ServerToBentoAssetMapper2 LIGHTBULB_24 = new ServerToBentoAssetMapper2("LIGHTBULB_24", EnumC7081g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, C20690R.drawable.ic_rds_lightbulb_24dp);
    public static final ServerToBentoAssetMapper2 LIGHTNING_12 = new ServerToBentoAssetMapper2("LIGHTNING_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE, C20690R.drawable.ic_rds_lightning_12dp);
    public static final ServerToBentoAssetMapper2 LIGHTNING_16 = new ServerToBentoAssetMapper2("LIGHTNING_16", 280, C20690R.drawable.ic_rds_lightning_16dp);
    public static final ServerToBentoAssetMapper2 LIGHTNING_24 = new ServerToBentoAssetMapper2("LIGHTNING_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_VALUE, C20690R.drawable.ic_rds_lightning_24dp);
    public static final ServerToBentoAssetMapper2 LIGHTNING_OFF_16 = new ServerToBentoAssetMapper2("LIGHTNING_OFF_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE, C20690R.drawable.ic_rds_lightning_off_16dp);
    public static final ServerToBentoAssetMapper2 LIKE_POST_FILLED_16 = new ServerToBentoAssetMapper2("LIKE_POST_FILLED_16", 283, C20690R.drawable.ic_rds_like_post_filled_16dp);
    public static final ServerToBentoAssetMapper2 LIKE_POST_FILLED_20 = new ServerToBentoAssetMapper2("LIKE_POST_FILLED_20", EnumC7081g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE, C20690R.drawable.ic_rds_like_post_filled_20dp);
    public static final ServerToBentoAssetMapper2 LIKE_POST_OUTLINE_16 = new ServerToBentoAssetMapper2("LIKE_POST_OUTLINE_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE, C20690R.drawable.ic_rds_like_post_outline_16dp);
    public static final ServerToBentoAssetMapper2 LIKE_POST_OUTLINE_20 = new ServerToBentoAssetMapper2("LIKE_POST_OUTLINE_20", EnumC7081g.f2777x89a9e432, C20690R.drawable.ic_rds_like_post_outline_20dp);
    public static final ServerToBentoAssetMapper2 LIKE_POST_OUTLINE_24 = new ServerToBentoAssetMapper2("LIKE_POST_OUTLINE_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, C20690R.drawable.ic_rds_like_post_outline_24dp);
    public static final ServerToBentoAssetMapper2 LINK_16 = new ServerToBentoAssetMapper2("LINK_16", 288, C20690R.drawable.ic_rds_link_16dp);
    public static final ServerToBentoAssetMapper2 LINK_24 = new ServerToBentoAssetMapper2("LINK_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE, C20690R.drawable.ic_rds_link_24dp);
    public static final ServerToBentoAssetMapper2 LINK_OUT_12 = new ServerToBentoAssetMapper2("LINK_OUT_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE, C20690R.drawable.ic_rds_link_out_12dp);
    public static final ServerToBentoAssetMapper2 LINK_OUT_16 = new ServerToBentoAssetMapper2("LINK_OUT_16", EnumC7081g.f2776x87e624cb, C20690R.drawable.ic_rds_link_out_16dp);
    public static final ServerToBentoAssetMapper2 LINK_OUT_24 = new ServerToBentoAssetMapper2("LINK_OUT_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE, C20690R.drawable.ic_rds_link_out_24dp);
    public static final ServerToBentoAssetMapper2 LIST_24 = new ServerToBentoAssetMapper2("LIST_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE, C20690R.drawable.ic_rds_list_24dp);
    public static final ServerToBentoAssetMapper2 LOCATION_FILL_16 = new ServerToBentoAssetMapper2("LOCATION_FILL_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE, C20690R.drawable.ic_rds_location_fill_16dp);
    public static final ServerToBentoAssetMapper2 LOCATION_FILL_24 = new ServerToBentoAssetMapper2("LOCATION_FILL_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE, C20690R.drawable.ic_rds_location_fill_24dp);
    public static final ServerToBentoAssetMapper2 LOCATION_OUTLINE_24 = new ServerToBentoAssetMapper2("LOCATION_OUTLINE_24", EnumC7081g.SDK_ASSET_LOADING_INDICATOR_VALUE, C20690R.drawable.ic_rds_location_outline_24dp);
    public static final ServerToBentoAssetMapper2 LOCK_12 = new ServerToBentoAssetMapper2("LOCK_12", EnumC7081g.SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE, C20690R.drawable.ic_rds_lock_12dp);
    public static final ServerToBentoAssetMapper2 LOCK_16 = new ServerToBentoAssetMapper2("LOCK_16", EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE, C20690R.drawable.ic_rds_lock_16dp);
    public static final ServerToBentoAssetMapper2 LOCK_24 = new ServerToBentoAssetMapper2("LOCK_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE, C20690R.drawable.ic_rds_lock_24dp);
    public static final ServerToBentoAssetMapper2 LOG_OUT_24 = new ServerToBentoAssetMapper2("LOG_OUT_24", 300, C20690R.drawable.ic_rds_log_out_24dp);
    public static final ServerToBentoAssetMapper2 MANAGED_ACCOUNTS_16 = new ServerToBentoAssetMapper2("MANAGED_ACCOUNTS_16", EnumC7081g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE, C20690R.drawable.ic_rds_managed_accounts_16dp);
    public static final ServerToBentoAssetMapper2 MANAGED_ACCOUNTS_24 = new ServerToBentoAssetMapper2("MANAGED_ACCOUNTS_24", 302, C20690R.drawable.ic_rds_managed_accounts_24dp);
    public static final ServerToBentoAssetMapper2 MANAGED_INDIVIDUAL_24 = new ServerToBentoAssetMapper2("MANAGED_INDIVIDUAL_24", EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE, C20690R.drawable.ic_rds_managed_individual_24dp);
    public static final ServerToBentoAssetMapper2 MANAGED_JOINT_24 = new ServerToBentoAssetMapper2("MANAGED_JOINT_24", EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE, C20690R.drawable.ic_rds_managed_joint_24dp);
    public static final ServerToBentoAssetMapper2 MANAGED_RETIREMENT_24 = new ServerToBentoAssetMapper2("MANAGED_RETIREMENT_24", EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE, C20690R.drawable.ic_rds_managed_retirement_24dp);
    public static final ServerToBentoAssetMapper2 MANUFACTURING_12 = new ServerToBentoAssetMapper2("MANUFACTURING_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE, C20690R.drawable.ic_rds_manufacturing_12dp);
    public static final ServerToBentoAssetMapper2 MANUFACTURING_24 = new ServerToBentoAssetMapper2("MANUFACTURING_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE, C20690R.drawable.ic_rds_manufacturing_24dp);
    public static final ServerToBentoAssetMapper2 MAPS_24 = new ServerToBentoAssetMapper2("MAPS_24", EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE, C20690R.drawable.ic_rds_maps_24dp);
    public static final ServerToBentoAssetMapper2 MARGIN_12 = new ServerToBentoAssetMapper2("MARGIN_12", EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE, C20690R.drawable.ic_rds_margin_12dp);
    public static final ServerToBentoAssetMapper2 MARGIN_16 = new ServerToBentoAssetMapper2("MARGIN_16", EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE, C20690R.drawable.ic_rds_margin_16dp);
    public static final ServerToBentoAssetMapper2 MARGIN_24 = new ServerToBentoAssetMapper2("MARGIN_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE, C20690R.drawable.ic_rds_margin_24dp);
    public static final ServerToBentoAssetMapper2 MAXIMUM_16 = new ServerToBentoAssetMapper2("MAXIMUM_16", EnumC7081g.f2774x74902ae0, C20690R.drawable.ic_rds_maximum_16dp);
    public static final ServerToBentoAssetMapper2 MESSAGE_SEND_16 = new ServerToBentoAssetMapper2("MESSAGE_SEND_16", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE, C20690R.drawable.ic_rds_message_send_16dp);
    public static final ServerToBentoAssetMapper2 MESSAGE_SEND_24 = new ServerToBentoAssetMapper2("MESSAGE_SEND_24", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE, C20690R.drawable.ic_rds_message_send_24dp);
    public static final ServerToBentoAssetMapper2 MINIMUM_16 = new ServerToBentoAssetMapper2("MINIMUM_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE, C20690R.drawable.ic_rds_minimum_16dp);
    public static final ServerToBentoAssetMapper2 MINUS_12 = new ServerToBentoAssetMapper2("MINUS_12", 316, C20690R.drawable.ic_rds_minus_12dp);
    public static final ServerToBentoAssetMapper2 MINUS_16 = new ServerToBentoAssetMapper2("MINUS_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE, C20690R.drawable.ic_rds_minus_16dp);
    public static final ServerToBentoAssetMapper2 MINUS_24 = new ServerToBentoAssetMapper2("MINUS_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE, C20690R.drawable.ic_rds_minus_24dp);
    public static final ServerToBentoAssetMapper2 MORE_MENU_16 = new ServerToBentoAssetMapper2("MORE_MENU_16", EnumC7081g.f2781x2ba65ba3, C20690R.drawable.ic_rds_more_menu_16dp);
    public static final ServerToBentoAssetMapper2 MORE_MENU_20 = new ServerToBentoAssetMapper2("MORE_MENU_20", EnumC7081g.SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE, C20690R.drawable.ic_rds_more_menu_20dp);
    public static final ServerToBentoAssetMapper2 NEWS_16 = new ServerToBentoAssetMapper2("NEWS_16", EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_LIGHT_VALUE, C20690R.drawable.ic_rds_news_16dp);
    public static final ServerToBentoAssetMapper2 NEWS_24 = new ServerToBentoAssetMapper2("NEWS_24", EnumC7081g.SDK_ASSET_PLAID_PROFILE_CIRCLE_VALUE, C20690R.drawable.ic_rds_news_24dp);
    public static final ServerToBentoAssetMapper2 NO_VALUE_24 = new ServerToBentoAssetMapper2("NO_VALUE_24", EnumC7081g.f2775xbcb7e6f3, C20690R.drawable.ic_rds_no_value_24dp);
    public static final ServerToBentoAssetMapper2 NO_VALUE_32 = new ServerToBentoAssetMapper2("NO_VALUE_32", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE, C20690R.drawable.ic_rds_no_value_32dp);
    public static final ServerToBentoAssetMapper2 NOTIFICATION_12 = new ServerToBentoAssetMapper2("NOTIFICATION_12", EnumC7081g.SDK_ASSET_ICON_REPORT_VALUE, C20690R.drawable.ic_rds_notification_12dp);
    public static final ServerToBentoAssetMapper2 NOTIFICATION_16 = new ServerToBentoAssetMapper2("NOTIFICATION_16", EnumC7081g.SDK_ASSET_ICON_STEP_COMPLETE_VALUE, C20690R.drawable.ic_rds_notification_16dp);
    public static final ServerToBentoAssetMapper2 NOTIFICATION_24 = new ServerToBentoAssetMapper2("NOTIFICATION_24", EnumC7081g.SDK_ASSET_ICON_UPLOAD_VALUE, C20690R.drawable.ic_rds_notification_24dp);
    public static final ServerToBentoAssetMapper2 NOTIFICATION_32 = new ServerToBentoAssetMapper2("NOTIFICATION_32", EnumC7081g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE, C20690R.drawable.ic_rds_notification_32dp);
    public static final ServerToBentoAssetMapper2 NOTIFICATION_ADD_16 = new ServerToBentoAssetMapper2("NOTIFICATION_ADD_16", EnumC7081g.SDK_ASSET_ICON_LIGHTNING_FILLED_BLUE_VALUE, C20690R.drawable.ic_rds_notification_add_16dp);
    public static final ServerToBentoAssetMapper2 NOTIFICATION_ADD_24 = new ServerToBentoAssetMapper2("NOTIFICATION_ADD_24", 330, C20690R.drawable.ic_rds_notification_add_24dp);
    public static final ServerToBentoAssetMapper2 NOTIFICATION_CHECK_16 = new ServerToBentoAssetMapper2("NOTIFICATION_CHECK_16", 331, C20690R.drawable.ic_rds_notification_check_16dp);
    public static final ServerToBentoAssetMapper2 NOTIFICATION_CHECK_24 = new ServerToBentoAssetMapper2("NOTIFICATION_CHECK_24", 332, C20690R.drawable.ic_rds_notification_check_24dp);
    public static final ServerToBentoAssetMapper2 NUMPAD_DOWN_24 = new ServerToBentoAssetMapper2("NUMPAD_DOWN_24", 333, C20690R.drawable.ic_rds_numpad_down_24dp);
    public static final ServerToBentoAssetMapper2 NUMPAD_UP_24 = new ServerToBentoAssetMapper2("NUMPAD_UP_24", 334, C20690R.drawable.ic_rds_numpad_up_24dp);
    public static final ServerToBentoAssetMapper2 ONLINE_16 = new ServerToBentoAssetMapper2("ONLINE_16", 335, C20690R.drawable.ic_rds_online_16dp);
    public static final ServerToBentoAssetMapper2 ONLINE_24 = new ServerToBentoAssetMapper2("ONLINE_24", WaitlistAnimationConstants.IN_WAITLIST_ANIMATION_END, C20690R.drawable.ic_rds_online_24dp);
    public static final ServerToBentoAssetMapper2 OPTIONS_DOWN_24 = new ServerToBentoAssetMapper2("OPTIONS_DOWN_24", 337, C20690R.drawable.ic_rds_options_down_24dp);
    public static final ServerToBentoAssetMapper2 OPTIONS_FLAT_24 = new ServerToBentoAssetMapper2("OPTIONS_FLAT_24", 338, C20690R.drawable.ic_rds_options_flat_24dp);
    public static final ServerToBentoAssetMapper2 OPTIONS_UP_24 = new ServerToBentoAssetMapper2("OPTIONS_UP_24", 339, C20690R.drawable.ic_rds_options_up_24dp);
    public static final ServerToBentoAssetMapper2 OPTIONS_VOLATILE_24 = new ServerToBentoAssetMapper2("OPTIONS_VOLATILE_24", 340, C20690R.drawable.ic_rds_options_volatile_24dp);
    public static final ServerToBentoAssetMapper2 ORDER_16 = new ServerToBentoAssetMapper2("ORDER_16", 341, C20690R.drawable.ic_rds_order_16dp);
    public static final ServerToBentoAssetMapper2 ORDER_24 = new ServerToBentoAssetMapper2("ORDER_24", 342, C20690R.drawable.ic_rds_order_24dp);
    public static final ServerToBentoAssetMapper2 PAUSE_HERO_40 = new ServerToBentoAssetMapper2("PAUSE_HERO_40", 343, C20690R.drawable.ic_rds_pause_hero_40dp);
    public static final ServerToBentoAssetMapper2 PAUSE_INLINE_24 = new ServerToBentoAssetMapper2("PAUSE_INLINE_24", 344, C20690R.drawable.ic_rds_pause_inline_24dp);
    public static final ServerToBentoAssetMapper2 PAYCHECK_24 = new ServerToBentoAssetMapper2("PAYCHECK_24", 345, C20690R.drawable.ic_rds_paycheck_24dp);
    public static final ServerToBentoAssetMapper2 PAYMENT_12 = new ServerToBentoAssetMapper2("PAYMENT_12", 346, C20690R.drawable.ic_rds_payment_12dp);
    public static final ServerToBentoAssetMapper2 PAYMENT_16 = new ServerToBentoAssetMapper2("PAYMENT_16", 347, C20690R.drawable.ic_rds_payment_16dp);
    public static final ServerToBentoAssetMapper2 PAYMENT_24 = new ServerToBentoAssetMapper2("PAYMENT_24", 348, C20690R.drawable.ic_rds_payment_24dp);
    public static final ServerToBentoAssetMapper2 PAYMENT_32 = new ServerToBentoAssetMapper2("PAYMENT_32", 349, C20690R.drawable.ic_rds_payment_32dp);
    public static final ServerToBentoAssetMapper2 PERCENT_SIGN_12 = new ServerToBentoAssetMapper2("PERCENT_SIGN_12", 350, C20690R.drawable.ic_rds_percent_sign_12dp);
    public static final ServerToBentoAssetMapper2 PERCENT_SIGN_16 = new ServerToBentoAssetMapper2("PERCENT_SIGN_16", 351, C20690R.drawable.ic_rds_percent_sign_16dp);
    public static final ServerToBentoAssetMapper2 PERCENT_SIGN_24 = new ServerToBentoAssetMapper2("PERCENT_SIGN_24", 352, C20690R.drawable.ic_rds_percent_sign_24dp);
    public static final ServerToBentoAssetMapper2 PERPETUAL_FUTURES_32 = new ServerToBentoAssetMapper2("PERPETUAL_FUTURES_32", 353, C20690R.drawable.ic_rds_perpetual_futures_32dp);
    public static final ServerToBentoAssetMapper2 PERSON_12 = new ServerToBentoAssetMapper2("PERSON_12", 354, C20690R.drawable.ic_rds_person_12dp);
    public static final ServerToBentoAssetMapper2 PERSON_16 = new ServerToBentoAssetMapper2("PERSON_16", 355, C20690R.drawable.ic_rds_person_16dp);
    public static final ServerToBentoAssetMapper2 PERSON_24 = new ServerToBentoAssetMapper2("PERSON_24", 356, C20690R.drawable.ic_rds_person_24dp);
    public static final ServerToBentoAssetMapper2 PHONE_16 = new ServerToBentoAssetMapper2("PHONE_16", 357, C20690R.drawable.ic_rds_phone_16dp);
    public static final ServerToBentoAssetMapper2 PHONE_24 = new ServerToBentoAssetMapper2("PHONE_24", 358, C20690R.drawable.ic_rds_phone_24dp);
    public static final ServerToBentoAssetMapper2 PHONE_CONNECTED_16 = new ServerToBentoAssetMapper2("PHONE_CONNECTED_16", 359, C20690R.drawable.ic_rds_phone_connected_16dp);
    public static final ServerToBentoAssetMapper2 PHONE_MISSED_CALL_16 = new ServerToBentoAssetMapper2("PHONE_MISSED_CALL_16", 360, C20690R.drawable.ic_rds_phone_missed_call_16dp);
    public static final ServerToBentoAssetMapper2 PHONE_WAITING_16 = new ServerToBentoAssetMapper2("PHONE_WAITING_16", 361, C20690R.drawable.ic_rds_phone_waiting_16dp);
    public static final ServerToBentoAssetMapper2 PICTURE_IN_PICTURE_24 = new ServerToBentoAssetMapper2("PICTURE_IN_PICTURE_24", 362, C20690R.drawable.ic_rds_picture_in_picture_24dp);
    public static final ServerToBentoAssetMapper2 PIE_CHART_16 = new ServerToBentoAssetMapper2("PIE_CHART_16", 363, C20690R.drawable.ic_rds_pie_chart_16dp);
    public static final ServerToBentoAssetMapper2 PIE_CHART_24 = new ServerToBentoAssetMapper2("PIE_CHART_24", 364, C20690R.drawable.ic_rds_pie_chart_24dp);
    public static final ServerToBentoAssetMapper2 PIN_16 = new ServerToBentoAssetMapper2("PIN_16", 365, C20690R.drawable.ic_rds_pin_16dp);
    public static final ServerToBentoAssetMapper2 PIN_24 = new ServerToBentoAssetMapper2("PIN_24", 366, C20690R.drawable.ic_rds_pin_24dp);
    public static final ServerToBentoAssetMapper2 PLAY_HERO_40 = new ServerToBentoAssetMapper2("PLAY_HERO_40", 367, C20690R.drawable.ic_rds_play_hero_40dp);
    public static final ServerToBentoAssetMapper2 PLAY_INLINE_16 = new ServerToBentoAssetMapper2("PLAY_INLINE_16", 368, C20690R.drawable.ic_rds_play_inline_16dp);
    public static final ServerToBentoAssetMapper2 PLAY_INLINE_24 = new ServerToBentoAssetMapper2("PLAY_INLINE_24", 369, C20690R.drawable.ic_rds_play_inline_24dp);
    public static final ServerToBentoAssetMapper2 PLUS_12 = new ServerToBentoAssetMapper2("PLUS_12", 370, C20690R.drawable.ic_rds_plus_12dp);
    public static final ServerToBentoAssetMapper2 PLUS_16 = new ServerToBentoAssetMapper2("PLUS_16", 371, C20690R.drawable.ic_rds_plus_16dp);
    public static final ServerToBentoAssetMapper2 PLUS_24 = new ServerToBentoAssetMapper2("PLUS_24", 372, C20690R.drawable.ic_rds_plus_24dp);
    public static final ServerToBentoAssetMapper2 POP_OUT_16 = new ServerToBentoAssetMapper2("POP_OUT_16", 373, C20690R.drawable.ic_rds_pop_out_16dp);
    public static final ServerToBentoAssetMapper2 POP_OUT_24 = new ServerToBentoAssetMapper2("POP_OUT_24", 374, C20690R.drawable.ic_rds_pop_out_24dp);
    public static final ServerToBentoAssetMapper2 PRINT_24 = new ServerToBentoAssetMapper2("PRINT_24", 375, C20690R.drawable.ic_rds_print_24dp);
    public static final ServerToBentoAssetMapper2 QR_16 = new ServerToBentoAssetMapper2("QR_16", 376, C20690R.drawable.ic_rds_qr_16dp);
    public static final ServerToBentoAssetMapper2 QR_24 = new ServerToBentoAssetMapper2("QR_24", 377, C20690R.drawable.ic_rds_qr_24dp);
    public static final ServerToBentoAssetMapper2 QR_SCAN_24 = new ServerToBentoAssetMapper2("QR_SCAN_24", 378, C20690R.drawable.ic_rds_qr_scan_24dp);
    public static final ServerToBentoAssetMapper2 QUANTITY_16 = new ServerToBentoAssetMapper2("QUANTITY_16", 379, C20690R.drawable.ic_rds_quantity_16dp);
    public static final ServerToBentoAssetMapper2 QUANTITY_24 = new ServerToBentoAssetMapper2("QUANTITY_24", 380, C20690R.drawable.ic_rds_quantity_24dp);
    public static final ServerToBentoAssetMapper2 QUESTION_12 = new ServerToBentoAssetMapper2("QUESTION_12", 381, C20690R.drawable.ic_rds_question_12dp);
    public static final ServerToBentoAssetMapper2 QUESTION_16 = new ServerToBentoAssetMapper2("QUESTION_16", 382, C20690R.drawable.ic_rds_question_16dp);
    public static final ServerToBentoAssetMapper2 QUESTION_24 = new ServerToBentoAssetMapper2("QUESTION_24", 383, C20690R.drawable.ic_rds_question_24dp);
    public static final ServerToBentoAssetMapper2 QUESTION_FILLED_12 = new ServerToBentoAssetMapper2("QUESTION_FILLED_12", 384, C20690R.drawable.ic_rds_question_filled_12dp);
    public static final ServerToBentoAssetMapper2 QUESTION_FILLED_16 = new ServerToBentoAssetMapper2("QUESTION_FILLED_16", 385, C20690R.drawable.ic_rds_question_filled_16dp);
    public static final ServerToBentoAssetMapper2 QUESTION_FILLED_24 = new ServerToBentoAssetMapper2("QUESTION_FILLED_24", 386, C20690R.drawable.ic_rds_question_filled_24dp);
    public static final ServerToBentoAssetMapper2 RECURRING_12 = new ServerToBentoAssetMapper2("RECURRING_12", 387, C20690R.drawable.ic_rds_recurring_12dp);
    public static final ServerToBentoAssetMapper2 RECURRING_16 = new ServerToBentoAssetMapper2("RECURRING_16", 388, C20690R.drawable.ic_rds_recurring_16dp);
    public static final ServerToBentoAssetMapper2 RECURRING_24 = new ServerToBentoAssetMapper2("RECURRING_24", 389, C20690R.drawable.ic_rds_recurring_24dp);
    public static final ServerToBentoAssetMapper2 RECURRING_HUB_24 = new ServerToBentoAssetMapper2("RECURRING_HUB_24", 390, C20690R.drawable.ic_rds_recurring_hub_24dp);
    public static final ServerToBentoAssetMapper2 REPEAT_16 = new ServerToBentoAssetMapper2("REPEAT_16", 391, C20690R.drawable.ic_rds_repeat_16dp);
    public static final ServerToBentoAssetMapper2 REPLAY_HERO_40 = new ServerToBentoAssetMapper2("REPLAY_HERO_40", 392, C20690R.drawable.ic_rds_replay_hero_40dp);
    public static final ServerToBentoAssetMapper2 RESEND_16 = new ServerToBentoAssetMapper2("RESEND_16", 393, C20690R.drawable.ic_rds_resend_16dp);
    public static final ServerToBentoAssetMapper2 RESEND_24 = new ServerToBentoAssetMapper2("RESEND_24", 394, C20690R.drawable.ic_rds_resend_24dp);
    public static final ServerToBentoAssetMapper2 RETIREMENT_12 = new ServerToBentoAssetMapper2("RETIREMENT_12", 395, C20690R.drawable.ic_rds_retirement_12dp);
    public static final ServerToBentoAssetMapper2 RETIREMENT_16 = new ServerToBentoAssetMapper2("RETIREMENT_16", WaitlistAnimationConstants.LEFT_YAW_START, C20690R.drawable.ic_rds_retirement_16dp);
    public static final ServerToBentoAssetMapper2 RETIREMENT_24 = new ServerToBentoAssetMapper2("RETIREMENT_24", 397, C20690R.drawable.ic_rds_retirement_24dp);
    public static final ServerToBentoAssetMapper2 RETIREMENT_32 = new ServerToBentoAssetMapper2("RETIREMENT_32", 398, C20690R.drawable.ic_rds_retirement_32dp);
    public static final ServerToBentoAssetMapper2 RHW_BROWSER_TAB_24 = new ServerToBentoAssetMapper2("RHW_BROWSER_TAB_24", 399, C20690R.drawable.ic_rds_rhw_browser_tab_24dp);
    public static final ServerToBentoAssetMapper2 RHW_CHART_TAB_24 = new ServerToBentoAssetMapper2("RHW_CHART_TAB_24", 400, C20690R.drawable.ic_rds_rhw_chart_tab_24dp);
    public static final ServerToBentoAssetMapper2 RHW_SEARCH_TAB_24 = new ServerToBentoAssetMapper2("RHW_SEARCH_TAB_24", 401, C20690R.drawable.ic_rds_rhw_search_tab_24dp);
    public static final ServerToBentoAssetMapper2 RISK_AND_UNCERTAINTY_24 = new ServerToBentoAssetMapper2("RISK_AND_UNCERTAINTY_24", 402, C20690R.drawable.ic_rds_risk_and_uncertainty_24dp);
    public static final ServerToBentoAssetMapper2 ROBINHOOD_12 = new ServerToBentoAssetMapper2("ROBINHOOD_12", HttpStatusCode.FORBIDDEN, C20690R.drawable.ic_rds_robinhood_12dp);
    public static final ServerToBentoAssetMapper2 ROBINHOOD_16 = new ServerToBentoAssetMapper2("ROBINHOOD_16", 404, C20690R.drawable.ic_rds_robinhood_16dp);
    public static final ServerToBentoAssetMapper2 ROBINHOOD_24 = new ServerToBentoAssetMapper2("ROBINHOOD_24", 405, C20690R.drawable.ic_rds_robinhood_24dp);
    public static final ServerToBentoAssetMapper2 ROLLING_POSITION_12 = new ServerToBentoAssetMapper2("ROLLING_POSITION_12", 406, C20690R.drawable.ic_rds_rolling_position_12dp);
    public static final ServerToBentoAssetMapper2 ROLLING_POSITION_16 = new ServerToBentoAssetMapper2("ROLLING_POSITION_16", 407, C20690R.drawable.ic_rds_rolling_position_16dp);
    public static final ServerToBentoAssetMapper2 ROLLING_POSITION_24 = new ServerToBentoAssetMapper2("ROLLING_POSITION_24", 408, C20690R.drawable.ic_rds_rolling_position_24dp);
    public static final ServerToBentoAssetMapper2 SCAN_16 = new ServerToBentoAssetMapper2("SCAN_16", 409, C20690R.drawable.ic_rds_scan_16dp);
    public static final ServerToBentoAssetMapper2 SCAN_24 = new ServerToBentoAssetMapper2("SCAN_24", HttpStatusCode.GONE, C20690R.drawable.ic_rds_scan_24dp);
    public static final ServerToBentoAssetMapper2 SEARCH_16 = new ServerToBentoAssetMapper2("SEARCH_16", 411, C20690R.drawable.ic_rds_search_16dp);
    public static final ServerToBentoAssetMapper2 SEARCH_24 = new ServerToBentoAssetMapper2("SEARCH_24", 412, C20690R.drawable.ic_rds_search_24dp);
    public static final ServerToBentoAssetMapper2 SETTINGS_12 = new ServerToBentoAssetMapper2("SETTINGS_12", 413, C20690R.drawable.ic_rds_settings_12dp);
    public static final ServerToBentoAssetMapper2 SETTINGS_16 = new ServerToBentoAssetMapper2("SETTINGS_16", 414, C20690R.drawable.ic_rds_settings_16dp);
    public static final ServerToBentoAssetMapper2 SETTINGS_24 = new ServerToBentoAssetMapper2("SETTINGS_24", 415, C20690R.drawable.ic_rds_settings_24dp);
    public static final ServerToBentoAssetMapper2 SHARE_ANDROID_16 = new ServerToBentoAssetMapper2("SHARE_ANDROID_16", 416, C20690R.drawable.ic_rds_share_android_16dp);
    public static final ServerToBentoAssetMapper2 SHARE_ANDROID_24 = new ServerToBentoAssetMapper2("SHARE_ANDROID_24", 417, C20690R.drawable.ic_rds_share_android_24dp);
    public static final ServerToBentoAssetMapper2 SHARE_IOS_16 = new ServerToBentoAssetMapper2("SHARE_IOS_16", 418, C20690R.drawable.ic_rds_share_ios_16dp);
    public static final ServerToBentoAssetMapper2 SHARE_IOS_24 = new ServerToBentoAssetMapper2("SHARE_IOS_24", 419, C20690R.drawable.ic_rds_share_ios_24dp);
    public static final ServerToBentoAssetMapper2 SMILEY_24 = new ServerToBentoAssetMapper2("SMILEY_24", 420, C20690R.drawable.ic_rds_smiley_24dp);
    public static final ServerToBentoAssetMapper2 SOCIAL_CREATE_POST_16 = new ServerToBentoAssetMapper2("SOCIAL_CREATE_POST_16", 421, C20690R.drawable.ic_rds_social_create_post_16dp);
    public static final ServerToBentoAssetMapper2 SORT_12 = new ServerToBentoAssetMapper2("SORT_12", 422, C20690R.drawable.ic_rds_sort_12dp);
    public static final ServerToBentoAssetMapper2 SOUND_OFF_24 = new ServerToBentoAssetMapper2("SOUND_OFF_24", 423, C20690R.drawable.ic_rds_sound_off_24dp);
    public static final ServerToBentoAssetMapper2 SOUND_ON_24 = new ServerToBentoAssetMapper2("SOUND_ON_24", 424, C20690R.drawable.ic_rds_sound_on_24dp);
    public static final ServerToBentoAssetMapper2 SPARKLE_BULLET_12 = new ServerToBentoAssetMapper2("SPARKLE_BULLET_12", CompanyFinancialsSection.BAR_ANIMATION_DURATION, C20690R.drawable.ic_rds_sparkle_bullet_12dp);
    public static final ServerToBentoAssetMapper2 SPARKLE_BULLET_16 = new ServerToBentoAssetMapper2("SPARKLE_BULLET_16", 426, C20690R.drawable.ic_rds_sparkle_bullet_16dp);
    public static final ServerToBentoAssetMapper2 SPARKLE_BULLET_24 = new ServerToBentoAssetMapper2("SPARKLE_BULLET_24", 427, C20690R.drawable.ic_rds_sparkle_bullet_24dp);
    public static final ServerToBentoAssetMapper2 SPARKLE_DOUBLE_16 = new ServerToBentoAssetMapper2("SPARKLE_DOUBLE_16", 428, C20690R.drawable.ic_rds_sparkle_double_16dp);
    public static final ServerToBentoAssetMapper2 SPARKLE_DOUBLE_24 = new ServerToBentoAssetMapper2("SPARKLE_DOUBLE_24", 429, C20690R.drawable.ic_rds_sparkle_double_24dp);
    public static final ServerToBentoAssetMapper2 SPEED_DOWN_24 = new ServerToBentoAssetMapper2("SPEED_DOWN_24", 430, C20690R.drawable.ic_rds_speed_down_24dp);
    public static final ServerToBentoAssetMapper2 SPEED_UP_24 = new ServerToBentoAssetMapper2("SPEED_UP_24", 431, C20690R.drawable.ic_rds_speed_up_24dp);
    public static final ServerToBentoAssetMapper2 STAR_FILLED_12 = new ServerToBentoAssetMapper2("STAR_FILLED_12", 432, C20690R.drawable.ic_rds_star_filled_12dp);
    public static final ServerToBentoAssetMapper2 STAR_FILLED_16 = new ServerToBentoAssetMapper2("STAR_FILLED_16", 433, C20690R.drawable.ic_rds_star_filled_16dp);
    public static final ServerToBentoAssetMapper2 STAR_FILLED_24 = new ServerToBentoAssetMapper2("STAR_FILLED_24", 434, C20690R.drawable.ic_rds_star_filled_24dp);
    public static final ServerToBentoAssetMapper2 STAR_OUTLINE_16 = new ServerToBentoAssetMapper2("STAR_OUTLINE_16", 435, C20690R.drawable.ic_rds_star_outline_16dp);
    public static final ServerToBentoAssetMapper2 STAR_OUTLINE_24 = new ServerToBentoAssetMapper2("STAR_OUTLINE_24", 436, C20690R.drawable.ic_rds_star_outline_24dp);
    public static final ServerToBentoAssetMapper2 STAR_PASSWORD_16 = new ServerToBentoAssetMapper2("STAR_PASSWORD_16", 437, C20690R.drawable.ic_rds_star_password_16dp);
    public static final ServerToBentoAssetMapper2 STEWARDSHIP_24 = new ServerToBentoAssetMapper2("STEWARDSHIP_24", 438, C20690R.drawable.ic_rds_stewardship_24dp);
    public static final ServerToBentoAssetMapper2 STOCK_DOWN_12 = new ServerToBentoAssetMapper2("STOCK_DOWN_12", 439, C20690R.drawable.ic_rds_stock_down_12dp);
    public static final ServerToBentoAssetMapper2 STOCK_DOWN_16 = new ServerToBentoAssetMapper2("STOCK_DOWN_16", 440, C20690R.drawable.ic_rds_stock_down_16dp);
    public static final ServerToBentoAssetMapper2 STOCK_DOWN_24 = new ServerToBentoAssetMapper2("STOCK_DOWN_24", 441, C20690R.drawable.ic_rds_stock_down_24dp);
    public static final ServerToBentoAssetMapper2 STOCK_UP_12 = new ServerToBentoAssetMapper2("STOCK_UP_12", 442, C20690R.drawable.ic_rds_stock_up_12dp);
    public static final ServerToBentoAssetMapper2 STOCK_UP_16 = new ServerToBentoAssetMapper2("STOCK_UP_16", 443, C20690R.drawable.ic_rds_stock_up_16dp);
    public static final ServerToBentoAssetMapper2 STOCK_UP_24 = new ServerToBentoAssetMapper2("STOCK_UP_24", 444, C20690R.drawable.ic_rds_stock_up_24dp);
    public static final ServerToBentoAssetMapper2 STOPWATCH_16 = new ServerToBentoAssetMapper2("STOPWATCH_16", 445, C20690R.drawable.ic_rds_stopwatch_16dp);
    public static final ServerToBentoAssetMapper2 STOPWATCH_24 = new ServerToBentoAssetMapper2("STOPWATCH_24", 446, C20690R.drawable.ic_rds_stopwatch_24dp);
    public static final ServerToBentoAssetMapper2 STOPWATCH_32 = new ServerToBentoAssetMapper2("STOPWATCH_32", 447, C20690R.drawable.ic_rds_stopwatch_32dp);
    public static final ServerToBentoAssetMapper2 STRATEGY_OUTLOOK_24 = new ServerToBentoAssetMapper2("STRATEGY_OUTLOOK_24", 448, C20690R.drawable.ic_rds_strategy_outlook_24dp);
    public static final ServerToBentoAssetMapper2 SWIPE_DOWN_16 = new ServerToBentoAssetMapper2("SWIPE_DOWN_16", 449, C20690R.drawable.ic_rds_swipe_down_16dp);
    public static final ServerToBentoAssetMapper2 SWIPE_DOWN_24 = new ServerToBentoAssetMapper2("SWIPE_DOWN_24", 450, C20690R.drawable.ic_rds_swipe_down_24dp);
    public static final ServerToBentoAssetMapper2 SWIPE_UP_16 = new ServerToBentoAssetMapper2("SWIPE_UP_16", 451, C20690R.drawable.ic_rds_swipe_up_16dp);
    public static final ServerToBentoAssetMapper2 SWIPE_UP_24 = new ServerToBentoAssetMapper2("SWIPE_UP_24", 452, C20690R.drawable.ic_rds_swipe_up_24dp);
    public static final ServerToBentoAssetMapper2 SWITCH_12 = new ServerToBentoAssetMapper2("SWITCH_12", 453, C20690R.drawable.ic_rds_switch_12dp);
    public static final ServerToBentoAssetMapper2 SWITCH_16 = new ServerToBentoAssetMapper2("SWITCH_16", 454, C20690R.drawable.ic_rds_switch_16dp);
    public static final ServerToBentoAssetMapper2 SWITCH_24 = new ServerToBentoAssetMapper2("SWITCH_24", 455, C20690R.drawable.ic_rds_switch_24dp);
    public static final ServerToBentoAssetMapper2 TAB_ACCOUNT_32 = new ServerToBentoAssetMapper2("TAB_ACCOUNT_32", WaitlistAnimationConstants.MIDDLE_YAW_FRAME, C20690R.drawable.ic_rds_tab_account_32dp);
    public static final ServerToBentoAssetMapper2 TAB_CONTENT_32 = new ServerToBentoAssetMapper2("TAB_CONTENT_32", 457, C20690R.drawable.ic_rds_tab_content_32dp);
    public static final ServerToBentoAssetMapper2 TAB_CRYPTO_32 = new ServerToBentoAssetMapper2("TAB_CRYPTO_32", 458, C20690R.drawable.ic_rds_tab_crypto_32dp);
    public static final ServerToBentoAssetMapper2 TAB_CRYPTO_C_32 = new ServerToBentoAssetMapper2("TAB_CRYPTO_C_32", 459, C20690R.drawable.ic_rds_tab_crypto_c_32dp);
    public static final ServerToBentoAssetMapper2 TAB_GOLD_32 = new ServerToBentoAssetMapper2("TAB_GOLD_32", 460, C20690R.drawable.ic_rds_tab_gold_32dp);
    public static final ServerToBentoAssetMapper2 TAB_INVEST_32 = new ServerToBentoAssetMapper2("TAB_INVEST_32", 461, C20690R.drawable.ic_rds_tab_invest_32dp);
    public static final ServerToBentoAssetMapper2 TAB_ISA_32 = new ServerToBentoAssetMapper2("TAB_ISA_32", 462, C20690R.drawable.ic_rds_tab_isa_32dp);
    public static final ServerToBentoAssetMapper2 TAB_MESSAGES_32 = new ServerToBentoAssetMapper2("TAB_MESSAGES_32", 463, C20690R.drawable.ic_rds_tab_messages_32dp);
    public static final ServerToBentoAssetMapper2 TAB_MONEY_32 = new ServerToBentoAssetMapper2("TAB_MONEY_32", 464, C20690R.drawable.ic_rds_tab_money_32dp);
    public static final ServerToBentoAssetMapper2 TAB_RETIREMENT_32 = new ServerToBentoAssetMapper2("TAB_RETIREMENT_32", 465, C20690R.drawable.ic_rds_tab_retirement_32dp);
    public static final ServerToBentoAssetMapper2 TAB_SEARCH_32 = new ServerToBentoAssetMapper2("TAB_SEARCH_32", 466, C20690R.drawable.ic_rds_tab_search_32dp);
    public static final ServerToBentoAssetMapper2 TAB_SOCIAL_32 = new ServerToBentoAssetMapper2("TAB_SOCIAL_32", 467, C20690R.drawable.ic_rds_tab_social_32dp);
    public static final ServerToBentoAssetMapper2 TAB_WATCHLIST_32 = new ServerToBentoAssetMapper2("TAB_WATCHLIST_32", 468, C20690R.drawable.ic_rds_tab_watchlist_32dp);
    public static final ServerToBentoAssetMapper2 TAG_16 = new ServerToBentoAssetMapper2("TAG_16", 469, C20690R.drawable.ic_rds_tag_16dp);
    public static final ServerToBentoAssetMapper2 TAG_24 = new ServerToBentoAssetMapper2("TAG_24", 470, C20690R.drawable.ic_rds_tag_24dp);
    public static final ServerToBentoAssetMapper2 TAX_LOTS_LONG_TERM_16 = new ServerToBentoAssetMapper2("TAX_LOTS_LONG_TERM_16", 471, C20690R.drawable.ic_rds_tax_lots_long_term_16dp);
    public static final ServerToBentoAssetMapper2 TAX_LOTS_SHORT_TERM_16 = new ServerToBentoAssetMapper2("TAX_LOTS_SHORT_TERM_16", 472, C20690R.drawable.ic_rds_tax_lots_short_term_16dp);
    public static final ServerToBentoAssetMapper2 TECHNOLOGY_12 = new ServerToBentoAssetMapper2("TECHNOLOGY_12", 473, C20690R.drawable.ic_rds_technology_12dp);
    public static final ServerToBentoAssetMapper2 TECHNOLOGY_24 = new ServerToBentoAssetMapper2("TECHNOLOGY_24", 474, C20690R.drawable.ic_rds_technology_24dp);
    public static final ServerToBentoAssetMapper2 THUMBPRINT_16 = new ServerToBentoAssetMapper2("THUMBPRINT_16", 475, C20690R.drawable.ic_rds_thumbprint_16dp);
    public static final ServerToBentoAssetMapper2 THUMBPRINT_24 = new ServerToBentoAssetMapper2("THUMBPRINT_24", 476, C20690R.drawable.ic_rds_thumbprint_24dp);
    public static final ServerToBentoAssetMapper2 THUMBS_DOWN_16 = new ServerToBentoAssetMapper2("THUMBS_DOWN_16", 477, C20690R.drawable.ic_rds_thumbs_down_16dp);
    public static final ServerToBentoAssetMapper2 THUMBS_DOWN_24 = new ServerToBentoAssetMapper2("THUMBS_DOWN_24", 478, C20690R.drawable.ic_rds_thumbs_down_24dp);
    public static final ServerToBentoAssetMapper2 THUMBS_UP_16 = new ServerToBentoAssetMapper2("THUMBS_UP_16", 479, C20690R.drawable.ic_rds_thumbs_up_16dp);
    public static final ServerToBentoAssetMapper2 THUMBS_UP_24 = new ServerToBentoAssetMapper2("THUMBS_UP_24", 480, C20690R.drawable.ic_rds_thumbs_up_24dp);
    public static final ServerToBentoAssetMapper2 TICKET_16 = new ServerToBentoAssetMapper2("TICKET_16", 481, C20690R.drawable.ic_rds_ticket_16dp);
    public static final ServerToBentoAssetMapper2 TICKET_24 = new ServerToBentoAssetMapper2("TICKET_24", 482, C20690R.drawable.ic_rds_ticket_24dp);
    public static final ServerToBentoAssetMapper2 TOUCH_ID_ANDROID_16 = new ServerToBentoAssetMapper2("TOUCH_ID_ANDROID_16", 483, C20690R.drawable.ic_rds_touch_id_android_16dp);
    public static final ServerToBentoAssetMapper2 TOUCH_ID_ANDROID_24 = new ServerToBentoAssetMapper2("TOUCH_ID_ANDROID_24", 484, C20690R.drawable.ic_rds_touch_id_android_24dp);
    public static final ServerToBentoAssetMapper2 TRADE_SOCIAL_FILLED_20 = new ServerToBentoAssetMapper2("TRADE_SOCIAL_FILLED_20", 485, C20690R.drawable.ic_rds_trade_social_filled_20dp);
    public static final ServerToBentoAssetMapper2 TRADE_SOCIAL_OUTLINE_20 = new ServerToBentoAssetMapper2("TRADE_SOCIAL_OUTLINE_20", 486, C20690R.drawable.ic_rds_trade_social_outline_20dp);
    public static final ServerToBentoAssetMapper2 TRANSFERS_12 = new ServerToBentoAssetMapper2("TRANSFERS_12", 487, C20690R.drawable.ic_rds_transfers_12dp);
    public static final ServerToBentoAssetMapper2 TRANSFERS_16 = new ServerToBentoAssetMapper2("TRANSFERS_16", 488, C20690R.drawable.ic_rds_transfers_16dp);
    public static final ServerToBentoAssetMapper2 TRANSFERS_24 = new ServerToBentoAssetMapper2("TRANSFERS_24", 489, C20690R.drawable.ic_rds_transfers_24dp);
    public static final ServerToBentoAssetMapper2 TRANSPORT_24 = new ServerToBentoAssetMapper2("TRANSPORT_24", 490, C20690R.drawable.ic_rds_transport_24dp);
    public static final ServerToBentoAssetMapper2 TRASH_12 = new ServerToBentoAssetMapper2("TRASH_12", 491, C20690R.drawable.ic_rds_trash_12dp);
    public static final ServerToBentoAssetMapper2 TRASH_16 = new ServerToBentoAssetMapper2("TRASH_16", 492, C20690R.drawable.ic_rds_trash_16dp);
    public static final ServerToBentoAssetMapper2 TRASH_24 = new ServerToBentoAssetMapper2("TRASH_24", 493, C20690R.drawable.ic_rds_trash_24dp);
    public static final ServerToBentoAssetMapper2 TRIANGLE_ALERT_16 = new ServerToBentoAssetMapper2("TRIANGLE_ALERT_16", 494, C20690R.drawable.ic_rds_triangle_alert_16dp);
    public static final ServerToBentoAssetMapper2 TRIANGLE_ALERT_24 = new ServerToBentoAssetMapper2("TRIANGLE_ALERT_24", 495, C20690R.drawable.ic_rds_triangle_alert_24dp);
    public static final ServerToBentoAssetMapper2 TUNER_16 = new ServerToBentoAssetMapper2("TUNER_16", 496, C20690R.drawable.ic_rds_tuner_16dp);
    public static final ServerToBentoAssetMapper2 TUNER_24 = new ServerToBentoAssetMapper2("TUNER_24", 497, C20690R.drawable.ic_rds_tuner_24dp);
    public static final ServerToBentoAssetMapper2 UNLOCK_12 = new ServerToBentoAssetMapper2("UNLOCK_12", 498, C20690R.drawable.ic_rds_unlock_12dp);
    public static final ServerToBentoAssetMapper2 UNLOCK_16 = new ServerToBentoAssetMapper2("UNLOCK_16", 499, C20690R.drawable.ic_rds_unlock_16dp);
    public static final ServerToBentoAssetMapper2 UNLOCK_24 = new ServerToBentoAssetMapper2("UNLOCK_24", 500, C20690R.drawable.ic_rds_unlock_24dp);
    public static final ServerToBentoAssetMapper2 UPLOAD_24 = new ServerToBentoAssetMapper2("UPLOAD_24", 501, C20690R.drawable.ic_rds_upload_24dp);
    public static final ServerToBentoAssetMapper2 VIDEO_CALL_12 = new ServerToBentoAssetMapper2("VIDEO_CALL_12", com.withpersona.sdk2.inquiry.network.core.HttpStatusCode.BAD_GATEWAY_502, C20690R.drawable.ic_rds_video_call_12dp);
    public static final ServerToBentoAssetMapper2 VIDEO_CALL_16 = new ServerToBentoAssetMapper2("VIDEO_CALL_16", 503, C20690R.drawable.ic_rds_video_call_16dp);
    public static final ServerToBentoAssetMapper2 VIDEO_CALL_24 = new ServerToBentoAssetMapper2("VIDEO_CALL_24", 504, C20690R.drawable.ic_rds_video_call_24dp);
    public static final ServerToBentoAssetMapper2 VIDEO_FAST_FORWARD_24 = new ServerToBentoAssetMapper2("VIDEO_FAST_FORWARD_24", 505, C20690R.drawable.ic_rds_video_fast_forward_24dp);
    public static final ServerToBentoAssetMapper2 VIDEO_REPLAY_24 = new ServerToBentoAssetMapper2("VIDEO_REPLAY_24", 506, C20690R.drawable.ic_rds_video_replay_24dp);
    public static final ServerToBentoAssetMapper2 VIDEO_REWIND_15_32 = new ServerToBentoAssetMapper2("VIDEO_REWIND_15_32", 507, C20690R.drawable.ic_rds_video_rewind_15_32dp);
    public static final ServerToBentoAssetMapper2 VIDEO_REWIND_24 = new ServerToBentoAssetMapper2("VIDEO_REWIND_24", 508, C20690R.drawable.ic_rds_video_rewind_24dp);
    public static final ServerToBentoAssetMapper2 VIDEO_SKIP_15_32 = new ServerToBentoAssetMapper2("VIDEO_SKIP_15_32", 509, C20690R.drawable.ic_rds_video_skip_15_32dp);
    public static final ServerToBentoAssetMapper2 WALLET_24 = new ServerToBentoAssetMapper2("WALLET_24", 510, C20690R.drawable.ic_rds_wallet_24dp);
    public static final ServerToBentoAssetMapper2 WALLET_32 = new ServerToBentoAssetMapper2("WALLET_32", 511, C20690R.drawable.ic_rds_wallet_32dp);
    public static final ServerToBentoAssetMapper2 WALLETCONNECT_16 = new ServerToBentoAssetMapper2("WALLETCONNECT_16", 512, C20690R.drawable.ic_rds_walletconnect_16dp);
    public static final ServerToBentoAssetMapper2 WALLETCONNECT_24 = new ServerToBentoAssetMapper2("WALLETCONNECT_24", 513, C20690R.drawable.ic_rds_walletconnect_24dp);
    public static final ServerToBentoAssetMapper2 WC_SCAN_24 = new ServerToBentoAssetMapper2("WC_SCAN_24", 514, C20690R.drawable.ic_rds_wc_scan_24dp);
    public static final ServerToBentoAssetMapper2 WITHDRAW_16 = new ServerToBentoAssetMapper2("WITHDRAW_16", 515, C20690R.drawable.ic_rds_withdraw_16dp);
    public static final ServerToBentoAssetMapper2 WITHDRAW_24 = new ServerToBentoAssetMapper2("WITHDRAW_24", WaitlistAnimationConstants.RIGHT_YAW_END, C20690R.drawable.ic_rds_withdraw_24dp);
    public static final ServerToBentoAssetMapper2 ZOOM_IN_24 = new ServerToBentoAssetMapper2("ZOOM_IN_24", 517, C20690R.drawable.ic_rds_zoom_in_24dp);
    public static final ServerToBentoAssetMapper2 ZOOM_OUT_24 = new ServerToBentoAssetMapper2("ZOOM_OUT_24", 518, C20690R.drawable.ic_rds_zoom_out_24dp);

    private static final /* synthetic */ ServerToBentoAssetMapper2[] $values() {
        return new ServerToBentoAssetMapper2[]{UNKNOWN, ACCOUNT_SUMMARY_12, ACCOUNT_SUMMARY_24, ACTION_REMOVE_24, ACTIONS_ALERTS_32, ACTIONS_ATM_32, ACTIONS_CHECK_32, ACTIONS_STATEMENTS_32, ACTIONS_TRANSFERS_32, AGENT_16, AGENT_24, ALERT_12, ALERT_16, ALERT_24, ALERT_FILLED_12, ALERT_FILLED_16, ALERT_FILLED_24, ALL_DAY_TRADING_12, ALL_DAY_TRADING_16, ALL_DAY_TRADING_24, ANNOUNCEMENT_12, ANNOUNCEMENT_16, ANNOUNCEMENT_24, ARCHIVE_24, ARROW_DIAGONAL_UP_16, ARROW_DOWN_12, ARROW_DOWN_16, ARROW_DOWN_24, ARROW_DOWN_FILL_12, ARROW_DOWN_FILL_16, ARROW_DOWN_FILL_24, ARROW_DOWN_RIGHT_12, ARROW_LEFT_12, ARROW_LEFT_16, ARROW_LEFT_24, ARROW_LEFT_FILL_12, ARROW_LEFT_FILL_16, ARROW_LEFT_FILL_24, ARROW_RIGHT_12, ARROW_RIGHT_16, ARROW_RIGHT_24, ARROW_RIGHT_FILL_12, ARROW_RIGHT_FILL_16, ARROW_RIGHT_FILL_24, ARROW_UP_12, ARROW_UP_16, ARROW_UP_24, ARROW_UP_FILL_12, ARROW_UP_FILL_16, ARROW_UP_FILL_24, ARROW_UP_RIGHT_12, ARROW_UP_RIGHT_16, ATTACH_24, BACKSPACE_24, BACKSPACE_32, BANKING_16, BANKING_24, BANKING_32, BAR_CHART_16, BAR_CHART_24, BOOKMARK_POST_FILLED_16, BOOKMARK_POST_OUTLINE_16, BUBBLE_CHECKED_12, BUBBLE_CHECKED_16, BUBBLE_CHECKED_24, BUBBLE_DOT_24, BUBBLE_EMPTY_24, BUBBLE_MINUS_16, BUBBLE_MINUS_24, BUBBLE_PAUSE_24, BUBBLE_PLUS_16, BUBBLE_PLUS_24, BUBBLE_PLUS_FILLED_24, BUBBLE_RADIO_BUTTON_24, BUBBLE_REMOVE_16, BUBBLE_REMOVE_24, BUBBLE_REMOVE_FILLED_16, BUBBLE_REMOVE_FILLED_24, BUBBLE_REVERSE_24, BUBBLE_UK_POUNDS_16, BUBBLE_UK_POUNDS_24, BUBBLE_UK_POUNDS_FILLED_16, BUBBLE_UK_POUNDS_FILLED_24, BUILDER_16, BUILDER_24, CALENDAR_12, CALENDAR_16, CALENDAR_24, CAMERA_16, CAMERA_24, CARET_DOWN_12, CARET_DOWN_16, CARET_DOWN_24, CARET_LEFT_12, CARET_LEFT_16, CARET_LEFT_24, CARET_RIGHT_12, CARET_RIGHT_16, CARET_RIGHT_24, CARET_UP_12, CARET_UP_16, CARET_UP_24, CASH_24, CHART_16, CHART_24, CHART_BAR_24, CHART_CANDLESTICKS_16, CHART_CANDLESTICKS_24, CHART_LINE_16, CHART_LINE_24, CHART_STACKED_BAR_16, CHAT_16, CHAT_24, CHATBOT_16, CHATBOT_24, CHECKBOX_EMPTY_16, CHECKBOX_EMPTY_24, CHECKBOX_FILLED_16, CHECKBOX_FILLED_24, CHECKMARK_12, CHECKMARK_16, CHECKMARK_24, CLIPBOARD_16, CLIPBOARD_24, CLOCK_12, CLOCK_16, CLOCK_24, CLOSE_12, CLOSE_16, CLOSE_24, CLOUD_16, CLOUD_24, COLLAPSE_16, COLLAPSE_24, COMMENT_FILLED_16, COMMENT_FILLED_20, COMMENT_OUTLINE_16, COMMENT_OUTLINE_20, CONSUMER_GOODS_12, CONSUMER_GOODS_16, CONSUMER_GOODS_24, CONTROLS_16, CONTROLS_24, CONVERSATION_16, CONVERSATION_24, CONVERT_24, COPY_12, COPY_16, COPY_24, COPY_TRADE_FILLED_16, COPY_TRADE_OUTLINE_16, CORN_FUTURES_24, CORPORATE_16, CORPORATE_24, CORTEX_12, CORTEX_16, CORTEX_24, CRYPTO_12, CRYPTO_16, CRYPTO_24, CRYPTO_C_12, CRYPTO_C_16, CRYPTO_C_24, CUSTODIAL_16, CUSTODIAL_24, DEPOSIT_16, DEPOSIT_24, DINING_24, DISCLOSURES_16, DISCLOSURES_24, DIVIDEND_16, DIVIDEND_24, DOCUMENTS_24, DOLLAR_SIGN_12, DOLLAR_SIGN_16, DOLLAR_SIGN_24, DOT_12, DOT_16, DOT_24, DOTS_16, DOTS_24, DOTS_ANDROID_16, DOTS_ANDROID_24, DOWNLOAD_12, DOWNLOAD_16, DOWNLOAD_24, DRAG_12, DRAG_16, DRAG_24, DROPDOWN_12, DROPDOWN_16, DROPDOWN_24, ECONOMIC_MOAT_24, EDIT_12, EDIT_16, EDIT_24, EDIT_SURFACE_24, EMAIL_FILLED_16, EMAIL_FILLED_24, EMAIL_OUTLINE_24, ENERGY_12, ENERGY_24, ENTERTAINMENT_24, ETF_12, ETF_24, EURO_SIGN_12, EURO_SIGN_16, EURO_SIGN_24, EXCLAMATION_12, EXCLAMATION_16, EXCLAMATION_24, EXPAND_16, EXPAND_24, EYE_16, EYE_24, EYE_CLOSED_16, EYE_CLOSED_24, FACE_ID_ANDROID_16, FACE_ID_ANDROID_24, FACE_ID_IOS_16, FACE_ID_IOS_24, FAIR_VALUE_24, FEATURED_16, FEATURED_24, FILTER_12, FILTER_16, FILTER_24, FINANCE_12, FINANCE_16, FINANCE_24, FLASH_OFF_24, FLASH_ON_24, FLASHLIGHT_OFF_24, FLASHLIGHT_ON_24, FLOWER_16, FOLDER_16, FOLDER_24, FULLSCREEN_ENTER_24, FULLSCREEN_EXIT_24, GIFT_12, GIFT_16, GIFT_24, GOLD_16, GOLD_24, GROCERIES_24, HAMBURGER_12, HAMBURGER_16, HAMBURGER_24, HEALTHCARE_12, HEALTHCARE_24, HELP_24, HISTORY_16, HISTORY_24, HOME_24, HOSPITALITY_12, HOSPITALITY_24, HOURGLASS_12, HOURGLASS_16, HOURGLASS_24, ICLOUD_RESTORE_16, ICLOUD_RESTORE_24, IMAGE_16, IMAGE_24, IMAGE_FAIL_16, IMAGE_FAIL_24, INFO_12, INFO_16, INFO_24, INFO_FILLED_12, INFO_FILLED_16, INFO_FILLED_24, ISA_16, ISA_24, JOINT_ACCOUNT_12, JOINT_ACCOUNT_16, JOINT_ACCOUNT_24, L2_HEADER_ARROW_24, LIGHTBULB_16, LIGHTBULB_24, LIGHTNING_12, LIGHTNING_16, LIGHTNING_24, LIGHTNING_OFF_16, LIKE_POST_FILLED_16, LIKE_POST_FILLED_20, LIKE_POST_OUTLINE_16, LIKE_POST_OUTLINE_20, LIKE_POST_OUTLINE_24, LINK_16, LINK_24, LINK_OUT_12, LINK_OUT_16, LINK_OUT_24, LIST_24, LOCATION_FILL_16, LOCATION_FILL_24, LOCATION_OUTLINE_24, LOCK_12, LOCK_16, LOCK_24, LOG_OUT_24, MANAGED_ACCOUNTS_16, MANAGED_ACCOUNTS_24, MANAGED_INDIVIDUAL_24, MANAGED_JOINT_24, MANAGED_RETIREMENT_24, MANUFACTURING_12, MANUFACTURING_24, MAPS_24, MARGIN_12, MARGIN_16, MARGIN_24, MAXIMUM_16, MESSAGE_SEND_16, MESSAGE_SEND_24, MINIMUM_16, MINUS_12, MINUS_16, MINUS_24, MORE_MENU_16, MORE_MENU_20, NEWS_16, NEWS_24, NO_VALUE_24, NO_VALUE_32, NOTIFICATION_12, NOTIFICATION_16, NOTIFICATION_24, NOTIFICATION_32, NOTIFICATION_ADD_16, NOTIFICATION_ADD_24, NOTIFICATION_CHECK_16, NOTIFICATION_CHECK_24, NUMPAD_DOWN_24, NUMPAD_UP_24, ONLINE_16, ONLINE_24, OPTIONS_DOWN_24, OPTIONS_FLAT_24, OPTIONS_UP_24, OPTIONS_VOLATILE_24, ORDER_16, ORDER_24, PAUSE_HERO_40, PAUSE_INLINE_24, PAYCHECK_24, PAYMENT_12, PAYMENT_16, PAYMENT_24, PAYMENT_32, PERCENT_SIGN_12, PERCENT_SIGN_16, PERCENT_SIGN_24, PERPETUAL_FUTURES_32, PERSON_12, PERSON_16, PERSON_24, PHONE_16, PHONE_24, PHONE_CONNECTED_16, PHONE_MISSED_CALL_16, PHONE_WAITING_16, PICTURE_IN_PICTURE_24, PIE_CHART_16, PIE_CHART_24, PIN_16, PIN_24, PLAY_HERO_40, PLAY_INLINE_16, PLAY_INLINE_24, PLUS_12, PLUS_16, PLUS_24, POP_OUT_16, POP_OUT_24, PRINT_24, QR_16, QR_24, QR_SCAN_24, QUANTITY_16, QUANTITY_24, QUESTION_12, QUESTION_16, QUESTION_24, QUESTION_FILLED_12, QUESTION_FILLED_16, QUESTION_FILLED_24, RECURRING_12, RECURRING_16, RECURRING_24, RECURRING_HUB_24, REPEAT_16, REPLAY_HERO_40, RESEND_16, RESEND_24, RETIREMENT_12, RETIREMENT_16, RETIREMENT_24, RETIREMENT_32, RHW_BROWSER_TAB_24, RHW_CHART_TAB_24, RHW_SEARCH_TAB_24, RISK_AND_UNCERTAINTY_24, ROBINHOOD_12, ROBINHOOD_16, ROBINHOOD_24, ROLLING_POSITION_12, ROLLING_POSITION_16, ROLLING_POSITION_24, SCAN_16, SCAN_24, SEARCH_16, SEARCH_24, SETTINGS_12, SETTINGS_16, SETTINGS_24, SHARE_ANDROID_16, SHARE_ANDROID_24, SHARE_IOS_16, SHARE_IOS_24, SMILEY_24, SOCIAL_CREATE_POST_16, SORT_12, SOUND_OFF_24, SOUND_ON_24, SPARKLE_BULLET_12, SPARKLE_BULLET_16, SPARKLE_BULLET_24, SPARKLE_DOUBLE_16, SPARKLE_DOUBLE_24, SPEED_DOWN_24, SPEED_UP_24, STAR_FILLED_12, STAR_FILLED_16, STAR_FILLED_24, STAR_OUTLINE_16, STAR_OUTLINE_24, STAR_PASSWORD_16, STEWARDSHIP_24, STOCK_DOWN_12, STOCK_DOWN_16, STOCK_DOWN_24, STOCK_UP_12, STOCK_UP_16, STOCK_UP_24, STOPWATCH_16, STOPWATCH_24, STOPWATCH_32, STRATEGY_OUTLOOK_24, SWIPE_DOWN_16, SWIPE_DOWN_24, SWIPE_UP_16, SWIPE_UP_24, SWITCH_12, SWITCH_16, SWITCH_24, TAB_ACCOUNT_32, TAB_CONTENT_32, TAB_CRYPTO_32, TAB_CRYPTO_C_32, TAB_GOLD_32, TAB_INVEST_32, TAB_ISA_32, TAB_MESSAGES_32, TAB_MONEY_32, TAB_RETIREMENT_32, TAB_SEARCH_32, TAB_SOCIAL_32, TAB_WATCHLIST_32, TAG_16, TAG_24, TAX_LOTS_LONG_TERM_16, TAX_LOTS_SHORT_TERM_16, TECHNOLOGY_12, TECHNOLOGY_24, THUMBPRINT_16, THUMBPRINT_24, THUMBS_DOWN_16, THUMBS_DOWN_24, THUMBS_UP_16, THUMBS_UP_24, TICKET_16, TICKET_24, TOUCH_ID_ANDROID_16, TOUCH_ID_ANDROID_24, TRADE_SOCIAL_FILLED_20, TRADE_SOCIAL_OUTLINE_20, TRANSFERS_12, TRANSFERS_16, TRANSFERS_24, TRANSPORT_24, TRASH_12, TRASH_16, TRASH_24, TRIANGLE_ALERT_16, TRIANGLE_ALERT_24, TUNER_16, TUNER_24, UNLOCK_12, UNLOCK_16, UNLOCK_24, UPLOAD_24, VIDEO_CALL_12, VIDEO_CALL_16, VIDEO_CALL_24, VIDEO_FAST_FORWARD_24, VIDEO_REPLAY_24, VIDEO_REWIND_15_32, VIDEO_REWIND_24, VIDEO_SKIP_15_32, WALLET_24, WALLET_32, WALLETCONNECT_16, WALLETCONNECT_24, WC_SCAN_24, WITHDRAW_16, WITHDRAW_24, ZOOM_IN_24, ZOOM_OUT_24};
    }

    @JvmStatic
    public static ServerToBentoAssetMapper2 fromServerValue(String str) {
        return INSTANCE.fromServerValue(str);
    }

    public static EnumEntries<ServerToBentoAssetMapper2> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    public static String toServerValue(ServerToBentoAssetMapper2 serverToBentoAssetMapper2) {
        return INSTANCE.toServerValue(serverToBentoAssetMapper2);
    }

    private ServerToBentoAssetMapper2(String str, int i, int i2) {
        this.resourceId = i2;
    }

    public final int getResourceId() {
        return this.resourceId;
    }

    static {
        ServerToBentoAssetMapper2[] serverToBentoAssetMapper2Arr$values = $values();
        $VALUES = serverToBentoAssetMapper2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(serverToBentoAssetMapper2Arr$values);
        INSTANCE = new Companion(null);
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        String lowerCase = name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    /* compiled from: ServerToBentoAssetMapper.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0017J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000b\u001a\u00020\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/IconAsset$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Defaulted;", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "<init>", "()V", "toServerValue", "", "enumValue", "fromServerValue", "serverValue", "fromResourceInt", "drawableRes", "", "lib-design-system-res_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.IconAsset$Companion, reason: from kotlin metadata */
    public static final class Companion extends RhEnum.Converter.Defaulted<ServerToBentoAssetMapper2> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super((Enum[]) ServerToBentoAssetMapper2.getEntries().toArray(new ServerToBentoAssetMapper2[0]), ServerToBentoAssetMapper2.UNKNOWN, false, 4, null);
        }

        @Override // com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public String toServerValue(ServerToBentoAssetMapper2 enumValue) {
            return super.toServerValue((Enum) enumValue);
        }

        @Override // com.robinhood.enums.RhEnum.Converter.Defaulted, com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public ServerToBentoAssetMapper2 fromServerValue(String serverValue) {
            return (ServerToBentoAssetMapper2) super.fromServerValue(serverValue);
        }

        public final ServerToBentoAssetMapper2 fromResourceInt(int drawableRes) {
            ServerToBentoAssetMapper2 next;
            Iterator<ServerToBentoAssetMapper2> it = ServerToBentoAssetMapper2.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.getResourceId() == drawableRes) {
                    break;
                }
            }
            return next;
        }
    }

    public static ServerToBentoAssetMapper2 valueOf(String str) {
        return (ServerToBentoAssetMapper2) Enum.valueOf(ServerToBentoAssetMapper2.class, str);
    }

    public static ServerToBentoAssetMapper2[] values() {
        return (ServerToBentoAssetMapper2[]) $VALUES.clone();
    }
}
