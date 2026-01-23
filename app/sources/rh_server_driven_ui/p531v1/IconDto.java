package rh_server_driven_ui.p531v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equities.companyfinancials.p116ui.CompanyFinancialsSection;
import com.robinhood.android.waitlist.spot.WaitlistAnimationConstants;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.utils.http.HttpStatusCode;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IconDto.kt */
@Metadata(m3635d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0003\b\u008a\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u0095\u00042\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0004\u0095\u0004\u0096\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u008e\u0004\u001a\u00030\u008f\u00042\b\u0010\u0090\u0004\u001a\u00030\u0091\u00042\b\u0010\u0092\u0004\u001a\u00030\u0093\u0004H\u0016J\n\u0010\u0094\u0004\u001a\u00030\u0093\u0004H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001j\u0003\b\u0098\u0001j\u0003\b\u0099\u0001j\u0003\b\u009a\u0001j\u0003\b\u009b\u0001j\u0003\b\u009c\u0001j\u0003\b\u009d\u0001j\u0003\b\u009e\u0001j\u0003\b\u009f\u0001j\u0003\b \u0001j\u0003\b¡\u0001j\u0003\b¢\u0001j\u0003\b£\u0001j\u0003\b¤\u0001j\u0003\b¥\u0001j\u0003\b¦\u0001j\u0003\b§\u0001j\u0003\b¨\u0001j\u0003\b©\u0001j\u0003\bª\u0001j\u0003\b«\u0001j\u0003\b¬\u0001j\u0003\b\u00ad\u0001j\u0003\b®\u0001j\u0003\b¯\u0001j\u0003\b°\u0001j\u0003\b±\u0001j\u0003\b²\u0001j\u0003\b³\u0001j\u0003\b´\u0001j\u0003\bµ\u0001j\u0003\b¶\u0001j\u0003\b·\u0001j\u0003\b¸\u0001j\u0003\b¹\u0001j\u0003\bº\u0001j\u0003\b»\u0001j\u0003\b¼\u0001j\u0003\b½\u0001j\u0003\b¾\u0001j\u0003\b¿\u0001j\u0003\bÀ\u0001j\u0003\bÁ\u0001j\u0003\bÂ\u0001j\u0003\bÃ\u0001j\u0003\bÄ\u0001j\u0003\bÅ\u0001j\u0003\bÆ\u0001j\u0003\bÇ\u0001j\u0003\bÈ\u0001j\u0003\bÉ\u0001j\u0003\bÊ\u0001j\u0003\bË\u0001j\u0003\bÌ\u0001j\u0003\bÍ\u0001j\u0003\bÎ\u0001j\u0003\bÏ\u0001j\u0003\bÐ\u0001j\u0003\bÑ\u0001j\u0003\bÒ\u0001j\u0003\bÓ\u0001j\u0003\bÔ\u0001j\u0003\bÕ\u0001j\u0003\bÖ\u0001j\u0003\b×\u0001j\u0003\bØ\u0001j\u0003\bÙ\u0001j\u0003\bÚ\u0001j\u0003\bÛ\u0001j\u0003\bÜ\u0001j\u0003\bÝ\u0001j\u0003\bÞ\u0001j\u0003\bß\u0001j\u0003\bà\u0001j\u0003\bá\u0001j\u0003\bâ\u0001j\u0003\bã\u0001j\u0003\bä\u0001j\u0003\bå\u0001j\u0003\bæ\u0001j\u0003\bç\u0001j\u0003\bè\u0001j\u0003\bé\u0001j\u0003\bê\u0001j\u0003\bë\u0001j\u0003\bì\u0001j\u0003\bí\u0001j\u0003\bî\u0001j\u0003\bï\u0001j\u0003\bð\u0001j\u0003\bñ\u0001j\u0003\bò\u0001j\u0003\bó\u0001j\u0003\bô\u0001j\u0003\bõ\u0001j\u0003\bö\u0001j\u0003\b÷\u0001j\u0003\bø\u0001j\u0003\bù\u0001j\u0003\bú\u0001j\u0003\bû\u0001j\u0003\bü\u0001j\u0003\bý\u0001j\u0003\bþ\u0001j\u0003\bÿ\u0001j\u0003\b\u0080\u0002j\u0003\b\u0081\u0002j\u0003\b\u0082\u0002j\u0003\b\u0083\u0002j\u0003\b\u0084\u0002j\u0003\b\u0085\u0002j\u0003\b\u0086\u0002j\u0003\b\u0087\u0002j\u0003\b\u0088\u0002j\u0003\b\u0089\u0002j\u0003\b\u008a\u0002j\u0003\b\u008b\u0002j\u0003\b\u008c\u0002j\u0003\b\u008d\u0002j\u0003\b\u008e\u0002j\u0003\b\u008f\u0002j\u0003\b\u0090\u0002j\u0003\b\u0091\u0002j\u0003\b\u0092\u0002j\u0003\b\u0093\u0002j\u0003\b\u0094\u0002j\u0003\b\u0095\u0002j\u0003\b\u0096\u0002j\u0003\b\u0097\u0002j\u0003\b\u0098\u0002j\u0003\b\u0099\u0002j\u0003\b\u009a\u0002j\u0003\b\u009b\u0002j\u0003\b\u009c\u0002j\u0003\b\u009d\u0002j\u0003\b\u009e\u0002j\u0003\b\u009f\u0002j\u0003\b \u0002j\u0003\b¡\u0002j\u0003\b¢\u0002j\u0003\b£\u0002j\u0003\b¤\u0002j\u0003\b¥\u0002j\u0003\b¦\u0002j\u0003\b§\u0002j\u0003\b¨\u0002j\u0003\b©\u0002j\u0003\bª\u0002j\u0003\b«\u0002j\u0003\b¬\u0002j\u0003\b\u00ad\u0002j\u0003\b®\u0002j\u0003\b¯\u0002j\u0003\b°\u0002j\u0003\b±\u0002j\u0003\b²\u0002j\u0003\b³\u0002j\u0003\b´\u0002j\u0003\bµ\u0002j\u0003\b¶\u0002j\u0003\b·\u0002j\u0003\b¸\u0002j\u0003\b¹\u0002j\u0003\bº\u0002j\u0003\b»\u0002j\u0003\b¼\u0002j\u0003\b½\u0002j\u0003\b¾\u0002j\u0003\b¿\u0002j\u0003\bÀ\u0002j\u0003\bÁ\u0002j\u0003\bÂ\u0002j\u0003\bÃ\u0002j\u0003\bÄ\u0002j\u0003\bÅ\u0002j\u0003\bÆ\u0002j\u0003\bÇ\u0002j\u0003\bÈ\u0002j\u0003\bÉ\u0002j\u0003\bÊ\u0002j\u0003\bË\u0002j\u0003\bÌ\u0002j\u0003\bÍ\u0002j\u0003\bÎ\u0002j\u0003\bÏ\u0002j\u0003\bÐ\u0002j\u0003\bÑ\u0002j\u0003\bÒ\u0002j\u0003\bÓ\u0002j\u0003\bÔ\u0002j\u0003\bÕ\u0002j\u0003\bÖ\u0002j\u0003\b×\u0002j\u0003\bØ\u0002j\u0003\bÙ\u0002j\u0003\bÚ\u0002j\u0003\bÛ\u0002j\u0003\bÜ\u0002j\u0003\bÝ\u0002j\u0003\bÞ\u0002j\u0003\bß\u0002j\u0003\bà\u0002j\u0003\bá\u0002j\u0003\bâ\u0002j\u0003\bã\u0002j\u0003\bä\u0002j\u0003\bå\u0002j\u0003\bæ\u0002j\u0003\bç\u0002j\u0003\bè\u0002j\u0003\bé\u0002j\u0003\bê\u0002j\u0003\bë\u0002j\u0003\bì\u0002j\u0003\bí\u0002j\u0003\bî\u0002j\u0003\bï\u0002j\u0003\bð\u0002j\u0003\bñ\u0002j\u0003\bò\u0002j\u0003\bó\u0002j\u0003\bô\u0002j\u0003\bõ\u0002j\u0003\bö\u0002j\u0003\b÷\u0002j\u0003\bø\u0002j\u0003\bù\u0002j\u0003\bú\u0002j\u0003\bû\u0002j\u0003\bü\u0002j\u0003\bý\u0002j\u0003\bþ\u0002j\u0003\bÿ\u0002j\u0003\b\u0080\u0003j\u0003\b\u0081\u0003j\u0003\b\u0082\u0003j\u0003\b\u0083\u0003j\u0003\b\u0084\u0003j\u0003\b\u0085\u0003j\u0003\b\u0086\u0003j\u0003\b\u0087\u0003j\u0003\b\u0088\u0003j\u0003\b\u0089\u0003j\u0003\b\u008a\u0003j\u0003\b\u008b\u0003j\u0003\b\u008c\u0003j\u0003\b\u008d\u0003j\u0003\b\u008e\u0003j\u0003\b\u008f\u0003j\u0003\b\u0090\u0003j\u0003\b\u0091\u0003j\u0003\b\u0092\u0003j\u0003\b\u0093\u0003j\u0003\b\u0094\u0003j\u0003\b\u0095\u0003j\u0003\b\u0096\u0003j\u0003\b\u0097\u0003j\u0003\b\u0098\u0003j\u0003\b\u0099\u0003j\u0003\b\u009a\u0003j\u0003\b\u009b\u0003j\u0003\b\u009c\u0003j\u0003\b\u009d\u0003j\u0003\b\u009e\u0003j\u0003\b\u009f\u0003j\u0003\b \u0003j\u0003\b¡\u0003j\u0003\b¢\u0003j\u0003\b£\u0003j\u0003\b¤\u0003j\u0003\b¥\u0003j\u0003\b¦\u0003j\u0003\b§\u0003j\u0003\b¨\u0003j\u0003\b©\u0003j\u0003\bª\u0003j\u0003\b«\u0003j\u0003\b¬\u0003j\u0003\b\u00ad\u0003j\u0003\b®\u0003j\u0003\b¯\u0003j\u0003\b°\u0003j\u0003\b±\u0003j\u0003\b²\u0003j\u0003\b³\u0003j\u0003\b´\u0003j\u0003\bµ\u0003j\u0003\b¶\u0003j\u0003\b·\u0003j\u0003\b¸\u0003j\u0003\b¹\u0003j\u0003\bº\u0003j\u0003\b»\u0003j\u0003\b¼\u0003j\u0003\b½\u0003j\u0003\b¾\u0003j\u0003\b¿\u0003j\u0003\bÀ\u0003j\u0003\bÁ\u0003j\u0003\bÂ\u0003j\u0003\bÃ\u0003j\u0003\bÄ\u0003j\u0003\bÅ\u0003j\u0003\bÆ\u0003j\u0003\bÇ\u0003j\u0003\bÈ\u0003j\u0003\bÉ\u0003j\u0003\bÊ\u0003j\u0003\bË\u0003j\u0003\bÌ\u0003j\u0003\bÍ\u0003j\u0003\bÎ\u0003j\u0003\bÏ\u0003j\u0003\bÐ\u0003j\u0003\bÑ\u0003j\u0003\bÒ\u0003j\u0003\bÓ\u0003j\u0003\bÔ\u0003j\u0003\bÕ\u0003j\u0003\bÖ\u0003j\u0003\b×\u0003j\u0003\bØ\u0003j\u0003\bÙ\u0003j\u0003\bÚ\u0003j\u0003\bÛ\u0003j\u0003\bÜ\u0003j\u0003\bÝ\u0003j\u0003\bÞ\u0003j\u0003\bß\u0003j\u0003\bà\u0003j\u0003\bá\u0003j\u0003\bâ\u0003j\u0003\bã\u0003j\u0003\bä\u0003j\u0003\bå\u0003j\u0003\bæ\u0003j\u0003\bç\u0003j\u0003\bè\u0003j\u0003\bé\u0003j\u0003\bê\u0003j\u0003\bë\u0003j\u0003\bì\u0003j\u0003\bí\u0003j\u0003\bî\u0003j\u0003\bï\u0003j\u0003\bð\u0003j\u0003\bñ\u0003j\u0003\bò\u0003j\u0003\bó\u0003j\u0003\bô\u0003j\u0003\bõ\u0003j\u0003\bö\u0003j\u0003\b÷\u0003j\u0003\bø\u0003j\u0003\bù\u0003j\u0003\bú\u0003j\u0003\bû\u0003j\u0003\bü\u0003j\u0003\bý\u0003j\u0003\bþ\u0003j\u0003\bÿ\u0003j\u0003\b\u0080\u0004j\u0003\b\u0081\u0004j\u0003\b\u0082\u0004j\u0003\b\u0083\u0004j\u0003\b\u0084\u0004j\u0003\b\u0085\u0004j\u0003\b\u0086\u0004j\u0003\b\u0087\u0004j\u0003\b\u0088\u0004j\u0003\b\u0089\u0004j\u0003\b\u008a\u0004j\u0003\b\u008b\u0004j\u0003\b\u008c\u0004j\u0003\b\u008d\u0004¨\u0006\u0097\u0004"}, m3636d2 = {"Lrh_server_driven_ui/v1/IconDto;", "Lcom/robinhood/idl/EnumDto;", "Lrh_server_driven_ui/v1/Icon;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ICON_UNSPECIFIED", "ICON_ACCOUNT_SUMMARY_12", "ICON_ACCOUNT_SUMMARY_24", "ICON_ACTION_REMOVE_24", "ICON_ACTIONS_ALERTS_32", "ICON_ACTIONS_ATM_32", "ICON_ACTIONS_CHECK_32", "ICON_ACTIONS_STATEMENTS_32", "ICON_ACTIONS_TRANSFERS_32", "ICON_AGENT_16", "ICON_AGENT_24", "ICON_ALERT_12", "ICON_ALERT_16", "ICON_ALERT_24", "ICON_ALERT_FILLED_12", "ICON_ALERT_FILLED_16", "ICON_ALERT_FILLED_24", "ICON_ALL_DAY_TRADING_12", "ICON_ALL_DAY_TRADING_16", "ICON_ALL_DAY_TRADING_24", "ICON_ANNOUNCEMENT_12", "ICON_ANNOUNCEMENT_16", "ICON_ANNOUNCEMENT_24", "ICON_ARCHIVE_24", "ICON_ARROW_DIAGONAL_UP_16", "ICON_ARROW_DOWN_12", "ICON_ARROW_DOWN_16", "ICON_ARROW_DOWN_24", "ICON_ARROW_DOWN_FILL_12", "ICON_ARROW_DOWN_FILL_16", "ICON_ARROW_DOWN_FILL_24", "ICON_ARROW_DOWN_RIGHT_12", "ICON_ARROW_LEFT_12", "ICON_ARROW_LEFT_16", "ICON_ARROW_LEFT_24", "ICON_ARROW_LEFT_FILL_12", "ICON_ARROW_LEFT_FILL_16", "ICON_ARROW_LEFT_FILL_24", "ICON_ARROW_RIGHT_12", "ICON_ARROW_RIGHT_16", "ICON_ARROW_RIGHT_24", "ICON_ARROW_RIGHT_FILL_12", "ICON_ARROW_RIGHT_FILL_16", "ICON_ARROW_RIGHT_FILL_24", "ICON_ARROW_UP_12", "ICON_ARROW_UP_16", "ICON_ARROW_UP_24", "ICON_ARROW_UP_FILL_12", "ICON_ARROW_UP_FILL_16", "ICON_ARROW_UP_FILL_24", "ICON_ARROW_UP_RIGHT_12", "ICON_ARROW_UP_RIGHT_16", "ICON_ATTACH_24", "ICON_BACKSPACE_24", "ICON_BACKSPACE_32", "ICON_BANKING_16", "ICON_BANKING_24", "ICON_BANKING_32", "ICON_BAR_CHART_16", "ICON_BAR_CHART_24", "ICON_BOOKMARK_POST_FILLED_16", "ICON_BOOKMARK_POST_OUTLINE_16", "ICON_BUBBLE_CHECKED_12", "ICON_BUBBLE_CHECKED_16", "ICON_BUBBLE_CHECKED_24", "ICON_BUBBLE_DOT_24", "ICON_BUBBLE_EMPTY_24", "ICON_BUBBLE_MINUS_16", "ICON_BUBBLE_MINUS_24", "ICON_BUBBLE_PAUSE_24", "ICON_BUBBLE_PLUS_16", "ICON_BUBBLE_PLUS_24", "ICON_BUBBLE_PLUS_FILLED_24", "ICON_BUBBLE_RADIO_BUTTON_24", "ICON_BUBBLE_REMOVE_16", "ICON_BUBBLE_REMOVE_24", "ICON_BUBBLE_REMOVE_FILLED_16", "ICON_BUBBLE_REMOVE_FILLED_24", "ICON_BUBBLE_REVERSE_24", "ICON_BUBBLE_UK_POUNDS_16", "ICON_BUBBLE_UK_POUNDS_24", "ICON_BUBBLE_UK_POUNDS_FILLED_16", "ICON_BUBBLE_UK_POUNDS_FILLED_24", "ICON_BUILDER_16", "ICON_BUILDER_24", "ICON_CALENDAR_12", "ICON_CALENDAR_16", "ICON_CALENDAR_24", "ICON_CAMERA_16", "ICON_CAMERA_24", "ICON_CARET_DOWN_12", "ICON_CARET_DOWN_16", "ICON_CARET_DOWN_24", "ICON_CARET_LEFT_12", "ICON_CARET_LEFT_16", "ICON_CARET_LEFT_24", "ICON_CARET_RIGHT_12", "ICON_CARET_RIGHT_16", "ICON_CARET_RIGHT_24", "ICON_CARET_UP_12", "ICON_CARET_UP_16", "ICON_CARET_UP_24", "ICON_CASH_24", "ICON_CHART_16", "ICON_CHART_24", "ICON_CHART_BAR_24", "ICON_CHART_CANDLESTICKS_16", "ICON_CHART_CANDLESTICKS_24", "ICON_CHART_LINE_16", "ICON_CHART_LINE_24", "ICON_CHART_STACKED_BAR_16", "ICON_CHAT_16", "ICON_CHAT_24", "ICON_CHATBOT_16", "ICON_CHATBOT_24", "ICON_CHECKBOX_EMPTY_16", "ICON_CHECKBOX_EMPTY_24", "ICON_CHECKBOX_FILLED_16", "ICON_CHECKBOX_FILLED_24", "ICON_CHECKMARK_12", "ICON_CHECKMARK_16", "ICON_CHECKMARK_24", "ICON_CLIPBOARD_16", "ICON_CLIPBOARD_24", "ICON_CLOCK_12", "ICON_CLOCK_16", "ICON_CLOCK_24", "ICON_CLOSE_12", "ICON_CLOSE_16", "ICON_CLOSE_24", "ICON_CLOUD_16", "ICON_CLOUD_24", "ICON_COLLAPSE_16", "ICON_COLLAPSE_24", "ICON_COMMENT_FILLED_16", "ICON_COMMENT_FILLED_20", "ICON_COMMENT_OUTLINE_16", "ICON_COMMENT_OUTLINE_20", "ICON_CONCIERGE_24", "ICON_CONSUMER_GOODS_12", "ICON_CONSUMER_GOODS_16", "ICON_CONSUMER_GOODS_24", "ICON_CONTROLS_16", "ICON_CONTROLS_24", "ICON_CONVERSATION_16", "ICON_CONVERSATION_24", "ICON_CONVERT_24", "ICON_COPY_12", "ICON_COPY_16", "ICON_COPY_24", "ICON_COPY_TRADE_FILLED_16", "ICON_COPY_TRADE_OUTLINE_16", "ICON_CORN_FUTURES_24", "ICON_CORPORATE_16", "ICON_CORPORATE_24", "ICON_CORTEX_12", "ICON_CORTEX_16", "ICON_CORTEX_24", "ICON_CRYPTO_12", "ICON_CRYPTO_16", "ICON_CRYPTO_24", "ICON_CRYPTO_C_12", "ICON_CRYPTO_C_16", "ICON_CRYPTO_C_24", "ICON_CUSTODIAL_16", "ICON_CUSTODIAL_24", "ICON_DEPOSIT_16", "ICON_DEPOSIT_24", "ICON_DINING_24", "ICON_DISCLOSURES_16", "ICON_DISCLOSURES_24", "ICON_DIVIDEND_16", "ICON_DIVIDEND_24", "ICON_DOCUMENTS_24", "ICON_DOLLAR_SIGN_12", "ICON_DOLLAR_SIGN_16", "ICON_DOLLAR_SIGN_24", "ICON_DOT_12", "ICON_DOT_16", "ICON_DOT_24", "ICON_DOTS_16", "ICON_DOTS_24", "ICON_DOTS_ANDROID_16", "ICON_DOTS_ANDROID_24", "ICON_DOWNLOAD_12", "ICON_DOWNLOAD_16", "ICON_DOWNLOAD_24", "ICON_DRAG_12", "ICON_DRAG_16", "ICON_DRAG_24", "ICON_DROPDOWN_12", "ICON_DROPDOWN_16", "ICON_DROPDOWN_24", "ICON_ECONOMIC_MOAT_24", "ICON_EDIT_12", "ICON_EDIT_16", "ICON_EDIT_24", "ICON_EDIT_SURFACE_24", "ICON_EMAIL_FILLED_16", "ICON_EMAIL_FILLED_24", "ICON_EMAIL_OUTLINE_24", "ICON_ENERGY_12", "ICON_ENERGY_24", "ICON_ENTERTAINMENT_24", "ICON_ETF_12", "ICON_ETF_24", "ICON_EURO_SIGN_12", "ICON_EURO_SIGN_16", "ICON_EURO_SIGN_24", "ICON_EXCLAMATION_12", "ICON_EXCLAMATION_16", "ICON_EXCLAMATION_24", "ICON_EXPAND_16", "ICON_EXPAND_24", "ICON_EYE_16", "ICON_EYE_24", "ICON_EYE_CLOSED_16", "ICON_EYE_CLOSED_24", "ICON_FACE_ID_ANDROID_16", "ICON_FACE_ID_ANDROID_24", "ICON_FACE_ID_IOS_16", "ICON_FACE_ID_IOS_24", "ICON_FAIR_VALUE_24", "ICON_FEATURED_16", "ICON_FEATURED_24", "ICON_FILTER_12", "ICON_FILTER_16", "ICON_FILTER_24", "ICON_FINANCE_12", "ICON_FINANCE_16", "ICON_FINANCE_24", "ICON_FLASH_OFF_24", "ICON_FLASH_ON_24", "ICON_FLASHLIGHT_OFF_24", "ICON_FLASHLIGHT_ON_24", "ICON_FLOWER_16", "ICON_FOLDER_16", "ICON_FOLDER_24", "ICON_FULLSCREEN_ENTER_24", "ICON_FULLSCREEN_EXIT_24", "ICON_GIFT_12", "ICON_GIFT_16", "ICON_GIFT_24", "ICON_GOLD_16", "ICON_GOLD_24", "ICON_GROCERIES_24", "ICON_HAMBURGER_12", "ICON_HAMBURGER_16", "ICON_HAMBURGER_24", "ICON_HEALTHCARE_12", "ICON_HEALTHCARE_24", "ICON_HELP_24", "ICON_HISTORY_16", "ICON_HISTORY_24", "ICON_HOME_24", "ICON_HOSPITALITY_12", "ICON_HOSPITALITY_24", "ICON_HOURGLASS_12", "ICON_HOURGLASS_16", "ICON_HOURGLASS_24", "ICON_ICLOUD_RESTORE_16", "ICON_ICLOUD_RESTORE_24", "ICON_IMAGE_16", "ICON_IMAGE_24", "ICON_IMAGE_FAIL_16", "ICON_IMAGE_FAIL_24", "ICON_INFO_12", "ICON_INFO_16", "ICON_INFO_24", "ICON_INFO_FILLED_12", "ICON_INFO_FILLED_16", "ICON_INFO_FILLED_24", "ICON_ISA_16", "ICON_ISA_24", "ICON_JOINT_ACCOUNT_12", "ICON_JOINT_ACCOUNT_16", "ICON_JOINT_ACCOUNT_24", "ICON_L2_HEADER_ARROW_24", "ICON_LIGHTBULB_16", "ICON_LIGHTBULB_24", "ICON_LIGHTNING_12", "ICON_LIGHTNING_16", "ICON_LIGHTNING_24", "ICON_LIGHTNING_OFF_16", "ICON_LIKE_POST_FILLED_16", "ICON_LIKE_POST_FILLED_20", "ICON_LIKE_POST_OUTLINE_16", "ICON_LIKE_POST_OUTLINE_20", "ICON_LIKE_POST_OUTLINE_24", "ICON_LINK_16", "ICON_LINK_24", "ICON_LINK_OUT_12", "ICON_LINK_OUT_16", "ICON_LINK_OUT_24", "ICON_LIST_24", "ICON_LOCATION_FILL_16", "ICON_LOCATION_FILL_24", "ICON_LOCATION_OUTLINE_24", "ICON_LOCK_12", "ICON_LOCK_16", "ICON_LOCK_24", "ICON_LOG_OUT_24", "ICON_MANAGED_ACCOUNTS_16", "ICON_MANAGED_ACCOUNTS_24", "ICON_MANAGED_INDIVIDUAL_24", "ICON_MANAGED_JOINT_24", "ICON_MANAGED_RETIREMENT_24", "ICON_MANUFACTURING_12", "ICON_MANUFACTURING_24", "ICON_MAPS_24", "ICON_MARGIN_12", "ICON_MARGIN_16", "ICON_MARGIN_24", "ICON_MAXIMUM_16", "ICON_MESSAGE_SEND_16", "ICON_MESSAGE_SEND_24", "ICON_MINIMUM_16", "ICON_MINUS_12", "ICON_MINUS_16", "ICON_MINUS_24", "ICON_MORE_MENU_16", "ICON_MORE_MENU_20", "ICON_NEWS_16", "ICON_NEWS_24", "ICON_NO_VALUE_24", "ICON_NO_VALUE_32", "ICON_NOTIFICATION_12", "ICON_NOTIFICATION_16", "ICON_NOTIFICATION_24", "ICON_NOTIFICATION_32", "ICON_NOTIFICATION_ADD_16", "ICON_NOTIFICATION_ADD_24", "ICON_NOTIFICATION_CHECK_16", "ICON_NOTIFICATION_CHECK_24", "ICON_NUMPAD_DOWN_24", "ICON_NUMPAD_UP_24", "ICON_ONLINE_16", "ICON_ONLINE_24", "ICON_OPTIONS_DOWN_24", "ICON_OPTIONS_FLAT_24", "ICON_OPTIONS_UP_24", "ICON_OPTIONS_VOLATILE_24", "ICON_ORDER_16", "ICON_ORDER_24", "ICON_PAUSE_HERO_40", "ICON_PAUSE_INLINE_24", "ICON_PAYCHECK_24", "ICON_PAYMENT_12", "ICON_PAYMENT_16", "ICON_PAYMENT_24", "ICON_PAYMENT_32", "ICON_PERCENT_SIGN_12", "ICON_PERCENT_SIGN_16", "ICON_PERCENT_SIGN_24", "ICON_PERPETUAL_FUTURES_32", "ICON_PERSON_12", "ICON_PERSON_16", "ICON_PERSON_24", "ICON_PHONE_16", "ICON_PHONE_24", "ICON_PHONE_CONNECTED_16", "ICON_PHONE_MISSED_CALL_16", "ICON_PHONE_WAITING_16", "ICON_PICTURE_IN_PICTURE_24", "ICON_PIE_CHART_16", "ICON_PIE_CHART_24", "ICON_PIN_16", "ICON_PIN_24", "ICON_PLAY_HERO_40", "ICON_PLAY_INLINE_16", "ICON_PLAY_INLINE_24", "ICON_PLUS_12", "ICON_PLUS_16", "ICON_PLUS_24", "ICON_POP_OUT_16", "ICON_POP_OUT_24", "ICON_PRINT_24", "ICON_QR_16", "ICON_QR_24", "ICON_QR_SCAN_24", "ICON_QUANTITY_16", "ICON_QUANTITY_24", "ICON_QUESTION_12", "ICON_QUESTION_16", "ICON_QUESTION_24", "ICON_QUESTION_FILLED_12", "ICON_QUESTION_FILLED_16", "ICON_QUESTION_FILLED_24", "ICON_RECURRING_12", "ICON_RECURRING_16", "ICON_RECURRING_24", "ICON_RECURRING_HUB_24", "ICON_REPEAT_16", "ICON_REPLAY_HERO_40", "ICON_RESEND_16", "ICON_RESEND_24", "ICON_RETIREMENT_12", "ICON_RETIREMENT_16", "ICON_RETIREMENT_24", "ICON_RETIREMENT_32", "ICON_RHW_BROWSER_TAB_24", "ICON_RHW_CHART_TAB_24", "ICON_RHW_SEARCH_TAB_24", "ICON_RISK_AND_UNCERTAINTY_24", "ICON_ROBINHOOD_12", "ICON_ROBINHOOD_16", "ICON_ROBINHOOD_24", "ICON_ROLLING_POSITION_12", "ICON_ROLLING_POSITION_16", "ICON_ROLLING_POSITION_24", "ICON_SCAN_16", "ICON_SCAN_24", "ICON_SEARCH_16", "ICON_SEARCH_24", "ICON_SETTINGS_12", "ICON_SETTINGS_16", "ICON_SETTINGS_24", "ICON_SHARE_ANDROID_16", "ICON_SHARE_ANDROID_24", "ICON_SHARE_IOS_16", "ICON_SHARE_IOS_24", "ICON_SMILEY_24", "ICON_SOCIAL_CREATE_POST_16", "ICON_SORT_12", "ICON_SOUND_OFF_24", "ICON_SOUND_ON_24", "ICON_SPARKLE_BULLET_12", "ICON_SPARKLE_BULLET_16", "ICON_SPARKLE_BULLET_24", "ICON_SPARKLE_DOUBLE_16", "ICON_SPARKLE_DOUBLE_24", "ICON_SPEED_DOWN_24", "ICON_SPEED_UP_24", "ICON_STAR_FILLED_12", "ICON_STAR_FILLED_16", "ICON_STAR_FILLED_24", "ICON_STAR_OUTLINE_16", "ICON_STAR_OUTLINE_24", "ICON_STAR_PASSWORD_16", "ICON_STEWARDSHIP_24", "ICON_STOCK_DOWN_12", "ICON_STOCK_DOWN_16", "ICON_STOCK_DOWN_24", "ICON_STOCK_UP_12", "ICON_STOCK_UP_16", "ICON_STOCK_UP_24", "ICON_STOPWATCH_16", "ICON_STOPWATCH_24", "ICON_STOPWATCH_32", "ICON_STRATEGY_OUTLOOK_24", "ICON_SWIPE_DOWN_16", "ICON_SWIPE_DOWN_24", "ICON_SWIPE_UP_16", "ICON_SWIPE_UP_24", "ICON_SWITCH_16", "ICON_SWITCH_24", "ICON_TAB_ACCOUNT_32", "ICON_TAB_CONTENT_32", "ICON_TAB_CRYPTO_32", "ICON_TAB_CRYPTO_C_32", "ICON_TAB_GOLD_32", "ICON_TAB_INVEST_32", "ICON_TAB_ISA_32", "ICON_TAB_MESSAGES_32", "ICON_TAB_MONEY_32", "ICON_TAB_RETIREMENT_32", "ICON_TAB_SEARCH_32", "ICON_TAB_SOCIAL_32", "ICON_TAB_WATCHLIST_32", "ICON_TAG_16", "ICON_TAG_24", "ICON_TAX_LOTS_LONG_TERM_16", "ICON_TAX_LOTS_SHORT_TERM_16", "ICON_TECHNOLOGY_12", "ICON_TECHNOLOGY_24", "ICON_THUMBPRINT_16", "ICON_THUMBPRINT_24", "ICON_THUMBS_DOWN_16", "ICON_THUMBS_DOWN_24", "ICON_THUMBS_UP_16", "ICON_THUMBS_UP_24", "ICON_TICKET_16", "ICON_TICKET_24", "ICON_TOUCH_ID_ANDROID_16", "ICON_TOUCH_ID_ANDROID_24", "ICON_TRADE_SOCIAL_FILLED_20", "ICON_TRADE_SOCIAL_OUTLINE_20", "ICON_TRANSFERS_12", "ICON_TRANSFERS_16", "ICON_TRANSFERS_24", "ICON_TRANSPORT_24", "ICON_TRASH_12", "ICON_TRASH_16", "ICON_TRASH_24", "ICON_TRIANGLE_ALERT_16", "ICON_TRIANGLE_ALERT_24", "ICON_TUNER_16", "ICON_TUNER_24", "ICON_UNLOCK_12", "ICON_UNLOCK_16", "ICON_UNLOCK_24", "ICON_UPLOAD_24", "ICON_VIDEO_CALL_12", "ICON_VIDEO_CALL_16", "ICON_VIDEO_CALL_24", "ICON_VIDEO_FAST_FORWARD_24", "ICON_VIDEO_REPLAY_24", "ICON_VIDEO_REWIND_15_32", "ICON_VIDEO_REWIND_24", "ICON_VIDEO_SKIP_15_32", "ICON_WALLET_24", "ICON_WALLET_32", "ICON_WALLETCONNECT_16", "ICON_WALLETCONNECT_24", "ICON_WC_SCAN_24", "ICON_WITHDRAW_16", "ICON_WITHDRAW_24", "ICON_ZOOM_IN_24", "ICON_ZOOM_OUT_24", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public abstract class IconDto implements Dto2<Icon>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IconDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<IconDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<IconDto, Icon>> binaryBase64Serializer$delegate;
    public static final IconDto ICON_UNSPECIFIED = new IconDto("ICON_UNSPECIFIED", 0) { // from class: rh_server_driven_ui.v1.IconDto.ICON_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_UNSPECIFIED;
        }
    };
    public static final IconDto ICON_ACCOUNT_SUMMARY_12 = new IconDto("ICON_ACCOUNT_SUMMARY_12", 1) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ACCOUNT_SUMMARY_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ACCOUNT_SUMMARY_12;
        }
    };
    public static final IconDto ICON_ACCOUNT_SUMMARY_24 = new IconDto("ICON_ACCOUNT_SUMMARY_24", 2) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ACCOUNT_SUMMARY_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ACCOUNT_SUMMARY_24;
        }
    };
    public static final IconDto ICON_ACTION_REMOVE_24 = new IconDto("ICON_ACTION_REMOVE_24", 3) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ACTION_REMOVE_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ACTION_REMOVE_24;
        }
    };
    public static final IconDto ICON_ACTIONS_ALERTS_32 = new IconDto("ICON_ACTIONS_ALERTS_32", 4) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ACTIONS_ALERTS_32
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ACTIONS_ALERTS_32;
        }
    };
    public static final IconDto ICON_ACTIONS_ATM_32 = new IconDto("ICON_ACTIONS_ATM_32", 5) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ACTIONS_ATM_32
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ACTIONS_ATM_32;
        }
    };
    public static final IconDto ICON_ACTIONS_CHECK_32 = new IconDto("ICON_ACTIONS_CHECK_32", 6) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ACTIONS_CHECK_32
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ACTIONS_CHECK_32;
        }
    };
    public static final IconDto ICON_ACTIONS_STATEMENTS_32 = new IconDto("ICON_ACTIONS_STATEMENTS_32", 7) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ACTIONS_STATEMENTS_32
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ACTIONS_STATEMENTS_32;
        }
    };
    public static final IconDto ICON_ACTIONS_TRANSFERS_32 = new IconDto("ICON_ACTIONS_TRANSFERS_32", 8) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ACTIONS_TRANSFERS_32
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ACTIONS_TRANSFERS_32;
        }
    };
    public static final IconDto ICON_AGENT_16 = new IconDto("ICON_AGENT_16", 9) { // from class: rh_server_driven_ui.v1.IconDto.ICON_AGENT_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_AGENT_16;
        }
    };
    public static final IconDto ICON_AGENT_24 = new IconDto("ICON_AGENT_24", 10) { // from class: rh_server_driven_ui.v1.IconDto.ICON_AGENT_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_AGENT_24;
        }
    };
    public static final IconDto ICON_ALERT_12 = new IconDto("ICON_ALERT_12", 11) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ALERT_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ALERT_12;
        }
    };
    public static final IconDto ICON_ALERT_16 = new IconDto("ICON_ALERT_16", 12) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ALERT_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ALERT_16;
        }
    };
    public static final IconDto ICON_ALERT_24 = new IconDto("ICON_ALERT_24", 13) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ALERT_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ALERT_24;
        }
    };
    public static final IconDto ICON_ALERT_FILLED_12 = new IconDto("ICON_ALERT_FILLED_12", 14) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ALERT_FILLED_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ALERT_FILLED_12;
        }
    };
    public static final IconDto ICON_ALERT_FILLED_16 = new IconDto("ICON_ALERT_FILLED_16", 15) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ALERT_FILLED_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ALERT_FILLED_16;
        }
    };
    public static final IconDto ICON_ALERT_FILLED_24 = new IconDto("ICON_ALERT_FILLED_24", 16) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ALERT_FILLED_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ALERT_FILLED_24;
        }
    };
    public static final IconDto ICON_ALL_DAY_TRADING_12 = new IconDto("ICON_ALL_DAY_TRADING_12", 17) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ALL_DAY_TRADING_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ALL_DAY_TRADING_12;
        }
    };
    public static final IconDto ICON_ALL_DAY_TRADING_16 = new IconDto("ICON_ALL_DAY_TRADING_16", 18) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ALL_DAY_TRADING_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ALL_DAY_TRADING_16;
        }
    };
    public static final IconDto ICON_ALL_DAY_TRADING_24 = new IconDto("ICON_ALL_DAY_TRADING_24", 19) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ALL_DAY_TRADING_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ALL_DAY_TRADING_24;
        }
    };
    public static final IconDto ICON_ANNOUNCEMENT_12 = new IconDto("ICON_ANNOUNCEMENT_12", 20) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ANNOUNCEMENT_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ANNOUNCEMENT_12;
        }
    };
    public static final IconDto ICON_ANNOUNCEMENT_16 = new IconDto("ICON_ANNOUNCEMENT_16", 21) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ANNOUNCEMENT_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ANNOUNCEMENT_16;
        }
    };
    public static final IconDto ICON_ANNOUNCEMENT_24 = new IconDto("ICON_ANNOUNCEMENT_24", 22) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ANNOUNCEMENT_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ANNOUNCEMENT_24;
        }
    };
    public static final IconDto ICON_ARCHIVE_24 = new IconDto("ICON_ARCHIVE_24", 23) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ARCHIVE_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ARCHIVE_24;
        }
    };
    public static final IconDto ICON_ARROW_DIAGONAL_UP_16 = new IconDto("ICON_ARROW_DIAGONAL_UP_16", 24) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ARROW_DIAGONAL_UP_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ARROW_DIAGONAL_UP_16;
        }
    };
    public static final IconDto ICON_ARROW_DOWN_12 = new IconDto("ICON_ARROW_DOWN_12", 25) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ARROW_DOWN_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ARROW_DOWN_12;
        }
    };
    public static final IconDto ICON_ARROW_DOWN_16 = new IconDto("ICON_ARROW_DOWN_16", 26) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ARROW_DOWN_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ARROW_DOWN_16;
        }
    };
    public static final IconDto ICON_ARROW_DOWN_24 = new IconDto("ICON_ARROW_DOWN_24", 27) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ARROW_DOWN_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ARROW_DOWN_24;
        }
    };
    public static final IconDto ICON_ARROW_DOWN_FILL_12 = new IconDto("ICON_ARROW_DOWN_FILL_12", 28) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ARROW_DOWN_FILL_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ARROW_DOWN_FILL_12;
        }
    };
    public static final IconDto ICON_ARROW_DOWN_FILL_16 = new IconDto("ICON_ARROW_DOWN_FILL_16", 29) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ARROW_DOWN_FILL_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ARROW_DOWN_FILL_16;
        }
    };
    public static final IconDto ICON_ARROW_DOWN_FILL_24 = new IconDto("ICON_ARROW_DOWN_FILL_24", 30) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ARROW_DOWN_FILL_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ARROW_DOWN_FILL_24;
        }
    };
    public static final IconDto ICON_ARROW_DOWN_RIGHT_12 = new IconDto("ICON_ARROW_DOWN_RIGHT_12", 31) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ARROW_DOWN_RIGHT_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ARROW_DOWN_RIGHT_12;
        }
    };
    public static final IconDto ICON_ARROW_LEFT_12 = new IconDto("ICON_ARROW_LEFT_12", 32) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ARROW_LEFT_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ARROW_LEFT_12;
        }
    };
    public static final IconDto ICON_ARROW_LEFT_16 = new IconDto("ICON_ARROW_LEFT_16", 33) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ARROW_LEFT_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ARROW_LEFT_16;
        }
    };
    public static final IconDto ICON_ARROW_LEFT_24 = new IconDto("ICON_ARROW_LEFT_24", 34) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ARROW_LEFT_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ARROW_LEFT_24;
        }
    };
    public static final IconDto ICON_ARROW_LEFT_FILL_12 = new IconDto("ICON_ARROW_LEFT_FILL_12", 35) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ARROW_LEFT_FILL_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ARROW_LEFT_FILL_12;
        }
    };
    public static final IconDto ICON_ARROW_LEFT_FILL_16 = new IconDto("ICON_ARROW_LEFT_FILL_16", 36) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ARROW_LEFT_FILL_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ARROW_LEFT_FILL_16;
        }
    };
    public static final IconDto ICON_ARROW_LEFT_FILL_24 = new IconDto("ICON_ARROW_LEFT_FILL_24", 37) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ARROW_LEFT_FILL_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ARROW_LEFT_FILL_24;
        }
    };
    public static final IconDto ICON_ARROW_RIGHT_12 = new IconDto("ICON_ARROW_RIGHT_12", 38) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ARROW_RIGHT_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ARROW_RIGHT_12;
        }
    };
    public static final IconDto ICON_ARROW_RIGHT_16 = new IconDto("ICON_ARROW_RIGHT_16", 39) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ARROW_RIGHT_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ARROW_RIGHT_16;
        }
    };
    public static final IconDto ICON_ARROW_RIGHT_24 = new IconDto("ICON_ARROW_RIGHT_24", 40) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ARROW_RIGHT_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ARROW_RIGHT_24;
        }
    };
    public static final IconDto ICON_ARROW_RIGHT_FILL_12 = new IconDto("ICON_ARROW_RIGHT_FILL_12", 41) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ARROW_RIGHT_FILL_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ARROW_RIGHT_FILL_12;
        }
    };
    public static final IconDto ICON_ARROW_RIGHT_FILL_16 = new IconDto("ICON_ARROW_RIGHT_FILL_16", 42) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ARROW_RIGHT_FILL_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ARROW_RIGHT_FILL_16;
        }
    };
    public static final IconDto ICON_ARROW_RIGHT_FILL_24 = new IconDto("ICON_ARROW_RIGHT_FILL_24", 43) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ARROW_RIGHT_FILL_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ARROW_RIGHT_FILL_24;
        }
    };
    public static final IconDto ICON_ARROW_UP_12 = new IconDto("ICON_ARROW_UP_12", 44) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ARROW_UP_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ARROW_UP_12;
        }
    };
    public static final IconDto ICON_ARROW_UP_16 = new IconDto("ICON_ARROW_UP_16", 45) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ARROW_UP_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ARROW_UP_16;
        }
    };
    public static final IconDto ICON_ARROW_UP_24 = new IconDto("ICON_ARROW_UP_24", 46) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ARROW_UP_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ARROW_UP_24;
        }
    };
    public static final IconDto ICON_ARROW_UP_FILL_12 = new IconDto("ICON_ARROW_UP_FILL_12", 47) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ARROW_UP_FILL_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ARROW_UP_FILL_12;
        }
    };
    public static final IconDto ICON_ARROW_UP_FILL_16 = new IconDto("ICON_ARROW_UP_FILL_16", 48) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ARROW_UP_FILL_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ARROW_UP_FILL_16;
        }
    };
    public static final IconDto ICON_ARROW_UP_FILL_24 = new IconDto("ICON_ARROW_UP_FILL_24", 49) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ARROW_UP_FILL_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ARROW_UP_FILL_24;
        }
    };
    public static final IconDto ICON_ARROW_UP_RIGHT_12 = new IconDto("ICON_ARROW_UP_RIGHT_12", 50) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ARROW_UP_RIGHT_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ARROW_UP_RIGHT_12;
        }
    };
    public static final IconDto ICON_ARROW_UP_RIGHT_16 = new IconDto("ICON_ARROW_UP_RIGHT_16", 51) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ARROW_UP_RIGHT_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ARROW_UP_RIGHT_16;
        }
    };
    public static final IconDto ICON_ATTACH_24 = new IconDto("ICON_ATTACH_24", 52) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ATTACH_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ATTACH_24;
        }
    };
    public static final IconDto ICON_BACKSPACE_24 = new IconDto("ICON_BACKSPACE_24", 53) { // from class: rh_server_driven_ui.v1.IconDto.ICON_BACKSPACE_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_BACKSPACE_24;
        }
    };
    public static final IconDto ICON_BACKSPACE_32 = new IconDto("ICON_BACKSPACE_32", 54) { // from class: rh_server_driven_ui.v1.IconDto.ICON_BACKSPACE_32
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_BACKSPACE_32;
        }
    };
    public static final IconDto ICON_BANKING_16 = new IconDto("ICON_BANKING_16", 55) { // from class: rh_server_driven_ui.v1.IconDto.ICON_BANKING_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_BANKING_16;
        }
    };
    public static final IconDto ICON_BANKING_24 = new IconDto("ICON_BANKING_24", 56) { // from class: rh_server_driven_ui.v1.IconDto.ICON_BANKING_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_BANKING_24;
        }
    };
    public static final IconDto ICON_BANKING_32 = new IconDto("ICON_BANKING_32", 57) { // from class: rh_server_driven_ui.v1.IconDto.ICON_BANKING_32
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_BANKING_32;
        }
    };
    public static final IconDto ICON_BAR_CHART_16 = new IconDto("ICON_BAR_CHART_16", 58) { // from class: rh_server_driven_ui.v1.IconDto.ICON_BAR_CHART_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_BAR_CHART_16;
        }
    };
    public static final IconDto ICON_BAR_CHART_24 = new IconDto("ICON_BAR_CHART_24", 59) { // from class: rh_server_driven_ui.v1.IconDto.ICON_BAR_CHART_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_BAR_CHART_24;
        }
    };
    public static final IconDto ICON_BOOKMARK_POST_FILLED_16 = new IconDto("ICON_BOOKMARK_POST_FILLED_16", 60) { // from class: rh_server_driven_ui.v1.IconDto.ICON_BOOKMARK_POST_FILLED_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_BOOKMARK_POST_FILLED_16;
        }
    };
    public static final IconDto ICON_BOOKMARK_POST_OUTLINE_16 = new IconDto("ICON_BOOKMARK_POST_OUTLINE_16", 61) { // from class: rh_server_driven_ui.v1.IconDto.ICON_BOOKMARK_POST_OUTLINE_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_BOOKMARK_POST_OUTLINE_16;
        }
    };
    public static final IconDto ICON_BUBBLE_CHECKED_12 = new IconDto("ICON_BUBBLE_CHECKED_12", 62) { // from class: rh_server_driven_ui.v1.IconDto.ICON_BUBBLE_CHECKED_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_BUBBLE_CHECKED_12;
        }
    };
    public static final IconDto ICON_BUBBLE_CHECKED_16 = new IconDto("ICON_BUBBLE_CHECKED_16", 63) { // from class: rh_server_driven_ui.v1.IconDto.ICON_BUBBLE_CHECKED_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_BUBBLE_CHECKED_16;
        }
    };
    public static final IconDto ICON_BUBBLE_CHECKED_24 = new IconDto("ICON_BUBBLE_CHECKED_24", 64) { // from class: rh_server_driven_ui.v1.IconDto.ICON_BUBBLE_CHECKED_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_BUBBLE_CHECKED_24;
        }
    };
    public static final IconDto ICON_BUBBLE_DOT_24 = new IconDto("ICON_BUBBLE_DOT_24", 65) { // from class: rh_server_driven_ui.v1.IconDto.ICON_BUBBLE_DOT_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_BUBBLE_DOT_24;
        }
    };
    public static final IconDto ICON_BUBBLE_EMPTY_24 = new IconDto("ICON_BUBBLE_EMPTY_24", 66) { // from class: rh_server_driven_ui.v1.IconDto.ICON_BUBBLE_EMPTY_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_BUBBLE_EMPTY_24;
        }
    };
    public static final IconDto ICON_BUBBLE_MINUS_16 = new IconDto("ICON_BUBBLE_MINUS_16", 67) { // from class: rh_server_driven_ui.v1.IconDto.ICON_BUBBLE_MINUS_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_BUBBLE_MINUS_16;
        }
    };
    public static final IconDto ICON_BUBBLE_MINUS_24 = new IconDto("ICON_BUBBLE_MINUS_24", 68) { // from class: rh_server_driven_ui.v1.IconDto.ICON_BUBBLE_MINUS_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_BUBBLE_MINUS_24;
        }
    };
    public static final IconDto ICON_BUBBLE_PAUSE_24 = new IconDto("ICON_BUBBLE_PAUSE_24", 69) { // from class: rh_server_driven_ui.v1.IconDto.ICON_BUBBLE_PAUSE_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_BUBBLE_PAUSE_24;
        }
    };
    public static final IconDto ICON_BUBBLE_PLUS_16 = new IconDto("ICON_BUBBLE_PLUS_16", 70) { // from class: rh_server_driven_ui.v1.IconDto.ICON_BUBBLE_PLUS_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_BUBBLE_PLUS_16;
        }
    };
    public static final IconDto ICON_BUBBLE_PLUS_24 = new IconDto("ICON_BUBBLE_PLUS_24", 71) { // from class: rh_server_driven_ui.v1.IconDto.ICON_BUBBLE_PLUS_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_BUBBLE_PLUS_24;
        }
    };
    public static final IconDto ICON_BUBBLE_PLUS_FILLED_24 = new IconDto("ICON_BUBBLE_PLUS_FILLED_24", 72) { // from class: rh_server_driven_ui.v1.IconDto.ICON_BUBBLE_PLUS_FILLED_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_BUBBLE_PLUS_FILLED_24;
        }
    };
    public static final IconDto ICON_BUBBLE_RADIO_BUTTON_24 = new IconDto("ICON_BUBBLE_RADIO_BUTTON_24", 73) { // from class: rh_server_driven_ui.v1.IconDto.ICON_BUBBLE_RADIO_BUTTON_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_BUBBLE_RADIO_BUTTON_24;
        }
    };
    public static final IconDto ICON_BUBBLE_REMOVE_16 = new IconDto("ICON_BUBBLE_REMOVE_16", 74) { // from class: rh_server_driven_ui.v1.IconDto.ICON_BUBBLE_REMOVE_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_BUBBLE_REMOVE_16;
        }
    };
    public static final IconDto ICON_BUBBLE_REMOVE_24 = new IconDto("ICON_BUBBLE_REMOVE_24", 75) { // from class: rh_server_driven_ui.v1.IconDto.ICON_BUBBLE_REMOVE_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_BUBBLE_REMOVE_24;
        }
    };
    public static final IconDto ICON_BUBBLE_REMOVE_FILLED_16 = new IconDto("ICON_BUBBLE_REMOVE_FILLED_16", 76) { // from class: rh_server_driven_ui.v1.IconDto.ICON_BUBBLE_REMOVE_FILLED_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_BUBBLE_REMOVE_FILLED_16;
        }
    };
    public static final IconDto ICON_BUBBLE_REMOVE_FILLED_24 = new IconDto("ICON_BUBBLE_REMOVE_FILLED_24", 77) { // from class: rh_server_driven_ui.v1.IconDto.ICON_BUBBLE_REMOVE_FILLED_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_BUBBLE_REMOVE_FILLED_24;
        }
    };
    public static final IconDto ICON_BUBBLE_REVERSE_24 = new IconDto("ICON_BUBBLE_REVERSE_24", 78) { // from class: rh_server_driven_ui.v1.IconDto.ICON_BUBBLE_REVERSE_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_BUBBLE_REVERSE_24;
        }
    };
    public static final IconDto ICON_BUBBLE_UK_POUNDS_16 = new IconDto("ICON_BUBBLE_UK_POUNDS_16", 79) { // from class: rh_server_driven_ui.v1.IconDto.ICON_BUBBLE_UK_POUNDS_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_BUBBLE_UK_POUNDS_16;
        }
    };
    public static final IconDto ICON_BUBBLE_UK_POUNDS_24 = new IconDto("ICON_BUBBLE_UK_POUNDS_24", 80) { // from class: rh_server_driven_ui.v1.IconDto.ICON_BUBBLE_UK_POUNDS_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_BUBBLE_UK_POUNDS_24;
        }
    };
    public static final IconDto ICON_BUBBLE_UK_POUNDS_FILLED_16 = new IconDto("ICON_BUBBLE_UK_POUNDS_FILLED_16", 81) { // from class: rh_server_driven_ui.v1.IconDto.ICON_BUBBLE_UK_POUNDS_FILLED_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_BUBBLE_UK_POUNDS_FILLED_16;
        }
    };
    public static final IconDto ICON_BUBBLE_UK_POUNDS_FILLED_24 = new IconDto("ICON_BUBBLE_UK_POUNDS_FILLED_24", 82) { // from class: rh_server_driven_ui.v1.IconDto.ICON_BUBBLE_UK_POUNDS_FILLED_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_BUBBLE_UK_POUNDS_FILLED_24;
        }
    };
    public static final IconDto ICON_BUILDER_16 = new IconDto("ICON_BUILDER_16", 83) { // from class: rh_server_driven_ui.v1.IconDto.ICON_BUILDER_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_BUILDER_16;
        }
    };
    public static final IconDto ICON_BUILDER_24 = new IconDto("ICON_BUILDER_24", 84) { // from class: rh_server_driven_ui.v1.IconDto.ICON_BUILDER_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_BUILDER_24;
        }
    };
    public static final IconDto ICON_CALENDAR_12 = new IconDto("ICON_CALENDAR_12", 85) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CALENDAR_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CALENDAR_12;
        }
    };
    public static final IconDto ICON_CALENDAR_16 = new IconDto("ICON_CALENDAR_16", 86) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CALENDAR_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CALENDAR_16;
        }
    };
    public static final IconDto ICON_CALENDAR_24 = new IconDto("ICON_CALENDAR_24", 87) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CALENDAR_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CALENDAR_24;
        }
    };
    public static final IconDto ICON_CAMERA_16 = new IconDto("ICON_CAMERA_16", 88) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CAMERA_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CAMERA_16;
        }
    };
    public static final IconDto ICON_CAMERA_24 = new IconDto("ICON_CAMERA_24", 89) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CAMERA_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CAMERA_24;
        }
    };
    public static final IconDto ICON_CARET_DOWN_12 = new IconDto("ICON_CARET_DOWN_12", 90) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CARET_DOWN_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CARET_DOWN_12;
        }
    };
    public static final IconDto ICON_CARET_DOWN_16 = new IconDto("ICON_CARET_DOWN_16", 91) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CARET_DOWN_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CARET_DOWN_16;
        }
    };
    public static final IconDto ICON_CARET_DOWN_24 = new IconDto("ICON_CARET_DOWN_24", 92) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CARET_DOWN_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CARET_DOWN_24;
        }
    };
    public static final IconDto ICON_CARET_LEFT_12 = new IconDto("ICON_CARET_LEFT_12", 93) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CARET_LEFT_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CARET_LEFT_12;
        }
    };
    public static final IconDto ICON_CARET_LEFT_16 = new IconDto("ICON_CARET_LEFT_16", 94) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CARET_LEFT_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CARET_LEFT_16;
        }
    };
    public static final IconDto ICON_CARET_LEFT_24 = new IconDto("ICON_CARET_LEFT_24", 95) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CARET_LEFT_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CARET_LEFT_24;
        }
    };
    public static final IconDto ICON_CARET_RIGHT_12 = new IconDto("ICON_CARET_RIGHT_12", 96) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CARET_RIGHT_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CARET_RIGHT_12;
        }
    };
    public static final IconDto ICON_CARET_RIGHT_16 = new IconDto("ICON_CARET_RIGHT_16", 97) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CARET_RIGHT_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CARET_RIGHT_16;
        }
    };
    public static final IconDto ICON_CARET_RIGHT_24 = new IconDto("ICON_CARET_RIGHT_24", 98) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CARET_RIGHT_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CARET_RIGHT_24;
        }
    };
    public static final IconDto ICON_CARET_UP_12 = new IconDto("ICON_CARET_UP_12", 99) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CARET_UP_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CARET_UP_12;
        }
    };
    public static final IconDto ICON_CARET_UP_16 = new IconDto("ICON_CARET_UP_16", 100) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CARET_UP_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CARET_UP_16;
        }
    };
    public static final IconDto ICON_CARET_UP_24 = new IconDto("ICON_CARET_UP_24", 101) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CARET_UP_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CARET_UP_24;
        }
    };
    public static final IconDto ICON_CASH_24 = new IconDto("ICON_CASH_24", 102) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CASH_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CASH_24;
        }
    };
    public static final IconDto ICON_CHART_16 = new IconDto("ICON_CHART_16", 103) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CHART_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CHART_16;
        }
    };
    public static final IconDto ICON_CHART_24 = new IconDto("ICON_CHART_24", 104) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CHART_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CHART_24;
        }
    };
    public static final IconDto ICON_CHART_BAR_24 = new IconDto("ICON_CHART_BAR_24", 105) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CHART_BAR_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CHART_BAR_24;
        }
    };
    public static final IconDto ICON_CHART_CANDLESTICKS_16 = new IconDto("ICON_CHART_CANDLESTICKS_16", 106) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CHART_CANDLESTICKS_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CHART_CANDLESTICKS_16;
        }
    };
    public static final IconDto ICON_CHART_CANDLESTICKS_24 = new IconDto("ICON_CHART_CANDLESTICKS_24", 107) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CHART_CANDLESTICKS_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CHART_CANDLESTICKS_24;
        }
    };
    public static final IconDto ICON_CHART_LINE_16 = new IconDto("ICON_CHART_LINE_16", 108) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CHART_LINE_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CHART_LINE_16;
        }
    };
    public static final IconDto ICON_CHART_LINE_24 = new IconDto("ICON_CHART_LINE_24", 109) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CHART_LINE_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CHART_LINE_24;
        }
    };
    public static final IconDto ICON_CHART_STACKED_BAR_16 = new IconDto("ICON_CHART_STACKED_BAR_16", 110) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CHART_STACKED_BAR_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CHART_STACKED_BAR_16;
        }
    };
    public static final IconDto ICON_CHAT_16 = new IconDto("ICON_CHAT_16", 111) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CHAT_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CHAT_16;
        }
    };
    public static final IconDto ICON_CHAT_24 = new IconDto("ICON_CHAT_24", 112) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CHAT_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CHAT_24;
        }
    };
    public static final IconDto ICON_CHATBOT_16 = new IconDto("ICON_CHATBOT_16", 113) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CHATBOT_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CHATBOT_16;
        }
    };
    public static final IconDto ICON_CHATBOT_24 = new IconDto("ICON_CHATBOT_24", 114) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CHATBOT_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CHATBOT_24;
        }
    };
    public static final IconDto ICON_CHECKBOX_EMPTY_16 = new IconDto("ICON_CHECKBOX_EMPTY_16", 115) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CHECKBOX_EMPTY_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CHECKBOX_EMPTY_16;
        }
    };
    public static final IconDto ICON_CHECKBOX_EMPTY_24 = new IconDto("ICON_CHECKBOX_EMPTY_24", 116) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CHECKBOX_EMPTY_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CHECKBOX_EMPTY_24;
        }
    };
    public static final IconDto ICON_CHECKBOX_FILLED_16 = new IconDto("ICON_CHECKBOX_FILLED_16", 117) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CHECKBOX_FILLED_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CHECKBOX_FILLED_16;
        }
    };
    public static final IconDto ICON_CHECKBOX_FILLED_24 = new IconDto("ICON_CHECKBOX_FILLED_24", 118) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CHECKBOX_FILLED_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CHECKBOX_FILLED_24;
        }
    };
    public static final IconDto ICON_CHECKMARK_12 = new IconDto("ICON_CHECKMARK_12", 119) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CHECKMARK_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CHECKMARK_12;
        }
    };
    public static final IconDto ICON_CHECKMARK_16 = new IconDto("ICON_CHECKMARK_16", 120) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CHECKMARK_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CHECKMARK_16;
        }
    };
    public static final IconDto ICON_CHECKMARK_24 = new IconDto("ICON_CHECKMARK_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CHECKMARK_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CHECKMARK_24;
        }
    };
    public static final IconDto ICON_CLIPBOARD_16 = new IconDto("ICON_CLIPBOARD_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CLIPBOARD_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CLIPBOARD_16;
        }
    };
    public static final IconDto ICON_CLIPBOARD_24 = new IconDto("ICON_CLIPBOARD_24", 123) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CLIPBOARD_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CLIPBOARD_24;
        }
    };
    public static final IconDto ICON_CLOCK_12 = new IconDto("ICON_CLOCK_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CLOCK_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CLOCK_12;
        }
    };
    public static final IconDto ICON_CLOCK_16 = new IconDto("ICON_CLOCK_16", 125) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CLOCK_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CLOCK_16;
        }
    };
    public static final IconDto ICON_CLOCK_24 = new IconDto("ICON_CLOCK_24", EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CLOCK_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CLOCK_24;
        }
    };
    public static final IconDto ICON_CLOSE_12 = new IconDto("ICON_CLOSE_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CLOSE_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CLOSE_12;
        }
    };
    public static final IconDto ICON_CLOSE_16 = new IconDto("ICON_CLOSE_16", 128) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CLOSE_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CLOSE_16;
        }
    };
    public static final IconDto ICON_CLOSE_24 = new IconDto("ICON_CLOSE_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CLOSE_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CLOSE_24;
        }
    };
    public static final IconDto ICON_CLOUD_16 = new IconDto("ICON_CLOUD_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CLOUD_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CLOUD_16;
        }
    };
    public static final IconDto ICON_CLOUD_24 = new IconDto("ICON_CLOUD_24", 131) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CLOUD_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CLOUD_24;
        }
    };
    public static final IconDto ICON_COLLAPSE_16 = new IconDto("ICON_COLLAPSE_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_COLLAPSE_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_COLLAPSE_16;
        }
    };
    public static final IconDto ICON_COLLAPSE_24 = new IconDto("ICON_COLLAPSE_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_COLLAPSE_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_COLLAPSE_24;
        }
    };
    public static final IconDto ICON_COMMENT_FILLED_16 = new IconDto("ICON_COMMENT_FILLED_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_COMMENT_FILLED_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_COMMENT_FILLED_16;
        }
    };
    public static final IconDto ICON_COMMENT_FILLED_20 = new IconDto("ICON_COMMENT_FILLED_20", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_COMMENT_FILLED_20
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_COMMENT_FILLED_20;
        }
    };
    public static final IconDto ICON_COMMENT_OUTLINE_16 = new IconDto("ICON_COMMENT_OUTLINE_16", 136) { // from class: rh_server_driven_ui.v1.IconDto.ICON_COMMENT_OUTLINE_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_COMMENT_OUTLINE_16;
        }
    };
    public static final IconDto ICON_COMMENT_OUTLINE_20 = new IconDto("ICON_COMMENT_OUTLINE_20", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_COMMENT_OUTLINE_20
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_COMMENT_OUTLINE_20;
        }
    };
    public static final IconDto ICON_CONCIERGE_24 = new IconDto("ICON_CONCIERGE_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CONCIERGE_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CONCIERGE_24;
        }
    };
    public static final IconDto ICON_CONSUMER_GOODS_12 = new IconDto("ICON_CONSUMER_GOODS_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CONSUMER_GOODS_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CONSUMER_GOODS_12;
        }
    };
    public static final IconDto ICON_CONSUMER_GOODS_16 = new IconDto("ICON_CONSUMER_GOODS_16", EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CONSUMER_GOODS_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CONSUMER_GOODS_16;
        }
    };
    public static final IconDto ICON_CONSUMER_GOODS_24 = new IconDto("ICON_CONSUMER_GOODS_24", EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CONSUMER_GOODS_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CONSUMER_GOODS_24;
        }
    };
    public static final IconDto ICON_CONTROLS_16 = new IconDto("ICON_CONTROLS_16", EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CONTROLS_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CONTROLS_16;
        }
    };
    public static final IconDto ICON_CONTROLS_24 = new IconDto("ICON_CONTROLS_24", EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CONTROLS_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CONTROLS_24;
        }
    };
    public static final IconDto ICON_CONVERSATION_16 = new IconDto("ICON_CONVERSATION_16", 144) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CONVERSATION_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CONVERSATION_16;
        }
    };
    public static final IconDto ICON_CONVERSATION_24 = new IconDto("ICON_CONVERSATION_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CONVERSATION_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CONVERSATION_24;
        }
    };
    public static final IconDto ICON_CONVERT_24 = new IconDto("ICON_CONVERT_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CONVERT_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CONVERT_24;
        }
    };
    public static final IconDto ICON_COPY_12 = new IconDto("ICON_COPY_12", 147) { // from class: rh_server_driven_ui.v1.IconDto.ICON_COPY_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_COPY_12;
        }
    };
    public static final IconDto ICON_COPY_16 = new IconDto("ICON_COPY_16", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_COPY_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_COPY_16;
        }
    };
    public static final IconDto ICON_COPY_24 = new IconDto("ICON_COPY_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_COPY_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_COPY_24;
        }
    };
    public static final IconDto ICON_COPY_TRADE_FILLED_16 = new IconDto("ICON_COPY_TRADE_FILLED_16", 150) { // from class: rh_server_driven_ui.v1.IconDto.ICON_COPY_TRADE_FILLED_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_COPY_TRADE_FILLED_16;
        }
    };
    public static final IconDto ICON_COPY_TRADE_OUTLINE_16 = new IconDto("ICON_COPY_TRADE_OUTLINE_16", 151) { // from class: rh_server_driven_ui.v1.IconDto.ICON_COPY_TRADE_OUTLINE_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_COPY_TRADE_OUTLINE_16;
        }
    };
    public static final IconDto ICON_CORN_FUTURES_24 = new IconDto("ICON_CORN_FUTURES_24", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CORN_FUTURES_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CORN_FUTURES_24;
        }
    };
    public static final IconDto ICON_CORPORATE_16 = new IconDto("ICON_CORPORATE_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CORPORATE_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CORPORATE_16;
        }
    };
    public static final IconDto ICON_CORPORATE_24 = new IconDto("ICON_CORPORATE_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CORPORATE_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CORPORATE_24;
        }
    };
    public static final IconDto ICON_CORTEX_12 = new IconDto("ICON_CORTEX_12", 155) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CORTEX_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CORTEX_12;
        }
    };
    public static final IconDto ICON_CORTEX_16 = new IconDto("ICON_CORTEX_16", 156) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CORTEX_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CORTEX_16;
        }
    };
    public static final IconDto ICON_CORTEX_24 = new IconDto("ICON_CORTEX_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CORTEX_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CORTEX_24;
        }
    };
    public static final IconDto ICON_CRYPTO_12 = new IconDto("ICON_CRYPTO_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CRYPTO_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CRYPTO_12;
        }
    };
    public static final IconDto ICON_CRYPTO_16 = new IconDto("ICON_CRYPTO_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CRYPTO_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CRYPTO_16;
        }
    };
    public static final IconDto ICON_CRYPTO_24 = new IconDto("ICON_CRYPTO_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CRYPTO_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CRYPTO_24;
        }
    };
    public static final IconDto ICON_CRYPTO_C_12 = new IconDto("ICON_CRYPTO_C_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CRYPTO_C_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CRYPTO_C_12;
        }
    };
    public static final IconDto ICON_CRYPTO_C_16 = new IconDto("ICON_CRYPTO_C_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CRYPTO_C_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CRYPTO_C_16;
        }
    };
    public static final IconDto ICON_CRYPTO_C_24 = new IconDto("ICON_CRYPTO_C_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CRYPTO_C_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CRYPTO_C_24;
        }
    };
    public static final IconDto ICON_CUSTODIAL_16 = new IconDto("ICON_CUSTODIAL_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CUSTODIAL_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CUSTODIAL_16;
        }
    };
    public static final IconDto ICON_CUSTODIAL_24 = new IconDto("ICON_CUSTODIAL_24", 165) { // from class: rh_server_driven_ui.v1.IconDto.ICON_CUSTODIAL_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_CUSTODIAL_24;
        }
    };
    public static final IconDto ICON_DEPOSIT_16 = new IconDto("ICON_DEPOSIT_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_DEPOSIT_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_DEPOSIT_16;
        }
    };
    public static final IconDto ICON_DEPOSIT_24 = new IconDto("ICON_DEPOSIT_24", 167) { // from class: rh_server_driven_ui.v1.IconDto.ICON_DEPOSIT_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_DEPOSIT_24;
        }
    };
    public static final IconDto ICON_DINING_24 = new IconDto("ICON_DINING_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_DINING_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_DINING_24;
        }
    };
    public static final IconDto ICON_DISCLOSURES_16 = new IconDto("ICON_DISCLOSURES_16", EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_DISCLOSURES_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_DISCLOSURES_16;
        }
    };
    public static final IconDto ICON_DISCLOSURES_24 = new IconDto("ICON_DISCLOSURES_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_DISCLOSURES_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_DISCLOSURES_24;
        }
    };
    public static final IconDto ICON_DIVIDEND_16 = new IconDto("ICON_DIVIDEND_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_DIVIDEND_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_DIVIDEND_16;
        }
    };
    public static final IconDto ICON_DIVIDEND_24 = new IconDto("ICON_DIVIDEND_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_DIVIDEND_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_DIVIDEND_24;
        }
    };
    public static final IconDto ICON_DOCUMENTS_24 = new IconDto("ICON_DOCUMENTS_24", EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_DOCUMENTS_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_DOCUMENTS_24;
        }
    };
    public static final IconDto ICON_DOLLAR_SIGN_12 = new IconDto("ICON_DOLLAR_SIGN_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_DOLLAR_SIGN_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_DOLLAR_SIGN_12;
        }
    };
    public static final IconDto ICON_DOLLAR_SIGN_16 = new IconDto("ICON_DOLLAR_SIGN_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_DOLLAR_SIGN_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_DOLLAR_SIGN_16;
        }
    };
    public static final IconDto ICON_DOLLAR_SIGN_24 = new IconDto("ICON_DOLLAR_SIGN_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_DOLLAR_SIGN_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_DOLLAR_SIGN_24;
        }
    };
    public static final IconDto ICON_DOT_12 = new IconDto("ICON_DOT_12", EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_DOT_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_DOT_12;
        }
    };
    public static final IconDto ICON_DOT_16 = new IconDto("ICON_DOT_16", EnumC7081g.f2773x8d9721ad) { // from class: rh_server_driven_ui.v1.IconDto.ICON_DOT_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_DOT_16;
        }
    };
    public static final IconDto ICON_DOT_24 = new IconDto("ICON_DOT_24", EnumC7081g.f2780x600b66fe) { // from class: rh_server_driven_ui.v1.IconDto.ICON_DOT_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_DOT_24;
        }
    };
    public static final IconDto ICON_DOTS_16 = new IconDto("ICON_DOTS_16", EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_DOTS_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_DOTS_16;
        }
    };
    public static final IconDto ICON_DOTS_24 = new IconDto("ICON_DOTS_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_DOTS_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_DOTS_24;
        }
    };
    public static final IconDto ICON_DOTS_ANDROID_16 = new IconDto("ICON_DOTS_ANDROID_16", 182) { // from class: rh_server_driven_ui.v1.IconDto.ICON_DOTS_ANDROID_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_DOTS_ANDROID_16;
        }
    };
    public static final IconDto ICON_DOTS_ANDROID_24 = new IconDto("ICON_DOTS_ANDROID_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_DOTS_ANDROID_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_DOTS_ANDROID_24;
        }
    };
    public static final IconDto ICON_DOWNLOAD_12 = new IconDto("ICON_DOWNLOAD_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_DOWNLOAD_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_DOWNLOAD_12;
        }
    };
    public static final IconDto ICON_DOWNLOAD_16 = new IconDto("ICON_DOWNLOAD_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_DOWNLOAD_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_DOWNLOAD_16;
        }
    };
    public static final IconDto ICON_DOWNLOAD_24 = new IconDto("ICON_DOWNLOAD_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_DOWNLOAD_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_DOWNLOAD_24;
        }
    };
    public static final IconDto ICON_DRAG_12 = new IconDto("ICON_DRAG_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_DRAG_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_DRAG_12;
        }
    };
    public static final IconDto ICON_DRAG_16 = new IconDto("ICON_DRAG_16", 188) { // from class: rh_server_driven_ui.v1.IconDto.ICON_DRAG_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_DRAG_16;
        }
    };
    public static final IconDto ICON_DRAG_24 = new IconDto("ICON_DRAG_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_DRAG_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_DRAG_24;
        }
    };
    public static final IconDto ICON_DROPDOWN_12 = new IconDto("ICON_DROPDOWN_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_DROPDOWN_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_DROPDOWN_12;
        }
    };
    public static final IconDto ICON_DROPDOWN_16 = new IconDto("ICON_DROPDOWN_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_DROPDOWN_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_DROPDOWN_16;
        }
    };
    public static final IconDto ICON_DROPDOWN_24 = new IconDto("ICON_DROPDOWN_24", 192) { // from class: rh_server_driven_ui.v1.IconDto.ICON_DROPDOWN_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_DROPDOWN_24;
        }
    };
    public static final IconDto ICON_ECONOMIC_MOAT_24 = new IconDto("ICON_ECONOMIC_MOAT_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ECONOMIC_MOAT_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ECONOMIC_MOAT_24;
        }
    };
    public static final IconDto ICON_EDIT_12 = new IconDto("ICON_EDIT_12", EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_EDIT_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_EDIT_12;
        }
    };
    public static final IconDto ICON_EDIT_16 = new IconDto("ICON_EDIT_16", EnumC7081g.SDK_ASSET_ICON_ALERT_WARNING_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_EDIT_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_EDIT_16;
        }
    };
    public static final IconDto ICON_EDIT_24 = new IconDto("ICON_EDIT_24", EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_EDIT_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_EDIT_24;
        }
    };
    public static final IconDto ICON_EDIT_SURFACE_24 = new IconDto("ICON_EDIT_SURFACE_24", EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_EDIT_SURFACE_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_EDIT_SURFACE_24;
        }
    };
    public static final IconDto ICON_EMAIL_FILLED_16 = new IconDto("ICON_EMAIL_FILLED_16", EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_EMAIL_FILLED_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_EMAIL_FILLED_16;
        }
    };
    public static final IconDto ICON_EMAIL_FILLED_24 = new IconDto("ICON_EMAIL_FILLED_24", EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_EMAIL_FILLED_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_EMAIL_FILLED_24;
        }
    };
    public static final IconDto ICON_EMAIL_OUTLINE_24 = new IconDto("ICON_EMAIL_OUTLINE_24", 200) { // from class: rh_server_driven_ui.v1.IconDto.ICON_EMAIL_OUTLINE_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_EMAIL_OUTLINE_24;
        }
    };
    public static final IconDto ICON_ENERGY_12 = new IconDto("ICON_ENERGY_12", 201) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ENERGY_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ENERGY_12;
        }
    };
    public static final IconDto ICON_ENERGY_24 = new IconDto("ICON_ENERGY_24", 202) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ENERGY_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ENERGY_24;
        }
    };
    public static final IconDto ICON_ENTERTAINMENT_24 = new IconDto("ICON_ENTERTAINMENT_24", EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ENTERTAINMENT_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ENTERTAINMENT_24;
        }
    };
    public static final IconDto ICON_ETF_12 = new IconDto("ICON_ETF_12", 204) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ETF_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ETF_12;
        }
    };
    public static final IconDto ICON_ETF_24 = new IconDto("ICON_ETF_24", EnumC7081g.SDK_ASSET_ICON_CLIPBOARD_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ETF_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ETF_24;
        }
    };
    public static final IconDto ICON_EURO_SIGN_12 = new IconDto("ICON_EURO_SIGN_12", EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_EURO_SIGN_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_EURO_SIGN_12;
        }
    };
    public static final IconDto ICON_EURO_SIGN_16 = new IconDto("ICON_EURO_SIGN_16", EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_EURO_SIGN_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_EURO_SIGN_16;
        }
    };
    public static final IconDto ICON_EURO_SIGN_24 = new IconDto("ICON_EURO_SIGN_24", EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_EURO_SIGN_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_EURO_SIGN_24;
        }
    };
    public static final IconDto ICON_EXCLAMATION_12 = new IconDto("ICON_EXCLAMATION_12", EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_EXCLAMATION_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_EXCLAMATION_12;
        }
    };
    public static final IconDto ICON_EXCLAMATION_16 = new IconDto("ICON_EXCLAMATION_16", EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_EXCLAMATION_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_EXCLAMATION_16;
        }
    };
    public static final IconDto ICON_EXCLAMATION_24 = new IconDto("ICON_EXCLAMATION_24", 211) { // from class: rh_server_driven_ui.v1.IconDto.ICON_EXCLAMATION_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_EXCLAMATION_24;
        }
    };
    public static final IconDto ICON_EXPAND_16 = new IconDto("ICON_EXPAND_16", EnumC7081g.SDK_ASSET_ICON_OVERRIDE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_EXPAND_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_EXPAND_16;
        }
    };
    public static final IconDto ICON_EXPAND_24 = new IconDto("ICON_EXPAND_24", EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_EXPAND_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_EXPAND_24;
        }
    };
    public static final IconDto ICON_EYE_16 = new IconDto("ICON_EYE_16", EnumC7081g.SDK_ASSET_ICON_PIN_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_EYE_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_EYE_16;
        }
    };
    public static final IconDto ICON_EYE_24 = new IconDto("ICON_EYE_24", EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_EYE_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_EYE_24;
        }
    };
    public static final IconDto ICON_EYE_CLOSED_16 = new IconDto("ICON_EYE_CLOSED_16", EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_EYE_CLOSED_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_EYE_CLOSED_16;
        }
    };
    public static final IconDto ICON_EYE_CLOSED_24 = new IconDto("ICON_EYE_CLOSED_24", EnumC7081g.SDK_ASSET_ICON_PROGRESS_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_EYE_CLOSED_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_EYE_CLOSED_24;
        }
    };
    public static final IconDto ICON_FACE_ID_ANDROID_16 = new IconDto("ICON_FACE_ID_ANDROID_16", EnumC7081g.SDK_ASSET_ICON_QUESTION_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_FACE_ID_ANDROID_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_FACE_ID_ANDROID_16;
        }
    };
    public static final IconDto ICON_FACE_ID_ANDROID_24 = new IconDto("ICON_FACE_ID_ANDROID_24", EnumC7081g.SDK_ASSET_ICON_REJECTED_REC_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_FACE_ID_ANDROID_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_FACE_ID_ANDROID_24;
        }
    };
    public static final IconDto ICON_FACE_ID_IOS_16 = new IconDto("ICON_FACE_ID_IOS_16", EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_FACE_ID_IOS_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_FACE_ID_IOS_16;
        }
    };
    public static final IconDto ICON_FACE_ID_IOS_24 = new IconDto("ICON_FACE_ID_IOS_24", EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_FACE_ID_IOS_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_FACE_ID_IOS_24;
        }
    };
    public static final IconDto ICON_FAIR_VALUE_24 = new IconDto("ICON_FAIR_VALUE_24", EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_FAIR_VALUE_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_FAIR_VALUE_24;
        }
    };
    public static final IconDto ICON_FEATURED_16 = new IconDto("ICON_FEATURED_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_FEATURED_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_FEATURED_16;
        }
    };
    public static final IconDto ICON_FEATURED_24 = new IconDto("ICON_FEATURED_24", 224) { // from class: rh_server_driven_ui.v1.IconDto.ICON_FEATURED_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_FEATURED_24;
        }
    };
    public static final IconDto ICON_FILTER_12 = new IconDto("ICON_FILTER_12", 225) { // from class: rh_server_driven_ui.v1.IconDto.ICON_FILTER_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_FILTER_12;
        }
    };
    public static final IconDto ICON_FILTER_16 = new IconDto("ICON_FILTER_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_FILTER_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_FILTER_16;
        }
    };
    public static final IconDto ICON_FILTER_24 = new IconDto("ICON_FILTER_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_FILTER_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_FILTER_24;
        }
    };
    public static final IconDto ICON_FINANCE_12 = new IconDto("ICON_FINANCE_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_FINANCE_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_FINANCE_12;
        }
    };
    public static final IconDto ICON_FINANCE_16 = new IconDto("ICON_FINANCE_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_FINANCE_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_FINANCE_16;
        }
    };
    public static final IconDto ICON_FINANCE_24 = new IconDto("ICON_FINANCE_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_FINANCE_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_FINANCE_24;
        }
    };
    public static final IconDto ICON_FLASH_OFF_24 = new IconDto("ICON_FLASH_OFF_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_FLASH_OFF_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_FLASH_OFF_24;
        }
    };
    public static final IconDto ICON_FLASH_ON_24 = new IconDto("ICON_FLASH_ON_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_FLASH_ON_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_FLASH_ON_24;
        }
    };
    public static final IconDto ICON_FLASHLIGHT_OFF_24 = new IconDto("ICON_FLASHLIGHT_OFF_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_FLASHLIGHT_OFF_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_FLASHLIGHT_OFF_24;
        }
    };
    public static final IconDto ICON_FLASHLIGHT_ON_24 = new IconDto("ICON_FLASHLIGHT_ON_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_FLASHLIGHT_ON_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_FLASHLIGHT_ON_24;
        }
    };
    public static final IconDto ICON_FLOWER_16 = new IconDto("ICON_FLOWER_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_FLOWER_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_FLOWER_16;
        }
    };
    public static final IconDto ICON_FOLDER_16 = new IconDto("ICON_FOLDER_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_FOLDER_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_FOLDER_16;
        }
    };
    public static final IconDto ICON_FOLDER_24 = new IconDto("ICON_FOLDER_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_FOLDER_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_FOLDER_24;
        }
    };
    public static final IconDto ICON_FULLSCREEN_ENTER_24 = new IconDto("ICON_FULLSCREEN_ENTER_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_FULLSCREEN_ENTER_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_FULLSCREEN_ENTER_24;
        }
    };
    public static final IconDto ICON_FULLSCREEN_EXIT_24 = new IconDto("ICON_FULLSCREEN_EXIT_24", 239) { // from class: rh_server_driven_ui.v1.IconDto.ICON_FULLSCREEN_EXIT_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_FULLSCREEN_EXIT_24;
        }
    };
    public static final IconDto ICON_GIFT_12 = new IconDto("ICON_GIFT_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_GIFT_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_GIFT_12;
        }
    };
    public static final IconDto ICON_GIFT_16 = new IconDto("ICON_GIFT_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_GIFT_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_GIFT_16;
        }
    };
    public static final IconDto ICON_GIFT_24 = new IconDto("ICON_GIFT_24", EnumC7081g.f2778x3356acf6) { // from class: rh_server_driven_ui.v1.IconDto.ICON_GIFT_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_GIFT_24;
        }
    };
    public static final IconDto ICON_GOLD_16 = new IconDto("ICON_GOLD_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_GOLD_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_GOLD_16;
        }
    };
    public static final IconDto ICON_GOLD_24 = new IconDto("ICON_GOLD_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_GOLD_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_GOLD_24;
        }
    };
    public static final IconDto ICON_GROCERIES_24 = new IconDto("ICON_GROCERIES_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_GROCERIES_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_GROCERIES_24;
        }
    };
    public static final IconDto ICON_HAMBURGER_12 = new IconDto("ICON_HAMBURGER_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_HAMBURGER_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_HAMBURGER_12;
        }
    };
    public static final IconDto ICON_HAMBURGER_16 = new IconDto("ICON_HAMBURGER_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_HAMBURGER_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_HAMBURGER_16;
        }
    };
    public static final IconDto ICON_HAMBURGER_24 = new IconDto("ICON_HAMBURGER_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_HAMBURGER_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_HAMBURGER_24;
        }
    };
    public static final IconDto ICON_HEALTHCARE_12 = new IconDto("ICON_HEALTHCARE_12", EnumC7081g.f2779x59907a3d) { // from class: rh_server_driven_ui.v1.IconDto.ICON_HEALTHCARE_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_HEALTHCARE_12;
        }
    };
    public static final IconDto ICON_HEALTHCARE_24 = new IconDto("ICON_HEALTHCARE_24", 250) { // from class: rh_server_driven_ui.v1.IconDto.ICON_HEALTHCARE_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_HEALTHCARE_24;
        }
    };
    public static final IconDto ICON_HELP_24 = new IconDto("ICON_HELP_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_HELP_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_HELP_24;
        }
    };
    public static final IconDto ICON_HISTORY_16 = new IconDto("ICON_HISTORY_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_HISTORY_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_HISTORY_16;
        }
    };
    public static final IconDto ICON_HISTORY_24 = new IconDto("ICON_HISTORY_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_HISTORY_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_HISTORY_24;
        }
    };
    public static final IconDto ICON_HOME_24 = new IconDto("ICON_HOME_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_HOME_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_HOME_24;
        }
    };
    public static final IconDto ICON_HOSPITALITY_12 = new IconDto("ICON_HOSPITALITY_12", 255) { // from class: rh_server_driven_ui.v1.IconDto.ICON_HOSPITALITY_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_HOSPITALITY_12;
        }
    };
    public static final IconDto ICON_HOSPITALITY_24 = new IconDto("ICON_HOSPITALITY_24", 256) { // from class: rh_server_driven_ui.v1.IconDto.ICON_HOSPITALITY_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_HOSPITALITY_24;
        }
    };
    public static final IconDto ICON_HOURGLASS_12 = new IconDto("ICON_HOURGLASS_12", EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_HOURGLASS_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_HOURGLASS_12;
        }
    };
    public static final IconDto ICON_HOURGLASS_16 = new IconDto("ICON_HOURGLASS_16", EnumC7081g.SDK_ASSET_HEADER_BOLT_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_HOURGLASS_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_HOURGLASS_16;
        }
    };
    public static final IconDto ICON_HOURGLASS_24 = new IconDto("ICON_HOURGLASS_24", EnumC7081g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_HOURGLASS_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_HOURGLASS_24;
        }
    };
    public static final IconDto ICON_ICLOUD_RESTORE_16 = new IconDto("ICON_ICLOUD_RESTORE_16", EnumC7081g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ICLOUD_RESTORE_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ICLOUD_RESTORE_16;
        }
    };
    public static final IconDto ICON_ICLOUD_RESTORE_24 = new IconDto("ICON_ICLOUD_RESTORE_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ICLOUD_RESTORE_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ICLOUD_RESTORE_24;
        }
    };
    public static final IconDto ICON_IMAGE_16 = new IconDto("ICON_IMAGE_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_IMAGE_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_IMAGE_16;
        }
    };
    public static final IconDto ICON_IMAGE_24 = new IconDto("ICON_IMAGE_24", EnumC7081g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_IMAGE_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_IMAGE_24;
        }
    };
    public static final IconDto ICON_IMAGE_FAIL_16 = new IconDto("ICON_IMAGE_FAIL_16", EnumC7081g.SDK_ASSET_ICON_PLAID_LOGO_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_IMAGE_FAIL_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_IMAGE_FAIL_16;
        }
    };
    public static final IconDto ICON_IMAGE_FAIL_24 = new IconDto("ICON_IMAGE_FAIL_24", EnumC7081g.SDK_ASSET_HEADER_SHIELD_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_IMAGE_FAIL_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_IMAGE_FAIL_24;
        }
    };
    public static final IconDto ICON_INFO_12 = new IconDto("ICON_INFO_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_INFO_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_INFO_12;
        }
    };
    public static final IconDto ICON_INFO_16 = new IconDto("ICON_INFO_16", EnumC7081g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_INFO_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_INFO_16;
        }
    };
    public static final IconDto ICON_INFO_24 = new IconDto("ICON_INFO_24", EnumC7081g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_INFO_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_INFO_24;
        }
    };
    public static final IconDto ICON_INFO_FILLED_12 = new IconDto("ICON_INFO_FILLED_12", EnumC7081g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_INFO_FILLED_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_INFO_FILLED_12;
        }
    };
    public static final IconDto ICON_INFO_FILLED_16 = new IconDto("ICON_INFO_FILLED_16", EnumC7081g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_INFO_FILLED_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_INFO_FILLED_16;
        }
    };
    public static final IconDto ICON_INFO_FILLED_24 = new IconDto("ICON_INFO_FILLED_24", 271) { // from class: rh_server_driven_ui.v1.IconDto.ICON_INFO_FILLED_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_INFO_FILLED_24;
        }
    };
    public static final IconDto ICON_ISA_16 = new IconDto("ICON_ISA_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ISA_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ISA_16;
        }
    };
    public static final IconDto ICON_ISA_24 = new IconDto("ICON_ISA_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ISA_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ISA_24;
        }
    };
    public static final IconDto ICON_JOINT_ACCOUNT_12 = new IconDto("ICON_JOINT_ACCOUNT_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_JOINT_ACCOUNT_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_JOINT_ACCOUNT_12;
        }
    };
    public static final IconDto ICON_JOINT_ACCOUNT_16 = new IconDto("ICON_JOINT_ACCOUNT_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_JOINT_ACCOUNT_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_JOINT_ACCOUNT_16;
        }
    };
    public static final IconDto ICON_JOINT_ACCOUNT_24 = new IconDto("ICON_JOINT_ACCOUNT_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_JOINT_ACCOUNT_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_JOINT_ACCOUNT_24;
        }
    };
    public static final IconDto ICON_L2_HEADER_ARROW_24 = new IconDto("ICON_L2_HEADER_ARROW_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_L2_HEADER_ARROW_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_L2_HEADER_ARROW_24;
        }
    };
    public static final IconDto ICON_LIGHTBULB_16 = new IconDto("ICON_LIGHTBULB_16", EnumC7081g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_LIGHTBULB_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_LIGHTBULB_16;
        }
    };
    public static final IconDto ICON_LIGHTBULB_24 = new IconDto("ICON_LIGHTBULB_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_LIGHTBULB_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_LIGHTBULB_24;
        }
    };
    public static final IconDto ICON_LIGHTNING_12 = new IconDto("ICON_LIGHTNING_12", 280) { // from class: rh_server_driven_ui.v1.IconDto.ICON_LIGHTNING_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_LIGHTNING_12;
        }
    };
    public static final IconDto ICON_LIGHTNING_16 = new IconDto("ICON_LIGHTNING_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_LIGHTNING_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_LIGHTNING_16;
        }
    };
    public static final IconDto ICON_LIGHTNING_24 = new IconDto("ICON_LIGHTNING_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_LIGHTNING_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_LIGHTNING_24;
        }
    };
    public static final IconDto ICON_LIGHTNING_OFF_16 = new IconDto("ICON_LIGHTNING_OFF_16", 283) { // from class: rh_server_driven_ui.v1.IconDto.ICON_LIGHTNING_OFF_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_LIGHTNING_OFF_16;
        }
    };
    public static final IconDto ICON_LIKE_POST_FILLED_16 = new IconDto("ICON_LIKE_POST_FILLED_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_LIKE_POST_FILLED_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_LIKE_POST_FILLED_16;
        }
    };
    public static final IconDto ICON_LIKE_POST_FILLED_20 = new IconDto("ICON_LIKE_POST_FILLED_20", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_LIKE_POST_FILLED_20
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_LIKE_POST_FILLED_20;
        }
    };
    public static final IconDto ICON_LIKE_POST_OUTLINE_16 = new IconDto("ICON_LIKE_POST_OUTLINE_16", EnumC7081g.f2777x89a9e432) { // from class: rh_server_driven_ui.v1.IconDto.ICON_LIKE_POST_OUTLINE_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_LIKE_POST_OUTLINE_16;
        }
    };
    public static final IconDto ICON_LIKE_POST_OUTLINE_20 = new IconDto("ICON_LIKE_POST_OUTLINE_20", EnumC7081g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_LIKE_POST_OUTLINE_20
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_LIKE_POST_OUTLINE_20;
        }
    };
    public static final IconDto ICON_LIKE_POST_OUTLINE_24 = new IconDto("ICON_LIKE_POST_OUTLINE_24", 288) { // from class: rh_server_driven_ui.v1.IconDto.ICON_LIKE_POST_OUTLINE_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_LIKE_POST_OUTLINE_24;
        }
    };
    public static final IconDto ICON_LINK_16 = new IconDto("ICON_LINK_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_LINK_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_LINK_16;
        }
    };
    public static final IconDto ICON_LINK_24 = new IconDto("ICON_LINK_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_LINK_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_LINK_24;
        }
    };
    public static final IconDto ICON_LINK_OUT_12 = new IconDto("ICON_LINK_OUT_12", EnumC7081g.f2776x87e624cb) { // from class: rh_server_driven_ui.v1.IconDto.ICON_LINK_OUT_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_LINK_OUT_12;
        }
    };
    public static final IconDto ICON_LINK_OUT_16 = new IconDto("ICON_LINK_OUT_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_LINK_OUT_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_LINK_OUT_16;
        }
    };
    public static final IconDto ICON_LINK_OUT_24 = new IconDto("ICON_LINK_OUT_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_LINK_OUT_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_LINK_OUT_24;
        }
    };
    public static final IconDto ICON_LIST_24 = new IconDto("ICON_LIST_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_LIST_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_LIST_24;
        }
    };
    public static final IconDto ICON_LOCATION_FILL_16 = new IconDto("ICON_LOCATION_FILL_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_LOCATION_FILL_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_LOCATION_FILL_16;
        }
    };
    public static final IconDto ICON_LOCATION_FILL_24 = new IconDto("ICON_LOCATION_FILL_24", EnumC7081g.SDK_ASSET_LOADING_INDICATOR_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_LOCATION_FILL_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_LOCATION_FILL_24;
        }
    };
    public static final IconDto ICON_LOCATION_OUTLINE_24 = new IconDto("ICON_LOCATION_OUTLINE_24", EnumC7081g.SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_LOCATION_OUTLINE_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_LOCATION_OUTLINE_24;
        }
    };
    public static final IconDto ICON_LOCK_12 = new IconDto("ICON_LOCK_12", EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_LOCK_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_LOCK_12;
        }
    };
    public static final IconDto ICON_LOCK_16 = new IconDto("ICON_LOCK_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_LOCK_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_LOCK_16;
        }
    };
    public static final IconDto ICON_LOCK_24 = new IconDto("ICON_LOCK_24", 300) { // from class: rh_server_driven_ui.v1.IconDto.ICON_LOCK_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_LOCK_24;
        }
    };
    public static final IconDto ICON_LOG_OUT_24 = new IconDto("ICON_LOG_OUT_24", EnumC7081g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_LOG_OUT_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_LOG_OUT_24;
        }
    };
    public static final IconDto ICON_MANAGED_ACCOUNTS_16 = new IconDto("ICON_MANAGED_ACCOUNTS_16", 302) { // from class: rh_server_driven_ui.v1.IconDto.ICON_MANAGED_ACCOUNTS_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_MANAGED_ACCOUNTS_16;
        }
    };
    public static final IconDto ICON_MANAGED_ACCOUNTS_24 = new IconDto("ICON_MANAGED_ACCOUNTS_24", EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_MANAGED_ACCOUNTS_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_MANAGED_ACCOUNTS_24;
        }
    };
    public static final IconDto ICON_MANAGED_INDIVIDUAL_24 = new IconDto("ICON_MANAGED_INDIVIDUAL_24", EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_MANAGED_INDIVIDUAL_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_MANAGED_INDIVIDUAL_24;
        }
    };
    public static final IconDto ICON_MANAGED_JOINT_24 = new IconDto("ICON_MANAGED_JOINT_24", EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_MANAGED_JOINT_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_MANAGED_JOINT_24;
        }
    };
    public static final IconDto ICON_MANAGED_RETIREMENT_24 = new IconDto("ICON_MANAGED_RETIREMENT_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_MANAGED_RETIREMENT_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_MANAGED_RETIREMENT_24;
        }
    };
    public static final IconDto ICON_MANUFACTURING_12 = new IconDto("ICON_MANUFACTURING_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_MANUFACTURING_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_MANUFACTURING_12;
        }
    };
    public static final IconDto ICON_MANUFACTURING_24 = new IconDto("ICON_MANUFACTURING_24", EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_MANUFACTURING_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_MANUFACTURING_24;
        }
    };
    public static final IconDto ICON_MAPS_24 = new IconDto("ICON_MAPS_24", EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_MAPS_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_MAPS_24;
        }
    };
    public static final IconDto ICON_MARGIN_12 = new IconDto("ICON_MARGIN_12", EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_MARGIN_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_MARGIN_12;
        }
    };
    public static final IconDto ICON_MARGIN_16 = new IconDto("ICON_MARGIN_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_MARGIN_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_MARGIN_16;
        }
    };
    public static final IconDto ICON_MARGIN_24 = new IconDto("ICON_MARGIN_24", EnumC7081g.f2774x74902ae0) { // from class: rh_server_driven_ui.v1.IconDto.ICON_MARGIN_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_MARGIN_24;
        }
    };
    public static final IconDto ICON_MAXIMUM_16 = new IconDto("ICON_MAXIMUM_16", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_MAXIMUM_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_MAXIMUM_16;
        }
    };
    public static final IconDto ICON_MESSAGE_SEND_16 = new IconDto("ICON_MESSAGE_SEND_16", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_MESSAGE_SEND_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_MESSAGE_SEND_16;
        }
    };
    public static final IconDto ICON_MESSAGE_SEND_24 = new IconDto("ICON_MESSAGE_SEND_24", EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_MESSAGE_SEND_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_MESSAGE_SEND_24;
        }
    };
    public static final IconDto ICON_MINIMUM_16 = new IconDto("ICON_MINIMUM_16", 316) { // from class: rh_server_driven_ui.v1.IconDto.ICON_MINIMUM_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_MINIMUM_16;
        }
    };
    public static final IconDto ICON_MINUS_12 = new IconDto("ICON_MINUS_12", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_MINUS_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_MINUS_12;
        }
    };
    public static final IconDto ICON_MINUS_16 = new IconDto("ICON_MINUS_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_MINUS_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_MINUS_16;
        }
    };
    public static final IconDto ICON_MINUS_24 = new IconDto("ICON_MINUS_24", EnumC7081g.f2781x2ba65ba3) { // from class: rh_server_driven_ui.v1.IconDto.ICON_MINUS_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_MINUS_24;
        }
    };
    public static final IconDto ICON_MORE_MENU_16 = new IconDto("ICON_MORE_MENU_16", EnumC7081g.SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_MORE_MENU_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_MORE_MENU_16;
        }
    };
    public static final IconDto ICON_MORE_MENU_20 = new IconDto("ICON_MORE_MENU_20", EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_LIGHT_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_MORE_MENU_20
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_MORE_MENU_20;
        }
    };
    public static final IconDto ICON_NEWS_16 = new IconDto("ICON_NEWS_16", EnumC7081g.SDK_ASSET_PLAID_PROFILE_CIRCLE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_NEWS_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_NEWS_16;
        }
    };
    public static final IconDto ICON_NEWS_24 = new IconDto("ICON_NEWS_24", EnumC7081g.f2775xbcb7e6f3) { // from class: rh_server_driven_ui.v1.IconDto.ICON_NEWS_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_NEWS_24;
        }
    };
    public static final IconDto ICON_NO_VALUE_24 = new IconDto("ICON_NO_VALUE_24", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_NO_VALUE_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_NO_VALUE_24;
        }
    };
    public static final IconDto ICON_NO_VALUE_32 = new IconDto("ICON_NO_VALUE_32", EnumC7081g.SDK_ASSET_ICON_REPORT_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_NO_VALUE_32
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_NO_VALUE_32;
        }
    };
    public static final IconDto ICON_NOTIFICATION_12 = new IconDto("ICON_NOTIFICATION_12", EnumC7081g.SDK_ASSET_ICON_STEP_COMPLETE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_NOTIFICATION_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_NOTIFICATION_12;
        }
    };
    public static final IconDto ICON_NOTIFICATION_16 = new IconDto("ICON_NOTIFICATION_16", EnumC7081g.SDK_ASSET_ICON_UPLOAD_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_NOTIFICATION_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_NOTIFICATION_16;
        }
    };
    public static final IconDto ICON_NOTIFICATION_24 = new IconDto("ICON_NOTIFICATION_24", EnumC7081g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_NOTIFICATION_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_NOTIFICATION_24;
        }
    };
    public static final IconDto ICON_NOTIFICATION_32 = new IconDto("ICON_NOTIFICATION_32", EnumC7081g.SDK_ASSET_ICON_LIGHTNING_FILLED_BLUE_VALUE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_NOTIFICATION_32
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_NOTIFICATION_32;
        }
    };
    public static final IconDto ICON_NOTIFICATION_ADD_16 = new IconDto("ICON_NOTIFICATION_ADD_16", 330) { // from class: rh_server_driven_ui.v1.IconDto.ICON_NOTIFICATION_ADD_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_NOTIFICATION_ADD_16;
        }
    };
    public static final IconDto ICON_NOTIFICATION_ADD_24 = new IconDto("ICON_NOTIFICATION_ADD_24", 331) { // from class: rh_server_driven_ui.v1.IconDto.ICON_NOTIFICATION_ADD_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_NOTIFICATION_ADD_24;
        }
    };
    public static final IconDto ICON_NOTIFICATION_CHECK_16 = new IconDto("ICON_NOTIFICATION_CHECK_16", 332) { // from class: rh_server_driven_ui.v1.IconDto.ICON_NOTIFICATION_CHECK_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_NOTIFICATION_CHECK_16;
        }
    };
    public static final IconDto ICON_NOTIFICATION_CHECK_24 = new IconDto("ICON_NOTIFICATION_CHECK_24", 333) { // from class: rh_server_driven_ui.v1.IconDto.ICON_NOTIFICATION_CHECK_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_NOTIFICATION_CHECK_24;
        }
    };
    public static final IconDto ICON_NUMPAD_DOWN_24 = new IconDto("ICON_NUMPAD_DOWN_24", 334) { // from class: rh_server_driven_ui.v1.IconDto.ICON_NUMPAD_DOWN_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_NUMPAD_DOWN_24;
        }
    };
    public static final IconDto ICON_NUMPAD_UP_24 = new IconDto("ICON_NUMPAD_UP_24", 335) { // from class: rh_server_driven_ui.v1.IconDto.ICON_NUMPAD_UP_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_NUMPAD_UP_24;
        }
    };
    public static final IconDto ICON_ONLINE_16 = new IconDto("ICON_ONLINE_16", WaitlistAnimationConstants.IN_WAITLIST_ANIMATION_END) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ONLINE_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ONLINE_16;
        }
    };
    public static final IconDto ICON_ONLINE_24 = new IconDto("ICON_ONLINE_24", 337) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ONLINE_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ONLINE_24;
        }
    };
    public static final IconDto ICON_OPTIONS_DOWN_24 = new IconDto("ICON_OPTIONS_DOWN_24", 338) { // from class: rh_server_driven_ui.v1.IconDto.ICON_OPTIONS_DOWN_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_OPTIONS_DOWN_24;
        }
    };
    public static final IconDto ICON_OPTIONS_FLAT_24 = new IconDto("ICON_OPTIONS_FLAT_24", 339) { // from class: rh_server_driven_ui.v1.IconDto.ICON_OPTIONS_FLAT_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_OPTIONS_FLAT_24;
        }
    };
    public static final IconDto ICON_OPTIONS_UP_24 = new IconDto("ICON_OPTIONS_UP_24", 340) { // from class: rh_server_driven_ui.v1.IconDto.ICON_OPTIONS_UP_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_OPTIONS_UP_24;
        }
    };
    public static final IconDto ICON_OPTIONS_VOLATILE_24 = new IconDto("ICON_OPTIONS_VOLATILE_24", 341) { // from class: rh_server_driven_ui.v1.IconDto.ICON_OPTIONS_VOLATILE_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_OPTIONS_VOLATILE_24;
        }
    };
    public static final IconDto ICON_ORDER_16 = new IconDto("ICON_ORDER_16", 342) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ORDER_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ORDER_16;
        }
    };
    public static final IconDto ICON_ORDER_24 = new IconDto("ICON_ORDER_24", 343) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ORDER_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ORDER_24;
        }
    };
    public static final IconDto ICON_PAUSE_HERO_40 = new IconDto("ICON_PAUSE_HERO_40", 344) { // from class: rh_server_driven_ui.v1.IconDto.ICON_PAUSE_HERO_40
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_PAUSE_HERO_40;
        }
    };
    public static final IconDto ICON_PAUSE_INLINE_24 = new IconDto("ICON_PAUSE_INLINE_24", 345) { // from class: rh_server_driven_ui.v1.IconDto.ICON_PAUSE_INLINE_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_PAUSE_INLINE_24;
        }
    };
    public static final IconDto ICON_PAYCHECK_24 = new IconDto("ICON_PAYCHECK_24", 346) { // from class: rh_server_driven_ui.v1.IconDto.ICON_PAYCHECK_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_PAYCHECK_24;
        }
    };
    public static final IconDto ICON_PAYMENT_12 = new IconDto("ICON_PAYMENT_12", 347) { // from class: rh_server_driven_ui.v1.IconDto.ICON_PAYMENT_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_PAYMENT_12;
        }
    };
    public static final IconDto ICON_PAYMENT_16 = new IconDto("ICON_PAYMENT_16", 348) { // from class: rh_server_driven_ui.v1.IconDto.ICON_PAYMENT_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_PAYMENT_16;
        }
    };
    public static final IconDto ICON_PAYMENT_24 = new IconDto("ICON_PAYMENT_24", 349) { // from class: rh_server_driven_ui.v1.IconDto.ICON_PAYMENT_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_PAYMENT_24;
        }
    };
    public static final IconDto ICON_PAYMENT_32 = new IconDto("ICON_PAYMENT_32", 350) { // from class: rh_server_driven_ui.v1.IconDto.ICON_PAYMENT_32
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_PAYMENT_32;
        }
    };
    public static final IconDto ICON_PERCENT_SIGN_12 = new IconDto("ICON_PERCENT_SIGN_12", 351) { // from class: rh_server_driven_ui.v1.IconDto.ICON_PERCENT_SIGN_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_PERCENT_SIGN_12;
        }
    };
    public static final IconDto ICON_PERCENT_SIGN_16 = new IconDto("ICON_PERCENT_SIGN_16", 352) { // from class: rh_server_driven_ui.v1.IconDto.ICON_PERCENT_SIGN_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_PERCENT_SIGN_16;
        }
    };
    public static final IconDto ICON_PERCENT_SIGN_24 = new IconDto("ICON_PERCENT_SIGN_24", 353) { // from class: rh_server_driven_ui.v1.IconDto.ICON_PERCENT_SIGN_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_PERCENT_SIGN_24;
        }
    };
    public static final IconDto ICON_PERPETUAL_FUTURES_32 = new IconDto("ICON_PERPETUAL_FUTURES_32", 354) { // from class: rh_server_driven_ui.v1.IconDto.ICON_PERPETUAL_FUTURES_32
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_PERPETUAL_FUTURES_32;
        }
    };
    public static final IconDto ICON_PERSON_12 = new IconDto("ICON_PERSON_12", 355) { // from class: rh_server_driven_ui.v1.IconDto.ICON_PERSON_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_PERSON_12;
        }
    };
    public static final IconDto ICON_PERSON_16 = new IconDto("ICON_PERSON_16", 356) { // from class: rh_server_driven_ui.v1.IconDto.ICON_PERSON_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_PERSON_16;
        }
    };
    public static final IconDto ICON_PERSON_24 = new IconDto("ICON_PERSON_24", 357) { // from class: rh_server_driven_ui.v1.IconDto.ICON_PERSON_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_PERSON_24;
        }
    };
    public static final IconDto ICON_PHONE_16 = new IconDto("ICON_PHONE_16", 358) { // from class: rh_server_driven_ui.v1.IconDto.ICON_PHONE_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_PHONE_16;
        }
    };
    public static final IconDto ICON_PHONE_24 = new IconDto("ICON_PHONE_24", 359) { // from class: rh_server_driven_ui.v1.IconDto.ICON_PHONE_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_PHONE_24;
        }
    };
    public static final IconDto ICON_PHONE_CONNECTED_16 = new IconDto("ICON_PHONE_CONNECTED_16", 360) { // from class: rh_server_driven_ui.v1.IconDto.ICON_PHONE_CONNECTED_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_PHONE_CONNECTED_16;
        }
    };
    public static final IconDto ICON_PHONE_MISSED_CALL_16 = new IconDto("ICON_PHONE_MISSED_CALL_16", 361) { // from class: rh_server_driven_ui.v1.IconDto.ICON_PHONE_MISSED_CALL_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_PHONE_MISSED_CALL_16;
        }
    };
    public static final IconDto ICON_PHONE_WAITING_16 = new IconDto("ICON_PHONE_WAITING_16", 362) { // from class: rh_server_driven_ui.v1.IconDto.ICON_PHONE_WAITING_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_PHONE_WAITING_16;
        }
    };
    public static final IconDto ICON_PICTURE_IN_PICTURE_24 = new IconDto("ICON_PICTURE_IN_PICTURE_24", 363) { // from class: rh_server_driven_ui.v1.IconDto.ICON_PICTURE_IN_PICTURE_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_PICTURE_IN_PICTURE_24;
        }
    };
    public static final IconDto ICON_PIE_CHART_16 = new IconDto("ICON_PIE_CHART_16", 364) { // from class: rh_server_driven_ui.v1.IconDto.ICON_PIE_CHART_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_PIE_CHART_16;
        }
    };
    public static final IconDto ICON_PIE_CHART_24 = new IconDto("ICON_PIE_CHART_24", 365) { // from class: rh_server_driven_ui.v1.IconDto.ICON_PIE_CHART_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_PIE_CHART_24;
        }
    };
    public static final IconDto ICON_PIN_16 = new IconDto("ICON_PIN_16", 366) { // from class: rh_server_driven_ui.v1.IconDto.ICON_PIN_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_PIN_16;
        }
    };
    public static final IconDto ICON_PIN_24 = new IconDto("ICON_PIN_24", 367) { // from class: rh_server_driven_ui.v1.IconDto.ICON_PIN_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_PIN_24;
        }
    };
    public static final IconDto ICON_PLAY_HERO_40 = new IconDto("ICON_PLAY_HERO_40", 368) { // from class: rh_server_driven_ui.v1.IconDto.ICON_PLAY_HERO_40
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_PLAY_HERO_40;
        }
    };
    public static final IconDto ICON_PLAY_INLINE_16 = new IconDto("ICON_PLAY_INLINE_16", 369) { // from class: rh_server_driven_ui.v1.IconDto.ICON_PLAY_INLINE_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_PLAY_INLINE_16;
        }
    };
    public static final IconDto ICON_PLAY_INLINE_24 = new IconDto("ICON_PLAY_INLINE_24", 370) { // from class: rh_server_driven_ui.v1.IconDto.ICON_PLAY_INLINE_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_PLAY_INLINE_24;
        }
    };
    public static final IconDto ICON_PLUS_12 = new IconDto("ICON_PLUS_12", 371) { // from class: rh_server_driven_ui.v1.IconDto.ICON_PLUS_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_PLUS_12;
        }
    };
    public static final IconDto ICON_PLUS_16 = new IconDto("ICON_PLUS_16", 372) { // from class: rh_server_driven_ui.v1.IconDto.ICON_PLUS_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_PLUS_16;
        }
    };
    public static final IconDto ICON_PLUS_24 = new IconDto("ICON_PLUS_24", 373) { // from class: rh_server_driven_ui.v1.IconDto.ICON_PLUS_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_PLUS_24;
        }
    };
    public static final IconDto ICON_POP_OUT_16 = new IconDto("ICON_POP_OUT_16", 374) { // from class: rh_server_driven_ui.v1.IconDto.ICON_POP_OUT_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_POP_OUT_16;
        }
    };
    public static final IconDto ICON_POP_OUT_24 = new IconDto("ICON_POP_OUT_24", 375) { // from class: rh_server_driven_ui.v1.IconDto.ICON_POP_OUT_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_POP_OUT_24;
        }
    };
    public static final IconDto ICON_PRINT_24 = new IconDto("ICON_PRINT_24", 376) { // from class: rh_server_driven_ui.v1.IconDto.ICON_PRINT_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_PRINT_24;
        }
    };
    public static final IconDto ICON_QR_16 = new IconDto("ICON_QR_16", 377) { // from class: rh_server_driven_ui.v1.IconDto.ICON_QR_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_QR_16;
        }
    };
    public static final IconDto ICON_QR_24 = new IconDto("ICON_QR_24", 378) { // from class: rh_server_driven_ui.v1.IconDto.ICON_QR_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_QR_24;
        }
    };
    public static final IconDto ICON_QR_SCAN_24 = new IconDto("ICON_QR_SCAN_24", 379) { // from class: rh_server_driven_ui.v1.IconDto.ICON_QR_SCAN_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_QR_SCAN_24;
        }
    };
    public static final IconDto ICON_QUANTITY_16 = new IconDto("ICON_QUANTITY_16", 380) { // from class: rh_server_driven_ui.v1.IconDto.ICON_QUANTITY_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_QUANTITY_16;
        }
    };
    public static final IconDto ICON_QUANTITY_24 = new IconDto("ICON_QUANTITY_24", 381) { // from class: rh_server_driven_ui.v1.IconDto.ICON_QUANTITY_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_QUANTITY_24;
        }
    };
    public static final IconDto ICON_QUESTION_12 = new IconDto("ICON_QUESTION_12", 382) { // from class: rh_server_driven_ui.v1.IconDto.ICON_QUESTION_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_QUESTION_12;
        }
    };
    public static final IconDto ICON_QUESTION_16 = new IconDto("ICON_QUESTION_16", 383) { // from class: rh_server_driven_ui.v1.IconDto.ICON_QUESTION_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_QUESTION_16;
        }
    };
    public static final IconDto ICON_QUESTION_24 = new IconDto("ICON_QUESTION_24", 384) { // from class: rh_server_driven_ui.v1.IconDto.ICON_QUESTION_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_QUESTION_24;
        }
    };
    public static final IconDto ICON_QUESTION_FILLED_12 = new IconDto("ICON_QUESTION_FILLED_12", 385) { // from class: rh_server_driven_ui.v1.IconDto.ICON_QUESTION_FILLED_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_QUESTION_FILLED_12;
        }
    };
    public static final IconDto ICON_QUESTION_FILLED_16 = new IconDto("ICON_QUESTION_FILLED_16", 386) { // from class: rh_server_driven_ui.v1.IconDto.ICON_QUESTION_FILLED_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_QUESTION_FILLED_16;
        }
    };
    public static final IconDto ICON_QUESTION_FILLED_24 = new IconDto("ICON_QUESTION_FILLED_24", 387) { // from class: rh_server_driven_ui.v1.IconDto.ICON_QUESTION_FILLED_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_QUESTION_FILLED_24;
        }
    };
    public static final IconDto ICON_RECURRING_12 = new IconDto("ICON_RECURRING_12", 388) { // from class: rh_server_driven_ui.v1.IconDto.ICON_RECURRING_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_RECURRING_12;
        }
    };
    public static final IconDto ICON_RECURRING_16 = new IconDto("ICON_RECURRING_16", 389) { // from class: rh_server_driven_ui.v1.IconDto.ICON_RECURRING_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_RECURRING_16;
        }
    };
    public static final IconDto ICON_RECURRING_24 = new IconDto("ICON_RECURRING_24", 390) { // from class: rh_server_driven_ui.v1.IconDto.ICON_RECURRING_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_RECURRING_24;
        }
    };
    public static final IconDto ICON_RECURRING_HUB_24 = new IconDto("ICON_RECURRING_HUB_24", 391) { // from class: rh_server_driven_ui.v1.IconDto.ICON_RECURRING_HUB_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_RECURRING_HUB_24;
        }
    };
    public static final IconDto ICON_REPEAT_16 = new IconDto("ICON_REPEAT_16", 392) { // from class: rh_server_driven_ui.v1.IconDto.ICON_REPEAT_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_REPEAT_16;
        }
    };
    public static final IconDto ICON_REPLAY_HERO_40 = new IconDto("ICON_REPLAY_HERO_40", 393) { // from class: rh_server_driven_ui.v1.IconDto.ICON_REPLAY_HERO_40
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_REPLAY_HERO_40;
        }
    };
    public static final IconDto ICON_RESEND_16 = new IconDto("ICON_RESEND_16", 394) { // from class: rh_server_driven_ui.v1.IconDto.ICON_RESEND_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_RESEND_16;
        }
    };
    public static final IconDto ICON_RESEND_24 = new IconDto("ICON_RESEND_24", 395) { // from class: rh_server_driven_ui.v1.IconDto.ICON_RESEND_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_RESEND_24;
        }
    };
    public static final IconDto ICON_RETIREMENT_12 = new IconDto("ICON_RETIREMENT_12", WaitlistAnimationConstants.LEFT_YAW_START) { // from class: rh_server_driven_ui.v1.IconDto.ICON_RETIREMENT_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_RETIREMENT_12;
        }
    };
    public static final IconDto ICON_RETIREMENT_16 = new IconDto("ICON_RETIREMENT_16", 397) { // from class: rh_server_driven_ui.v1.IconDto.ICON_RETIREMENT_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_RETIREMENT_16;
        }
    };
    public static final IconDto ICON_RETIREMENT_24 = new IconDto("ICON_RETIREMENT_24", 398) { // from class: rh_server_driven_ui.v1.IconDto.ICON_RETIREMENT_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_RETIREMENT_24;
        }
    };
    public static final IconDto ICON_RETIREMENT_32 = new IconDto("ICON_RETIREMENT_32", 399) { // from class: rh_server_driven_ui.v1.IconDto.ICON_RETIREMENT_32
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_RETIREMENT_32;
        }
    };
    public static final IconDto ICON_RHW_BROWSER_TAB_24 = new IconDto("ICON_RHW_BROWSER_TAB_24", 400) { // from class: rh_server_driven_ui.v1.IconDto.ICON_RHW_BROWSER_TAB_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_RHW_BROWSER_TAB_24;
        }
    };
    public static final IconDto ICON_RHW_CHART_TAB_24 = new IconDto("ICON_RHW_CHART_TAB_24", 401) { // from class: rh_server_driven_ui.v1.IconDto.ICON_RHW_CHART_TAB_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_RHW_CHART_TAB_24;
        }
    };
    public static final IconDto ICON_RHW_SEARCH_TAB_24 = new IconDto("ICON_RHW_SEARCH_TAB_24", 402) { // from class: rh_server_driven_ui.v1.IconDto.ICON_RHW_SEARCH_TAB_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_RHW_SEARCH_TAB_24;
        }
    };
    public static final IconDto ICON_RISK_AND_UNCERTAINTY_24 = new IconDto("ICON_RISK_AND_UNCERTAINTY_24", HttpStatusCode.FORBIDDEN) { // from class: rh_server_driven_ui.v1.IconDto.ICON_RISK_AND_UNCERTAINTY_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_RISK_AND_UNCERTAINTY_24;
        }
    };
    public static final IconDto ICON_ROBINHOOD_12 = new IconDto("ICON_ROBINHOOD_12", 404) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ROBINHOOD_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ROBINHOOD_12;
        }
    };
    public static final IconDto ICON_ROBINHOOD_16 = new IconDto("ICON_ROBINHOOD_16", 405) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ROBINHOOD_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ROBINHOOD_16;
        }
    };
    public static final IconDto ICON_ROBINHOOD_24 = new IconDto("ICON_ROBINHOOD_24", 406) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ROBINHOOD_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ROBINHOOD_24;
        }
    };
    public static final IconDto ICON_ROLLING_POSITION_12 = new IconDto("ICON_ROLLING_POSITION_12", 407) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ROLLING_POSITION_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ROLLING_POSITION_12;
        }
    };
    public static final IconDto ICON_ROLLING_POSITION_16 = new IconDto("ICON_ROLLING_POSITION_16", 408) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ROLLING_POSITION_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ROLLING_POSITION_16;
        }
    };
    public static final IconDto ICON_ROLLING_POSITION_24 = new IconDto("ICON_ROLLING_POSITION_24", 409) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ROLLING_POSITION_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ROLLING_POSITION_24;
        }
    };
    public static final IconDto ICON_SCAN_16 = new IconDto("ICON_SCAN_16", HttpStatusCode.GONE) { // from class: rh_server_driven_ui.v1.IconDto.ICON_SCAN_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_SCAN_16;
        }
    };
    public static final IconDto ICON_SCAN_24 = new IconDto("ICON_SCAN_24", 411) { // from class: rh_server_driven_ui.v1.IconDto.ICON_SCAN_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_SCAN_24;
        }
    };
    public static final IconDto ICON_SEARCH_16 = new IconDto("ICON_SEARCH_16", 412) { // from class: rh_server_driven_ui.v1.IconDto.ICON_SEARCH_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_SEARCH_16;
        }
    };
    public static final IconDto ICON_SEARCH_24 = new IconDto("ICON_SEARCH_24", 413) { // from class: rh_server_driven_ui.v1.IconDto.ICON_SEARCH_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_SEARCH_24;
        }
    };
    public static final IconDto ICON_SETTINGS_12 = new IconDto("ICON_SETTINGS_12", 414) { // from class: rh_server_driven_ui.v1.IconDto.ICON_SETTINGS_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_SETTINGS_12;
        }
    };
    public static final IconDto ICON_SETTINGS_16 = new IconDto("ICON_SETTINGS_16", 415) { // from class: rh_server_driven_ui.v1.IconDto.ICON_SETTINGS_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_SETTINGS_16;
        }
    };
    public static final IconDto ICON_SETTINGS_24 = new IconDto("ICON_SETTINGS_24", 416) { // from class: rh_server_driven_ui.v1.IconDto.ICON_SETTINGS_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_SETTINGS_24;
        }
    };
    public static final IconDto ICON_SHARE_ANDROID_16 = new IconDto("ICON_SHARE_ANDROID_16", 417) { // from class: rh_server_driven_ui.v1.IconDto.ICON_SHARE_ANDROID_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_SHARE_ANDROID_16;
        }
    };
    public static final IconDto ICON_SHARE_ANDROID_24 = new IconDto("ICON_SHARE_ANDROID_24", 418) { // from class: rh_server_driven_ui.v1.IconDto.ICON_SHARE_ANDROID_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_SHARE_ANDROID_24;
        }
    };
    public static final IconDto ICON_SHARE_IOS_16 = new IconDto("ICON_SHARE_IOS_16", 419) { // from class: rh_server_driven_ui.v1.IconDto.ICON_SHARE_IOS_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_SHARE_IOS_16;
        }
    };
    public static final IconDto ICON_SHARE_IOS_24 = new IconDto("ICON_SHARE_IOS_24", 420) { // from class: rh_server_driven_ui.v1.IconDto.ICON_SHARE_IOS_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_SHARE_IOS_24;
        }
    };
    public static final IconDto ICON_SMILEY_24 = new IconDto("ICON_SMILEY_24", 421) { // from class: rh_server_driven_ui.v1.IconDto.ICON_SMILEY_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_SMILEY_24;
        }
    };
    public static final IconDto ICON_SOCIAL_CREATE_POST_16 = new IconDto("ICON_SOCIAL_CREATE_POST_16", 422) { // from class: rh_server_driven_ui.v1.IconDto.ICON_SOCIAL_CREATE_POST_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_SOCIAL_CREATE_POST_16;
        }
    };
    public static final IconDto ICON_SORT_12 = new IconDto("ICON_SORT_12", 423) { // from class: rh_server_driven_ui.v1.IconDto.ICON_SORT_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_SORT_12;
        }
    };
    public static final IconDto ICON_SOUND_OFF_24 = new IconDto("ICON_SOUND_OFF_24", 424) { // from class: rh_server_driven_ui.v1.IconDto.ICON_SOUND_OFF_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_SOUND_OFF_24;
        }
    };
    public static final IconDto ICON_SOUND_ON_24 = new IconDto("ICON_SOUND_ON_24", CompanyFinancialsSection.BAR_ANIMATION_DURATION) { // from class: rh_server_driven_ui.v1.IconDto.ICON_SOUND_ON_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_SOUND_ON_24;
        }
    };
    public static final IconDto ICON_SPARKLE_BULLET_12 = new IconDto("ICON_SPARKLE_BULLET_12", 426) { // from class: rh_server_driven_ui.v1.IconDto.ICON_SPARKLE_BULLET_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_SPARKLE_BULLET_12;
        }
    };
    public static final IconDto ICON_SPARKLE_BULLET_16 = new IconDto("ICON_SPARKLE_BULLET_16", 427) { // from class: rh_server_driven_ui.v1.IconDto.ICON_SPARKLE_BULLET_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_SPARKLE_BULLET_16;
        }
    };
    public static final IconDto ICON_SPARKLE_BULLET_24 = new IconDto("ICON_SPARKLE_BULLET_24", 428) { // from class: rh_server_driven_ui.v1.IconDto.ICON_SPARKLE_BULLET_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_SPARKLE_BULLET_24;
        }
    };
    public static final IconDto ICON_SPARKLE_DOUBLE_16 = new IconDto("ICON_SPARKLE_DOUBLE_16", 429) { // from class: rh_server_driven_ui.v1.IconDto.ICON_SPARKLE_DOUBLE_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_SPARKLE_DOUBLE_16;
        }
    };
    public static final IconDto ICON_SPARKLE_DOUBLE_24 = new IconDto("ICON_SPARKLE_DOUBLE_24", 430) { // from class: rh_server_driven_ui.v1.IconDto.ICON_SPARKLE_DOUBLE_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_SPARKLE_DOUBLE_24;
        }
    };
    public static final IconDto ICON_SPEED_DOWN_24 = new IconDto("ICON_SPEED_DOWN_24", 431) { // from class: rh_server_driven_ui.v1.IconDto.ICON_SPEED_DOWN_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_SPEED_DOWN_24;
        }
    };
    public static final IconDto ICON_SPEED_UP_24 = new IconDto("ICON_SPEED_UP_24", 432) { // from class: rh_server_driven_ui.v1.IconDto.ICON_SPEED_UP_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_SPEED_UP_24;
        }
    };
    public static final IconDto ICON_STAR_FILLED_12 = new IconDto("ICON_STAR_FILLED_12", 433) { // from class: rh_server_driven_ui.v1.IconDto.ICON_STAR_FILLED_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_STAR_FILLED_12;
        }
    };
    public static final IconDto ICON_STAR_FILLED_16 = new IconDto("ICON_STAR_FILLED_16", 434) { // from class: rh_server_driven_ui.v1.IconDto.ICON_STAR_FILLED_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_STAR_FILLED_16;
        }
    };
    public static final IconDto ICON_STAR_FILLED_24 = new IconDto("ICON_STAR_FILLED_24", 435) { // from class: rh_server_driven_ui.v1.IconDto.ICON_STAR_FILLED_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_STAR_FILLED_24;
        }
    };
    public static final IconDto ICON_STAR_OUTLINE_16 = new IconDto("ICON_STAR_OUTLINE_16", 436) { // from class: rh_server_driven_ui.v1.IconDto.ICON_STAR_OUTLINE_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_STAR_OUTLINE_16;
        }
    };
    public static final IconDto ICON_STAR_OUTLINE_24 = new IconDto("ICON_STAR_OUTLINE_24", 437) { // from class: rh_server_driven_ui.v1.IconDto.ICON_STAR_OUTLINE_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_STAR_OUTLINE_24;
        }
    };
    public static final IconDto ICON_STAR_PASSWORD_16 = new IconDto("ICON_STAR_PASSWORD_16", 438) { // from class: rh_server_driven_ui.v1.IconDto.ICON_STAR_PASSWORD_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_STAR_PASSWORD_16;
        }
    };
    public static final IconDto ICON_STEWARDSHIP_24 = new IconDto("ICON_STEWARDSHIP_24", 439) { // from class: rh_server_driven_ui.v1.IconDto.ICON_STEWARDSHIP_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_STEWARDSHIP_24;
        }
    };
    public static final IconDto ICON_STOCK_DOWN_12 = new IconDto("ICON_STOCK_DOWN_12", 440) { // from class: rh_server_driven_ui.v1.IconDto.ICON_STOCK_DOWN_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_STOCK_DOWN_12;
        }
    };
    public static final IconDto ICON_STOCK_DOWN_16 = new IconDto("ICON_STOCK_DOWN_16", 441) { // from class: rh_server_driven_ui.v1.IconDto.ICON_STOCK_DOWN_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_STOCK_DOWN_16;
        }
    };
    public static final IconDto ICON_STOCK_DOWN_24 = new IconDto("ICON_STOCK_DOWN_24", 442) { // from class: rh_server_driven_ui.v1.IconDto.ICON_STOCK_DOWN_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_STOCK_DOWN_24;
        }
    };
    public static final IconDto ICON_STOCK_UP_12 = new IconDto("ICON_STOCK_UP_12", 443) { // from class: rh_server_driven_ui.v1.IconDto.ICON_STOCK_UP_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_STOCK_UP_12;
        }
    };
    public static final IconDto ICON_STOCK_UP_16 = new IconDto("ICON_STOCK_UP_16", 444) { // from class: rh_server_driven_ui.v1.IconDto.ICON_STOCK_UP_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_STOCK_UP_16;
        }
    };
    public static final IconDto ICON_STOCK_UP_24 = new IconDto("ICON_STOCK_UP_24", 445) { // from class: rh_server_driven_ui.v1.IconDto.ICON_STOCK_UP_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_STOCK_UP_24;
        }
    };
    public static final IconDto ICON_STOPWATCH_16 = new IconDto("ICON_STOPWATCH_16", 446) { // from class: rh_server_driven_ui.v1.IconDto.ICON_STOPWATCH_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_STOPWATCH_16;
        }
    };
    public static final IconDto ICON_STOPWATCH_24 = new IconDto("ICON_STOPWATCH_24", 447) { // from class: rh_server_driven_ui.v1.IconDto.ICON_STOPWATCH_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_STOPWATCH_24;
        }
    };
    public static final IconDto ICON_STOPWATCH_32 = new IconDto("ICON_STOPWATCH_32", 448) { // from class: rh_server_driven_ui.v1.IconDto.ICON_STOPWATCH_32
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_STOPWATCH_32;
        }
    };
    public static final IconDto ICON_STRATEGY_OUTLOOK_24 = new IconDto("ICON_STRATEGY_OUTLOOK_24", 449) { // from class: rh_server_driven_ui.v1.IconDto.ICON_STRATEGY_OUTLOOK_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_STRATEGY_OUTLOOK_24;
        }
    };
    public static final IconDto ICON_SWIPE_DOWN_16 = new IconDto("ICON_SWIPE_DOWN_16", 450) { // from class: rh_server_driven_ui.v1.IconDto.ICON_SWIPE_DOWN_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_SWIPE_DOWN_16;
        }
    };
    public static final IconDto ICON_SWIPE_DOWN_24 = new IconDto("ICON_SWIPE_DOWN_24", 451) { // from class: rh_server_driven_ui.v1.IconDto.ICON_SWIPE_DOWN_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_SWIPE_DOWN_24;
        }
    };
    public static final IconDto ICON_SWIPE_UP_16 = new IconDto("ICON_SWIPE_UP_16", 452) { // from class: rh_server_driven_ui.v1.IconDto.ICON_SWIPE_UP_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_SWIPE_UP_16;
        }
    };
    public static final IconDto ICON_SWIPE_UP_24 = new IconDto("ICON_SWIPE_UP_24", 453) { // from class: rh_server_driven_ui.v1.IconDto.ICON_SWIPE_UP_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_SWIPE_UP_24;
        }
    };
    public static final IconDto ICON_SWITCH_16 = new IconDto("ICON_SWITCH_16", 454) { // from class: rh_server_driven_ui.v1.IconDto.ICON_SWITCH_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_SWITCH_16;
        }
    };
    public static final IconDto ICON_SWITCH_24 = new IconDto("ICON_SWITCH_24", 455) { // from class: rh_server_driven_ui.v1.IconDto.ICON_SWITCH_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_SWITCH_24;
        }
    };
    public static final IconDto ICON_TAB_ACCOUNT_32 = new IconDto("ICON_TAB_ACCOUNT_32", WaitlistAnimationConstants.MIDDLE_YAW_FRAME) { // from class: rh_server_driven_ui.v1.IconDto.ICON_TAB_ACCOUNT_32
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_TAB_ACCOUNT_32;
        }
    };
    public static final IconDto ICON_TAB_CONTENT_32 = new IconDto("ICON_TAB_CONTENT_32", 457) { // from class: rh_server_driven_ui.v1.IconDto.ICON_TAB_CONTENT_32
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_TAB_CONTENT_32;
        }
    };
    public static final IconDto ICON_TAB_CRYPTO_32 = new IconDto("ICON_TAB_CRYPTO_32", 458) { // from class: rh_server_driven_ui.v1.IconDto.ICON_TAB_CRYPTO_32
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_TAB_CRYPTO_32;
        }
    };
    public static final IconDto ICON_TAB_CRYPTO_C_32 = new IconDto("ICON_TAB_CRYPTO_C_32", 459) { // from class: rh_server_driven_ui.v1.IconDto.ICON_TAB_CRYPTO_C_32
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_TAB_CRYPTO_C_32;
        }
    };
    public static final IconDto ICON_TAB_GOLD_32 = new IconDto("ICON_TAB_GOLD_32", 460) { // from class: rh_server_driven_ui.v1.IconDto.ICON_TAB_GOLD_32
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_TAB_GOLD_32;
        }
    };
    public static final IconDto ICON_TAB_INVEST_32 = new IconDto("ICON_TAB_INVEST_32", 461) { // from class: rh_server_driven_ui.v1.IconDto.ICON_TAB_INVEST_32
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_TAB_INVEST_32;
        }
    };
    public static final IconDto ICON_TAB_ISA_32 = new IconDto("ICON_TAB_ISA_32", 462) { // from class: rh_server_driven_ui.v1.IconDto.ICON_TAB_ISA_32
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_TAB_ISA_32;
        }
    };
    public static final IconDto ICON_TAB_MESSAGES_32 = new IconDto("ICON_TAB_MESSAGES_32", 463) { // from class: rh_server_driven_ui.v1.IconDto.ICON_TAB_MESSAGES_32
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_TAB_MESSAGES_32;
        }
    };
    public static final IconDto ICON_TAB_MONEY_32 = new IconDto("ICON_TAB_MONEY_32", 464) { // from class: rh_server_driven_ui.v1.IconDto.ICON_TAB_MONEY_32
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_TAB_MONEY_32;
        }
    };
    public static final IconDto ICON_TAB_RETIREMENT_32 = new IconDto("ICON_TAB_RETIREMENT_32", 465) { // from class: rh_server_driven_ui.v1.IconDto.ICON_TAB_RETIREMENT_32
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_TAB_RETIREMENT_32;
        }
    };
    public static final IconDto ICON_TAB_SEARCH_32 = new IconDto("ICON_TAB_SEARCH_32", 466) { // from class: rh_server_driven_ui.v1.IconDto.ICON_TAB_SEARCH_32
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_TAB_SEARCH_32;
        }
    };
    public static final IconDto ICON_TAB_SOCIAL_32 = new IconDto("ICON_TAB_SOCIAL_32", 467) { // from class: rh_server_driven_ui.v1.IconDto.ICON_TAB_SOCIAL_32
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_TAB_SOCIAL_32;
        }
    };
    public static final IconDto ICON_TAB_WATCHLIST_32 = new IconDto("ICON_TAB_WATCHLIST_32", 468) { // from class: rh_server_driven_ui.v1.IconDto.ICON_TAB_WATCHLIST_32
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_TAB_WATCHLIST_32;
        }
    };
    public static final IconDto ICON_TAG_16 = new IconDto("ICON_TAG_16", 469) { // from class: rh_server_driven_ui.v1.IconDto.ICON_TAG_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_TAG_16;
        }
    };
    public static final IconDto ICON_TAG_24 = new IconDto("ICON_TAG_24", 470) { // from class: rh_server_driven_ui.v1.IconDto.ICON_TAG_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_TAG_24;
        }
    };
    public static final IconDto ICON_TAX_LOTS_LONG_TERM_16 = new IconDto("ICON_TAX_LOTS_LONG_TERM_16", 471) { // from class: rh_server_driven_ui.v1.IconDto.ICON_TAX_LOTS_LONG_TERM_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_TAX_LOTS_LONG_TERM_16;
        }
    };
    public static final IconDto ICON_TAX_LOTS_SHORT_TERM_16 = new IconDto("ICON_TAX_LOTS_SHORT_TERM_16", 472) { // from class: rh_server_driven_ui.v1.IconDto.ICON_TAX_LOTS_SHORT_TERM_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_TAX_LOTS_SHORT_TERM_16;
        }
    };
    public static final IconDto ICON_TECHNOLOGY_12 = new IconDto("ICON_TECHNOLOGY_12", 473) { // from class: rh_server_driven_ui.v1.IconDto.ICON_TECHNOLOGY_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_TECHNOLOGY_12;
        }
    };
    public static final IconDto ICON_TECHNOLOGY_24 = new IconDto("ICON_TECHNOLOGY_24", 474) { // from class: rh_server_driven_ui.v1.IconDto.ICON_TECHNOLOGY_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_TECHNOLOGY_24;
        }
    };
    public static final IconDto ICON_THUMBPRINT_16 = new IconDto("ICON_THUMBPRINT_16", 475) { // from class: rh_server_driven_ui.v1.IconDto.ICON_THUMBPRINT_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_THUMBPRINT_16;
        }
    };
    public static final IconDto ICON_THUMBPRINT_24 = new IconDto("ICON_THUMBPRINT_24", 476) { // from class: rh_server_driven_ui.v1.IconDto.ICON_THUMBPRINT_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_THUMBPRINT_24;
        }
    };
    public static final IconDto ICON_THUMBS_DOWN_16 = new IconDto("ICON_THUMBS_DOWN_16", 477) { // from class: rh_server_driven_ui.v1.IconDto.ICON_THUMBS_DOWN_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_THUMBS_DOWN_16;
        }
    };
    public static final IconDto ICON_THUMBS_DOWN_24 = new IconDto("ICON_THUMBS_DOWN_24", 478) { // from class: rh_server_driven_ui.v1.IconDto.ICON_THUMBS_DOWN_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_THUMBS_DOWN_24;
        }
    };
    public static final IconDto ICON_THUMBS_UP_16 = new IconDto("ICON_THUMBS_UP_16", 479) { // from class: rh_server_driven_ui.v1.IconDto.ICON_THUMBS_UP_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_THUMBS_UP_16;
        }
    };
    public static final IconDto ICON_THUMBS_UP_24 = new IconDto("ICON_THUMBS_UP_24", 480) { // from class: rh_server_driven_ui.v1.IconDto.ICON_THUMBS_UP_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_THUMBS_UP_24;
        }
    };
    public static final IconDto ICON_TICKET_16 = new IconDto("ICON_TICKET_16", 481) { // from class: rh_server_driven_ui.v1.IconDto.ICON_TICKET_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_TICKET_16;
        }
    };
    public static final IconDto ICON_TICKET_24 = new IconDto("ICON_TICKET_24", 482) { // from class: rh_server_driven_ui.v1.IconDto.ICON_TICKET_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_TICKET_24;
        }
    };
    public static final IconDto ICON_TOUCH_ID_ANDROID_16 = new IconDto("ICON_TOUCH_ID_ANDROID_16", 483) { // from class: rh_server_driven_ui.v1.IconDto.ICON_TOUCH_ID_ANDROID_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_TOUCH_ID_ANDROID_16;
        }
    };
    public static final IconDto ICON_TOUCH_ID_ANDROID_24 = new IconDto("ICON_TOUCH_ID_ANDROID_24", 484) { // from class: rh_server_driven_ui.v1.IconDto.ICON_TOUCH_ID_ANDROID_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_TOUCH_ID_ANDROID_24;
        }
    };
    public static final IconDto ICON_TRADE_SOCIAL_FILLED_20 = new IconDto("ICON_TRADE_SOCIAL_FILLED_20", 485) { // from class: rh_server_driven_ui.v1.IconDto.ICON_TRADE_SOCIAL_FILLED_20
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_TRADE_SOCIAL_FILLED_20;
        }
    };
    public static final IconDto ICON_TRADE_SOCIAL_OUTLINE_20 = new IconDto("ICON_TRADE_SOCIAL_OUTLINE_20", 486) { // from class: rh_server_driven_ui.v1.IconDto.ICON_TRADE_SOCIAL_OUTLINE_20
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_TRADE_SOCIAL_OUTLINE_20;
        }
    };
    public static final IconDto ICON_TRANSFERS_12 = new IconDto("ICON_TRANSFERS_12", 487) { // from class: rh_server_driven_ui.v1.IconDto.ICON_TRANSFERS_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_TRANSFERS_12;
        }
    };
    public static final IconDto ICON_TRANSFERS_16 = new IconDto("ICON_TRANSFERS_16", 488) { // from class: rh_server_driven_ui.v1.IconDto.ICON_TRANSFERS_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_TRANSFERS_16;
        }
    };
    public static final IconDto ICON_TRANSFERS_24 = new IconDto("ICON_TRANSFERS_24", 489) { // from class: rh_server_driven_ui.v1.IconDto.ICON_TRANSFERS_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_TRANSFERS_24;
        }
    };
    public static final IconDto ICON_TRANSPORT_24 = new IconDto("ICON_TRANSPORT_24", 490) { // from class: rh_server_driven_ui.v1.IconDto.ICON_TRANSPORT_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_TRANSPORT_24;
        }
    };
    public static final IconDto ICON_TRASH_12 = new IconDto("ICON_TRASH_12", 491) { // from class: rh_server_driven_ui.v1.IconDto.ICON_TRASH_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_TRASH_12;
        }
    };
    public static final IconDto ICON_TRASH_16 = new IconDto("ICON_TRASH_16", 492) { // from class: rh_server_driven_ui.v1.IconDto.ICON_TRASH_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_TRASH_16;
        }
    };
    public static final IconDto ICON_TRASH_24 = new IconDto("ICON_TRASH_24", 493) { // from class: rh_server_driven_ui.v1.IconDto.ICON_TRASH_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_TRASH_24;
        }
    };
    public static final IconDto ICON_TRIANGLE_ALERT_16 = new IconDto("ICON_TRIANGLE_ALERT_16", 494) { // from class: rh_server_driven_ui.v1.IconDto.ICON_TRIANGLE_ALERT_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_TRIANGLE_ALERT_16;
        }
    };
    public static final IconDto ICON_TRIANGLE_ALERT_24 = new IconDto("ICON_TRIANGLE_ALERT_24", 495) { // from class: rh_server_driven_ui.v1.IconDto.ICON_TRIANGLE_ALERT_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_TRIANGLE_ALERT_24;
        }
    };
    public static final IconDto ICON_TUNER_16 = new IconDto("ICON_TUNER_16", 496) { // from class: rh_server_driven_ui.v1.IconDto.ICON_TUNER_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_TUNER_16;
        }
    };
    public static final IconDto ICON_TUNER_24 = new IconDto("ICON_TUNER_24", 497) { // from class: rh_server_driven_ui.v1.IconDto.ICON_TUNER_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_TUNER_24;
        }
    };
    public static final IconDto ICON_UNLOCK_12 = new IconDto("ICON_UNLOCK_12", 498) { // from class: rh_server_driven_ui.v1.IconDto.ICON_UNLOCK_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_UNLOCK_12;
        }
    };
    public static final IconDto ICON_UNLOCK_16 = new IconDto("ICON_UNLOCK_16", 499) { // from class: rh_server_driven_ui.v1.IconDto.ICON_UNLOCK_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_UNLOCK_16;
        }
    };
    public static final IconDto ICON_UNLOCK_24 = new IconDto("ICON_UNLOCK_24", 500) { // from class: rh_server_driven_ui.v1.IconDto.ICON_UNLOCK_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_UNLOCK_24;
        }
    };
    public static final IconDto ICON_UPLOAD_24 = new IconDto("ICON_UPLOAD_24", 501) { // from class: rh_server_driven_ui.v1.IconDto.ICON_UPLOAD_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_UPLOAD_24;
        }
    };
    public static final IconDto ICON_VIDEO_CALL_12 = new IconDto("ICON_VIDEO_CALL_12", com.withpersona.sdk2.inquiry.network.core.HttpStatusCode.BAD_GATEWAY_502) { // from class: rh_server_driven_ui.v1.IconDto.ICON_VIDEO_CALL_12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_VIDEO_CALL_12;
        }
    };
    public static final IconDto ICON_VIDEO_CALL_16 = new IconDto("ICON_VIDEO_CALL_16", 503) { // from class: rh_server_driven_ui.v1.IconDto.ICON_VIDEO_CALL_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_VIDEO_CALL_16;
        }
    };
    public static final IconDto ICON_VIDEO_CALL_24 = new IconDto("ICON_VIDEO_CALL_24", 504) { // from class: rh_server_driven_ui.v1.IconDto.ICON_VIDEO_CALL_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_VIDEO_CALL_24;
        }
    };
    public static final IconDto ICON_VIDEO_FAST_FORWARD_24 = new IconDto("ICON_VIDEO_FAST_FORWARD_24", 505) { // from class: rh_server_driven_ui.v1.IconDto.ICON_VIDEO_FAST_FORWARD_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_VIDEO_FAST_FORWARD_24;
        }
    };
    public static final IconDto ICON_VIDEO_REPLAY_24 = new IconDto("ICON_VIDEO_REPLAY_24", 506) { // from class: rh_server_driven_ui.v1.IconDto.ICON_VIDEO_REPLAY_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_VIDEO_REPLAY_24;
        }
    };
    public static final IconDto ICON_VIDEO_REWIND_15_32 = new IconDto("ICON_VIDEO_REWIND_15_32", 507) { // from class: rh_server_driven_ui.v1.IconDto.ICON_VIDEO_REWIND_15_32
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_VIDEO_REWIND_15_32;
        }
    };
    public static final IconDto ICON_VIDEO_REWIND_24 = new IconDto("ICON_VIDEO_REWIND_24", 508) { // from class: rh_server_driven_ui.v1.IconDto.ICON_VIDEO_REWIND_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_VIDEO_REWIND_24;
        }
    };
    public static final IconDto ICON_VIDEO_SKIP_15_32 = new IconDto("ICON_VIDEO_SKIP_15_32", 509) { // from class: rh_server_driven_ui.v1.IconDto.ICON_VIDEO_SKIP_15_32
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_VIDEO_SKIP_15_32;
        }
    };
    public static final IconDto ICON_WALLET_24 = new IconDto("ICON_WALLET_24", 510) { // from class: rh_server_driven_ui.v1.IconDto.ICON_WALLET_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_WALLET_24;
        }
    };
    public static final IconDto ICON_WALLET_32 = new IconDto("ICON_WALLET_32", 511) { // from class: rh_server_driven_ui.v1.IconDto.ICON_WALLET_32
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_WALLET_32;
        }
    };
    public static final IconDto ICON_WALLETCONNECT_16 = new IconDto("ICON_WALLETCONNECT_16", 512) { // from class: rh_server_driven_ui.v1.IconDto.ICON_WALLETCONNECT_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_WALLETCONNECT_16;
        }
    };
    public static final IconDto ICON_WALLETCONNECT_24 = new IconDto("ICON_WALLETCONNECT_24", 513) { // from class: rh_server_driven_ui.v1.IconDto.ICON_WALLETCONNECT_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_WALLETCONNECT_24;
        }
    };
    public static final IconDto ICON_WC_SCAN_24 = new IconDto("ICON_WC_SCAN_24", 514) { // from class: rh_server_driven_ui.v1.IconDto.ICON_WC_SCAN_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_WC_SCAN_24;
        }
    };
    public static final IconDto ICON_WITHDRAW_16 = new IconDto("ICON_WITHDRAW_16", 515) { // from class: rh_server_driven_ui.v1.IconDto.ICON_WITHDRAW_16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_WITHDRAW_16;
        }
    };
    public static final IconDto ICON_WITHDRAW_24 = new IconDto("ICON_WITHDRAW_24", WaitlistAnimationConstants.RIGHT_YAW_END) { // from class: rh_server_driven_ui.v1.IconDto.ICON_WITHDRAW_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_WITHDRAW_24;
        }
    };
    public static final IconDto ICON_ZOOM_IN_24 = new IconDto("ICON_ZOOM_IN_24", 517) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ZOOM_IN_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ZOOM_IN_24;
        }
    };
    public static final IconDto ICON_ZOOM_OUT_24 = new IconDto("ICON_ZOOM_OUT_24", 518) { // from class: rh_server_driven_ui.v1.IconDto.ICON_ZOOM_OUT_24
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Icon toProto() {
            return Icon.ICON_ZOOM_OUT_24;
        }
    };

    private static final /* synthetic */ IconDto[] $values() {
        return new IconDto[]{ICON_UNSPECIFIED, ICON_ACCOUNT_SUMMARY_12, ICON_ACCOUNT_SUMMARY_24, ICON_ACTION_REMOVE_24, ICON_ACTIONS_ALERTS_32, ICON_ACTIONS_ATM_32, ICON_ACTIONS_CHECK_32, ICON_ACTIONS_STATEMENTS_32, ICON_ACTIONS_TRANSFERS_32, ICON_AGENT_16, ICON_AGENT_24, ICON_ALERT_12, ICON_ALERT_16, ICON_ALERT_24, ICON_ALERT_FILLED_12, ICON_ALERT_FILLED_16, ICON_ALERT_FILLED_24, ICON_ALL_DAY_TRADING_12, ICON_ALL_DAY_TRADING_16, ICON_ALL_DAY_TRADING_24, ICON_ANNOUNCEMENT_12, ICON_ANNOUNCEMENT_16, ICON_ANNOUNCEMENT_24, ICON_ARCHIVE_24, ICON_ARROW_DIAGONAL_UP_16, ICON_ARROW_DOWN_12, ICON_ARROW_DOWN_16, ICON_ARROW_DOWN_24, ICON_ARROW_DOWN_FILL_12, ICON_ARROW_DOWN_FILL_16, ICON_ARROW_DOWN_FILL_24, ICON_ARROW_DOWN_RIGHT_12, ICON_ARROW_LEFT_12, ICON_ARROW_LEFT_16, ICON_ARROW_LEFT_24, ICON_ARROW_LEFT_FILL_12, ICON_ARROW_LEFT_FILL_16, ICON_ARROW_LEFT_FILL_24, ICON_ARROW_RIGHT_12, ICON_ARROW_RIGHT_16, ICON_ARROW_RIGHT_24, ICON_ARROW_RIGHT_FILL_12, ICON_ARROW_RIGHT_FILL_16, ICON_ARROW_RIGHT_FILL_24, ICON_ARROW_UP_12, ICON_ARROW_UP_16, ICON_ARROW_UP_24, ICON_ARROW_UP_FILL_12, ICON_ARROW_UP_FILL_16, ICON_ARROW_UP_FILL_24, ICON_ARROW_UP_RIGHT_12, ICON_ARROW_UP_RIGHT_16, ICON_ATTACH_24, ICON_BACKSPACE_24, ICON_BACKSPACE_32, ICON_BANKING_16, ICON_BANKING_24, ICON_BANKING_32, ICON_BAR_CHART_16, ICON_BAR_CHART_24, ICON_BOOKMARK_POST_FILLED_16, ICON_BOOKMARK_POST_OUTLINE_16, ICON_BUBBLE_CHECKED_12, ICON_BUBBLE_CHECKED_16, ICON_BUBBLE_CHECKED_24, ICON_BUBBLE_DOT_24, ICON_BUBBLE_EMPTY_24, ICON_BUBBLE_MINUS_16, ICON_BUBBLE_MINUS_24, ICON_BUBBLE_PAUSE_24, ICON_BUBBLE_PLUS_16, ICON_BUBBLE_PLUS_24, ICON_BUBBLE_PLUS_FILLED_24, ICON_BUBBLE_RADIO_BUTTON_24, ICON_BUBBLE_REMOVE_16, ICON_BUBBLE_REMOVE_24, ICON_BUBBLE_REMOVE_FILLED_16, ICON_BUBBLE_REMOVE_FILLED_24, ICON_BUBBLE_REVERSE_24, ICON_BUBBLE_UK_POUNDS_16, ICON_BUBBLE_UK_POUNDS_24, ICON_BUBBLE_UK_POUNDS_FILLED_16, ICON_BUBBLE_UK_POUNDS_FILLED_24, ICON_BUILDER_16, ICON_BUILDER_24, ICON_CALENDAR_12, ICON_CALENDAR_16, ICON_CALENDAR_24, ICON_CAMERA_16, ICON_CAMERA_24, ICON_CARET_DOWN_12, ICON_CARET_DOWN_16, ICON_CARET_DOWN_24, ICON_CARET_LEFT_12, ICON_CARET_LEFT_16, ICON_CARET_LEFT_24, ICON_CARET_RIGHT_12, ICON_CARET_RIGHT_16, ICON_CARET_RIGHT_24, ICON_CARET_UP_12, ICON_CARET_UP_16, ICON_CARET_UP_24, ICON_CASH_24, ICON_CHART_16, ICON_CHART_24, ICON_CHART_BAR_24, ICON_CHART_CANDLESTICKS_16, ICON_CHART_CANDLESTICKS_24, ICON_CHART_LINE_16, ICON_CHART_LINE_24, ICON_CHART_STACKED_BAR_16, ICON_CHAT_16, ICON_CHAT_24, ICON_CHATBOT_16, ICON_CHATBOT_24, ICON_CHECKBOX_EMPTY_16, ICON_CHECKBOX_EMPTY_24, ICON_CHECKBOX_FILLED_16, ICON_CHECKBOX_FILLED_24, ICON_CHECKMARK_12, ICON_CHECKMARK_16, ICON_CHECKMARK_24, ICON_CLIPBOARD_16, ICON_CLIPBOARD_24, ICON_CLOCK_12, ICON_CLOCK_16, ICON_CLOCK_24, ICON_CLOSE_12, ICON_CLOSE_16, ICON_CLOSE_24, ICON_CLOUD_16, ICON_CLOUD_24, ICON_COLLAPSE_16, ICON_COLLAPSE_24, ICON_COMMENT_FILLED_16, ICON_COMMENT_FILLED_20, ICON_COMMENT_OUTLINE_16, ICON_COMMENT_OUTLINE_20, ICON_CONCIERGE_24, ICON_CONSUMER_GOODS_12, ICON_CONSUMER_GOODS_16, ICON_CONSUMER_GOODS_24, ICON_CONTROLS_16, ICON_CONTROLS_24, ICON_CONVERSATION_16, ICON_CONVERSATION_24, ICON_CONVERT_24, ICON_COPY_12, ICON_COPY_16, ICON_COPY_24, ICON_COPY_TRADE_FILLED_16, ICON_COPY_TRADE_OUTLINE_16, ICON_CORN_FUTURES_24, ICON_CORPORATE_16, ICON_CORPORATE_24, ICON_CORTEX_12, ICON_CORTEX_16, ICON_CORTEX_24, ICON_CRYPTO_12, ICON_CRYPTO_16, ICON_CRYPTO_24, ICON_CRYPTO_C_12, ICON_CRYPTO_C_16, ICON_CRYPTO_C_24, ICON_CUSTODIAL_16, ICON_CUSTODIAL_24, ICON_DEPOSIT_16, ICON_DEPOSIT_24, ICON_DINING_24, ICON_DISCLOSURES_16, ICON_DISCLOSURES_24, ICON_DIVIDEND_16, ICON_DIVIDEND_24, ICON_DOCUMENTS_24, ICON_DOLLAR_SIGN_12, ICON_DOLLAR_SIGN_16, ICON_DOLLAR_SIGN_24, ICON_DOT_12, ICON_DOT_16, ICON_DOT_24, ICON_DOTS_16, ICON_DOTS_24, ICON_DOTS_ANDROID_16, ICON_DOTS_ANDROID_24, ICON_DOWNLOAD_12, ICON_DOWNLOAD_16, ICON_DOWNLOAD_24, ICON_DRAG_12, ICON_DRAG_16, ICON_DRAG_24, ICON_DROPDOWN_12, ICON_DROPDOWN_16, ICON_DROPDOWN_24, ICON_ECONOMIC_MOAT_24, ICON_EDIT_12, ICON_EDIT_16, ICON_EDIT_24, ICON_EDIT_SURFACE_24, ICON_EMAIL_FILLED_16, ICON_EMAIL_FILLED_24, ICON_EMAIL_OUTLINE_24, ICON_ENERGY_12, ICON_ENERGY_24, ICON_ENTERTAINMENT_24, ICON_ETF_12, ICON_ETF_24, ICON_EURO_SIGN_12, ICON_EURO_SIGN_16, ICON_EURO_SIGN_24, ICON_EXCLAMATION_12, ICON_EXCLAMATION_16, ICON_EXCLAMATION_24, ICON_EXPAND_16, ICON_EXPAND_24, ICON_EYE_16, ICON_EYE_24, ICON_EYE_CLOSED_16, ICON_EYE_CLOSED_24, ICON_FACE_ID_ANDROID_16, ICON_FACE_ID_ANDROID_24, ICON_FACE_ID_IOS_16, ICON_FACE_ID_IOS_24, ICON_FAIR_VALUE_24, ICON_FEATURED_16, ICON_FEATURED_24, ICON_FILTER_12, ICON_FILTER_16, ICON_FILTER_24, ICON_FINANCE_12, ICON_FINANCE_16, ICON_FINANCE_24, ICON_FLASH_OFF_24, ICON_FLASH_ON_24, ICON_FLASHLIGHT_OFF_24, ICON_FLASHLIGHT_ON_24, ICON_FLOWER_16, ICON_FOLDER_16, ICON_FOLDER_24, ICON_FULLSCREEN_ENTER_24, ICON_FULLSCREEN_EXIT_24, ICON_GIFT_12, ICON_GIFT_16, ICON_GIFT_24, ICON_GOLD_16, ICON_GOLD_24, ICON_GROCERIES_24, ICON_HAMBURGER_12, ICON_HAMBURGER_16, ICON_HAMBURGER_24, ICON_HEALTHCARE_12, ICON_HEALTHCARE_24, ICON_HELP_24, ICON_HISTORY_16, ICON_HISTORY_24, ICON_HOME_24, ICON_HOSPITALITY_12, ICON_HOSPITALITY_24, ICON_HOURGLASS_12, ICON_HOURGLASS_16, ICON_HOURGLASS_24, ICON_ICLOUD_RESTORE_16, ICON_ICLOUD_RESTORE_24, ICON_IMAGE_16, ICON_IMAGE_24, ICON_IMAGE_FAIL_16, ICON_IMAGE_FAIL_24, ICON_INFO_12, ICON_INFO_16, ICON_INFO_24, ICON_INFO_FILLED_12, ICON_INFO_FILLED_16, ICON_INFO_FILLED_24, ICON_ISA_16, ICON_ISA_24, ICON_JOINT_ACCOUNT_12, ICON_JOINT_ACCOUNT_16, ICON_JOINT_ACCOUNT_24, ICON_L2_HEADER_ARROW_24, ICON_LIGHTBULB_16, ICON_LIGHTBULB_24, ICON_LIGHTNING_12, ICON_LIGHTNING_16, ICON_LIGHTNING_24, ICON_LIGHTNING_OFF_16, ICON_LIKE_POST_FILLED_16, ICON_LIKE_POST_FILLED_20, ICON_LIKE_POST_OUTLINE_16, ICON_LIKE_POST_OUTLINE_20, ICON_LIKE_POST_OUTLINE_24, ICON_LINK_16, ICON_LINK_24, ICON_LINK_OUT_12, ICON_LINK_OUT_16, ICON_LINK_OUT_24, ICON_LIST_24, ICON_LOCATION_FILL_16, ICON_LOCATION_FILL_24, ICON_LOCATION_OUTLINE_24, ICON_LOCK_12, ICON_LOCK_16, ICON_LOCK_24, ICON_LOG_OUT_24, ICON_MANAGED_ACCOUNTS_16, ICON_MANAGED_ACCOUNTS_24, ICON_MANAGED_INDIVIDUAL_24, ICON_MANAGED_JOINT_24, ICON_MANAGED_RETIREMENT_24, ICON_MANUFACTURING_12, ICON_MANUFACTURING_24, ICON_MAPS_24, ICON_MARGIN_12, ICON_MARGIN_16, ICON_MARGIN_24, ICON_MAXIMUM_16, ICON_MESSAGE_SEND_16, ICON_MESSAGE_SEND_24, ICON_MINIMUM_16, ICON_MINUS_12, ICON_MINUS_16, ICON_MINUS_24, ICON_MORE_MENU_16, ICON_MORE_MENU_20, ICON_NEWS_16, ICON_NEWS_24, ICON_NO_VALUE_24, ICON_NO_VALUE_32, ICON_NOTIFICATION_12, ICON_NOTIFICATION_16, ICON_NOTIFICATION_24, ICON_NOTIFICATION_32, ICON_NOTIFICATION_ADD_16, ICON_NOTIFICATION_ADD_24, ICON_NOTIFICATION_CHECK_16, ICON_NOTIFICATION_CHECK_24, ICON_NUMPAD_DOWN_24, ICON_NUMPAD_UP_24, ICON_ONLINE_16, ICON_ONLINE_24, ICON_OPTIONS_DOWN_24, ICON_OPTIONS_FLAT_24, ICON_OPTIONS_UP_24, ICON_OPTIONS_VOLATILE_24, ICON_ORDER_16, ICON_ORDER_24, ICON_PAUSE_HERO_40, ICON_PAUSE_INLINE_24, ICON_PAYCHECK_24, ICON_PAYMENT_12, ICON_PAYMENT_16, ICON_PAYMENT_24, ICON_PAYMENT_32, ICON_PERCENT_SIGN_12, ICON_PERCENT_SIGN_16, ICON_PERCENT_SIGN_24, ICON_PERPETUAL_FUTURES_32, ICON_PERSON_12, ICON_PERSON_16, ICON_PERSON_24, ICON_PHONE_16, ICON_PHONE_24, ICON_PHONE_CONNECTED_16, ICON_PHONE_MISSED_CALL_16, ICON_PHONE_WAITING_16, ICON_PICTURE_IN_PICTURE_24, ICON_PIE_CHART_16, ICON_PIE_CHART_24, ICON_PIN_16, ICON_PIN_24, ICON_PLAY_HERO_40, ICON_PLAY_INLINE_16, ICON_PLAY_INLINE_24, ICON_PLUS_12, ICON_PLUS_16, ICON_PLUS_24, ICON_POP_OUT_16, ICON_POP_OUT_24, ICON_PRINT_24, ICON_QR_16, ICON_QR_24, ICON_QR_SCAN_24, ICON_QUANTITY_16, ICON_QUANTITY_24, ICON_QUESTION_12, ICON_QUESTION_16, ICON_QUESTION_24, ICON_QUESTION_FILLED_12, ICON_QUESTION_FILLED_16, ICON_QUESTION_FILLED_24, ICON_RECURRING_12, ICON_RECURRING_16, ICON_RECURRING_24, ICON_RECURRING_HUB_24, ICON_REPEAT_16, ICON_REPLAY_HERO_40, ICON_RESEND_16, ICON_RESEND_24, ICON_RETIREMENT_12, ICON_RETIREMENT_16, ICON_RETIREMENT_24, ICON_RETIREMENT_32, ICON_RHW_BROWSER_TAB_24, ICON_RHW_CHART_TAB_24, ICON_RHW_SEARCH_TAB_24, ICON_RISK_AND_UNCERTAINTY_24, ICON_ROBINHOOD_12, ICON_ROBINHOOD_16, ICON_ROBINHOOD_24, ICON_ROLLING_POSITION_12, ICON_ROLLING_POSITION_16, ICON_ROLLING_POSITION_24, ICON_SCAN_16, ICON_SCAN_24, ICON_SEARCH_16, ICON_SEARCH_24, ICON_SETTINGS_12, ICON_SETTINGS_16, ICON_SETTINGS_24, ICON_SHARE_ANDROID_16, ICON_SHARE_ANDROID_24, ICON_SHARE_IOS_16, ICON_SHARE_IOS_24, ICON_SMILEY_24, ICON_SOCIAL_CREATE_POST_16, ICON_SORT_12, ICON_SOUND_OFF_24, ICON_SOUND_ON_24, ICON_SPARKLE_BULLET_12, ICON_SPARKLE_BULLET_16, ICON_SPARKLE_BULLET_24, ICON_SPARKLE_DOUBLE_16, ICON_SPARKLE_DOUBLE_24, ICON_SPEED_DOWN_24, ICON_SPEED_UP_24, ICON_STAR_FILLED_12, ICON_STAR_FILLED_16, ICON_STAR_FILLED_24, ICON_STAR_OUTLINE_16, ICON_STAR_OUTLINE_24, ICON_STAR_PASSWORD_16, ICON_STEWARDSHIP_24, ICON_STOCK_DOWN_12, ICON_STOCK_DOWN_16, ICON_STOCK_DOWN_24, ICON_STOCK_UP_12, ICON_STOCK_UP_16, ICON_STOCK_UP_24, ICON_STOPWATCH_16, ICON_STOPWATCH_24, ICON_STOPWATCH_32, ICON_STRATEGY_OUTLOOK_24, ICON_SWIPE_DOWN_16, ICON_SWIPE_DOWN_24, ICON_SWIPE_UP_16, ICON_SWIPE_UP_24, ICON_SWITCH_16, ICON_SWITCH_24, ICON_TAB_ACCOUNT_32, ICON_TAB_CONTENT_32, ICON_TAB_CRYPTO_32, ICON_TAB_CRYPTO_C_32, ICON_TAB_GOLD_32, ICON_TAB_INVEST_32, ICON_TAB_ISA_32, ICON_TAB_MESSAGES_32, ICON_TAB_MONEY_32, ICON_TAB_RETIREMENT_32, ICON_TAB_SEARCH_32, ICON_TAB_SOCIAL_32, ICON_TAB_WATCHLIST_32, ICON_TAG_16, ICON_TAG_24, ICON_TAX_LOTS_LONG_TERM_16, ICON_TAX_LOTS_SHORT_TERM_16, ICON_TECHNOLOGY_12, ICON_TECHNOLOGY_24, ICON_THUMBPRINT_16, ICON_THUMBPRINT_24, ICON_THUMBS_DOWN_16, ICON_THUMBS_DOWN_24, ICON_THUMBS_UP_16, ICON_THUMBS_UP_24, ICON_TICKET_16, ICON_TICKET_24, ICON_TOUCH_ID_ANDROID_16, ICON_TOUCH_ID_ANDROID_24, ICON_TRADE_SOCIAL_FILLED_20, ICON_TRADE_SOCIAL_OUTLINE_20, ICON_TRANSFERS_12, ICON_TRANSFERS_16, ICON_TRANSFERS_24, ICON_TRANSPORT_24, ICON_TRASH_12, ICON_TRASH_16, ICON_TRASH_24, ICON_TRIANGLE_ALERT_16, ICON_TRIANGLE_ALERT_24, ICON_TUNER_16, ICON_TUNER_24, ICON_UNLOCK_12, ICON_UNLOCK_16, ICON_UNLOCK_24, ICON_UPLOAD_24, ICON_VIDEO_CALL_12, ICON_VIDEO_CALL_16, ICON_VIDEO_CALL_24, ICON_VIDEO_FAST_FORWARD_24, ICON_VIDEO_REPLAY_24, ICON_VIDEO_REWIND_15_32, ICON_VIDEO_REWIND_24, ICON_VIDEO_SKIP_15_32, ICON_WALLET_24, ICON_WALLET_32, ICON_WALLETCONNECT_16, ICON_WALLETCONNECT_24, ICON_WC_SCAN_24, ICON_WITHDRAW_16, ICON_WITHDRAW_24, ICON_ZOOM_IN_24, ICON_ZOOM_OUT_24};
    }

    public /* synthetic */ IconDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<IconDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private IconDto(String str, int i) {
    }

    static {
        IconDto[] iconDtoArr$values = $values();
        $VALUES = iconDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(iconDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.IconDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IconDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: IconDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/IconDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrh_server_driven_ui/v1/IconDto;", "Lrh_server_driven_ui/v1/Icon;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/IconDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<IconDto, Icon> {

        /* compiled from: IconDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Icon.values().length];
                try {
                    iArr[Icon.ICON_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Icon.ICON_ACCOUNT_SUMMARY_12.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Icon.ICON_ACCOUNT_SUMMARY_24.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Icon.ICON_ACTION_REMOVE_24.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Icon.ICON_ACTIONS_ALERTS_32.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Icon.ICON_ACTIONS_ATM_32.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Icon.ICON_ACTIONS_CHECK_32.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[Icon.ICON_ACTIONS_STATEMENTS_32.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[Icon.ICON_ACTIONS_TRANSFERS_32.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[Icon.ICON_AGENT_16.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[Icon.ICON_AGENT_24.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[Icon.ICON_ALERT_12.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[Icon.ICON_ALERT_16.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[Icon.ICON_ALERT_24.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[Icon.ICON_ALERT_FILLED_12.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[Icon.ICON_ALERT_FILLED_16.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[Icon.ICON_ALERT_FILLED_24.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[Icon.ICON_ALL_DAY_TRADING_12.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[Icon.ICON_ALL_DAY_TRADING_16.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[Icon.ICON_ALL_DAY_TRADING_24.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[Icon.ICON_ANNOUNCEMENT_12.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[Icon.ICON_ANNOUNCEMENT_16.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[Icon.ICON_ANNOUNCEMENT_24.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[Icon.ICON_ARCHIVE_24.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[Icon.ICON_ARROW_DIAGONAL_UP_16.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[Icon.ICON_ARROW_DOWN_12.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[Icon.ICON_ARROW_DOWN_16.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[Icon.ICON_ARROW_DOWN_24.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[Icon.ICON_ARROW_DOWN_FILL_12.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[Icon.ICON_ARROW_DOWN_FILL_16.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[Icon.ICON_ARROW_DOWN_FILL_24.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[Icon.ICON_ARROW_DOWN_RIGHT_12.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[Icon.ICON_ARROW_LEFT_12.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[Icon.ICON_ARROW_LEFT_16.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[Icon.ICON_ARROW_LEFT_24.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[Icon.ICON_ARROW_LEFT_FILL_12.ordinal()] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[Icon.ICON_ARROW_LEFT_FILL_16.ordinal()] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr[Icon.ICON_ARROW_LEFT_FILL_24.ordinal()] = 38;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr[Icon.ICON_ARROW_RIGHT_12.ordinal()] = 39;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr[Icon.ICON_ARROW_RIGHT_16.ordinal()] = 40;
                } catch (NoSuchFieldError unused40) {
                }
                try {
                    iArr[Icon.ICON_ARROW_RIGHT_24.ordinal()] = 41;
                } catch (NoSuchFieldError unused41) {
                }
                try {
                    iArr[Icon.ICON_ARROW_RIGHT_FILL_12.ordinal()] = 42;
                } catch (NoSuchFieldError unused42) {
                }
                try {
                    iArr[Icon.ICON_ARROW_RIGHT_FILL_16.ordinal()] = 43;
                } catch (NoSuchFieldError unused43) {
                }
                try {
                    iArr[Icon.ICON_ARROW_RIGHT_FILL_24.ordinal()] = 44;
                } catch (NoSuchFieldError unused44) {
                }
                try {
                    iArr[Icon.ICON_ARROW_UP_12.ordinal()] = 45;
                } catch (NoSuchFieldError unused45) {
                }
                try {
                    iArr[Icon.ICON_ARROW_UP_16.ordinal()] = 46;
                } catch (NoSuchFieldError unused46) {
                }
                try {
                    iArr[Icon.ICON_ARROW_UP_24.ordinal()] = 47;
                } catch (NoSuchFieldError unused47) {
                }
                try {
                    iArr[Icon.ICON_ARROW_UP_FILL_12.ordinal()] = 48;
                } catch (NoSuchFieldError unused48) {
                }
                try {
                    iArr[Icon.ICON_ARROW_UP_FILL_16.ordinal()] = 49;
                } catch (NoSuchFieldError unused49) {
                }
                try {
                    iArr[Icon.ICON_ARROW_UP_FILL_24.ordinal()] = 50;
                } catch (NoSuchFieldError unused50) {
                }
                try {
                    iArr[Icon.ICON_ARROW_UP_RIGHT_12.ordinal()] = 51;
                } catch (NoSuchFieldError unused51) {
                }
                try {
                    iArr[Icon.ICON_ARROW_UP_RIGHT_16.ordinal()] = 52;
                } catch (NoSuchFieldError unused52) {
                }
                try {
                    iArr[Icon.ICON_ATTACH_24.ordinal()] = 53;
                } catch (NoSuchFieldError unused53) {
                }
                try {
                    iArr[Icon.ICON_BACKSPACE_24.ordinal()] = 54;
                } catch (NoSuchFieldError unused54) {
                }
                try {
                    iArr[Icon.ICON_BACKSPACE_32.ordinal()] = 55;
                } catch (NoSuchFieldError unused55) {
                }
                try {
                    iArr[Icon.ICON_BANKING_16.ordinal()] = 56;
                } catch (NoSuchFieldError unused56) {
                }
                try {
                    iArr[Icon.ICON_BANKING_24.ordinal()] = 57;
                } catch (NoSuchFieldError unused57) {
                }
                try {
                    iArr[Icon.ICON_BANKING_32.ordinal()] = 58;
                } catch (NoSuchFieldError unused58) {
                }
                try {
                    iArr[Icon.ICON_BAR_CHART_16.ordinal()] = 59;
                } catch (NoSuchFieldError unused59) {
                }
                try {
                    iArr[Icon.ICON_BAR_CHART_24.ordinal()] = 60;
                } catch (NoSuchFieldError unused60) {
                }
                try {
                    iArr[Icon.ICON_BOOKMARK_POST_FILLED_16.ordinal()] = 61;
                } catch (NoSuchFieldError unused61) {
                }
                try {
                    iArr[Icon.ICON_BOOKMARK_POST_OUTLINE_16.ordinal()] = 62;
                } catch (NoSuchFieldError unused62) {
                }
                try {
                    iArr[Icon.ICON_BUBBLE_CHECKED_12.ordinal()] = 63;
                } catch (NoSuchFieldError unused63) {
                }
                try {
                    iArr[Icon.ICON_BUBBLE_CHECKED_16.ordinal()] = 64;
                } catch (NoSuchFieldError unused64) {
                }
                try {
                    iArr[Icon.ICON_BUBBLE_CHECKED_24.ordinal()] = 65;
                } catch (NoSuchFieldError unused65) {
                }
                try {
                    iArr[Icon.ICON_BUBBLE_DOT_24.ordinal()] = 66;
                } catch (NoSuchFieldError unused66) {
                }
                try {
                    iArr[Icon.ICON_BUBBLE_EMPTY_24.ordinal()] = 67;
                } catch (NoSuchFieldError unused67) {
                }
                try {
                    iArr[Icon.ICON_BUBBLE_MINUS_16.ordinal()] = 68;
                } catch (NoSuchFieldError unused68) {
                }
                try {
                    iArr[Icon.ICON_BUBBLE_MINUS_24.ordinal()] = 69;
                } catch (NoSuchFieldError unused69) {
                }
                try {
                    iArr[Icon.ICON_BUBBLE_PAUSE_24.ordinal()] = 70;
                } catch (NoSuchFieldError unused70) {
                }
                try {
                    iArr[Icon.ICON_BUBBLE_PLUS_16.ordinal()] = 71;
                } catch (NoSuchFieldError unused71) {
                }
                try {
                    iArr[Icon.ICON_BUBBLE_PLUS_24.ordinal()] = 72;
                } catch (NoSuchFieldError unused72) {
                }
                try {
                    iArr[Icon.ICON_BUBBLE_PLUS_FILLED_24.ordinal()] = 73;
                } catch (NoSuchFieldError unused73) {
                }
                try {
                    iArr[Icon.ICON_BUBBLE_RADIO_BUTTON_24.ordinal()] = 74;
                } catch (NoSuchFieldError unused74) {
                }
                try {
                    iArr[Icon.ICON_BUBBLE_REMOVE_16.ordinal()] = 75;
                } catch (NoSuchFieldError unused75) {
                }
                try {
                    iArr[Icon.ICON_BUBBLE_REMOVE_24.ordinal()] = 76;
                } catch (NoSuchFieldError unused76) {
                }
                try {
                    iArr[Icon.ICON_BUBBLE_REMOVE_FILLED_16.ordinal()] = 77;
                } catch (NoSuchFieldError unused77) {
                }
                try {
                    iArr[Icon.ICON_BUBBLE_REMOVE_FILLED_24.ordinal()] = 78;
                } catch (NoSuchFieldError unused78) {
                }
                try {
                    iArr[Icon.ICON_BUBBLE_REVERSE_24.ordinal()] = 79;
                } catch (NoSuchFieldError unused79) {
                }
                try {
                    iArr[Icon.ICON_BUBBLE_UK_POUNDS_16.ordinal()] = 80;
                } catch (NoSuchFieldError unused80) {
                }
                try {
                    iArr[Icon.ICON_BUBBLE_UK_POUNDS_24.ordinal()] = 81;
                } catch (NoSuchFieldError unused81) {
                }
                try {
                    iArr[Icon.ICON_BUBBLE_UK_POUNDS_FILLED_16.ordinal()] = 82;
                } catch (NoSuchFieldError unused82) {
                }
                try {
                    iArr[Icon.ICON_BUBBLE_UK_POUNDS_FILLED_24.ordinal()] = 83;
                } catch (NoSuchFieldError unused83) {
                }
                try {
                    iArr[Icon.ICON_BUILDER_16.ordinal()] = 84;
                } catch (NoSuchFieldError unused84) {
                }
                try {
                    iArr[Icon.ICON_BUILDER_24.ordinal()] = 85;
                } catch (NoSuchFieldError unused85) {
                }
                try {
                    iArr[Icon.ICON_CALENDAR_12.ordinal()] = 86;
                } catch (NoSuchFieldError unused86) {
                }
                try {
                    iArr[Icon.ICON_CALENDAR_16.ordinal()] = 87;
                } catch (NoSuchFieldError unused87) {
                }
                try {
                    iArr[Icon.ICON_CALENDAR_24.ordinal()] = 88;
                } catch (NoSuchFieldError unused88) {
                }
                try {
                    iArr[Icon.ICON_CAMERA_16.ordinal()] = 89;
                } catch (NoSuchFieldError unused89) {
                }
                try {
                    iArr[Icon.ICON_CAMERA_24.ordinal()] = 90;
                } catch (NoSuchFieldError unused90) {
                }
                try {
                    iArr[Icon.ICON_CARET_DOWN_12.ordinal()] = 91;
                } catch (NoSuchFieldError unused91) {
                }
                try {
                    iArr[Icon.ICON_CARET_DOWN_16.ordinal()] = 92;
                } catch (NoSuchFieldError unused92) {
                }
                try {
                    iArr[Icon.ICON_CARET_DOWN_24.ordinal()] = 93;
                } catch (NoSuchFieldError unused93) {
                }
                try {
                    iArr[Icon.ICON_CARET_LEFT_12.ordinal()] = 94;
                } catch (NoSuchFieldError unused94) {
                }
                try {
                    iArr[Icon.ICON_CARET_LEFT_16.ordinal()] = 95;
                } catch (NoSuchFieldError unused95) {
                }
                try {
                    iArr[Icon.ICON_CARET_LEFT_24.ordinal()] = 96;
                } catch (NoSuchFieldError unused96) {
                }
                try {
                    iArr[Icon.ICON_CARET_RIGHT_12.ordinal()] = 97;
                } catch (NoSuchFieldError unused97) {
                }
                try {
                    iArr[Icon.ICON_CARET_RIGHT_16.ordinal()] = 98;
                } catch (NoSuchFieldError unused98) {
                }
                try {
                    iArr[Icon.ICON_CARET_RIGHT_24.ordinal()] = 99;
                } catch (NoSuchFieldError unused99) {
                }
                try {
                    iArr[Icon.ICON_CARET_UP_12.ordinal()] = 100;
                } catch (NoSuchFieldError unused100) {
                }
                try {
                    iArr[Icon.ICON_CARET_UP_16.ordinal()] = 101;
                } catch (NoSuchFieldError unused101) {
                }
                try {
                    iArr[Icon.ICON_CARET_UP_24.ordinal()] = 102;
                } catch (NoSuchFieldError unused102) {
                }
                try {
                    iArr[Icon.ICON_CASH_24.ordinal()] = 103;
                } catch (NoSuchFieldError unused103) {
                }
                try {
                    iArr[Icon.ICON_CHART_16.ordinal()] = 104;
                } catch (NoSuchFieldError unused104) {
                }
                try {
                    iArr[Icon.ICON_CHART_24.ordinal()] = 105;
                } catch (NoSuchFieldError unused105) {
                }
                try {
                    iArr[Icon.ICON_CHART_BAR_24.ordinal()] = 106;
                } catch (NoSuchFieldError unused106) {
                }
                try {
                    iArr[Icon.ICON_CHART_CANDLESTICKS_16.ordinal()] = 107;
                } catch (NoSuchFieldError unused107) {
                }
                try {
                    iArr[Icon.ICON_CHART_CANDLESTICKS_24.ordinal()] = 108;
                } catch (NoSuchFieldError unused108) {
                }
                try {
                    iArr[Icon.ICON_CHART_LINE_16.ordinal()] = 109;
                } catch (NoSuchFieldError unused109) {
                }
                try {
                    iArr[Icon.ICON_CHART_LINE_24.ordinal()] = 110;
                } catch (NoSuchFieldError unused110) {
                }
                try {
                    iArr[Icon.ICON_CHART_STACKED_BAR_16.ordinal()] = 111;
                } catch (NoSuchFieldError unused111) {
                }
                try {
                    iArr[Icon.ICON_CHAT_16.ordinal()] = 112;
                } catch (NoSuchFieldError unused112) {
                }
                try {
                    iArr[Icon.ICON_CHAT_24.ordinal()] = 113;
                } catch (NoSuchFieldError unused113) {
                }
                try {
                    iArr[Icon.ICON_CHATBOT_16.ordinal()] = 114;
                } catch (NoSuchFieldError unused114) {
                }
                try {
                    iArr[Icon.ICON_CHATBOT_24.ordinal()] = 115;
                } catch (NoSuchFieldError unused115) {
                }
                try {
                    iArr[Icon.ICON_CHECKBOX_EMPTY_16.ordinal()] = 116;
                } catch (NoSuchFieldError unused116) {
                }
                try {
                    iArr[Icon.ICON_CHECKBOX_EMPTY_24.ordinal()] = 117;
                } catch (NoSuchFieldError unused117) {
                }
                try {
                    iArr[Icon.ICON_CHECKBOX_FILLED_16.ordinal()] = 118;
                } catch (NoSuchFieldError unused118) {
                }
                try {
                    iArr[Icon.ICON_CHECKBOX_FILLED_24.ordinal()] = 119;
                } catch (NoSuchFieldError unused119) {
                }
                try {
                    iArr[Icon.ICON_CHECKMARK_12.ordinal()] = 120;
                } catch (NoSuchFieldError unused120) {
                }
                try {
                    iArr[Icon.ICON_CHECKMARK_16.ordinal()] = 121;
                } catch (NoSuchFieldError unused121) {
                }
                try {
                    iArr[Icon.ICON_CHECKMARK_24.ordinal()] = 122;
                } catch (NoSuchFieldError unused122) {
                }
                try {
                    iArr[Icon.ICON_CLIPBOARD_16.ordinal()] = 123;
                } catch (NoSuchFieldError unused123) {
                }
                try {
                    iArr[Icon.ICON_CLIPBOARD_24.ordinal()] = 124;
                } catch (NoSuchFieldError unused124) {
                }
                try {
                    iArr[Icon.ICON_CLOCK_12.ordinal()] = 125;
                } catch (NoSuchFieldError unused125) {
                }
                try {
                    iArr[Icon.ICON_CLOCK_16.ordinal()] = 126;
                } catch (NoSuchFieldError unused126) {
                }
                try {
                    iArr[Icon.ICON_CLOCK_24.ordinal()] = 127;
                } catch (NoSuchFieldError unused127) {
                }
                try {
                    iArr[Icon.ICON_CLOSE_12.ordinal()] = 128;
                } catch (NoSuchFieldError unused128) {
                }
                try {
                    iArr[Icon.ICON_CLOSE_16.ordinal()] = 129;
                } catch (NoSuchFieldError unused129) {
                }
                try {
                    iArr[Icon.ICON_CLOSE_24.ordinal()] = 130;
                } catch (NoSuchFieldError unused130) {
                }
                try {
                    iArr[Icon.ICON_CLOUD_16.ordinal()] = 131;
                } catch (NoSuchFieldError unused131) {
                }
                try {
                    iArr[Icon.ICON_CLOUD_24.ordinal()] = 132;
                } catch (NoSuchFieldError unused132) {
                }
                try {
                    iArr[Icon.ICON_COLLAPSE_16.ordinal()] = 133;
                } catch (NoSuchFieldError unused133) {
                }
                try {
                    iArr[Icon.ICON_COLLAPSE_24.ordinal()] = 134;
                } catch (NoSuchFieldError unused134) {
                }
                try {
                    iArr[Icon.ICON_COMMENT_FILLED_16.ordinal()] = 135;
                } catch (NoSuchFieldError unused135) {
                }
                try {
                    iArr[Icon.ICON_COMMENT_FILLED_20.ordinal()] = 136;
                } catch (NoSuchFieldError unused136) {
                }
                try {
                    iArr[Icon.ICON_COMMENT_OUTLINE_16.ordinal()] = 137;
                } catch (NoSuchFieldError unused137) {
                }
                try {
                    iArr[Icon.ICON_COMMENT_OUTLINE_20.ordinal()] = 138;
                } catch (NoSuchFieldError unused138) {
                }
                try {
                    iArr[Icon.ICON_CONCIERGE_24.ordinal()] = 139;
                } catch (NoSuchFieldError unused139) {
                }
                try {
                    iArr[Icon.ICON_CONSUMER_GOODS_12.ordinal()] = 140;
                } catch (NoSuchFieldError unused140) {
                }
                try {
                    iArr[Icon.ICON_CONSUMER_GOODS_16.ordinal()] = 141;
                } catch (NoSuchFieldError unused141) {
                }
                try {
                    iArr[Icon.ICON_CONSUMER_GOODS_24.ordinal()] = 142;
                } catch (NoSuchFieldError unused142) {
                }
                try {
                    iArr[Icon.ICON_CONTROLS_16.ordinal()] = 143;
                } catch (NoSuchFieldError unused143) {
                }
                try {
                    iArr[Icon.ICON_CONTROLS_24.ordinal()] = 144;
                } catch (NoSuchFieldError unused144) {
                }
                try {
                    iArr[Icon.ICON_CONVERSATION_16.ordinal()] = 145;
                } catch (NoSuchFieldError unused145) {
                }
                try {
                    iArr[Icon.ICON_CONVERSATION_24.ordinal()] = 146;
                } catch (NoSuchFieldError unused146) {
                }
                try {
                    iArr[Icon.ICON_CONVERT_24.ordinal()] = 147;
                } catch (NoSuchFieldError unused147) {
                }
                try {
                    iArr[Icon.ICON_COPY_12.ordinal()] = 148;
                } catch (NoSuchFieldError unused148) {
                }
                try {
                    iArr[Icon.ICON_COPY_16.ordinal()] = 149;
                } catch (NoSuchFieldError unused149) {
                }
                try {
                    iArr[Icon.ICON_COPY_24.ordinal()] = 150;
                } catch (NoSuchFieldError unused150) {
                }
                try {
                    iArr[Icon.ICON_COPY_TRADE_FILLED_16.ordinal()] = 151;
                } catch (NoSuchFieldError unused151) {
                }
                try {
                    iArr[Icon.ICON_COPY_TRADE_OUTLINE_16.ordinal()] = 152;
                } catch (NoSuchFieldError unused152) {
                }
                try {
                    iArr[Icon.ICON_CORN_FUTURES_24.ordinal()] = 153;
                } catch (NoSuchFieldError unused153) {
                }
                try {
                    iArr[Icon.ICON_CORPORATE_16.ordinal()] = 154;
                } catch (NoSuchFieldError unused154) {
                }
                try {
                    iArr[Icon.ICON_CORPORATE_24.ordinal()] = 155;
                } catch (NoSuchFieldError unused155) {
                }
                try {
                    iArr[Icon.ICON_CORTEX_12.ordinal()] = 156;
                } catch (NoSuchFieldError unused156) {
                }
                try {
                    iArr[Icon.ICON_CORTEX_16.ordinal()] = 157;
                } catch (NoSuchFieldError unused157) {
                }
                try {
                    iArr[Icon.ICON_CORTEX_24.ordinal()] = 158;
                } catch (NoSuchFieldError unused158) {
                }
                try {
                    iArr[Icon.ICON_CRYPTO_12.ordinal()] = 159;
                } catch (NoSuchFieldError unused159) {
                }
                try {
                    iArr[Icon.ICON_CRYPTO_16.ordinal()] = 160;
                } catch (NoSuchFieldError unused160) {
                }
                try {
                    iArr[Icon.ICON_CRYPTO_24.ordinal()] = 161;
                } catch (NoSuchFieldError unused161) {
                }
                try {
                    iArr[Icon.ICON_CRYPTO_C_12.ordinal()] = 162;
                } catch (NoSuchFieldError unused162) {
                }
                try {
                    iArr[Icon.ICON_CRYPTO_C_16.ordinal()] = 163;
                } catch (NoSuchFieldError unused163) {
                }
                try {
                    iArr[Icon.ICON_CRYPTO_C_24.ordinal()] = 164;
                } catch (NoSuchFieldError unused164) {
                }
                try {
                    iArr[Icon.ICON_CUSTODIAL_16.ordinal()] = 165;
                } catch (NoSuchFieldError unused165) {
                }
                try {
                    iArr[Icon.ICON_CUSTODIAL_24.ordinal()] = 166;
                } catch (NoSuchFieldError unused166) {
                }
                try {
                    iArr[Icon.ICON_DEPOSIT_16.ordinal()] = 167;
                } catch (NoSuchFieldError unused167) {
                }
                try {
                    iArr[Icon.ICON_DEPOSIT_24.ordinal()] = 168;
                } catch (NoSuchFieldError unused168) {
                }
                try {
                    iArr[Icon.ICON_DINING_24.ordinal()] = 169;
                } catch (NoSuchFieldError unused169) {
                }
                try {
                    iArr[Icon.ICON_DISCLOSURES_16.ordinal()] = 170;
                } catch (NoSuchFieldError unused170) {
                }
                try {
                    iArr[Icon.ICON_DISCLOSURES_24.ordinal()] = 171;
                } catch (NoSuchFieldError unused171) {
                }
                try {
                    iArr[Icon.ICON_DIVIDEND_16.ordinal()] = 172;
                } catch (NoSuchFieldError unused172) {
                }
                try {
                    iArr[Icon.ICON_DIVIDEND_24.ordinal()] = 173;
                } catch (NoSuchFieldError unused173) {
                }
                try {
                    iArr[Icon.ICON_DOCUMENTS_24.ordinal()] = 174;
                } catch (NoSuchFieldError unused174) {
                }
                try {
                    iArr[Icon.ICON_DOLLAR_SIGN_12.ordinal()] = 175;
                } catch (NoSuchFieldError unused175) {
                }
                try {
                    iArr[Icon.ICON_DOLLAR_SIGN_16.ordinal()] = 176;
                } catch (NoSuchFieldError unused176) {
                }
                try {
                    iArr[Icon.ICON_DOLLAR_SIGN_24.ordinal()] = 177;
                } catch (NoSuchFieldError unused177) {
                }
                try {
                    iArr[Icon.ICON_DOT_12.ordinal()] = 178;
                } catch (NoSuchFieldError unused178) {
                }
                try {
                    iArr[Icon.ICON_DOT_16.ordinal()] = 179;
                } catch (NoSuchFieldError unused179) {
                }
                try {
                    iArr[Icon.ICON_DOT_24.ordinal()] = 180;
                } catch (NoSuchFieldError unused180) {
                }
                try {
                    iArr[Icon.ICON_DOTS_16.ordinal()] = 181;
                } catch (NoSuchFieldError unused181) {
                }
                try {
                    iArr[Icon.ICON_DOTS_24.ordinal()] = 182;
                } catch (NoSuchFieldError unused182) {
                }
                try {
                    iArr[Icon.ICON_DOTS_ANDROID_16.ordinal()] = 183;
                } catch (NoSuchFieldError unused183) {
                }
                try {
                    iArr[Icon.ICON_DOTS_ANDROID_24.ordinal()] = 184;
                } catch (NoSuchFieldError unused184) {
                }
                try {
                    iArr[Icon.ICON_DOWNLOAD_12.ordinal()] = 185;
                } catch (NoSuchFieldError unused185) {
                }
                try {
                    iArr[Icon.ICON_DOWNLOAD_16.ordinal()] = 186;
                } catch (NoSuchFieldError unused186) {
                }
                try {
                    iArr[Icon.ICON_DOWNLOAD_24.ordinal()] = 187;
                } catch (NoSuchFieldError unused187) {
                }
                try {
                    iArr[Icon.ICON_DRAG_12.ordinal()] = 188;
                } catch (NoSuchFieldError unused188) {
                }
                try {
                    iArr[Icon.ICON_DRAG_16.ordinal()] = 189;
                } catch (NoSuchFieldError unused189) {
                }
                try {
                    iArr[Icon.ICON_DRAG_24.ordinal()] = 190;
                } catch (NoSuchFieldError unused190) {
                }
                try {
                    iArr[Icon.ICON_DROPDOWN_12.ordinal()] = 191;
                } catch (NoSuchFieldError unused191) {
                }
                try {
                    iArr[Icon.ICON_DROPDOWN_16.ordinal()] = 192;
                } catch (NoSuchFieldError unused192) {
                }
                try {
                    iArr[Icon.ICON_DROPDOWN_24.ordinal()] = 193;
                } catch (NoSuchFieldError unused193) {
                }
                try {
                    iArr[Icon.ICON_ECONOMIC_MOAT_24.ordinal()] = 194;
                } catch (NoSuchFieldError unused194) {
                }
                try {
                    iArr[Icon.ICON_EDIT_12.ordinal()] = 195;
                } catch (NoSuchFieldError unused195) {
                }
                try {
                    iArr[Icon.ICON_EDIT_16.ordinal()] = 196;
                } catch (NoSuchFieldError unused196) {
                }
                try {
                    iArr[Icon.ICON_EDIT_24.ordinal()] = 197;
                } catch (NoSuchFieldError unused197) {
                }
                try {
                    iArr[Icon.ICON_EDIT_SURFACE_24.ordinal()] = 198;
                } catch (NoSuchFieldError unused198) {
                }
                try {
                    iArr[Icon.ICON_EMAIL_FILLED_16.ordinal()] = 199;
                } catch (NoSuchFieldError unused199) {
                }
                try {
                    iArr[Icon.ICON_EMAIL_FILLED_24.ordinal()] = 200;
                } catch (NoSuchFieldError unused200) {
                }
                try {
                    iArr[Icon.ICON_EMAIL_OUTLINE_24.ordinal()] = 201;
                } catch (NoSuchFieldError unused201) {
                }
                try {
                    iArr[Icon.ICON_ENERGY_12.ordinal()] = 202;
                } catch (NoSuchFieldError unused202) {
                }
                try {
                    iArr[Icon.ICON_ENERGY_24.ordinal()] = 203;
                } catch (NoSuchFieldError unused203) {
                }
                try {
                    iArr[Icon.ICON_ENTERTAINMENT_24.ordinal()] = 204;
                } catch (NoSuchFieldError unused204) {
                }
                try {
                    iArr[Icon.ICON_ETF_12.ordinal()] = 205;
                } catch (NoSuchFieldError unused205) {
                }
                try {
                    iArr[Icon.ICON_ETF_24.ordinal()] = 206;
                } catch (NoSuchFieldError unused206) {
                }
                try {
                    iArr[Icon.ICON_EURO_SIGN_12.ordinal()] = 207;
                } catch (NoSuchFieldError unused207) {
                }
                try {
                    iArr[Icon.ICON_EURO_SIGN_16.ordinal()] = 208;
                } catch (NoSuchFieldError unused208) {
                }
                try {
                    iArr[Icon.ICON_EURO_SIGN_24.ordinal()] = 209;
                } catch (NoSuchFieldError unused209) {
                }
                try {
                    iArr[Icon.ICON_EXCLAMATION_12.ordinal()] = 210;
                } catch (NoSuchFieldError unused210) {
                }
                try {
                    iArr[Icon.ICON_EXCLAMATION_16.ordinal()] = 211;
                } catch (NoSuchFieldError unused211) {
                }
                try {
                    iArr[Icon.ICON_EXCLAMATION_24.ordinal()] = 212;
                } catch (NoSuchFieldError unused212) {
                }
                try {
                    iArr[Icon.ICON_EXPAND_16.ordinal()] = 213;
                } catch (NoSuchFieldError unused213) {
                }
                try {
                    iArr[Icon.ICON_EXPAND_24.ordinal()] = 214;
                } catch (NoSuchFieldError unused214) {
                }
                try {
                    iArr[Icon.ICON_EYE_16.ordinal()] = 215;
                } catch (NoSuchFieldError unused215) {
                }
                try {
                    iArr[Icon.ICON_EYE_24.ordinal()] = 216;
                } catch (NoSuchFieldError unused216) {
                }
                try {
                    iArr[Icon.ICON_EYE_CLOSED_16.ordinal()] = 217;
                } catch (NoSuchFieldError unused217) {
                }
                try {
                    iArr[Icon.ICON_EYE_CLOSED_24.ordinal()] = 218;
                } catch (NoSuchFieldError unused218) {
                }
                try {
                    iArr[Icon.ICON_FACE_ID_ANDROID_16.ordinal()] = 219;
                } catch (NoSuchFieldError unused219) {
                }
                try {
                    iArr[Icon.ICON_FACE_ID_ANDROID_24.ordinal()] = 220;
                } catch (NoSuchFieldError unused220) {
                }
                try {
                    iArr[Icon.ICON_FACE_ID_IOS_16.ordinal()] = 221;
                } catch (NoSuchFieldError unused221) {
                }
                try {
                    iArr[Icon.ICON_FACE_ID_IOS_24.ordinal()] = 222;
                } catch (NoSuchFieldError unused222) {
                }
                try {
                    iArr[Icon.ICON_FAIR_VALUE_24.ordinal()] = 223;
                } catch (NoSuchFieldError unused223) {
                }
                try {
                    iArr[Icon.ICON_FEATURED_16.ordinal()] = 224;
                } catch (NoSuchFieldError unused224) {
                }
                try {
                    iArr[Icon.ICON_FEATURED_24.ordinal()] = 225;
                } catch (NoSuchFieldError unused225) {
                }
                try {
                    iArr[Icon.ICON_FILTER_12.ordinal()] = 226;
                } catch (NoSuchFieldError unused226) {
                }
                try {
                    iArr[Icon.ICON_FILTER_16.ordinal()] = 227;
                } catch (NoSuchFieldError unused227) {
                }
                try {
                    iArr[Icon.ICON_FILTER_24.ordinal()] = 228;
                } catch (NoSuchFieldError unused228) {
                }
                try {
                    iArr[Icon.ICON_FINANCE_12.ordinal()] = 229;
                } catch (NoSuchFieldError unused229) {
                }
                try {
                    iArr[Icon.ICON_FINANCE_16.ordinal()] = 230;
                } catch (NoSuchFieldError unused230) {
                }
                try {
                    iArr[Icon.ICON_FINANCE_24.ordinal()] = 231;
                } catch (NoSuchFieldError unused231) {
                }
                try {
                    iArr[Icon.ICON_FLASH_OFF_24.ordinal()] = 232;
                } catch (NoSuchFieldError unused232) {
                }
                try {
                    iArr[Icon.ICON_FLASH_ON_24.ordinal()] = 233;
                } catch (NoSuchFieldError unused233) {
                }
                try {
                    iArr[Icon.ICON_FLASHLIGHT_OFF_24.ordinal()] = 234;
                } catch (NoSuchFieldError unused234) {
                }
                try {
                    iArr[Icon.ICON_FLASHLIGHT_ON_24.ordinal()] = 235;
                } catch (NoSuchFieldError unused235) {
                }
                try {
                    iArr[Icon.ICON_FLOWER_16.ordinal()] = 236;
                } catch (NoSuchFieldError unused236) {
                }
                try {
                    iArr[Icon.ICON_FOLDER_16.ordinal()] = 237;
                } catch (NoSuchFieldError unused237) {
                }
                try {
                    iArr[Icon.ICON_FOLDER_24.ordinal()] = 238;
                } catch (NoSuchFieldError unused238) {
                }
                try {
                    iArr[Icon.ICON_FULLSCREEN_ENTER_24.ordinal()] = 239;
                } catch (NoSuchFieldError unused239) {
                }
                try {
                    iArr[Icon.ICON_FULLSCREEN_EXIT_24.ordinal()] = 240;
                } catch (NoSuchFieldError unused240) {
                }
                try {
                    iArr[Icon.ICON_GIFT_12.ordinal()] = 241;
                } catch (NoSuchFieldError unused241) {
                }
                try {
                    iArr[Icon.ICON_GIFT_16.ordinal()] = 242;
                } catch (NoSuchFieldError unused242) {
                }
                try {
                    iArr[Icon.ICON_GIFT_24.ordinal()] = 243;
                } catch (NoSuchFieldError unused243) {
                }
                try {
                    iArr[Icon.ICON_GOLD_16.ordinal()] = 244;
                } catch (NoSuchFieldError unused244) {
                }
                try {
                    iArr[Icon.ICON_GOLD_24.ordinal()] = 245;
                } catch (NoSuchFieldError unused245) {
                }
                try {
                    iArr[Icon.ICON_GROCERIES_24.ordinal()] = 246;
                } catch (NoSuchFieldError unused246) {
                }
                try {
                    iArr[Icon.ICON_HAMBURGER_12.ordinal()] = 247;
                } catch (NoSuchFieldError unused247) {
                }
                try {
                    iArr[Icon.ICON_HAMBURGER_16.ordinal()] = 248;
                } catch (NoSuchFieldError unused248) {
                }
                try {
                    iArr[Icon.ICON_HAMBURGER_24.ordinal()] = 249;
                } catch (NoSuchFieldError unused249) {
                }
                try {
                    iArr[Icon.ICON_HEALTHCARE_12.ordinal()] = 250;
                } catch (NoSuchFieldError unused250) {
                }
                try {
                    iArr[Icon.ICON_HEALTHCARE_24.ordinal()] = 251;
                } catch (NoSuchFieldError unused251) {
                }
                try {
                    iArr[Icon.ICON_HELP_24.ordinal()] = 252;
                } catch (NoSuchFieldError unused252) {
                }
                try {
                    iArr[Icon.ICON_HISTORY_16.ordinal()] = 253;
                } catch (NoSuchFieldError unused253) {
                }
                try {
                    iArr[Icon.ICON_HISTORY_24.ordinal()] = 254;
                } catch (NoSuchFieldError unused254) {
                }
                try {
                    iArr[Icon.ICON_HOME_24.ordinal()] = 255;
                } catch (NoSuchFieldError unused255) {
                }
                try {
                    iArr[Icon.ICON_HOSPITALITY_12.ordinal()] = 256;
                } catch (NoSuchFieldError unused256) {
                }
                try {
                    iArr[Icon.ICON_HOSPITALITY_24.ordinal()] = 257;
                } catch (NoSuchFieldError unused257) {
                }
                try {
                    iArr[Icon.ICON_HOURGLASS_12.ordinal()] = 258;
                } catch (NoSuchFieldError unused258) {
                }
                try {
                    iArr[Icon.ICON_HOURGLASS_16.ordinal()] = 259;
                } catch (NoSuchFieldError unused259) {
                }
                try {
                    iArr[Icon.ICON_HOURGLASS_24.ordinal()] = 260;
                } catch (NoSuchFieldError unused260) {
                }
                try {
                    iArr[Icon.ICON_ICLOUD_RESTORE_16.ordinal()] = 261;
                } catch (NoSuchFieldError unused261) {
                }
                try {
                    iArr[Icon.ICON_ICLOUD_RESTORE_24.ordinal()] = 262;
                } catch (NoSuchFieldError unused262) {
                }
                try {
                    iArr[Icon.ICON_IMAGE_16.ordinal()] = 263;
                } catch (NoSuchFieldError unused263) {
                }
                try {
                    iArr[Icon.ICON_IMAGE_24.ordinal()] = 264;
                } catch (NoSuchFieldError unused264) {
                }
                try {
                    iArr[Icon.ICON_IMAGE_FAIL_16.ordinal()] = 265;
                } catch (NoSuchFieldError unused265) {
                }
                try {
                    iArr[Icon.ICON_IMAGE_FAIL_24.ordinal()] = 266;
                } catch (NoSuchFieldError unused266) {
                }
                try {
                    iArr[Icon.ICON_INFO_12.ordinal()] = 267;
                } catch (NoSuchFieldError unused267) {
                }
                try {
                    iArr[Icon.ICON_INFO_16.ordinal()] = 268;
                } catch (NoSuchFieldError unused268) {
                }
                try {
                    iArr[Icon.ICON_INFO_24.ordinal()] = 269;
                } catch (NoSuchFieldError unused269) {
                }
                try {
                    iArr[Icon.ICON_INFO_FILLED_12.ordinal()] = 270;
                } catch (NoSuchFieldError unused270) {
                }
                try {
                    iArr[Icon.ICON_INFO_FILLED_16.ordinal()] = 271;
                } catch (NoSuchFieldError unused271) {
                }
                try {
                    iArr[Icon.ICON_INFO_FILLED_24.ordinal()] = 272;
                } catch (NoSuchFieldError unused272) {
                }
                try {
                    iArr[Icon.ICON_ISA_16.ordinal()] = 273;
                } catch (NoSuchFieldError unused273) {
                }
                try {
                    iArr[Icon.ICON_ISA_24.ordinal()] = 274;
                } catch (NoSuchFieldError unused274) {
                }
                try {
                    iArr[Icon.ICON_JOINT_ACCOUNT_12.ordinal()] = 275;
                } catch (NoSuchFieldError unused275) {
                }
                try {
                    iArr[Icon.ICON_JOINT_ACCOUNT_16.ordinal()] = 276;
                } catch (NoSuchFieldError unused276) {
                }
                try {
                    iArr[Icon.ICON_JOINT_ACCOUNT_24.ordinal()] = 277;
                } catch (NoSuchFieldError unused277) {
                }
                try {
                    iArr[Icon.ICON_L2_HEADER_ARROW_24.ordinal()] = 278;
                } catch (NoSuchFieldError unused278) {
                }
                try {
                    iArr[Icon.ICON_LIGHTBULB_16.ordinal()] = 279;
                } catch (NoSuchFieldError unused279) {
                }
                try {
                    iArr[Icon.ICON_LIGHTBULB_24.ordinal()] = 280;
                } catch (NoSuchFieldError unused280) {
                }
                try {
                    iArr[Icon.ICON_LIGHTNING_12.ordinal()] = 281;
                } catch (NoSuchFieldError unused281) {
                }
                try {
                    iArr[Icon.ICON_LIGHTNING_16.ordinal()] = 282;
                } catch (NoSuchFieldError unused282) {
                }
                try {
                    iArr[Icon.ICON_LIGHTNING_24.ordinal()] = 283;
                } catch (NoSuchFieldError unused283) {
                }
                try {
                    iArr[Icon.ICON_LIGHTNING_OFF_16.ordinal()] = 284;
                } catch (NoSuchFieldError unused284) {
                }
                try {
                    iArr[Icon.ICON_LIKE_POST_FILLED_16.ordinal()] = 285;
                } catch (NoSuchFieldError unused285) {
                }
                try {
                    iArr[Icon.ICON_LIKE_POST_FILLED_20.ordinal()] = 286;
                } catch (NoSuchFieldError unused286) {
                }
                try {
                    iArr[Icon.ICON_LIKE_POST_OUTLINE_16.ordinal()] = 287;
                } catch (NoSuchFieldError unused287) {
                }
                try {
                    iArr[Icon.ICON_LIKE_POST_OUTLINE_20.ordinal()] = 288;
                } catch (NoSuchFieldError unused288) {
                }
                try {
                    iArr[Icon.ICON_LIKE_POST_OUTLINE_24.ordinal()] = 289;
                } catch (NoSuchFieldError unused289) {
                }
                try {
                    iArr[Icon.ICON_LINK_16.ordinal()] = 290;
                } catch (NoSuchFieldError unused290) {
                }
                try {
                    iArr[Icon.ICON_LINK_24.ordinal()] = 291;
                } catch (NoSuchFieldError unused291) {
                }
                try {
                    iArr[Icon.ICON_LINK_OUT_12.ordinal()] = 292;
                } catch (NoSuchFieldError unused292) {
                }
                try {
                    iArr[Icon.ICON_LINK_OUT_16.ordinal()] = 293;
                } catch (NoSuchFieldError unused293) {
                }
                try {
                    iArr[Icon.ICON_LINK_OUT_24.ordinal()] = 294;
                } catch (NoSuchFieldError unused294) {
                }
                try {
                    iArr[Icon.ICON_LIST_24.ordinal()] = 295;
                } catch (NoSuchFieldError unused295) {
                }
                try {
                    iArr[Icon.ICON_LOCATION_FILL_16.ordinal()] = 296;
                } catch (NoSuchFieldError unused296) {
                }
                try {
                    iArr[Icon.ICON_LOCATION_FILL_24.ordinal()] = 297;
                } catch (NoSuchFieldError unused297) {
                }
                try {
                    iArr[Icon.ICON_LOCATION_OUTLINE_24.ordinal()] = 298;
                } catch (NoSuchFieldError unused298) {
                }
                try {
                    iArr[Icon.ICON_LOCK_12.ordinal()] = 299;
                } catch (NoSuchFieldError unused299) {
                }
                try {
                    iArr[Icon.ICON_LOCK_16.ordinal()] = 300;
                } catch (NoSuchFieldError unused300) {
                }
                try {
                    iArr[Icon.ICON_LOCK_24.ordinal()] = 301;
                } catch (NoSuchFieldError unused301) {
                }
                try {
                    iArr[Icon.ICON_LOG_OUT_24.ordinal()] = 302;
                } catch (NoSuchFieldError unused302) {
                }
                try {
                    iArr[Icon.ICON_MANAGED_ACCOUNTS_16.ordinal()] = 303;
                } catch (NoSuchFieldError unused303) {
                }
                try {
                    iArr[Icon.ICON_MANAGED_ACCOUNTS_24.ordinal()] = 304;
                } catch (NoSuchFieldError unused304) {
                }
                try {
                    iArr[Icon.ICON_MANAGED_INDIVIDUAL_24.ordinal()] = 305;
                } catch (NoSuchFieldError unused305) {
                }
                try {
                    iArr[Icon.ICON_MANAGED_JOINT_24.ordinal()] = 306;
                } catch (NoSuchFieldError unused306) {
                }
                try {
                    iArr[Icon.ICON_MANAGED_RETIREMENT_24.ordinal()] = 307;
                } catch (NoSuchFieldError unused307) {
                }
                try {
                    iArr[Icon.ICON_MANUFACTURING_12.ordinal()] = 308;
                } catch (NoSuchFieldError unused308) {
                }
                try {
                    iArr[Icon.ICON_MANUFACTURING_24.ordinal()] = 309;
                } catch (NoSuchFieldError unused309) {
                }
                try {
                    iArr[Icon.ICON_MAPS_24.ordinal()] = 310;
                } catch (NoSuchFieldError unused310) {
                }
                try {
                    iArr[Icon.ICON_MARGIN_12.ordinal()] = 311;
                } catch (NoSuchFieldError unused311) {
                }
                try {
                    iArr[Icon.ICON_MARGIN_16.ordinal()] = 312;
                } catch (NoSuchFieldError unused312) {
                }
                try {
                    iArr[Icon.ICON_MARGIN_24.ordinal()] = 313;
                } catch (NoSuchFieldError unused313) {
                }
                try {
                    iArr[Icon.ICON_MAXIMUM_16.ordinal()] = 314;
                } catch (NoSuchFieldError unused314) {
                }
                try {
                    iArr[Icon.ICON_MESSAGE_SEND_16.ordinal()] = 315;
                } catch (NoSuchFieldError unused315) {
                }
                try {
                    iArr[Icon.ICON_MESSAGE_SEND_24.ordinal()] = 316;
                } catch (NoSuchFieldError unused316) {
                }
                try {
                    iArr[Icon.ICON_MINIMUM_16.ordinal()] = 317;
                } catch (NoSuchFieldError unused317) {
                }
                try {
                    iArr[Icon.ICON_MINUS_12.ordinal()] = 318;
                } catch (NoSuchFieldError unused318) {
                }
                try {
                    iArr[Icon.ICON_MINUS_16.ordinal()] = 319;
                } catch (NoSuchFieldError unused319) {
                }
                try {
                    iArr[Icon.ICON_MINUS_24.ordinal()] = 320;
                } catch (NoSuchFieldError unused320) {
                }
                try {
                    iArr[Icon.ICON_MORE_MENU_16.ordinal()] = 321;
                } catch (NoSuchFieldError unused321) {
                }
                try {
                    iArr[Icon.ICON_MORE_MENU_20.ordinal()] = 322;
                } catch (NoSuchFieldError unused322) {
                }
                try {
                    iArr[Icon.ICON_NEWS_16.ordinal()] = 323;
                } catch (NoSuchFieldError unused323) {
                }
                try {
                    iArr[Icon.ICON_NEWS_24.ordinal()] = 324;
                } catch (NoSuchFieldError unused324) {
                }
                try {
                    iArr[Icon.ICON_NO_VALUE_24.ordinal()] = 325;
                } catch (NoSuchFieldError unused325) {
                }
                try {
                    iArr[Icon.ICON_NO_VALUE_32.ordinal()] = 326;
                } catch (NoSuchFieldError unused326) {
                }
                try {
                    iArr[Icon.ICON_NOTIFICATION_12.ordinal()] = 327;
                } catch (NoSuchFieldError unused327) {
                }
                try {
                    iArr[Icon.ICON_NOTIFICATION_16.ordinal()] = 328;
                } catch (NoSuchFieldError unused328) {
                }
                try {
                    iArr[Icon.ICON_NOTIFICATION_24.ordinal()] = 329;
                } catch (NoSuchFieldError unused329) {
                }
                try {
                    iArr[Icon.ICON_NOTIFICATION_32.ordinal()] = 330;
                } catch (NoSuchFieldError unused330) {
                }
                try {
                    iArr[Icon.ICON_NOTIFICATION_ADD_16.ordinal()] = 331;
                } catch (NoSuchFieldError unused331) {
                }
                try {
                    iArr[Icon.ICON_NOTIFICATION_ADD_24.ordinal()] = 332;
                } catch (NoSuchFieldError unused332) {
                }
                try {
                    iArr[Icon.ICON_NOTIFICATION_CHECK_16.ordinal()] = 333;
                } catch (NoSuchFieldError unused333) {
                }
                try {
                    iArr[Icon.ICON_NOTIFICATION_CHECK_24.ordinal()] = 334;
                } catch (NoSuchFieldError unused334) {
                }
                try {
                    iArr[Icon.ICON_NUMPAD_DOWN_24.ordinal()] = 335;
                } catch (NoSuchFieldError unused335) {
                }
                try {
                    iArr[Icon.ICON_NUMPAD_UP_24.ordinal()] = 336;
                } catch (NoSuchFieldError unused336) {
                }
                try {
                    iArr[Icon.ICON_ONLINE_16.ordinal()] = 337;
                } catch (NoSuchFieldError unused337) {
                }
                try {
                    iArr[Icon.ICON_ONLINE_24.ordinal()] = 338;
                } catch (NoSuchFieldError unused338) {
                }
                try {
                    iArr[Icon.ICON_OPTIONS_DOWN_24.ordinal()] = 339;
                } catch (NoSuchFieldError unused339) {
                }
                try {
                    iArr[Icon.ICON_OPTIONS_FLAT_24.ordinal()] = 340;
                } catch (NoSuchFieldError unused340) {
                }
                try {
                    iArr[Icon.ICON_OPTIONS_UP_24.ordinal()] = 341;
                } catch (NoSuchFieldError unused341) {
                }
                try {
                    iArr[Icon.ICON_OPTIONS_VOLATILE_24.ordinal()] = 342;
                } catch (NoSuchFieldError unused342) {
                }
                try {
                    iArr[Icon.ICON_ORDER_16.ordinal()] = 343;
                } catch (NoSuchFieldError unused343) {
                }
                try {
                    iArr[Icon.ICON_ORDER_24.ordinal()] = 344;
                } catch (NoSuchFieldError unused344) {
                }
                try {
                    iArr[Icon.ICON_PAUSE_HERO_40.ordinal()] = 345;
                } catch (NoSuchFieldError unused345) {
                }
                try {
                    iArr[Icon.ICON_PAUSE_INLINE_24.ordinal()] = 346;
                } catch (NoSuchFieldError unused346) {
                }
                try {
                    iArr[Icon.ICON_PAYCHECK_24.ordinal()] = 347;
                } catch (NoSuchFieldError unused347) {
                }
                try {
                    iArr[Icon.ICON_PAYMENT_12.ordinal()] = 348;
                } catch (NoSuchFieldError unused348) {
                }
                try {
                    iArr[Icon.ICON_PAYMENT_16.ordinal()] = 349;
                } catch (NoSuchFieldError unused349) {
                }
                try {
                    iArr[Icon.ICON_PAYMENT_24.ordinal()] = 350;
                } catch (NoSuchFieldError unused350) {
                }
                try {
                    iArr[Icon.ICON_PAYMENT_32.ordinal()] = 351;
                } catch (NoSuchFieldError unused351) {
                }
                try {
                    iArr[Icon.ICON_PERCENT_SIGN_12.ordinal()] = 352;
                } catch (NoSuchFieldError unused352) {
                }
                try {
                    iArr[Icon.ICON_PERCENT_SIGN_16.ordinal()] = 353;
                } catch (NoSuchFieldError unused353) {
                }
                try {
                    iArr[Icon.ICON_PERCENT_SIGN_24.ordinal()] = 354;
                } catch (NoSuchFieldError unused354) {
                }
                try {
                    iArr[Icon.ICON_PERPETUAL_FUTURES_32.ordinal()] = 355;
                } catch (NoSuchFieldError unused355) {
                }
                try {
                    iArr[Icon.ICON_PERSON_12.ordinal()] = 356;
                } catch (NoSuchFieldError unused356) {
                }
                try {
                    iArr[Icon.ICON_PERSON_16.ordinal()] = 357;
                } catch (NoSuchFieldError unused357) {
                }
                try {
                    iArr[Icon.ICON_PERSON_24.ordinal()] = 358;
                } catch (NoSuchFieldError unused358) {
                }
                try {
                    iArr[Icon.ICON_PHONE_16.ordinal()] = 359;
                } catch (NoSuchFieldError unused359) {
                }
                try {
                    iArr[Icon.ICON_PHONE_24.ordinal()] = 360;
                } catch (NoSuchFieldError unused360) {
                }
                try {
                    iArr[Icon.ICON_PHONE_CONNECTED_16.ordinal()] = 361;
                } catch (NoSuchFieldError unused361) {
                }
                try {
                    iArr[Icon.ICON_PHONE_MISSED_CALL_16.ordinal()] = 362;
                } catch (NoSuchFieldError unused362) {
                }
                try {
                    iArr[Icon.ICON_PHONE_WAITING_16.ordinal()] = 363;
                } catch (NoSuchFieldError unused363) {
                }
                try {
                    iArr[Icon.ICON_PICTURE_IN_PICTURE_24.ordinal()] = 364;
                } catch (NoSuchFieldError unused364) {
                }
                try {
                    iArr[Icon.ICON_PIE_CHART_16.ordinal()] = 365;
                } catch (NoSuchFieldError unused365) {
                }
                try {
                    iArr[Icon.ICON_PIE_CHART_24.ordinal()] = 366;
                } catch (NoSuchFieldError unused366) {
                }
                try {
                    iArr[Icon.ICON_PIN_16.ordinal()] = 367;
                } catch (NoSuchFieldError unused367) {
                }
                try {
                    iArr[Icon.ICON_PIN_24.ordinal()] = 368;
                } catch (NoSuchFieldError unused368) {
                }
                try {
                    iArr[Icon.ICON_PLAY_HERO_40.ordinal()] = 369;
                } catch (NoSuchFieldError unused369) {
                }
                try {
                    iArr[Icon.ICON_PLAY_INLINE_16.ordinal()] = 370;
                } catch (NoSuchFieldError unused370) {
                }
                try {
                    iArr[Icon.ICON_PLAY_INLINE_24.ordinal()] = 371;
                } catch (NoSuchFieldError unused371) {
                }
                try {
                    iArr[Icon.ICON_PLUS_12.ordinal()] = 372;
                } catch (NoSuchFieldError unused372) {
                }
                try {
                    iArr[Icon.ICON_PLUS_16.ordinal()] = 373;
                } catch (NoSuchFieldError unused373) {
                }
                try {
                    iArr[Icon.ICON_PLUS_24.ordinal()] = 374;
                } catch (NoSuchFieldError unused374) {
                }
                try {
                    iArr[Icon.ICON_POP_OUT_16.ordinal()] = 375;
                } catch (NoSuchFieldError unused375) {
                }
                try {
                    iArr[Icon.ICON_POP_OUT_24.ordinal()] = 376;
                } catch (NoSuchFieldError unused376) {
                }
                try {
                    iArr[Icon.ICON_PRINT_24.ordinal()] = 377;
                } catch (NoSuchFieldError unused377) {
                }
                try {
                    iArr[Icon.ICON_QR_16.ordinal()] = 378;
                } catch (NoSuchFieldError unused378) {
                }
                try {
                    iArr[Icon.ICON_QR_24.ordinal()] = 379;
                } catch (NoSuchFieldError unused379) {
                }
                try {
                    iArr[Icon.ICON_QR_SCAN_24.ordinal()] = 380;
                } catch (NoSuchFieldError unused380) {
                }
                try {
                    iArr[Icon.ICON_QUANTITY_16.ordinal()] = 381;
                } catch (NoSuchFieldError unused381) {
                }
                try {
                    iArr[Icon.ICON_QUANTITY_24.ordinal()] = 382;
                } catch (NoSuchFieldError unused382) {
                }
                try {
                    iArr[Icon.ICON_QUESTION_12.ordinal()] = 383;
                } catch (NoSuchFieldError unused383) {
                }
                try {
                    iArr[Icon.ICON_QUESTION_16.ordinal()] = 384;
                } catch (NoSuchFieldError unused384) {
                }
                try {
                    iArr[Icon.ICON_QUESTION_24.ordinal()] = 385;
                } catch (NoSuchFieldError unused385) {
                }
                try {
                    iArr[Icon.ICON_QUESTION_FILLED_12.ordinal()] = 386;
                } catch (NoSuchFieldError unused386) {
                }
                try {
                    iArr[Icon.ICON_QUESTION_FILLED_16.ordinal()] = 387;
                } catch (NoSuchFieldError unused387) {
                }
                try {
                    iArr[Icon.ICON_QUESTION_FILLED_24.ordinal()] = 388;
                } catch (NoSuchFieldError unused388) {
                }
                try {
                    iArr[Icon.ICON_RECURRING_12.ordinal()] = 389;
                } catch (NoSuchFieldError unused389) {
                }
                try {
                    iArr[Icon.ICON_RECURRING_16.ordinal()] = 390;
                } catch (NoSuchFieldError unused390) {
                }
                try {
                    iArr[Icon.ICON_RECURRING_24.ordinal()] = 391;
                } catch (NoSuchFieldError unused391) {
                }
                try {
                    iArr[Icon.ICON_RECURRING_HUB_24.ordinal()] = 392;
                } catch (NoSuchFieldError unused392) {
                }
                try {
                    iArr[Icon.ICON_REPEAT_16.ordinal()] = 393;
                } catch (NoSuchFieldError unused393) {
                }
                try {
                    iArr[Icon.ICON_REPLAY_HERO_40.ordinal()] = 394;
                } catch (NoSuchFieldError unused394) {
                }
                try {
                    iArr[Icon.ICON_RESEND_16.ordinal()] = 395;
                } catch (NoSuchFieldError unused395) {
                }
                try {
                    iArr[Icon.ICON_RESEND_24.ordinal()] = 396;
                } catch (NoSuchFieldError unused396) {
                }
                try {
                    iArr[Icon.ICON_RETIREMENT_12.ordinal()] = 397;
                } catch (NoSuchFieldError unused397) {
                }
                try {
                    iArr[Icon.ICON_RETIREMENT_16.ordinal()] = 398;
                } catch (NoSuchFieldError unused398) {
                }
                try {
                    iArr[Icon.ICON_RETIREMENT_24.ordinal()] = 399;
                } catch (NoSuchFieldError unused399) {
                }
                try {
                    iArr[Icon.ICON_RETIREMENT_32.ordinal()] = 400;
                } catch (NoSuchFieldError unused400) {
                }
                try {
                    iArr[Icon.ICON_RHW_BROWSER_TAB_24.ordinal()] = 401;
                } catch (NoSuchFieldError unused401) {
                }
                try {
                    iArr[Icon.ICON_RHW_CHART_TAB_24.ordinal()] = 402;
                } catch (NoSuchFieldError unused402) {
                }
                try {
                    iArr[Icon.ICON_RHW_SEARCH_TAB_24.ordinal()] = 403;
                } catch (NoSuchFieldError unused403) {
                }
                try {
                    iArr[Icon.ICON_RISK_AND_UNCERTAINTY_24.ordinal()] = 404;
                } catch (NoSuchFieldError unused404) {
                }
                try {
                    iArr[Icon.ICON_ROBINHOOD_12.ordinal()] = 405;
                } catch (NoSuchFieldError unused405) {
                }
                try {
                    iArr[Icon.ICON_ROBINHOOD_16.ordinal()] = 406;
                } catch (NoSuchFieldError unused406) {
                }
                try {
                    iArr[Icon.ICON_ROBINHOOD_24.ordinal()] = 407;
                } catch (NoSuchFieldError unused407) {
                }
                try {
                    iArr[Icon.ICON_ROLLING_POSITION_12.ordinal()] = 408;
                } catch (NoSuchFieldError unused408) {
                }
                try {
                    iArr[Icon.ICON_ROLLING_POSITION_16.ordinal()] = 409;
                } catch (NoSuchFieldError unused409) {
                }
                try {
                    iArr[Icon.ICON_ROLLING_POSITION_24.ordinal()] = 410;
                } catch (NoSuchFieldError unused410) {
                }
                try {
                    iArr[Icon.ICON_SCAN_16.ordinal()] = 411;
                } catch (NoSuchFieldError unused411) {
                }
                try {
                    iArr[Icon.ICON_SCAN_24.ordinal()] = 412;
                } catch (NoSuchFieldError unused412) {
                }
                try {
                    iArr[Icon.ICON_SEARCH_16.ordinal()] = 413;
                } catch (NoSuchFieldError unused413) {
                }
                try {
                    iArr[Icon.ICON_SEARCH_24.ordinal()] = 414;
                } catch (NoSuchFieldError unused414) {
                }
                try {
                    iArr[Icon.ICON_SETTINGS_12.ordinal()] = 415;
                } catch (NoSuchFieldError unused415) {
                }
                try {
                    iArr[Icon.ICON_SETTINGS_16.ordinal()] = 416;
                } catch (NoSuchFieldError unused416) {
                }
                try {
                    iArr[Icon.ICON_SETTINGS_24.ordinal()] = 417;
                } catch (NoSuchFieldError unused417) {
                }
                try {
                    iArr[Icon.ICON_SHARE_ANDROID_16.ordinal()] = 418;
                } catch (NoSuchFieldError unused418) {
                }
                try {
                    iArr[Icon.ICON_SHARE_ANDROID_24.ordinal()] = 419;
                } catch (NoSuchFieldError unused419) {
                }
                try {
                    iArr[Icon.ICON_SHARE_IOS_16.ordinal()] = 420;
                } catch (NoSuchFieldError unused420) {
                }
                try {
                    iArr[Icon.ICON_SHARE_IOS_24.ordinal()] = 421;
                } catch (NoSuchFieldError unused421) {
                }
                try {
                    iArr[Icon.ICON_SMILEY_24.ordinal()] = 422;
                } catch (NoSuchFieldError unused422) {
                }
                try {
                    iArr[Icon.ICON_SOCIAL_CREATE_POST_16.ordinal()] = 423;
                } catch (NoSuchFieldError unused423) {
                }
                try {
                    iArr[Icon.ICON_SORT_12.ordinal()] = 424;
                } catch (NoSuchFieldError unused424) {
                }
                try {
                    iArr[Icon.ICON_SOUND_OFF_24.ordinal()] = 425;
                } catch (NoSuchFieldError unused425) {
                }
                try {
                    iArr[Icon.ICON_SOUND_ON_24.ordinal()] = 426;
                } catch (NoSuchFieldError unused426) {
                }
                try {
                    iArr[Icon.ICON_SPARKLE_BULLET_12.ordinal()] = 427;
                } catch (NoSuchFieldError unused427) {
                }
                try {
                    iArr[Icon.ICON_SPARKLE_BULLET_16.ordinal()] = 428;
                } catch (NoSuchFieldError unused428) {
                }
                try {
                    iArr[Icon.ICON_SPARKLE_BULLET_24.ordinal()] = 429;
                } catch (NoSuchFieldError unused429) {
                }
                try {
                    iArr[Icon.ICON_SPARKLE_DOUBLE_16.ordinal()] = 430;
                } catch (NoSuchFieldError unused430) {
                }
                try {
                    iArr[Icon.ICON_SPARKLE_DOUBLE_24.ordinal()] = 431;
                } catch (NoSuchFieldError unused431) {
                }
                try {
                    iArr[Icon.ICON_SPEED_DOWN_24.ordinal()] = 432;
                } catch (NoSuchFieldError unused432) {
                }
                try {
                    iArr[Icon.ICON_SPEED_UP_24.ordinal()] = 433;
                } catch (NoSuchFieldError unused433) {
                }
                try {
                    iArr[Icon.ICON_STAR_FILLED_12.ordinal()] = 434;
                } catch (NoSuchFieldError unused434) {
                }
                try {
                    iArr[Icon.ICON_STAR_FILLED_16.ordinal()] = 435;
                } catch (NoSuchFieldError unused435) {
                }
                try {
                    iArr[Icon.ICON_STAR_FILLED_24.ordinal()] = 436;
                } catch (NoSuchFieldError unused436) {
                }
                try {
                    iArr[Icon.ICON_STAR_OUTLINE_16.ordinal()] = 437;
                } catch (NoSuchFieldError unused437) {
                }
                try {
                    iArr[Icon.ICON_STAR_OUTLINE_24.ordinal()] = 438;
                } catch (NoSuchFieldError unused438) {
                }
                try {
                    iArr[Icon.ICON_STAR_PASSWORD_16.ordinal()] = 439;
                } catch (NoSuchFieldError unused439) {
                }
                try {
                    iArr[Icon.ICON_STEWARDSHIP_24.ordinal()] = 440;
                } catch (NoSuchFieldError unused440) {
                }
                try {
                    iArr[Icon.ICON_STOCK_DOWN_12.ordinal()] = 441;
                } catch (NoSuchFieldError unused441) {
                }
                try {
                    iArr[Icon.ICON_STOCK_DOWN_16.ordinal()] = 442;
                } catch (NoSuchFieldError unused442) {
                }
                try {
                    iArr[Icon.ICON_STOCK_DOWN_24.ordinal()] = 443;
                } catch (NoSuchFieldError unused443) {
                }
                try {
                    iArr[Icon.ICON_STOCK_UP_12.ordinal()] = 444;
                } catch (NoSuchFieldError unused444) {
                }
                try {
                    iArr[Icon.ICON_STOCK_UP_16.ordinal()] = 445;
                } catch (NoSuchFieldError unused445) {
                }
                try {
                    iArr[Icon.ICON_STOCK_UP_24.ordinal()] = 446;
                } catch (NoSuchFieldError unused446) {
                }
                try {
                    iArr[Icon.ICON_STOPWATCH_16.ordinal()] = 447;
                } catch (NoSuchFieldError unused447) {
                }
                try {
                    iArr[Icon.ICON_STOPWATCH_24.ordinal()] = 448;
                } catch (NoSuchFieldError unused448) {
                }
                try {
                    iArr[Icon.ICON_STOPWATCH_32.ordinal()] = 449;
                } catch (NoSuchFieldError unused449) {
                }
                try {
                    iArr[Icon.ICON_STRATEGY_OUTLOOK_24.ordinal()] = 450;
                } catch (NoSuchFieldError unused450) {
                }
                try {
                    iArr[Icon.ICON_SWIPE_DOWN_16.ordinal()] = 451;
                } catch (NoSuchFieldError unused451) {
                }
                try {
                    iArr[Icon.ICON_SWIPE_DOWN_24.ordinal()] = 452;
                } catch (NoSuchFieldError unused452) {
                }
                try {
                    iArr[Icon.ICON_SWIPE_UP_16.ordinal()] = 453;
                } catch (NoSuchFieldError unused453) {
                }
                try {
                    iArr[Icon.ICON_SWIPE_UP_24.ordinal()] = 454;
                } catch (NoSuchFieldError unused454) {
                }
                try {
                    iArr[Icon.ICON_SWITCH_16.ordinal()] = 455;
                } catch (NoSuchFieldError unused455) {
                }
                try {
                    iArr[Icon.ICON_SWITCH_24.ordinal()] = 456;
                } catch (NoSuchFieldError unused456) {
                }
                try {
                    iArr[Icon.ICON_TAB_ACCOUNT_32.ordinal()] = 457;
                } catch (NoSuchFieldError unused457) {
                }
                try {
                    iArr[Icon.ICON_TAB_CONTENT_32.ordinal()] = 458;
                } catch (NoSuchFieldError unused458) {
                }
                try {
                    iArr[Icon.ICON_TAB_CRYPTO_32.ordinal()] = 459;
                } catch (NoSuchFieldError unused459) {
                }
                try {
                    iArr[Icon.ICON_TAB_CRYPTO_C_32.ordinal()] = 460;
                } catch (NoSuchFieldError unused460) {
                }
                try {
                    iArr[Icon.ICON_TAB_GOLD_32.ordinal()] = 461;
                } catch (NoSuchFieldError unused461) {
                }
                try {
                    iArr[Icon.ICON_TAB_INVEST_32.ordinal()] = 462;
                } catch (NoSuchFieldError unused462) {
                }
                try {
                    iArr[Icon.ICON_TAB_ISA_32.ordinal()] = 463;
                } catch (NoSuchFieldError unused463) {
                }
                try {
                    iArr[Icon.ICON_TAB_MESSAGES_32.ordinal()] = 464;
                } catch (NoSuchFieldError unused464) {
                }
                try {
                    iArr[Icon.ICON_TAB_MONEY_32.ordinal()] = 465;
                } catch (NoSuchFieldError unused465) {
                }
                try {
                    iArr[Icon.ICON_TAB_RETIREMENT_32.ordinal()] = 466;
                } catch (NoSuchFieldError unused466) {
                }
                try {
                    iArr[Icon.ICON_TAB_SEARCH_32.ordinal()] = 467;
                } catch (NoSuchFieldError unused467) {
                }
                try {
                    iArr[Icon.ICON_TAB_SOCIAL_32.ordinal()] = 468;
                } catch (NoSuchFieldError unused468) {
                }
                try {
                    iArr[Icon.ICON_TAB_WATCHLIST_32.ordinal()] = 469;
                } catch (NoSuchFieldError unused469) {
                }
                try {
                    iArr[Icon.ICON_TAG_16.ordinal()] = 470;
                } catch (NoSuchFieldError unused470) {
                }
                try {
                    iArr[Icon.ICON_TAG_24.ordinal()] = 471;
                } catch (NoSuchFieldError unused471) {
                }
                try {
                    iArr[Icon.ICON_TAX_LOTS_LONG_TERM_16.ordinal()] = 472;
                } catch (NoSuchFieldError unused472) {
                }
                try {
                    iArr[Icon.ICON_TAX_LOTS_SHORT_TERM_16.ordinal()] = 473;
                } catch (NoSuchFieldError unused473) {
                }
                try {
                    iArr[Icon.ICON_TECHNOLOGY_12.ordinal()] = 474;
                } catch (NoSuchFieldError unused474) {
                }
                try {
                    iArr[Icon.ICON_TECHNOLOGY_24.ordinal()] = 475;
                } catch (NoSuchFieldError unused475) {
                }
                try {
                    iArr[Icon.ICON_THUMBPRINT_16.ordinal()] = 476;
                } catch (NoSuchFieldError unused476) {
                }
                try {
                    iArr[Icon.ICON_THUMBPRINT_24.ordinal()] = 477;
                } catch (NoSuchFieldError unused477) {
                }
                try {
                    iArr[Icon.ICON_THUMBS_DOWN_16.ordinal()] = 478;
                } catch (NoSuchFieldError unused478) {
                }
                try {
                    iArr[Icon.ICON_THUMBS_DOWN_24.ordinal()] = 479;
                } catch (NoSuchFieldError unused479) {
                }
                try {
                    iArr[Icon.ICON_THUMBS_UP_16.ordinal()] = 480;
                } catch (NoSuchFieldError unused480) {
                }
                try {
                    iArr[Icon.ICON_THUMBS_UP_24.ordinal()] = 481;
                } catch (NoSuchFieldError unused481) {
                }
                try {
                    iArr[Icon.ICON_TICKET_16.ordinal()] = 482;
                } catch (NoSuchFieldError unused482) {
                }
                try {
                    iArr[Icon.ICON_TICKET_24.ordinal()] = 483;
                } catch (NoSuchFieldError unused483) {
                }
                try {
                    iArr[Icon.ICON_TOUCH_ID_ANDROID_16.ordinal()] = 484;
                } catch (NoSuchFieldError unused484) {
                }
                try {
                    iArr[Icon.ICON_TOUCH_ID_ANDROID_24.ordinal()] = 485;
                } catch (NoSuchFieldError unused485) {
                }
                try {
                    iArr[Icon.ICON_TRADE_SOCIAL_FILLED_20.ordinal()] = 486;
                } catch (NoSuchFieldError unused486) {
                }
                try {
                    iArr[Icon.ICON_TRADE_SOCIAL_OUTLINE_20.ordinal()] = 487;
                } catch (NoSuchFieldError unused487) {
                }
                try {
                    iArr[Icon.ICON_TRANSFERS_12.ordinal()] = 488;
                } catch (NoSuchFieldError unused488) {
                }
                try {
                    iArr[Icon.ICON_TRANSFERS_16.ordinal()] = 489;
                } catch (NoSuchFieldError unused489) {
                }
                try {
                    iArr[Icon.ICON_TRANSFERS_24.ordinal()] = 490;
                } catch (NoSuchFieldError unused490) {
                }
                try {
                    iArr[Icon.ICON_TRANSPORT_24.ordinal()] = 491;
                } catch (NoSuchFieldError unused491) {
                }
                try {
                    iArr[Icon.ICON_TRASH_12.ordinal()] = 492;
                } catch (NoSuchFieldError unused492) {
                }
                try {
                    iArr[Icon.ICON_TRASH_16.ordinal()] = 493;
                } catch (NoSuchFieldError unused493) {
                }
                try {
                    iArr[Icon.ICON_TRASH_24.ordinal()] = 494;
                } catch (NoSuchFieldError unused494) {
                }
                try {
                    iArr[Icon.ICON_TRIANGLE_ALERT_16.ordinal()] = 495;
                } catch (NoSuchFieldError unused495) {
                }
                try {
                    iArr[Icon.ICON_TRIANGLE_ALERT_24.ordinal()] = 496;
                } catch (NoSuchFieldError unused496) {
                }
                try {
                    iArr[Icon.ICON_TUNER_16.ordinal()] = 497;
                } catch (NoSuchFieldError unused497) {
                }
                try {
                    iArr[Icon.ICON_TUNER_24.ordinal()] = 498;
                } catch (NoSuchFieldError unused498) {
                }
                try {
                    iArr[Icon.ICON_UNLOCK_12.ordinal()] = 499;
                } catch (NoSuchFieldError unused499) {
                }
                try {
                    iArr[Icon.ICON_UNLOCK_16.ordinal()] = 500;
                } catch (NoSuchFieldError unused500) {
                }
                try {
                    iArr[Icon.ICON_UNLOCK_24.ordinal()] = 501;
                } catch (NoSuchFieldError unused501) {
                }
                try {
                    iArr[Icon.ICON_UPLOAD_24.ordinal()] = 502;
                } catch (NoSuchFieldError unused502) {
                }
                try {
                    iArr[Icon.ICON_VIDEO_CALL_12.ordinal()] = 503;
                } catch (NoSuchFieldError unused503) {
                }
                try {
                    iArr[Icon.ICON_VIDEO_CALL_16.ordinal()] = 504;
                } catch (NoSuchFieldError unused504) {
                }
                try {
                    iArr[Icon.ICON_VIDEO_CALL_24.ordinal()] = 505;
                } catch (NoSuchFieldError unused505) {
                }
                try {
                    iArr[Icon.ICON_VIDEO_FAST_FORWARD_24.ordinal()] = 506;
                } catch (NoSuchFieldError unused506) {
                }
                try {
                    iArr[Icon.ICON_VIDEO_REPLAY_24.ordinal()] = 507;
                } catch (NoSuchFieldError unused507) {
                }
                try {
                    iArr[Icon.ICON_VIDEO_REWIND_15_32.ordinal()] = 508;
                } catch (NoSuchFieldError unused508) {
                }
                try {
                    iArr[Icon.ICON_VIDEO_REWIND_24.ordinal()] = 509;
                } catch (NoSuchFieldError unused509) {
                }
                try {
                    iArr[Icon.ICON_VIDEO_SKIP_15_32.ordinal()] = 510;
                } catch (NoSuchFieldError unused510) {
                }
                try {
                    iArr[Icon.ICON_WALLET_24.ordinal()] = 511;
                } catch (NoSuchFieldError unused511) {
                }
                try {
                    iArr[Icon.ICON_WALLET_32.ordinal()] = 512;
                } catch (NoSuchFieldError unused512) {
                }
                try {
                    iArr[Icon.ICON_WALLETCONNECT_16.ordinal()] = 513;
                } catch (NoSuchFieldError unused513) {
                }
                try {
                    iArr[Icon.ICON_WALLETCONNECT_24.ordinal()] = 514;
                } catch (NoSuchFieldError unused514) {
                }
                try {
                    iArr[Icon.ICON_WC_SCAN_24.ordinal()] = 515;
                } catch (NoSuchFieldError unused515) {
                }
                try {
                    iArr[Icon.ICON_WITHDRAW_16.ordinal()] = 516;
                } catch (NoSuchFieldError unused516) {
                }
                try {
                    iArr[Icon.ICON_WITHDRAW_24.ordinal()] = 517;
                } catch (NoSuchFieldError unused517) {
                }
                try {
                    iArr[Icon.ICON_ZOOM_IN_24.ordinal()] = 518;
                } catch (NoSuchFieldError unused518) {
                }
                try {
                    iArr[Icon.ICON_ZOOM_OUT_24.ordinal()] = 519;
                } catch (NoSuchFieldError unused519) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<IconDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IconDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IconDto> getBinaryBase64Serializer() {
            return (KSerializer) IconDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Icon> getProtoAdapter() {
            return Icon.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IconDto getZeroValue() {
            return IconDto.ICON_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IconDto fromProto(Icon proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return IconDto.ICON_UNSPECIFIED;
                case 2:
                    return IconDto.ICON_ACCOUNT_SUMMARY_12;
                case 3:
                    return IconDto.ICON_ACCOUNT_SUMMARY_24;
                case 4:
                    return IconDto.ICON_ACTION_REMOVE_24;
                case 5:
                    return IconDto.ICON_ACTIONS_ALERTS_32;
                case 6:
                    return IconDto.ICON_ACTIONS_ATM_32;
                case 7:
                    return IconDto.ICON_ACTIONS_CHECK_32;
                case 8:
                    return IconDto.ICON_ACTIONS_STATEMENTS_32;
                case 9:
                    return IconDto.ICON_ACTIONS_TRANSFERS_32;
                case 10:
                    return IconDto.ICON_AGENT_16;
                case 11:
                    return IconDto.ICON_AGENT_24;
                case 12:
                    return IconDto.ICON_ALERT_12;
                case 13:
                    return IconDto.ICON_ALERT_16;
                case 14:
                    return IconDto.ICON_ALERT_24;
                case 15:
                    return IconDto.ICON_ALERT_FILLED_12;
                case 16:
                    return IconDto.ICON_ALERT_FILLED_16;
                case 17:
                    return IconDto.ICON_ALERT_FILLED_24;
                case 18:
                    return IconDto.ICON_ALL_DAY_TRADING_12;
                case 19:
                    return IconDto.ICON_ALL_DAY_TRADING_16;
                case 20:
                    return IconDto.ICON_ALL_DAY_TRADING_24;
                case 21:
                    return IconDto.ICON_ANNOUNCEMENT_12;
                case 22:
                    return IconDto.ICON_ANNOUNCEMENT_16;
                case 23:
                    return IconDto.ICON_ANNOUNCEMENT_24;
                case 24:
                    return IconDto.ICON_ARCHIVE_24;
                case 25:
                    return IconDto.ICON_ARROW_DIAGONAL_UP_16;
                case 26:
                    return IconDto.ICON_ARROW_DOWN_12;
                case 27:
                    return IconDto.ICON_ARROW_DOWN_16;
                case 28:
                    return IconDto.ICON_ARROW_DOWN_24;
                case 29:
                    return IconDto.ICON_ARROW_DOWN_FILL_12;
                case 30:
                    return IconDto.ICON_ARROW_DOWN_FILL_16;
                case 31:
                    return IconDto.ICON_ARROW_DOWN_FILL_24;
                case 32:
                    return IconDto.ICON_ARROW_DOWN_RIGHT_12;
                case 33:
                    return IconDto.ICON_ARROW_LEFT_12;
                case 34:
                    return IconDto.ICON_ARROW_LEFT_16;
                case 35:
                    return IconDto.ICON_ARROW_LEFT_24;
                case 36:
                    return IconDto.ICON_ARROW_LEFT_FILL_12;
                case 37:
                    return IconDto.ICON_ARROW_LEFT_FILL_16;
                case 38:
                    return IconDto.ICON_ARROW_LEFT_FILL_24;
                case 39:
                    return IconDto.ICON_ARROW_RIGHT_12;
                case 40:
                    return IconDto.ICON_ARROW_RIGHT_16;
                case 41:
                    return IconDto.ICON_ARROW_RIGHT_24;
                case 42:
                    return IconDto.ICON_ARROW_RIGHT_FILL_12;
                case 43:
                    return IconDto.ICON_ARROW_RIGHT_FILL_16;
                case 44:
                    return IconDto.ICON_ARROW_RIGHT_FILL_24;
                case 45:
                    return IconDto.ICON_ARROW_UP_12;
                case 46:
                    return IconDto.ICON_ARROW_UP_16;
                case 47:
                    return IconDto.ICON_ARROW_UP_24;
                case 48:
                    return IconDto.ICON_ARROW_UP_FILL_12;
                case 49:
                    return IconDto.ICON_ARROW_UP_FILL_16;
                case 50:
                    return IconDto.ICON_ARROW_UP_FILL_24;
                case 51:
                    return IconDto.ICON_ARROW_UP_RIGHT_12;
                case 52:
                    return IconDto.ICON_ARROW_UP_RIGHT_16;
                case 53:
                    return IconDto.ICON_ATTACH_24;
                case 54:
                    return IconDto.ICON_BACKSPACE_24;
                case 55:
                    return IconDto.ICON_BACKSPACE_32;
                case 56:
                    return IconDto.ICON_BANKING_16;
                case 57:
                    return IconDto.ICON_BANKING_24;
                case 58:
                    return IconDto.ICON_BANKING_32;
                case 59:
                    return IconDto.ICON_BAR_CHART_16;
                case 60:
                    return IconDto.ICON_BAR_CHART_24;
                case 61:
                    return IconDto.ICON_BOOKMARK_POST_FILLED_16;
                case 62:
                    return IconDto.ICON_BOOKMARK_POST_OUTLINE_16;
                case 63:
                    return IconDto.ICON_BUBBLE_CHECKED_12;
                case 64:
                    return IconDto.ICON_BUBBLE_CHECKED_16;
                case 65:
                    return IconDto.ICON_BUBBLE_CHECKED_24;
                case 66:
                    return IconDto.ICON_BUBBLE_DOT_24;
                case 67:
                    return IconDto.ICON_BUBBLE_EMPTY_24;
                case SDK_ASSET_ICON_HOME_VALUE:
                    return IconDto.ICON_BUBBLE_MINUS_16;
                case 69:
                    return IconDto.ICON_BUBBLE_MINUS_24;
                case 70:
                    return IconDto.ICON_BUBBLE_PAUSE_24;
                case SDK_ASSET_ICON_GUIDE_VALUE:
                    return IconDto.ICON_BUBBLE_PLUS_16;
                case SDK_ASSET_ICON_GLOBE_VALUE:
                    return IconDto.ICON_BUBBLE_PLUS_24;
                case 73:
                    return IconDto.ICON_BUBBLE_PLUS_FILLED_24;
                case 74:
                    return IconDto.ICON_BUBBLE_RADIO_BUTTON_24;
                case 75:
                    return IconDto.ICON_BUBBLE_REMOVE_16;
                case 76:
                    return IconDto.ICON_BUBBLE_REMOVE_24;
                case 77:
                    return IconDto.ICON_BUBBLE_REMOVE_FILLED_16;
                case 78:
                    return IconDto.ICON_BUBBLE_REMOVE_FILLED_24;
                case 79:
                    return IconDto.ICON_BUBBLE_REVERSE_24;
                case 80:
                    return IconDto.ICON_BUBBLE_UK_POUNDS_16;
                case 81:
                    return IconDto.ICON_BUBBLE_UK_POUNDS_24;
                case 82:
                    return IconDto.ICON_BUBBLE_UK_POUNDS_FILLED_16;
                case 83:
                    return IconDto.ICON_BUBBLE_UK_POUNDS_FILLED_24;
                case 84:
                    return IconDto.ICON_BUILDER_16;
                case 85:
                    return IconDto.ICON_BUILDER_24;
                case 86:
                    return IconDto.ICON_CALENDAR_12;
                case 87:
                    return IconDto.ICON_CALENDAR_16;
                case 88:
                    return IconDto.ICON_CALENDAR_24;
                case 89:
                    return IconDto.ICON_CAMERA_16;
                case 90:
                    return IconDto.ICON_CAMERA_24;
                case 91:
                    return IconDto.ICON_CARET_DOWN_12;
                case 92:
                    return IconDto.ICON_CARET_DOWN_16;
                case 93:
                    return IconDto.ICON_CARET_DOWN_24;
                case 94:
                    return IconDto.ICON_CARET_LEFT_12;
                case 95:
                    return IconDto.ICON_CARET_LEFT_16;
                case 96:
                    return IconDto.ICON_CARET_LEFT_24;
                case 97:
                    return IconDto.ICON_CARET_RIGHT_12;
                case 98:
                    return IconDto.ICON_CARET_RIGHT_16;
                case 99:
                    return IconDto.ICON_CARET_RIGHT_24;
                case 100:
                    return IconDto.ICON_CARET_UP_12;
                case 101:
                    return IconDto.ICON_CARET_UP_16;
                case 102:
                    return IconDto.ICON_CARET_UP_24;
                case 103:
                    return IconDto.ICON_CASH_24;
                case 104:
                    return IconDto.ICON_CHART_16;
                case 105:
                    return IconDto.ICON_CHART_24;
                case 106:
                    return IconDto.ICON_CHART_BAR_24;
                case 107:
                    return IconDto.ICON_CHART_CANDLESTICKS_16;
                case 108:
                    return IconDto.ICON_CHART_CANDLESTICKS_24;
                case 109:
                    return IconDto.ICON_CHART_LINE_16;
                case 110:
                    return IconDto.ICON_CHART_LINE_24;
                case 111:
                    return IconDto.ICON_CHART_STACKED_BAR_16;
                case 112:
                    return IconDto.ICON_CHAT_16;
                case 113:
                    return IconDto.ICON_CHAT_24;
                case 114:
                    return IconDto.ICON_CHATBOT_16;
                case 115:
                    return IconDto.ICON_CHATBOT_24;
                case 116:
                    return IconDto.ICON_CHECKBOX_EMPTY_16;
                case 117:
                    return IconDto.ICON_CHECKBOX_EMPTY_24;
                case 118:
                    return IconDto.ICON_CHECKBOX_FILLED_16;
                case 119:
                    return IconDto.ICON_CHECKBOX_FILLED_24;
                case 120:
                    return IconDto.ICON_CHECKMARK_12;
                case SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE:
                    return IconDto.ICON_CHECKMARK_16;
                case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                    return IconDto.ICON_CHECKMARK_24;
                case 123:
                    return IconDto.ICON_CLIPBOARD_16;
                case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                    return IconDto.ICON_CLIPBOARD_24;
                case 125:
                    return IconDto.ICON_CLOCK_12;
                case SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE:
                    return IconDto.ICON_CLOCK_16;
                case SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE:
                    return IconDto.ICON_CLOCK_24;
                case 128:
                    return IconDto.ICON_CLOSE_12;
                case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                    return IconDto.ICON_CLOSE_16;
                case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                    return IconDto.ICON_CLOSE_24;
                case 131:
                    return IconDto.ICON_CLOUD_16;
                case SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE:
                    return IconDto.ICON_CLOUD_24;
                case SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE:
                    return IconDto.ICON_COLLAPSE_16;
                case SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE:
                    return IconDto.ICON_COLLAPSE_24;
                case SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE:
                    return IconDto.ICON_COMMENT_FILLED_16;
                case 136:
                    return IconDto.ICON_COMMENT_FILLED_20;
                case SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE:
                    return IconDto.ICON_COMMENT_OUTLINE_16;
                case SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE:
                    return IconDto.ICON_COMMENT_OUTLINE_20;
                case SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE:
                    return IconDto.ICON_CONCIERGE_24;
                case SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE:
                    return IconDto.ICON_CONSUMER_GOODS_12;
                case SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE:
                    return IconDto.ICON_CONSUMER_GOODS_16;
                case SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE:
                    return IconDto.ICON_CONSUMER_GOODS_24;
                case SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE:
                    return IconDto.ICON_CONTROLS_16;
                case 144:
                    return IconDto.ICON_CONTROLS_24;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE:
                    return IconDto.ICON_CONVERSATION_16;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE:
                    return IconDto.ICON_CONVERSATION_24;
                case 147:
                    return IconDto.ICON_CONVERT_24;
                case SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE:
                    return IconDto.ICON_COPY_12;
                case SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE:
                    return IconDto.ICON_COPY_16;
                case 150:
                    return IconDto.ICON_COPY_24;
                case 151:
                    return IconDto.ICON_COPY_TRADE_FILLED_16;
                case SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE:
                    return IconDto.ICON_COPY_TRADE_OUTLINE_16;
                case SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE:
                    return IconDto.ICON_CORN_FUTURES_24;
                case SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE:
                    return IconDto.ICON_CORPORATE_16;
                case 155:
                    return IconDto.ICON_CORPORATE_24;
                case 156:
                    return IconDto.ICON_CORTEX_12;
                case SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE:
                    return IconDto.ICON_CORTEX_16;
                case SDK_ASSET_ILLUSTRATION_WALLET_VALUE:
                    return IconDto.ICON_CORTEX_24;
                case SDK_ASSET_ILLUSTRATION_INCOME_VALUE:
                    return IconDto.ICON_CRYPTO_12;
                case SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE:
                    return IconDto.ICON_CRYPTO_16;
                case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE:
                    return IconDto.ICON_CRYPTO_24;
                case SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE:
                    return IconDto.ICON_CRYPTO_C_12;
                case SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE:
                    return IconDto.ICON_CRYPTO_C_16;
                case SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE:
                    return IconDto.ICON_CRYPTO_C_24;
                case 165:
                    return IconDto.ICON_CUSTODIAL_16;
                case SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE:
                    return IconDto.ICON_CUSTODIAL_24;
                case 167:
                    return IconDto.ICON_DEPOSIT_16;
                case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE:
                    return IconDto.ICON_DEPOSIT_24;
                case SDK_ASSET_HEADER_CARD_COLLECT_VALUE:
                    return IconDto.ICON_DINING_24;
                case SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE:
                    return IconDto.ICON_DISCLOSURES_16;
                case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE:
                    return IconDto.ICON_DISCLOSURES_24;
                case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE:
                    return IconDto.ICON_DIVIDEND_16;
                case SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE:
                    return IconDto.ICON_DIVIDEND_24;
                case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE:
                    return IconDto.ICON_DOCUMENTS_24;
                case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE:
                    return IconDto.ICON_DOLLAR_SIGN_12;
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE:
                    return IconDto.ICON_DOLLAR_SIGN_16;
                case SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE:
                    return IconDto.ICON_DOLLAR_SIGN_24;
                case f2773x8d9721ad:
                    return IconDto.ICON_DOT_12;
                case f2780x600b66fe:
                    return IconDto.ICON_DOT_16;
                case SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE:
                    return IconDto.ICON_DOT_24;
                case SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE:
                    return IconDto.ICON_DOTS_16;
                case 182:
                    return IconDto.ICON_DOTS_24;
                case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE:
                    return IconDto.ICON_DOTS_ANDROID_16;
                case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE:
                    return IconDto.ICON_DOTS_ANDROID_24;
                case SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE:
                    return IconDto.ICON_DOWNLOAD_12;
                case SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE:
                    return IconDto.ICON_DOWNLOAD_16;
                case SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE:
                    return IconDto.ICON_DOWNLOAD_24;
                case 188:
                    return IconDto.ICON_DRAG_12;
                case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE:
                    return IconDto.ICON_DRAG_16;
                case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE:
                    return IconDto.ICON_DRAG_24;
                case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE:
                    return IconDto.ICON_DROPDOWN_12;
                case 192:
                    return IconDto.ICON_DROPDOWN_16;
                case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE:
                    return IconDto.ICON_DROPDOWN_24;
                case SDK_ASSET_ICON_EXTERNAL_VALUE:
                    return IconDto.ICON_ECONOMIC_MOAT_24;
                case SDK_ASSET_ICON_ALERT_WARNING_VALUE:
                    return IconDto.ICON_EDIT_12;
                case SDK_ASSET_ICON_ARROW_DOWN_VALUE:
                    return IconDto.ICON_EDIT_16;
                case SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE:
                    return IconDto.ICON_EDIT_24;
                case SDK_ASSET_ICON_ARROW_UP_VALUE:
                    return IconDto.ICON_EDIT_SURFACE_24;
                case SDK_ASSET_ICON_CANCEL_VALUE:
                    return IconDto.ICON_EMAIL_FILLED_16;
                case 200:
                    return IconDto.ICON_EMAIL_FILLED_24;
                case 201:
                    return IconDto.ICON_EMAIL_OUTLINE_24;
                case 202:
                    return IconDto.ICON_ENERGY_12;
                case SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE:
                    return IconDto.ICON_ENERGY_24;
                case 204:
                    return IconDto.ICON_ENTERTAINMENT_24;
                case SDK_ASSET_ICON_CLIPBOARD_VALUE:
                    return IconDto.ICON_ETF_12;
                case SDK_ASSET_ICON_CLOCK_VALUE:
                    return IconDto.ICON_ETF_24;
                case SDK_ASSET_ICON_COMMENT_VALUE:
                    return IconDto.ICON_EURO_SIGN_12;
                case SDK_ASSET_ICON_INCOME_VALUE:
                    return IconDto.ICON_EURO_SIGN_16;
                case SDK_ASSET_ICON_INCOMPLETE_VALUE:
                    return IconDto.ICON_EURO_SIGN_24;
                case SDK_ASSET_ICON_NEW_WINDOW_VALUE:
                    return IconDto.ICON_EXCLAMATION_12;
                case 211:
                    return IconDto.ICON_EXCLAMATION_16;
                case SDK_ASSET_ICON_OVERRIDE_VALUE:
                    return IconDto.ICON_EXCLAMATION_24;
                case SDK_ASSET_ICON_PAUSE_VALUE:
                    return IconDto.ICON_EXPAND_16;
                case SDK_ASSET_ICON_PIN_VALUE:
                    return IconDto.ICON_EXPAND_24;
                case SDK_ASSET_ICON_PRODUCT_IDV_VALUE:
                    return IconDto.ICON_EYE_16;
                case SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE:
                    return IconDto.ICON_EYE_24;
                case SDK_ASSET_ICON_PROGRESS_VALUE:
                    return IconDto.ICON_EYE_CLOSED_16;
                case SDK_ASSET_ICON_QUESTION_VALUE:
                    return IconDto.ICON_EYE_CLOSED_24;
                case SDK_ASSET_ICON_REJECTED_REC_VALUE:
                    return IconDto.ICON_FACE_ID_ANDROID_16;
                case SDK_ASSET_ICON_SHIELD_CAUTION_VALUE:
                    return IconDto.ICON_FACE_ID_ANDROID_24;
                case SDK_ASSET_ICON_SUBMIT_VALUE:
                    return IconDto.ICON_FACE_ID_IOS_16;
                case SDK_ASSET_ICON_SUBTRACT_VALUE:
                    return IconDto.ICON_FACE_ID_IOS_24;
                case SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE:
                    return IconDto.ICON_FAIR_VALUE_24;
                case 224:
                    return IconDto.ICON_FEATURED_16;
                case 225:
                    return IconDto.ICON_FEATURED_24;
                case SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE:
                    return IconDto.ICON_FILTER_12;
                case SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE:
                    return IconDto.ICON_FILTER_16;
                case SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE:
                    return IconDto.ICON_FILTER_24;
                case SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE:
                    return IconDto.ICON_FINANCE_12;
                case SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE:
                    return IconDto.ICON_FINANCE_16;
                case SDK_ASSET_ILLUSTRATION_EXIT_VALUE:
                    return IconDto.ICON_FINANCE_24;
                case SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE:
                    return IconDto.ICON_FLASH_OFF_24;
                case SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE:
                    return IconDto.ICON_FLASH_ON_24;
                case SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE:
                    return IconDto.ICON_FLASHLIGHT_OFF_24;
                case SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE:
                    return IconDto.ICON_FLASHLIGHT_ON_24;
                case SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE:
                    return IconDto.ICON_FLOWER_16;
                case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE:
                    return IconDto.ICON_FOLDER_16;
                case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE:
                    return IconDto.ICON_FOLDER_24;
                case 239:
                    return IconDto.ICON_FULLSCREEN_ENTER_24;
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE:
                    return IconDto.ICON_FULLSCREEN_EXIT_24;
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE:
                    return IconDto.ICON_GIFT_12;
                case f2778x3356acf6:
                    return IconDto.ICON_GIFT_16;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE:
                    return IconDto.ICON_GIFT_24;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE:
                    return IconDto.ICON_GOLD_16;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE:
                    return IconDto.ICON_GOLD_24;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE:
                    return IconDto.ICON_GROCERIES_24;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE:
                    return IconDto.ICON_HAMBURGER_12;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE:
                    return IconDto.ICON_HAMBURGER_16;
                case f2779x59907a3d:
                    return IconDto.ICON_HAMBURGER_24;
                case 250:
                    return IconDto.ICON_HEALTHCARE_12;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE:
                    return IconDto.ICON_HEALTHCARE_24;
                case SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE:
                    return IconDto.ICON_HELP_24;
                case SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE:
                    return IconDto.ICON_HISTORY_16;
                case SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE:
                    return IconDto.ICON_HISTORY_24;
                case 255:
                    return IconDto.ICON_HOME_24;
                case 256:
                    return IconDto.ICON_HOSPITALITY_12;
                case SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE:
                    return IconDto.ICON_HOSPITALITY_24;
                case SDK_ASSET_HEADER_BOLT_VALUE:
                    return IconDto.ICON_HOURGLASS_12;
                case SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE:
                    return IconDto.ICON_HOURGLASS_16;
                case SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE:
                    return IconDto.ICON_HOURGLASS_24;
                case SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE:
                    return IconDto.ICON_ICLOUD_RESTORE_16;
                case SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE:
                    return IconDto.ICON_ICLOUD_RESTORE_24;
                case SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE:
                    return IconDto.ICON_IMAGE_16;
                case SDK_ASSET_ICON_PLAID_LOGO_VALUE:
                    return IconDto.ICON_IMAGE_24;
                case SDK_ASSET_HEADER_SHIELD_VALUE:
                    return IconDto.ICON_IMAGE_FAIL_16;
                case SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE:
                    return IconDto.ICON_IMAGE_FAIL_24;
                case SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE:
                    return IconDto.ICON_INFO_12;
                case SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE:
                    return IconDto.ICON_INFO_16;
                case SDK_ASSET_HEADER_REPORT_SHARED_VALUE:
                    return IconDto.ICON_INFO_24;
                case SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE:
                    return IconDto.ICON_INFO_FILLED_12;
                case 271:
                    return IconDto.ICON_INFO_FILLED_16;
                case SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE:
                    return IconDto.ICON_INFO_FILLED_24;
                case SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE:
                    return IconDto.ICON_ISA_16;
                case SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE:
                    return IconDto.ICON_ISA_24;
                case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE:
                    return IconDto.ICON_JOINT_ACCOUNT_12;
                case SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE:
                    return IconDto.ICON_JOINT_ACCOUNT_16;
                case SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE:
                    return IconDto.ICON_JOINT_ACCOUNT_24;
                case SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE:
                    return IconDto.ICON_L2_HEADER_ARROW_24;
                case SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE:
                    return IconDto.ICON_LIGHTBULB_16;
                case 280:
                    return IconDto.ICON_LIGHTBULB_24;
                case SDK_ASSET_ILLUSTRATION_BANK_VALUE:
                    return IconDto.ICON_LIGHTNING_12;
                case SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE:
                    return IconDto.ICON_LIGHTNING_16;
                case 283:
                    return IconDto.ICON_LIGHTNING_24;
                case SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE:
                    return IconDto.ICON_LIGHTNING_OFF_16;
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE:
                    return IconDto.ICON_LIKE_POST_FILLED_16;
                case f2777x89a9e432:
                    return IconDto.ICON_LIKE_POST_FILLED_20;
                case SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE:
                    return IconDto.ICON_LIKE_POST_OUTLINE_16;
                case 288:
                    return IconDto.ICON_LIKE_POST_OUTLINE_20;
                case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE:
                    return IconDto.ICON_LIKE_POST_OUTLINE_24;
                case SDK_ASSET_ILLUSTRATION_NOTE_VALUE:
                    return IconDto.ICON_LINK_16;
                case f2776x87e624cb:
                    return IconDto.ICON_LINK_24;
                case SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE:
                    return IconDto.ICON_LINK_OUT_12;
                case SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE:
                    return IconDto.ICON_LINK_OUT_16;
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE:
                    return IconDto.ICON_LINK_OUT_24;
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE:
                    return IconDto.ICON_LIST_24;
                case SDK_ASSET_LOADING_INDICATOR_VALUE:
                    return IconDto.ICON_LOCATION_FILL_16;
                case SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE:
                    return IconDto.ICON_LOCATION_FILL_24;
                case SDK_ASSET_BANK_ICON_CIRCLE_VALUE:
                    return IconDto.ICON_LOCATION_OUTLINE_24;
                case SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE:
                    return IconDto.ICON_LOCK_12;
                case 300:
                    return IconDto.ICON_LOCK_16;
                case SDK_ASSET_CASH_ICON_CIRCLE_VALUE:
                    return IconDto.ICON_LOCK_24;
                case 302:
                    return IconDto.ICON_LOG_OUT_24;
                case SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE:
                    return IconDto.ICON_MANAGED_ACCOUNTS_16;
                case SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE:
                    return IconDto.ICON_MANAGED_ACCOUNTS_24;
                case SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE:
                    return IconDto.ICON_MANAGED_INDIVIDUAL_24;
                case SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE:
                    return IconDto.ICON_MANAGED_JOINT_24;
                case SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE:
                    return IconDto.ICON_MANAGED_RETIREMENT_24;
                case SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE:
                    return IconDto.ICON_MANUFACTURING_12;
                case SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE:
                    return IconDto.ICON_MANUFACTURING_24;
                case SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE:
                    return IconDto.ICON_MAPS_24;
                case SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE:
                    return IconDto.ICON_MARGIN_12;
                case f2774x74902ae0:
                    return IconDto.ICON_MARGIN_16;
                case SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE:
                    return IconDto.ICON_MARGIN_24;
                case SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE:
                    return IconDto.ICON_MAXIMUM_16;
                case SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE:
                    return IconDto.ICON_MESSAGE_SEND_16;
                case 316:
                    return IconDto.ICON_MESSAGE_SEND_24;
                case SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE:
                    return IconDto.ICON_MINIMUM_16;
                case SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE:
                    return IconDto.ICON_MINUS_12;
                case f2781x2ba65ba3:
                    return IconDto.ICON_MINUS_16;
                case SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE:
                    return IconDto.ICON_MINUS_24;
                case SDK_ASSET_BANK_ICON_CIRCLE_LIGHT_VALUE:
                    return IconDto.ICON_MORE_MENU_16;
                case SDK_ASSET_PLAID_PROFILE_CIRCLE_VALUE:
                    return IconDto.ICON_MORE_MENU_20;
                case f2775xbcb7e6f3:
                    return IconDto.ICON_NEWS_16;
                case SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE:
                    return IconDto.ICON_NEWS_24;
                case SDK_ASSET_ICON_REPORT_VALUE:
                    return IconDto.ICON_NO_VALUE_24;
                case SDK_ASSET_ICON_STEP_COMPLETE_VALUE:
                    return IconDto.ICON_NO_VALUE_32;
                case SDK_ASSET_ICON_UPLOAD_VALUE:
                    return IconDto.ICON_NOTIFICATION_12;
                case SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE:
                    return IconDto.ICON_NOTIFICATION_16;
                case SDK_ASSET_ICON_LIGHTNING_FILLED_BLUE_VALUE:
                    return IconDto.ICON_NOTIFICATION_24;
                case 330:
                    return IconDto.ICON_NOTIFICATION_32;
                case 331:
                    return IconDto.ICON_NOTIFICATION_ADD_16;
                case 332:
                    return IconDto.ICON_NOTIFICATION_ADD_24;
                case 333:
                    return IconDto.ICON_NOTIFICATION_CHECK_16;
                case 334:
                    return IconDto.ICON_NOTIFICATION_CHECK_24;
                case 335:
                    return IconDto.ICON_NUMPAD_DOWN_24;
                case WaitlistAnimationConstants.IN_WAITLIST_ANIMATION_END /* 336 */:
                    return IconDto.ICON_NUMPAD_UP_24;
                case 337:
                    return IconDto.ICON_ONLINE_16;
                case 338:
                    return IconDto.ICON_ONLINE_24;
                case 339:
                    return IconDto.ICON_OPTIONS_DOWN_24;
                case 340:
                    return IconDto.ICON_OPTIONS_FLAT_24;
                case 341:
                    return IconDto.ICON_OPTIONS_UP_24;
                case 342:
                    return IconDto.ICON_OPTIONS_VOLATILE_24;
                case 343:
                    return IconDto.ICON_ORDER_16;
                case 344:
                    return IconDto.ICON_ORDER_24;
                case 345:
                    return IconDto.ICON_PAUSE_HERO_40;
                case 346:
                    return IconDto.ICON_PAUSE_INLINE_24;
                case 347:
                    return IconDto.ICON_PAYCHECK_24;
                case 348:
                    return IconDto.ICON_PAYMENT_12;
                case 349:
                    return IconDto.ICON_PAYMENT_16;
                case 350:
                    return IconDto.ICON_PAYMENT_24;
                case 351:
                    return IconDto.ICON_PAYMENT_32;
                case 352:
                    return IconDto.ICON_PERCENT_SIGN_12;
                case 353:
                    return IconDto.ICON_PERCENT_SIGN_16;
                case 354:
                    return IconDto.ICON_PERCENT_SIGN_24;
                case 355:
                    return IconDto.ICON_PERPETUAL_FUTURES_32;
                case 356:
                    return IconDto.ICON_PERSON_12;
                case 357:
                    return IconDto.ICON_PERSON_16;
                case 358:
                    return IconDto.ICON_PERSON_24;
                case 359:
                    return IconDto.ICON_PHONE_16;
                case 360:
                    return IconDto.ICON_PHONE_24;
                case 361:
                    return IconDto.ICON_PHONE_CONNECTED_16;
                case 362:
                    return IconDto.ICON_PHONE_MISSED_CALL_16;
                case 363:
                    return IconDto.ICON_PHONE_WAITING_16;
                case 364:
                    return IconDto.ICON_PICTURE_IN_PICTURE_24;
                case 365:
                    return IconDto.ICON_PIE_CHART_16;
                case 366:
                    return IconDto.ICON_PIE_CHART_24;
                case 367:
                    return IconDto.ICON_PIN_16;
                case 368:
                    return IconDto.ICON_PIN_24;
                case 369:
                    return IconDto.ICON_PLAY_HERO_40;
                case 370:
                    return IconDto.ICON_PLAY_INLINE_16;
                case 371:
                    return IconDto.ICON_PLAY_INLINE_24;
                case 372:
                    return IconDto.ICON_PLUS_12;
                case 373:
                    return IconDto.ICON_PLUS_16;
                case 374:
                    return IconDto.ICON_PLUS_24;
                case 375:
                    return IconDto.ICON_POP_OUT_16;
                case 376:
                    return IconDto.ICON_POP_OUT_24;
                case 377:
                    return IconDto.ICON_PRINT_24;
                case 378:
                    return IconDto.ICON_QR_16;
                case 379:
                    return IconDto.ICON_QR_24;
                case 380:
                    return IconDto.ICON_QR_SCAN_24;
                case 381:
                    return IconDto.ICON_QUANTITY_16;
                case 382:
                    return IconDto.ICON_QUANTITY_24;
                case 383:
                    return IconDto.ICON_QUESTION_12;
                case 384:
                    return IconDto.ICON_QUESTION_16;
                case 385:
                    return IconDto.ICON_QUESTION_24;
                case 386:
                    return IconDto.ICON_QUESTION_FILLED_12;
                case 387:
                    return IconDto.ICON_QUESTION_FILLED_16;
                case 388:
                    return IconDto.ICON_QUESTION_FILLED_24;
                case 389:
                    return IconDto.ICON_RECURRING_12;
                case 390:
                    return IconDto.ICON_RECURRING_16;
                case 391:
                    return IconDto.ICON_RECURRING_24;
                case 392:
                    return IconDto.ICON_RECURRING_HUB_24;
                case 393:
                    return IconDto.ICON_REPEAT_16;
                case 394:
                    return IconDto.ICON_REPLAY_HERO_40;
                case 395:
                    return IconDto.ICON_RESEND_16;
                case WaitlistAnimationConstants.LEFT_YAW_START /* 396 */:
                    return IconDto.ICON_RESEND_24;
                case 397:
                    return IconDto.ICON_RETIREMENT_12;
                case 398:
                    return IconDto.ICON_RETIREMENT_16;
                case 399:
                    return IconDto.ICON_RETIREMENT_24;
                case 400:
                    return IconDto.ICON_RETIREMENT_32;
                case 401:
                    return IconDto.ICON_RHW_BROWSER_TAB_24;
                case 402:
                    return IconDto.ICON_RHW_CHART_TAB_24;
                case HttpStatusCode.FORBIDDEN /* 403 */:
                    return IconDto.ICON_RHW_SEARCH_TAB_24;
                case 404:
                    return IconDto.ICON_RISK_AND_UNCERTAINTY_24;
                case 405:
                    return IconDto.ICON_ROBINHOOD_12;
                case 406:
                    return IconDto.ICON_ROBINHOOD_16;
                case 407:
                    return IconDto.ICON_ROBINHOOD_24;
                case 408:
                    return IconDto.ICON_ROLLING_POSITION_12;
                case 409:
                    return IconDto.ICON_ROLLING_POSITION_16;
                case HttpStatusCode.GONE /* 410 */:
                    return IconDto.ICON_ROLLING_POSITION_24;
                case 411:
                    return IconDto.ICON_SCAN_16;
                case 412:
                    return IconDto.ICON_SCAN_24;
                case 413:
                    return IconDto.ICON_SEARCH_16;
                case 414:
                    return IconDto.ICON_SEARCH_24;
                case 415:
                    return IconDto.ICON_SETTINGS_12;
                case 416:
                    return IconDto.ICON_SETTINGS_16;
                case 417:
                    return IconDto.ICON_SETTINGS_24;
                case 418:
                    return IconDto.ICON_SHARE_ANDROID_16;
                case 419:
                    return IconDto.ICON_SHARE_ANDROID_24;
                case 420:
                    return IconDto.ICON_SHARE_IOS_16;
                case 421:
                    return IconDto.ICON_SHARE_IOS_24;
                case 422:
                    return IconDto.ICON_SMILEY_24;
                case 423:
                    return IconDto.ICON_SOCIAL_CREATE_POST_16;
                case 424:
                    return IconDto.ICON_SORT_12;
                case CompanyFinancialsSection.BAR_ANIMATION_DURATION /* 425 */:
                    return IconDto.ICON_SOUND_OFF_24;
                case 426:
                    return IconDto.ICON_SOUND_ON_24;
                case 427:
                    return IconDto.ICON_SPARKLE_BULLET_12;
                case 428:
                    return IconDto.ICON_SPARKLE_BULLET_16;
                case 429:
                    return IconDto.ICON_SPARKLE_BULLET_24;
                case 430:
                    return IconDto.ICON_SPARKLE_DOUBLE_16;
                case 431:
                    return IconDto.ICON_SPARKLE_DOUBLE_24;
                case 432:
                    return IconDto.ICON_SPEED_DOWN_24;
                case 433:
                    return IconDto.ICON_SPEED_UP_24;
                case 434:
                    return IconDto.ICON_STAR_FILLED_12;
                case 435:
                    return IconDto.ICON_STAR_FILLED_16;
                case 436:
                    return IconDto.ICON_STAR_FILLED_24;
                case 437:
                    return IconDto.ICON_STAR_OUTLINE_16;
                case 438:
                    return IconDto.ICON_STAR_OUTLINE_24;
                case 439:
                    return IconDto.ICON_STAR_PASSWORD_16;
                case 440:
                    return IconDto.ICON_STEWARDSHIP_24;
                case 441:
                    return IconDto.ICON_STOCK_DOWN_12;
                case 442:
                    return IconDto.ICON_STOCK_DOWN_16;
                case 443:
                    return IconDto.ICON_STOCK_DOWN_24;
                case 444:
                    return IconDto.ICON_STOCK_UP_12;
                case 445:
                    return IconDto.ICON_STOCK_UP_16;
                case 446:
                    return IconDto.ICON_STOCK_UP_24;
                case 447:
                    return IconDto.ICON_STOPWATCH_16;
                case 448:
                    return IconDto.ICON_STOPWATCH_24;
                case 449:
                    return IconDto.ICON_STOPWATCH_32;
                case 450:
                    return IconDto.ICON_STRATEGY_OUTLOOK_24;
                case 451:
                    return IconDto.ICON_SWIPE_DOWN_16;
                case 452:
                    return IconDto.ICON_SWIPE_DOWN_24;
                case 453:
                    return IconDto.ICON_SWIPE_UP_16;
                case 454:
                    return IconDto.ICON_SWIPE_UP_24;
                case 455:
                    return IconDto.ICON_SWITCH_16;
                case WaitlistAnimationConstants.MIDDLE_YAW_FRAME /* 456 */:
                    return IconDto.ICON_SWITCH_24;
                case 457:
                    return IconDto.ICON_TAB_ACCOUNT_32;
                case 458:
                    return IconDto.ICON_TAB_CONTENT_32;
                case 459:
                    return IconDto.ICON_TAB_CRYPTO_32;
                case 460:
                    return IconDto.ICON_TAB_CRYPTO_C_32;
                case 461:
                    return IconDto.ICON_TAB_GOLD_32;
                case 462:
                    return IconDto.ICON_TAB_INVEST_32;
                case 463:
                    return IconDto.ICON_TAB_ISA_32;
                case 464:
                    return IconDto.ICON_TAB_MESSAGES_32;
                case 465:
                    return IconDto.ICON_TAB_MONEY_32;
                case 466:
                    return IconDto.ICON_TAB_RETIREMENT_32;
                case 467:
                    return IconDto.ICON_TAB_SEARCH_32;
                case 468:
                    return IconDto.ICON_TAB_SOCIAL_32;
                case 469:
                    return IconDto.ICON_TAB_WATCHLIST_32;
                case 470:
                    return IconDto.ICON_TAG_16;
                case 471:
                    return IconDto.ICON_TAG_24;
                case 472:
                    return IconDto.ICON_TAX_LOTS_LONG_TERM_16;
                case 473:
                    return IconDto.ICON_TAX_LOTS_SHORT_TERM_16;
                case 474:
                    return IconDto.ICON_TECHNOLOGY_12;
                case 475:
                    return IconDto.ICON_TECHNOLOGY_24;
                case 476:
                    return IconDto.ICON_THUMBPRINT_16;
                case 477:
                    return IconDto.ICON_THUMBPRINT_24;
                case 478:
                    return IconDto.ICON_THUMBS_DOWN_16;
                case 479:
                    return IconDto.ICON_THUMBS_DOWN_24;
                case 480:
                    return IconDto.ICON_THUMBS_UP_16;
                case 481:
                    return IconDto.ICON_THUMBS_UP_24;
                case 482:
                    return IconDto.ICON_TICKET_16;
                case 483:
                    return IconDto.ICON_TICKET_24;
                case 484:
                    return IconDto.ICON_TOUCH_ID_ANDROID_16;
                case 485:
                    return IconDto.ICON_TOUCH_ID_ANDROID_24;
                case 486:
                    return IconDto.ICON_TRADE_SOCIAL_FILLED_20;
                case 487:
                    return IconDto.ICON_TRADE_SOCIAL_OUTLINE_20;
                case 488:
                    return IconDto.ICON_TRANSFERS_12;
                case 489:
                    return IconDto.ICON_TRANSFERS_16;
                case 490:
                    return IconDto.ICON_TRANSFERS_24;
                case 491:
                    return IconDto.ICON_TRANSPORT_24;
                case 492:
                    return IconDto.ICON_TRASH_12;
                case 493:
                    return IconDto.ICON_TRASH_16;
                case 494:
                    return IconDto.ICON_TRASH_24;
                case 495:
                    return IconDto.ICON_TRIANGLE_ALERT_16;
                case 496:
                    return IconDto.ICON_TRIANGLE_ALERT_24;
                case 497:
                    return IconDto.ICON_TUNER_16;
                case 498:
                    return IconDto.ICON_TUNER_24;
                case 499:
                    return IconDto.ICON_UNLOCK_12;
                case 500:
                    return IconDto.ICON_UNLOCK_16;
                case 501:
                    return IconDto.ICON_UNLOCK_24;
                case com.withpersona.sdk2.inquiry.network.core.HttpStatusCode.BAD_GATEWAY_502 /* 502 */:
                    return IconDto.ICON_UPLOAD_24;
                case 503:
                    return IconDto.ICON_VIDEO_CALL_12;
                case 504:
                    return IconDto.ICON_VIDEO_CALL_16;
                case 505:
                    return IconDto.ICON_VIDEO_CALL_24;
                case 506:
                    return IconDto.ICON_VIDEO_FAST_FORWARD_24;
                case 507:
                    return IconDto.ICON_VIDEO_REPLAY_24;
                case 508:
                    return IconDto.ICON_VIDEO_REWIND_15_32;
                case 509:
                    return IconDto.ICON_VIDEO_REWIND_24;
                case 510:
                    return IconDto.ICON_VIDEO_SKIP_15_32;
                case 511:
                    return IconDto.ICON_WALLET_24;
                case 512:
                    return IconDto.ICON_WALLET_32;
                case 513:
                    return IconDto.ICON_WALLETCONNECT_16;
                case 514:
                    return IconDto.ICON_WALLETCONNECT_24;
                case 515:
                    return IconDto.ICON_WC_SCAN_24;
                case WaitlistAnimationConstants.RIGHT_YAW_END /* 516 */:
                    return IconDto.ICON_WITHDRAW_16;
                case 517:
                    return IconDto.ICON_WITHDRAW_24;
                case 518:
                    return IconDto.ICON_ZOOM_IN_24;
                case 519:
                    return IconDto.ICON_ZOOM_OUT_24;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: IconDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrh_server_driven_ui/v1/IconDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/IconDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<IconDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<IconDto, Icon> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rh_server_driven_ui.v1.Icon", IconDto.getEntries(), IconDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public IconDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (IconDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, IconDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static IconDto valueOf(String str) {
        return (IconDto) Enum.valueOf(IconDto.class, str);
    }

    public static IconDto[] values() {
        return (IconDto[]) $VALUES.clone();
    }
}
