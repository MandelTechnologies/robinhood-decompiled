package microgram.p507ui.sdui;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equities.companyfinancials.p116ui.CompanyFinancialsSection;
import com.robinhood.android.waitlist.spot.WaitlistAnimationConstants;
import com.robinhood.utils.http.HttpStatusCode;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.Enums4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0003\bÃ\u0003\b\u0087\u0081\u0002\u0018\u0000 Å\u00032\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002Å\u0003B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001j\u0003\b\u0098\u0001j\u0003\b\u0099\u0001j\u0003\b\u009a\u0001j\u0003\b\u009b\u0001j\u0003\b\u009c\u0001j\u0003\b\u009d\u0001j\u0003\b\u009e\u0001j\u0003\b\u009f\u0001j\u0003\b \u0001j\u0003\b¡\u0001j\u0003\b¢\u0001j\u0003\b£\u0001j\u0003\b¤\u0001j\u0003\b¥\u0001j\u0003\b¦\u0001j\u0003\b§\u0001j\u0003\b¨\u0001j\u0003\b©\u0001j\u0003\bª\u0001j\u0003\b«\u0001j\u0003\b¬\u0001j\u0003\b\u00ad\u0001j\u0003\b®\u0001j\u0003\b¯\u0001j\u0003\b°\u0001j\u0003\b±\u0001j\u0003\b²\u0001j\u0003\b³\u0001j\u0003\b´\u0001j\u0003\bµ\u0001j\u0003\b¶\u0001j\u0003\b·\u0001j\u0003\b¸\u0001j\u0003\b¹\u0001j\u0003\bº\u0001j\u0003\b»\u0001j\u0003\b¼\u0001j\u0003\b½\u0001j\u0003\b¾\u0001j\u0003\b¿\u0001j\u0003\bÀ\u0001j\u0003\bÁ\u0001j\u0003\bÂ\u0001j\u0003\bÃ\u0001j\u0003\bÄ\u0001j\u0003\bÅ\u0001j\u0003\bÆ\u0001j\u0003\bÇ\u0001j\u0003\bÈ\u0001j\u0003\bÉ\u0001j\u0003\bÊ\u0001j\u0003\bË\u0001j\u0003\bÌ\u0001j\u0003\bÍ\u0001j\u0003\bÎ\u0001j\u0003\bÏ\u0001j\u0003\bÐ\u0001j\u0003\bÑ\u0001j\u0003\bÒ\u0001j\u0003\bÓ\u0001j\u0003\bÔ\u0001j\u0003\bÕ\u0001j\u0003\bÖ\u0001j\u0003\b×\u0001j\u0003\bØ\u0001j\u0003\bÙ\u0001j\u0003\bÚ\u0001j\u0003\bÛ\u0001j\u0003\bÜ\u0001j\u0003\bÝ\u0001j\u0003\bÞ\u0001j\u0003\bß\u0001j\u0003\bà\u0001j\u0003\bá\u0001j\u0003\bâ\u0001j\u0003\bã\u0001j\u0003\bä\u0001j\u0003\bå\u0001j\u0003\bæ\u0001j\u0003\bç\u0001j\u0003\bè\u0001j\u0003\bé\u0001j\u0003\bê\u0001j\u0003\bë\u0001j\u0003\bì\u0001j\u0003\bí\u0001j\u0003\bî\u0001j\u0003\bï\u0001j\u0003\bð\u0001j\u0003\bñ\u0001j\u0003\bò\u0001j\u0003\bó\u0001j\u0003\bô\u0001j\u0003\bõ\u0001j\u0003\bö\u0001j\u0003\b÷\u0001j\u0003\bø\u0001j\u0003\bù\u0001j\u0003\bú\u0001j\u0003\bû\u0001j\u0003\bü\u0001j\u0003\bý\u0001j\u0003\bþ\u0001j\u0003\bÿ\u0001j\u0003\b\u0080\u0002j\u0003\b\u0081\u0002j\u0003\b\u0082\u0002j\u0003\b\u0083\u0002j\u0003\b\u0084\u0002j\u0003\b\u0085\u0002j\u0003\b\u0086\u0002j\u0003\b\u0087\u0002j\u0003\b\u0088\u0002j\u0003\b\u0089\u0002j\u0003\b\u008a\u0002j\u0003\b\u008b\u0002j\u0003\b\u008c\u0002j\u0003\b\u008d\u0002j\u0003\b\u008e\u0002j\u0003\b\u008f\u0002j\u0003\b\u0090\u0002j\u0003\b\u0091\u0002j\u0003\b\u0092\u0002j\u0003\b\u0093\u0002j\u0003\b\u0094\u0002j\u0003\b\u0095\u0002j\u0003\b\u0096\u0002j\u0003\b\u0097\u0002j\u0003\b\u0098\u0002j\u0003\b\u0099\u0002j\u0003\b\u009a\u0002j\u0003\b\u009b\u0002j\u0003\b\u009c\u0002j\u0003\b\u009d\u0002j\u0003\b\u009e\u0002j\u0003\b\u009f\u0002j\u0003\b \u0002j\u0003\b¡\u0002j\u0003\b¢\u0002j\u0003\b£\u0002j\u0003\b¤\u0002j\u0003\b¥\u0002j\u0003\b¦\u0002j\u0003\b§\u0002j\u0003\b¨\u0002j\u0003\b©\u0002j\u0003\bª\u0002j\u0003\b«\u0002j\u0003\b¬\u0002j\u0003\b\u00ad\u0002j\u0003\b®\u0002j\u0003\b¯\u0002j\u0003\b°\u0002j\u0003\b±\u0002j\u0003\b²\u0002j\u0003\b³\u0002j\u0003\b´\u0002j\u0003\bµ\u0002j\u0003\b¶\u0002j\u0003\b·\u0002j\u0003\b¸\u0002j\u0003\b¹\u0002j\u0003\bº\u0002j\u0003\b»\u0002j\u0003\b¼\u0002j\u0003\b½\u0002j\u0003\b¾\u0002j\u0003\b¿\u0002j\u0003\bÀ\u0002j\u0003\bÁ\u0002j\u0003\bÂ\u0002j\u0003\bÃ\u0002j\u0003\bÄ\u0002j\u0003\bÅ\u0002j\u0003\bÆ\u0002j\u0003\bÇ\u0002j\u0003\bÈ\u0002j\u0003\bÉ\u0002j\u0003\bÊ\u0002j\u0003\bË\u0002j\u0003\bÌ\u0002j\u0003\bÍ\u0002j\u0003\bÎ\u0002j\u0003\bÏ\u0002j\u0003\bÐ\u0002j\u0003\bÑ\u0002j\u0003\bÒ\u0002j\u0003\bÓ\u0002j\u0003\bÔ\u0002j\u0003\bÕ\u0002j\u0003\bÖ\u0002j\u0003\b×\u0002j\u0003\bØ\u0002j\u0003\bÙ\u0002j\u0003\bÚ\u0002j\u0003\bÛ\u0002j\u0003\bÜ\u0002j\u0003\bÝ\u0002j\u0003\bÞ\u0002j\u0003\bß\u0002j\u0003\bà\u0002j\u0003\bá\u0002j\u0003\bâ\u0002j\u0003\bã\u0002j\u0003\bä\u0002j\u0003\bå\u0002j\u0003\bæ\u0002j\u0003\bç\u0002j\u0003\bè\u0002j\u0003\bé\u0002j\u0003\bê\u0002j\u0003\bë\u0002j\u0003\bì\u0002j\u0003\bí\u0002j\u0003\bî\u0002j\u0003\bï\u0002j\u0003\bð\u0002j\u0003\bñ\u0002j\u0003\bò\u0002j\u0003\bó\u0002j\u0003\bô\u0002j\u0003\bõ\u0002j\u0003\bö\u0002j\u0003\b÷\u0002j\u0003\bø\u0002j\u0003\bù\u0002j\u0003\bú\u0002j\u0003\bû\u0002j\u0003\bü\u0002j\u0003\bý\u0002j\u0003\bþ\u0002j\u0003\bÿ\u0002j\u0003\b\u0080\u0003j\u0003\b\u0081\u0003j\u0003\b\u0082\u0003j\u0003\b\u0083\u0003j\u0003\b\u0084\u0003j\u0003\b\u0085\u0003j\u0003\b\u0086\u0003j\u0003\b\u0087\u0003j\u0003\b\u0088\u0003j\u0003\b\u0089\u0003j\u0003\b\u008a\u0003j\u0003\b\u008b\u0003j\u0003\b\u008c\u0003j\u0003\b\u008d\u0003j\u0003\b\u008e\u0003j\u0003\b\u008f\u0003j\u0003\b\u0090\u0003j\u0003\b\u0091\u0003j\u0003\b\u0092\u0003j\u0003\b\u0093\u0003j\u0003\b\u0094\u0003j\u0003\b\u0095\u0003j\u0003\b\u0096\u0003j\u0003\b\u0097\u0003j\u0003\b\u0098\u0003j\u0003\b\u0099\u0003j\u0003\b\u009a\u0003j\u0003\b\u009b\u0003j\u0003\b\u009c\u0003j\u0003\b\u009d\u0003j\u0003\b\u009e\u0003j\u0003\b\u009f\u0003j\u0003\b \u0003j\u0003\b¡\u0003j\u0003\b¢\u0003j\u0003\b£\u0003j\u0003\b¤\u0003j\u0003\b¥\u0003j\u0003\b¦\u0003j\u0003\b§\u0003j\u0003\b¨\u0003j\u0003\b©\u0003j\u0003\bª\u0003j\u0003\b«\u0003j\u0003\b¬\u0003j\u0003\b\u00ad\u0003j\u0003\b®\u0003j\u0003\b¯\u0003j\u0003\b°\u0003j\u0003\b±\u0003j\u0003\b²\u0003j\u0003\b³\u0003j\u0003\b´\u0003j\u0003\bµ\u0003j\u0003\b¶\u0003j\u0003\b·\u0003j\u0003\b¸\u0003j\u0003\b¹\u0003j\u0003\bº\u0003j\u0003\b»\u0003j\u0003\b¼\u0003j\u0003\b½\u0003j\u0003\b¾\u0003j\u0003\b¿\u0003j\u0003\bÀ\u0003j\u0003\bÁ\u0003j\u0003\bÂ\u0003j\u0003\bÃ\u0003j\u0003\bÄ\u0003¨\u0006Æ\u0003"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiIcon;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ACCOUNT_SUMMARY_12", "ACCOUNT_SUMMARY_24", "ACTIONS_ALERTS_32", "ACTIONS_ATM_32", "ACTIONS_CHECK_32", "ACTIONS_STATEMENTS_32", "ACTIONS_TRANSFERS_32", "ACTION_REMOVE_24", "AGENT_16", "AGENT_24", "ALERT_12", "ALERT_16", "ALERT_24", "ALERT_FILLED_12", "ALERT_FILLED_16", "ALERT_FILLED_24", "ALL_DAY_TRADING_12", "ALL_DAY_TRADING_16", "ALL_DAY_TRADING_24", "ANNOUNCEMENT_16", "ANNOUNCEMENT_24", "ARCHIVE_24", "ARROW_DOWN_12", "ARROW_DOWN_16", "ARROW_DOWN_24", "ARROW_DOWN_FILL_12", "ARROW_DOWN_FILL_16", "ARROW_DOWN_FILL_24", "ARROW_LEFT_12", "ARROW_LEFT_16", "ARROW_LEFT_24", "ARROW_LEFT_FILL_12", "ARROW_LEFT_FILL_16", "ARROW_LEFT_FILL_24", "ARROW_RIGHT_12", "ARROW_RIGHT_16", "ARROW_RIGHT_24", "ARROW_RIGHT_FILL_12", "ARROW_RIGHT_FILL_16", "ARROW_RIGHT_FILL_24", "ARROW_UP_12", "ARROW_UP_16", "ARROW_UP_24", "ARROW_UP_FILL_12", "ARROW_UP_FILL_16", "ARROW_UP_FILL_24", "ATTACH_24", "BACKSPACE_24", "BACKSPACE_32", "BANKING_16", "BANKING_24", "BANKING_32", "BUBBLE_CHECKED_12", "BUBBLE_CHECKED_16", "BUBBLE_CHECKED_24", "BUBBLE_DOT_24", "BUBBLE_EMPTY_24", "BUBBLE_MINUS_16", "BUBBLE_MINUS_24", "BUBBLE_PAUSE_24", "BUBBLE_PLUS_16", "BUBBLE_PLUS_24", "BUBBLE_PLUS_FILLED_24", "BUBBLE_RADIO_BUTTON_24", "BUBBLE_REMOVE_16", "BUBBLE_REMOVE_24", "BUBBLE_REMOVE_FILLED_16", "BUBBLE_REMOVE_FILLED_24", "BUBBLE_REVERSE_24", "BUBBLE_UK_POUNDS_16", "BUBBLE_UK_POUNDS_24", "BUBBLE_UK_POUNDS_FILLED_16", "BUBBLE_UK_POUNDS_FILLED_24", "BUILDER_16", "BUILDER_24", "CALENDAR_16", "CALENDAR_24", "CAMERA_16", "CAMERA_24", "CARET_DOWN_12", "CARET_DOWN_16", "CARET_DOWN_24", "CARET_LEFT_12", "CARET_LEFT_16", "CARET_LEFT_24", "CARET_RIGHT_12", "CARET_RIGHT_16", "CARET_RIGHT_24", "CARET_UP_12", "CARET_UP_16", "CARET_UP_24", "CASH_24", "CHART_16", "CHART_24", "CHART_CANDLESTICKS_16", "CHART_CANDLESTICKS_24", "CHART_LINE_16", "CHART_LINE_24", "CHATBOT_16", "CHATBOT_24", "CHAT_16", "CHAT_24", "CHECKBOX_EMPTY_16", "CHECKBOX_EMPTY_24", "CHECKBOX_FILLED_16", "CHECKBOX_FILLED_24", "CHECKMARK_12", "CHECKMARK_16", "CHECKMARK_24", "CLIPBOARD_16", "CLIPBOARD_24", "CLOCK_12", "CLOCK_16", "CLOCK_24", "CLOSE_12", "CLOSE_16", "CLOSE_24", "CLOUD_16", "CLOUD_24", "COLLAPSE_16", "COLLAPSE_24", "CONSUMER_GOODS_12", "CONSUMER_GOODS_16", "CONSUMER_GOODS_24", "CONTROLS_16", "CONTROLS_24", "CONVERSATION_16", "CONVERSATION_24", "COPY_12", "COPY_16", "COPY_24", "CORPORATE_16", "CORPORATE_24", "CRYPTO_12", "CRYPTO_16", "CRYPTO_24", "CRYPTO_C_12", "CRYPTO_C_16", "CRYPTO_C_24", "DEPOSIT_16", "DEPOSIT_24", "DINING_24", "DISCLOSURES_24", "DIVIDEND_16", "DIVIDEND_24", "DOCUMENTS_24", "DOLLAR_SIGN_12", "DOLLAR_SIGN_16", "DOLLAR_SIGN_24", "DOTS_16", "DOTS_24", "DOTS_ANDROID_16", "DOTS_ANDROID_24", "DOT_12", "DOT_16", "DOT_24", "DOWNLOAD_12", "DOWNLOAD_16", "DOWNLOAD_24", "DRAG_12", "DRAG_16", "DRAG_24", "DROPDOWN_12", "DROPDOWN_16", "DROPDOWN_24", "ECONOMIC_MOAT_24", "EDIT_12", "EDIT_16", "EDIT_24", "EDIT_SURFACE_24", "EMAIL_FILLED_16", "EMAIL_FILLED_24", "EMAIL_OUTLINE_24", "ENERGY_12", "ENERGY_24", "ENTERTAINMENT_24", "ETF_12", "ETF_24", "EXCLAMATION_12", "EXCLAMATION_16", "EXCLAMATION_24", "EXPAND_16", "EXPAND_24", "EYE_16", "EYE_24", "EYE_CLOSED_16", "EYE_CLOSED_24", "FACE_ID_ANDROID_16", "FACE_ID_ANDROID_24", "FACE_ID_IOS_16", "FACE_ID_IOS_24", "FAIR_VALUE_24", "FILTER_12", "FILTER_16", "FILTER_24", "FINANCE_12", "FINANCE_24", "FLASHLIGHT_OFF_24", "FLASHLIGHT_ON_24", "FLASH_OFF_24", "FLASH_ON_24", "FLOWER_16", "FOLDER_16", "FOLDER_24", "FULLSCREEN_ENTER_24", "FULLSCREEN_EXIT_24", "GIFT_12", "GIFT_16", "GIFT_24", "GOLD_16", "GROCERIES_24", "HAMBURGER_12", "HAMBURGER_16", "HAMBURGER_24", "HEALTHCARE_12", "HEALTHCARE_24", "HELP_24", "HISTORY_16", "HISTORY_24", "HOME_24", "HOSPITALITY_12", "HOSPITALITY_24", "HOURGLASS_16", "HOURGLASS_24", "ICLOUD_RESTORE_24", "IMAGE_16", "IMAGE_24", "IMAGE_FAIL_16", "IMAGE_FAIL_24", "INFO_12", "INFO_16", "INFO_24", "INFO_FILLED_12", "INFO_FILLED_16", "INFO_FILLED_24", "JOINT_ACCOUNT_12", "JOINT_ACCOUNT_16", "JOINT_ACCOUNT_24", "L2_HEADER_ARROW_24", "LIGHTBULB_16", "LIGHTBULB_24", "LIGHTNING_12", "LIGHTNING_16", "LIGHTNING_24", "LIGHTNING_OFF_16", "LINK_16", "LINK_24", "LINK_OUT_12", "LINK_OUT_16", "LINK_OUT_24", "LOCATION_FILL_16", "LOCATION_FILL_24", "LOCATION_OUTLINE_24", "LOCK_12", "LOCK_16", "LOCK_24", "LOG_OUT_24", "MANUFACTURING_12", "MANUFACTURING_24", "MAPS_24", "MARGIN_12", "MARGIN_16", "MARGIN_24", "MAXIMUM_16", "MESSAGE_SEND_16", "MESSAGE_SEND_24", "MINIMUM_16", "MINUS_12", "MINUS_16", "MINUS_24", "NEWS_16", "NEWS_24", "NOTIFICATION_16", "NOTIFICATION_24", "NOTIFICATION_32", "NOTIFICATION_ADD_16", "NOTIFICATION_ADD_24", "NO_VALUE_24", "NO_VALUE_32", "NUMPAD_DOWN_24", "NUMPAD_UP_24", "ONLINE_16", "ONLINE_24", "OPTIONS_DOWN_24", "OPTIONS_FLAT_24", "OPTIONS_UP_24", "OPTIONS_VOLATILE_24", "ORDER_16", "ORDER_24", "PAUSE_HERO_40", "PAUSE_INLINE_24", "PAYCHECK_24", "PAYMENT_12", "PAYMENT_16", "PAYMENT_24", "PAYMENT_32", "PERCENT_SIGN_12", "PERCENT_SIGN_16", "PERCENT_SIGN_24", "PERSON_12", "PERSON_16", "PERSON_24", "PHONE_16", "PHONE_24", "PHONE_CONNECTED_16", "PHONE_MISSED_CALL_16", "PHONE_WAITING_16", "PIN_16", "PIN_24", "PLAY_HERO_40", "PLAY_INLINE_16", "PLAY_INLINE_24", "PLUS_12", "PLUS_16", "PLUS_24", "POP_OUT_16", "POP_OUT_24", "PRINT_24", "QR_16", "QR_24", "QR_SCAN_24", "QUANTITY_16", "QUANTITY_24", "QUESTION_12", "QUESTION_16", "QUESTION_24", "QUESTION_FILLED_12", "QUESTION_FILLED_16", "QUESTION_FILLED_24", "RECURRING_12", "RECURRING_16", "RECURRING_24", "RECURRING_HUB_24", "REPEAT_16", "REPLAY_HERO_40", "RESEND_16", "RESEND_24", "RETIREMENT_12", "RETIREMENT_16", "RETIREMENT_24", "RETIREMENT_32", "RHW_BROWSER_TAB_24", "RHW_CHART_TAB_24", "RHW_SEARCH_TAB_24", "RISK_AND_UNCERTAINTY_24", "ROBINHOOD_12", "ROBINHOOD_16", "ROBINHOOD_24", "ROLLING_POSITION_12", "ROLLING_POSITION_16", "ROLLING_POSITION_24", "SCAN_16", "SCAN_24", "SEARCH_16", "SEARCH_24", "SETTINGS_12", "SETTINGS_16", "SETTINGS_24", "SHARE_ANDROID_16", "SHARE_ANDROID_24", "SHARE_IOS_16", "SHARE_IOS_24", "SMILEY_24", "SOUND_OFF_24", "SOUND_ON_24", "SPARKLE_BULLET_12", "SPARKLE_BULLET_16", "SPARKLE_BULLET_24", "SPEED_DOWN_24", "SPEED_UP_24", "STAR_FILLED_12", "STAR_FILLED_16", "STAR_FILLED_24", "STAR_OUTLINE_16", "STAR_OUTLINE_24", "STEWARDSHIP_24", "STOCK_DOWN_12", "STOCK_DOWN_16", "STOCK_DOWN_24", "STOCK_UP_12", "STOCK_UP_16", "STOCK_UP_24", "STOPWATCH_16", "STOPWATCH_24", "STOPWATCH_32", "STRATEGY_OUTLOOK_24", "SWIPE_DOWN_16", "SWIPE_DOWN_24", "SWIPE_UP_16", "SWIPE_UP_24", "SWITCH_16", "SWITCH_24", "TAB_ACCOUNT_32", "TAB_CONTENT_32", "TAB_CRYPTO_32", "TAB_CRYPTO_C_32", "TAB_GOLD_32", "TAB_INVEST_32", "TAB_MESSAGES_32", "TAB_MONEY_32", "TAB_RETIREMENT_32", "TAB_SEARCH_32", "TAG_16", "TAG_24", "TECHNOLOGY_12", "TECHNOLOGY_24", "THUMBPRINT_16", "THUMBPRINT_24", "THUMBS_DOWN_16", "THUMBS_DOWN_24", "THUMBS_UP_16", "THUMBS_UP_24", "TICKET_16", "TICKET_24", "TOUCH_ID_ANDROID_16", "TOUCH_ID_ANDROID_24", "TRANSFERS_12", "TRANSFERS_16", "TRANSFERS_24", "TRANSPORT_24", "TRASH_12", "TRASH_16", "TRASH_24", "TRIANGLE_ALERT_16", "TRIANGLE_ALERT_24", "TUNER_16", "TUNER_24", "UNKNOWN", "UNLOCK_12", "UNLOCK_16", "UNLOCK_24", "UPLOAD_24", "VIDEO_FAST_FORWARD_24", "VIDEO_REPLAY_24", "VIDEO_REWIND_15_32", "VIDEO_REWIND_24", "VIDEO_SKIP_15_32", "WALLETCONNECT_16", "WALLETCONNECT_24", "WALLET_24", "WALLET_32", "WC_SCAN_24", "WITHDRAW_16", "WITHDRAW_24", "ZOOM_IN_24", "ZOOM_OUT_24", "Companion", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final class SduiIcon {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SduiIcon[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String value;

    @SerialName("account_summary_12")
    public static final SduiIcon ACCOUNT_SUMMARY_12 = new SduiIcon("ACCOUNT_SUMMARY_12", 0, "account_summary_12");

    @SerialName("account_summary_24")
    public static final SduiIcon ACCOUNT_SUMMARY_24 = new SduiIcon("ACCOUNT_SUMMARY_24", 1, "account_summary_24");

    @SerialName("actions_alerts_32")
    public static final SduiIcon ACTIONS_ALERTS_32 = new SduiIcon("ACTIONS_ALERTS_32", 2, "actions_alerts_32");

    @SerialName("actions_atm_32")
    public static final SduiIcon ACTIONS_ATM_32 = new SduiIcon("ACTIONS_ATM_32", 3, "actions_atm_32");

    @SerialName("actions_check_32")
    public static final SduiIcon ACTIONS_CHECK_32 = new SduiIcon("ACTIONS_CHECK_32", 4, "actions_check_32");

    @SerialName("actions_statements_32")
    public static final SduiIcon ACTIONS_STATEMENTS_32 = new SduiIcon("ACTIONS_STATEMENTS_32", 5, "actions_statements_32");

    @SerialName("actions_transfers_32")
    public static final SduiIcon ACTIONS_TRANSFERS_32 = new SduiIcon("ACTIONS_TRANSFERS_32", 6, "actions_transfers_32");

    @SerialName("action_remove_24")
    public static final SduiIcon ACTION_REMOVE_24 = new SduiIcon("ACTION_REMOVE_24", 7, "action_remove_24");

    @SerialName("agent_16")
    public static final SduiIcon AGENT_16 = new SduiIcon("AGENT_16", 8, "agent_16");

    @SerialName("agent_24")
    public static final SduiIcon AGENT_24 = new SduiIcon("AGENT_24", 9, "agent_24");

    @SerialName("alert_12")
    public static final SduiIcon ALERT_12 = new SduiIcon("ALERT_12", 10, "alert_12");

    @SerialName("alert_16")
    public static final SduiIcon ALERT_16 = new SduiIcon("ALERT_16", 11, "alert_16");

    @SerialName("alert_24")
    public static final SduiIcon ALERT_24 = new SduiIcon("ALERT_24", 12, "alert_24");

    @SerialName("alert_filled_12")
    public static final SduiIcon ALERT_FILLED_12 = new SduiIcon("ALERT_FILLED_12", 13, "alert_filled_12");

    @SerialName("alert_filled_16")
    public static final SduiIcon ALERT_FILLED_16 = new SduiIcon("ALERT_FILLED_16", 14, "alert_filled_16");

    @SerialName("alert_filled_24")
    public static final SduiIcon ALERT_FILLED_24 = new SduiIcon("ALERT_FILLED_24", 15, "alert_filled_24");

    @SerialName("all_day_trading_12")
    public static final SduiIcon ALL_DAY_TRADING_12 = new SduiIcon("ALL_DAY_TRADING_12", 16, "all_day_trading_12");

    @SerialName("all_day_trading_16")
    public static final SduiIcon ALL_DAY_TRADING_16 = new SduiIcon("ALL_DAY_TRADING_16", 17, "all_day_trading_16");

    @SerialName("all_day_trading_24")
    public static final SduiIcon ALL_DAY_TRADING_24 = new SduiIcon("ALL_DAY_TRADING_24", 18, "all_day_trading_24");

    @SerialName("announcement_16")
    public static final SduiIcon ANNOUNCEMENT_16 = new SduiIcon("ANNOUNCEMENT_16", 19, "announcement_16");

    @SerialName("announcement_24")
    public static final SduiIcon ANNOUNCEMENT_24 = new SduiIcon("ANNOUNCEMENT_24", 20, "announcement_24");

    @SerialName("archive_24")
    public static final SduiIcon ARCHIVE_24 = new SduiIcon("ARCHIVE_24", 21, "archive_24");

    @SerialName("arrow_down_12")
    public static final SduiIcon ARROW_DOWN_12 = new SduiIcon("ARROW_DOWN_12", 22, "arrow_down_12");

    @SerialName("arrow_down_16")
    public static final SduiIcon ARROW_DOWN_16 = new SduiIcon("ARROW_DOWN_16", 23, "arrow_down_16");

    @SerialName("arrow_down_24")
    public static final SduiIcon ARROW_DOWN_24 = new SduiIcon("ARROW_DOWN_24", 24, "arrow_down_24");

    @SerialName("arrow_down_fill_12")
    public static final SduiIcon ARROW_DOWN_FILL_12 = new SduiIcon("ARROW_DOWN_FILL_12", 25, "arrow_down_fill_12");

    @SerialName("arrow_down_fill_16")
    public static final SduiIcon ARROW_DOWN_FILL_16 = new SduiIcon("ARROW_DOWN_FILL_16", 26, "arrow_down_fill_16");

    @SerialName("arrow_down_fill_24")
    public static final SduiIcon ARROW_DOWN_FILL_24 = new SduiIcon("ARROW_DOWN_FILL_24", 27, "arrow_down_fill_24");

    @SerialName("arrow_left_12")
    public static final SduiIcon ARROW_LEFT_12 = new SduiIcon("ARROW_LEFT_12", 28, "arrow_left_12");

    @SerialName("arrow_left_16")
    public static final SduiIcon ARROW_LEFT_16 = new SduiIcon("ARROW_LEFT_16", 29, "arrow_left_16");

    @SerialName("arrow_left_24")
    public static final SduiIcon ARROW_LEFT_24 = new SduiIcon("ARROW_LEFT_24", 30, "arrow_left_24");

    @SerialName("arrow_left_fill_12")
    public static final SduiIcon ARROW_LEFT_FILL_12 = new SduiIcon("ARROW_LEFT_FILL_12", 31, "arrow_left_fill_12");

    @SerialName("arrow_left_fill_16")
    public static final SduiIcon ARROW_LEFT_FILL_16 = new SduiIcon("ARROW_LEFT_FILL_16", 32, "arrow_left_fill_16");

    @SerialName("arrow_left_fill_24")
    public static final SduiIcon ARROW_LEFT_FILL_24 = new SduiIcon("ARROW_LEFT_FILL_24", 33, "arrow_left_fill_24");

    @SerialName("arrow_right_12")
    public static final SduiIcon ARROW_RIGHT_12 = new SduiIcon("ARROW_RIGHT_12", 34, "arrow_right_12");

    @SerialName("arrow_right_16")
    public static final SduiIcon ARROW_RIGHT_16 = new SduiIcon("ARROW_RIGHT_16", 35, "arrow_right_16");

    @SerialName("arrow_right_24")
    public static final SduiIcon ARROW_RIGHT_24 = new SduiIcon("ARROW_RIGHT_24", 36, "arrow_right_24");

    @SerialName("arrow_right_fill_12")
    public static final SduiIcon ARROW_RIGHT_FILL_12 = new SduiIcon("ARROW_RIGHT_FILL_12", 37, "arrow_right_fill_12");

    @SerialName("arrow_right_fill_16")
    public static final SduiIcon ARROW_RIGHT_FILL_16 = new SduiIcon("ARROW_RIGHT_FILL_16", 38, "arrow_right_fill_16");

    @SerialName("arrow_right_fill_24")
    public static final SduiIcon ARROW_RIGHT_FILL_24 = new SduiIcon("ARROW_RIGHT_FILL_24", 39, "arrow_right_fill_24");

    @SerialName("arrow_up_12")
    public static final SduiIcon ARROW_UP_12 = new SduiIcon("ARROW_UP_12", 40, "arrow_up_12");

    @SerialName("arrow_up_16")
    public static final SduiIcon ARROW_UP_16 = new SduiIcon("ARROW_UP_16", 41, "arrow_up_16");

    @SerialName("arrow_up_24")
    public static final SduiIcon ARROW_UP_24 = new SduiIcon("ARROW_UP_24", 42, "arrow_up_24");

    @SerialName("arrow_up_fill_12")
    public static final SduiIcon ARROW_UP_FILL_12 = new SduiIcon("ARROW_UP_FILL_12", 43, "arrow_up_fill_12");

    @SerialName("arrow_up_fill_16")
    public static final SduiIcon ARROW_UP_FILL_16 = new SduiIcon("ARROW_UP_FILL_16", 44, "arrow_up_fill_16");

    @SerialName("arrow_up_fill_24")
    public static final SduiIcon ARROW_UP_FILL_24 = new SduiIcon("ARROW_UP_FILL_24", 45, "arrow_up_fill_24");

    @SerialName("attach_24")
    public static final SduiIcon ATTACH_24 = new SduiIcon("ATTACH_24", 46, "attach_24");

    @SerialName("backspace_24")
    public static final SduiIcon BACKSPACE_24 = new SduiIcon("BACKSPACE_24", 47, "backspace_24");

    @SerialName("backspace_32")
    public static final SduiIcon BACKSPACE_32 = new SduiIcon("BACKSPACE_32", 48, "backspace_32");

    @SerialName("banking_16")
    public static final SduiIcon BANKING_16 = new SduiIcon("BANKING_16", 49, "banking_16");

    @SerialName("banking_24")
    public static final SduiIcon BANKING_24 = new SduiIcon("BANKING_24", 50, "banking_24");

    @SerialName("banking_32")
    public static final SduiIcon BANKING_32 = new SduiIcon("BANKING_32", 51, "banking_32");

    @SerialName("bubble_checked_12")
    public static final SduiIcon BUBBLE_CHECKED_12 = new SduiIcon("BUBBLE_CHECKED_12", 52, "bubble_checked_12");

    @SerialName("bubble_checked_16")
    public static final SduiIcon BUBBLE_CHECKED_16 = new SduiIcon("BUBBLE_CHECKED_16", 53, "bubble_checked_16");

    @SerialName("bubble_checked_24")
    public static final SduiIcon BUBBLE_CHECKED_24 = new SduiIcon("BUBBLE_CHECKED_24", 54, "bubble_checked_24");

    @SerialName("bubble_dot_24")
    public static final SduiIcon BUBBLE_DOT_24 = new SduiIcon("BUBBLE_DOT_24", 55, "bubble_dot_24");

    @SerialName("bubble_empty_24")
    public static final SduiIcon BUBBLE_EMPTY_24 = new SduiIcon("BUBBLE_EMPTY_24", 56, "bubble_empty_24");

    @SerialName("bubble_minus_16")
    public static final SduiIcon BUBBLE_MINUS_16 = new SduiIcon("BUBBLE_MINUS_16", 57, "bubble_minus_16");

    @SerialName("bubble_minus_24")
    public static final SduiIcon BUBBLE_MINUS_24 = new SduiIcon("BUBBLE_MINUS_24", 58, "bubble_minus_24");

    @SerialName("bubble_pause_24")
    public static final SduiIcon BUBBLE_PAUSE_24 = new SduiIcon("BUBBLE_PAUSE_24", 59, "bubble_pause_24");

    @SerialName("bubble_plus_16")
    public static final SduiIcon BUBBLE_PLUS_16 = new SduiIcon("BUBBLE_PLUS_16", 60, "bubble_plus_16");

    @SerialName("bubble_plus_24")
    public static final SduiIcon BUBBLE_PLUS_24 = new SduiIcon("BUBBLE_PLUS_24", 61, "bubble_plus_24");

    @SerialName("bubble_plus_filled_24")
    public static final SduiIcon BUBBLE_PLUS_FILLED_24 = new SduiIcon("BUBBLE_PLUS_FILLED_24", 62, "bubble_plus_filled_24");

    @SerialName("bubble_radio_button_24")
    public static final SduiIcon BUBBLE_RADIO_BUTTON_24 = new SduiIcon("BUBBLE_RADIO_BUTTON_24", 63, "bubble_radio_button_24");

    @SerialName("bubble_remove_16")
    public static final SduiIcon BUBBLE_REMOVE_16 = new SduiIcon("BUBBLE_REMOVE_16", 64, "bubble_remove_16");

    @SerialName("bubble_remove_24")
    public static final SduiIcon BUBBLE_REMOVE_24 = new SduiIcon("BUBBLE_REMOVE_24", 65, "bubble_remove_24");

    @SerialName("bubble_remove_filled_16")
    public static final SduiIcon BUBBLE_REMOVE_FILLED_16 = new SduiIcon("BUBBLE_REMOVE_FILLED_16", 66, "bubble_remove_filled_16");

    @SerialName("bubble_remove_filled_24")
    public static final SduiIcon BUBBLE_REMOVE_FILLED_24 = new SduiIcon("BUBBLE_REMOVE_FILLED_24", 67, "bubble_remove_filled_24");

    @SerialName("bubble_reverse_24")
    public static final SduiIcon BUBBLE_REVERSE_24 = new SduiIcon("BUBBLE_REVERSE_24", 68, "bubble_reverse_24");

    @SerialName("bubble_uk_pounds_16")
    public static final SduiIcon BUBBLE_UK_POUNDS_16 = new SduiIcon("BUBBLE_UK_POUNDS_16", 69, "bubble_uk_pounds_16");

    @SerialName("bubble_uk_pounds_24")
    public static final SduiIcon BUBBLE_UK_POUNDS_24 = new SduiIcon("BUBBLE_UK_POUNDS_24", 70, "bubble_uk_pounds_24");

    @SerialName("bubble_uk_pounds_filled_16")
    public static final SduiIcon BUBBLE_UK_POUNDS_FILLED_16 = new SduiIcon("BUBBLE_UK_POUNDS_FILLED_16", 71, "bubble_uk_pounds_filled_16");

    @SerialName("bubble_uk_pounds_filled_24")
    public static final SduiIcon BUBBLE_UK_POUNDS_FILLED_24 = new SduiIcon("BUBBLE_UK_POUNDS_FILLED_24", 72, "bubble_uk_pounds_filled_24");

    @SerialName("builder_16")
    public static final SduiIcon BUILDER_16 = new SduiIcon("BUILDER_16", 73, "builder_16");

    @SerialName("builder_24")
    public static final SduiIcon BUILDER_24 = new SduiIcon("BUILDER_24", 74, "builder_24");

    @SerialName("calendar_16")
    public static final SduiIcon CALENDAR_16 = new SduiIcon("CALENDAR_16", 75, "calendar_16");

    @SerialName("calendar_24")
    public static final SduiIcon CALENDAR_24 = new SduiIcon("CALENDAR_24", 76, "calendar_24");

    @SerialName("camera_16")
    public static final SduiIcon CAMERA_16 = new SduiIcon("CAMERA_16", 77, "camera_16");

    @SerialName("camera_24")
    public static final SduiIcon CAMERA_24 = new SduiIcon("CAMERA_24", 78, "camera_24");

    @SerialName("caret_down_12")
    public static final SduiIcon CARET_DOWN_12 = new SduiIcon("CARET_DOWN_12", 79, "caret_down_12");

    @SerialName("caret_down_16")
    public static final SduiIcon CARET_DOWN_16 = new SduiIcon("CARET_DOWN_16", 80, "caret_down_16");

    @SerialName("caret_down_24")
    public static final SduiIcon CARET_DOWN_24 = new SduiIcon("CARET_DOWN_24", 81, "caret_down_24");

    @SerialName("caret_left_12")
    public static final SduiIcon CARET_LEFT_12 = new SduiIcon("CARET_LEFT_12", 82, "caret_left_12");

    @SerialName("caret_left_16")
    public static final SduiIcon CARET_LEFT_16 = new SduiIcon("CARET_LEFT_16", 83, "caret_left_16");

    @SerialName("caret_left_24")
    public static final SduiIcon CARET_LEFT_24 = new SduiIcon("CARET_LEFT_24", 84, "caret_left_24");

    @SerialName("caret_right_12")
    public static final SduiIcon CARET_RIGHT_12 = new SduiIcon("CARET_RIGHT_12", 85, "caret_right_12");

    @SerialName("caret_right_16")
    public static final SduiIcon CARET_RIGHT_16 = new SduiIcon("CARET_RIGHT_16", 86, "caret_right_16");

    @SerialName("caret_right_24")
    public static final SduiIcon CARET_RIGHT_24 = new SduiIcon("CARET_RIGHT_24", 87, "caret_right_24");

    @SerialName("caret_up_12")
    public static final SduiIcon CARET_UP_12 = new SduiIcon("CARET_UP_12", 88, "caret_up_12");

    @SerialName("caret_up_16")
    public static final SduiIcon CARET_UP_16 = new SduiIcon("CARET_UP_16", 89, "caret_up_16");

    @SerialName("caret_up_24")
    public static final SduiIcon CARET_UP_24 = new SduiIcon("CARET_UP_24", 90, "caret_up_24");

    @SerialName("cash_24")
    public static final SduiIcon CASH_24 = new SduiIcon("CASH_24", 91, "cash_24");

    @SerialName("chart_16")
    public static final SduiIcon CHART_16 = new SduiIcon("CHART_16", 92, "chart_16");

    @SerialName("chart_24")
    public static final SduiIcon CHART_24 = new SduiIcon("CHART_24", 93, "chart_24");

    @SerialName("chart_candlesticks_16")
    public static final SduiIcon CHART_CANDLESTICKS_16 = new SduiIcon("CHART_CANDLESTICKS_16", 94, "chart_candlesticks_16");

    @SerialName("chart_candlesticks_24")
    public static final SduiIcon CHART_CANDLESTICKS_24 = new SduiIcon("CHART_CANDLESTICKS_24", 95, "chart_candlesticks_24");

    @SerialName("chart_line_16")
    public static final SduiIcon CHART_LINE_16 = new SduiIcon("CHART_LINE_16", 96, "chart_line_16");

    @SerialName("chart_line_24")
    public static final SduiIcon CHART_LINE_24 = new SduiIcon("CHART_LINE_24", 97, "chart_line_24");

    @SerialName("chatbot_16")
    public static final SduiIcon CHATBOT_16 = new SduiIcon("CHATBOT_16", 98, "chatbot_16");

    @SerialName("chatbot_24")
    public static final SduiIcon CHATBOT_24 = new SduiIcon("CHATBOT_24", 99, "chatbot_24");

    @SerialName("chat_16")
    public static final SduiIcon CHAT_16 = new SduiIcon("CHAT_16", 100, "chat_16");

    @SerialName("chat_24")
    public static final SduiIcon CHAT_24 = new SduiIcon("CHAT_24", 101, "chat_24");

    @SerialName("checkbox_empty_16")
    public static final SduiIcon CHECKBOX_EMPTY_16 = new SduiIcon("CHECKBOX_EMPTY_16", 102, "checkbox_empty_16");

    @SerialName("checkbox_empty_24")
    public static final SduiIcon CHECKBOX_EMPTY_24 = new SduiIcon("CHECKBOX_EMPTY_24", 103, "checkbox_empty_24");

    @SerialName("checkbox_filled_16")
    public static final SduiIcon CHECKBOX_FILLED_16 = new SduiIcon("CHECKBOX_FILLED_16", 104, "checkbox_filled_16");

    @SerialName("checkbox_filled_24")
    public static final SduiIcon CHECKBOX_FILLED_24 = new SduiIcon("CHECKBOX_FILLED_24", 105, "checkbox_filled_24");

    @SerialName("checkmark_12")
    public static final SduiIcon CHECKMARK_12 = new SduiIcon("CHECKMARK_12", 106, "checkmark_12");

    @SerialName("checkmark_16")
    public static final SduiIcon CHECKMARK_16 = new SduiIcon("CHECKMARK_16", 107, "checkmark_16");

    @SerialName("checkmark_24")
    public static final SduiIcon CHECKMARK_24 = new SduiIcon("CHECKMARK_24", 108, "checkmark_24");

    @SerialName("clipboard_16")
    public static final SduiIcon CLIPBOARD_16 = new SduiIcon("CLIPBOARD_16", 109, "clipboard_16");

    @SerialName("clipboard_24")
    public static final SduiIcon CLIPBOARD_24 = new SduiIcon("CLIPBOARD_24", 110, "clipboard_24");

    @SerialName("clock_12")
    public static final SduiIcon CLOCK_12 = new SduiIcon("CLOCK_12", 111, "clock_12");

    @SerialName("clock_16")
    public static final SduiIcon CLOCK_16 = new SduiIcon("CLOCK_16", 112, "clock_16");

    @SerialName("clock_24")
    public static final SduiIcon CLOCK_24 = new SduiIcon("CLOCK_24", 113, "clock_24");

    @SerialName("close_12")
    public static final SduiIcon CLOSE_12 = new SduiIcon("CLOSE_12", 114, "close_12");

    @SerialName("close_16")
    public static final SduiIcon CLOSE_16 = new SduiIcon("CLOSE_16", 115, "close_16");

    @SerialName("close_24")
    public static final SduiIcon CLOSE_24 = new SduiIcon("CLOSE_24", 116, "close_24");

    @SerialName("cloud_16")
    public static final SduiIcon CLOUD_16 = new SduiIcon("CLOUD_16", 117, "cloud_16");

    @SerialName("cloud_24")
    public static final SduiIcon CLOUD_24 = new SduiIcon("CLOUD_24", 118, "cloud_24");

    @SerialName("collapse_16")
    public static final SduiIcon COLLAPSE_16 = new SduiIcon("COLLAPSE_16", 119, "collapse_16");

    @SerialName("collapse_24")
    public static final SduiIcon COLLAPSE_24 = new SduiIcon("COLLAPSE_24", 120, "collapse_24");

    @SerialName("consumer_goods_12")
    public static final SduiIcon CONSUMER_GOODS_12 = new SduiIcon("CONSUMER_GOODS_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE, "consumer_goods_12");

    @SerialName("consumer_goods_16")
    public static final SduiIcon CONSUMER_GOODS_16 = new SduiIcon("CONSUMER_GOODS_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, "consumer_goods_16");

    @SerialName("consumer_goods_24")
    public static final SduiIcon CONSUMER_GOODS_24 = new SduiIcon("CONSUMER_GOODS_24", 123, "consumer_goods_24");

    @SerialName("controls_16")
    public static final SduiIcon CONTROLS_16 = new SduiIcon("CONTROLS_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, "controls_16");

    @SerialName("controls_24")
    public static final SduiIcon CONTROLS_24 = new SduiIcon("CONTROLS_24", 125, "controls_24");

    @SerialName("conversation_16")
    public static final SduiIcon CONVERSATION_16 = new SduiIcon("CONVERSATION_16", EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, "conversation_16");

    @SerialName("conversation_24")
    public static final SduiIcon CONVERSATION_24 = new SduiIcon("CONVERSATION_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, "conversation_24");

    @SerialName("copy_12")
    public static final SduiIcon COPY_12 = new SduiIcon("COPY_12", 128, "copy_12");

    @SerialName("copy_16")
    public static final SduiIcon COPY_16 = new SduiIcon("COPY_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, "copy_16");

    @SerialName("copy_24")
    public static final SduiIcon COPY_24 = new SduiIcon("COPY_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, "copy_24");

    @SerialName("corporate_16")
    public static final SduiIcon CORPORATE_16 = new SduiIcon("CORPORATE_16", 131, "corporate_16");

    @SerialName("corporate_24")
    public static final SduiIcon CORPORATE_24 = new SduiIcon("CORPORATE_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, "corporate_24");

    @SerialName("crypto_12")
    public static final SduiIcon CRYPTO_12 = new SduiIcon("CRYPTO_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, "crypto_12");

    @SerialName("crypto_16")
    public static final SduiIcon CRYPTO_16 = new SduiIcon("CRYPTO_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE, "crypto_16");

    @SerialName("crypto_24")
    public static final SduiIcon CRYPTO_24 = new SduiIcon("CRYPTO_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE, "crypto_24");

    @SerialName("crypto_c_12")
    public static final SduiIcon CRYPTO_C_12 = new SduiIcon("CRYPTO_C_12", 136, "crypto_c_12");

    @SerialName("crypto_c_16")
    public static final SduiIcon CRYPTO_C_16 = new SduiIcon("CRYPTO_C_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE, "crypto_c_16");

    @SerialName("crypto_c_24")
    public static final SduiIcon CRYPTO_C_24 = new SduiIcon("CRYPTO_C_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, "crypto_c_24");

    @SerialName("deposit_16")
    public static final SduiIcon DEPOSIT_16 = new SduiIcon("DEPOSIT_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, "deposit_16");

    @SerialName("deposit_24")
    public static final SduiIcon DEPOSIT_24 = new SduiIcon("DEPOSIT_24", EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, "deposit_24");

    @SerialName("dining_24")
    public static final SduiIcon DINING_24 = new SduiIcon("DINING_24", EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE, "dining_24");

    @SerialName("disclosures_24")
    public static final SduiIcon DISCLOSURES_24 = new SduiIcon("DISCLOSURES_24", EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE, "disclosures_24");

    @SerialName("dividend_16")
    public static final SduiIcon DIVIDEND_16 = new SduiIcon("DIVIDEND_16", EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE, "dividend_16");

    @SerialName("dividend_24")
    public static final SduiIcon DIVIDEND_24 = new SduiIcon("DIVIDEND_24", 144, "dividend_24");

    @SerialName("documents_24")
    public static final SduiIcon DOCUMENTS_24 = new SduiIcon("DOCUMENTS_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE, "documents_24");

    @SerialName("dollar_sign_12")
    public static final SduiIcon DOLLAR_SIGN_12 = new SduiIcon("DOLLAR_SIGN_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE, "dollar_sign_12");

    @SerialName("dollar_sign_16")
    public static final SduiIcon DOLLAR_SIGN_16 = new SduiIcon("DOLLAR_SIGN_16", 147, "dollar_sign_16");

    @SerialName("dollar_sign_24")
    public static final SduiIcon DOLLAR_SIGN_24 = new SduiIcon("DOLLAR_SIGN_24", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE, "dollar_sign_24");

    @SerialName("dots_16")
    public static final SduiIcon DOTS_16 = new SduiIcon("DOTS_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE, "dots_16");

    @SerialName("dots_24")
    public static final SduiIcon DOTS_24 = new SduiIcon("DOTS_24", 150, "dots_24");

    @SerialName("dots_android_16")
    public static final SduiIcon DOTS_ANDROID_16 = new SduiIcon("DOTS_ANDROID_16", 151, "dots_android_16");

    @SerialName("dots_android_24")
    public static final SduiIcon DOTS_ANDROID_24 = new SduiIcon("DOTS_ANDROID_24", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, "dots_android_24");

    @SerialName("dot_12")
    public static final SduiIcon DOT_12 = new SduiIcon("DOT_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE, "dot_12");

    @SerialName("dot_16")
    public static final SduiIcon DOT_16 = new SduiIcon("DOT_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE, "dot_16");

    @SerialName("dot_24")
    public static final SduiIcon DOT_24 = new SduiIcon("DOT_24", 155, "dot_24");

    @SerialName("download_12")
    public static final SduiIcon DOWNLOAD_12 = new SduiIcon("DOWNLOAD_12", 156, "download_12");

    @SerialName("download_16")
    public static final SduiIcon DOWNLOAD_16 = new SduiIcon("DOWNLOAD_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE, "download_16");

    @SerialName("download_24")
    public static final SduiIcon DOWNLOAD_24 = new SduiIcon("DOWNLOAD_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, "download_24");

    @SerialName("drag_12")
    public static final SduiIcon DRAG_12 = new SduiIcon("DRAG_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE, "drag_12");

    @SerialName("drag_16")
    public static final SduiIcon DRAG_16 = new SduiIcon("DRAG_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, "drag_16");

    @SerialName("drag_24")
    public static final SduiIcon DRAG_24 = new SduiIcon("DRAG_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE, "drag_24");

    @SerialName("dropdown_12")
    public static final SduiIcon DROPDOWN_12 = new SduiIcon("DROPDOWN_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, "dropdown_12");

    @SerialName("dropdown_16")
    public static final SduiIcon DROPDOWN_16 = new SduiIcon("DROPDOWN_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE, "dropdown_16");

    @SerialName("dropdown_24")
    public static final SduiIcon DROPDOWN_24 = new SduiIcon("DROPDOWN_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, "dropdown_24");

    @SerialName("economic_moat_24")
    public static final SduiIcon ECONOMIC_MOAT_24 = new SduiIcon("ECONOMIC_MOAT_24", 165, "economic_moat_24");

    @SerialName("edit_12")
    public static final SduiIcon EDIT_12 = new SduiIcon("EDIT_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE, "edit_12");

    @SerialName("edit_16")
    public static final SduiIcon EDIT_16 = new SduiIcon("EDIT_16", 167, "edit_16");

    @SerialName("edit_24")
    public static final SduiIcon EDIT_24 = new SduiIcon("EDIT_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, "edit_24");

    @SerialName("edit_surface_24")
    public static final SduiIcon EDIT_SURFACE_24 = new SduiIcon("EDIT_SURFACE_24", EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, "edit_surface_24");

    @SerialName("email_filled_16")
    public static final SduiIcon EMAIL_FILLED_16 = new SduiIcon("EMAIL_FILLED_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, "email_filled_16");

    @SerialName("email_filled_24")
    public static final SduiIcon EMAIL_FILLED_24 = new SduiIcon("EMAIL_FILLED_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE, "email_filled_24");

    @SerialName("email_outline_24")
    public static final SduiIcon EMAIL_OUTLINE_24 = new SduiIcon("EMAIL_OUTLINE_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, "email_outline_24");

    @SerialName("energy_12")
    public static final SduiIcon ENERGY_12 = new SduiIcon("ENERGY_12", EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, "energy_12");

    @SerialName("energy_24")
    public static final SduiIcon ENERGY_24 = new SduiIcon("ENERGY_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, "energy_24");

    @SerialName("entertainment_24")
    public static final SduiIcon ENTERTAINMENT_24 = new SduiIcon("ENTERTAINMENT_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE, "entertainment_24");

    @SerialName("etf_12")
    public static final SduiIcon ETF_12 = new SduiIcon("ETF_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE, "etf_12");

    @SerialName("etf_24")
    public static final SduiIcon ETF_24 = new SduiIcon("ETF_24", EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, "etf_24");

    @SerialName("exclamation_12")
    public static final SduiIcon EXCLAMATION_12 = new SduiIcon("EXCLAMATION_12", EnumC7081g.f2773x8d9721ad, "exclamation_12");

    @SerialName("exclamation_16")
    public static final SduiIcon EXCLAMATION_16 = new SduiIcon("EXCLAMATION_16", EnumC7081g.f2780x600b66fe, "exclamation_16");

    @SerialName("exclamation_24")
    public static final SduiIcon EXCLAMATION_24 = new SduiIcon("EXCLAMATION_24", EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, "exclamation_24");

    @SerialName("expand_16")
    public static final SduiIcon EXPAND_16 = new SduiIcon("EXPAND_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE, "expand_16");

    @SerialName("expand_24")
    public static final SduiIcon EXPAND_24 = new SduiIcon("EXPAND_24", 182, "expand_24");

    @SerialName("eye_16")
    public static final SduiIcon EYE_16 = new SduiIcon("EYE_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE, "eye_16");

    @SerialName("eye_24")
    public static final SduiIcon EYE_24 = new SduiIcon("EYE_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, "eye_24");

    @SerialName("eye_closed_16")
    public static final SduiIcon EYE_CLOSED_16 = new SduiIcon("EYE_CLOSED_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE, "eye_closed_16");

    @SerialName("eye_closed_24")
    public static final SduiIcon EYE_CLOSED_24 = new SduiIcon("EYE_CLOSED_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE, "eye_closed_24");

    @SerialName("face_id_android_16")
    public static final SduiIcon FACE_ID_ANDROID_16 = new SduiIcon("FACE_ID_ANDROID_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE, "face_id_android_16");

    @SerialName("face_id_android_24")
    public static final SduiIcon FACE_ID_ANDROID_24 = new SduiIcon("FACE_ID_ANDROID_24", 188, "face_id_android_24");

    @SerialName("face_id_ios_16")
    public static final SduiIcon FACE_ID_IOS_16 = new SduiIcon("FACE_ID_IOS_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, "face_id_ios_16");

    @SerialName("face_id_ios_24")
    public static final SduiIcon FACE_ID_IOS_24 = new SduiIcon("FACE_ID_IOS_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, "face_id_ios_24");

    @SerialName("fair_value_24")
    public static final SduiIcon FAIR_VALUE_24 = new SduiIcon("FAIR_VALUE_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, "fair_value_24");

    @SerialName("filter_12")
    public static final SduiIcon FILTER_12 = new SduiIcon("FILTER_12", 192, "filter_12");

    @SerialName("filter_16")
    public static final SduiIcon FILTER_16 = new SduiIcon("FILTER_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE, "filter_16");

    @SerialName("filter_24")
    public static final SduiIcon FILTER_24 = new SduiIcon("FILTER_24", EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE, "filter_24");

    @SerialName("finance_12")
    public static final SduiIcon FINANCE_12 = new SduiIcon("FINANCE_12", EnumC7081g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, "finance_12");

    @SerialName("finance_24")
    public static final SduiIcon FINANCE_24 = new SduiIcon("FINANCE_24", EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, "finance_24");

    @SerialName("flashlight_off_24")
    public static final SduiIcon FLASHLIGHT_OFF_24 = new SduiIcon("FLASHLIGHT_OFF_24", EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE, "flashlight_off_24");

    @SerialName("flashlight_on_24")
    public static final SduiIcon FLASHLIGHT_ON_24 = new SduiIcon("FLASHLIGHT_ON_24", EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE, "flashlight_on_24");

    @SerialName("flash_off_24")
    public static final SduiIcon FLASH_OFF_24 = new SduiIcon("FLASH_OFF_24", EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE, "flash_off_24");

    @SerialName("flash_on_24")
    public static final SduiIcon FLASH_ON_24 = new SduiIcon("FLASH_ON_24", 200, "flash_on_24");

    @SerialName("flower_16")
    public static final SduiIcon FLOWER_16 = new SduiIcon("FLOWER_16", 201, "flower_16");

    @SerialName("folder_16")
    public static final SduiIcon FOLDER_16 = new SduiIcon("FOLDER_16", 202, "folder_16");

    @SerialName("folder_24")
    public static final SduiIcon FOLDER_24 = new SduiIcon("FOLDER_24", EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE, "folder_24");

    @SerialName("fullscreen_enter_24")
    public static final SduiIcon FULLSCREEN_ENTER_24 = new SduiIcon("FULLSCREEN_ENTER_24", 204, "fullscreen_enter_24");

    @SerialName("fullscreen_exit_24")
    public static final SduiIcon FULLSCREEN_EXIT_24 = new SduiIcon("FULLSCREEN_EXIT_24", EnumC7081g.SDK_ASSET_ICON_CLIPBOARD_VALUE, "fullscreen_exit_24");

    @SerialName("gift_12")
    public static final SduiIcon GIFT_12 = new SduiIcon("GIFT_12", EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE, "gift_12");

    @SerialName("gift_16")
    public static final SduiIcon GIFT_16 = new SduiIcon("GIFT_16", EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE, "gift_16");

    @SerialName("gift_24")
    public static final SduiIcon GIFT_24 = new SduiIcon("GIFT_24", EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE, "gift_24");

    @SerialName("gold_16")
    public static final SduiIcon GOLD_16 = new SduiIcon("GOLD_16", EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE, "gold_16");

    @SerialName("groceries_24")
    public static final SduiIcon GROCERIES_24 = new SduiIcon("GROCERIES_24", EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, "groceries_24");

    @SerialName("hamburger_12")
    public static final SduiIcon HAMBURGER_12 = new SduiIcon("HAMBURGER_12", 211, "hamburger_12");

    @SerialName("hamburger_16")
    public static final SduiIcon HAMBURGER_16 = new SduiIcon("HAMBURGER_16", EnumC7081g.SDK_ASSET_ICON_OVERRIDE_VALUE, "hamburger_16");

    @SerialName("hamburger_24")
    public static final SduiIcon HAMBURGER_24 = new SduiIcon("HAMBURGER_24", EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE, "hamburger_24");

    @SerialName("healthcare_12")
    public static final SduiIcon HEALTHCARE_12 = new SduiIcon("HEALTHCARE_12", EnumC7081g.SDK_ASSET_ICON_PIN_VALUE, "healthcare_12");

    @SerialName("healthcare_24")
    public static final SduiIcon HEALTHCARE_24 = new SduiIcon("HEALTHCARE_24", EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE, "healthcare_24");

    @SerialName("help_24")
    public static final SduiIcon HELP_24 = new SduiIcon("HELP_24", EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, "help_24");

    @SerialName("history_16")
    public static final SduiIcon HISTORY_16 = new SduiIcon("HISTORY_16", EnumC7081g.SDK_ASSET_ICON_PROGRESS_VALUE, "history_16");

    @SerialName("history_24")
    public static final SduiIcon HISTORY_24 = new SduiIcon("HISTORY_24", EnumC7081g.SDK_ASSET_ICON_QUESTION_VALUE, "history_24");

    @SerialName("home_24")
    public static final SduiIcon HOME_24 = new SduiIcon("HOME_24", EnumC7081g.SDK_ASSET_ICON_REJECTED_REC_VALUE, "home_24");

    @SerialName("hospitality_12")
    public static final SduiIcon HOSPITALITY_12 = new SduiIcon("HOSPITALITY_12", EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, "hospitality_12");

    @SerialName("hospitality_24")
    public static final SduiIcon HOSPITALITY_24 = new SduiIcon("HOSPITALITY_24", EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE, "hospitality_24");

    @SerialName("hourglass_16")
    public static final SduiIcon HOURGLASS_16 = new SduiIcon("HOURGLASS_16", EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE, "hourglass_16");

    @SerialName("hourglass_24")
    public static final SduiIcon HOURGLASS_24 = new SduiIcon("HOURGLASS_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, "hourglass_24");

    @SerialName("icloud_restore_24")
    public static final SduiIcon ICLOUD_RESTORE_24 = new SduiIcon("ICLOUD_RESTORE_24", 224, "icloud_restore_24");

    @SerialName("image_16")
    public static final SduiIcon IMAGE_16 = new SduiIcon("IMAGE_16", 225, "image_16");

    @SerialName("image_24")
    public static final SduiIcon IMAGE_24 = new SduiIcon("IMAGE_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE, "image_24");

    @SerialName("image_fail_16")
    public static final SduiIcon IMAGE_FAIL_16 = new SduiIcon("IMAGE_FAIL_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE, "image_fail_16");

    @SerialName("image_fail_24")
    public static final SduiIcon IMAGE_FAIL_24 = new SduiIcon("IMAGE_FAIL_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, "image_fail_24");

    @SerialName("info_12")
    public static final SduiIcon INFO_12 = new SduiIcon("INFO_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, "info_12");

    @SerialName("info_16")
    public static final SduiIcon INFO_16 = new SduiIcon("INFO_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, "info_16");

    @SerialName("info_24")
    public static final SduiIcon INFO_24 = new SduiIcon("INFO_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE, "info_24");

    @SerialName("info_filled_12")
    public static final SduiIcon INFO_FILLED_12 = new SduiIcon("INFO_FILLED_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, "info_filled_12");

    @SerialName("info_filled_16")
    public static final SduiIcon INFO_FILLED_16 = new SduiIcon("INFO_FILLED_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, "info_filled_16");

    @SerialName("info_filled_24")
    public static final SduiIcon INFO_FILLED_24 = new SduiIcon("INFO_FILLED_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, "info_filled_24");

    @SerialName("joint_account_12")
    public static final SduiIcon JOINT_ACCOUNT_12 = new SduiIcon("JOINT_ACCOUNT_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, "joint_account_12");

    @SerialName("joint_account_16")
    public static final SduiIcon JOINT_ACCOUNT_16 = new SduiIcon("JOINT_ACCOUNT_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, "joint_account_16");

    @SerialName("joint_account_24")
    public static final SduiIcon JOINT_ACCOUNT_24 = new SduiIcon("JOINT_ACCOUNT_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, "joint_account_24");

    @SerialName("l2_header_arrow_24")
    public static final SduiIcon L2_HEADER_ARROW_24 = new SduiIcon("L2_HEADER_ARROW_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, "l2_header_arrow_24");

    @SerialName("lightbulb_16")
    public static final SduiIcon LIGHTBULB_16 = new SduiIcon("LIGHTBULB_16", 239, "lightbulb_16");

    @SerialName("lightbulb_24")
    public static final SduiIcon LIGHTBULB_24 = new SduiIcon("LIGHTBULB_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, "lightbulb_24");

    @SerialName("lightning_12")
    public static final SduiIcon LIGHTNING_12 = new SduiIcon("LIGHTNING_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, "lightning_12");

    @SerialName("lightning_16")
    public static final SduiIcon LIGHTNING_16 = new SduiIcon("LIGHTNING_16", EnumC7081g.f2778x3356acf6, "lightning_16");

    @SerialName("lightning_24")
    public static final SduiIcon LIGHTNING_24 = new SduiIcon("LIGHTNING_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, "lightning_24");

    @SerialName("lightning_off_16")
    public static final SduiIcon LIGHTNING_OFF_16 = new SduiIcon("LIGHTNING_OFF_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, "lightning_off_16");

    @SerialName("link_16")
    public static final SduiIcon LINK_16 = new SduiIcon("LINK_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, "link_16");

    @SerialName("link_24")
    public static final SduiIcon LINK_24 = new SduiIcon("LINK_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, "link_24");

    @SerialName("link_out_12")
    public static final SduiIcon LINK_OUT_12 = new SduiIcon("LINK_OUT_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, "link_out_12");

    @SerialName("link_out_16")
    public static final SduiIcon LINK_OUT_16 = new SduiIcon("LINK_OUT_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, "link_out_16");

    @SerialName("link_out_24")
    public static final SduiIcon LINK_OUT_24 = new SduiIcon("LINK_OUT_24", EnumC7081g.f2779x59907a3d, "link_out_24");

    @SerialName("location_fill_16")
    public static final SduiIcon LOCATION_FILL_16 = new SduiIcon("LOCATION_FILL_16", 250, "location_fill_16");

    @SerialName("location_fill_24")
    public static final SduiIcon LOCATION_FILL_24 = new SduiIcon("LOCATION_FILL_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, "location_fill_24");

    @SerialName("location_outline_24")
    public static final SduiIcon LOCATION_OUTLINE_24 = new SduiIcon("LOCATION_OUTLINE_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, "location_outline_24");

    @SerialName("lock_12")
    public static final SduiIcon LOCK_12 = new SduiIcon("LOCK_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, "lock_12");

    @SerialName("lock_16")
    public static final SduiIcon LOCK_16 = new SduiIcon("LOCK_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, "lock_16");

    @SerialName("lock_24")
    public static final SduiIcon LOCK_24 = new SduiIcon("LOCK_24", 255, "lock_24");

    @SerialName("log_out_24")
    public static final SduiIcon LOG_OUT_24 = new SduiIcon("LOG_OUT_24", 256, "log_out_24");

    @SerialName("manufacturing_12")
    public static final SduiIcon MANUFACTURING_12 = new SduiIcon("MANUFACTURING_12", EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE, "manufacturing_12");

    @SerialName("manufacturing_24")
    public static final SduiIcon MANUFACTURING_24 = new SduiIcon("MANUFACTURING_24", EnumC7081g.SDK_ASSET_HEADER_BOLT_VALUE, "manufacturing_24");

    @SerialName("maps_24")
    public static final SduiIcon MAPS_24 = new SduiIcon("MAPS_24", EnumC7081g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE, "maps_24");

    @SerialName("margin_12")
    public static final SduiIcon MARGIN_12 = new SduiIcon("MARGIN_12", EnumC7081g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE, "margin_12");

    @SerialName("margin_16")
    public static final SduiIcon MARGIN_16 = new SduiIcon("MARGIN_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE, "margin_16");

    @SerialName("margin_24")
    public static final SduiIcon MARGIN_24 = new SduiIcon("MARGIN_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, "margin_24");

    @SerialName("maximum_16")
    public static final SduiIcon MAXIMUM_16 = new SduiIcon("MAXIMUM_16", EnumC7081g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE, "maximum_16");

    @SerialName("message_send_16")
    public static final SduiIcon MESSAGE_SEND_16 = new SduiIcon("MESSAGE_SEND_16", EnumC7081g.SDK_ASSET_ICON_PLAID_LOGO_VALUE, "message_send_16");

    @SerialName("message_send_24")
    public static final SduiIcon MESSAGE_SEND_24 = new SduiIcon("MESSAGE_SEND_24", EnumC7081g.SDK_ASSET_HEADER_SHIELD_VALUE, "message_send_24");

    @SerialName("minimum_16")
    public static final SduiIcon MINIMUM_16 = new SduiIcon("MINIMUM_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE, "minimum_16");

    @SerialName("minus_12")
    public static final SduiIcon MINUS_12 = new SduiIcon("MINUS_12", EnumC7081g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE, "minus_12");

    @SerialName("minus_16")
    public static final SduiIcon MINUS_16 = new SduiIcon("MINUS_16", EnumC7081g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE, "minus_16");

    @SerialName("minus_24")
    public static final SduiIcon MINUS_24 = new SduiIcon("MINUS_24", EnumC7081g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE, "minus_24");

    @SerialName("news_16")
    public static final SduiIcon NEWS_16 = new SduiIcon("NEWS_16", EnumC7081g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE, "news_16");

    @SerialName("news_24")
    public static final SduiIcon NEWS_24 = new SduiIcon("NEWS_24", 271, "news_24");

    @SerialName("notification_16")
    public static final SduiIcon NOTIFICATION_16 = new SduiIcon("NOTIFICATION_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, "notification_16");

    @SerialName("notification_24")
    public static final SduiIcon NOTIFICATION_24 = new SduiIcon("NOTIFICATION_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, "notification_24");

    @SerialName("notification_32")
    public static final SduiIcon NOTIFICATION_32 = new SduiIcon("NOTIFICATION_32", EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE, "notification_32");

    @SerialName("notification_add_16")
    public static final SduiIcon NOTIFICATION_ADD_16 = new SduiIcon("NOTIFICATION_ADD_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE, "notification_add_16");

    @SerialName("notification_add_24")
    public static final SduiIcon NOTIFICATION_ADD_24 = new SduiIcon("NOTIFICATION_ADD_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE, "notification_add_24");

    @SerialName("no_value_24")
    public static final SduiIcon NO_VALUE_24 = new SduiIcon("NO_VALUE_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, "no_value_24");

    @SerialName("no_value_32")
    public static final SduiIcon NO_VALUE_32 = new SduiIcon("NO_VALUE_32", EnumC7081g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, "no_value_32");

    @SerialName("numpad_down_24")
    public static final SduiIcon NUMPAD_DOWN_24 = new SduiIcon("NUMPAD_DOWN_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE, "numpad_down_24");

    @SerialName("numpad_up_24")
    public static final SduiIcon NUMPAD_UP_24 = new SduiIcon("NUMPAD_UP_24", 280, "numpad_up_24");

    @SerialName("online_16")
    public static final SduiIcon ONLINE_16 = new SduiIcon("ONLINE_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_VALUE, "online_16");

    @SerialName("online_24")
    public static final SduiIcon ONLINE_24 = new SduiIcon("ONLINE_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE, "online_24");

    @SerialName("options_down_24")
    public static final SduiIcon OPTIONS_DOWN_24 = new SduiIcon("OPTIONS_DOWN_24", 283, "options_down_24");

    @SerialName("options_flat_24")
    public static final SduiIcon OPTIONS_FLAT_24 = new SduiIcon("OPTIONS_FLAT_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE, "options_flat_24");

    @SerialName("options_up_24")
    public static final SduiIcon OPTIONS_UP_24 = new SduiIcon("OPTIONS_UP_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE, "options_up_24");

    @SerialName("options_volatile_24")
    public static final SduiIcon OPTIONS_VOLATILE_24 = new SduiIcon("OPTIONS_VOLATILE_24", EnumC7081g.f2777x89a9e432, "options_volatile_24");

    @SerialName("order_16")
    public static final SduiIcon ORDER_16 = new SduiIcon("ORDER_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, "order_16");

    @SerialName("order_24")
    public static final SduiIcon ORDER_24 = new SduiIcon("ORDER_24", 288, "order_24");

    @SerialName("pause_hero_40")
    public static final SduiIcon PAUSE_HERO_40 = new SduiIcon("PAUSE_HERO_40", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE, "pause_hero_40");

    @SerialName("pause_inline_24")
    public static final SduiIcon PAUSE_INLINE_24 = new SduiIcon("PAUSE_INLINE_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE, "pause_inline_24");

    @SerialName("paycheck_24")
    public static final SduiIcon PAYCHECK_24 = new SduiIcon("PAYCHECK_24", EnumC7081g.f2776x87e624cb, "paycheck_24");

    @SerialName("payment_12")
    public static final SduiIcon PAYMENT_12 = new SduiIcon("PAYMENT_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE, "payment_12");

    @SerialName("payment_16")
    public static final SduiIcon PAYMENT_16 = new SduiIcon("PAYMENT_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE, "payment_16");

    @SerialName("payment_24")
    public static final SduiIcon PAYMENT_24 = new SduiIcon("PAYMENT_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE, "payment_24");

    @SerialName("payment_32")
    public static final SduiIcon PAYMENT_32 = new SduiIcon("PAYMENT_32", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE, "payment_32");

    @SerialName("percent_sign_12")
    public static final SduiIcon PERCENT_SIGN_12 = new SduiIcon("PERCENT_SIGN_12", EnumC7081g.SDK_ASSET_LOADING_INDICATOR_VALUE, "percent_sign_12");

    @SerialName("percent_sign_16")
    public static final SduiIcon PERCENT_SIGN_16 = new SduiIcon("PERCENT_SIGN_16", EnumC7081g.SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE, "percent_sign_16");

    @SerialName("percent_sign_24")
    public static final SduiIcon PERCENT_SIGN_24 = new SduiIcon("PERCENT_SIGN_24", EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE, "percent_sign_24");

    @SerialName("person_12")
    public static final SduiIcon PERSON_12 = new SduiIcon("PERSON_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE, "person_12");

    @SerialName("person_16")
    public static final SduiIcon PERSON_16 = new SduiIcon("PERSON_16", 300, "person_16");

    @SerialName("person_24")
    public static final SduiIcon PERSON_24 = new SduiIcon("PERSON_24", EnumC7081g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE, "person_24");

    @SerialName("phone_16")
    public static final SduiIcon PHONE_16 = new SduiIcon("PHONE_16", 302, "phone_16");

    @SerialName("phone_24")
    public static final SduiIcon PHONE_24 = new SduiIcon("PHONE_24", EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE, "phone_24");

    @SerialName("phone_connected_16")
    public static final SduiIcon PHONE_CONNECTED_16 = new SduiIcon("PHONE_CONNECTED_16", EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE, "phone_connected_16");

    @SerialName("phone_missed_call_16")
    public static final SduiIcon PHONE_MISSED_CALL_16 = new SduiIcon("PHONE_MISSED_CALL_16", EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE, "phone_missed_call_16");

    @SerialName("phone_waiting_16")
    public static final SduiIcon PHONE_WAITING_16 = new SduiIcon("PHONE_WAITING_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE, "phone_waiting_16");

    @SerialName("pin_16")
    public static final SduiIcon PIN_16 = new SduiIcon("PIN_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE, "pin_16");

    @SerialName("pin_24")
    public static final SduiIcon PIN_24 = new SduiIcon("PIN_24", EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE, "pin_24");

    @SerialName("play_hero_40")
    public static final SduiIcon PLAY_HERO_40 = new SduiIcon("PLAY_HERO_40", EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE, "play_hero_40");

    @SerialName("play_inline_16")
    public static final SduiIcon PLAY_INLINE_16 = new SduiIcon("PLAY_INLINE_16", EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE, "play_inline_16");

    @SerialName("play_inline_24")
    public static final SduiIcon PLAY_INLINE_24 = new SduiIcon("PLAY_INLINE_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE, "play_inline_24");

    @SerialName("plus_12")
    public static final SduiIcon PLUS_12 = new SduiIcon("PLUS_12", EnumC7081g.f2774x74902ae0, "plus_12");

    @SerialName("plus_16")
    public static final SduiIcon PLUS_16 = new SduiIcon("PLUS_16", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE, "plus_16");

    @SerialName("plus_24")
    public static final SduiIcon PLUS_24 = new SduiIcon("PLUS_24", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE, "plus_24");

    @SerialName("pop_out_16")
    public static final SduiIcon POP_OUT_16 = new SduiIcon("POP_OUT_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE, "pop_out_16");

    @SerialName("pop_out_24")
    public static final SduiIcon POP_OUT_24 = new SduiIcon("POP_OUT_24", 316, "pop_out_24");

    @SerialName("print_24")
    public static final SduiIcon PRINT_24 = new SduiIcon("PRINT_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE, "print_24");

    @SerialName("qr_16")
    public static final SduiIcon QR_16 = new SduiIcon("QR_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE, "qr_16");

    @SerialName("qr_24")
    public static final SduiIcon QR_24 = new SduiIcon("QR_24", EnumC7081g.f2781x2ba65ba3, "qr_24");

    @SerialName("qr_scan_24")
    public static final SduiIcon QR_SCAN_24 = new SduiIcon("QR_SCAN_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE, "qr_scan_24");

    @SerialName("quantity_16")
    public static final SduiIcon QUANTITY_16 = new SduiIcon("QUANTITY_16", EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_LIGHT_VALUE, "quantity_16");

    @SerialName("quantity_24")
    public static final SduiIcon QUANTITY_24 = new SduiIcon("QUANTITY_24", EnumC7081g.SDK_ASSET_PLAID_PROFILE_CIRCLE_VALUE, "quantity_24");

    @SerialName("question_12")
    public static final SduiIcon QUESTION_12 = new SduiIcon("QUESTION_12", EnumC7081g.f2775xbcb7e6f3, "question_12");

    @SerialName("question_16")
    public static final SduiIcon QUESTION_16 = new SduiIcon("QUESTION_16", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE, "question_16");

    @SerialName("question_24")
    public static final SduiIcon QUESTION_24 = new SduiIcon("QUESTION_24", EnumC7081g.SDK_ASSET_ICON_REPORT_VALUE, "question_24");

    @SerialName("question_filled_12")
    public static final SduiIcon QUESTION_FILLED_12 = new SduiIcon("QUESTION_FILLED_12", EnumC7081g.SDK_ASSET_ICON_STEP_COMPLETE_VALUE, "question_filled_12");

    @SerialName("question_filled_16")
    public static final SduiIcon QUESTION_FILLED_16 = new SduiIcon("QUESTION_FILLED_16", EnumC7081g.SDK_ASSET_ICON_UPLOAD_VALUE, "question_filled_16");

    @SerialName("question_filled_24")
    public static final SduiIcon QUESTION_FILLED_24 = new SduiIcon("QUESTION_FILLED_24", EnumC7081g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE, "question_filled_24");

    @SerialName("recurring_12")
    public static final SduiIcon RECURRING_12 = new SduiIcon("RECURRING_12", EnumC7081g.SDK_ASSET_ICON_LIGHTNING_FILLED_BLUE_VALUE, "recurring_12");

    @SerialName("recurring_16")
    public static final SduiIcon RECURRING_16 = new SduiIcon("RECURRING_16", 330, "recurring_16");

    @SerialName("recurring_24")
    public static final SduiIcon RECURRING_24 = new SduiIcon("RECURRING_24", 331, "recurring_24");

    @SerialName("recurring_hub_24")
    public static final SduiIcon RECURRING_HUB_24 = new SduiIcon("RECURRING_HUB_24", 332, "recurring_hub_24");

    @SerialName("repeat_16")
    public static final SduiIcon REPEAT_16 = new SduiIcon("REPEAT_16", 333, "repeat_16");

    @SerialName("replay_hero_40")
    public static final SduiIcon REPLAY_HERO_40 = new SduiIcon("REPLAY_HERO_40", 334, "replay_hero_40");

    @SerialName("resend_16")
    public static final SduiIcon RESEND_16 = new SduiIcon("RESEND_16", 335, "resend_16");

    @SerialName("resend_24")
    public static final SduiIcon RESEND_24 = new SduiIcon("RESEND_24", WaitlistAnimationConstants.IN_WAITLIST_ANIMATION_END, "resend_24");

    @SerialName("retirement_12")
    public static final SduiIcon RETIREMENT_12 = new SduiIcon("RETIREMENT_12", 337, "retirement_12");

    @SerialName("retirement_16")
    public static final SduiIcon RETIREMENT_16 = new SduiIcon("RETIREMENT_16", 338, "retirement_16");

    @SerialName("retirement_24")
    public static final SduiIcon RETIREMENT_24 = new SduiIcon("RETIREMENT_24", 339, "retirement_24");

    @SerialName("retirement_32")
    public static final SduiIcon RETIREMENT_32 = new SduiIcon("RETIREMENT_32", 340, "retirement_32");

    @SerialName("rhw_browser_tab_24")
    public static final SduiIcon RHW_BROWSER_TAB_24 = new SduiIcon("RHW_BROWSER_TAB_24", 341, "rhw_browser_tab_24");

    @SerialName("rhw_chart_tab_24")
    public static final SduiIcon RHW_CHART_TAB_24 = new SduiIcon("RHW_CHART_TAB_24", 342, "rhw_chart_tab_24");

    @SerialName("rhw_search_tab_24")
    public static final SduiIcon RHW_SEARCH_TAB_24 = new SduiIcon("RHW_SEARCH_TAB_24", 343, "rhw_search_tab_24");

    @SerialName("risk_and_uncertainty_24")
    public static final SduiIcon RISK_AND_UNCERTAINTY_24 = new SduiIcon("RISK_AND_UNCERTAINTY_24", 344, "risk_and_uncertainty_24");

    @SerialName("robinhood_12")
    public static final SduiIcon ROBINHOOD_12 = new SduiIcon("ROBINHOOD_12", 345, "robinhood_12");

    @SerialName("robinhood_16")
    public static final SduiIcon ROBINHOOD_16 = new SduiIcon("ROBINHOOD_16", 346, "robinhood_16");

    @SerialName("robinhood_24")
    public static final SduiIcon ROBINHOOD_24 = new SduiIcon("ROBINHOOD_24", 347, "robinhood_24");

    @SerialName("rolling_position_12")
    public static final SduiIcon ROLLING_POSITION_12 = new SduiIcon("ROLLING_POSITION_12", 348, "rolling_position_12");

    @SerialName("rolling_position_16")
    public static final SduiIcon ROLLING_POSITION_16 = new SduiIcon("ROLLING_POSITION_16", 349, "rolling_position_16");

    @SerialName("rolling_position_24")
    public static final SduiIcon ROLLING_POSITION_24 = new SduiIcon("ROLLING_POSITION_24", 350, "rolling_position_24");

    @SerialName("scan_16")
    public static final SduiIcon SCAN_16 = new SduiIcon("SCAN_16", 351, "scan_16");

    @SerialName("scan_24")
    public static final SduiIcon SCAN_24 = new SduiIcon("SCAN_24", 352, "scan_24");

    @SerialName("search_16")
    public static final SduiIcon SEARCH_16 = new SduiIcon("SEARCH_16", 353, "search_16");

    @SerialName("search_24")
    public static final SduiIcon SEARCH_24 = new SduiIcon("SEARCH_24", 354, "search_24");

    @SerialName("settings_12")
    public static final SduiIcon SETTINGS_12 = new SduiIcon("SETTINGS_12", 355, "settings_12");

    @SerialName("settings_16")
    public static final SduiIcon SETTINGS_16 = new SduiIcon("SETTINGS_16", 356, "settings_16");

    @SerialName("settings_24")
    public static final SduiIcon SETTINGS_24 = new SduiIcon("SETTINGS_24", 357, "settings_24");

    @SerialName("share_android_16")
    public static final SduiIcon SHARE_ANDROID_16 = new SduiIcon("SHARE_ANDROID_16", 358, "share_android_16");

    @SerialName("share_android_24")
    public static final SduiIcon SHARE_ANDROID_24 = new SduiIcon("SHARE_ANDROID_24", 359, "share_android_24");

    @SerialName("share_ios_16")
    public static final SduiIcon SHARE_IOS_16 = new SduiIcon("SHARE_IOS_16", 360, "share_ios_16");

    @SerialName("share_ios_24")
    public static final SduiIcon SHARE_IOS_24 = new SduiIcon("SHARE_IOS_24", 361, "share_ios_24");

    @SerialName("smiley_24")
    public static final SduiIcon SMILEY_24 = new SduiIcon("SMILEY_24", 362, "smiley_24");

    @SerialName("sound_off_24")
    public static final SduiIcon SOUND_OFF_24 = new SduiIcon("SOUND_OFF_24", 363, "sound_off_24");

    @SerialName("sound_on_24")
    public static final SduiIcon SOUND_ON_24 = new SduiIcon("SOUND_ON_24", 364, "sound_on_24");

    @SerialName("sparkle_bullet_12")
    public static final SduiIcon SPARKLE_BULLET_12 = new SduiIcon("SPARKLE_BULLET_12", 365, "sparkle_bullet_12");

    @SerialName("sparkle_bullet_16")
    public static final SduiIcon SPARKLE_BULLET_16 = new SduiIcon("SPARKLE_BULLET_16", 366, "sparkle_bullet_16");

    @SerialName("sparkle_bullet_24")
    public static final SduiIcon SPARKLE_BULLET_24 = new SduiIcon("SPARKLE_BULLET_24", 367, "sparkle_bullet_24");

    @SerialName("speed_down_24")
    public static final SduiIcon SPEED_DOWN_24 = new SduiIcon("SPEED_DOWN_24", 368, "speed_down_24");

    @SerialName("speed_up_24")
    public static final SduiIcon SPEED_UP_24 = new SduiIcon("SPEED_UP_24", 369, "speed_up_24");

    @SerialName("star_filled_12")
    public static final SduiIcon STAR_FILLED_12 = new SduiIcon("STAR_FILLED_12", 370, "star_filled_12");

    @SerialName("star_filled_16")
    public static final SduiIcon STAR_FILLED_16 = new SduiIcon("STAR_FILLED_16", 371, "star_filled_16");

    @SerialName("star_filled_24")
    public static final SduiIcon STAR_FILLED_24 = new SduiIcon("STAR_FILLED_24", 372, "star_filled_24");

    @SerialName("star_outline_16")
    public static final SduiIcon STAR_OUTLINE_16 = new SduiIcon("STAR_OUTLINE_16", 373, "star_outline_16");

    @SerialName("star_outline_24")
    public static final SduiIcon STAR_OUTLINE_24 = new SduiIcon("STAR_OUTLINE_24", 374, "star_outline_24");

    @SerialName("stewardship_24")
    public static final SduiIcon STEWARDSHIP_24 = new SduiIcon("STEWARDSHIP_24", 375, "stewardship_24");

    @SerialName("stock_down_12")
    public static final SduiIcon STOCK_DOWN_12 = new SduiIcon("STOCK_DOWN_12", 376, "stock_down_12");

    @SerialName("stock_down_16")
    public static final SduiIcon STOCK_DOWN_16 = new SduiIcon("STOCK_DOWN_16", 377, "stock_down_16");

    @SerialName("stock_down_24")
    public static final SduiIcon STOCK_DOWN_24 = new SduiIcon("STOCK_DOWN_24", 378, "stock_down_24");

    @SerialName("stock_up_12")
    public static final SduiIcon STOCK_UP_12 = new SduiIcon("STOCK_UP_12", 379, "stock_up_12");

    @SerialName("stock_up_16")
    public static final SduiIcon STOCK_UP_16 = new SduiIcon("STOCK_UP_16", 380, "stock_up_16");

    @SerialName("stock_up_24")
    public static final SduiIcon STOCK_UP_24 = new SduiIcon("STOCK_UP_24", 381, "stock_up_24");

    @SerialName("stopwatch_16")
    public static final SduiIcon STOPWATCH_16 = new SduiIcon("STOPWATCH_16", 382, "stopwatch_16");

    @SerialName("stopwatch_24")
    public static final SduiIcon STOPWATCH_24 = new SduiIcon("STOPWATCH_24", 383, "stopwatch_24");

    @SerialName("stopwatch_32")
    public static final SduiIcon STOPWATCH_32 = new SduiIcon("STOPWATCH_32", 384, "stopwatch_32");

    @SerialName("strategy_outlook_24")
    public static final SduiIcon STRATEGY_OUTLOOK_24 = new SduiIcon("STRATEGY_OUTLOOK_24", 385, "strategy_outlook_24");

    @SerialName("swipe_down_16")
    public static final SduiIcon SWIPE_DOWN_16 = new SduiIcon("SWIPE_DOWN_16", 386, "swipe_down_16");

    @SerialName("swipe_down_24")
    public static final SduiIcon SWIPE_DOWN_24 = new SduiIcon("SWIPE_DOWN_24", 387, "swipe_down_24");

    @SerialName("swipe_up_16")
    public static final SduiIcon SWIPE_UP_16 = new SduiIcon("SWIPE_UP_16", 388, "swipe_up_16");

    @SerialName("swipe_up_24")
    public static final SduiIcon SWIPE_UP_24 = new SduiIcon("SWIPE_UP_24", 389, "swipe_up_24");

    @SerialName("switch_16")
    public static final SduiIcon SWITCH_16 = new SduiIcon("SWITCH_16", 390, "switch_16");

    @SerialName("switch_24")
    public static final SduiIcon SWITCH_24 = new SduiIcon("SWITCH_24", 391, "switch_24");

    @SerialName("tab_account_32")
    public static final SduiIcon TAB_ACCOUNT_32 = new SduiIcon("TAB_ACCOUNT_32", 392, "tab_account_32");

    @SerialName("tab_content_32")
    public static final SduiIcon TAB_CONTENT_32 = new SduiIcon("TAB_CONTENT_32", 393, "tab_content_32");

    @SerialName("tab_crypto_32")
    public static final SduiIcon TAB_CRYPTO_32 = new SduiIcon("TAB_CRYPTO_32", 394, "tab_crypto_32");

    @SerialName("tab_crypto_c_32")
    public static final SduiIcon TAB_CRYPTO_C_32 = new SduiIcon("TAB_CRYPTO_C_32", 395, "tab_crypto_c_32");

    @SerialName("tab_gold_32")
    public static final SduiIcon TAB_GOLD_32 = new SduiIcon("TAB_GOLD_32", WaitlistAnimationConstants.LEFT_YAW_START, "tab_gold_32");

    @SerialName("tab_invest_32")
    public static final SduiIcon TAB_INVEST_32 = new SduiIcon("TAB_INVEST_32", 397, "tab_invest_32");

    @SerialName("tab_messages_32")
    public static final SduiIcon TAB_MESSAGES_32 = new SduiIcon("TAB_MESSAGES_32", 398, "tab_messages_32");

    @SerialName("tab_money_32")
    public static final SduiIcon TAB_MONEY_32 = new SduiIcon("TAB_MONEY_32", 399, "tab_money_32");

    @SerialName("tab_retirement_32")
    public static final SduiIcon TAB_RETIREMENT_32 = new SduiIcon("TAB_RETIREMENT_32", 400, "tab_retirement_32");

    @SerialName("tab_search_32")
    public static final SduiIcon TAB_SEARCH_32 = new SduiIcon("TAB_SEARCH_32", 401, "tab_search_32");

    @SerialName("tag_16")
    public static final SduiIcon TAG_16 = new SduiIcon("TAG_16", 402, "tag_16");

    @SerialName("tag_24")
    public static final SduiIcon TAG_24 = new SduiIcon("TAG_24", HttpStatusCode.FORBIDDEN, "tag_24");

    @SerialName("technology_12")
    public static final SduiIcon TECHNOLOGY_12 = new SduiIcon("TECHNOLOGY_12", 404, "technology_12");

    @SerialName("technology_24")
    public static final SduiIcon TECHNOLOGY_24 = new SduiIcon("TECHNOLOGY_24", 405, "technology_24");

    @SerialName("thumbprint_16")
    public static final SduiIcon THUMBPRINT_16 = new SduiIcon("THUMBPRINT_16", 406, "thumbprint_16");

    @SerialName("thumbprint_24")
    public static final SduiIcon THUMBPRINT_24 = new SduiIcon("THUMBPRINT_24", 407, "thumbprint_24");

    @SerialName("thumbs_down_16")
    public static final SduiIcon THUMBS_DOWN_16 = new SduiIcon("THUMBS_DOWN_16", 408, "thumbs_down_16");

    @SerialName("thumbs_down_24")
    public static final SduiIcon THUMBS_DOWN_24 = new SduiIcon("THUMBS_DOWN_24", 409, "thumbs_down_24");

    @SerialName("thumbs_up_16")
    public static final SduiIcon THUMBS_UP_16 = new SduiIcon("THUMBS_UP_16", HttpStatusCode.GONE, "thumbs_up_16");

    @SerialName("thumbs_up_24")
    public static final SduiIcon THUMBS_UP_24 = new SduiIcon("THUMBS_UP_24", 411, "thumbs_up_24");

    @SerialName("ticket_16")
    public static final SduiIcon TICKET_16 = new SduiIcon("TICKET_16", 412, "ticket_16");

    @SerialName("ticket_24")
    public static final SduiIcon TICKET_24 = new SduiIcon("TICKET_24", 413, "ticket_24");

    @SerialName("touch_id_android_16")
    public static final SduiIcon TOUCH_ID_ANDROID_16 = new SduiIcon("TOUCH_ID_ANDROID_16", 414, "touch_id_android_16");

    @SerialName("touch_id_android_24")
    public static final SduiIcon TOUCH_ID_ANDROID_24 = new SduiIcon("TOUCH_ID_ANDROID_24", 415, "touch_id_android_24");

    @SerialName("transfers_12")
    public static final SduiIcon TRANSFERS_12 = new SduiIcon("TRANSFERS_12", 416, "transfers_12");

    @SerialName("transfers_16")
    public static final SduiIcon TRANSFERS_16 = new SduiIcon("TRANSFERS_16", 417, "transfers_16");

    @SerialName("transfers_24")
    public static final SduiIcon TRANSFERS_24 = new SduiIcon("TRANSFERS_24", 418, "transfers_24");

    @SerialName("transport_24")
    public static final SduiIcon TRANSPORT_24 = new SduiIcon("TRANSPORT_24", 419, "transport_24");

    @SerialName("trash_12")
    public static final SduiIcon TRASH_12 = new SduiIcon("TRASH_12", 420, "trash_12");

    @SerialName("trash_16")
    public static final SduiIcon TRASH_16 = new SduiIcon("TRASH_16", 421, "trash_16");

    @SerialName("trash_24")
    public static final SduiIcon TRASH_24 = new SduiIcon("TRASH_24", 422, "trash_24");

    @SerialName("triangle_alert_16")
    public static final SduiIcon TRIANGLE_ALERT_16 = new SduiIcon("TRIANGLE_ALERT_16", 423, "triangle_alert_16");

    @SerialName("triangle_alert_24")
    public static final SduiIcon TRIANGLE_ALERT_24 = new SduiIcon("TRIANGLE_ALERT_24", 424, "triangle_alert_24");

    @SerialName("tuner_16")
    public static final SduiIcon TUNER_16 = new SduiIcon("TUNER_16", CompanyFinancialsSection.BAR_ANIMATION_DURATION, "tuner_16");

    @SerialName("tuner_24")
    public static final SduiIcon TUNER_24 = new SduiIcon("TUNER_24", 426, "tuner_24");

    @SerialName("unknown")
    public static final SduiIcon UNKNOWN = new SduiIcon("UNKNOWN", 427, "unknown");

    @SerialName("unlock_12")
    public static final SduiIcon UNLOCK_12 = new SduiIcon("UNLOCK_12", 428, "unlock_12");

    @SerialName("unlock_16")
    public static final SduiIcon UNLOCK_16 = new SduiIcon("UNLOCK_16", 429, "unlock_16");

    @SerialName("unlock_24")
    public static final SduiIcon UNLOCK_24 = new SduiIcon("UNLOCK_24", 430, "unlock_24");

    @SerialName("upload_24")
    public static final SduiIcon UPLOAD_24 = new SduiIcon("UPLOAD_24", 431, "upload_24");

    @SerialName("video_fast_forward_24")
    public static final SduiIcon VIDEO_FAST_FORWARD_24 = new SduiIcon("VIDEO_FAST_FORWARD_24", 432, "video_fast_forward_24");

    @SerialName("video_replay_24")
    public static final SduiIcon VIDEO_REPLAY_24 = new SduiIcon("VIDEO_REPLAY_24", 433, "video_replay_24");

    @SerialName("video_rewind_15_32")
    public static final SduiIcon VIDEO_REWIND_15_32 = new SduiIcon("VIDEO_REWIND_15_32", 434, "video_rewind_15_32");

    @SerialName("video_rewind_24")
    public static final SduiIcon VIDEO_REWIND_24 = new SduiIcon("VIDEO_REWIND_24", 435, "video_rewind_24");

    @SerialName("video_skip_15_32")
    public static final SduiIcon VIDEO_SKIP_15_32 = new SduiIcon("VIDEO_SKIP_15_32", 436, "video_skip_15_32");

    @SerialName("walletconnect_16")
    public static final SduiIcon WALLETCONNECT_16 = new SduiIcon("WALLETCONNECT_16", 437, "walletconnect_16");

    @SerialName("walletconnect_24")
    public static final SduiIcon WALLETCONNECT_24 = new SduiIcon("WALLETCONNECT_24", 438, "walletconnect_24");

    @SerialName("wallet_24")
    public static final SduiIcon WALLET_24 = new SduiIcon("WALLET_24", 439, "wallet_24");

    @SerialName("wallet_32")
    public static final SduiIcon WALLET_32 = new SduiIcon("WALLET_32", 440, "wallet_32");

    @SerialName("wc_scan_24")
    public static final SduiIcon WC_SCAN_24 = new SduiIcon("WC_SCAN_24", 441, "wc_scan_24");

    @SerialName("withdraw_16")
    public static final SduiIcon WITHDRAW_16 = new SduiIcon("WITHDRAW_16", 442, "withdraw_16");

    @SerialName("withdraw_24")
    public static final SduiIcon WITHDRAW_24 = new SduiIcon("WITHDRAW_24", 443, "withdraw_24");

    @SerialName("zoom_in_24")
    public static final SduiIcon ZOOM_IN_24 = new SduiIcon("ZOOM_IN_24", 444, "zoom_in_24");

    @SerialName("zoom_out_24")
    public static final SduiIcon ZOOM_OUT_24 = new SduiIcon("ZOOM_OUT_24", 445, "zoom_out_24");

    private static final /* synthetic */ SduiIcon[] $values() {
        return new SduiIcon[]{ACCOUNT_SUMMARY_12, ACCOUNT_SUMMARY_24, ACTIONS_ALERTS_32, ACTIONS_ATM_32, ACTIONS_CHECK_32, ACTIONS_STATEMENTS_32, ACTIONS_TRANSFERS_32, ACTION_REMOVE_24, AGENT_16, AGENT_24, ALERT_12, ALERT_16, ALERT_24, ALERT_FILLED_12, ALERT_FILLED_16, ALERT_FILLED_24, ALL_DAY_TRADING_12, ALL_DAY_TRADING_16, ALL_DAY_TRADING_24, ANNOUNCEMENT_16, ANNOUNCEMENT_24, ARCHIVE_24, ARROW_DOWN_12, ARROW_DOWN_16, ARROW_DOWN_24, ARROW_DOWN_FILL_12, ARROW_DOWN_FILL_16, ARROW_DOWN_FILL_24, ARROW_LEFT_12, ARROW_LEFT_16, ARROW_LEFT_24, ARROW_LEFT_FILL_12, ARROW_LEFT_FILL_16, ARROW_LEFT_FILL_24, ARROW_RIGHT_12, ARROW_RIGHT_16, ARROW_RIGHT_24, ARROW_RIGHT_FILL_12, ARROW_RIGHT_FILL_16, ARROW_RIGHT_FILL_24, ARROW_UP_12, ARROW_UP_16, ARROW_UP_24, ARROW_UP_FILL_12, ARROW_UP_FILL_16, ARROW_UP_FILL_24, ATTACH_24, BACKSPACE_24, BACKSPACE_32, BANKING_16, BANKING_24, BANKING_32, BUBBLE_CHECKED_12, BUBBLE_CHECKED_16, BUBBLE_CHECKED_24, BUBBLE_DOT_24, BUBBLE_EMPTY_24, BUBBLE_MINUS_16, BUBBLE_MINUS_24, BUBBLE_PAUSE_24, BUBBLE_PLUS_16, BUBBLE_PLUS_24, BUBBLE_PLUS_FILLED_24, BUBBLE_RADIO_BUTTON_24, BUBBLE_REMOVE_16, BUBBLE_REMOVE_24, BUBBLE_REMOVE_FILLED_16, BUBBLE_REMOVE_FILLED_24, BUBBLE_REVERSE_24, BUBBLE_UK_POUNDS_16, BUBBLE_UK_POUNDS_24, BUBBLE_UK_POUNDS_FILLED_16, BUBBLE_UK_POUNDS_FILLED_24, BUILDER_16, BUILDER_24, CALENDAR_16, CALENDAR_24, CAMERA_16, CAMERA_24, CARET_DOWN_12, CARET_DOWN_16, CARET_DOWN_24, CARET_LEFT_12, CARET_LEFT_16, CARET_LEFT_24, CARET_RIGHT_12, CARET_RIGHT_16, CARET_RIGHT_24, CARET_UP_12, CARET_UP_16, CARET_UP_24, CASH_24, CHART_16, CHART_24, CHART_CANDLESTICKS_16, CHART_CANDLESTICKS_24, CHART_LINE_16, CHART_LINE_24, CHATBOT_16, CHATBOT_24, CHAT_16, CHAT_24, CHECKBOX_EMPTY_16, CHECKBOX_EMPTY_24, CHECKBOX_FILLED_16, CHECKBOX_FILLED_24, CHECKMARK_12, CHECKMARK_16, CHECKMARK_24, CLIPBOARD_16, CLIPBOARD_24, CLOCK_12, CLOCK_16, CLOCK_24, CLOSE_12, CLOSE_16, CLOSE_24, CLOUD_16, CLOUD_24, COLLAPSE_16, COLLAPSE_24, CONSUMER_GOODS_12, CONSUMER_GOODS_16, CONSUMER_GOODS_24, CONTROLS_16, CONTROLS_24, CONVERSATION_16, CONVERSATION_24, COPY_12, COPY_16, COPY_24, CORPORATE_16, CORPORATE_24, CRYPTO_12, CRYPTO_16, CRYPTO_24, CRYPTO_C_12, CRYPTO_C_16, CRYPTO_C_24, DEPOSIT_16, DEPOSIT_24, DINING_24, DISCLOSURES_24, DIVIDEND_16, DIVIDEND_24, DOCUMENTS_24, DOLLAR_SIGN_12, DOLLAR_SIGN_16, DOLLAR_SIGN_24, DOTS_16, DOTS_24, DOTS_ANDROID_16, DOTS_ANDROID_24, DOT_12, DOT_16, DOT_24, DOWNLOAD_12, DOWNLOAD_16, DOWNLOAD_24, DRAG_12, DRAG_16, DRAG_24, DROPDOWN_12, DROPDOWN_16, DROPDOWN_24, ECONOMIC_MOAT_24, EDIT_12, EDIT_16, EDIT_24, EDIT_SURFACE_24, EMAIL_FILLED_16, EMAIL_FILLED_24, EMAIL_OUTLINE_24, ENERGY_12, ENERGY_24, ENTERTAINMENT_24, ETF_12, ETF_24, EXCLAMATION_12, EXCLAMATION_16, EXCLAMATION_24, EXPAND_16, EXPAND_24, EYE_16, EYE_24, EYE_CLOSED_16, EYE_CLOSED_24, FACE_ID_ANDROID_16, FACE_ID_ANDROID_24, FACE_ID_IOS_16, FACE_ID_IOS_24, FAIR_VALUE_24, FILTER_12, FILTER_16, FILTER_24, FINANCE_12, FINANCE_24, FLASHLIGHT_OFF_24, FLASHLIGHT_ON_24, FLASH_OFF_24, FLASH_ON_24, FLOWER_16, FOLDER_16, FOLDER_24, FULLSCREEN_ENTER_24, FULLSCREEN_EXIT_24, GIFT_12, GIFT_16, GIFT_24, GOLD_16, GROCERIES_24, HAMBURGER_12, HAMBURGER_16, HAMBURGER_24, HEALTHCARE_12, HEALTHCARE_24, HELP_24, HISTORY_16, HISTORY_24, HOME_24, HOSPITALITY_12, HOSPITALITY_24, HOURGLASS_16, HOURGLASS_24, ICLOUD_RESTORE_24, IMAGE_16, IMAGE_24, IMAGE_FAIL_16, IMAGE_FAIL_24, INFO_12, INFO_16, INFO_24, INFO_FILLED_12, INFO_FILLED_16, INFO_FILLED_24, JOINT_ACCOUNT_12, JOINT_ACCOUNT_16, JOINT_ACCOUNT_24, L2_HEADER_ARROW_24, LIGHTBULB_16, LIGHTBULB_24, LIGHTNING_12, LIGHTNING_16, LIGHTNING_24, LIGHTNING_OFF_16, LINK_16, LINK_24, LINK_OUT_12, LINK_OUT_16, LINK_OUT_24, LOCATION_FILL_16, LOCATION_FILL_24, LOCATION_OUTLINE_24, LOCK_12, LOCK_16, LOCK_24, LOG_OUT_24, MANUFACTURING_12, MANUFACTURING_24, MAPS_24, MARGIN_12, MARGIN_16, MARGIN_24, MAXIMUM_16, MESSAGE_SEND_16, MESSAGE_SEND_24, MINIMUM_16, MINUS_12, MINUS_16, MINUS_24, NEWS_16, NEWS_24, NOTIFICATION_16, NOTIFICATION_24, NOTIFICATION_32, NOTIFICATION_ADD_16, NOTIFICATION_ADD_24, NO_VALUE_24, NO_VALUE_32, NUMPAD_DOWN_24, NUMPAD_UP_24, ONLINE_16, ONLINE_24, OPTIONS_DOWN_24, OPTIONS_FLAT_24, OPTIONS_UP_24, OPTIONS_VOLATILE_24, ORDER_16, ORDER_24, PAUSE_HERO_40, PAUSE_INLINE_24, PAYCHECK_24, PAYMENT_12, PAYMENT_16, PAYMENT_24, PAYMENT_32, PERCENT_SIGN_12, PERCENT_SIGN_16, PERCENT_SIGN_24, PERSON_12, PERSON_16, PERSON_24, PHONE_16, PHONE_24, PHONE_CONNECTED_16, PHONE_MISSED_CALL_16, PHONE_WAITING_16, PIN_16, PIN_24, PLAY_HERO_40, PLAY_INLINE_16, PLAY_INLINE_24, PLUS_12, PLUS_16, PLUS_24, POP_OUT_16, POP_OUT_24, PRINT_24, QR_16, QR_24, QR_SCAN_24, QUANTITY_16, QUANTITY_24, QUESTION_12, QUESTION_16, QUESTION_24, QUESTION_FILLED_12, QUESTION_FILLED_16, QUESTION_FILLED_24, RECURRING_12, RECURRING_16, RECURRING_24, RECURRING_HUB_24, REPEAT_16, REPLAY_HERO_40, RESEND_16, RESEND_24, RETIREMENT_12, RETIREMENT_16, RETIREMENT_24, RETIREMENT_32, RHW_BROWSER_TAB_24, RHW_CHART_TAB_24, RHW_SEARCH_TAB_24, RISK_AND_UNCERTAINTY_24, ROBINHOOD_12, ROBINHOOD_16, ROBINHOOD_24, ROLLING_POSITION_12, ROLLING_POSITION_16, ROLLING_POSITION_24, SCAN_16, SCAN_24, SEARCH_16, SEARCH_24, SETTINGS_12, SETTINGS_16, SETTINGS_24, SHARE_ANDROID_16, SHARE_ANDROID_24, SHARE_IOS_16, SHARE_IOS_24, SMILEY_24, SOUND_OFF_24, SOUND_ON_24, SPARKLE_BULLET_12, SPARKLE_BULLET_16, SPARKLE_BULLET_24, SPEED_DOWN_24, SPEED_UP_24, STAR_FILLED_12, STAR_FILLED_16, STAR_FILLED_24, STAR_OUTLINE_16, STAR_OUTLINE_24, STEWARDSHIP_24, STOCK_DOWN_12, STOCK_DOWN_16, STOCK_DOWN_24, STOCK_UP_12, STOCK_UP_16, STOCK_UP_24, STOPWATCH_16, STOPWATCH_24, STOPWATCH_32, STRATEGY_OUTLOOK_24, SWIPE_DOWN_16, SWIPE_DOWN_24, SWIPE_UP_16, SWIPE_UP_24, SWITCH_16, SWITCH_24, TAB_ACCOUNT_32, TAB_CONTENT_32, TAB_CRYPTO_32, TAB_CRYPTO_C_32, TAB_GOLD_32, TAB_INVEST_32, TAB_MESSAGES_32, TAB_MONEY_32, TAB_RETIREMENT_32, TAB_SEARCH_32, TAG_16, TAG_24, TECHNOLOGY_12, TECHNOLOGY_24, THUMBPRINT_16, THUMBPRINT_24, THUMBS_DOWN_16, THUMBS_DOWN_24, THUMBS_UP_16, THUMBS_UP_24, TICKET_16, TICKET_24, TOUCH_ID_ANDROID_16, TOUCH_ID_ANDROID_24, TRANSFERS_12, TRANSFERS_16, TRANSFERS_24, TRANSPORT_24, TRASH_12, TRASH_16, TRASH_24, TRIANGLE_ALERT_16, TRIANGLE_ALERT_24, TUNER_16, TUNER_24, UNKNOWN, UNLOCK_12, UNLOCK_16, UNLOCK_24, UPLOAD_24, VIDEO_FAST_FORWARD_24, VIDEO_REPLAY_24, VIDEO_REWIND_15_32, VIDEO_REWIND_24, VIDEO_SKIP_15_32, WALLETCONNECT_16, WALLETCONNECT_24, WALLET_24, WALLET_32, WC_SCAN_24, WITHDRAW_16, WITHDRAW_24, ZOOM_IN_24, ZOOM_OUT_24};
    }

    public static EnumEntries<SduiIcon> getEntries() {
        return $ENTRIES;
    }

    public static SduiIcon valueOf(String str) {
        return (SduiIcon) Enum.valueOf(SduiIcon.class, str);
    }

    public static SduiIcon[] values() {
        return (SduiIcon[]) $VALUES.clone();
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiIcon$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiIcon;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) SduiIcon.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<SduiIcon> serializer() {
            return get$cachedSerializer();
        }
    }

    private SduiIcon(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        SduiIcon[] sduiIconArr$values = $values();
        $VALUES = sduiIconArr$values;
        $ENTRIES = EnumEntries2.enumEntries(sduiIconArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: microgram.ui.sdui.SduiIcon.Companion.1
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                return Enums4.createAnnotatedEnumSerializer("microgram.ui.sdui.SduiIcon", SduiIcon.values(), new String[]{"account_summary_12", "account_summary_24", "actions_alerts_32", "actions_atm_32", "actions_check_32", "actions_statements_32", "actions_transfers_32", "action_remove_24", "agent_16", "agent_24", "alert_12", "alert_16", "alert_24", "alert_filled_12", "alert_filled_16", "alert_filled_24", "all_day_trading_12", "all_day_trading_16", "all_day_trading_24", "announcement_16", "announcement_24", "archive_24", "arrow_down_12", "arrow_down_16", "arrow_down_24", "arrow_down_fill_12", "arrow_down_fill_16", "arrow_down_fill_24", "arrow_left_12", "arrow_left_16", "arrow_left_24", "arrow_left_fill_12", "arrow_left_fill_16", "arrow_left_fill_24", "arrow_right_12", "arrow_right_16", "arrow_right_24", "arrow_right_fill_12", "arrow_right_fill_16", "arrow_right_fill_24", "arrow_up_12", "arrow_up_16", "arrow_up_24", "arrow_up_fill_12", "arrow_up_fill_16", "arrow_up_fill_24", "attach_24", "backspace_24", "backspace_32", "banking_16", "banking_24", "banking_32", "bubble_checked_12", "bubble_checked_16", "bubble_checked_24", "bubble_dot_24", "bubble_empty_24", "bubble_minus_16", "bubble_minus_24", "bubble_pause_24", "bubble_plus_16", "bubble_plus_24", "bubble_plus_filled_24", "bubble_radio_button_24", "bubble_remove_16", "bubble_remove_24", "bubble_remove_filled_16", "bubble_remove_filled_24", "bubble_reverse_24", "bubble_uk_pounds_16", "bubble_uk_pounds_24", "bubble_uk_pounds_filled_16", "bubble_uk_pounds_filled_24", "builder_16", "builder_24", "calendar_16", "calendar_24", "camera_16", "camera_24", "caret_down_12", "caret_down_16", "caret_down_24", "caret_left_12", "caret_left_16", "caret_left_24", "caret_right_12", "caret_right_16", "caret_right_24", "caret_up_12", "caret_up_16", "caret_up_24", "cash_24", "chart_16", "chart_24", "chart_candlesticks_16", "chart_candlesticks_24", "chart_line_16", "chart_line_24", "chatbot_16", "chatbot_24", "chat_16", "chat_24", "checkbox_empty_16", "checkbox_empty_24", "checkbox_filled_16", "checkbox_filled_24", "checkmark_12", "checkmark_16", "checkmark_24", "clipboard_16", "clipboard_24", "clock_12", "clock_16", "clock_24", "close_12", "close_16", "close_24", "cloud_16", "cloud_24", "collapse_16", "collapse_24", "consumer_goods_12", "consumer_goods_16", "consumer_goods_24", "controls_16", "controls_24", "conversation_16", "conversation_24", "copy_12", "copy_16", "copy_24", "corporate_16", "corporate_24", "crypto_12", "crypto_16", "crypto_24", "crypto_c_12", "crypto_c_16", "crypto_c_24", "deposit_16", "deposit_24", "dining_24", "disclosures_24", "dividend_16", "dividend_24", "documents_24", "dollar_sign_12", "dollar_sign_16", "dollar_sign_24", "dots_16", "dots_24", "dots_android_16", "dots_android_24", "dot_12", "dot_16", "dot_24", "download_12", "download_16", "download_24", "drag_12", "drag_16", "drag_24", "dropdown_12", "dropdown_16", "dropdown_24", "economic_moat_24", "edit_12", "edit_16", "edit_24", "edit_surface_24", "email_filled_16", "email_filled_24", "email_outline_24", "energy_12", "energy_24", "entertainment_24", "etf_12", "etf_24", "exclamation_12", "exclamation_16", "exclamation_24", "expand_16", "expand_24", "eye_16", "eye_24", "eye_closed_16", "eye_closed_24", "face_id_android_16", "face_id_android_24", "face_id_ios_16", "face_id_ios_24", "fair_value_24", "filter_12", "filter_16", "filter_24", "finance_12", "finance_24", "flashlight_off_24", "flashlight_on_24", "flash_off_24", "flash_on_24", "flower_16", "folder_16", "folder_24", "fullscreen_enter_24", "fullscreen_exit_24", "gift_12", "gift_16", "gift_24", "gold_16", "groceries_24", "hamburger_12", "hamburger_16", "hamburger_24", "healthcare_12", "healthcare_24", "help_24", "history_16", "history_24", "home_24", "hospitality_12", "hospitality_24", "hourglass_16", "hourglass_24", "icloud_restore_24", "image_16", "image_24", "image_fail_16", "image_fail_24", "info_12", "info_16", "info_24", "info_filled_12", "info_filled_16", "info_filled_24", "joint_account_12", "joint_account_16", "joint_account_24", "l2_header_arrow_24", "lightbulb_16", "lightbulb_24", "lightning_12", "lightning_16", "lightning_24", "lightning_off_16", "link_16", "link_24", "link_out_12", "link_out_16", "link_out_24", "location_fill_16", "location_fill_24", "location_outline_24", "lock_12", "lock_16", "lock_24", "log_out_24", "manufacturing_12", "manufacturing_24", "maps_24", "margin_12", "margin_16", "margin_24", "maximum_16", "message_send_16", "message_send_24", "minimum_16", "minus_12", "minus_16", "minus_24", "news_16", "news_24", "notification_16", "notification_24", "notification_32", "notification_add_16", "notification_add_24", "no_value_24", "no_value_32", "numpad_down_24", "numpad_up_24", "online_16", "online_24", "options_down_24", "options_flat_24", "options_up_24", "options_volatile_24", "order_16", "order_24", "pause_hero_40", "pause_inline_24", "paycheck_24", "payment_12", "payment_16", "payment_24", "payment_32", "percent_sign_12", "percent_sign_16", "percent_sign_24", "person_12", "person_16", "person_24", "phone_16", "phone_24", "phone_connected_16", "phone_missed_call_16", "phone_waiting_16", "pin_16", "pin_24", "play_hero_40", "play_inline_16", "play_inline_24", "plus_12", "plus_16", "plus_24", "pop_out_16", "pop_out_24", "print_24", "qr_16", "qr_24", "qr_scan_24", "quantity_16", "quantity_24", "question_12", "question_16", "question_24", "question_filled_12", "question_filled_16", "question_filled_24", "recurring_12", "recurring_16", "recurring_24", "recurring_hub_24", "repeat_16", "replay_hero_40", "resend_16", "resend_24", "retirement_12", "retirement_16", "retirement_24", "retirement_32", "rhw_browser_tab_24", "rhw_chart_tab_24", "rhw_search_tab_24", "risk_and_uncertainty_24", "robinhood_12", "robinhood_16", "robinhood_24", "rolling_position_12", "rolling_position_16", "rolling_position_24", "scan_16", "scan_24", "search_16", "search_24", "settings_12", "settings_16", "settings_24", "share_android_16", "share_android_24", "share_ios_16", "share_ios_24", "smiley_24", "sound_off_24", "sound_on_24", "sparkle_bullet_12", "sparkle_bullet_16", "sparkle_bullet_24", "speed_down_24", "speed_up_24", "star_filled_12", "star_filled_16", "star_filled_24", "star_outline_16", "star_outline_24", "stewardship_24", "stock_down_12", "stock_down_16", "stock_down_24", "stock_up_12", "stock_up_16", "stock_up_24", "stopwatch_16", "stopwatch_24", "stopwatch_32", "strategy_outlook_24", "swipe_down_16", "swipe_down_24", "swipe_up_16", "swipe_up_24", "switch_16", "switch_24", "tab_account_32", "tab_content_32", "tab_crypto_32", "tab_crypto_c_32", "tab_gold_32", "tab_invest_32", "tab_messages_32", "tab_money_32", "tab_retirement_32", "tab_search_32", "tag_16", "tag_24", "technology_12", "technology_24", "thumbprint_16", "thumbprint_24", "thumbs_down_16", "thumbs_down_24", "thumbs_up_16", "thumbs_up_24", "ticket_16", "ticket_24", "touch_id_android_16", "touch_id_android_24", "transfers_12", "transfers_16", "transfers_24", "transport_24", "trash_12", "trash_16", "trash_24", "triangle_alert_16", "triangle_alert_24", "tuner_16", "tuner_24", "unknown", "unlock_12", "unlock_16", "unlock_24", "upload_24", "video_fast_forward_24", "video_replay_24", "video_rewind_15_32", "video_rewind_24", "video_skip_15_32", "walletconnect_16", "walletconnect_24", "wallet_24", "wallet_32", "wc_scan_24", "withdraw_16", "withdraw_24", "zoom_in_24", "zoom_out_24"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}, null);
            }
        });
    }
}
