package rh_server_driven_ui.p531v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equities.companyfinancials.p116ui.CompanyFinancialsSection;
import com.robinhood.android.waitlist.spot.WaitlistAnimationConstants;
import com.robinhood.utils.http.HttpStatusCode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Icon.kt */
@Metadata(m3635d1 = {"\u0000\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0003\b\u008d\u0004\b\u0086\u0081\u0002\u0018\u0000 \u0090\u00042\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0002\u0090\u0004B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001j\u0003\b\u0098\u0001j\u0003\b\u0099\u0001j\u0003\b\u009a\u0001j\u0003\b\u009b\u0001j\u0003\b\u009c\u0001j\u0003\b\u009d\u0001j\u0003\b\u009e\u0001j\u0003\b\u009f\u0001j\u0003\b \u0001j\u0003\b¡\u0001j\u0003\b¢\u0001j\u0003\b£\u0001j\u0003\b¤\u0001j\u0003\b¥\u0001j\u0003\b¦\u0001j\u0003\b§\u0001j\u0003\b¨\u0001j\u0003\b©\u0001j\u0003\bª\u0001j\u0003\b«\u0001j\u0003\b¬\u0001j\u0003\b\u00ad\u0001j\u0003\b®\u0001j\u0003\b¯\u0001j\u0003\b°\u0001j\u0003\b±\u0001j\u0003\b²\u0001j\u0003\b³\u0001j\u0003\b´\u0001j\u0003\bµ\u0001j\u0003\b¶\u0001j\u0003\b·\u0001j\u0003\b¸\u0001j\u0003\b¹\u0001j\u0003\bº\u0001j\u0003\b»\u0001j\u0003\b¼\u0001j\u0003\b½\u0001j\u0003\b¾\u0001j\u0003\b¿\u0001j\u0003\bÀ\u0001j\u0003\bÁ\u0001j\u0003\bÂ\u0001j\u0003\bÃ\u0001j\u0003\bÄ\u0001j\u0003\bÅ\u0001j\u0003\bÆ\u0001j\u0003\bÇ\u0001j\u0003\bÈ\u0001j\u0003\bÉ\u0001j\u0003\bÊ\u0001j\u0003\bË\u0001j\u0003\bÌ\u0001j\u0003\bÍ\u0001j\u0003\bÎ\u0001j\u0003\bÏ\u0001j\u0003\bÐ\u0001j\u0003\bÑ\u0001j\u0003\bÒ\u0001j\u0003\bÓ\u0001j\u0003\bÔ\u0001j\u0003\bÕ\u0001j\u0003\bÖ\u0001j\u0003\b×\u0001j\u0003\bØ\u0001j\u0003\bÙ\u0001j\u0003\bÚ\u0001j\u0003\bÛ\u0001j\u0003\bÜ\u0001j\u0003\bÝ\u0001j\u0003\bÞ\u0001j\u0003\bß\u0001j\u0003\bà\u0001j\u0003\bá\u0001j\u0003\bâ\u0001j\u0003\bã\u0001j\u0003\bä\u0001j\u0003\bå\u0001j\u0003\bæ\u0001j\u0003\bç\u0001j\u0003\bè\u0001j\u0003\bé\u0001j\u0003\bê\u0001j\u0003\bë\u0001j\u0003\bì\u0001j\u0003\bí\u0001j\u0003\bî\u0001j\u0003\bï\u0001j\u0003\bð\u0001j\u0003\bñ\u0001j\u0003\bò\u0001j\u0003\bó\u0001j\u0003\bô\u0001j\u0003\bõ\u0001j\u0003\bö\u0001j\u0003\b÷\u0001j\u0003\bø\u0001j\u0003\bù\u0001j\u0003\bú\u0001j\u0003\bû\u0001j\u0003\bü\u0001j\u0003\bý\u0001j\u0003\bþ\u0001j\u0003\bÿ\u0001j\u0003\b\u0080\u0002j\u0003\b\u0081\u0002j\u0003\b\u0082\u0002j\u0003\b\u0083\u0002j\u0003\b\u0084\u0002j\u0003\b\u0085\u0002j\u0003\b\u0086\u0002j\u0003\b\u0087\u0002j\u0003\b\u0088\u0002j\u0003\b\u0089\u0002j\u0003\b\u008a\u0002j\u0003\b\u008b\u0002j\u0003\b\u008c\u0002j\u0003\b\u008d\u0002j\u0003\b\u008e\u0002j\u0003\b\u008f\u0002j\u0003\b\u0090\u0002j\u0003\b\u0091\u0002j\u0003\b\u0092\u0002j\u0003\b\u0093\u0002j\u0003\b\u0094\u0002j\u0003\b\u0095\u0002j\u0003\b\u0096\u0002j\u0003\b\u0097\u0002j\u0003\b\u0098\u0002j\u0003\b\u0099\u0002j\u0003\b\u009a\u0002j\u0003\b\u009b\u0002j\u0003\b\u009c\u0002j\u0003\b\u009d\u0002j\u0003\b\u009e\u0002j\u0003\b\u009f\u0002j\u0003\b \u0002j\u0003\b¡\u0002j\u0003\b¢\u0002j\u0003\b£\u0002j\u0003\b¤\u0002j\u0003\b¥\u0002j\u0003\b¦\u0002j\u0003\b§\u0002j\u0003\b¨\u0002j\u0003\b©\u0002j\u0003\bª\u0002j\u0003\b«\u0002j\u0003\b¬\u0002j\u0003\b\u00ad\u0002j\u0003\b®\u0002j\u0003\b¯\u0002j\u0003\b°\u0002j\u0003\b±\u0002j\u0003\b²\u0002j\u0003\b³\u0002j\u0003\b´\u0002j\u0003\bµ\u0002j\u0003\b¶\u0002j\u0003\b·\u0002j\u0003\b¸\u0002j\u0003\b¹\u0002j\u0003\bº\u0002j\u0003\b»\u0002j\u0003\b¼\u0002j\u0003\b½\u0002j\u0003\b¾\u0002j\u0003\b¿\u0002j\u0003\bÀ\u0002j\u0003\bÁ\u0002j\u0003\bÂ\u0002j\u0003\bÃ\u0002j\u0003\bÄ\u0002j\u0003\bÅ\u0002j\u0003\bÆ\u0002j\u0003\bÇ\u0002j\u0003\bÈ\u0002j\u0003\bÉ\u0002j\u0003\bÊ\u0002j\u0003\bË\u0002j\u0003\bÌ\u0002j\u0003\bÍ\u0002j\u0003\bÎ\u0002j\u0003\bÏ\u0002j\u0003\bÐ\u0002j\u0003\bÑ\u0002j\u0003\bÒ\u0002j\u0003\bÓ\u0002j\u0003\bÔ\u0002j\u0003\bÕ\u0002j\u0003\bÖ\u0002j\u0003\b×\u0002j\u0003\bØ\u0002j\u0003\bÙ\u0002j\u0003\bÚ\u0002j\u0003\bÛ\u0002j\u0003\bÜ\u0002j\u0003\bÝ\u0002j\u0003\bÞ\u0002j\u0003\bß\u0002j\u0003\bà\u0002j\u0003\bá\u0002j\u0003\bâ\u0002j\u0003\bã\u0002j\u0003\bä\u0002j\u0003\bå\u0002j\u0003\bæ\u0002j\u0003\bç\u0002j\u0003\bè\u0002j\u0003\bé\u0002j\u0003\bê\u0002j\u0003\bë\u0002j\u0003\bì\u0002j\u0003\bí\u0002j\u0003\bî\u0002j\u0003\bï\u0002j\u0003\bð\u0002j\u0003\bñ\u0002j\u0003\bò\u0002j\u0003\bó\u0002j\u0003\bô\u0002j\u0003\bõ\u0002j\u0003\bö\u0002j\u0003\b÷\u0002j\u0003\bø\u0002j\u0003\bù\u0002j\u0003\bú\u0002j\u0003\bû\u0002j\u0003\bü\u0002j\u0003\bý\u0002j\u0003\bþ\u0002j\u0003\bÿ\u0002j\u0003\b\u0080\u0003j\u0003\b\u0081\u0003j\u0003\b\u0082\u0003j\u0003\b\u0083\u0003j\u0003\b\u0084\u0003j\u0003\b\u0085\u0003j\u0003\b\u0086\u0003j\u0003\b\u0087\u0003j\u0003\b\u0088\u0003j\u0003\b\u0089\u0003j\u0003\b\u008a\u0003j\u0003\b\u008b\u0003j\u0003\b\u008c\u0003j\u0003\b\u008d\u0003j\u0003\b\u008e\u0003j\u0003\b\u008f\u0003j\u0003\b\u0090\u0003j\u0003\b\u0091\u0003j\u0003\b\u0092\u0003j\u0003\b\u0093\u0003j\u0003\b\u0094\u0003j\u0003\b\u0095\u0003j\u0003\b\u0096\u0003j\u0003\b\u0097\u0003j\u0003\b\u0098\u0003j\u0003\b\u0099\u0003j\u0003\b\u009a\u0003j\u0003\b\u009b\u0003j\u0003\b\u009c\u0003j\u0003\b\u009d\u0003j\u0003\b\u009e\u0003j\u0003\b\u009f\u0003j\u0003\b \u0003j\u0003\b¡\u0003j\u0003\b¢\u0003j\u0003\b£\u0003j\u0003\b¤\u0003j\u0003\b¥\u0003j\u0003\b¦\u0003j\u0003\b§\u0003j\u0003\b¨\u0003j\u0003\b©\u0003j\u0003\bª\u0003j\u0003\b«\u0003j\u0003\b¬\u0003j\u0003\b\u00ad\u0003j\u0003\b®\u0003j\u0003\b¯\u0003j\u0003\b°\u0003j\u0003\b±\u0003j\u0003\b²\u0003j\u0003\b³\u0003j\u0003\b´\u0003j\u0003\bµ\u0003j\u0003\b¶\u0003j\u0003\b·\u0003j\u0003\b¸\u0003j\u0003\b¹\u0003j\u0003\bº\u0003j\u0003\b»\u0003j\u0003\b¼\u0003j\u0003\b½\u0003j\u0003\b¾\u0003j\u0003\b¿\u0003j\u0003\bÀ\u0003j\u0003\bÁ\u0003j\u0003\bÂ\u0003j\u0003\bÃ\u0003j\u0003\bÄ\u0003j\u0003\bÅ\u0003j\u0003\bÆ\u0003j\u0003\bÇ\u0003j\u0003\bÈ\u0003j\u0003\bÉ\u0003j\u0003\bÊ\u0003j\u0003\bË\u0003j\u0003\bÌ\u0003j\u0003\bÍ\u0003j\u0003\bÎ\u0003j\u0003\bÏ\u0003j\u0003\bÐ\u0003j\u0003\bÑ\u0003j\u0003\bÒ\u0003j\u0003\bÓ\u0003j\u0003\bÔ\u0003j\u0003\bÕ\u0003j\u0003\bÖ\u0003j\u0003\b×\u0003j\u0003\bØ\u0003j\u0003\bÙ\u0003j\u0003\bÚ\u0003j\u0003\bÛ\u0003j\u0003\bÜ\u0003j\u0003\bÝ\u0003j\u0003\bÞ\u0003j\u0003\bß\u0003j\u0003\bà\u0003j\u0003\bá\u0003j\u0003\bâ\u0003j\u0003\bã\u0003j\u0003\bä\u0003j\u0003\bå\u0003j\u0003\bæ\u0003j\u0003\bç\u0003j\u0003\bè\u0003j\u0003\bé\u0003j\u0003\bê\u0003j\u0003\bë\u0003j\u0003\bì\u0003j\u0003\bí\u0003j\u0003\bî\u0003j\u0003\bï\u0003j\u0003\bð\u0003j\u0003\bñ\u0003j\u0003\bò\u0003j\u0003\bó\u0003j\u0003\bô\u0003j\u0003\bõ\u0003j\u0003\bö\u0003j\u0003\b÷\u0003j\u0003\bø\u0003j\u0003\bù\u0003j\u0003\bú\u0003j\u0003\bû\u0003j\u0003\bü\u0003j\u0003\bý\u0003j\u0003\bþ\u0003j\u0003\bÿ\u0003j\u0003\b\u0080\u0004j\u0003\b\u0081\u0004j\u0003\b\u0082\u0004j\u0003\b\u0083\u0004j\u0003\b\u0084\u0004j\u0003\b\u0085\u0004j\u0003\b\u0086\u0004j\u0003\b\u0087\u0004j\u0003\b\u0088\u0004j\u0003\b\u0089\u0004j\u0003\b\u008a\u0004j\u0003\b\u008b\u0004j\u0003\b\u008c\u0004j\u0003\b\u008d\u0004j\u0003\b\u008e\u0004j\u0003\b\u008f\u0004¨\u0006\u0091\u0004"}, m3636d2 = {"Lrh_server_driven_ui/v1/Icon;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ICON_UNSPECIFIED", "ICON_ACCOUNT_SUMMARY_12", "ICON_ACCOUNT_SUMMARY_24", "ICON_ACTION_REMOVE_24", "ICON_ACTIONS_ALERTS_32", "ICON_ACTIONS_ATM_32", "ICON_ACTIONS_CHECK_32", "ICON_ACTIONS_STATEMENTS_32", "ICON_ACTIONS_TRANSFERS_32", "ICON_AGENT_16", "ICON_AGENT_24", "ICON_ALERT_12", "ICON_ALERT_16", "ICON_ALERT_24", "ICON_ALERT_FILLED_12", "ICON_ALERT_FILLED_16", "ICON_ALERT_FILLED_24", "ICON_ALL_DAY_TRADING_12", "ICON_ALL_DAY_TRADING_16", "ICON_ALL_DAY_TRADING_24", "ICON_ANNOUNCEMENT_12", "ICON_ANNOUNCEMENT_16", "ICON_ANNOUNCEMENT_24", "ICON_ARCHIVE_24", "ICON_ARROW_DIAGONAL_UP_16", "ICON_ARROW_DOWN_12", "ICON_ARROW_DOWN_16", "ICON_ARROW_DOWN_24", "ICON_ARROW_DOWN_FILL_12", "ICON_ARROW_DOWN_FILL_16", "ICON_ARROW_DOWN_FILL_24", "ICON_ARROW_DOWN_RIGHT_12", "ICON_ARROW_LEFT_12", "ICON_ARROW_LEFT_16", "ICON_ARROW_LEFT_24", "ICON_ARROW_LEFT_FILL_12", "ICON_ARROW_LEFT_FILL_16", "ICON_ARROW_LEFT_FILL_24", "ICON_ARROW_RIGHT_12", "ICON_ARROW_RIGHT_16", "ICON_ARROW_RIGHT_24", "ICON_ARROW_RIGHT_FILL_12", "ICON_ARROW_RIGHT_FILL_16", "ICON_ARROW_RIGHT_FILL_24", "ICON_ARROW_UP_12", "ICON_ARROW_UP_16", "ICON_ARROW_UP_24", "ICON_ARROW_UP_FILL_12", "ICON_ARROW_UP_FILL_16", "ICON_ARROW_UP_FILL_24", "ICON_ARROW_UP_RIGHT_12", "ICON_ARROW_UP_RIGHT_16", "ICON_ATTACH_24", "ICON_BACKSPACE_24", "ICON_BACKSPACE_32", "ICON_BANKING_16", "ICON_BANKING_24", "ICON_BANKING_32", "ICON_BAR_CHART_16", "ICON_BAR_CHART_24", "ICON_BOOKMARK_POST_FILLED_16", "ICON_BOOKMARK_POST_OUTLINE_16", "ICON_BUBBLE_CHECKED_12", "ICON_BUBBLE_CHECKED_16", "ICON_BUBBLE_CHECKED_24", "ICON_BUBBLE_DOT_24", "ICON_BUBBLE_EMPTY_24", "ICON_BUBBLE_MINUS_16", "ICON_BUBBLE_MINUS_24", "ICON_BUBBLE_PAUSE_24", "ICON_BUBBLE_PLUS_16", "ICON_BUBBLE_PLUS_24", "ICON_BUBBLE_PLUS_FILLED_24", "ICON_BUBBLE_RADIO_BUTTON_24", "ICON_BUBBLE_REMOVE_16", "ICON_BUBBLE_REMOVE_24", "ICON_BUBBLE_REMOVE_FILLED_16", "ICON_BUBBLE_REMOVE_FILLED_24", "ICON_BUBBLE_REVERSE_24", "ICON_BUBBLE_UK_POUNDS_16", "ICON_BUBBLE_UK_POUNDS_24", "ICON_BUBBLE_UK_POUNDS_FILLED_16", "ICON_BUBBLE_UK_POUNDS_FILLED_24", "ICON_BUILDER_16", "ICON_BUILDER_24", "ICON_CALENDAR_12", "ICON_CALENDAR_16", "ICON_CALENDAR_24", "ICON_CAMERA_16", "ICON_CAMERA_24", "ICON_CARET_DOWN_12", "ICON_CARET_DOWN_16", "ICON_CARET_DOWN_24", "ICON_CARET_LEFT_12", "ICON_CARET_LEFT_16", "ICON_CARET_LEFT_24", "ICON_CARET_RIGHT_12", "ICON_CARET_RIGHT_16", "ICON_CARET_RIGHT_24", "ICON_CARET_UP_12", "ICON_CARET_UP_16", "ICON_CARET_UP_24", "ICON_CASH_24", "ICON_CHART_16", "ICON_CHART_24", "ICON_CHART_BAR_24", "ICON_CHART_CANDLESTICKS_16", "ICON_CHART_CANDLESTICKS_24", "ICON_CHART_LINE_16", "ICON_CHART_LINE_24", "ICON_CHART_STACKED_BAR_16", "ICON_CHAT_16", "ICON_CHAT_24", "ICON_CHATBOT_16", "ICON_CHATBOT_24", "ICON_CHECKBOX_EMPTY_16", "ICON_CHECKBOX_EMPTY_24", "ICON_CHECKBOX_FILLED_16", "ICON_CHECKBOX_FILLED_24", "ICON_CHECKMARK_12", "ICON_CHECKMARK_16", "ICON_CHECKMARK_24", "ICON_CLIPBOARD_16", "ICON_CLIPBOARD_24", "ICON_CLOCK_12", "ICON_CLOCK_16", "ICON_CLOCK_24", "ICON_CLOSE_12", "ICON_CLOSE_16", "ICON_CLOSE_24", "ICON_CLOUD_16", "ICON_CLOUD_24", "ICON_COLLAPSE_16", "ICON_COLLAPSE_24", "ICON_COMMENT_FILLED_16", "ICON_COMMENT_FILLED_20", "ICON_COMMENT_OUTLINE_16", "ICON_COMMENT_OUTLINE_20", "ICON_CONCIERGE_24", "ICON_CONSUMER_GOODS_12", "ICON_CONSUMER_GOODS_16", "ICON_CONSUMER_GOODS_24", "ICON_CONTROLS_16", "ICON_CONTROLS_24", "ICON_CONVERSATION_16", "ICON_CONVERSATION_24", "ICON_CONVERT_24", "ICON_COPY_12", "ICON_COPY_16", "ICON_COPY_24", "ICON_COPY_TRADE_FILLED_16", "ICON_COPY_TRADE_OUTLINE_16", "ICON_CORN_FUTURES_24", "ICON_CORPORATE_16", "ICON_CORPORATE_24", "ICON_CORTEX_12", "ICON_CORTEX_16", "ICON_CORTEX_24", "ICON_CRYPTO_12", "ICON_CRYPTO_16", "ICON_CRYPTO_24", "ICON_CRYPTO_C_12", "ICON_CRYPTO_C_16", "ICON_CRYPTO_C_24", "ICON_CUSTODIAL_16", "ICON_CUSTODIAL_24", "ICON_DEPOSIT_16", "ICON_DEPOSIT_24", "ICON_DINING_24", "ICON_DISCLOSURES_16", "ICON_DISCLOSURES_24", "ICON_DIVIDEND_16", "ICON_DIVIDEND_24", "ICON_DOCUMENTS_24", "ICON_DOLLAR_SIGN_12", "ICON_DOLLAR_SIGN_16", "ICON_DOLLAR_SIGN_24", "ICON_DOT_12", "ICON_DOT_16", "ICON_DOT_24", "ICON_DOTS_16", "ICON_DOTS_24", "ICON_DOTS_ANDROID_16", "ICON_DOTS_ANDROID_24", "ICON_DOWNLOAD_12", "ICON_DOWNLOAD_16", "ICON_DOWNLOAD_24", "ICON_DRAG_12", "ICON_DRAG_16", "ICON_DRAG_24", "ICON_DROPDOWN_12", "ICON_DROPDOWN_16", "ICON_DROPDOWN_24", "ICON_ECONOMIC_MOAT_24", "ICON_EDIT_12", "ICON_EDIT_16", "ICON_EDIT_24", "ICON_EDIT_SURFACE_24", "ICON_EMAIL_FILLED_16", "ICON_EMAIL_FILLED_24", "ICON_EMAIL_OUTLINE_24", "ICON_ENERGY_12", "ICON_ENERGY_24", "ICON_ENTERTAINMENT_24", "ICON_ETF_12", "ICON_ETF_24", "ICON_EURO_SIGN_12", "ICON_EURO_SIGN_16", "ICON_EURO_SIGN_24", "ICON_EXCLAMATION_12", "ICON_EXCLAMATION_16", "ICON_EXCLAMATION_24", "ICON_EXPAND_16", "ICON_EXPAND_24", "ICON_EYE_16", "ICON_EYE_24", "ICON_EYE_CLOSED_16", "ICON_EYE_CLOSED_24", "ICON_FACE_ID_ANDROID_16", "ICON_FACE_ID_ANDROID_24", "ICON_FACE_ID_IOS_16", "ICON_FACE_ID_IOS_24", "ICON_FAIR_VALUE_24", "ICON_FEATURED_16", "ICON_FEATURED_24", "ICON_FILTER_12", "ICON_FILTER_16", "ICON_FILTER_24", "ICON_FINANCE_12", "ICON_FINANCE_16", "ICON_FINANCE_24", "ICON_FLASH_OFF_24", "ICON_FLASH_ON_24", "ICON_FLASHLIGHT_OFF_24", "ICON_FLASHLIGHT_ON_24", "ICON_FLOWER_16", "ICON_FOLDER_16", "ICON_FOLDER_24", "ICON_FULLSCREEN_ENTER_24", "ICON_FULLSCREEN_EXIT_24", "ICON_GIFT_12", "ICON_GIFT_16", "ICON_GIFT_24", "ICON_GOLD_16", "ICON_GOLD_24", "ICON_GROCERIES_24", "ICON_HAMBURGER_12", "ICON_HAMBURGER_16", "ICON_HAMBURGER_24", "ICON_HEALTHCARE_12", "ICON_HEALTHCARE_24", "ICON_HELP_24", "ICON_HISTORY_16", "ICON_HISTORY_24", "ICON_HOME_24", "ICON_HOSPITALITY_12", "ICON_HOSPITALITY_24", "ICON_HOURGLASS_12", "ICON_HOURGLASS_16", "ICON_HOURGLASS_24", "ICON_ICLOUD_RESTORE_16", "ICON_ICLOUD_RESTORE_24", "ICON_IMAGE_16", "ICON_IMAGE_24", "ICON_IMAGE_FAIL_16", "ICON_IMAGE_FAIL_24", "ICON_INFO_12", "ICON_INFO_16", "ICON_INFO_24", "ICON_INFO_FILLED_12", "ICON_INFO_FILLED_16", "ICON_INFO_FILLED_24", "ICON_ISA_16", "ICON_ISA_24", "ICON_JOINT_ACCOUNT_12", "ICON_JOINT_ACCOUNT_16", "ICON_JOINT_ACCOUNT_24", "ICON_L2_HEADER_ARROW_24", "ICON_LIGHTBULB_16", "ICON_LIGHTBULB_24", "ICON_LIGHTNING_12", "ICON_LIGHTNING_16", "ICON_LIGHTNING_24", "ICON_LIGHTNING_OFF_16", "ICON_LIKE_POST_FILLED_16", "ICON_LIKE_POST_FILLED_20", "ICON_LIKE_POST_OUTLINE_16", "ICON_LIKE_POST_OUTLINE_20", "ICON_LIKE_POST_OUTLINE_24", "ICON_LINK_16", "ICON_LINK_24", "ICON_LINK_OUT_12", "ICON_LINK_OUT_16", "ICON_LINK_OUT_24", "ICON_LIST_24", "ICON_LOCATION_FILL_16", "ICON_LOCATION_FILL_24", "ICON_LOCATION_OUTLINE_24", "ICON_LOCK_12", "ICON_LOCK_16", "ICON_LOCK_24", "ICON_LOG_OUT_24", "ICON_MANAGED_ACCOUNTS_16", "ICON_MANAGED_ACCOUNTS_24", "ICON_MANAGED_INDIVIDUAL_24", "ICON_MANAGED_JOINT_24", "ICON_MANAGED_RETIREMENT_24", "ICON_MANUFACTURING_12", "ICON_MANUFACTURING_24", "ICON_MAPS_24", "ICON_MARGIN_12", "ICON_MARGIN_16", "ICON_MARGIN_24", "ICON_MAXIMUM_16", "ICON_MESSAGE_SEND_16", "ICON_MESSAGE_SEND_24", "ICON_MINIMUM_16", "ICON_MINUS_12", "ICON_MINUS_16", "ICON_MINUS_24", "ICON_MORE_MENU_16", "ICON_MORE_MENU_20", "ICON_NEWS_16", "ICON_NEWS_24", "ICON_NO_VALUE_24", "ICON_NO_VALUE_32", "ICON_NOTIFICATION_12", "ICON_NOTIFICATION_16", "ICON_NOTIFICATION_24", "ICON_NOTIFICATION_32", "ICON_NOTIFICATION_ADD_16", "ICON_NOTIFICATION_ADD_24", "ICON_NOTIFICATION_CHECK_16", "ICON_NOTIFICATION_CHECK_24", "ICON_NUMPAD_DOWN_24", "ICON_NUMPAD_UP_24", "ICON_ONLINE_16", "ICON_ONLINE_24", "ICON_OPTIONS_DOWN_24", "ICON_OPTIONS_FLAT_24", "ICON_OPTIONS_UP_24", "ICON_OPTIONS_VOLATILE_24", "ICON_ORDER_16", "ICON_ORDER_24", "ICON_PAUSE_HERO_40", "ICON_PAUSE_INLINE_24", "ICON_PAYCHECK_24", "ICON_PAYMENT_12", "ICON_PAYMENT_16", "ICON_PAYMENT_24", "ICON_PAYMENT_32", "ICON_PERCENT_SIGN_12", "ICON_PERCENT_SIGN_16", "ICON_PERCENT_SIGN_24", "ICON_PERPETUAL_FUTURES_32", "ICON_PERSON_12", "ICON_PERSON_16", "ICON_PERSON_24", "ICON_PHONE_16", "ICON_PHONE_24", "ICON_PHONE_CONNECTED_16", "ICON_PHONE_MISSED_CALL_16", "ICON_PHONE_WAITING_16", "ICON_PICTURE_IN_PICTURE_24", "ICON_PIE_CHART_16", "ICON_PIE_CHART_24", "ICON_PIN_16", "ICON_PIN_24", "ICON_PLAY_HERO_40", "ICON_PLAY_INLINE_16", "ICON_PLAY_INLINE_24", "ICON_PLUS_12", "ICON_PLUS_16", "ICON_PLUS_24", "ICON_POP_OUT_16", "ICON_POP_OUT_24", "ICON_PRINT_24", "ICON_QR_16", "ICON_QR_24", "ICON_QR_SCAN_24", "ICON_QUANTITY_16", "ICON_QUANTITY_24", "ICON_QUESTION_12", "ICON_QUESTION_16", "ICON_QUESTION_24", "ICON_QUESTION_FILLED_12", "ICON_QUESTION_FILLED_16", "ICON_QUESTION_FILLED_24", "ICON_RECURRING_12", "ICON_RECURRING_16", "ICON_RECURRING_24", "ICON_RECURRING_HUB_24", "ICON_REPEAT_16", "ICON_REPLAY_HERO_40", "ICON_RESEND_16", "ICON_RESEND_24", "ICON_RETIREMENT_12", "ICON_RETIREMENT_16", "ICON_RETIREMENT_24", "ICON_RETIREMENT_32", "ICON_RHW_BROWSER_TAB_24", "ICON_RHW_CHART_TAB_24", "ICON_RHW_SEARCH_TAB_24", "ICON_RISK_AND_UNCERTAINTY_24", "ICON_ROBINHOOD_12", "ICON_ROBINHOOD_16", "ICON_ROBINHOOD_24", "ICON_ROLLING_POSITION_12", "ICON_ROLLING_POSITION_16", "ICON_ROLLING_POSITION_24", "ICON_SCAN_16", "ICON_SCAN_24", "ICON_SEARCH_16", "ICON_SEARCH_24", "ICON_SETTINGS_12", "ICON_SETTINGS_16", "ICON_SETTINGS_24", "ICON_SHARE_ANDROID_16", "ICON_SHARE_ANDROID_24", "ICON_SHARE_IOS_16", "ICON_SHARE_IOS_24", "ICON_SMILEY_24", "ICON_SOCIAL_CREATE_POST_16", "ICON_SORT_12", "ICON_SOUND_OFF_24", "ICON_SOUND_ON_24", "ICON_SPARKLE_BULLET_12", "ICON_SPARKLE_BULLET_16", "ICON_SPARKLE_BULLET_24", "ICON_SPARKLE_DOUBLE_16", "ICON_SPARKLE_DOUBLE_24", "ICON_SPEED_DOWN_24", "ICON_SPEED_UP_24", "ICON_STAR_FILLED_12", "ICON_STAR_FILLED_16", "ICON_STAR_FILLED_24", "ICON_STAR_OUTLINE_16", "ICON_STAR_OUTLINE_24", "ICON_STAR_PASSWORD_16", "ICON_STEWARDSHIP_24", "ICON_STOCK_DOWN_12", "ICON_STOCK_DOWN_16", "ICON_STOCK_DOWN_24", "ICON_STOCK_UP_12", "ICON_STOCK_UP_16", "ICON_STOCK_UP_24", "ICON_STOPWATCH_16", "ICON_STOPWATCH_24", "ICON_STOPWATCH_32", "ICON_STRATEGY_OUTLOOK_24", "ICON_SWIPE_DOWN_16", "ICON_SWIPE_DOWN_24", "ICON_SWIPE_UP_16", "ICON_SWIPE_UP_24", "ICON_SWITCH_16", "ICON_SWITCH_24", "ICON_TAB_ACCOUNT_32", "ICON_TAB_CONTENT_32", "ICON_TAB_CRYPTO_32", "ICON_TAB_CRYPTO_C_32", "ICON_TAB_GOLD_32", "ICON_TAB_INVEST_32", "ICON_TAB_ISA_32", "ICON_TAB_MESSAGES_32", "ICON_TAB_MONEY_32", "ICON_TAB_RETIREMENT_32", "ICON_TAB_SEARCH_32", "ICON_TAB_SOCIAL_32", "ICON_TAB_WATCHLIST_32", "ICON_TAG_16", "ICON_TAG_24", "ICON_TAX_LOTS_LONG_TERM_16", "ICON_TAX_LOTS_SHORT_TERM_16", "ICON_TECHNOLOGY_12", "ICON_TECHNOLOGY_24", "ICON_THUMBPRINT_16", "ICON_THUMBPRINT_24", "ICON_THUMBS_DOWN_16", "ICON_THUMBS_DOWN_24", "ICON_THUMBS_UP_16", "ICON_THUMBS_UP_24", "ICON_TICKET_16", "ICON_TICKET_24", "ICON_TOUCH_ID_ANDROID_16", "ICON_TOUCH_ID_ANDROID_24", "ICON_TRADE_SOCIAL_FILLED_20", "ICON_TRADE_SOCIAL_OUTLINE_20", "ICON_TRANSFERS_12", "ICON_TRANSFERS_16", "ICON_TRANSFERS_24", "ICON_TRANSPORT_24", "ICON_TRASH_12", "ICON_TRASH_16", "ICON_TRASH_24", "ICON_TRIANGLE_ALERT_16", "ICON_TRIANGLE_ALERT_24", "ICON_TUNER_16", "ICON_TUNER_24", "ICON_UNLOCK_12", "ICON_UNLOCK_16", "ICON_UNLOCK_24", "ICON_UPLOAD_24", "ICON_VIDEO_CALL_12", "ICON_VIDEO_CALL_16", "ICON_VIDEO_CALL_24", "ICON_VIDEO_FAST_FORWARD_24", "ICON_VIDEO_REPLAY_24", "ICON_VIDEO_REWIND_15_32", "ICON_VIDEO_REWIND_24", "ICON_VIDEO_SKIP_15_32", "ICON_WALLET_24", "ICON_WALLET_32", "ICON_WALLETCONNECT_16", "ICON_WALLETCONNECT_24", "ICON_WC_SCAN_24", "ICON_WITHDRAW_16", "ICON_WITHDRAW_24", "ICON_ZOOM_IN_24", "ICON_ZOOM_OUT_24", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class Icon implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Icon[] $VALUES;

    @JvmField
    public static final ProtoAdapter<Icon> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final Icon ICON_ACCOUNT_SUMMARY_12;
    public static final Icon ICON_ACCOUNT_SUMMARY_24;
    public static final Icon ICON_ACTIONS_ALERTS_32;
    public static final Icon ICON_ACTIONS_ATM_32;
    public static final Icon ICON_ACTIONS_CHECK_32;
    public static final Icon ICON_ACTIONS_STATEMENTS_32;
    public static final Icon ICON_ACTIONS_TRANSFERS_32;
    public static final Icon ICON_ACTION_REMOVE_24;
    public static final Icon ICON_AGENT_16;
    public static final Icon ICON_AGENT_24;
    public static final Icon ICON_ALERT_12;
    public static final Icon ICON_ALERT_16;
    public static final Icon ICON_ALERT_24;
    public static final Icon ICON_ALERT_FILLED_12;
    public static final Icon ICON_ALERT_FILLED_16;
    public static final Icon ICON_ALERT_FILLED_24;
    public static final Icon ICON_ALL_DAY_TRADING_12;
    public static final Icon ICON_ALL_DAY_TRADING_16;
    public static final Icon ICON_ALL_DAY_TRADING_24;
    public static final Icon ICON_ANNOUNCEMENT_12;
    public static final Icon ICON_ANNOUNCEMENT_16;
    public static final Icon ICON_ANNOUNCEMENT_24;
    public static final Icon ICON_ARCHIVE_24;
    public static final Icon ICON_ARROW_DIAGONAL_UP_16;
    public static final Icon ICON_ARROW_DOWN_12;
    public static final Icon ICON_ARROW_DOWN_16;
    public static final Icon ICON_ARROW_DOWN_24;
    public static final Icon ICON_ARROW_DOWN_FILL_12;
    public static final Icon ICON_ARROW_DOWN_FILL_16;
    public static final Icon ICON_ARROW_DOWN_FILL_24;
    public static final Icon ICON_ARROW_DOWN_RIGHT_12;
    public static final Icon ICON_ARROW_LEFT_12;
    public static final Icon ICON_ARROW_LEFT_16;
    public static final Icon ICON_ARROW_LEFT_24;
    public static final Icon ICON_ARROW_LEFT_FILL_12;
    public static final Icon ICON_ARROW_LEFT_FILL_16;
    public static final Icon ICON_ARROW_LEFT_FILL_24;
    public static final Icon ICON_ARROW_RIGHT_12;
    public static final Icon ICON_ARROW_RIGHT_16;
    public static final Icon ICON_ARROW_RIGHT_24;
    public static final Icon ICON_ARROW_RIGHT_FILL_12;
    public static final Icon ICON_ARROW_RIGHT_FILL_16;
    public static final Icon ICON_ARROW_RIGHT_FILL_24;
    public static final Icon ICON_ARROW_UP_12;
    public static final Icon ICON_ARROW_UP_16;
    public static final Icon ICON_ARROW_UP_24;
    public static final Icon ICON_ARROW_UP_FILL_12;
    public static final Icon ICON_ARROW_UP_FILL_16;
    public static final Icon ICON_ARROW_UP_FILL_24;
    public static final Icon ICON_ARROW_UP_RIGHT_12;
    public static final Icon ICON_ARROW_UP_RIGHT_16;
    public static final Icon ICON_ATTACH_24;
    public static final Icon ICON_BACKSPACE_24;
    public static final Icon ICON_BACKSPACE_32;
    public static final Icon ICON_BANKING_16;
    public static final Icon ICON_BANKING_24;
    public static final Icon ICON_BANKING_32;
    public static final Icon ICON_BAR_CHART_16;
    public static final Icon ICON_BAR_CHART_24;
    public static final Icon ICON_BOOKMARK_POST_FILLED_16;
    public static final Icon ICON_BOOKMARK_POST_OUTLINE_16;
    public static final Icon ICON_BUBBLE_CHECKED_12;
    public static final Icon ICON_BUBBLE_CHECKED_16;
    public static final Icon ICON_BUBBLE_CHECKED_24;
    public static final Icon ICON_BUBBLE_DOT_24;
    public static final Icon ICON_BUBBLE_EMPTY_24;
    public static final Icon ICON_BUBBLE_MINUS_16;
    public static final Icon ICON_BUBBLE_MINUS_24;
    public static final Icon ICON_BUBBLE_PAUSE_24;
    public static final Icon ICON_BUBBLE_PLUS_16;
    public static final Icon ICON_BUBBLE_PLUS_24;
    public static final Icon ICON_BUBBLE_PLUS_FILLED_24;
    public static final Icon ICON_BUBBLE_RADIO_BUTTON_24;
    public static final Icon ICON_BUBBLE_REMOVE_16;
    public static final Icon ICON_BUBBLE_REMOVE_24;
    public static final Icon ICON_BUBBLE_REMOVE_FILLED_16;
    public static final Icon ICON_BUBBLE_REMOVE_FILLED_24;
    public static final Icon ICON_BUBBLE_REVERSE_24;
    public static final Icon ICON_BUBBLE_UK_POUNDS_16;
    public static final Icon ICON_BUBBLE_UK_POUNDS_24;
    public static final Icon ICON_BUBBLE_UK_POUNDS_FILLED_16;
    public static final Icon ICON_BUBBLE_UK_POUNDS_FILLED_24;
    public static final Icon ICON_BUILDER_16;
    public static final Icon ICON_BUILDER_24;
    public static final Icon ICON_CALENDAR_12;
    public static final Icon ICON_CALENDAR_16;
    public static final Icon ICON_CALENDAR_24;
    public static final Icon ICON_CAMERA_16;
    public static final Icon ICON_CAMERA_24;
    public static final Icon ICON_CARET_DOWN_12;
    public static final Icon ICON_CARET_DOWN_16;
    public static final Icon ICON_CARET_DOWN_24;
    public static final Icon ICON_CARET_LEFT_12;
    public static final Icon ICON_CARET_LEFT_16;
    public static final Icon ICON_CARET_LEFT_24;
    public static final Icon ICON_CARET_RIGHT_12;
    public static final Icon ICON_CARET_RIGHT_16;
    public static final Icon ICON_CARET_RIGHT_24;
    public static final Icon ICON_CARET_UP_12;
    public static final Icon ICON_CARET_UP_16;
    public static final Icon ICON_CARET_UP_24;
    public static final Icon ICON_CASH_24;
    public static final Icon ICON_CHART_16;
    public static final Icon ICON_CHART_24;
    public static final Icon ICON_CHART_BAR_24;
    public static final Icon ICON_CHART_CANDLESTICKS_16;
    public static final Icon ICON_CHART_CANDLESTICKS_24;
    public static final Icon ICON_CHART_LINE_16;
    public static final Icon ICON_CHART_LINE_24;
    public static final Icon ICON_CHART_STACKED_BAR_16;
    public static final Icon ICON_CHATBOT_16;
    public static final Icon ICON_CHATBOT_24;
    public static final Icon ICON_CHAT_16;
    public static final Icon ICON_CHAT_24;
    public static final Icon ICON_CHECKBOX_EMPTY_16;
    public static final Icon ICON_CHECKBOX_EMPTY_24;
    public static final Icon ICON_CHECKBOX_FILLED_16;
    public static final Icon ICON_CHECKBOX_FILLED_24;
    public static final Icon ICON_CHECKMARK_12;
    public static final Icon ICON_CHECKMARK_16;
    public static final Icon ICON_CHECKMARK_24;
    public static final Icon ICON_CLIPBOARD_16;
    public static final Icon ICON_CLIPBOARD_24;
    public static final Icon ICON_CLOCK_12;
    public static final Icon ICON_CLOCK_16;
    public static final Icon ICON_CLOCK_24;
    public static final Icon ICON_CLOSE_12;
    public static final Icon ICON_CLOSE_16;
    public static final Icon ICON_CLOSE_24;
    public static final Icon ICON_CLOUD_16;
    public static final Icon ICON_CLOUD_24;
    public static final Icon ICON_COLLAPSE_16;
    public static final Icon ICON_COLLAPSE_24;
    public static final Icon ICON_COMMENT_FILLED_16;
    public static final Icon ICON_COMMENT_FILLED_20;
    public static final Icon ICON_COMMENT_OUTLINE_16;
    public static final Icon ICON_COMMENT_OUTLINE_20;
    public static final Icon ICON_CONCIERGE_24;
    public static final Icon ICON_CONSUMER_GOODS_12;
    public static final Icon ICON_CONSUMER_GOODS_16;
    public static final Icon ICON_CONSUMER_GOODS_24;
    public static final Icon ICON_CONTROLS_16;
    public static final Icon ICON_CONTROLS_24;
    public static final Icon ICON_CONVERSATION_16;
    public static final Icon ICON_CONVERSATION_24;
    public static final Icon ICON_CONVERT_24;
    public static final Icon ICON_COPY_12;
    public static final Icon ICON_COPY_16;
    public static final Icon ICON_COPY_24;
    public static final Icon ICON_COPY_TRADE_FILLED_16;
    public static final Icon ICON_COPY_TRADE_OUTLINE_16;
    public static final Icon ICON_CORN_FUTURES_24;
    public static final Icon ICON_CORPORATE_16;
    public static final Icon ICON_CORPORATE_24;
    public static final Icon ICON_CORTEX_12;
    public static final Icon ICON_CORTEX_16;
    public static final Icon ICON_CORTEX_24;
    public static final Icon ICON_CRYPTO_12;
    public static final Icon ICON_CRYPTO_16;
    public static final Icon ICON_CRYPTO_24;
    public static final Icon ICON_CRYPTO_C_12;
    public static final Icon ICON_CRYPTO_C_16;
    public static final Icon ICON_CRYPTO_C_24;
    public static final Icon ICON_CUSTODIAL_16;
    public static final Icon ICON_CUSTODIAL_24;
    public static final Icon ICON_DEPOSIT_16;
    public static final Icon ICON_DEPOSIT_24;
    public static final Icon ICON_DINING_24;
    public static final Icon ICON_DISCLOSURES_16;
    public static final Icon ICON_DISCLOSURES_24;
    public static final Icon ICON_DIVIDEND_16;
    public static final Icon ICON_DIVIDEND_24;
    public static final Icon ICON_DOCUMENTS_24;
    public static final Icon ICON_DOLLAR_SIGN_12;
    public static final Icon ICON_DOLLAR_SIGN_16;
    public static final Icon ICON_DOLLAR_SIGN_24;
    public static final Icon ICON_DOTS_16;
    public static final Icon ICON_DOTS_24;
    public static final Icon ICON_DOTS_ANDROID_16;
    public static final Icon ICON_DOTS_ANDROID_24;
    public static final Icon ICON_DOT_12;
    public static final Icon ICON_DOT_16;
    public static final Icon ICON_DOT_24;
    public static final Icon ICON_DOWNLOAD_12;
    public static final Icon ICON_DOWNLOAD_16;
    public static final Icon ICON_DOWNLOAD_24;
    public static final Icon ICON_DRAG_12;
    public static final Icon ICON_DRAG_16;
    public static final Icon ICON_DRAG_24;
    public static final Icon ICON_DROPDOWN_12;
    public static final Icon ICON_DROPDOWN_16;
    public static final Icon ICON_DROPDOWN_24;
    public static final Icon ICON_ECONOMIC_MOAT_24;
    public static final Icon ICON_EDIT_12;
    public static final Icon ICON_EDIT_16;
    public static final Icon ICON_EDIT_24;
    public static final Icon ICON_EDIT_SURFACE_24;
    public static final Icon ICON_EMAIL_FILLED_16;
    public static final Icon ICON_EMAIL_FILLED_24;
    public static final Icon ICON_EMAIL_OUTLINE_24;
    public static final Icon ICON_ENERGY_12;
    public static final Icon ICON_ENERGY_24;
    public static final Icon ICON_ENTERTAINMENT_24;
    public static final Icon ICON_ETF_12;
    public static final Icon ICON_ETF_24;
    public static final Icon ICON_EURO_SIGN_12;
    public static final Icon ICON_EURO_SIGN_16;
    public static final Icon ICON_EURO_SIGN_24;
    public static final Icon ICON_EXCLAMATION_12;
    public static final Icon ICON_EXCLAMATION_16;
    public static final Icon ICON_EXCLAMATION_24;
    public static final Icon ICON_EXPAND_16;
    public static final Icon ICON_EXPAND_24;
    public static final Icon ICON_EYE_16;
    public static final Icon ICON_EYE_24;
    public static final Icon ICON_EYE_CLOSED_16;
    public static final Icon ICON_EYE_CLOSED_24;
    public static final Icon ICON_FACE_ID_ANDROID_16;
    public static final Icon ICON_FACE_ID_ANDROID_24;
    public static final Icon ICON_FACE_ID_IOS_16;
    public static final Icon ICON_FACE_ID_IOS_24;
    public static final Icon ICON_FAIR_VALUE_24;
    public static final Icon ICON_FEATURED_16;
    public static final Icon ICON_FEATURED_24;
    public static final Icon ICON_FILTER_12;
    public static final Icon ICON_FILTER_16;
    public static final Icon ICON_FILTER_24;
    public static final Icon ICON_FINANCE_12;
    public static final Icon ICON_FINANCE_16;
    public static final Icon ICON_FINANCE_24;
    public static final Icon ICON_FLASHLIGHT_OFF_24;
    public static final Icon ICON_FLASHLIGHT_ON_24;
    public static final Icon ICON_FLASH_OFF_24;
    public static final Icon ICON_FLASH_ON_24;
    public static final Icon ICON_FLOWER_16;
    public static final Icon ICON_FOLDER_16;
    public static final Icon ICON_FOLDER_24;
    public static final Icon ICON_FULLSCREEN_ENTER_24;
    public static final Icon ICON_FULLSCREEN_EXIT_24;
    public static final Icon ICON_GIFT_12;
    public static final Icon ICON_GIFT_16;
    public static final Icon ICON_GIFT_24;
    public static final Icon ICON_GOLD_16;
    public static final Icon ICON_GOLD_24;
    public static final Icon ICON_GROCERIES_24;
    public static final Icon ICON_HAMBURGER_12;
    public static final Icon ICON_HAMBURGER_16;
    public static final Icon ICON_HAMBURGER_24;
    public static final Icon ICON_HEALTHCARE_12;
    public static final Icon ICON_HEALTHCARE_24;
    public static final Icon ICON_HELP_24;
    public static final Icon ICON_HISTORY_16;
    public static final Icon ICON_HISTORY_24;
    public static final Icon ICON_HOME_24;
    public static final Icon ICON_HOSPITALITY_12;
    public static final Icon ICON_HOSPITALITY_24;
    public static final Icon ICON_HOURGLASS_12;
    public static final Icon ICON_HOURGLASS_16;
    public static final Icon ICON_HOURGLASS_24;
    public static final Icon ICON_ICLOUD_RESTORE_16;
    public static final Icon ICON_ICLOUD_RESTORE_24;
    public static final Icon ICON_IMAGE_16;
    public static final Icon ICON_IMAGE_24;
    public static final Icon ICON_IMAGE_FAIL_16;
    public static final Icon ICON_IMAGE_FAIL_24;
    public static final Icon ICON_INFO_12;
    public static final Icon ICON_INFO_16;
    public static final Icon ICON_INFO_24;
    public static final Icon ICON_INFO_FILLED_12;
    public static final Icon ICON_INFO_FILLED_16;
    public static final Icon ICON_INFO_FILLED_24;
    public static final Icon ICON_ISA_16;
    public static final Icon ICON_ISA_24;
    public static final Icon ICON_JOINT_ACCOUNT_12;
    public static final Icon ICON_JOINT_ACCOUNT_16;
    public static final Icon ICON_JOINT_ACCOUNT_24;
    public static final Icon ICON_L2_HEADER_ARROW_24;
    public static final Icon ICON_LIGHTBULB_16;
    public static final Icon ICON_LIGHTBULB_24;
    public static final Icon ICON_LIGHTNING_12;
    public static final Icon ICON_LIGHTNING_16;
    public static final Icon ICON_LIGHTNING_24;
    public static final Icon ICON_LIGHTNING_OFF_16;
    public static final Icon ICON_LIKE_POST_FILLED_16;
    public static final Icon ICON_LIKE_POST_FILLED_20;
    public static final Icon ICON_LIKE_POST_OUTLINE_16;
    public static final Icon ICON_LIKE_POST_OUTLINE_20;
    public static final Icon ICON_LIKE_POST_OUTLINE_24;
    public static final Icon ICON_LINK_16;
    public static final Icon ICON_LINK_24;
    public static final Icon ICON_LINK_OUT_12;
    public static final Icon ICON_LINK_OUT_16;
    public static final Icon ICON_LINK_OUT_24;
    public static final Icon ICON_LIST_24;
    public static final Icon ICON_LOCATION_FILL_16;
    public static final Icon ICON_LOCATION_FILL_24;
    public static final Icon ICON_LOCATION_OUTLINE_24;
    public static final Icon ICON_LOCK_12;
    public static final Icon ICON_LOCK_16;
    public static final Icon ICON_LOCK_24;
    public static final Icon ICON_LOG_OUT_24;
    public static final Icon ICON_MANAGED_ACCOUNTS_16;
    public static final Icon ICON_MANAGED_ACCOUNTS_24;
    public static final Icon ICON_MANAGED_INDIVIDUAL_24;
    public static final Icon ICON_MANAGED_JOINT_24;
    public static final Icon ICON_MANAGED_RETIREMENT_24;
    public static final Icon ICON_MANUFACTURING_12;
    public static final Icon ICON_MANUFACTURING_24;
    public static final Icon ICON_MAPS_24;
    public static final Icon ICON_MARGIN_12;
    public static final Icon ICON_MARGIN_16;
    public static final Icon ICON_MARGIN_24;
    public static final Icon ICON_MAXIMUM_16;
    public static final Icon ICON_MESSAGE_SEND_16;
    public static final Icon ICON_MESSAGE_SEND_24;
    public static final Icon ICON_MINIMUM_16;
    public static final Icon ICON_MINUS_12;
    public static final Icon ICON_MINUS_16;
    public static final Icon ICON_MINUS_24;
    public static final Icon ICON_MORE_MENU_16;
    public static final Icon ICON_MORE_MENU_20;
    public static final Icon ICON_NEWS_16;
    public static final Icon ICON_NEWS_24;
    public static final Icon ICON_NOTIFICATION_12;
    public static final Icon ICON_NOTIFICATION_16;
    public static final Icon ICON_NOTIFICATION_24;
    public static final Icon ICON_NOTIFICATION_32;
    public static final Icon ICON_NOTIFICATION_ADD_16;
    public static final Icon ICON_NOTIFICATION_ADD_24;
    public static final Icon ICON_NOTIFICATION_CHECK_16;
    public static final Icon ICON_NOTIFICATION_CHECK_24;
    public static final Icon ICON_NO_VALUE_24;
    public static final Icon ICON_NO_VALUE_32;
    public static final Icon ICON_NUMPAD_DOWN_24;
    public static final Icon ICON_NUMPAD_UP_24;
    public static final Icon ICON_ONLINE_16;
    public static final Icon ICON_ONLINE_24;
    public static final Icon ICON_OPTIONS_DOWN_24;
    public static final Icon ICON_OPTIONS_FLAT_24;
    public static final Icon ICON_OPTIONS_UP_24;
    public static final Icon ICON_OPTIONS_VOLATILE_24;
    public static final Icon ICON_ORDER_16;
    public static final Icon ICON_ORDER_24;
    public static final Icon ICON_PAUSE_HERO_40;
    public static final Icon ICON_PAUSE_INLINE_24;
    public static final Icon ICON_PAYCHECK_24;
    public static final Icon ICON_PAYMENT_12;
    public static final Icon ICON_PAYMENT_16;
    public static final Icon ICON_PAYMENT_24;
    public static final Icon ICON_PAYMENT_32;
    public static final Icon ICON_PERCENT_SIGN_12;
    public static final Icon ICON_PERCENT_SIGN_16;
    public static final Icon ICON_PERCENT_SIGN_24;
    public static final Icon ICON_PERPETUAL_FUTURES_32;
    public static final Icon ICON_PERSON_12;
    public static final Icon ICON_PERSON_16;
    public static final Icon ICON_PERSON_24;
    public static final Icon ICON_PHONE_16;
    public static final Icon ICON_PHONE_24;
    public static final Icon ICON_PHONE_CONNECTED_16;
    public static final Icon ICON_PHONE_MISSED_CALL_16;
    public static final Icon ICON_PHONE_WAITING_16;
    public static final Icon ICON_PICTURE_IN_PICTURE_24;
    public static final Icon ICON_PIE_CHART_16;
    public static final Icon ICON_PIE_CHART_24;
    public static final Icon ICON_PIN_16;
    public static final Icon ICON_PIN_24;
    public static final Icon ICON_PLAY_HERO_40;
    public static final Icon ICON_PLAY_INLINE_16;
    public static final Icon ICON_PLAY_INLINE_24;
    public static final Icon ICON_PLUS_12;
    public static final Icon ICON_PLUS_16;
    public static final Icon ICON_PLUS_24;
    public static final Icon ICON_POP_OUT_16;
    public static final Icon ICON_POP_OUT_24;
    public static final Icon ICON_PRINT_24;
    public static final Icon ICON_QR_16;
    public static final Icon ICON_QR_24;
    public static final Icon ICON_QR_SCAN_24;
    public static final Icon ICON_QUANTITY_16;
    public static final Icon ICON_QUANTITY_24;
    public static final Icon ICON_QUESTION_12;
    public static final Icon ICON_QUESTION_16;
    public static final Icon ICON_QUESTION_24;
    public static final Icon ICON_QUESTION_FILLED_12;
    public static final Icon ICON_QUESTION_FILLED_16;
    public static final Icon ICON_QUESTION_FILLED_24;
    public static final Icon ICON_RECURRING_12;
    public static final Icon ICON_RECURRING_16;
    public static final Icon ICON_RECURRING_24;
    public static final Icon ICON_RECURRING_HUB_24;
    public static final Icon ICON_REPEAT_16;
    public static final Icon ICON_REPLAY_HERO_40;
    public static final Icon ICON_RESEND_16;
    public static final Icon ICON_RESEND_24;
    public static final Icon ICON_RETIREMENT_12;
    public static final Icon ICON_RETIREMENT_16;
    public static final Icon ICON_RETIREMENT_24;
    public static final Icon ICON_RETIREMENT_32;
    public static final Icon ICON_RHW_BROWSER_TAB_24;
    public static final Icon ICON_RHW_CHART_TAB_24;
    public static final Icon ICON_RHW_SEARCH_TAB_24;
    public static final Icon ICON_RISK_AND_UNCERTAINTY_24;
    public static final Icon ICON_ROBINHOOD_12;
    public static final Icon ICON_ROBINHOOD_16;
    public static final Icon ICON_ROBINHOOD_24;
    public static final Icon ICON_ROLLING_POSITION_12;
    public static final Icon ICON_ROLLING_POSITION_16;
    public static final Icon ICON_ROLLING_POSITION_24;
    public static final Icon ICON_SCAN_16;
    public static final Icon ICON_SCAN_24;
    public static final Icon ICON_SEARCH_16;
    public static final Icon ICON_SEARCH_24;
    public static final Icon ICON_SETTINGS_12;
    public static final Icon ICON_SETTINGS_16;
    public static final Icon ICON_SETTINGS_24;
    public static final Icon ICON_SHARE_ANDROID_16;
    public static final Icon ICON_SHARE_ANDROID_24;
    public static final Icon ICON_SHARE_IOS_16;
    public static final Icon ICON_SHARE_IOS_24;
    public static final Icon ICON_SMILEY_24;
    public static final Icon ICON_SOCIAL_CREATE_POST_16;
    public static final Icon ICON_SORT_12;
    public static final Icon ICON_SOUND_OFF_24;
    public static final Icon ICON_SOUND_ON_24;
    public static final Icon ICON_SPARKLE_BULLET_12;
    public static final Icon ICON_SPARKLE_BULLET_16;
    public static final Icon ICON_SPARKLE_BULLET_24;
    public static final Icon ICON_SPARKLE_DOUBLE_16;
    public static final Icon ICON_SPARKLE_DOUBLE_24;
    public static final Icon ICON_SPEED_DOWN_24;
    public static final Icon ICON_SPEED_UP_24;
    public static final Icon ICON_STAR_FILLED_12;
    public static final Icon ICON_STAR_FILLED_16;
    public static final Icon ICON_STAR_FILLED_24;
    public static final Icon ICON_STAR_OUTLINE_16;
    public static final Icon ICON_STAR_OUTLINE_24;
    public static final Icon ICON_STAR_PASSWORD_16;
    public static final Icon ICON_STEWARDSHIP_24;
    public static final Icon ICON_STOCK_DOWN_12;
    public static final Icon ICON_STOCK_DOWN_16;
    public static final Icon ICON_STOCK_DOWN_24;
    public static final Icon ICON_STOCK_UP_12;
    public static final Icon ICON_STOCK_UP_16;
    public static final Icon ICON_STOCK_UP_24;
    public static final Icon ICON_STOPWATCH_16;
    public static final Icon ICON_STOPWATCH_24;
    public static final Icon ICON_STOPWATCH_32;
    public static final Icon ICON_STRATEGY_OUTLOOK_24;
    public static final Icon ICON_SWIPE_DOWN_16;
    public static final Icon ICON_SWIPE_DOWN_24;
    public static final Icon ICON_SWIPE_UP_16;
    public static final Icon ICON_SWIPE_UP_24;
    public static final Icon ICON_SWITCH_16;
    public static final Icon ICON_SWITCH_24;
    public static final Icon ICON_TAB_ACCOUNT_32;
    public static final Icon ICON_TAB_CONTENT_32;
    public static final Icon ICON_TAB_CRYPTO_32;
    public static final Icon ICON_TAB_CRYPTO_C_32;
    public static final Icon ICON_TAB_GOLD_32;
    public static final Icon ICON_TAB_INVEST_32;
    public static final Icon ICON_TAB_ISA_32;
    public static final Icon ICON_TAB_MESSAGES_32;
    public static final Icon ICON_TAB_MONEY_32;
    public static final Icon ICON_TAB_RETIREMENT_32;
    public static final Icon ICON_TAB_SEARCH_32;
    public static final Icon ICON_TAB_SOCIAL_32;
    public static final Icon ICON_TAB_WATCHLIST_32;
    public static final Icon ICON_TAG_16;
    public static final Icon ICON_TAG_24;
    public static final Icon ICON_TAX_LOTS_LONG_TERM_16;
    public static final Icon ICON_TAX_LOTS_SHORT_TERM_16;
    public static final Icon ICON_TECHNOLOGY_12;
    public static final Icon ICON_TECHNOLOGY_24;
    public static final Icon ICON_THUMBPRINT_16;
    public static final Icon ICON_THUMBPRINT_24;
    public static final Icon ICON_THUMBS_DOWN_16;
    public static final Icon ICON_THUMBS_DOWN_24;
    public static final Icon ICON_THUMBS_UP_16;
    public static final Icon ICON_THUMBS_UP_24;
    public static final Icon ICON_TICKET_16;
    public static final Icon ICON_TICKET_24;
    public static final Icon ICON_TOUCH_ID_ANDROID_16;
    public static final Icon ICON_TOUCH_ID_ANDROID_24;
    public static final Icon ICON_TRADE_SOCIAL_FILLED_20;
    public static final Icon ICON_TRADE_SOCIAL_OUTLINE_20;
    public static final Icon ICON_TRANSFERS_12;
    public static final Icon ICON_TRANSFERS_16;
    public static final Icon ICON_TRANSFERS_24;
    public static final Icon ICON_TRANSPORT_24;
    public static final Icon ICON_TRASH_12;
    public static final Icon ICON_TRASH_16;
    public static final Icon ICON_TRASH_24;
    public static final Icon ICON_TRIANGLE_ALERT_16;
    public static final Icon ICON_TRIANGLE_ALERT_24;
    public static final Icon ICON_TUNER_16;
    public static final Icon ICON_TUNER_24;
    public static final Icon ICON_UNLOCK_12;
    public static final Icon ICON_UNLOCK_16;
    public static final Icon ICON_UNLOCK_24;
    public static final Icon ICON_UNSPECIFIED;
    public static final Icon ICON_UPLOAD_24;
    public static final Icon ICON_VIDEO_CALL_12;
    public static final Icon ICON_VIDEO_CALL_16;
    public static final Icon ICON_VIDEO_CALL_24;
    public static final Icon ICON_VIDEO_FAST_FORWARD_24;
    public static final Icon ICON_VIDEO_REPLAY_24;
    public static final Icon ICON_VIDEO_REWIND_15_32;
    public static final Icon ICON_VIDEO_REWIND_24;
    public static final Icon ICON_VIDEO_SKIP_15_32;
    public static final Icon ICON_WALLETCONNECT_16;
    public static final Icon ICON_WALLETCONNECT_24;
    public static final Icon ICON_WALLET_24;
    public static final Icon ICON_WALLET_32;
    public static final Icon ICON_WC_SCAN_24;
    public static final Icon ICON_WITHDRAW_16;
    public static final Icon ICON_WITHDRAW_24;
    public static final Icon ICON_ZOOM_IN_24;
    public static final Icon ICON_ZOOM_OUT_24;
    private final int value;

    private static final /* synthetic */ Icon[] $values() {
        return new Icon[]{ICON_UNSPECIFIED, ICON_ACCOUNT_SUMMARY_12, ICON_ACCOUNT_SUMMARY_24, ICON_ACTION_REMOVE_24, ICON_ACTIONS_ALERTS_32, ICON_ACTIONS_ATM_32, ICON_ACTIONS_CHECK_32, ICON_ACTIONS_STATEMENTS_32, ICON_ACTIONS_TRANSFERS_32, ICON_AGENT_16, ICON_AGENT_24, ICON_ALERT_12, ICON_ALERT_16, ICON_ALERT_24, ICON_ALERT_FILLED_12, ICON_ALERT_FILLED_16, ICON_ALERT_FILLED_24, ICON_ALL_DAY_TRADING_12, ICON_ALL_DAY_TRADING_16, ICON_ALL_DAY_TRADING_24, ICON_ANNOUNCEMENT_12, ICON_ANNOUNCEMENT_16, ICON_ANNOUNCEMENT_24, ICON_ARCHIVE_24, ICON_ARROW_DIAGONAL_UP_16, ICON_ARROW_DOWN_12, ICON_ARROW_DOWN_16, ICON_ARROW_DOWN_24, ICON_ARROW_DOWN_FILL_12, ICON_ARROW_DOWN_FILL_16, ICON_ARROW_DOWN_FILL_24, ICON_ARROW_DOWN_RIGHT_12, ICON_ARROW_LEFT_12, ICON_ARROW_LEFT_16, ICON_ARROW_LEFT_24, ICON_ARROW_LEFT_FILL_12, ICON_ARROW_LEFT_FILL_16, ICON_ARROW_LEFT_FILL_24, ICON_ARROW_RIGHT_12, ICON_ARROW_RIGHT_16, ICON_ARROW_RIGHT_24, ICON_ARROW_RIGHT_FILL_12, ICON_ARROW_RIGHT_FILL_16, ICON_ARROW_RIGHT_FILL_24, ICON_ARROW_UP_12, ICON_ARROW_UP_16, ICON_ARROW_UP_24, ICON_ARROW_UP_FILL_12, ICON_ARROW_UP_FILL_16, ICON_ARROW_UP_FILL_24, ICON_ARROW_UP_RIGHT_12, ICON_ARROW_UP_RIGHT_16, ICON_ATTACH_24, ICON_BACKSPACE_24, ICON_BACKSPACE_32, ICON_BANKING_16, ICON_BANKING_24, ICON_BANKING_32, ICON_BAR_CHART_16, ICON_BAR_CHART_24, ICON_BOOKMARK_POST_FILLED_16, ICON_BOOKMARK_POST_OUTLINE_16, ICON_BUBBLE_CHECKED_12, ICON_BUBBLE_CHECKED_16, ICON_BUBBLE_CHECKED_24, ICON_BUBBLE_DOT_24, ICON_BUBBLE_EMPTY_24, ICON_BUBBLE_MINUS_16, ICON_BUBBLE_MINUS_24, ICON_BUBBLE_PAUSE_24, ICON_BUBBLE_PLUS_16, ICON_BUBBLE_PLUS_24, ICON_BUBBLE_PLUS_FILLED_24, ICON_BUBBLE_RADIO_BUTTON_24, ICON_BUBBLE_REMOVE_16, ICON_BUBBLE_REMOVE_24, ICON_BUBBLE_REMOVE_FILLED_16, ICON_BUBBLE_REMOVE_FILLED_24, ICON_BUBBLE_REVERSE_24, ICON_BUBBLE_UK_POUNDS_16, ICON_BUBBLE_UK_POUNDS_24, ICON_BUBBLE_UK_POUNDS_FILLED_16, ICON_BUBBLE_UK_POUNDS_FILLED_24, ICON_BUILDER_16, ICON_BUILDER_24, ICON_CALENDAR_12, ICON_CALENDAR_16, ICON_CALENDAR_24, ICON_CAMERA_16, ICON_CAMERA_24, ICON_CARET_DOWN_12, ICON_CARET_DOWN_16, ICON_CARET_DOWN_24, ICON_CARET_LEFT_12, ICON_CARET_LEFT_16, ICON_CARET_LEFT_24, ICON_CARET_RIGHT_12, ICON_CARET_RIGHT_16, ICON_CARET_RIGHT_24, ICON_CARET_UP_12, ICON_CARET_UP_16, ICON_CARET_UP_24, ICON_CASH_24, ICON_CHART_16, ICON_CHART_24, ICON_CHART_BAR_24, ICON_CHART_CANDLESTICKS_16, ICON_CHART_CANDLESTICKS_24, ICON_CHART_LINE_16, ICON_CHART_LINE_24, ICON_CHART_STACKED_BAR_16, ICON_CHAT_16, ICON_CHAT_24, ICON_CHATBOT_16, ICON_CHATBOT_24, ICON_CHECKBOX_EMPTY_16, ICON_CHECKBOX_EMPTY_24, ICON_CHECKBOX_FILLED_16, ICON_CHECKBOX_FILLED_24, ICON_CHECKMARK_12, ICON_CHECKMARK_16, ICON_CHECKMARK_24, ICON_CLIPBOARD_16, ICON_CLIPBOARD_24, ICON_CLOCK_12, ICON_CLOCK_16, ICON_CLOCK_24, ICON_CLOSE_12, ICON_CLOSE_16, ICON_CLOSE_24, ICON_CLOUD_16, ICON_CLOUD_24, ICON_COLLAPSE_16, ICON_COLLAPSE_24, ICON_COMMENT_FILLED_16, ICON_COMMENT_FILLED_20, ICON_COMMENT_OUTLINE_16, ICON_COMMENT_OUTLINE_20, ICON_CONCIERGE_24, ICON_CONSUMER_GOODS_12, ICON_CONSUMER_GOODS_16, ICON_CONSUMER_GOODS_24, ICON_CONTROLS_16, ICON_CONTROLS_24, ICON_CONVERSATION_16, ICON_CONVERSATION_24, ICON_CONVERT_24, ICON_COPY_12, ICON_COPY_16, ICON_COPY_24, ICON_COPY_TRADE_FILLED_16, ICON_COPY_TRADE_OUTLINE_16, ICON_CORN_FUTURES_24, ICON_CORPORATE_16, ICON_CORPORATE_24, ICON_CORTEX_12, ICON_CORTEX_16, ICON_CORTEX_24, ICON_CRYPTO_12, ICON_CRYPTO_16, ICON_CRYPTO_24, ICON_CRYPTO_C_12, ICON_CRYPTO_C_16, ICON_CRYPTO_C_24, ICON_CUSTODIAL_16, ICON_CUSTODIAL_24, ICON_DEPOSIT_16, ICON_DEPOSIT_24, ICON_DINING_24, ICON_DISCLOSURES_16, ICON_DISCLOSURES_24, ICON_DIVIDEND_16, ICON_DIVIDEND_24, ICON_DOCUMENTS_24, ICON_DOLLAR_SIGN_12, ICON_DOLLAR_SIGN_16, ICON_DOLLAR_SIGN_24, ICON_DOT_12, ICON_DOT_16, ICON_DOT_24, ICON_DOTS_16, ICON_DOTS_24, ICON_DOTS_ANDROID_16, ICON_DOTS_ANDROID_24, ICON_DOWNLOAD_12, ICON_DOWNLOAD_16, ICON_DOWNLOAD_24, ICON_DRAG_12, ICON_DRAG_16, ICON_DRAG_24, ICON_DROPDOWN_12, ICON_DROPDOWN_16, ICON_DROPDOWN_24, ICON_ECONOMIC_MOAT_24, ICON_EDIT_12, ICON_EDIT_16, ICON_EDIT_24, ICON_EDIT_SURFACE_24, ICON_EMAIL_FILLED_16, ICON_EMAIL_FILLED_24, ICON_EMAIL_OUTLINE_24, ICON_ENERGY_12, ICON_ENERGY_24, ICON_ENTERTAINMENT_24, ICON_ETF_12, ICON_ETF_24, ICON_EURO_SIGN_12, ICON_EURO_SIGN_16, ICON_EURO_SIGN_24, ICON_EXCLAMATION_12, ICON_EXCLAMATION_16, ICON_EXCLAMATION_24, ICON_EXPAND_16, ICON_EXPAND_24, ICON_EYE_16, ICON_EYE_24, ICON_EYE_CLOSED_16, ICON_EYE_CLOSED_24, ICON_FACE_ID_ANDROID_16, ICON_FACE_ID_ANDROID_24, ICON_FACE_ID_IOS_16, ICON_FACE_ID_IOS_24, ICON_FAIR_VALUE_24, ICON_FEATURED_16, ICON_FEATURED_24, ICON_FILTER_12, ICON_FILTER_16, ICON_FILTER_24, ICON_FINANCE_12, ICON_FINANCE_16, ICON_FINANCE_24, ICON_FLASH_OFF_24, ICON_FLASH_ON_24, ICON_FLASHLIGHT_OFF_24, ICON_FLASHLIGHT_ON_24, ICON_FLOWER_16, ICON_FOLDER_16, ICON_FOLDER_24, ICON_FULLSCREEN_ENTER_24, ICON_FULLSCREEN_EXIT_24, ICON_GIFT_12, ICON_GIFT_16, ICON_GIFT_24, ICON_GOLD_16, ICON_GOLD_24, ICON_GROCERIES_24, ICON_HAMBURGER_12, ICON_HAMBURGER_16, ICON_HAMBURGER_24, ICON_HEALTHCARE_12, ICON_HEALTHCARE_24, ICON_HELP_24, ICON_HISTORY_16, ICON_HISTORY_24, ICON_HOME_24, ICON_HOSPITALITY_12, ICON_HOSPITALITY_24, ICON_HOURGLASS_12, ICON_HOURGLASS_16, ICON_HOURGLASS_24, ICON_ICLOUD_RESTORE_16, ICON_ICLOUD_RESTORE_24, ICON_IMAGE_16, ICON_IMAGE_24, ICON_IMAGE_FAIL_16, ICON_IMAGE_FAIL_24, ICON_INFO_12, ICON_INFO_16, ICON_INFO_24, ICON_INFO_FILLED_12, ICON_INFO_FILLED_16, ICON_INFO_FILLED_24, ICON_ISA_16, ICON_ISA_24, ICON_JOINT_ACCOUNT_12, ICON_JOINT_ACCOUNT_16, ICON_JOINT_ACCOUNT_24, ICON_L2_HEADER_ARROW_24, ICON_LIGHTBULB_16, ICON_LIGHTBULB_24, ICON_LIGHTNING_12, ICON_LIGHTNING_16, ICON_LIGHTNING_24, ICON_LIGHTNING_OFF_16, ICON_LIKE_POST_FILLED_16, ICON_LIKE_POST_FILLED_20, ICON_LIKE_POST_OUTLINE_16, ICON_LIKE_POST_OUTLINE_20, ICON_LIKE_POST_OUTLINE_24, ICON_LINK_16, ICON_LINK_24, ICON_LINK_OUT_12, ICON_LINK_OUT_16, ICON_LINK_OUT_24, ICON_LIST_24, ICON_LOCATION_FILL_16, ICON_LOCATION_FILL_24, ICON_LOCATION_OUTLINE_24, ICON_LOCK_12, ICON_LOCK_16, ICON_LOCK_24, ICON_LOG_OUT_24, ICON_MANAGED_ACCOUNTS_16, ICON_MANAGED_ACCOUNTS_24, ICON_MANAGED_INDIVIDUAL_24, ICON_MANAGED_JOINT_24, ICON_MANAGED_RETIREMENT_24, ICON_MANUFACTURING_12, ICON_MANUFACTURING_24, ICON_MAPS_24, ICON_MARGIN_12, ICON_MARGIN_16, ICON_MARGIN_24, ICON_MAXIMUM_16, ICON_MESSAGE_SEND_16, ICON_MESSAGE_SEND_24, ICON_MINIMUM_16, ICON_MINUS_12, ICON_MINUS_16, ICON_MINUS_24, ICON_MORE_MENU_16, ICON_MORE_MENU_20, ICON_NEWS_16, ICON_NEWS_24, ICON_NO_VALUE_24, ICON_NO_VALUE_32, ICON_NOTIFICATION_12, ICON_NOTIFICATION_16, ICON_NOTIFICATION_24, ICON_NOTIFICATION_32, ICON_NOTIFICATION_ADD_16, ICON_NOTIFICATION_ADD_24, ICON_NOTIFICATION_CHECK_16, ICON_NOTIFICATION_CHECK_24, ICON_NUMPAD_DOWN_24, ICON_NUMPAD_UP_24, ICON_ONLINE_16, ICON_ONLINE_24, ICON_OPTIONS_DOWN_24, ICON_OPTIONS_FLAT_24, ICON_OPTIONS_UP_24, ICON_OPTIONS_VOLATILE_24, ICON_ORDER_16, ICON_ORDER_24, ICON_PAUSE_HERO_40, ICON_PAUSE_INLINE_24, ICON_PAYCHECK_24, ICON_PAYMENT_12, ICON_PAYMENT_16, ICON_PAYMENT_24, ICON_PAYMENT_32, ICON_PERCENT_SIGN_12, ICON_PERCENT_SIGN_16, ICON_PERCENT_SIGN_24, ICON_PERPETUAL_FUTURES_32, ICON_PERSON_12, ICON_PERSON_16, ICON_PERSON_24, ICON_PHONE_16, ICON_PHONE_24, ICON_PHONE_CONNECTED_16, ICON_PHONE_MISSED_CALL_16, ICON_PHONE_WAITING_16, ICON_PICTURE_IN_PICTURE_24, ICON_PIE_CHART_16, ICON_PIE_CHART_24, ICON_PIN_16, ICON_PIN_24, ICON_PLAY_HERO_40, ICON_PLAY_INLINE_16, ICON_PLAY_INLINE_24, ICON_PLUS_12, ICON_PLUS_16, ICON_PLUS_24, ICON_POP_OUT_16, ICON_POP_OUT_24, ICON_PRINT_24, ICON_QR_16, ICON_QR_24, ICON_QR_SCAN_24, ICON_QUANTITY_16, ICON_QUANTITY_24, ICON_QUESTION_12, ICON_QUESTION_16, ICON_QUESTION_24, ICON_QUESTION_FILLED_12, ICON_QUESTION_FILLED_16, ICON_QUESTION_FILLED_24, ICON_RECURRING_12, ICON_RECURRING_16, ICON_RECURRING_24, ICON_RECURRING_HUB_24, ICON_REPEAT_16, ICON_REPLAY_HERO_40, ICON_RESEND_16, ICON_RESEND_24, ICON_RETIREMENT_12, ICON_RETIREMENT_16, ICON_RETIREMENT_24, ICON_RETIREMENT_32, ICON_RHW_BROWSER_TAB_24, ICON_RHW_CHART_TAB_24, ICON_RHW_SEARCH_TAB_24, ICON_RISK_AND_UNCERTAINTY_24, ICON_ROBINHOOD_12, ICON_ROBINHOOD_16, ICON_ROBINHOOD_24, ICON_ROLLING_POSITION_12, ICON_ROLLING_POSITION_16, ICON_ROLLING_POSITION_24, ICON_SCAN_16, ICON_SCAN_24, ICON_SEARCH_16, ICON_SEARCH_24, ICON_SETTINGS_12, ICON_SETTINGS_16, ICON_SETTINGS_24, ICON_SHARE_ANDROID_16, ICON_SHARE_ANDROID_24, ICON_SHARE_IOS_16, ICON_SHARE_IOS_24, ICON_SMILEY_24, ICON_SOCIAL_CREATE_POST_16, ICON_SORT_12, ICON_SOUND_OFF_24, ICON_SOUND_ON_24, ICON_SPARKLE_BULLET_12, ICON_SPARKLE_BULLET_16, ICON_SPARKLE_BULLET_24, ICON_SPARKLE_DOUBLE_16, ICON_SPARKLE_DOUBLE_24, ICON_SPEED_DOWN_24, ICON_SPEED_UP_24, ICON_STAR_FILLED_12, ICON_STAR_FILLED_16, ICON_STAR_FILLED_24, ICON_STAR_OUTLINE_16, ICON_STAR_OUTLINE_24, ICON_STAR_PASSWORD_16, ICON_STEWARDSHIP_24, ICON_STOCK_DOWN_12, ICON_STOCK_DOWN_16, ICON_STOCK_DOWN_24, ICON_STOCK_UP_12, ICON_STOCK_UP_16, ICON_STOCK_UP_24, ICON_STOPWATCH_16, ICON_STOPWATCH_24, ICON_STOPWATCH_32, ICON_STRATEGY_OUTLOOK_24, ICON_SWIPE_DOWN_16, ICON_SWIPE_DOWN_24, ICON_SWIPE_UP_16, ICON_SWIPE_UP_24, ICON_SWITCH_16, ICON_SWITCH_24, ICON_TAB_ACCOUNT_32, ICON_TAB_CONTENT_32, ICON_TAB_CRYPTO_32, ICON_TAB_CRYPTO_C_32, ICON_TAB_GOLD_32, ICON_TAB_INVEST_32, ICON_TAB_ISA_32, ICON_TAB_MESSAGES_32, ICON_TAB_MONEY_32, ICON_TAB_RETIREMENT_32, ICON_TAB_SEARCH_32, ICON_TAB_SOCIAL_32, ICON_TAB_WATCHLIST_32, ICON_TAG_16, ICON_TAG_24, ICON_TAX_LOTS_LONG_TERM_16, ICON_TAX_LOTS_SHORT_TERM_16, ICON_TECHNOLOGY_12, ICON_TECHNOLOGY_24, ICON_THUMBPRINT_16, ICON_THUMBPRINT_24, ICON_THUMBS_DOWN_16, ICON_THUMBS_DOWN_24, ICON_THUMBS_UP_16, ICON_THUMBS_UP_24, ICON_TICKET_16, ICON_TICKET_24, ICON_TOUCH_ID_ANDROID_16, ICON_TOUCH_ID_ANDROID_24, ICON_TRADE_SOCIAL_FILLED_20, ICON_TRADE_SOCIAL_OUTLINE_20, ICON_TRANSFERS_12, ICON_TRANSFERS_16, ICON_TRANSFERS_24, ICON_TRANSPORT_24, ICON_TRASH_12, ICON_TRASH_16, ICON_TRASH_24, ICON_TRIANGLE_ALERT_16, ICON_TRIANGLE_ALERT_24, ICON_TUNER_16, ICON_TUNER_24, ICON_UNLOCK_12, ICON_UNLOCK_16, ICON_UNLOCK_24, ICON_UPLOAD_24, ICON_VIDEO_CALL_12, ICON_VIDEO_CALL_16, ICON_VIDEO_CALL_24, ICON_VIDEO_FAST_FORWARD_24, ICON_VIDEO_REPLAY_24, ICON_VIDEO_REWIND_15_32, ICON_VIDEO_REWIND_24, ICON_VIDEO_SKIP_15_32, ICON_WALLET_24, ICON_WALLET_32, ICON_WALLETCONNECT_16, ICON_WALLETCONNECT_24, ICON_WC_SCAN_24, ICON_WITHDRAW_16, ICON_WITHDRAW_24, ICON_ZOOM_IN_24, ICON_ZOOM_OUT_24};
    }

    @JvmStatic
    public static final Icon fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<Icon> getEntries() {
        return $ENTRIES;
    }

    private Icon(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final Icon icon = new Icon("ICON_UNSPECIFIED", 0, 0);
        ICON_UNSPECIFIED = icon;
        ICON_ACCOUNT_SUMMARY_12 = new Icon("ICON_ACCOUNT_SUMMARY_12", 1, 1);
        ICON_ACCOUNT_SUMMARY_24 = new Icon("ICON_ACCOUNT_SUMMARY_24", 2, 2);
        ICON_ACTION_REMOVE_24 = new Icon("ICON_ACTION_REMOVE_24", 3, 3);
        ICON_ACTIONS_ALERTS_32 = new Icon("ICON_ACTIONS_ALERTS_32", 4, 4);
        ICON_ACTIONS_ATM_32 = new Icon("ICON_ACTIONS_ATM_32", 5, 5);
        ICON_ACTIONS_CHECK_32 = new Icon("ICON_ACTIONS_CHECK_32", 6, 6);
        ICON_ACTIONS_STATEMENTS_32 = new Icon("ICON_ACTIONS_STATEMENTS_32", 7, 7);
        ICON_ACTIONS_TRANSFERS_32 = new Icon("ICON_ACTIONS_TRANSFERS_32", 8, 8);
        ICON_AGENT_16 = new Icon("ICON_AGENT_16", 9, 9);
        ICON_AGENT_24 = new Icon("ICON_AGENT_24", 10, 10);
        ICON_ALERT_12 = new Icon("ICON_ALERT_12", 11, 11);
        ICON_ALERT_16 = new Icon("ICON_ALERT_16", 12, 12);
        ICON_ALERT_24 = new Icon("ICON_ALERT_24", 13, 13);
        ICON_ALERT_FILLED_12 = new Icon("ICON_ALERT_FILLED_12", 14, 14);
        ICON_ALERT_FILLED_16 = new Icon("ICON_ALERT_FILLED_16", 15, 15);
        ICON_ALERT_FILLED_24 = new Icon("ICON_ALERT_FILLED_24", 16, 16);
        ICON_ALL_DAY_TRADING_12 = new Icon("ICON_ALL_DAY_TRADING_12", 17, 17);
        ICON_ALL_DAY_TRADING_16 = new Icon("ICON_ALL_DAY_TRADING_16", 18, 18);
        ICON_ALL_DAY_TRADING_24 = new Icon("ICON_ALL_DAY_TRADING_24", 19, 19);
        ICON_ANNOUNCEMENT_12 = new Icon("ICON_ANNOUNCEMENT_12", 20, 469);
        ICON_ANNOUNCEMENT_16 = new Icon("ICON_ANNOUNCEMENT_16", 21, 20);
        ICON_ANNOUNCEMENT_24 = new Icon("ICON_ANNOUNCEMENT_24", 22, 21);
        ICON_ARCHIVE_24 = new Icon("ICON_ARCHIVE_24", 23, 22);
        ICON_ARROW_DIAGONAL_UP_16 = new Icon("ICON_ARROW_DIAGONAL_UP_16", 24, 453);
        ICON_ARROW_DOWN_12 = new Icon("ICON_ARROW_DOWN_12", 25, 23);
        ICON_ARROW_DOWN_16 = new Icon("ICON_ARROW_DOWN_16", 26, 24);
        ICON_ARROW_DOWN_24 = new Icon("ICON_ARROW_DOWN_24", 27, 25);
        ICON_ARROW_DOWN_FILL_12 = new Icon("ICON_ARROW_DOWN_FILL_12", 28, 26);
        ICON_ARROW_DOWN_FILL_16 = new Icon("ICON_ARROW_DOWN_FILL_16", 29, 27);
        ICON_ARROW_DOWN_FILL_24 = new Icon("ICON_ARROW_DOWN_FILL_24", 30, 28);
        ICON_ARROW_DOWN_RIGHT_12 = new Icon("ICON_ARROW_DOWN_RIGHT_12", 31, 470);
        ICON_ARROW_LEFT_12 = new Icon("ICON_ARROW_LEFT_12", 32, 29);
        ICON_ARROW_LEFT_16 = new Icon("ICON_ARROW_LEFT_16", 33, 30);
        ICON_ARROW_LEFT_24 = new Icon("ICON_ARROW_LEFT_24", 34, 31);
        ICON_ARROW_LEFT_FILL_12 = new Icon("ICON_ARROW_LEFT_FILL_12", 35, 32);
        ICON_ARROW_LEFT_FILL_16 = new Icon("ICON_ARROW_LEFT_FILL_16", 36, 33);
        ICON_ARROW_LEFT_FILL_24 = new Icon("ICON_ARROW_LEFT_FILL_24", 37, 34);
        ICON_ARROW_RIGHT_12 = new Icon("ICON_ARROW_RIGHT_12", 38, 35);
        ICON_ARROW_RIGHT_16 = new Icon("ICON_ARROW_RIGHT_16", 39, 36);
        ICON_ARROW_RIGHT_24 = new Icon("ICON_ARROW_RIGHT_24", 40, 37);
        ICON_ARROW_RIGHT_FILL_12 = new Icon("ICON_ARROW_RIGHT_FILL_12", 41, 38);
        ICON_ARROW_RIGHT_FILL_16 = new Icon("ICON_ARROW_RIGHT_FILL_16", 42, 39);
        ICON_ARROW_RIGHT_FILL_24 = new Icon("ICON_ARROW_RIGHT_FILL_24", 43, 40);
        ICON_ARROW_UP_12 = new Icon("ICON_ARROW_UP_12", 44, 41);
        ICON_ARROW_UP_16 = new Icon("ICON_ARROW_UP_16", 45, 42);
        ICON_ARROW_UP_24 = new Icon("ICON_ARROW_UP_24", 46, 43);
        ICON_ARROW_UP_FILL_12 = new Icon("ICON_ARROW_UP_FILL_12", 47, 44);
        ICON_ARROW_UP_FILL_16 = new Icon("ICON_ARROW_UP_FILL_16", 48, 45);
        ICON_ARROW_UP_FILL_24 = new Icon("ICON_ARROW_UP_FILL_24", 49, 46);
        ICON_ARROW_UP_RIGHT_12 = new Icon("ICON_ARROW_UP_RIGHT_12", 50, 471);
        ICON_ARROW_UP_RIGHT_16 = new Icon("ICON_ARROW_UP_RIGHT_16", 51, 446);
        ICON_ATTACH_24 = new Icon("ICON_ATTACH_24", 52, 47);
        ICON_BACKSPACE_24 = new Icon("ICON_BACKSPACE_24", 53, 48);
        ICON_BACKSPACE_32 = new Icon("ICON_BACKSPACE_32", 54, 49);
        ICON_BANKING_16 = new Icon("ICON_BANKING_16", 55, 50);
        ICON_BANKING_24 = new Icon("ICON_BANKING_24", 56, 51);
        ICON_BANKING_32 = new Icon("ICON_BANKING_32", 57, 52);
        ICON_BAR_CHART_16 = new Icon("ICON_BAR_CHART_16", 58, 457);
        ICON_BAR_CHART_24 = new Icon("ICON_BAR_CHART_24", 59, 454);
        ICON_BOOKMARK_POST_FILLED_16 = new Icon("ICON_BOOKMARK_POST_FILLED_16", 60, 472);
        ICON_BOOKMARK_POST_OUTLINE_16 = new Icon("ICON_BOOKMARK_POST_OUTLINE_16", 61, 473);
        ICON_BUBBLE_CHECKED_12 = new Icon("ICON_BUBBLE_CHECKED_12", 62, 53);
        ICON_BUBBLE_CHECKED_16 = new Icon("ICON_BUBBLE_CHECKED_16", 63, 54);
        ICON_BUBBLE_CHECKED_24 = new Icon("ICON_BUBBLE_CHECKED_24", 64, 55);
        ICON_BUBBLE_DOT_24 = new Icon("ICON_BUBBLE_DOT_24", 65, 56);
        ICON_BUBBLE_EMPTY_24 = new Icon("ICON_BUBBLE_EMPTY_24", 66, 57);
        ICON_BUBBLE_MINUS_16 = new Icon("ICON_BUBBLE_MINUS_16", 67, 58);
        ICON_BUBBLE_MINUS_24 = new Icon("ICON_BUBBLE_MINUS_24", 68, 59);
        ICON_BUBBLE_PAUSE_24 = new Icon("ICON_BUBBLE_PAUSE_24", 69, 60);
        ICON_BUBBLE_PLUS_16 = new Icon("ICON_BUBBLE_PLUS_16", 70, 61);
        ICON_BUBBLE_PLUS_24 = new Icon("ICON_BUBBLE_PLUS_24", 71, 62);
        ICON_BUBBLE_PLUS_FILLED_24 = new Icon("ICON_BUBBLE_PLUS_FILLED_24", 72, 63);
        ICON_BUBBLE_RADIO_BUTTON_24 = new Icon("ICON_BUBBLE_RADIO_BUTTON_24", 73, 64);
        ICON_BUBBLE_REMOVE_16 = new Icon("ICON_BUBBLE_REMOVE_16", 74, 65);
        ICON_BUBBLE_REMOVE_24 = new Icon("ICON_BUBBLE_REMOVE_24", 75, 66);
        ICON_BUBBLE_REMOVE_FILLED_16 = new Icon("ICON_BUBBLE_REMOVE_FILLED_16", 76, 67);
        ICON_BUBBLE_REMOVE_FILLED_24 = new Icon("ICON_BUBBLE_REMOVE_FILLED_24", 77, 68);
        ICON_BUBBLE_REVERSE_24 = new Icon("ICON_BUBBLE_REVERSE_24", 78, 69);
        ICON_BUBBLE_UK_POUNDS_16 = new Icon("ICON_BUBBLE_UK_POUNDS_16", 79, 70);
        ICON_BUBBLE_UK_POUNDS_24 = new Icon("ICON_BUBBLE_UK_POUNDS_24", 80, 71);
        ICON_BUBBLE_UK_POUNDS_FILLED_16 = new Icon("ICON_BUBBLE_UK_POUNDS_FILLED_16", 81, 72);
        ICON_BUBBLE_UK_POUNDS_FILLED_24 = new Icon("ICON_BUBBLE_UK_POUNDS_FILLED_24", 82, 73);
        ICON_BUILDER_16 = new Icon("ICON_BUILDER_16", 83, 74);
        ICON_BUILDER_24 = new Icon("ICON_BUILDER_24", 84, 75);
        ICON_CALENDAR_12 = new Icon("ICON_CALENDAR_12", 85, 498);
        ICON_CALENDAR_16 = new Icon("ICON_CALENDAR_16", 86, 76);
        ICON_CALENDAR_24 = new Icon("ICON_CALENDAR_24", 87, 77);
        ICON_CAMERA_16 = new Icon("ICON_CAMERA_16", 88, 78);
        ICON_CAMERA_24 = new Icon("ICON_CAMERA_24", 89, 79);
        ICON_CARET_DOWN_12 = new Icon("ICON_CARET_DOWN_12", 90, 80);
        ICON_CARET_DOWN_16 = new Icon("ICON_CARET_DOWN_16", 91, 81);
        ICON_CARET_DOWN_24 = new Icon("ICON_CARET_DOWN_24", 92, 82);
        ICON_CARET_LEFT_12 = new Icon("ICON_CARET_LEFT_12", 93, 83);
        ICON_CARET_LEFT_16 = new Icon("ICON_CARET_LEFT_16", 94, 84);
        ICON_CARET_LEFT_24 = new Icon("ICON_CARET_LEFT_24", 95, 85);
        ICON_CARET_RIGHT_12 = new Icon("ICON_CARET_RIGHT_12", 96, 86);
        ICON_CARET_RIGHT_16 = new Icon("ICON_CARET_RIGHT_16", 97, 87);
        ICON_CARET_RIGHT_24 = new Icon("ICON_CARET_RIGHT_24", 98, 88);
        ICON_CARET_UP_12 = new Icon("ICON_CARET_UP_12", 99, 89);
        ICON_CARET_UP_16 = new Icon("ICON_CARET_UP_16", 100, 90);
        ICON_CARET_UP_24 = new Icon("ICON_CARET_UP_24", 101, 91);
        ICON_CASH_24 = new Icon("ICON_CASH_24", 102, 92);
        ICON_CHART_16 = new Icon("ICON_CHART_16", 103, 93);
        ICON_CHART_24 = new Icon("ICON_CHART_24", 104, 94);
        ICON_CHART_BAR_24 = new Icon("ICON_CHART_BAR_24", 105, 458);
        ICON_CHART_CANDLESTICKS_16 = new Icon("ICON_CHART_CANDLESTICKS_16", 106, 95);
        ICON_CHART_CANDLESTICKS_24 = new Icon("ICON_CHART_CANDLESTICKS_24", 107, 96);
        ICON_CHART_LINE_16 = new Icon("ICON_CHART_LINE_16", 108, 97);
        ICON_CHART_LINE_24 = new Icon("ICON_CHART_LINE_24", 109, 98);
        ICON_CHART_STACKED_BAR_16 = new Icon("ICON_CHART_STACKED_BAR_16", 110, 499);
        ICON_CHAT_16 = new Icon("ICON_CHAT_16", 111, 99);
        ICON_CHAT_24 = new Icon("ICON_CHAT_24", 112, 100);
        ICON_CHATBOT_16 = new Icon("ICON_CHATBOT_16", 113, 101);
        ICON_CHATBOT_24 = new Icon("ICON_CHATBOT_24", 114, 102);
        ICON_CHECKBOX_EMPTY_16 = new Icon("ICON_CHECKBOX_EMPTY_16", 115, 103);
        ICON_CHECKBOX_EMPTY_24 = new Icon("ICON_CHECKBOX_EMPTY_24", 116, 104);
        ICON_CHECKBOX_FILLED_16 = new Icon("ICON_CHECKBOX_FILLED_16", 117, 105);
        ICON_CHECKBOX_FILLED_24 = new Icon("ICON_CHECKBOX_FILLED_24", 118, 106);
        ICON_CHECKMARK_12 = new Icon("ICON_CHECKMARK_12", 119, 107);
        ICON_CHECKMARK_16 = new Icon("ICON_CHECKMARK_16", 120, 108);
        ICON_CHECKMARK_24 = new Icon("ICON_CHECKMARK_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE, 109);
        ICON_CLIPBOARD_16 = new Icon("ICON_CLIPBOARD_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, 110);
        ICON_CLIPBOARD_24 = new Icon("ICON_CLIPBOARD_24", 123, 111);
        ICON_CLOCK_12 = new Icon("ICON_CLOCK_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 112);
        ICON_CLOCK_16 = new Icon("ICON_CLOCK_16", 125, 113);
        ICON_CLOCK_24 = new Icon("ICON_CLOCK_24", EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 114);
        ICON_CLOSE_12 = new Icon("ICON_CLOSE_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, 115);
        ICON_CLOSE_16 = new Icon("ICON_CLOSE_16", 128, 116);
        ICON_CLOSE_24 = new Icon("ICON_CLOSE_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, 117);
        ICON_CLOUD_16 = new Icon("ICON_CLOUD_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, 118);
        ICON_CLOUD_24 = new Icon("ICON_CLOUD_24", 131, 119);
        ICON_COLLAPSE_16 = new Icon("ICON_COLLAPSE_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, 120);
        ICON_COLLAPSE_24 = new Icon("ICON_COLLAPSE_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE);
        ICON_COMMENT_FILLED_16 = new Icon("ICON_COMMENT_FILLED_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE, 474);
        ICON_COMMENT_FILLED_20 = new Icon("ICON_COMMENT_FILLED_20", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE, 505);
        ICON_COMMENT_OUTLINE_16 = new Icon("ICON_COMMENT_OUTLINE_16", 136, 475);
        ICON_COMMENT_OUTLINE_20 = new Icon("ICON_COMMENT_OUTLINE_20", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE, 506);
        ICON_CONCIERGE_24 = new Icon("ICON_CONCIERGE_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, 507);
        ICON_CONSUMER_GOODS_12 = new Icon("ICON_CONSUMER_GOODS_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
        ICON_CONSUMER_GOODS_16 = new Icon("ICON_CONSUMER_GOODS_16", EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, 123);
        ICON_CONSUMER_GOODS_24 = new Icon("ICON_CONSUMER_GOODS_24", EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
        ICON_CONTROLS_16 = new Icon("ICON_CONTROLS_16", EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE, 125);
        ICON_CONTROLS_24 = new Icon("ICON_CONTROLS_24", EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        ICON_CONVERSATION_16 = new Icon("ICON_CONVERSATION_16", 144, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE);
        ICON_CONVERSATION_24 = new Icon("ICON_CONVERSATION_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE, 128);
        ICON_CONVERT_24 = new Icon("ICON_CONVERT_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE, 476);
        ICON_COPY_12 = new Icon("ICON_COPY_12", 147, EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE);
        ICON_COPY_16 = new Icon("ICON_COPY_16", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE);
        ICON_COPY_24 = new Icon("ICON_COPY_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE, 131);
        ICON_COPY_TRADE_FILLED_16 = new Icon("ICON_COPY_TRADE_FILLED_16", 150, 477);
        ICON_COPY_TRADE_OUTLINE_16 = new Icon("ICON_COPY_TRADE_OUTLINE_16", 151, 478);
        ICON_CORN_FUTURES_24 = new Icon("ICON_CORN_FUTURES_24", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, 479);
        ICON_CORPORATE_16 = new Icon("ICON_CORPORATE_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE);
        ICON_CORPORATE_24 = new Icon("ICON_CORPORATE_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE);
        ICON_CORTEX_12 = new Icon("ICON_CORTEX_12", 155, 480);
        ICON_CORTEX_16 = new Icon("ICON_CORTEX_16", 156, 481);
        ICON_CORTEX_24 = new Icon("ICON_CORTEX_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE, 482);
        ICON_CRYPTO_12 = new Icon("ICON_CRYPTO_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE);
        ICON_CRYPTO_16 = new Icon("ICON_CRYPTO_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE);
        ICON_CRYPTO_24 = new Icon("ICON_CRYPTO_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, 136);
        ICON_CRYPTO_C_12 = new Icon("ICON_CRYPTO_C_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE);
        ICON_CRYPTO_C_16 = new Icon("ICON_CRYPTO_C_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE);
        ICON_CRYPTO_C_24 = new Icon("ICON_CRYPTO_C_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE);
        ICON_CUSTODIAL_16 = new Icon("ICON_CUSTODIAL_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, 500);
        ICON_CUSTODIAL_24 = new Icon("ICON_CUSTODIAL_24", 165, 501);
        ICON_DEPOSIT_16 = new Icon("ICON_DEPOSIT_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE, EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE);
        ICON_DEPOSIT_24 = new Icon("ICON_DEPOSIT_24", 167, EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE);
        ICON_DINING_24 = new Icon("ICON_DINING_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE);
        ICON_DISCLOSURES_16 = new Icon("ICON_DISCLOSURES_16", EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, 483);
        ICON_DISCLOSURES_24 = new Icon("ICON_DISCLOSURES_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE);
        ICON_DIVIDEND_16 = new Icon("ICON_DIVIDEND_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE, 144);
        ICON_DIVIDEND_24 = new Icon("ICON_DIVIDEND_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE);
        ICON_DOCUMENTS_24 = new Icon("ICON_DOCUMENTS_24", EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE);
        ICON_DOLLAR_SIGN_12 = new Icon("ICON_DOLLAR_SIGN_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, 147);
        ICON_DOLLAR_SIGN_16 = new Icon("ICON_DOLLAR_SIGN_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE);
        ICON_DOLLAR_SIGN_24 = new Icon("ICON_DOLLAR_SIGN_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE);
        ICON_DOT_12 = new Icon("ICON_DOT_12", EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, 150);
        ICON_DOT_16 = new Icon("ICON_DOT_16", EnumC7081g.f2773x8d9721ad, 151);
        ICON_DOT_24 = new Icon("ICON_DOT_24", EnumC7081g.f2780x600b66fe, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE);
        ICON_DOTS_16 = new Icon("ICON_DOTS_16", EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE);
        ICON_DOTS_24 = new Icon("ICON_DOTS_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE);
        ICON_DOTS_ANDROID_16 = new Icon("ICON_DOTS_ANDROID_16", 182, 155);
        ICON_DOTS_ANDROID_24 = new Icon("ICON_DOTS_ANDROID_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE, 156);
        ICON_DOWNLOAD_12 = new Icon("ICON_DOWNLOAD_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE);
        ICON_DOWNLOAD_16 = new Icon("ICON_DOWNLOAD_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE);
        ICON_DOWNLOAD_24 = new Icon("ICON_DOWNLOAD_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE);
        ICON_DRAG_12 = new Icon("ICON_DRAG_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
        ICON_DRAG_16 = new Icon("ICON_DRAG_16", 188, EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE);
        ICON_DRAG_24 = new Icon("ICON_DRAG_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE);
        ICON_DROPDOWN_12 = new Icon("ICON_DROPDOWN_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE);
        ICON_DROPDOWN_16 = new Icon("ICON_DROPDOWN_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE);
        ICON_DROPDOWN_24 = new Icon("ICON_DROPDOWN_24", 192, 165);
        ICON_ECONOMIC_MOAT_24 = new Icon("ICON_ECONOMIC_MOAT_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE);
        ICON_EDIT_12 = new Icon("ICON_EDIT_12", EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE, 167);
        ICON_EDIT_16 = new Icon("ICON_EDIT_16", EnumC7081g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
        ICON_EDIT_24 = new Icon("ICON_EDIT_24", EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE);
        ICON_EDIT_SURFACE_24 = new Icon("ICON_EDIT_SURFACE_24", EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE);
        ICON_EMAIL_FILLED_16 = new Icon("ICON_EMAIL_FILLED_16", EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE);
        ICON_EMAIL_FILLED_24 = new Icon("ICON_EMAIL_FILLED_24", EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE);
        ICON_EMAIL_OUTLINE_24 = new Icon("ICON_EMAIL_OUTLINE_24", 200, EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE);
        ICON_ENERGY_12 = new Icon("ICON_ENERGY_12", 201, EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE);
        ICON_ENERGY_24 = new Icon("ICON_ENERGY_24", 202, EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE);
        ICON_ENTERTAINMENT_24 = new Icon("ICON_ENTERTAINMENT_24", EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE);
        ICON_ETF_12 = new Icon("ICON_ETF_12", 204, EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE);
        ICON_ETF_24 = new Icon("ICON_ETF_24", EnumC7081g.SDK_ASSET_ICON_CLIPBOARD_VALUE, EnumC7081g.f2773x8d9721ad);
        ICON_EURO_SIGN_12 = new Icon("ICON_EURO_SIGN_12", EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE, 447);
        ICON_EURO_SIGN_16 = new Icon("ICON_EURO_SIGN_16", EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE, 448);
        ICON_EURO_SIGN_24 = new Icon("ICON_EURO_SIGN_24", EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE, 449);
        ICON_EXCLAMATION_12 = new Icon("ICON_EXCLAMATION_12", EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE, EnumC7081g.f2780x600b66fe);
        ICON_EXCLAMATION_16 = new Icon("ICON_EXCLAMATION_16", EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE);
        ICON_EXCLAMATION_24 = new Icon("ICON_EXCLAMATION_24", 211, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE);
        ICON_EXPAND_16 = new Icon("ICON_EXPAND_16", EnumC7081g.SDK_ASSET_ICON_OVERRIDE_VALUE, 182);
        ICON_EXPAND_24 = new Icon("ICON_EXPAND_24", EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE);
        ICON_EYE_16 = new Icon("ICON_EYE_16", EnumC7081g.SDK_ASSET_ICON_PIN_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE);
        ICON_EYE_24 = new Icon("ICON_EYE_24", EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE);
        ICON_EYE_CLOSED_16 = new Icon("ICON_EYE_CLOSED_16", EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE);
        ICON_EYE_CLOSED_24 = new Icon("ICON_EYE_CLOSED_24", EnumC7081g.SDK_ASSET_ICON_PROGRESS_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE);
        ICON_FACE_ID_ANDROID_16 = new Icon("ICON_FACE_ID_ANDROID_16", EnumC7081g.SDK_ASSET_ICON_QUESTION_VALUE, 188);
        ICON_FACE_ID_ANDROID_24 = new Icon("ICON_FACE_ID_ANDROID_24", EnumC7081g.SDK_ASSET_ICON_REJECTED_REC_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE);
        ICON_FACE_ID_IOS_16 = new Icon("ICON_FACE_ID_IOS_16", EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE);
        ICON_FACE_ID_IOS_24 = new Icon("ICON_FACE_ID_IOS_24", EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE);
        ICON_FAIR_VALUE_24 = new Icon("ICON_FAIR_VALUE_24", EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE, 192);
        ICON_FEATURED_16 = new Icon("ICON_FEATURED_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, 484);
        ICON_FEATURED_24 = new Icon("ICON_FEATURED_24", 224, 485);
        ICON_FILTER_12 = new Icon("ICON_FILTER_12", 225, EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE);
        ICON_FILTER_16 = new Icon("ICON_FILTER_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE);
        ICON_FILTER_24 = new Icon("ICON_FILTER_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ICON_ALERT_WARNING_VALUE);
        ICON_FINANCE_12 = new Icon("ICON_FINANCE_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE);
        ICON_FINANCE_16 = new Icon("ICON_FINANCE_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, 459);
        ICON_FINANCE_24 = new Icon("ICON_FINANCE_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE);
        ICON_FLASH_OFF_24 = new Icon("ICON_FLASH_OFF_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE, EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE);
        ICON_FLASH_ON_24 = new Icon("ICON_FLASH_ON_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE);
        ICON_FLASHLIGHT_OFF_24 = new Icon("ICON_FLASHLIGHT_OFF_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 200);
        ICON_FLASHLIGHT_ON_24 = new Icon("ICON_FLASHLIGHT_ON_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, 201);
        ICON_FLOWER_16 = new Icon("ICON_FLOWER_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, 202);
        ICON_FOLDER_16 = new Icon("ICON_FOLDER_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE);
        ICON_FOLDER_24 = new Icon("ICON_FOLDER_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, 204);
        ICON_FULLSCREEN_ENTER_24 = new Icon("ICON_FULLSCREEN_ENTER_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, EnumC7081g.SDK_ASSET_ICON_CLIPBOARD_VALUE);
        ICON_FULLSCREEN_EXIT_24 = new Icon("ICON_FULLSCREEN_EXIT_24", 239, EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE);
        ICON_GIFT_12 = new Icon("ICON_GIFT_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE);
        ICON_GIFT_16 = new Icon("ICON_GIFT_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE);
        ICON_GIFT_24 = new Icon("ICON_GIFT_24", EnumC7081g.f2778x3356acf6, EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE);
        ICON_GOLD_16 = new Icon("ICON_GOLD_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, 441);
        ICON_GOLD_24 = new Icon("ICON_GOLD_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, 450);
        ICON_GROCERIES_24 = new Icon("ICON_GROCERIES_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE);
        ICON_HAMBURGER_12 = new Icon("ICON_HAMBURGER_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, 211);
        ICON_HAMBURGER_16 = new Icon("ICON_HAMBURGER_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, EnumC7081g.SDK_ASSET_ICON_OVERRIDE_VALUE);
        ICON_HAMBURGER_24 = new Icon("ICON_HAMBURGER_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE);
        ICON_HEALTHCARE_12 = new Icon("ICON_HEALTHCARE_12", EnumC7081g.f2779x59907a3d, EnumC7081g.SDK_ASSET_ICON_PIN_VALUE);
        ICON_HEALTHCARE_24 = new Icon("ICON_HEALTHCARE_24", 250, EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE);
        ICON_HELP_24 = new Icon("ICON_HELP_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
        ICON_HISTORY_16 = new Icon("ICON_HISTORY_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ICON_PROGRESS_VALUE);
        ICON_HISTORY_24 = new Icon("ICON_HISTORY_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ICON_QUESTION_VALUE);
        ICON_HOME_24 = new Icon("ICON_HOME_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ICON_REJECTED_REC_VALUE);
        ICON_HOSPITALITY_12 = new Icon("ICON_HOSPITALITY_12", 255, EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE);
        ICON_HOSPITALITY_24 = new Icon("ICON_HOSPITALITY_24", 256, EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE);
        ICON_HOURGLASS_12 = new Icon("ICON_HOURGLASS_12", EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE, 486);
        ICON_HOURGLASS_16 = new Icon("ICON_HOURGLASS_16", EnumC7081g.SDK_ASSET_HEADER_BOLT_VALUE, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
        ICON_HOURGLASS_24 = new Icon("ICON_HOURGLASS_24", EnumC7081g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
        ICON_ICLOUD_RESTORE_16 = new Icon("ICON_ICLOUD_RESTORE_16", EnumC7081g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE, 460);
        ICON_ICLOUD_RESTORE_24 = new Icon("ICON_ICLOUD_RESTORE_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE, 224);
        ICON_IMAGE_16 = new Icon("ICON_IMAGE_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, 225);
        ICON_IMAGE_24 = new Icon("ICON_IMAGE_24", EnumC7081g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE);
        ICON_IMAGE_FAIL_16 = new Icon("ICON_IMAGE_FAIL_16", EnumC7081g.SDK_ASSET_ICON_PLAID_LOGO_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE);
        ICON_IMAGE_FAIL_24 = new Icon("ICON_IMAGE_FAIL_24", EnumC7081g.SDK_ASSET_HEADER_SHIELD_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE);
        ICON_INFO_12 = new Icon("ICON_INFO_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE);
        ICON_INFO_16 = new Icon("ICON_INFO_16", EnumC7081g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE);
        ICON_INFO_24 = new Icon("ICON_INFO_24", EnumC7081g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE);
        ICON_INFO_FILLED_12 = new Icon("ICON_INFO_FILLED_12", EnumC7081g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
        ICON_INFO_FILLED_16 = new Icon("ICON_INFO_FILLED_16", EnumC7081g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE);
        ICON_INFO_FILLED_24 = new Icon("ICON_INFO_FILLED_24", 271, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE);
        ICON_ISA_16 = new Icon("ICON_ISA_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, 508);
        ICON_ISA_24 = new Icon("ICON_ISA_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, 509);
        ICON_JOINT_ACCOUNT_12 = new Icon("ICON_JOINT_ACCOUNT_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE, 438);
        ICON_JOINT_ACCOUNT_16 = new Icon("ICON_JOINT_ACCOUNT_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE, 439);
        ICON_JOINT_ACCOUNT_24 = new Icon("ICON_JOINT_ACCOUNT_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE, 440);
        ICON_L2_HEADER_ARROW_24 = new Icon("ICON_L2_HEADER_ARROW_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE);
        ICON_LIGHTBULB_16 = new Icon("ICON_LIGHTBULB_16", EnumC7081g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE);
        ICON_LIGHTBULB_24 = new Icon("ICON_LIGHTBULB_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE);
        ICON_LIGHTNING_12 = new Icon("ICON_LIGHTNING_12", 280, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE);
        ICON_LIGHTNING_16 = new Icon("ICON_LIGHTNING_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_VALUE, 239);
        ICON_LIGHTNING_24 = new Icon("ICON_LIGHTNING_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
        ICON_LIGHTNING_OFF_16 = new Icon("ICON_LIGHTNING_OFF_16", 283, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE);
        ICON_LIKE_POST_FILLED_16 = new Icon("ICON_LIKE_POST_FILLED_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE, 487);
        ICON_LIKE_POST_FILLED_20 = new Icon("ICON_LIKE_POST_FILLED_20", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE, 510);
        ICON_LIKE_POST_OUTLINE_16 = new Icon("ICON_LIKE_POST_OUTLINE_16", EnumC7081g.f2777x89a9e432, 488);
        ICON_LIKE_POST_OUTLINE_20 = new Icon("ICON_LIKE_POST_OUTLINE_20", EnumC7081g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, 511);
        ICON_LIKE_POST_OUTLINE_24 = new Icon("ICON_LIKE_POST_OUTLINE_24", 288, 489);
        ICON_LINK_16 = new Icon("ICON_LINK_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE, EnumC7081g.f2778x3356acf6);
        ICON_LINK_24 = new Icon("ICON_LINK_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE);
        ICON_LINK_OUT_12 = new Icon("ICON_LINK_OUT_12", EnumC7081g.f2776x87e624cb, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE);
        ICON_LINK_OUT_16 = new Icon("ICON_LINK_OUT_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE);
        ICON_LINK_OUT_24 = new Icon("ICON_LINK_OUT_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE);
        ICON_LIST_24 = new Icon("ICON_LIST_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE, 461);
        ICON_LOCATION_FILL_16 = new Icon("ICON_LOCATION_FILL_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE);
        ICON_LOCATION_FILL_24 = new Icon("ICON_LOCATION_FILL_24", EnumC7081g.SDK_ASSET_LOADING_INDICATOR_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
        ICON_LOCATION_OUTLINE_24 = new Icon("ICON_LOCATION_OUTLINE_24", EnumC7081g.SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE, EnumC7081g.f2779x59907a3d);
        ICON_LOCK_12 = new Icon("ICON_LOCK_12", EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE, 250);
        ICON_LOCK_16 = new Icon("ICON_LOCK_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE);
        ICON_LOCK_24 = new Icon("ICON_LOCK_24", 300, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
        ICON_LOG_OUT_24 = new Icon("ICON_LOG_OUT_24", EnumC7081g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
        ICON_MANAGED_ACCOUNTS_16 = new Icon("ICON_MANAGED_ACCOUNTS_16", 302, 462);
        ICON_MANAGED_ACCOUNTS_24 = new Icon("ICON_MANAGED_ACCOUNTS_24", EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE, 463);
        ICON_MANAGED_INDIVIDUAL_24 = new Icon("ICON_MANAGED_INDIVIDUAL_24", EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE, 464);
        ICON_MANAGED_JOINT_24 = new Icon("ICON_MANAGED_JOINT_24", EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE, 465);
        ICON_MANAGED_RETIREMENT_24 = new Icon("ICON_MANAGED_RETIREMENT_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE, 466);
        ICON_MANUFACTURING_12 = new Icon("ICON_MANUFACTURING_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
        ICON_MANUFACTURING_24 = new Icon("ICON_MANUFACTURING_24", EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE, 255);
        ICON_MAPS_24 = new Icon("ICON_MAPS_24", EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE, 256);
        ICON_MARGIN_12 = new Icon("ICON_MARGIN_12", EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE, EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
        ICON_MARGIN_16 = new Icon("ICON_MARGIN_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE, EnumC7081g.SDK_ASSET_HEADER_BOLT_VALUE);
        ICON_MARGIN_24 = new Icon("ICON_MARGIN_24", EnumC7081g.f2774x74902ae0, EnumC7081g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE);
        ICON_MAXIMUM_16 = new Icon("ICON_MAXIMUM_16", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE, EnumC7081g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE);
        ICON_MESSAGE_SEND_16 = new Icon("ICON_MESSAGE_SEND_16", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE);
        ICON_MESSAGE_SEND_24 = new Icon("ICON_MESSAGE_SEND_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE);
        ICON_MINIMUM_16 = new Icon("ICON_MINIMUM_16", 316, EnumC7081g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE);
        ICON_MINUS_12 = new Icon("ICON_MINUS_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE, EnumC7081g.SDK_ASSET_ICON_PLAID_LOGO_VALUE);
        ICON_MINUS_16 = new Icon("ICON_MINUS_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_HEADER_SHIELD_VALUE);
        ICON_MINUS_24 = new Icon("ICON_MINUS_24", EnumC7081g.f2781x2ba65ba3, EnumC7081g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE);
        ICON_MORE_MENU_16 = new Icon("ICON_MORE_MENU_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE, 490);
        ICON_MORE_MENU_20 = new Icon("ICON_MORE_MENU_20", EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_LIGHT_VALUE, 512);
        ICON_NEWS_16 = new Icon("ICON_NEWS_16", EnumC7081g.SDK_ASSET_PLAID_PROFILE_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE);
        ICON_NEWS_24 = new Icon("ICON_NEWS_24", EnumC7081g.f2775xbcb7e6f3, EnumC7081g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE);
        ICON_NO_VALUE_24 = new Icon("ICON_NO_VALUE_24", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE);
        ICON_NO_VALUE_32 = new Icon("ICON_NO_VALUE_32", EnumC7081g.SDK_ASSET_ICON_REPORT_VALUE, EnumC7081g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE);
        ICON_NOTIFICATION_12 = new Icon("ICON_NOTIFICATION_12", EnumC7081g.SDK_ASSET_ICON_STEP_COMPLETE_VALUE, 491);
        ICON_NOTIFICATION_16 = new Icon("ICON_NOTIFICATION_16", EnumC7081g.SDK_ASSET_ICON_UPLOAD_VALUE, 271);
        ICON_NOTIFICATION_24 = new Icon("ICON_NOTIFICATION_24", EnumC7081g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE);
        ICON_NOTIFICATION_32 = new Icon("ICON_NOTIFICATION_32", EnumC7081g.SDK_ASSET_ICON_LIGHTNING_FILLED_BLUE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE);
        ICON_NOTIFICATION_ADD_16 = new Icon("ICON_NOTIFICATION_ADD_16", 330, EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE);
        ICON_NOTIFICATION_ADD_24 = new Icon("ICON_NOTIFICATION_ADD_24", 331, EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE);
        ICON_NOTIFICATION_CHECK_16 = new Icon("ICON_NOTIFICATION_CHECK_16", 332, 513);
        ICON_NOTIFICATION_CHECK_24 = new Icon("ICON_NOTIFICATION_CHECK_24", 333, 514);
        ICON_NUMPAD_DOWN_24 = new Icon("ICON_NUMPAD_DOWN_24", 334, 442);
        ICON_NUMPAD_UP_24 = new Icon("ICON_NUMPAD_UP_24", 335, 443);
        ICON_ONLINE_16 = new Icon("ICON_ONLINE_16", WaitlistAnimationConstants.IN_WAITLIST_ANIMATION_END, EnumC7081g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE);
        ICON_ONLINE_24 = new Icon("ICON_ONLINE_24", 337, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE);
        ICON_OPTIONS_DOWN_24 = new Icon("ICON_OPTIONS_DOWN_24", 338, EnumC7081g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE);
        ICON_OPTIONS_FLAT_24 = new Icon("ICON_OPTIONS_FLAT_24", 339, EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE);
        ICON_OPTIONS_UP_24 = new Icon("ICON_OPTIONS_UP_24", 340, 280);
        ICON_OPTIONS_VOLATILE_24 = new Icon("ICON_OPTIONS_VOLATILE_24", 341, EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_VALUE);
        ICON_ORDER_16 = new Icon("ICON_ORDER_16", 342, EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE);
        ICON_ORDER_24 = new Icon("ICON_ORDER_24", 343, 283);
        ICON_PAUSE_HERO_40 = new Icon("ICON_PAUSE_HERO_40", 344, EnumC7081g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE);
        ICON_PAUSE_INLINE_24 = new Icon("ICON_PAUSE_INLINE_24", 345, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE);
        ICON_PAYCHECK_24 = new Icon("ICON_PAYCHECK_24", 346, EnumC7081g.f2777x89a9e432);
        ICON_PAYMENT_12 = new Icon("ICON_PAYMENT_12", 347, EnumC7081g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE);
        ICON_PAYMENT_16 = new Icon("ICON_PAYMENT_16", 348, 288);
        ICON_PAYMENT_24 = new Icon("ICON_PAYMENT_24", 349, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE);
        ICON_PAYMENT_32 = new Icon("ICON_PAYMENT_32", 350, EnumC7081g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE);
        ICON_PERCENT_SIGN_12 = new Icon("ICON_PERCENT_SIGN_12", 351, EnumC7081g.f2776x87e624cb);
        ICON_PERCENT_SIGN_16 = new Icon("ICON_PERCENT_SIGN_16", 352, EnumC7081g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE);
        ICON_PERCENT_SIGN_24 = new Icon("ICON_PERCENT_SIGN_24", 353, EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE);
        ICON_PERPETUAL_FUTURES_32 = new Icon("ICON_PERPETUAL_FUTURES_32", 354, 492);
        ICON_PERSON_12 = new Icon("ICON_PERSON_12", 355, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE);
        ICON_PERSON_16 = new Icon("ICON_PERSON_16", 356, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE);
        ICON_PERSON_24 = new Icon("ICON_PERSON_24", 357, EnumC7081g.SDK_ASSET_LOADING_INDICATOR_VALUE);
        ICON_PHONE_16 = new Icon("ICON_PHONE_16", 358, EnumC7081g.SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE);
        ICON_PHONE_24 = new Icon("ICON_PHONE_24", 359, EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE);
        ICON_PHONE_CONNECTED_16 = new Icon("ICON_PHONE_CONNECTED_16", 360, EnumC7081g.SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE);
        ICON_PHONE_MISSED_CALL_16 = new Icon("ICON_PHONE_MISSED_CALL_16", 361, 300);
        ICON_PHONE_WAITING_16 = new Icon("ICON_PHONE_WAITING_16", 362, EnumC7081g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE);
        ICON_PICTURE_IN_PICTURE_24 = new Icon("ICON_PICTURE_IN_PICTURE_24", 363, 455);
        ICON_PIE_CHART_16 = new Icon("ICON_PIE_CHART_16", 364, 467);
        ICON_PIE_CHART_24 = new Icon("ICON_PIE_CHART_24", 365, WaitlistAnimationConstants.MIDDLE_YAW_FRAME);
        ICON_PIN_16 = new Icon("ICON_PIN_16", 366, 302);
        ICON_PIN_24 = new Icon("ICON_PIN_24", 367, EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE);
        ICON_PLAY_HERO_40 = new Icon("ICON_PLAY_HERO_40", 368, EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE);
        ICON_PLAY_INLINE_16 = new Icon("ICON_PLAY_INLINE_16", 369, EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE);
        ICON_PLAY_INLINE_24 = new Icon("ICON_PLAY_INLINE_24", 370, EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE);
        ICON_PLUS_12 = new Icon("ICON_PLUS_12", 371, EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE);
        ICON_PLUS_16 = new Icon("ICON_PLUS_16", 372, EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE);
        ICON_PLUS_24 = new Icon("ICON_PLUS_24", 373, EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE);
        ICON_POP_OUT_16 = new Icon("ICON_POP_OUT_16", 374, EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE);
        ICON_POP_OUT_24 = new Icon("ICON_POP_OUT_24", 375, EnumC7081g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE);
        ICON_PRINT_24 = new Icon("ICON_PRINT_24", 376, EnumC7081g.f2774x74902ae0);
        ICON_QR_16 = new Icon("ICON_QR_16", 377, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE);
        ICON_QR_24 = new Icon("ICON_QR_24", 378, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE);
        ICON_QR_SCAN_24 = new Icon("ICON_QR_SCAN_24", 379, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE);
        ICON_QUANTITY_16 = new Icon("ICON_QUANTITY_16", 380, 316);
        ICON_QUANTITY_24 = new Icon("ICON_QUANTITY_24", 381, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE);
        ICON_QUESTION_12 = new Icon("ICON_QUESTION_12", 382, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE);
        ICON_QUESTION_16 = new Icon("ICON_QUESTION_16", 383, EnumC7081g.f2781x2ba65ba3);
        ICON_QUESTION_24 = new Icon("ICON_QUESTION_24", 384, EnumC7081g.SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE);
        ICON_QUESTION_FILLED_12 = new Icon("ICON_QUESTION_FILLED_12", 385, EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_LIGHT_VALUE);
        ICON_QUESTION_FILLED_16 = new Icon("ICON_QUESTION_FILLED_16", 386, EnumC7081g.SDK_ASSET_PLAID_PROFILE_CIRCLE_VALUE);
        ICON_QUESTION_FILLED_24 = new Icon("ICON_QUESTION_FILLED_24", 387, EnumC7081g.f2775xbcb7e6f3);
        ICON_RECURRING_12 = new Icon("ICON_RECURRING_12", 388, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE);
        ICON_RECURRING_16 = new Icon("ICON_RECURRING_16", 389, EnumC7081g.SDK_ASSET_ICON_REPORT_VALUE);
        ICON_RECURRING_24 = new Icon("ICON_RECURRING_24", 390, EnumC7081g.SDK_ASSET_ICON_STEP_COMPLETE_VALUE);
        ICON_RECURRING_HUB_24 = new Icon("ICON_RECURRING_HUB_24", 391, EnumC7081g.SDK_ASSET_ICON_UPLOAD_VALUE);
        ICON_REPEAT_16 = new Icon("ICON_REPEAT_16", 392, EnumC7081g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE);
        ICON_REPLAY_HERO_40 = new Icon("ICON_REPLAY_HERO_40", 393, EnumC7081g.SDK_ASSET_ICON_LIGHTNING_FILLED_BLUE_VALUE);
        ICON_RESEND_16 = new Icon("ICON_RESEND_16", 394, 330);
        ICON_RESEND_24 = new Icon("ICON_RESEND_24", 395, 331);
        ICON_RETIREMENT_12 = new Icon("ICON_RETIREMENT_12", WaitlistAnimationConstants.LEFT_YAW_START, 332);
        ICON_RETIREMENT_16 = new Icon("ICON_RETIREMENT_16", 397, 333);
        ICON_RETIREMENT_24 = new Icon("ICON_RETIREMENT_24", 398, 334);
        ICON_RETIREMENT_32 = new Icon("ICON_RETIREMENT_32", 399, 335);
        ICON_RHW_BROWSER_TAB_24 = new Icon("ICON_RHW_BROWSER_TAB_24", 400, WaitlistAnimationConstants.IN_WAITLIST_ANIMATION_END);
        ICON_RHW_CHART_TAB_24 = new Icon("ICON_RHW_CHART_TAB_24", 401, 337);
        ICON_RHW_SEARCH_TAB_24 = new Icon("ICON_RHW_SEARCH_TAB_24", 402, 338);
        ICON_RISK_AND_UNCERTAINTY_24 = new Icon("ICON_RISK_AND_UNCERTAINTY_24", HttpStatusCode.FORBIDDEN, 339);
        ICON_ROBINHOOD_12 = new Icon("ICON_ROBINHOOD_12", 404, 340);
        ICON_ROBINHOOD_16 = new Icon("ICON_ROBINHOOD_16", 405, 341);
        ICON_ROBINHOOD_24 = new Icon("ICON_ROBINHOOD_24", 406, 342);
        ICON_ROLLING_POSITION_12 = new Icon("ICON_ROLLING_POSITION_12", 407, 343);
        ICON_ROLLING_POSITION_16 = new Icon("ICON_ROLLING_POSITION_16", 408, 344);
        ICON_ROLLING_POSITION_24 = new Icon("ICON_ROLLING_POSITION_24", 409, 345);
        ICON_SCAN_16 = new Icon("ICON_SCAN_16", HttpStatusCode.GONE, 346);
        ICON_SCAN_24 = new Icon("ICON_SCAN_24", 411, 347);
        ICON_SEARCH_16 = new Icon("ICON_SEARCH_16", 412, 348);
        ICON_SEARCH_24 = new Icon("ICON_SEARCH_24", 413, 349);
        ICON_SETTINGS_12 = new Icon("ICON_SETTINGS_12", 414, 350);
        ICON_SETTINGS_16 = new Icon("ICON_SETTINGS_16", 415, 351);
        ICON_SETTINGS_24 = new Icon("ICON_SETTINGS_24", 416, 352);
        ICON_SHARE_ANDROID_16 = new Icon("ICON_SHARE_ANDROID_16", 417, 353);
        ICON_SHARE_ANDROID_24 = new Icon("ICON_SHARE_ANDROID_24", 418, 354);
        ICON_SHARE_IOS_16 = new Icon("ICON_SHARE_IOS_16", 419, 355);
        ICON_SHARE_IOS_24 = new Icon("ICON_SHARE_IOS_24", 420, 356);
        ICON_SMILEY_24 = new Icon("ICON_SMILEY_24", 421, 357);
        ICON_SOCIAL_CREATE_POST_16 = new Icon("ICON_SOCIAL_CREATE_POST_16", 422, 515);
        ICON_SORT_12 = new Icon("ICON_SORT_12", 423, 493);
        ICON_SOUND_OFF_24 = new Icon("ICON_SOUND_OFF_24", 424, 358);
        ICON_SOUND_ON_24 = new Icon("ICON_SOUND_ON_24", CompanyFinancialsSection.BAR_ANIMATION_DURATION, 359);
        ICON_SPARKLE_BULLET_12 = new Icon("ICON_SPARKLE_BULLET_12", 426, 360);
        ICON_SPARKLE_BULLET_16 = new Icon("ICON_SPARKLE_BULLET_16", 427, 361);
        ICON_SPARKLE_BULLET_24 = new Icon("ICON_SPARKLE_BULLET_24", 428, 362);
        ICON_SPARKLE_DOUBLE_16 = new Icon("ICON_SPARKLE_DOUBLE_16", 429, 494);
        ICON_SPARKLE_DOUBLE_24 = new Icon("ICON_SPARKLE_DOUBLE_24", 430, 468);
        ICON_SPEED_DOWN_24 = new Icon("ICON_SPEED_DOWN_24", 431, 444);
        ICON_SPEED_UP_24 = new Icon("ICON_SPEED_UP_24", 432, 445);
        ICON_STAR_FILLED_12 = new Icon("ICON_STAR_FILLED_12", 433, 363);
        ICON_STAR_FILLED_16 = new Icon("ICON_STAR_FILLED_16", 434, 364);
        ICON_STAR_FILLED_24 = new Icon("ICON_STAR_FILLED_24", 435, 365);
        ICON_STAR_OUTLINE_16 = new Icon("ICON_STAR_OUTLINE_16", 436, 366);
        ICON_STAR_OUTLINE_24 = new Icon("ICON_STAR_OUTLINE_24", 437, 367);
        ICON_STAR_PASSWORD_16 = new Icon("ICON_STAR_PASSWORD_16", 438, 495);
        ICON_STEWARDSHIP_24 = new Icon("ICON_STEWARDSHIP_24", 439, 368);
        ICON_STOCK_DOWN_12 = new Icon("ICON_STOCK_DOWN_12", 440, 369);
        ICON_STOCK_DOWN_16 = new Icon("ICON_STOCK_DOWN_16", 441, 370);
        ICON_STOCK_DOWN_24 = new Icon("ICON_STOCK_DOWN_24", 442, 371);
        ICON_STOCK_UP_12 = new Icon("ICON_STOCK_UP_12", 443, 372);
        ICON_STOCK_UP_16 = new Icon("ICON_STOCK_UP_16", 444, 373);
        ICON_STOCK_UP_24 = new Icon("ICON_STOCK_UP_24", 445, 374);
        ICON_STOPWATCH_16 = new Icon("ICON_STOPWATCH_16", 446, 375);
        ICON_STOPWATCH_24 = new Icon("ICON_STOPWATCH_24", 447, 376);
        ICON_STOPWATCH_32 = new Icon("ICON_STOPWATCH_32", 448, 377);
        ICON_STRATEGY_OUTLOOK_24 = new Icon("ICON_STRATEGY_OUTLOOK_24", 449, 378);
        ICON_SWIPE_DOWN_16 = new Icon("ICON_SWIPE_DOWN_16", 450, 379);
        ICON_SWIPE_DOWN_24 = new Icon("ICON_SWIPE_DOWN_24", 451, 380);
        ICON_SWIPE_UP_16 = new Icon("ICON_SWIPE_UP_16", 452, 381);
        ICON_SWIPE_UP_24 = new Icon("ICON_SWIPE_UP_24", 453, 382);
        ICON_SWITCH_16 = new Icon("ICON_SWITCH_16", 454, 383);
        ICON_SWITCH_24 = new Icon("ICON_SWITCH_24", 455, 384);
        ICON_TAB_ACCOUNT_32 = new Icon("ICON_TAB_ACCOUNT_32", WaitlistAnimationConstants.MIDDLE_YAW_FRAME, 385);
        ICON_TAB_CONTENT_32 = new Icon("ICON_TAB_CONTENT_32", 457, 386);
        ICON_TAB_CRYPTO_32 = new Icon("ICON_TAB_CRYPTO_32", 458, 387);
        ICON_TAB_CRYPTO_C_32 = new Icon("ICON_TAB_CRYPTO_C_32", 459, 388);
        ICON_TAB_GOLD_32 = new Icon("ICON_TAB_GOLD_32", 460, 389);
        ICON_TAB_INVEST_32 = new Icon("ICON_TAB_INVEST_32", 461, 390);
        ICON_TAB_ISA_32 = new Icon("ICON_TAB_ISA_32", 462, WaitlistAnimationConstants.RIGHT_YAW_END);
        ICON_TAB_MESSAGES_32 = new Icon("ICON_TAB_MESSAGES_32", 463, 391);
        ICON_TAB_MONEY_32 = new Icon("ICON_TAB_MONEY_32", 464, 392);
        ICON_TAB_RETIREMENT_32 = new Icon("ICON_TAB_RETIREMENT_32", 465, 393);
        ICON_TAB_SEARCH_32 = new Icon("ICON_TAB_SEARCH_32", 466, 394);
        ICON_TAB_SOCIAL_32 = new Icon("ICON_TAB_SOCIAL_32", 467, 496);
        ICON_TAB_WATCHLIST_32 = new Icon("ICON_TAB_WATCHLIST_32", 468, 497);
        ICON_TAG_16 = new Icon("ICON_TAG_16", 469, 395);
        ICON_TAG_24 = new Icon("ICON_TAG_24", 470, WaitlistAnimationConstants.LEFT_YAW_START);
        ICON_TAX_LOTS_LONG_TERM_16 = new Icon("ICON_TAX_LOTS_LONG_TERM_16", 471, 451);
        ICON_TAX_LOTS_SHORT_TERM_16 = new Icon("ICON_TAX_LOTS_SHORT_TERM_16", 472, 452);
        ICON_TECHNOLOGY_12 = new Icon("ICON_TECHNOLOGY_12", 473, 397);
        ICON_TECHNOLOGY_24 = new Icon("ICON_TECHNOLOGY_24", 474, 398);
        ICON_THUMBPRINT_16 = new Icon("ICON_THUMBPRINT_16", 475, 399);
        ICON_THUMBPRINT_24 = new Icon("ICON_THUMBPRINT_24", 476, 400);
        ICON_THUMBS_DOWN_16 = new Icon("ICON_THUMBS_DOWN_16", 477, 401);
        ICON_THUMBS_DOWN_24 = new Icon("ICON_THUMBS_DOWN_24", 478, 402);
        ICON_THUMBS_UP_16 = new Icon("ICON_THUMBS_UP_16", 479, HttpStatusCode.FORBIDDEN);
        ICON_THUMBS_UP_24 = new Icon("ICON_THUMBS_UP_24", 480, 404);
        ICON_TICKET_16 = new Icon("ICON_TICKET_16", 481, 405);
        ICON_TICKET_24 = new Icon("ICON_TICKET_24", 482, 406);
        ICON_TOUCH_ID_ANDROID_16 = new Icon("ICON_TOUCH_ID_ANDROID_16", 483, 407);
        ICON_TOUCH_ID_ANDROID_24 = new Icon("ICON_TOUCH_ID_ANDROID_24", 484, 408);
        ICON_TRADE_SOCIAL_FILLED_20 = new Icon("ICON_TRADE_SOCIAL_FILLED_20", 485, 517);
        ICON_TRADE_SOCIAL_OUTLINE_20 = new Icon("ICON_TRADE_SOCIAL_OUTLINE_20", 486, 518);
        ICON_TRANSFERS_12 = new Icon("ICON_TRANSFERS_12", 487, 409);
        ICON_TRANSFERS_16 = new Icon("ICON_TRANSFERS_16", 488, HttpStatusCode.GONE);
        ICON_TRANSFERS_24 = new Icon("ICON_TRANSFERS_24", 489, 411);
        ICON_TRANSPORT_24 = new Icon("ICON_TRANSPORT_24", 490, 412);
        ICON_TRASH_12 = new Icon("ICON_TRASH_12", 491, 413);
        ICON_TRASH_16 = new Icon("ICON_TRASH_16", 492, 414);
        ICON_TRASH_24 = new Icon("ICON_TRASH_24", 493, 415);
        ICON_TRIANGLE_ALERT_16 = new Icon("ICON_TRIANGLE_ALERT_16", 494, 416);
        ICON_TRIANGLE_ALERT_24 = new Icon("ICON_TRIANGLE_ALERT_24", 495, 417);
        ICON_TUNER_16 = new Icon("ICON_TUNER_16", 496, 418);
        ICON_TUNER_24 = new Icon("ICON_TUNER_24", 497, 419);
        ICON_UNLOCK_12 = new Icon("ICON_UNLOCK_12", 498, 420);
        ICON_UNLOCK_16 = new Icon("ICON_UNLOCK_16", 499, 421);
        ICON_UNLOCK_24 = new Icon("ICON_UNLOCK_24", 500, 422);
        ICON_UPLOAD_24 = new Icon("ICON_UPLOAD_24", 501, 423);
        ICON_VIDEO_CALL_12 = new Icon("ICON_VIDEO_CALL_12", com.withpersona.sdk2.inquiry.network.core.HttpStatusCode.BAD_GATEWAY_502, com.withpersona.sdk2.inquiry.network.core.HttpStatusCode.BAD_GATEWAY_502);
        ICON_VIDEO_CALL_16 = new Icon("ICON_VIDEO_CALL_16", 503, 503);
        ICON_VIDEO_CALL_24 = new Icon("ICON_VIDEO_CALL_24", 504, 504);
        ICON_VIDEO_FAST_FORWARD_24 = new Icon("ICON_VIDEO_FAST_FORWARD_24", 505, 424);
        ICON_VIDEO_REPLAY_24 = new Icon("ICON_VIDEO_REPLAY_24", 506, CompanyFinancialsSection.BAR_ANIMATION_DURATION);
        ICON_VIDEO_REWIND_15_32 = new Icon("ICON_VIDEO_REWIND_15_32", 507, 426);
        ICON_VIDEO_REWIND_24 = new Icon("ICON_VIDEO_REWIND_24", 508, 427);
        ICON_VIDEO_SKIP_15_32 = new Icon("ICON_VIDEO_SKIP_15_32", 509, 428);
        ICON_WALLET_24 = new Icon("ICON_WALLET_24", 510, 429);
        ICON_WALLET_32 = new Icon("ICON_WALLET_32", 511, 430);
        ICON_WALLETCONNECT_16 = new Icon("ICON_WALLETCONNECT_16", 512, 431);
        ICON_WALLETCONNECT_24 = new Icon("ICON_WALLETCONNECT_24", 513, 432);
        ICON_WC_SCAN_24 = new Icon("ICON_WC_SCAN_24", 514, 433);
        ICON_WITHDRAW_16 = new Icon("ICON_WITHDRAW_16", 515, 434);
        ICON_WITHDRAW_24 = new Icon("ICON_WITHDRAW_24", WaitlistAnimationConstants.RIGHT_YAW_END, 435);
        ICON_ZOOM_IN_24 = new Icon("ICON_ZOOM_IN_24", 517, 436);
        ICON_ZOOM_OUT_24 = new Icon("ICON_ZOOM_OUT_24", 518, 437);
        Icon[] iconArr$values = $values();
        $VALUES = iconArr$values;
        $ENTRIES = EnumEntries2.enumEntries(iconArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Icon.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<Icon>(orCreateKotlinClass, syntax, icon) { // from class: rh_server_driven_ui.v1.Icon$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public Icon fromValue(int value) {
                return Icon.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: Icon.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrh_server_driven_ui/v1/Icon$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrh_server_driven_ui/v1/Icon;", "fromValue", "value", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Icon fromValue(int value) {
            switch (value) {
                case 0:
                    return Icon.ICON_UNSPECIFIED;
                case 1:
                    return Icon.ICON_ACCOUNT_SUMMARY_12;
                case 2:
                    return Icon.ICON_ACCOUNT_SUMMARY_24;
                case 3:
                    return Icon.ICON_ACTION_REMOVE_24;
                case 4:
                    return Icon.ICON_ACTIONS_ALERTS_32;
                case 5:
                    return Icon.ICON_ACTIONS_ATM_32;
                case 6:
                    return Icon.ICON_ACTIONS_CHECK_32;
                case 7:
                    return Icon.ICON_ACTIONS_STATEMENTS_32;
                case 8:
                    return Icon.ICON_ACTIONS_TRANSFERS_32;
                case 9:
                    return Icon.ICON_AGENT_16;
                case 10:
                    return Icon.ICON_AGENT_24;
                case 11:
                    return Icon.ICON_ALERT_12;
                case 12:
                    return Icon.ICON_ALERT_16;
                case 13:
                    return Icon.ICON_ALERT_24;
                case 14:
                    return Icon.ICON_ALERT_FILLED_12;
                case 15:
                    return Icon.ICON_ALERT_FILLED_16;
                case 16:
                    return Icon.ICON_ALERT_FILLED_24;
                case 17:
                    return Icon.ICON_ALL_DAY_TRADING_12;
                case 18:
                    return Icon.ICON_ALL_DAY_TRADING_16;
                case 19:
                    return Icon.ICON_ALL_DAY_TRADING_24;
                case 20:
                    return Icon.ICON_ANNOUNCEMENT_16;
                case 21:
                    return Icon.ICON_ANNOUNCEMENT_24;
                case 22:
                    return Icon.ICON_ARCHIVE_24;
                case 23:
                    return Icon.ICON_ARROW_DOWN_12;
                case 24:
                    return Icon.ICON_ARROW_DOWN_16;
                case 25:
                    return Icon.ICON_ARROW_DOWN_24;
                case 26:
                    return Icon.ICON_ARROW_DOWN_FILL_12;
                case 27:
                    return Icon.ICON_ARROW_DOWN_FILL_16;
                case 28:
                    return Icon.ICON_ARROW_DOWN_FILL_24;
                case 29:
                    return Icon.ICON_ARROW_LEFT_12;
                case 30:
                    return Icon.ICON_ARROW_LEFT_16;
                case 31:
                    return Icon.ICON_ARROW_LEFT_24;
                case 32:
                    return Icon.ICON_ARROW_LEFT_FILL_12;
                case 33:
                    return Icon.ICON_ARROW_LEFT_FILL_16;
                case 34:
                    return Icon.ICON_ARROW_LEFT_FILL_24;
                case 35:
                    return Icon.ICON_ARROW_RIGHT_12;
                case 36:
                    return Icon.ICON_ARROW_RIGHT_16;
                case 37:
                    return Icon.ICON_ARROW_RIGHT_24;
                case 38:
                    return Icon.ICON_ARROW_RIGHT_FILL_12;
                case 39:
                    return Icon.ICON_ARROW_RIGHT_FILL_16;
                case 40:
                    return Icon.ICON_ARROW_RIGHT_FILL_24;
                case 41:
                    return Icon.ICON_ARROW_UP_12;
                case 42:
                    return Icon.ICON_ARROW_UP_16;
                case 43:
                    return Icon.ICON_ARROW_UP_24;
                case 44:
                    return Icon.ICON_ARROW_UP_FILL_12;
                case 45:
                    return Icon.ICON_ARROW_UP_FILL_16;
                case 46:
                    return Icon.ICON_ARROW_UP_FILL_24;
                case 47:
                    return Icon.ICON_ATTACH_24;
                case 48:
                    return Icon.ICON_BACKSPACE_24;
                case 49:
                    return Icon.ICON_BACKSPACE_32;
                case 50:
                    return Icon.ICON_BANKING_16;
                case 51:
                    return Icon.ICON_BANKING_24;
                case 52:
                    return Icon.ICON_BANKING_32;
                case 53:
                    return Icon.ICON_BUBBLE_CHECKED_12;
                case 54:
                    return Icon.ICON_BUBBLE_CHECKED_16;
                case 55:
                    return Icon.ICON_BUBBLE_CHECKED_24;
                case 56:
                    return Icon.ICON_BUBBLE_DOT_24;
                case 57:
                    return Icon.ICON_BUBBLE_EMPTY_24;
                case 58:
                    return Icon.ICON_BUBBLE_MINUS_16;
                case 59:
                    return Icon.ICON_BUBBLE_MINUS_24;
                case 60:
                    return Icon.ICON_BUBBLE_PAUSE_24;
                case 61:
                    return Icon.ICON_BUBBLE_PLUS_16;
                case 62:
                    return Icon.ICON_BUBBLE_PLUS_24;
                case 63:
                    return Icon.ICON_BUBBLE_PLUS_FILLED_24;
                case 64:
                    return Icon.ICON_BUBBLE_RADIO_BUTTON_24;
                case 65:
                    return Icon.ICON_BUBBLE_REMOVE_16;
                case 66:
                    return Icon.ICON_BUBBLE_REMOVE_24;
                case 67:
                    return Icon.ICON_BUBBLE_REMOVE_FILLED_16;
                case SDK_ASSET_ICON_HOME_VALUE:
                    return Icon.ICON_BUBBLE_REMOVE_FILLED_24;
                case 69:
                    return Icon.ICON_BUBBLE_REVERSE_24;
                case 70:
                    return Icon.ICON_BUBBLE_UK_POUNDS_16;
                case SDK_ASSET_ICON_GUIDE_VALUE:
                    return Icon.ICON_BUBBLE_UK_POUNDS_24;
                case SDK_ASSET_ICON_GLOBE_VALUE:
                    return Icon.ICON_BUBBLE_UK_POUNDS_FILLED_16;
                case 73:
                    return Icon.ICON_BUBBLE_UK_POUNDS_FILLED_24;
                case 74:
                    return Icon.ICON_BUILDER_16;
                case 75:
                    return Icon.ICON_BUILDER_24;
                case 76:
                    return Icon.ICON_CALENDAR_16;
                case 77:
                    return Icon.ICON_CALENDAR_24;
                case 78:
                    return Icon.ICON_CAMERA_16;
                case 79:
                    return Icon.ICON_CAMERA_24;
                case 80:
                    return Icon.ICON_CARET_DOWN_12;
                case 81:
                    return Icon.ICON_CARET_DOWN_16;
                case 82:
                    return Icon.ICON_CARET_DOWN_24;
                case 83:
                    return Icon.ICON_CARET_LEFT_12;
                case 84:
                    return Icon.ICON_CARET_LEFT_16;
                case 85:
                    return Icon.ICON_CARET_LEFT_24;
                case 86:
                    return Icon.ICON_CARET_RIGHT_12;
                case 87:
                    return Icon.ICON_CARET_RIGHT_16;
                case 88:
                    return Icon.ICON_CARET_RIGHT_24;
                case 89:
                    return Icon.ICON_CARET_UP_12;
                case 90:
                    return Icon.ICON_CARET_UP_16;
                case 91:
                    return Icon.ICON_CARET_UP_24;
                case 92:
                    return Icon.ICON_CASH_24;
                case 93:
                    return Icon.ICON_CHART_16;
                case 94:
                    return Icon.ICON_CHART_24;
                case 95:
                    return Icon.ICON_CHART_CANDLESTICKS_16;
                case 96:
                    return Icon.ICON_CHART_CANDLESTICKS_24;
                case 97:
                    return Icon.ICON_CHART_LINE_16;
                case 98:
                    return Icon.ICON_CHART_LINE_24;
                case 99:
                    return Icon.ICON_CHAT_16;
                case 100:
                    return Icon.ICON_CHAT_24;
                case 101:
                    return Icon.ICON_CHATBOT_16;
                case 102:
                    return Icon.ICON_CHATBOT_24;
                case 103:
                    return Icon.ICON_CHECKBOX_EMPTY_16;
                case 104:
                    return Icon.ICON_CHECKBOX_EMPTY_24;
                case 105:
                    return Icon.ICON_CHECKBOX_FILLED_16;
                case 106:
                    return Icon.ICON_CHECKBOX_FILLED_24;
                case 107:
                    return Icon.ICON_CHECKMARK_12;
                case 108:
                    return Icon.ICON_CHECKMARK_16;
                case 109:
                    return Icon.ICON_CHECKMARK_24;
                case 110:
                    return Icon.ICON_CLIPBOARD_16;
                case 111:
                    return Icon.ICON_CLIPBOARD_24;
                case 112:
                    return Icon.ICON_CLOCK_12;
                case 113:
                    return Icon.ICON_CLOCK_16;
                case 114:
                    return Icon.ICON_CLOCK_24;
                case 115:
                    return Icon.ICON_CLOSE_12;
                case 116:
                    return Icon.ICON_CLOSE_16;
                case 117:
                    return Icon.ICON_CLOSE_24;
                case 118:
                    return Icon.ICON_CLOUD_16;
                case 119:
                    return Icon.ICON_CLOUD_24;
                case 120:
                    return Icon.ICON_COLLAPSE_16;
                case SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE:
                    return Icon.ICON_COLLAPSE_24;
                case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                    return Icon.ICON_CONSUMER_GOODS_12;
                case 123:
                    return Icon.ICON_CONSUMER_GOODS_16;
                case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                    return Icon.ICON_CONSUMER_GOODS_24;
                case 125:
                    return Icon.ICON_CONTROLS_16;
                case SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE:
                    return Icon.ICON_CONTROLS_24;
                case SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE:
                    return Icon.ICON_CONVERSATION_16;
                case 128:
                    return Icon.ICON_CONVERSATION_24;
                case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                    return Icon.ICON_COPY_12;
                case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                    return Icon.ICON_COPY_16;
                case 131:
                    return Icon.ICON_COPY_24;
                case SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE:
                    return Icon.ICON_CORPORATE_16;
                case SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE:
                    return Icon.ICON_CORPORATE_24;
                case SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE:
                    return Icon.ICON_CRYPTO_12;
                case SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE:
                    return Icon.ICON_CRYPTO_16;
                case 136:
                    return Icon.ICON_CRYPTO_24;
                case SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE:
                    return Icon.ICON_CRYPTO_C_12;
                case SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE:
                    return Icon.ICON_CRYPTO_C_16;
                case SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE:
                    return Icon.ICON_CRYPTO_C_24;
                case SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE:
                    return Icon.ICON_DEPOSIT_16;
                case SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE:
                    return Icon.ICON_DEPOSIT_24;
                case SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE:
                    return Icon.ICON_DINING_24;
                case SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE:
                    return Icon.ICON_DISCLOSURES_24;
                case 144:
                    return Icon.ICON_DIVIDEND_16;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE:
                    return Icon.ICON_DIVIDEND_24;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE:
                    return Icon.ICON_DOCUMENTS_24;
                case 147:
                    return Icon.ICON_DOLLAR_SIGN_12;
                case SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE:
                    return Icon.ICON_DOLLAR_SIGN_16;
                case SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE:
                    return Icon.ICON_DOLLAR_SIGN_24;
                case 150:
                    return Icon.ICON_DOT_12;
                case 151:
                    return Icon.ICON_DOT_16;
                case SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE:
                    return Icon.ICON_DOT_24;
                case SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE:
                    return Icon.ICON_DOTS_16;
                case SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE:
                    return Icon.ICON_DOTS_24;
                case 155:
                    return Icon.ICON_DOTS_ANDROID_16;
                case 156:
                    return Icon.ICON_DOTS_ANDROID_24;
                case SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE:
                    return Icon.ICON_DOWNLOAD_12;
                case SDK_ASSET_ILLUSTRATION_WALLET_VALUE:
                    return Icon.ICON_DOWNLOAD_16;
                case SDK_ASSET_ILLUSTRATION_INCOME_VALUE:
                    return Icon.ICON_DOWNLOAD_24;
                case SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE:
                    return Icon.ICON_DRAG_12;
                case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE:
                    return Icon.ICON_DRAG_16;
                case SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE:
                    return Icon.ICON_DRAG_24;
                case SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE:
                    return Icon.ICON_DROPDOWN_12;
                case SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE:
                    return Icon.ICON_DROPDOWN_16;
                case 165:
                    return Icon.ICON_DROPDOWN_24;
                case SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE:
                    return Icon.ICON_ECONOMIC_MOAT_24;
                case 167:
                    return Icon.ICON_EDIT_12;
                case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE:
                    return Icon.ICON_EDIT_16;
                case SDK_ASSET_HEADER_CARD_COLLECT_VALUE:
                    return Icon.ICON_EDIT_24;
                case SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE:
                    return Icon.ICON_EDIT_SURFACE_24;
                case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE:
                    return Icon.ICON_EMAIL_FILLED_16;
                case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE:
                    return Icon.ICON_EMAIL_FILLED_24;
                case SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE:
                    return Icon.ICON_EMAIL_OUTLINE_24;
                case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE:
                    return Icon.ICON_ENERGY_12;
                case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE:
                    return Icon.ICON_ENERGY_24;
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE:
                    return Icon.ICON_ENTERTAINMENT_24;
                case SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE:
                    return Icon.ICON_ETF_12;
                case f2773x8d9721ad:
                    return Icon.ICON_ETF_24;
                case f2780x600b66fe:
                    return Icon.ICON_EXCLAMATION_12;
                case SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE:
                    return Icon.ICON_EXCLAMATION_16;
                case SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE:
                    return Icon.ICON_EXCLAMATION_24;
                case 182:
                    return Icon.ICON_EXPAND_16;
                case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE:
                    return Icon.ICON_EXPAND_24;
                case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE:
                    return Icon.ICON_EYE_16;
                case SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE:
                    return Icon.ICON_EYE_24;
                case SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE:
                    return Icon.ICON_EYE_CLOSED_16;
                case SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE:
                    return Icon.ICON_EYE_CLOSED_24;
                case 188:
                    return Icon.ICON_FACE_ID_ANDROID_16;
                case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE:
                    return Icon.ICON_FACE_ID_ANDROID_24;
                case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE:
                    return Icon.ICON_FACE_ID_IOS_16;
                case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE:
                    return Icon.ICON_FACE_ID_IOS_24;
                case 192:
                    return Icon.ICON_FAIR_VALUE_24;
                case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE:
                    return Icon.ICON_FILTER_12;
                case SDK_ASSET_ICON_EXTERNAL_VALUE:
                    return Icon.ICON_FILTER_16;
                case SDK_ASSET_ICON_ALERT_WARNING_VALUE:
                    return Icon.ICON_FILTER_24;
                case SDK_ASSET_ICON_ARROW_DOWN_VALUE:
                    return Icon.ICON_FINANCE_12;
                case SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE:
                    return Icon.ICON_FINANCE_24;
                case SDK_ASSET_ICON_ARROW_UP_VALUE:
                    return Icon.ICON_FLASH_OFF_24;
                case SDK_ASSET_ICON_CANCEL_VALUE:
                    return Icon.ICON_FLASH_ON_24;
                case 200:
                    return Icon.ICON_FLASHLIGHT_OFF_24;
                case 201:
                    return Icon.ICON_FLASHLIGHT_ON_24;
                case 202:
                    return Icon.ICON_FLOWER_16;
                case SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE:
                    return Icon.ICON_FOLDER_16;
                case 204:
                    return Icon.ICON_FOLDER_24;
                case SDK_ASSET_ICON_CLIPBOARD_VALUE:
                    return Icon.ICON_FULLSCREEN_ENTER_24;
                case SDK_ASSET_ICON_CLOCK_VALUE:
                    return Icon.ICON_FULLSCREEN_EXIT_24;
                case SDK_ASSET_ICON_COMMENT_VALUE:
                    return Icon.ICON_GIFT_12;
                case SDK_ASSET_ICON_INCOME_VALUE:
                    return Icon.ICON_GIFT_16;
                case SDK_ASSET_ICON_INCOMPLETE_VALUE:
                    return Icon.ICON_GIFT_24;
                case SDK_ASSET_ICON_NEW_WINDOW_VALUE:
                    return Icon.ICON_GROCERIES_24;
                case 211:
                    return Icon.ICON_HAMBURGER_12;
                case SDK_ASSET_ICON_OVERRIDE_VALUE:
                    return Icon.ICON_HAMBURGER_16;
                case SDK_ASSET_ICON_PAUSE_VALUE:
                    return Icon.ICON_HAMBURGER_24;
                case SDK_ASSET_ICON_PIN_VALUE:
                    return Icon.ICON_HEALTHCARE_12;
                case SDK_ASSET_ICON_PRODUCT_IDV_VALUE:
                    return Icon.ICON_HEALTHCARE_24;
                case SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE:
                    return Icon.ICON_HELP_24;
                case SDK_ASSET_ICON_PROGRESS_VALUE:
                    return Icon.ICON_HISTORY_16;
                case SDK_ASSET_ICON_QUESTION_VALUE:
                    return Icon.ICON_HISTORY_24;
                case SDK_ASSET_ICON_REJECTED_REC_VALUE:
                    return Icon.ICON_HOME_24;
                case SDK_ASSET_ICON_SHIELD_CAUTION_VALUE:
                    return Icon.ICON_HOSPITALITY_12;
                case SDK_ASSET_ICON_SUBMIT_VALUE:
                    return Icon.ICON_HOSPITALITY_24;
                case SDK_ASSET_ICON_SUBTRACT_VALUE:
                    return Icon.ICON_HOURGLASS_16;
                case SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE:
                    return Icon.ICON_HOURGLASS_24;
                case 224:
                    return Icon.ICON_ICLOUD_RESTORE_24;
                case 225:
                    return Icon.ICON_IMAGE_16;
                case SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE:
                    return Icon.ICON_IMAGE_24;
                case SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE:
                    return Icon.ICON_IMAGE_FAIL_16;
                case SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE:
                    return Icon.ICON_IMAGE_FAIL_24;
                case SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE:
                    return Icon.ICON_INFO_12;
                case SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE:
                    return Icon.ICON_INFO_16;
                case SDK_ASSET_ILLUSTRATION_EXIT_VALUE:
                    return Icon.ICON_INFO_24;
                case SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE:
                    return Icon.ICON_INFO_FILLED_12;
                case SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE:
                    return Icon.ICON_INFO_FILLED_16;
                case SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE:
                    return Icon.ICON_INFO_FILLED_24;
                case SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE:
                    return Icon.ICON_L2_HEADER_ARROW_24;
                case SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE:
                    return Icon.ICON_LIGHTBULB_16;
                case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE:
                    return Icon.ICON_LIGHTBULB_24;
                case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE:
                    return Icon.ICON_LIGHTNING_12;
                case 239:
                    return Icon.ICON_LIGHTNING_16;
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE:
                    return Icon.ICON_LIGHTNING_24;
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE:
                    return Icon.ICON_LIGHTNING_OFF_16;
                case f2778x3356acf6:
                    return Icon.ICON_LINK_16;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE:
                    return Icon.ICON_LINK_24;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE:
                    return Icon.ICON_LINK_OUT_12;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE:
                    return Icon.ICON_LINK_OUT_16;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE:
                    return Icon.ICON_LINK_OUT_24;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE:
                    return Icon.ICON_LOCATION_FILL_16;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE:
                    return Icon.ICON_LOCATION_FILL_24;
                case f2779x59907a3d:
                    return Icon.ICON_LOCATION_OUTLINE_24;
                case 250:
                    return Icon.ICON_LOCK_12;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE:
                    return Icon.ICON_LOCK_16;
                case SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE:
                    return Icon.ICON_LOCK_24;
                case SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE:
                    return Icon.ICON_LOG_OUT_24;
                case SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE:
                    return Icon.ICON_MANUFACTURING_12;
                case 255:
                    return Icon.ICON_MANUFACTURING_24;
                case 256:
                    return Icon.ICON_MAPS_24;
                case SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE:
                    return Icon.ICON_MARGIN_12;
                case SDK_ASSET_HEADER_BOLT_VALUE:
                    return Icon.ICON_MARGIN_16;
                case SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE:
                    return Icon.ICON_MARGIN_24;
                case SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE:
                    return Icon.ICON_MAXIMUM_16;
                case SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE:
                    return Icon.ICON_MESSAGE_SEND_16;
                case SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE:
                    return Icon.ICON_MESSAGE_SEND_24;
                case SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE:
                    return Icon.ICON_MINIMUM_16;
                case SDK_ASSET_ICON_PLAID_LOGO_VALUE:
                    return Icon.ICON_MINUS_12;
                case SDK_ASSET_HEADER_SHIELD_VALUE:
                    return Icon.ICON_MINUS_16;
                case SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE:
                    return Icon.ICON_MINUS_24;
                case SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE:
                    return Icon.ICON_NEWS_16;
                case SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE:
                    return Icon.ICON_NEWS_24;
                case SDK_ASSET_HEADER_REPORT_SHARED_VALUE:
                    return Icon.ICON_NO_VALUE_24;
                case SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE:
                    return Icon.ICON_NO_VALUE_32;
                case 271:
                    return Icon.ICON_NOTIFICATION_16;
                case SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE:
                    return Icon.ICON_NOTIFICATION_24;
                case SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE:
                    return Icon.ICON_NOTIFICATION_32;
                case SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE:
                    return Icon.ICON_NOTIFICATION_ADD_16;
                case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE:
                    return Icon.ICON_NOTIFICATION_ADD_24;
                case SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE:
                    return Icon.ICON_ONLINE_16;
                case SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE:
                    return Icon.ICON_ONLINE_24;
                case SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE:
                    return Icon.ICON_OPTIONS_DOWN_24;
                case SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE:
                    return Icon.ICON_OPTIONS_FLAT_24;
                case 280:
                    return Icon.ICON_OPTIONS_UP_24;
                case SDK_ASSET_ILLUSTRATION_BANK_VALUE:
                    return Icon.ICON_OPTIONS_VOLATILE_24;
                case SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE:
                    return Icon.ICON_ORDER_16;
                case 283:
                    return Icon.ICON_ORDER_24;
                case SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE:
                    return Icon.ICON_PAUSE_HERO_40;
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE:
                    return Icon.ICON_PAUSE_INLINE_24;
                case f2777x89a9e432:
                    return Icon.ICON_PAYCHECK_24;
                case SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE:
                    return Icon.ICON_PAYMENT_12;
                case 288:
                    return Icon.ICON_PAYMENT_16;
                case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE:
                    return Icon.ICON_PAYMENT_24;
                case SDK_ASSET_ILLUSTRATION_NOTE_VALUE:
                    return Icon.ICON_PAYMENT_32;
                case f2776x87e624cb:
                    return Icon.ICON_PERCENT_SIGN_12;
                case SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE:
                    return Icon.ICON_PERCENT_SIGN_16;
                case SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE:
                    return Icon.ICON_PERCENT_SIGN_24;
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE:
                    return Icon.ICON_PERSON_12;
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE:
                    return Icon.ICON_PERSON_16;
                case SDK_ASSET_LOADING_INDICATOR_VALUE:
                    return Icon.ICON_PERSON_24;
                case SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE:
                    return Icon.ICON_PHONE_16;
                case SDK_ASSET_BANK_ICON_CIRCLE_VALUE:
                    return Icon.ICON_PHONE_24;
                case SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE:
                    return Icon.ICON_PHONE_CONNECTED_16;
                case 300:
                    return Icon.ICON_PHONE_MISSED_CALL_16;
                case SDK_ASSET_CASH_ICON_CIRCLE_VALUE:
                    return Icon.ICON_PHONE_WAITING_16;
                case 302:
                    return Icon.ICON_PIN_16;
                case SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE:
                    return Icon.ICON_PIN_24;
                case SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE:
                    return Icon.ICON_PLAY_HERO_40;
                case SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE:
                    return Icon.ICON_PLAY_INLINE_16;
                case SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE:
                    return Icon.ICON_PLAY_INLINE_24;
                case SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE:
                    return Icon.ICON_PLUS_12;
                case SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE:
                    return Icon.ICON_PLUS_16;
                case SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE:
                    return Icon.ICON_PLUS_24;
                case SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE:
                    return Icon.ICON_POP_OUT_16;
                case SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE:
                    return Icon.ICON_POP_OUT_24;
                case f2774x74902ae0:
                    return Icon.ICON_PRINT_24;
                case SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE:
                    return Icon.ICON_QR_16;
                case SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE:
                    return Icon.ICON_QR_24;
                case SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE:
                    return Icon.ICON_QR_SCAN_24;
                case 316:
                    return Icon.ICON_QUANTITY_16;
                case SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE:
                    return Icon.ICON_QUANTITY_24;
                case SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE:
                    return Icon.ICON_QUESTION_12;
                case f2781x2ba65ba3:
                    return Icon.ICON_QUESTION_16;
                case SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE:
                    return Icon.ICON_QUESTION_24;
                case SDK_ASSET_BANK_ICON_CIRCLE_LIGHT_VALUE:
                    return Icon.ICON_QUESTION_FILLED_12;
                case SDK_ASSET_PLAID_PROFILE_CIRCLE_VALUE:
                    return Icon.ICON_QUESTION_FILLED_16;
                case f2775xbcb7e6f3:
                    return Icon.ICON_QUESTION_FILLED_24;
                case SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE:
                    return Icon.ICON_RECURRING_12;
                case SDK_ASSET_ICON_REPORT_VALUE:
                    return Icon.ICON_RECURRING_16;
                case SDK_ASSET_ICON_STEP_COMPLETE_VALUE:
                    return Icon.ICON_RECURRING_24;
                case SDK_ASSET_ICON_UPLOAD_VALUE:
                    return Icon.ICON_RECURRING_HUB_24;
                case SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE:
                    return Icon.ICON_REPEAT_16;
                case SDK_ASSET_ICON_LIGHTNING_FILLED_BLUE_VALUE:
                    return Icon.ICON_REPLAY_HERO_40;
                case 330:
                    return Icon.ICON_RESEND_16;
                case 331:
                    return Icon.ICON_RESEND_24;
                case 332:
                    return Icon.ICON_RETIREMENT_12;
                case 333:
                    return Icon.ICON_RETIREMENT_16;
                case 334:
                    return Icon.ICON_RETIREMENT_24;
                case 335:
                    return Icon.ICON_RETIREMENT_32;
                case WaitlistAnimationConstants.IN_WAITLIST_ANIMATION_END /* 336 */:
                    return Icon.ICON_RHW_BROWSER_TAB_24;
                case 337:
                    return Icon.ICON_RHW_CHART_TAB_24;
                case 338:
                    return Icon.ICON_RHW_SEARCH_TAB_24;
                case 339:
                    return Icon.ICON_RISK_AND_UNCERTAINTY_24;
                case 340:
                    return Icon.ICON_ROBINHOOD_12;
                case 341:
                    return Icon.ICON_ROBINHOOD_16;
                case 342:
                    return Icon.ICON_ROBINHOOD_24;
                case 343:
                    return Icon.ICON_ROLLING_POSITION_12;
                case 344:
                    return Icon.ICON_ROLLING_POSITION_16;
                case 345:
                    return Icon.ICON_ROLLING_POSITION_24;
                case 346:
                    return Icon.ICON_SCAN_16;
                case 347:
                    return Icon.ICON_SCAN_24;
                case 348:
                    return Icon.ICON_SEARCH_16;
                case 349:
                    return Icon.ICON_SEARCH_24;
                case 350:
                    return Icon.ICON_SETTINGS_12;
                case 351:
                    return Icon.ICON_SETTINGS_16;
                case 352:
                    return Icon.ICON_SETTINGS_24;
                case 353:
                    return Icon.ICON_SHARE_ANDROID_16;
                case 354:
                    return Icon.ICON_SHARE_ANDROID_24;
                case 355:
                    return Icon.ICON_SHARE_IOS_16;
                case 356:
                    return Icon.ICON_SHARE_IOS_24;
                case 357:
                    return Icon.ICON_SMILEY_24;
                case 358:
                    return Icon.ICON_SOUND_OFF_24;
                case 359:
                    return Icon.ICON_SOUND_ON_24;
                case 360:
                    return Icon.ICON_SPARKLE_BULLET_12;
                case 361:
                    return Icon.ICON_SPARKLE_BULLET_16;
                case 362:
                    return Icon.ICON_SPARKLE_BULLET_24;
                case 363:
                    return Icon.ICON_STAR_FILLED_12;
                case 364:
                    return Icon.ICON_STAR_FILLED_16;
                case 365:
                    return Icon.ICON_STAR_FILLED_24;
                case 366:
                    return Icon.ICON_STAR_OUTLINE_16;
                case 367:
                    return Icon.ICON_STAR_OUTLINE_24;
                case 368:
                    return Icon.ICON_STEWARDSHIP_24;
                case 369:
                    return Icon.ICON_STOCK_DOWN_12;
                case 370:
                    return Icon.ICON_STOCK_DOWN_16;
                case 371:
                    return Icon.ICON_STOCK_DOWN_24;
                case 372:
                    return Icon.ICON_STOCK_UP_12;
                case 373:
                    return Icon.ICON_STOCK_UP_16;
                case 374:
                    return Icon.ICON_STOCK_UP_24;
                case 375:
                    return Icon.ICON_STOPWATCH_16;
                case 376:
                    return Icon.ICON_STOPWATCH_24;
                case 377:
                    return Icon.ICON_STOPWATCH_32;
                case 378:
                    return Icon.ICON_STRATEGY_OUTLOOK_24;
                case 379:
                    return Icon.ICON_SWIPE_DOWN_16;
                case 380:
                    return Icon.ICON_SWIPE_DOWN_24;
                case 381:
                    return Icon.ICON_SWIPE_UP_16;
                case 382:
                    return Icon.ICON_SWIPE_UP_24;
                case 383:
                    return Icon.ICON_SWITCH_16;
                case 384:
                    return Icon.ICON_SWITCH_24;
                case 385:
                    return Icon.ICON_TAB_ACCOUNT_32;
                case 386:
                    return Icon.ICON_TAB_CONTENT_32;
                case 387:
                    return Icon.ICON_TAB_CRYPTO_32;
                case 388:
                    return Icon.ICON_TAB_CRYPTO_C_32;
                case 389:
                    return Icon.ICON_TAB_GOLD_32;
                case 390:
                    return Icon.ICON_TAB_INVEST_32;
                case 391:
                    return Icon.ICON_TAB_MESSAGES_32;
                case 392:
                    return Icon.ICON_TAB_MONEY_32;
                case 393:
                    return Icon.ICON_TAB_RETIREMENT_32;
                case 394:
                    return Icon.ICON_TAB_SEARCH_32;
                case 395:
                    return Icon.ICON_TAG_16;
                case WaitlistAnimationConstants.LEFT_YAW_START /* 396 */:
                    return Icon.ICON_TAG_24;
                case 397:
                    return Icon.ICON_TECHNOLOGY_12;
                case 398:
                    return Icon.ICON_TECHNOLOGY_24;
                case 399:
                    return Icon.ICON_THUMBPRINT_16;
                case 400:
                    return Icon.ICON_THUMBPRINT_24;
                case 401:
                    return Icon.ICON_THUMBS_DOWN_16;
                case 402:
                    return Icon.ICON_THUMBS_DOWN_24;
                case HttpStatusCode.FORBIDDEN /* 403 */:
                    return Icon.ICON_THUMBS_UP_16;
                case 404:
                    return Icon.ICON_THUMBS_UP_24;
                case 405:
                    return Icon.ICON_TICKET_16;
                case 406:
                    return Icon.ICON_TICKET_24;
                case 407:
                    return Icon.ICON_TOUCH_ID_ANDROID_16;
                case 408:
                    return Icon.ICON_TOUCH_ID_ANDROID_24;
                case 409:
                    return Icon.ICON_TRANSFERS_12;
                case HttpStatusCode.GONE /* 410 */:
                    return Icon.ICON_TRANSFERS_16;
                case 411:
                    return Icon.ICON_TRANSFERS_24;
                case 412:
                    return Icon.ICON_TRANSPORT_24;
                case 413:
                    return Icon.ICON_TRASH_12;
                case 414:
                    return Icon.ICON_TRASH_16;
                case 415:
                    return Icon.ICON_TRASH_24;
                case 416:
                    return Icon.ICON_TRIANGLE_ALERT_16;
                case 417:
                    return Icon.ICON_TRIANGLE_ALERT_24;
                case 418:
                    return Icon.ICON_TUNER_16;
                case 419:
                    return Icon.ICON_TUNER_24;
                case 420:
                    return Icon.ICON_UNLOCK_12;
                case 421:
                    return Icon.ICON_UNLOCK_16;
                case 422:
                    return Icon.ICON_UNLOCK_24;
                case 423:
                    return Icon.ICON_UPLOAD_24;
                case 424:
                    return Icon.ICON_VIDEO_FAST_FORWARD_24;
                case CompanyFinancialsSection.BAR_ANIMATION_DURATION /* 425 */:
                    return Icon.ICON_VIDEO_REPLAY_24;
                case 426:
                    return Icon.ICON_VIDEO_REWIND_15_32;
                case 427:
                    return Icon.ICON_VIDEO_REWIND_24;
                case 428:
                    return Icon.ICON_VIDEO_SKIP_15_32;
                case 429:
                    return Icon.ICON_WALLET_24;
                case 430:
                    return Icon.ICON_WALLET_32;
                case 431:
                    return Icon.ICON_WALLETCONNECT_16;
                case 432:
                    return Icon.ICON_WALLETCONNECT_24;
                case 433:
                    return Icon.ICON_WC_SCAN_24;
                case 434:
                    return Icon.ICON_WITHDRAW_16;
                case 435:
                    return Icon.ICON_WITHDRAW_24;
                case 436:
                    return Icon.ICON_ZOOM_IN_24;
                case 437:
                    return Icon.ICON_ZOOM_OUT_24;
                case 438:
                    return Icon.ICON_JOINT_ACCOUNT_12;
                case 439:
                    return Icon.ICON_JOINT_ACCOUNT_16;
                case 440:
                    return Icon.ICON_JOINT_ACCOUNT_24;
                case 441:
                    return Icon.ICON_GOLD_16;
                case 442:
                    return Icon.ICON_NUMPAD_DOWN_24;
                case 443:
                    return Icon.ICON_NUMPAD_UP_24;
                case 444:
                    return Icon.ICON_SPEED_DOWN_24;
                case 445:
                    return Icon.ICON_SPEED_UP_24;
                case 446:
                    return Icon.ICON_ARROW_UP_RIGHT_16;
                case 447:
                    return Icon.ICON_EURO_SIGN_12;
                case 448:
                    return Icon.ICON_EURO_SIGN_16;
                case 449:
                    return Icon.ICON_EURO_SIGN_24;
                case 450:
                    return Icon.ICON_GOLD_24;
                case 451:
                    return Icon.ICON_TAX_LOTS_LONG_TERM_16;
                case 452:
                    return Icon.ICON_TAX_LOTS_SHORT_TERM_16;
                case 453:
                    return Icon.ICON_ARROW_DIAGONAL_UP_16;
                case 454:
                    return Icon.ICON_BAR_CHART_24;
                case 455:
                    return Icon.ICON_PICTURE_IN_PICTURE_24;
                case WaitlistAnimationConstants.MIDDLE_YAW_FRAME /* 456 */:
                    return Icon.ICON_PIE_CHART_24;
                case 457:
                    return Icon.ICON_BAR_CHART_16;
                case 458:
                    return Icon.ICON_CHART_BAR_24;
                case 459:
                    return Icon.ICON_FINANCE_16;
                case 460:
                    return Icon.ICON_ICLOUD_RESTORE_16;
                case 461:
                    return Icon.ICON_LIST_24;
                case 462:
                    return Icon.ICON_MANAGED_ACCOUNTS_16;
                case 463:
                    return Icon.ICON_MANAGED_ACCOUNTS_24;
                case 464:
                    return Icon.ICON_MANAGED_INDIVIDUAL_24;
                case 465:
                    return Icon.ICON_MANAGED_JOINT_24;
                case 466:
                    return Icon.ICON_MANAGED_RETIREMENT_24;
                case 467:
                    return Icon.ICON_PIE_CHART_16;
                case 468:
                    return Icon.ICON_SPARKLE_DOUBLE_24;
                case 469:
                    return Icon.ICON_ANNOUNCEMENT_12;
                case 470:
                    return Icon.ICON_ARROW_DOWN_RIGHT_12;
                case 471:
                    return Icon.ICON_ARROW_UP_RIGHT_12;
                case 472:
                    return Icon.ICON_BOOKMARK_POST_FILLED_16;
                case 473:
                    return Icon.ICON_BOOKMARK_POST_OUTLINE_16;
                case 474:
                    return Icon.ICON_COMMENT_FILLED_16;
                case 475:
                    return Icon.ICON_COMMENT_OUTLINE_16;
                case 476:
                    return Icon.ICON_CONVERT_24;
                case 477:
                    return Icon.ICON_COPY_TRADE_FILLED_16;
                case 478:
                    return Icon.ICON_COPY_TRADE_OUTLINE_16;
                case 479:
                    return Icon.ICON_CORN_FUTURES_24;
                case 480:
                    return Icon.ICON_CORTEX_12;
                case 481:
                    return Icon.ICON_CORTEX_16;
                case 482:
                    return Icon.ICON_CORTEX_24;
                case 483:
                    return Icon.ICON_DISCLOSURES_16;
                case 484:
                    return Icon.ICON_FEATURED_16;
                case 485:
                    return Icon.ICON_FEATURED_24;
                case 486:
                    return Icon.ICON_HOURGLASS_12;
                case 487:
                    return Icon.ICON_LIKE_POST_FILLED_16;
                case 488:
                    return Icon.ICON_LIKE_POST_OUTLINE_16;
                case 489:
                    return Icon.ICON_LIKE_POST_OUTLINE_24;
                case 490:
                    return Icon.ICON_MORE_MENU_16;
                case 491:
                    return Icon.ICON_NOTIFICATION_12;
                case 492:
                    return Icon.ICON_PERPETUAL_FUTURES_32;
                case 493:
                    return Icon.ICON_SORT_12;
                case 494:
                    return Icon.ICON_SPARKLE_DOUBLE_16;
                case 495:
                    return Icon.ICON_STAR_PASSWORD_16;
                case 496:
                    return Icon.ICON_TAB_SOCIAL_32;
                case 497:
                    return Icon.ICON_TAB_WATCHLIST_32;
                case 498:
                    return Icon.ICON_CALENDAR_12;
                case 499:
                    return Icon.ICON_CHART_STACKED_BAR_16;
                case 500:
                    return Icon.ICON_CUSTODIAL_16;
                case 501:
                    return Icon.ICON_CUSTODIAL_24;
                case com.withpersona.sdk2.inquiry.network.core.HttpStatusCode.BAD_GATEWAY_502 /* 502 */:
                    return Icon.ICON_VIDEO_CALL_12;
                case 503:
                    return Icon.ICON_VIDEO_CALL_16;
                case 504:
                    return Icon.ICON_VIDEO_CALL_24;
                case 505:
                    return Icon.ICON_COMMENT_FILLED_20;
                case 506:
                    return Icon.ICON_COMMENT_OUTLINE_20;
                case 507:
                    return Icon.ICON_CONCIERGE_24;
                case 508:
                    return Icon.ICON_ISA_16;
                case 509:
                    return Icon.ICON_ISA_24;
                case 510:
                    return Icon.ICON_LIKE_POST_FILLED_20;
                case 511:
                    return Icon.ICON_LIKE_POST_OUTLINE_20;
                case 512:
                    return Icon.ICON_MORE_MENU_20;
                case 513:
                    return Icon.ICON_NOTIFICATION_CHECK_16;
                case 514:
                    return Icon.ICON_NOTIFICATION_CHECK_24;
                case 515:
                    return Icon.ICON_SOCIAL_CREATE_POST_16;
                case WaitlistAnimationConstants.RIGHT_YAW_END /* 516 */:
                    return Icon.ICON_TAB_ISA_32;
                case 517:
                    return Icon.ICON_TRADE_SOCIAL_FILLED_20;
                case 518:
                    return Icon.ICON_TRADE_SOCIAL_OUTLINE_20;
                default:
                    return null;
            }
        }
    }

    public static Icon valueOf(String str) {
        return (Icon) Enum.valueOf(Icon.class, str);
    }

    public static Icon[] values() {
        return (Icon[]) $VALUES.clone();
    }
}
