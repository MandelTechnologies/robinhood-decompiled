package rosetta.blockchain.p533v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.apitestdata.models.ApiCreateUserRequest;
import com.robinhood.android.equities.companyfinancials.p116ui.CompanyFinancialsSection;
import com.robinhood.android.optionschain.sbschain.onboarding.OptionChainOnboardingDuxo;
import com.robinhood.android.portfolio.pnl.fixtures.ProfitAndLossTradeItemFixtures;
import com.robinhood.android.waitlist.spot.WaitlistAnimationConstants;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.dao.RhRoomDatabase;
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
/* compiled from: CurrencyDto.kt */
@Metadata(m3635d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0003\bÁ\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 Î\u00042\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0004Î\u0004Ï\u0004B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010Ç\u0004\u001a\u00030È\u00042\b\u0010É\u0004\u001a\u00030Ê\u00042\b\u0010Ë\u0004\u001a\u00030Ì\u0004H\u0016J\n\u0010Í\u0004\u001a\u00030Ì\u0004H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001j\u0003\b\u0098\u0001j\u0003\b\u0099\u0001j\u0003\b\u009a\u0001j\u0003\b\u009b\u0001j\u0003\b\u009c\u0001j\u0003\b\u009d\u0001j\u0003\b\u009e\u0001j\u0003\b\u009f\u0001j\u0003\b \u0001j\u0003\b¡\u0001j\u0003\b¢\u0001j\u0003\b£\u0001j\u0003\b¤\u0001j\u0003\b¥\u0001j\u0003\b¦\u0001j\u0003\b§\u0001j\u0003\b¨\u0001j\u0003\b©\u0001j\u0003\bª\u0001j\u0003\b«\u0001j\u0003\b¬\u0001j\u0003\b\u00ad\u0001j\u0003\b®\u0001j\u0003\b¯\u0001j\u0003\b°\u0001j\u0003\b±\u0001j\u0003\b²\u0001j\u0003\b³\u0001j\u0003\b´\u0001j\u0003\bµ\u0001j\u0003\b¶\u0001j\u0003\b·\u0001j\u0003\b¸\u0001j\u0003\b¹\u0001j\u0003\bº\u0001j\u0003\b»\u0001j\u0003\b¼\u0001j\u0003\b½\u0001j\u0003\b¾\u0001j\u0003\b¿\u0001j\u0003\bÀ\u0001j\u0003\bÁ\u0001j\u0003\bÂ\u0001j\u0003\bÃ\u0001j\u0003\bÄ\u0001j\u0003\bÅ\u0001j\u0003\bÆ\u0001j\u0003\bÇ\u0001j\u0003\bÈ\u0001j\u0003\bÉ\u0001j\u0003\bÊ\u0001j\u0003\bË\u0001j\u0003\bÌ\u0001j\u0003\bÍ\u0001j\u0003\bÎ\u0001j\u0003\bÏ\u0001j\u0003\bÐ\u0001j\u0003\bÑ\u0001j\u0003\bÒ\u0001j\u0003\bÓ\u0001j\u0003\bÔ\u0001j\u0003\bÕ\u0001j\u0003\bÖ\u0001j\u0003\b×\u0001j\u0003\bØ\u0001j\u0003\bÙ\u0001j\u0003\bÚ\u0001j\u0003\bÛ\u0001j\u0003\bÜ\u0001j\u0003\bÝ\u0001j\u0003\bÞ\u0001j\u0003\bß\u0001j\u0003\bà\u0001j\u0003\bá\u0001j\u0003\bâ\u0001j\u0003\bã\u0001j\u0003\bä\u0001j\u0003\bå\u0001j\u0003\bæ\u0001j\u0003\bç\u0001j\u0003\bè\u0001j\u0003\bé\u0001j\u0003\bê\u0001j\u0003\bë\u0001j\u0003\bì\u0001j\u0003\bí\u0001j\u0003\bî\u0001j\u0003\bï\u0001j\u0003\bð\u0001j\u0003\bñ\u0001j\u0003\bò\u0001j\u0003\bó\u0001j\u0003\bô\u0001j\u0003\bõ\u0001j\u0003\bö\u0001j\u0003\b÷\u0001j\u0003\bø\u0001j\u0003\bù\u0001j\u0003\bú\u0001j\u0003\bû\u0001j\u0003\bü\u0001j\u0003\bý\u0001j\u0003\bþ\u0001j\u0003\bÿ\u0001j\u0003\b\u0080\u0002j\u0003\b\u0081\u0002j\u0003\b\u0082\u0002j\u0003\b\u0083\u0002j\u0003\b\u0084\u0002j\u0003\b\u0085\u0002j\u0003\b\u0086\u0002j\u0003\b\u0087\u0002j\u0003\b\u0088\u0002j\u0003\b\u0089\u0002j\u0003\b\u008a\u0002j\u0003\b\u008b\u0002j\u0003\b\u008c\u0002j\u0003\b\u008d\u0002j\u0003\b\u008e\u0002j\u0003\b\u008f\u0002j\u0003\b\u0090\u0002j\u0003\b\u0091\u0002j\u0003\b\u0092\u0002j\u0003\b\u0093\u0002j\u0003\b\u0094\u0002j\u0003\b\u0095\u0002j\u0003\b\u0096\u0002j\u0003\b\u0097\u0002j\u0003\b\u0098\u0002j\u0003\b\u0099\u0002j\u0003\b\u009a\u0002j\u0003\b\u009b\u0002j\u0003\b\u009c\u0002j\u0003\b\u009d\u0002j\u0003\b\u009e\u0002j\u0003\b\u009f\u0002j\u0003\b \u0002j\u0003\b¡\u0002j\u0003\b¢\u0002j\u0003\b£\u0002j\u0003\b¤\u0002j\u0003\b¥\u0002j\u0003\b¦\u0002j\u0003\b§\u0002j\u0003\b¨\u0002j\u0003\b©\u0002j\u0003\bª\u0002j\u0003\b«\u0002j\u0003\b¬\u0002j\u0003\b\u00ad\u0002j\u0003\b®\u0002j\u0003\b¯\u0002j\u0003\b°\u0002j\u0003\b±\u0002j\u0003\b²\u0002j\u0003\b³\u0002j\u0003\b´\u0002j\u0003\bµ\u0002j\u0003\b¶\u0002j\u0003\b·\u0002j\u0003\b¸\u0002j\u0003\b¹\u0002j\u0003\bº\u0002j\u0003\b»\u0002j\u0003\b¼\u0002j\u0003\b½\u0002j\u0003\b¾\u0002j\u0003\b¿\u0002j\u0003\bÀ\u0002j\u0003\bÁ\u0002j\u0003\bÂ\u0002j\u0003\bÃ\u0002j\u0003\bÄ\u0002j\u0003\bÅ\u0002j\u0003\bÆ\u0002j\u0003\bÇ\u0002j\u0003\bÈ\u0002j\u0003\bÉ\u0002j\u0003\bÊ\u0002j\u0003\bË\u0002j\u0003\bÌ\u0002j\u0003\bÍ\u0002j\u0003\bÎ\u0002j\u0003\bÏ\u0002j\u0003\bÐ\u0002j\u0003\bÑ\u0002j\u0003\bÒ\u0002j\u0003\bÓ\u0002j\u0003\bÔ\u0002j\u0003\bÕ\u0002j\u0003\bÖ\u0002j\u0003\b×\u0002j\u0003\bØ\u0002j\u0003\bÙ\u0002j\u0003\bÚ\u0002j\u0003\bÛ\u0002j\u0003\bÜ\u0002j\u0003\bÝ\u0002j\u0003\bÞ\u0002j\u0003\bß\u0002j\u0003\bà\u0002j\u0003\bá\u0002j\u0003\bâ\u0002j\u0003\bã\u0002j\u0003\bä\u0002j\u0003\bå\u0002j\u0003\bæ\u0002j\u0003\bç\u0002j\u0003\bè\u0002j\u0003\bé\u0002j\u0003\bê\u0002j\u0003\bë\u0002j\u0003\bì\u0002j\u0003\bí\u0002j\u0003\bî\u0002j\u0003\bï\u0002j\u0003\bð\u0002j\u0003\bñ\u0002j\u0003\bò\u0002j\u0003\bó\u0002j\u0003\bô\u0002j\u0003\bõ\u0002j\u0003\bö\u0002j\u0003\b÷\u0002j\u0003\bø\u0002j\u0003\bù\u0002j\u0003\bú\u0002j\u0003\bû\u0002j\u0003\bü\u0002j\u0003\bý\u0002j\u0003\bþ\u0002j\u0003\bÿ\u0002j\u0003\b\u0080\u0003j\u0003\b\u0081\u0003j\u0003\b\u0082\u0003j\u0003\b\u0083\u0003j\u0003\b\u0084\u0003j\u0003\b\u0085\u0003j\u0003\b\u0086\u0003j\u0003\b\u0087\u0003j\u0003\b\u0088\u0003j\u0003\b\u0089\u0003j\u0003\b\u008a\u0003j\u0003\b\u008b\u0003j\u0003\b\u008c\u0003j\u0003\b\u008d\u0003j\u0003\b\u008e\u0003j\u0003\b\u008f\u0003j\u0003\b\u0090\u0003j\u0003\b\u0091\u0003j\u0003\b\u0092\u0003j\u0003\b\u0093\u0003j\u0003\b\u0094\u0003j\u0003\b\u0095\u0003j\u0003\b\u0096\u0003j\u0003\b\u0097\u0003j\u0003\b\u0098\u0003j\u0003\b\u0099\u0003j\u0003\b\u009a\u0003j\u0003\b\u009b\u0003j\u0003\b\u009c\u0003j\u0003\b\u009d\u0003j\u0003\b\u009e\u0003j\u0003\b\u009f\u0003j\u0003\b \u0003j\u0003\b¡\u0003j\u0003\b¢\u0003j\u0003\b£\u0003j\u0003\b¤\u0003j\u0003\b¥\u0003j\u0003\b¦\u0003j\u0003\b§\u0003j\u0003\b¨\u0003j\u0003\b©\u0003j\u0003\bª\u0003j\u0003\b«\u0003j\u0003\b¬\u0003j\u0003\b\u00ad\u0003j\u0003\b®\u0003j\u0003\b¯\u0003j\u0003\b°\u0003j\u0003\b±\u0003j\u0003\b²\u0003j\u0003\b³\u0003j\u0003\b´\u0003j\u0003\bµ\u0003j\u0003\b¶\u0003j\u0003\b·\u0003j\u0003\b¸\u0003j\u0003\b¹\u0003j\u0003\bº\u0003j\u0003\b»\u0003j\u0003\b¼\u0003j\u0003\b½\u0003j\u0003\b¾\u0003j\u0003\b¿\u0003j\u0003\bÀ\u0003j\u0003\bÁ\u0003j\u0003\bÂ\u0003j\u0003\bÃ\u0003j\u0003\bÄ\u0003j\u0003\bÅ\u0003j\u0003\bÆ\u0003j\u0003\bÇ\u0003j\u0003\bÈ\u0003j\u0003\bÉ\u0003j\u0003\bÊ\u0003j\u0003\bË\u0003j\u0003\bÌ\u0003j\u0003\bÍ\u0003j\u0003\bÎ\u0003j\u0003\bÏ\u0003j\u0003\bÐ\u0003j\u0003\bÑ\u0003j\u0003\bÒ\u0003j\u0003\bÓ\u0003j\u0003\bÔ\u0003j\u0003\bÕ\u0003j\u0003\bÖ\u0003j\u0003\b×\u0003j\u0003\bØ\u0003j\u0003\bÙ\u0003j\u0003\bÚ\u0003j\u0003\bÛ\u0003j\u0003\bÜ\u0003j\u0003\bÝ\u0003j\u0003\bÞ\u0003j\u0003\bß\u0003j\u0003\bà\u0003j\u0003\bá\u0003j\u0003\bâ\u0003j\u0003\bã\u0003j\u0003\bä\u0003j\u0003\bå\u0003j\u0003\bæ\u0003j\u0003\bç\u0003j\u0003\bè\u0003j\u0003\bé\u0003j\u0003\bê\u0003j\u0003\bë\u0003j\u0003\bì\u0003j\u0003\bí\u0003j\u0003\bî\u0003j\u0003\bï\u0003j\u0003\bð\u0003j\u0003\bñ\u0003j\u0003\bò\u0003j\u0003\bó\u0003j\u0003\bô\u0003j\u0003\bõ\u0003j\u0003\bö\u0003j\u0003\b÷\u0003j\u0003\bø\u0003j\u0003\bù\u0003j\u0003\bú\u0003j\u0003\bû\u0003j\u0003\bü\u0003j\u0003\bý\u0003j\u0003\bþ\u0003j\u0003\bÿ\u0003j\u0003\b\u0080\u0004j\u0003\b\u0081\u0004j\u0003\b\u0082\u0004j\u0003\b\u0083\u0004j\u0003\b\u0084\u0004j\u0003\b\u0085\u0004j\u0003\b\u0086\u0004j\u0003\b\u0087\u0004j\u0003\b\u0088\u0004j\u0003\b\u0089\u0004j\u0003\b\u008a\u0004j\u0003\b\u008b\u0004j\u0003\b\u008c\u0004j\u0003\b\u008d\u0004j\u0003\b\u008e\u0004j\u0003\b\u008f\u0004j\u0003\b\u0090\u0004j\u0003\b\u0091\u0004j\u0003\b\u0092\u0004j\u0003\b\u0093\u0004j\u0003\b\u0094\u0004j\u0003\b\u0095\u0004j\u0003\b\u0096\u0004j\u0003\b\u0097\u0004j\u0003\b\u0098\u0004j\u0003\b\u0099\u0004j\u0003\b\u009a\u0004j\u0003\b\u009b\u0004j\u0003\b\u009c\u0004j\u0003\b\u009d\u0004j\u0003\b\u009e\u0004j\u0003\b\u009f\u0004j\u0003\b \u0004j\u0003\b¡\u0004j\u0003\b¢\u0004j\u0003\b£\u0004j\u0003\b¤\u0004j\u0003\b¥\u0004j\u0003\b¦\u0004j\u0003\b§\u0004j\u0003\b¨\u0004j\u0003\b©\u0004j\u0003\bª\u0004j\u0003\b«\u0004j\u0003\b¬\u0004j\u0003\b\u00ad\u0004j\u0003\b®\u0004j\u0003\b¯\u0004j\u0003\b°\u0004j\u0003\b±\u0004j\u0003\b²\u0004j\u0003\b³\u0004j\u0003\b´\u0004j\u0003\bµ\u0004j\u0003\b¶\u0004j\u0003\b·\u0004j\u0003\b¸\u0004j\u0003\b¹\u0004j\u0003\bº\u0004j\u0003\b»\u0004j\u0003\b¼\u0004j\u0003\b½\u0004j\u0003\b¾\u0004j\u0003\b¿\u0004j\u0003\bÀ\u0004j\u0003\bÁ\u0004j\u0003\bÂ\u0004j\u0003\bÃ\u0004j\u0003\bÄ\u0004j\u0003\bÅ\u0004j\u0003\bÆ\u0004¨\u0006Ð\u0004"}, m3636d2 = {"Lrosetta/blockchain/v1/CurrencyDto;", "Lcom/robinhood/idl/EnumDto;", "Lrosetta/blockchain/v1/Currency;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "CURRENCY_UNSPECIFIED", ApiCreateUserRequest.SYMBOL_FOR_CRYPTO, "BCH", "BSV", "LTC", "DOGE", "ETH", "ETC", "USD", "USDT", "XRP", "QTUM", "NEO", "XMR", "DASH", "BTG", "LSK", "OMG", "BNB", "USDC", "LUNA", "XLM", "ZEC", "SOL", "ADA", "AVAX", "DOT", "BUSD", "UST", "CRO", "DAI", "ATOM", "NEAR", "UNI", "FTT", "TRX", "ALGO", "LEO", "FTM", "BTCB", "HBAR", "ICP", "SAND", "FIL", "AXS", "VET", "EGLD", "THETA", "KLAY", "XTZ", "HNT", "FLOW", "AAVE", "LINK", "LRC", "SHIB", "COMP", "MATIC", "MANA", "CELO", "BAL", "WETH", "ZRX", "RUNE", "PAXG", "CAKE", "USDP", "STX", "APE", "YFI", "BAT", "GUSD", "ENJ", "WBTC", "DCR", "XEM", "MKR", "TUSD", "DFI", "RARI", "WAVES", "CRV", "FRAX", "GMT", "GRT", "MIOTA", "ETHW", "LDO", "CELR", "LOOM", "GHST", "PEPE", "CVX", "HOPR", "EOS", "EUROC", "FUN", "OCEAN", "SNX", "SUSHI", "ARB", "BONK", "OP", "TIA", "WIF", "COQ", "JUP", "TON", "W", "STETH", "ZK", "ZRO", "EUR", "IMX", "RENDER", "FLOKI", "EIGEN", "ENA", "EURC", "AKT", "PYUSD", "POL", "AAPL", "TSLA", "S", "TRUMP", "PENGU", "ONDO", "INJ", "JASMY", "STRK", "PYTH", "STO", "COON", "RANP", "ALTL", "AEC", "STOP", "POPCAT", "VIRTUAL", "PNUT", "MEW", "SIMPSON", "VINO", "YOM", "BERA", "AMEX", "KCT", "XAI", "ATC", "HOOD", "AMZN", "GME", "AMD", "META", "CRWD", "COIN", "MSTR", "GOOG", "PLTR", "QNT", "AKITA", "SAFEMOON", "BABYUNI", "MEGA", "ONEINCH", "AMP", "AUDIO", "BAND", "BLUR", "BNT", "BOME", "CHZ", "COREUM", "CSPR", "CTSI", "CVC", "CXT", "CTX", "DGLD", "DYDX", "ENS", "EURCV", "EURT", "FET", "FLR", "GALA", "GYEN", "KNC", "LMWR", "MELANIA", "MOG", "NEXO", "PERP", "RAD", "RLUSD", "RLY", "SEI", "SGB", "SKL", "SLP", "SMT", "SPELL", "STORJ", "SUI", "SYRUP", "TRAC", "TRUF", "UMA", "VCHF", "VEUR", "VEXT", "WEN", "WOO", "WECAN", "XCHNG", "XDC", "XSGD", "ZETA", "ZUSD", "MOODENG", "GLUB", "NOODLE", "PLS", "TURBO", "GMXP", "SDS", "MTC", "TMDX", "ELON", "IVV", "HMND", "HONEY", "LAYER", "GLMR", "KO", "SPOT", "SMCX", "GIGA", "USFR", "VZ", "IAU", "ARPA", "UAL", "RAY", "ME", "MRVL", "HOT", "UPS", "BA", "DEPRECATED_EUROC", "GEV", "TZA", "GAL", "LMT", "GE", "CONY", "BIO", "CELH", "IOST", "ZEUS", "GNO", "SPXU", "SCHD", "SLV", "RPL", "PLA", "WAMPL", "ROOT", "KAVA", "PINS", "MOVE", "SOXL", "INTR", "INDEX", "CVS", "AVGO", "WLD", "BRETT", "PANW", "WDAY", "SNAP", "BOBA", "BABYDOGE", "MASK", "KHC", "ORCL", "RDDT", "INTC", "TMF", "ANKR", "RIVN", "PRIME", "MORPHO", "LYFT", "EUL", "XYO", "RKT", "INOD", "RBLX", "VTI", "POLS", "BEAM", "AAL", "MYTH", "JNJ", "SRPT", "PHA", "FARTCOIN", "QCOM", "ABNB", "KGC", "AIOZ", "JEPQ", "TGT", "TEM", "CAVA", "PFE", "U", "LQTY", "DOGINME", "AI", "SNOW", "IO", "CKB", CountryCode.COUNTRY_CODE_NU, "TQQQ", "KAP", "HOOK", "RNDR", "VUG", "ACS", "ROUTE", "MRNA", "SHOP", "B3", "UNH", "ARC", "DAL", "ZKJ", "MAGS", "MSTZ", "BTRST", "SUPER", "OKTA", "ZIL", "DKS", "F", "CLF", "ROKU", "BIGTIME", "GRASS", "AVA", "BIL", "AFRM", "TNA", "AMPL", "GOAT", "IBIT", "AIXBT", "ONE", "GAP", "GOOGL", "VRT", "CHEX", "HUM", "TTWO", "HD", "VXX", "RDNT", "SMCI", "CFX", "SOXS", "INDP", "PAAL", "ENPH", "CLSK", "KEY", "AGIX", "JTO", "ACE", "PYPL", "AI16Z", "CSCO", "SPXS", "TECL", "FXS", "ETHFI", "ALCH", "LLY", "PYR", "IBKR", "AERO", "LPT", "ARKM", "ACX", "TRNR", "BICO", "MSTY", "CEG", "BITU", "VGT", "DECK", "WEEK", "NKE", "TTD", "AMAT", "VOO", "SBUX", "AIDOGE", "IWM", "CVNA", "RWM", "BROS", "OKLO", "FBTC", "KOLD", "SOFI", "OUNZ", "ZVZZT", "MSFT", "OM", "TOSHI", "ORDI", "DOCS", "UPRO", "OSCR", "GDX", "APP", "MXC", "PEP", "CFG", "API3", "NFLX", "REQ", "ELF", "YGG", "DKNG", "PONKE", "PENDLE", "ALT", "DELL", "IAUM", "NVD", "REN", "KCS", "CLS", "CCL", "ANET", "NVDL", "VST", "VVV", "FSLR", "CLANKER", "SPXL", "OPAI", "MU", "CONL", "STG", "HUT", "LABU", "RED", "PLUME", "MRK", "IOTX", "DJT", "AYRO", "FAI", "HFT", "NBIS", "MNT", "BITO", "JPM", "IONQ", "KP3R", "COW", "GLD", "LCX", "SQQQ", CountryCode.COUNTRY_CODE_MP, "ORCA", "SGOV", "KAITO", "RIOT", "NOW", "MARA", ProfitAndLossTradeItemFixtures.REQUEST_SYMBOL, "MPLX", "MELI", "ZIM", "QRDO", "APT", "XYZ", "NVDA", "MAGIC", "ALEX", "COST", "QUARTZ", "XOM", "SPACEX", "QQQ", "ACH", "ATH", "DIS", "SAFE", "TLT", "OXY", "RLC", "GEOD", "KMNO", "COOKIE", "UBER", "KWEB", "ALAB", "GNLN", "CRCL", "BITI", OptionChainOnboardingDuxo.DEFAULT, "QQQM", "GRIFFAIN", "WELL", "JEPI", "SBIT", "NVDU", "ETHA", "TMUS", "DRIFT", "NVDY", "SMH", "FAZ", "T", "AAAU", "LABD", "AXL", OptionChainOnboardingDuxo.UK_DEFAULT, "QWAN", "GMX", "TSLY", "QLD", "YMAX", "TSLL", "CMG", "CRM", "BAC", "RUN", "HIMS", "KSM", "SGOL", "NEIRO", "ARKB", "EL", "NCLH", "NET", "SMR", "METIS", "UPST", "TNSR", "WMT", "LBRDA", "ARKG", "GLIBA", "GLBAV", "WLFI", "ZORA", "ASTER", "XPL", "HYPE", "AVNT", "OPENL", "OPENW", "OPENZ", "XCN", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.blockchain.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public abstract class CurrencyDto implements Dto2<Currency>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CurrencyDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<CurrencyDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CurrencyDto, Currency>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final CurrencyDto CURRENCY_UNSPECIFIED = new CurrencyDto("CURRENCY_UNSPECIFIED", 0) { // from class: rosetta.blockchain.v1.CurrencyDto.CURRENCY_UNSPECIFIED
        {
            String str = "unspecified";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.CURRENCY_UNSPECIFIED;
        }
    };
    public static final CurrencyDto BTC = new CurrencyDto(ApiCreateUserRequest.SYMBOL_FOR_CRYPTO, 1) { // from class: rosetta.blockchain.v1.CurrencyDto.BTC
        {
            String str = ApiCreateUserRequest.SYMBOL_FOR_CRYPTO;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.BTC;
        }
    };
    public static final CurrencyDto BCH = new CurrencyDto("BCH", 2) { // from class: rosetta.blockchain.v1.CurrencyDto.BCH
        {
            String str = "BCH";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.BCH;
        }
    };
    public static final CurrencyDto BSV = new CurrencyDto("BSV", 3) { // from class: rosetta.blockchain.v1.CurrencyDto.BSV
        {
            String str = "BSV";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.BSV;
        }
    };
    public static final CurrencyDto LTC = new CurrencyDto("LTC", 4) { // from class: rosetta.blockchain.v1.CurrencyDto.LTC
        {
            String str = "LTC";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.LTC;
        }
    };
    public static final CurrencyDto DOGE = new CurrencyDto("DOGE", 5) { // from class: rosetta.blockchain.v1.CurrencyDto.DOGE
        {
            String str = "DOGE";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.DOGE;
        }
    };
    public static final CurrencyDto ETH = new CurrencyDto("ETH", 6) { // from class: rosetta.blockchain.v1.CurrencyDto.ETH
        {
            String str = "ETH";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ETH;
        }
    };
    public static final CurrencyDto ETC = new CurrencyDto("ETC", 7) { // from class: rosetta.blockchain.v1.CurrencyDto.ETC
        {
            String str = "ETC";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ETC;
        }
    };
    public static final CurrencyDto USD = new CurrencyDto("USD", 8) { // from class: rosetta.blockchain.v1.CurrencyDto.USD
        {
            String str = "USD";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.USD;
        }
    };
    public static final CurrencyDto USDT = new CurrencyDto("USDT", 9) { // from class: rosetta.blockchain.v1.CurrencyDto.USDT
        {
            String str = "USDT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.USDT;
        }
    };
    public static final CurrencyDto XRP = new CurrencyDto("XRP", 10) { // from class: rosetta.blockchain.v1.CurrencyDto.XRP
        {
            String str = "XRP";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.XRP;
        }
    };
    public static final CurrencyDto QTUM = new CurrencyDto("QTUM", 11) { // from class: rosetta.blockchain.v1.CurrencyDto.QTUM
        {
            String str = "QTUM";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.QTUM;
        }
    };
    public static final CurrencyDto NEO = new CurrencyDto("NEO", 12) { // from class: rosetta.blockchain.v1.CurrencyDto.NEO
        {
            String str = "NEO";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.NEO;
        }
    };
    public static final CurrencyDto XMR = new CurrencyDto("XMR", 13) { // from class: rosetta.blockchain.v1.CurrencyDto.XMR
        {
            String str = "XMR";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.XMR;
        }
    };
    public static final CurrencyDto DASH = new CurrencyDto("DASH", 14) { // from class: rosetta.blockchain.v1.CurrencyDto.DASH
        {
            String str = "DASH";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.DASH;
        }
    };
    public static final CurrencyDto BTG = new CurrencyDto("BTG", 15) { // from class: rosetta.blockchain.v1.CurrencyDto.BTG
        {
            String str = "BTG";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.BTG;
        }
    };
    public static final CurrencyDto LSK = new CurrencyDto("LSK", 16) { // from class: rosetta.blockchain.v1.CurrencyDto.LSK
        {
            String str = "LSK";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.LSK;
        }
    };
    public static final CurrencyDto OMG = new CurrencyDto("OMG", 17) { // from class: rosetta.blockchain.v1.CurrencyDto.OMG
        {
            String str = "OMG";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.OMG;
        }
    };
    public static final CurrencyDto BNB = new CurrencyDto("BNB", 18) { // from class: rosetta.blockchain.v1.CurrencyDto.BNB
        {
            String str = "BNB";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.BNB;
        }
    };
    public static final CurrencyDto USDC = new CurrencyDto("USDC", 19) { // from class: rosetta.blockchain.v1.CurrencyDto.USDC
        {
            String str = "USDC";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.USDC;
        }
    };
    public static final CurrencyDto LUNA = new CurrencyDto("LUNA", 20) { // from class: rosetta.blockchain.v1.CurrencyDto.LUNA
        {
            String str = "LUNA";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.LUNA;
        }
    };
    public static final CurrencyDto XLM = new CurrencyDto("XLM", 21) { // from class: rosetta.blockchain.v1.CurrencyDto.XLM
        {
            String str = "XLM";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.XLM;
        }
    };
    public static final CurrencyDto ZEC = new CurrencyDto("ZEC", 22) { // from class: rosetta.blockchain.v1.CurrencyDto.ZEC
        {
            String str = "ZEC";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ZEC;
        }
    };
    public static final CurrencyDto SOL = new CurrencyDto("SOL", 23) { // from class: rosetta.blockchain.v1.CurrencyDto.SOL
        {
            String str = "SOL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SOL;
        }
    };
    public static final CurrencyDto ADA = new CurrencyDto("ADA", 24) { // from class: rosetta.blockchain.v1.CurrencyDto.ADA
        {
            String str = "ADA";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ADA;
        }
    };
    public static final CurrencyDto AVAX = new CurrencyDto("AVAX", 25) { // from class: rosetta.blockchain.v1.CurrencyDto.AVAX
        {
            String str = "AVAX";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.AVAX;
        }
    };
    public static final CurrencyDto DOT = new CurrencyDto("DOT", 26) { // from class: rosetta.blockchain.v1.CurrencyDto.DOT
        {
            String str = "DOT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.DOT;
        }
    };
    public static final CurrencyDto BUSD = new CurrencyDto("BUSD", 27) { // from class: rosetta.blockchain.v1.CurrencyDto.BUSD
        {
            String str = "BUSD";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.BUSD;
        }
    };
    public static final CurrencyDto UST = new CurrencyDto("UST", 28) { // from class: rosetta.blockchain.v1.CurrencyDto.UST
        {
            String str = "UST";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.UST;
        }
    };
    public static final CurrencyDto CRO = new CurrencyDto("CRO", 29) { // from class: rosetta.blockchain.v1.CurrencyDto.CRO
        {
            String str = "CRO";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.CRO;
        }
    };
    public static final CurrencyDto DAI = new CurrencyDto("DAI", 30) { // from class: rosetta.blockchain.v1.CurrencyDto.DAI
        {
            String str = "DAI";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.DAI;
        }
    };
    public static final CurrencyDto ATOM = new CurrencyDto("ATOM", 31) { // from class: rosetta.blockchain.v1.CurrencyDto.ATOM
        {
            String str = "ATOM";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ATOM;
        }
    };
    public static final CurrencyDto NEAR = new CurrencyDto("NEAR", 32) { // from class: rosetta.blockchain.v1.CurrencyDto.NEAR
        {
            String str = "NEAR";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.NEAR;
        }
    };
    public static final CurrencyDto UNI = new CurrencyDto("UNI", 33) { // from class: rosetta.blockchain.v1.CurrencyDto.UNI
        {
            String str = "UNI";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.UNI;
        }
    };
    public static final CurrencyDto FTT = new CurrencyDto("FTT", 34) { // from class: rosetta.blockchain.v1.CurrencyDto.FTT
        {
            String str = "FTT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.FTT;
        }
    };
    public static final CurrencyDto TRX = new CurrencyDto("TRX", 35) { // from class: rosetta.blockchain.v1.CurrencyDto.TRX
        {
            String str = "TRX";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.TRX;
        }
    };
    public static final CurrencyDto ALGO = new CurrencyDto("ALGO", 36) { // from class: rosetta.blockchain.v1.CurrencyDto.ALGO
        {
            String str = "ALGO";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ALGO;
        }
    };
    public static final CurrencyDto LEO = new CurrencyDto("LEO", 37) { // from class: rosetta.blockchain.v1.CurrencyDto.LEO
        {
            String str = "LEO";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.LEO;
        }
    };
    public static final CurrencyDto FTM = new CurrencyDto("FTM", 38) { // from class: rosetta.blockchain.v1.CurrencyDto.FTM
        {
            String str = "FTM";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.FTM;
        }
    };
    public static final CurrencyDto BTCB = new CurrencyDto("BTCB", 39) { // from class: rosetta.blockchain.v1.CurrencyDto.BTCB
        {
            String str = "BTCB";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.BTCB;
        }
    };
    public static final CurrencyDto HBAR = new CurrencyDto("HBAR", 40) { // from class: rosetta.blockchain.v1.CurrencyDto.HBAR
        {
            String str = "HBAR";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.HBAR;
        }
    };
    public static final CurrencyDto ICP = new CurrencyDto("ICP", 41) { // from class: rosetta.blockchain.v1.CurrencyDto.ICP
        {
            String str = "ICP";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ICP;
        }
    };
    public static final CurrencyDto SAND = new CurrencyDto("SAND", 42) { // from class: rosetta.blockchain.v1.CurrencyDto.SAND
        {
            String str = "SAND";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SAND;
        }
    };
    public static final CurrencyDto FIL = new CurrencyDto("FIL", 43) { // from class: rosetta.blockchain.v1.CurrencyDto.FIL
        {
            String str = "FIL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.FIL;
        }
    };
    public static final CurrencyDto AXS = new CurrencyDto("AXS", 44) { // from class: rosetta.blockchain.v1.CurrencyDto.AXS
        {
            String str = "AXS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.AXS;
        }
    };
    public static final CurrencyDto VET = new CurrencyDto("VET", 45) { // from class: rosetta.blockchain.v1.CurrencyDto.VET
        {
            String str = "VET";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.VET;
        }
    };
    public static final CurrencyDto EGLD = new CurrencyDto("EGLD", 46) { // from class: rosetta.blockchain.v1.CurrencyDto.EGLD
        {
            String str = "EGLD";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.EGLD;
        }
    };
    public static final CurrencyDto THETA = new CurrencyDto("THETA", 47) { // from class: rosetta.blockchain.v1.CurrencyDto.THETA
        {
            String str = "THETA";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.THETA;
        }
    };
    public static final CurrencyDto KLAY = new CurrencyDto("KLAY", 48) { // from class: rosetta.blockchain.v1.CurrencyDto.KLAY
        {
            String str = "KLAY";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.KLAY;
        }
    };
    public static final CurrencyDto XTZ = new CurrencyDto("XTZ", 49) { // from class: rosetta.blockchain.v1.CurrencyDto.XTZ
        {
            String str = "XTZ";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.XTZ;
        }
    };
    public static final CurrencyDto HNT = new CurrencyDto("HNT", 50) { // from class: rosetta.blockchain.v1.CurrencyDto.HNT
        {
            String str = "HNT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.HNT;
        }
    };
    public static final CurrencyDto FLOW = new CurrencyDto("FLOW", 51) { // from class: rosetta.blockchain.v1.CurrencyDto.FLOW
        {
            String str = "FLOW";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.FLOW;
        }
    };
    public static final CurrencyDto AAVE = new CurrencyDto("AAVE", 52) { // from class: rosetta.blockchain.v1.CurrencyDto.AAVE
        {
            String str = "AAVE";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.AAVE;
        }
    };
    public static final CurrencyDto LINK = new CurrencyDto("LINK", 53) { // from class: rosetta.blockchain.v1.CurrencyDto.LINK
        {
            String str = "LINK";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.LINK;
        }
    };
    public static final CurrencyDto LRC = new CurrencyDto("LRC", 54) { // from class: rosetta.blockchain.v1.CurrencyDto.LRC
        {
            String str = "LRC";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.LRC;
        }
    };
    public static final CurrencyDto SHIB = new CurrencyDto("SHIB", 55) { // from class: rosetta.blockchain.v1.CurrencyDto.SHIB
        {
            String str = "SHIB";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SHIB;
        }
    };
    public static final CurrencyDto COMP = new CurrencyDto("COMP", 56) { // from class: rosetta.blockchain.v1.CurrencyDto.COMP
        {
            String str = "COMP";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.COMP;
        }
    };
    public static final CurrencyDto MATIC = new CurrencyDto("MATIC", 57) { // from class: rosetta.blockchain.v1.CurrencyDto.MATIC
        {
            String str = "MATIC";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.MATIC;
        }
    };
    public static final CurrencyDto MANA = new CurrencyDto("MANA", 58) { // from class: rosetta.blockchain.v1.CurrencyDto.MANA
        {
            String str = "MANA";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.MANA;
        }
    };
    public static final CurrencyDto CELO = new CurrencyDto("CELO", 59) { // from class: rosetta.blockchain.v1.CurrencyDto.CELO
        {
            String str = "CELO";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.CELO;
        }
    };
    public static final CurrencyDto BAL = new CurrencyDto("BAL", 60) { // from class: rosetta.blockchain.v1.CurrencyDto.BAL
        {
            String str = "BAL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.BAL;
        }
    };
    public static final CurrencyDto WETH = new CurrencyDto("WETH", 61) { // from class: rosetta.blockchain.v1.CurrencyDto.WETH
        {
            String str = "WETH";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.WETH;
        }
    };
    public static final CurrencyDto ZRX = new CurrencyDto("ZRX", 62) { // from class: rosetta.blockchain.v1.CurrencyDto.ZRX
        {
            String str = "ZRX";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ZRX;
        }
    };
    public static final CurrencyDto RUNE = new CurrencyDto("RUNE", 63) { // from class: rosetta.blockchain.v1.CurrencyDto.RUNE
        {
            String str = "RUNE";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.RUNE;
        }
    };
    public static final CurrencyDto PAXG = new CurrencyDto("PAXG", 64) { // from class: rosetta.blockchain.v1.CurrencyDto.PAXG
        {
            String str = "PAXG";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.PAXG;
        }
    };
    public static final CurrencyDto CAKE = new CurrencyDto("CAKE", 65) { // from class: rosetta.blockchain.v1.CurrencyDto.CAKE
        {
            String str = "CAKE";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.CAKE;
        }
    };
    public static final CurrencyDto USDP = new CurrencyDto("USDP", 66) { // from class: rosetta.blockchain.v1.CurrencyDto.USDP
        {
            String str = "USDP";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.USDP;
        }
    };
    public static final CurrencyDto STX = new CurrencyDto("STX", 67) { // from class: rosetta.blockchain.v1.CurrencyDto.STX
        {
            String str = "STX";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.STX;
        }
    };
    public static final CurrencyDto APE = new CurrencyDto("APE", 68) { // from class: rosetta.blockchain.v1.CurrencyDto.APE
        {
            String str = "APE";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.APE;
        }
    };
    public static final CurrencyDto YFI = new CurrencyDto("YFI", 69) { // from class: rosetta.blockchain.v1.CurrencyDto.YFI
        {
            String str = "YFI";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.YFI;
        }
    };
    public static final CurrencyDto BAT = new CurrencyDto("BAT", 70) { // from class: rosetta.blockchain.v1.CurrencyDto.BAT
        {
            String str = "BAT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.BAT;
        }
    };
    public static final CurrencyDto GUSD = new CurrencyDto("GUSD", 71) { // from class: rosetta.blockchain.v1.CurrencyDto.GUSD
        {
            String str = "GUSD";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.GUSD;
        }
    };
    public static final CurrencyDto ENJ = new CurrencyDto("ENJ", 72) { // from class: rosetta.blockchain.v1.CurrencyDto.ENJ
        {
            String str = "ENJ";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ENJ;
        }
    };
    public static final CurrencyDto WBTC = new CurrencyDto("WBTC", 73) { // from class: rosetta.blockchain.v1.CurrencyDto.WBTC
        {
            String str = "WBTC";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.WBTC;
        }
    };
    public static final CurrencyDto DCR = new CurrencyDto("DCR", 74) { // from class: rosetta.blockchain.v1.CurrencyDto.DCR
        {
            String str = "DCR";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.DCR;
        }
    };
    public static final CurrencyDto XEM = new CurrencyDto("XEM", 75) { // from class: rosetta.blockchain.v1.CurrencyDto.XEM
        {
            String str = "XEM";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.XEM;
        }
    };
    public static final CurrencyDto MKR = new CurrencyDto("MKR", 76) { // from class: rosetta.blockchain.v1.CurrencyDto.MKR
        {
            String str = "MKR";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.MKR;
        }
    };
    public static final CurrencyDto TUSD = new CurrencyDto("TUSD", 77) { // from class: rosetta.blockchain.v1.CurrencyDto.TUSD
        {
            String str = "TUSD";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.TUSD;
        }
    };
    public static final CurrencyDto DFI = new CurrencyDto("DFI", 78) { // from class: rosetta.blockchain.v1.CurrencyDto.DFI
        {
            String str = "DFI";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.DFI;
        }
    };
    public static final CurrencyDto RARI = new CurrencyDto("RARI", 79) { // from class: rosetta.blockchain.v1.CurrencyDto.RARI
        {
            String str = "RARI";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.RARI;
        }
    };
    public static final CurrencyDto WAVES = new CurrencyDto("WAVES", 80) { // from class: rosetta.blockchain.v1.CurrencyDto.WAVES
        {
            String str = "WAVES";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.WAVES;
        }
    };
    public static final CurrencyDto CRV = new CurrencyDto("CRV", 81) { // from class: rosetta.blockchain.v1.CurrencyDto.CRV
        {
            String str = "CRV";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.CRV;
        }
    };
    public static final CurrencyDto FRAX = new CurrencyDto("FRAX", 82) { // from class: rosetta.blockchain.v1.CurrencyDto.FRAX
        {
            String str = "FRAX";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.FRAX;
        }
    };
    public static final CurrencyDto GMT = new CurrencyDto("GMT", 83) { // from class: rosetta.blockchain.v1.CurrencyDto.GMT
        {
            String str = "GMT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.GMT;
        }
    };
    public static final CurrencyDto GRT = new CurrencyDto("GRT", 84) { // from class: rosetta.blockchain.v1.CurrencyDto.GRT
        {
            String str = "GRT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.GRT;
        }
    };
    public static final CurrencyDto MIOTA = new CurrencyDto("MIOTA", 85) { // from class: rosetta.blockchain.v1.CurrencyDto.MIOTA
        {
            String str = "MIOTA";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.MIOTA;
        }
    };
    public static final CurrencyDto ETHW = new CurrencyDto("ETHW", 86) { // from class: rosetta.blockchain.v1.CurrencyDto.ETHW
        {
            String str = "ETHW";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ETHW;
        }
    };
    public static final CurrencyDto LDO = new CurrencyDto("LDO", 87) { // from class: rosetta.blockchain.v1.CurrencyDto.LDO
        {
            String str = "LDO";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.LDO;
        }
    };
    public static final CurrencyDto CELR = new CurrencyDto("CELR", 88) { // from class: rosetta.blockchain.v1.CurrencyDto.CELR
        {
            String str = "CELR";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.CELR;
        }
    };
    public static final CurrencyDto LOOM = new CurrencyDto("LOOM", 89) { // from class: rosetta.blockchain.v1.CurrencyDto.LOOM
        {
            String str = "LOOM";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.LOOM;
        }
    };
    public static final CurrencyDto GHST = new CurrencyDto("GHST", 90) { // from class: rosetta.blockchain.v1.CurrencyDto.GHST
        {
            String str = "GHST";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.GHST;
        }
    };
    public static final CurrencyDto PEPE = new CurrencyDto("PEPE", 91) { // from class: rosetta.blockchain.v1.CurrencyDto.PEPE
        {
            String str = "PEPE";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.PEPE;
        }
    };
    public static final CurrencyDto CVX = new CurrencyDto("CVX", 92) { // from class: rosetta.blockchain.v1.CurrencyDto.CVX
        {
            String str = "CVX";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.CVX;
        }
    };
    public static final CurrencyDto HOPR = new CurrencyDto("HOPR", 93) { // from class: rosetta.blockchain.v1.CurrencyDto.HOPR
        {
            String str = "HOPR";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.HOPR;
        }
    };
    public static final CurrencyDto EOS = new CurrencyDto("EOS", 94) { // from class: rosetta.blockchain.v1.CurrencyDto.EOS
        {
            String str = "EOS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.EOS;
        }
    };
    public static final CurrencyDto EUROC = new CurrencyDto("EUROC", 95) { // from class: rosetta.blockchain.v1.CurrencyDto.EUROC
        {
            String str = "EUROC";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.EUROC;
        }
    };
    public static final CurrencyDto FUN = new CurrencyDto("FUN", 96) { // from class: rosetta.blockchain.v1.CurrencyDto.FUN
        {
            String str = "FUN";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.FUN;
        }
    };
    public static final CurrencyDto OCEAN = new CurrencyDto("OCEAN", 97) { // from class: rosetta.blockchain.v1.CurrencyDto.OCEAN
        {
            String str = "OCEAN";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.OCEAN;
        }
    };
    public static final CurrencyDto SNX = new CurrencyDto("SNX", 98) { // from class: rosetta.blockchain.v1.CurrencyDto.SNX
        {
            String str = "SNX";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SNX;
        }
    };
    public static final CurrencyDto SUSHI = new CurrencyDto("SUSHI", 99) { // from class: rosetta.blockchain.v1.CurrencyDto.SUSHI
        {
            String str = "SUSHI";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SUSHI;
        }
    };
    public static final CurrencyDto ARB = new CurrencyDto("ARB", 100) { // from class: rosetta.blockchain.v1.CurrencyDto.ARB
        {
            String str = "ARB";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ARB;
        }
    };
    public static final CurrencyDto BONK = new CurrencyDto("BONK", 101) { // from class: rosetta.blockchain.v1.CurrencyDto.BONK
        {
            String str = "BONK";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.BONK;
        }
    };

    /* renamed from: OP */
    public static final CurrencyDto f8165OP = new CurrencyDto("OP", 102) { // from class: rosetta.blockchain.v1.CurrencyDto.OP
        {
            String str = "OP";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.f8144OP;
        }
    };
    public static final CurrencyDto TIA = new CurrencyDto("TIA", 103) { // from class: rosetta.blockchain.v1.CurrencyDto.TIA
        {
            String str = "TIA";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.TIA;
        }
    };
    public static final CurrencyDto WIF = new CurrencyDto("WIF", 104) { // from class: rosetta.blockchain.v1.CurrencyDto.WIF
        {
            String str = "WIF";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.WIF;
        }
    };
    public static final CurrencyDto COQ = new CurrencyDto("COQ", 105) { // from class: rosetta.blockchain.v1.CurrencyDto.COQ
        {
            String str = "COQ";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.COQ;
        }
    };
    public static final CurrencyDto JUP = new CurrencyDto("JUP", 106) { // from class: rosetta.blockchain.v1.CurrencyDto.JUP
        {
            String str = "JUP";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.JUP;
        }
    };
    public static final CurrencyDto TON = new CurrencyDto("TON", 107) { // from class: rosetta.blockchain.v1.CurrencyDto.TON
        {
            String str = "TON";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.TON;
        }
    };

    /* renamed from: W */
    public static final CurrencyDto f8170W = new CurrencyDto("W", 108) { // from class: rosetta.blockchain.v1.CurrencyDto.W
        {
            String str = "W";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.f8149W;
        }
    };
    public static final CurrencyDto STETH = new CurrencyDto("STETH", 109) { // from class: rosetta.blockchain.v1.CurrencyDto.STETH
        {
            String str = "STETH";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.STETH;
        }
    };

    /* renamed from: ZK */
    public static final CurrencyDto f8171ZK = new CurrencyDto("ZK", 110) { // from class: rosetta.blockchain.v1.CurrencyDto.ZK
        {
            String str = "ZK";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.f8150ZK;
        }
    };
    public static final CurrencyDto ZRO = new CurrencyDto("ZRO", 111) { // from class: rosetta.blockchain.v1.CurrencyDto.ZRO
        {
            String str = "ZRO";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ZRO;
        }
    };
    public static final CurrencyDto EUR = new CurrencyDto("EUR", 112) { // from class: rosetta.blockchain.v1.CurrencyDto.EUR
        {
            String str = "EUR";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.EUR;
        }
    };
    public static final CurrencyDto IMX = new CurrencyDto("IMX", 113) { // from class: rosetta.blockchain.v1.CurrencyDto.IMX
        {
            String str = "IMX";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.IMX;
        }
    };
    public static final CurrencyDto RENDER = new CurrencyDto("RENDER", 114) { // from class: rosetta.blockchain.v1.CurrencyDto.RENDER
        {
            String str = "RENDER";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.RENDER;
        }
    };
    public static final CurrencyDto FLOKI = new CurrencyDto("FLOKI", 115) { // from class: rosetta.blockchain.v1.CurrencyDto.FLOKI
        {
            String str = "FLOKI";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.FLOKI;
        }
    };
    public static final CurrencyDto EIGEN = new CurrencyDto("EIGEN", 116) { // from class: rosetta.blockchain.v1.CurrencyDto.EIGEN
        {
            String str = "EIGEN";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.EIGEN;
        }
    };
    public static final CurrencyDto ENA = new CurrencyDto("ENA", 117) { // from class: rosetta.blockchain.v1.CurrencyDto.ENA
        {
            String str = "ENA";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ENA;
        }
    };
    public static final CurrencyDto EURC = new CurrencyDto("EURC", 118) { // from class: rosetta.blockchain.v1.CurrencyDto.EURC
        {
            String str = "EURC";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.EURC;
        }
    };
    public static final CurrencyDto AKT = new CurrencyDto("AKT", 119) { // from class: rosetta.blockchain.v1.CurrencyDto.AKT
        {
            String str = "AKT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.AKT;
        }
    };
    public static final CurrencyDto PYUSD = new CurrencyDto("PYUSD", 120) { // from class: rosetta.blockchain.v1.CurrencyDto.PYUSD
        {
            String str = "PYUSD";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.PYUSD;
        }
    };
    public static final CurrencyDto POL = new CurrencyDto("POL", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.POL
        {
            String str = "POL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.POL;
        }
    };
    public static final CurrencyDto AAPL = new CurrencyDto("AAPL", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.AAPL
        {
            String str = "AAPL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.AAPL;
        }
    };
    public static final CurrencyDto TSLA = new CurrencyDto("TSLA", 123) { // from class: rosetta.blockchain.v1.CurrencyDto.TSLA
        {
            String str = "TSLA";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.TSLA;
        }
    };

    /* renamed from: S */
    public static final CurrencyDto f8166S = new CurrencyDto("S", EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.S
        {
            String str = "S";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.f8145S;
        }
    };
    public static final CurrencyDto TRUMP = new CurrencyDto("TRUMP", 125) { // from class: rosetta.blockchain.v1.CurrencyDto.TRUMP
        {
            String str = "TRUMP";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.TRUMP;
        }
    };
    public static final CurrencyDto PENGU = new CurrencyDto("PENGU", EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.PENGU
        {
            String str = "PENGU";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.PENGU;
        }
    };
    public static final CurrencyDto ONDO = new CurrencyDto("ONDO", EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.ONDO
        {
            String str = "ONDO";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ONDO;
        }
    };
    public static final CurrencyDto INJ = new CurrencyDto("INJ", 128) { // from class: rosetta.blockchain.v1.CurrencyDto.INJ
        {
            String str = "INJ";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.INJ;
        }
    };
    public static final CurrencyDto JASMY = new CurrencyDto("JASMY", EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.JASMY
        {
            String str = "JASMY";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.JASMY;
        }
    };
    public static final CurrencyDto STRK = new CurrencyDto("STRK", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.STRK
        {
            String str = "STRK";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.STRK;
        }
    };
    public static final CurrencyDto PYTH = new CurrencyDto("PYTH", 131) { // from class: rosetta.blockchain.v1.CurrencyDto.PYTH
        {
            String str = "PYTH";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.PYTH;
        }
    };
    public static final CurrencyDto STO = new CurrencyDto("STO", EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.STO
        {
            String str = "STO";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.STO;
        }
    };
    public static final CurrencyDto COON = new CurrencyDto("COON", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.COON
        {
            String str = "COON";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.COON;
        }
    };
    public static final CurrencyDto RANP = new CurrencyDto("RANP", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.RANP
        {
            String str = "RANP";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.RANP;
        }
    };
    public static final CurrencyDto ALTL = new CurrencyDto("ALTL", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.ALTL
        {
            String str = "ALTL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ALTL;
        }
    };
    public static final CurrencyDto AEC = new CurrencyDto("AEC", 136) { // from class: rosetta.blockchain.v1.CurrencyDto.AEC
        {
            String str = "AEC";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.AEC;
        }
    };
    public static final CurrencyDto STOP = new CurrencyDto("STOP", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.STOP
        {
            String str = "STOP";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.STOP;
        }
    };
    public static final CurrencyDto POPCAT = new CurrencyDto("POPCAT", EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.POPCAT
        {
            String str = "POPCAT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.POPCAT;
        }
    };
    public static final CurrencyDto VIRTUAL = new CurrencyDto("VIRTUAL", EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.VIRTUAL
        {
            String str = "VIRTUAL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.VIRTUAL;
        }
    };
    public static final CurrencyDto PNUT = new CurrencyDto("PNUT", EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.PNUT
        {
            String str = "PNUT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.PNUT;
        }
    };
    public static final CurrencyDto MEW = new CurrencyDto("MEW", EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.MEW
        {
            String str = "MEW";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.MEW;
        }
    };
    public static final CurrencyDto SIMPSON = new CurrencyDto("SIMPSON", EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.SIMPSON
        {
            String str = "SIMPSON";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SIMPSON;
        }
    };
    public static final CurrencyDto VINO = new CurrencyDto("VINO", EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.VINO
        {
            String str = "VINO";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.VINO;
        }
    };
    public static final CurrencyDto YOM = new CurrencyDto("YOM", 144) { // from class: rosetta.blockchain.v1.CurrencyDto.YOM
        {
            String str = "YOM";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.YOM;
        }
    };
    public static final CurrencyDto BERA = new CurrencyDto("BERA", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.BERA
        {
            String str = "BERA";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.BERA;
        }
    };
    public static final CurrencyDto AMEX = new CurrencyDto("AMEX", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.AMEX
        {
            String str = "AMEX";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.AMEX;
        }
    };
    public static final CurrencyDto KCT = new CurrencyDto("KCT", 147) { // from class: rosetta.blockchain.v1.CurrencyDto.KCT
        {
            String str = "KCT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.KCT;
        }
    };
    public static final CurrencyDto XAI = new CurrencyDto("XAI", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.XAI
        {
            String str = "XAI";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.XAI;
        }
    };
    public static final CurrencyDto ATC = new CurrencyDto("ATC", EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.ATC
        {
            String str = "ATC";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ATC;
        }
    };
    public static final CurrencyDto HOOD = new CurrencyDto("HOOD", 150) { // from class: rosetta.blockchain.v1.CurrencyDto.HOOD
        {
            String str = "HOOD";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.HOOD;
        }
    };
    public static final CurrencyDto AMZN = new CurrencyDto("AMZN", 151) { // from class: rosetta.blockchain.v1.CurrencyDto.AMZN
        {
            String str = "AMZN";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.AMZN;
        }
    };
    public static final CurrencyDto GME = new CurrencyDto("GME", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.GME
        {
            String str = "GME";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.GME;
        }
    };
    public static final CurrencyDto AMD = new CurrencyDto("AMD", EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.AMD
        {
            String str = "AMD";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.AMD;
        }
    };
    public static final CurrencyDto META = new CurrencyDto("META", EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.META
        {
            String str = "META";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.META;
        }
    };
    public static final CurrencyDto CRWD = new CurrencyDto("CRWD", 155) { // from class: rosetta.blockchain.v1.CurrencyDto.CRWD
        {
            String str = "CRWD";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.CRWD;
        }
    };
    public static final CurrencyDto COIN = new CurrencyDto("COIN", 156) { // from class: rosetta.blockchain.v1.CurrencyDto.COIN
        {
            String str = "COIN";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.COIN;
        }
    };
    public static final CurrencyDto MSTR = new CurrencyDto("MSTR", EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.MSTR
        {
            String str = "MSTR";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.MSTR;
        }
    };
    public static final CurrencyDto GOOG = new CurrencyDto("GOOG", EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.GOOG
        {
            String str = "GOOG";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.GOOG;
        }
    };
    public static final CurrencyDto PLTR = new CurrencyDto("PLTR", EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.PLTR
        {
            String str = "PLTR";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.PLTR;
        }
    };
    public static final CurrencyDto QNT = new CurrencyDto("QNT", EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.QNT
        {
            String str = "QNT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.QNT;
        }
    };
    public static final CurrencyDto AKITA = new CurrencyDto("AKITA", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.AKITA
        {
            String str = "AKITA";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.AKITA;
        }
    };
    public static final CurrencyDto SAFEMOON = new CurrencyDto("SAFEMOON", EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.SAFEMOON
        {
            String str = "SAFEMOON";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SAFEMOON;
        }
    };
    public static final CurrencyDto BABYUNI = new CurrencyDto("BABYUNI", EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.BABYUNI
        {
            String str = "BABYUNI";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.BABYUNI;
        }
    };
    public static final CurrencyDto MEGA = new CurrencyDto("MEGA", EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.MEGA
        {
            String str = "MEGA";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.MEGA;
        }
    };
    public static final CurrencyDto ONEINCH = new CurrencyDto("ONEINCH", 165) { // from class: rosetta.blockchain.v1.CurrencyDto.ONEINCH
        {
            String str = "ONEINCH";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ONEINCH;
        }
    };
    public static final CurrencyDto AMP = new CurrencyDto("AMP", EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.AMP
        {
            String str = "AMP";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.AMP;
        }
    };
    public static final CurrencyDto AUDIO = new CurrencyDto("AUDIO", 167) { // from class: rosetta.blockchain.v1.CurrencyDto.AUDIO
        {
            String str = "AUDIO";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.AUDIO;
        }
    };
    public static final CurrencyDto BAND = new CurrencyDto("BAND", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.BAND
        {
            String str = "BAND";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.BAND;
        }
    };
    public static final CurrencyDto BLUR = new CurrencyDto("BLUR", EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.BLUR
        {
            String str = "BLUR";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.BLUR;
        }
    };
    public static final CurrencyDto BNT = new CurrencyDto("BNT", EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.BNT
        {
            String str = "BNT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.BNT;
        }
    };
    public static final CurrencyDto BOME = new CurrencyDto("BOME", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.BOME
        {
            String str = "BOME";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.BOME;
        }
    };
    public static final CurrencyDto CHZ = new CurrencyDto("CHZ", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.CHZ
        {
            String str = "CHZ";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.CHZ;
        }
    };
    public static final CurrencyDto COREUM = new CurrencyDto("COREUM", EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.COREUM
        {
            String str = "COREUM";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.COREUM;
        }
    };
    public static final CurrencyDto CSPR = new CurrencyDto("CSPR", EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.CSPR
        {
            String str = "CSPR";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.CSPR;
        }
    };
    public static final CurrencyDto CTSI = new CurrencyDto("CTSI", EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.CTSI
        {
            String str = "CTSI";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.CTSI;
        }
    };
    public static final CurrencyDto CVC = new CurrencyDto("CVC", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.CVC
        {
            String str = "CVC";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.CVC;
        }
    };
    public static final CurrencyDto CXT = new CurrencyDto("CXT", EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.CXT
        {
            String str = "CXT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.CXT;
        }
    };
    public static final CurrencyDto CTX = new CurrencyDto("CTX", EnumC7081g.f2773x8d9721ad) { // from class: rosetta.blockchain.v1.CurrencyDto.CTX
        {
            String str = "CTX";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.CTX;
        }
    };
    public static final CurrencyDto DGLD = new CurrencyDto("DGLD", EnumC7081g.f2780x600b66fe) { // from class: rosetta.blockchain.v1.CurrencyDto.DGLD
        {
            String str = "DGLD";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.DGLD;
        }
    };
    public static final CurrencyDto DYDX = new CurrencyDto("DYDX", EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.DYDX
        {
            String str = "DYDX";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.DYDX;
        }
    };
    public static final CurrencyDto ENS = new CurrencyDto("ENS", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.ENS
        {
            String str = "ENS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ENS;
        }
    };
    public static final CurrencyDto EURCV = new CurrencyDto("EURCV", 182) { // from class: rosetta.blockchain.v1.CurrencyDto.EURCV
        {
            String str = "EURCV";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.EURCV;
        }
    };
    public static final CurrencyDto EURT = new CurrencyDto("EURT", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.EURT
        {
            String str = "EURT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.EURT;
        }
    };
    public static final CurrencyDto FET = new CurrencyDto("FET", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.FET
        {
            String str = "FET";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.FET;
        }
    };
    public static final CurrencyDto FLR = new CurrencyDto("FLR", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.FLR
        {
            String str = "FLR";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.FLR;
        }
    };
    public static final CurrencyDto GALA = new CurrencyDto("GALA", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.GALA
        {
            String str = "GALA";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.GALA;
        }
    };
    public static final CurrencyDto GYEN = new CurrencyDto("GYEN", EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.GYEN
        {
            String str = "GYEN";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.GYEN;
        }
    };
    public static final CurrencyDto KNC = new CurrencyDto("KNC", 188) { // from class: rosetta.blockchain.v1.CurrencyDto.KNC
        {
            String str = "KNC";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.KNC;
        }
    };
    public static final CurrencyDto LMWR = new CurrencyDto("LMWR", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.LMWR
        {
            String str = "LMWR";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.LMWR;
        }
    };
    public static final CurrencyDto MELANIA = new CurrencyDto("MELANIA", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.MELANIA
        {
            String str = "MELANIA";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.MELANIA;
        }
    };
    public static final CurrencyDto MOG = new CurrencyDto("MOG", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.MOG
        {
            String str = "MOG";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.MOG;
        }
    };
    public static final CurrencyDto NEXO = new CurrencyDto("NEXO", 192) { // from class: rosetta.blockchain.v1.CurrencyDto.NEXO
        {
            String str = "NEXO";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.NEXO;
        }
    };
    public static final CurrencyDto PERP = new CurrencyDto("PERP", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.PERP
        {
            String str = "PERP";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.PERP;
        }
    };
    public static final CurrencyDto RAD = new CurrencyDto("RAD", EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.RAD
        {
            String str = "RAD";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.RAD;
        }
    };
    public static final CurrencyDto RLUSD = new CurrencyDto("RLUSD", EnumC7081g.SDK_ASSET_ICON_ALERT_WARNING_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.RLUSD
        {
            String str = "RLUSD";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.RLUSD;
        }
    };
    public static final CurrencyDto RLY = new CurrencyDto("RLY", EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.RLY
        {
            String str = "RLY";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.RLY;
        }
    };
    public static final CurrencyDto SEI = new CurrencyDto("SEI", EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.SEI
        {
            String str = "SEI";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SEI;
        }
    };
    public static final CurrencyDto SGB = new CurrencyDto("SGB", EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.SGB
        {
            String str = "SGB";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SGB;
        }
    };
    public static final CurrencyDto SKL = new CurrencyDto("SKL", EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.SKL
        {
            String str = "SKL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SKL;
        }
    };
    public static final CurrencyDto SLP = new CurrencyDto("SLP", 200) { // from class: rosetta.blockchain.v1.CurrencyDto.SLP
        {
            String str = "SLP";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SLP;
        }
    };
    public static final CurrencyDto SMT = new CurrencyDto("SMT", 201) { // from class: rosetta.blockchain.v1.CurrencyDto.SMT
        {
            String str = "SMT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SMT;
        }
    };
    public static final CurrencyDto SPELL = new CurrencyDto("SPELL", 202) { // from class: rosetta.blockchain.v1.CurrencyDto.SPELL
        {
            String str = "SPELL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SPELL;
        }
    };
    public static final CurrencyDto STORJ = new CurrencyDto("STORJ", EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.STORJ
        {
            String str = "STORJ";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.STORJ;
        }
    };
    public static final CurrencyDto SUI = new CurrencyDto("SUI", 204) { // from class: rosetta.blockchain.v1.CurrencyDto.SUI
        {
            String str = "SUI";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SUI;
        }
    };
    public static final CurrencyDto SYRUP = new CurrencyDto("SYRUP", EnumC7081g.SDK_ASSET_ICON_CLIPBOARD_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.SYRUP
        {
            String str = "SYRUP";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SYRUP;
        }
    };
    public static final CurrencyDto TRAC = new CurrencyDto("TRAC", EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.TRAC
        {
            String str = "TRAC";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.TRAC;
        }
    };
    public static final CurrencyDto TRUF = new CurrencyDto("TRUF", EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.TRUF
        {
            String str = "TRUF";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.TRUF;
        }
    };
    public static final CurrencyDto UMA = new CurrencyDto("UMA", EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.UMA
        {
            String str = "UMA";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.UMA;
        }
    };
    public static final CurrencyDto VCHF = new CurrencyDto("VCHF", EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.VCHF
        {
            String str = "VCHF";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.VCHF;
        }
    };
    public static final CurrencyDto VEUR = new CurrencyDto("VEUR", EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.VEUR
        {
            String str = "VEUR";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.VEUR;
        }
    };
    public static final CurrencyDto VEXT = new CurrencyDto("VEXT", 211) { // from class: rosetta.blockchain.v1.CurrencyDto.VEXT
        {
            String str = "VEXT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.VEXT;
        }
    };
    public static final CurrencyDto WEN = new CurrencyDto("WEN", EnumC7081g.SDK_ASSET_ICON_OVERRIDE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.WEN
        {
            String str = "WEN";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.WEN;
        }
    };
    public static final CurrencyDto WOO = new CurrencyDto("WOO", EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.WOO
        {
            String str = "WOO";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.WOO;
        }
    };
    public static final CurrencyDto WECAN = new CurrencyDto("WECAN", EnumC7081g.SDK_ASSET_ICON_PIN_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.WECAN
        {
            String str = "WECAN";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.WECAN;
        }
    };
    public static final CurrencyDto XCHNG = new CurrencyDto("XCHNG", EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.XCHNG
        {
            String str = "XCHNG";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.XCHNG;
        }
    };
    public static final CurrencyDto XDC = new CurrencyDto("XDC", EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.XDC
        {
            String str = "XDC";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.XDC;
        }
    };
    public static final CurrencyDto XSGD = new CurrencyDto("XSGD", EnumC7081g.SDK_ASSET_ICON_PROGRESS_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.XSGD
        {
            String str = "XSGD";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.XSGD;
        }
    };
    public static final CurrencyDto ZETA = new CurrencyDto("ZETA", EnumC7081g.SDK_ASSET_ICON_QUESTION_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.ZETA
        {
            String str = "ZETA";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ZETA;
        }
    };
    public static final CurrencyDto ZUSD = new CurrencyDto("ZUSD", EnumC7081g.SDK_ASSET_ICON_REJECTED_REC_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.ZUSD
        {
            String str = "ZUSD";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ZUSD;
        }
    };
    public static final CurrencyDto MOODENG = new CurrencyDto("MOODENG", EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.MOODENG
        {
            String str = "MOODENG";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.MOODENG;
        }
    };
    public static final CurrencyDto GLUB = new CurrencyDto("GLUB", EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.GLUB
        {
            String str = "GLUB";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.GLUB;
        }
    };
    public static final CurrencyDto NOODLE = new CurrencyDto("NOODLE", EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.NOODLE
        {
            String str = "NOODLE";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.NOODLE;
        }
    };
    public static final CurrencyDto PLS = new CurrencyDto("PLS", EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.PLS
        {
            String str = "PLS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.PLS;
        }
    };
    public static final CurrencyDto TURBO = new CurrencyDto("TURBO", 224) { // from class: rosetta.blockchain.v1.CurrencyDto.TURBO
        {
            String str = "TURBO";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.TURBO;
        }
    };
    public static final CurrencyDto GMXP = new CurrencyDto("GMXP", 225) { // from class: rosetta.blockchain.v1.CurrencyDto.GMXP
        {
            String str = "GMXP";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.GMXP;
        }
    };
    public static final CurrencyDto SDS = new CurrencyDto("SDS", EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.SDS
        {
            String str = "SDS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SDS;
        }
    };
    public static final CurrencyDto MTC = new CurrencyDto("MTC", EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.MTC
        {
            String str = "MTC";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.MTC;
        }
    };
    public static final CurrencyDto TMDX = new CurrencyDto("TMDX", EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.TMDX
        {
            String str = "TMDX";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.TMDX;
        }
    };
    public static final CurrencyDto ELON = new CurrencyDto("ELON", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.ELON
        {
            String str = "ELON";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ELON;
        }
    };
    public static final CurrencyDto IVV = new CurrencyDto("IVV", EnumC7081g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.IVV
        {
            String str = "IVV";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.IVV;
        }
    };
    public static final CurrencyDto HMND = new CurrencyDto("HMND", EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.HMND
        {
            String str = "HMND";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.HMND;
        }
    };
    public static final CurrencyDto HONEY = new CurrencyDto("HONEY", EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.HONEY
        {
            String str = "HONEY";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.HONEY;
        }
    };
    public static final CurrencyDto LAYER = new CurrencyDto("LAYER", EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.LAYER
        {
            String str = "LAYER";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.LAYER;
        }
    };
    public static final CurrencyDto GLMR = new CurrencyDto("GLMR", EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.GLMR
        {
            String str = "GLMR";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.GLMR;
        }
    };

    /* renamed from: KO */
    public static final CurrencyDto f8159KO = new CurrencyDto("KO", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.KO
        {
            String str = "KO";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.f8138KO;
        }
    };
    public static final CurrencyDto SPOT = new CurrencyDto("SPOT", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.SPOT
        {
            String str = "SPOT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SPOT;
        }
    };
    public static final CurrencyDto SMCX = new CurrencyDto("SMCX", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.SMCX
        {
            String str = "SMCX";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SMCX;
        }
    };
    public static final CurrencyDto GIGA = new CurrencyDto("GIGA", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.GIGA
        {
            String str = "GIGA";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.GIGA;
        }
    };
    public static final CurrencyDto USFR = new CurrencyDto("USFR", 239) { // from class: rosetta.blockchain.v1.CurrencyDto.USFR
        {
            String str = "USFR";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.USFR;
        }
    };

    /* renamed from: VZ */
    public static final CurrencyDto f8169VZ = new CurrencyDto("VZ", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.VZ
        {
            String str = "VZ";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.f8148VZ;
        }
    };
    public static final CurrencyDto IAU = new CurrencyDto("IAU", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.IAU
        {
            String str = "IAU";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.IAU;
        }
    };
    public static final CurrencyDto ARPA = new CurrencyDto("ARPA", EnumC7081g.f2778x3356acf6) { // from class: rosetta.blockchain.v1.CurrencyDto.ARPA
        {
            String str = "ARPA";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ARPA;
        }
    };
    public static final CurrencyDto UAL = new CurrencyDto("UAL", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.UAL
        {
            String str = "UAL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.UAL;
        }
    };
    public static final CurrencyDto RAY = new CurrencyDto("RAY", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.RAY
        {
            String str = "RAY";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.RAY;
        }
    };

    /* renamed from: ME */
    public static final CurrencyDto f8160ME = new CurrencyDto("ME", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.ME
        {
            String str = "ME";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.f8139ME;
        }
    };
    public static final CurrencyDto MRVL = new CurrencyDto("MRVL", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.MRVL
        {
            String str = "MRVL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.MRVL;
        }
    };
    public static final CurrencyDto HOT = new CurrencyDto("HOT", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.HOT
        {
            String str = "HOT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.HOT;
        }
    };
    public static final CurrencyDto UPS = new CurrencyDto("UPS", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.UPS
        {
            String str = "UPS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.UPS;
        }
    };

    /* renamed from: BA */
    public static final CurrencyDto f8153BA = new CurrencyDto("BA", EnumC7081g.f2779x59907a3d) { // from class: rosetta.blockchain.v1.CurrencyDto.BA
        {
            String str = "BA";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.f8132BA;
        }
    };
    public static final CurrencyDto DEPRECATED_EUROC = new CurrencyDto("DEPRECATED_EUROC", 250) { // from class: rosetta.blockchain.v1.CurrencyDto.DEPRECATED_EUROC
        {
            String str = "DEPRECATED_EUROC";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.DEPRECATED_EUROC;
        }
    };
    public static final CurrencyDto GEV = new CurrencyDto("GEV", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.GEV
        {
            String str = "GEV";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.GEV;
        }
    };
    public static final CurrencyDto TZA = new CurrencyDto("TZA", EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.TZA
        {
            String str = "TZA";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.TZA;
        }
    };
    public static final CurrencyDto GAL = new CurrencyDto("GAL", EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.GAL
        {
            String str = "GAL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.GAL;
        }
    };
    public static final CurrencyDto LMT = new CurrencyDto("LMT", EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.LMT
        {
            String str = "LMT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.LMT;
        }
    };

    /* renamed from: GE */
    public static final CurrencyDto f8156GE = new CurrencyDto("GE", 255) { // from class: rosetta.blockchain.v1.CurrencyDto.GE
        {
            String str = "GE";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.f8135GE;
        }
    };
    public static final CurrencyDto CONY = new CurrencyDto("CONY", 256) { // from class: rosetta.blockchain.v1.CurrencyDto.CONY
        {
            String str = "CONY";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.CONY;
        }
    };
    public static final CurrencyDto BIO = new CurrencyDto("BIO", EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.BIO
        {
            String str = "BIO";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.BIO;
        }
    };
    public static final CurrencyDto CELH = new CurrencyDto("CELH", EnumC7081g.SDK_ASSET_HEADER_BOLT_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.CELH
        {
            String str = "CELH";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.CELH;
        }
    };
    public static final CurrencyDto IOST = new CurrencyDto("IOST", EnumC7081g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.IOST
        {
            String str = "IOST";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.IOST;
        }
    };
    public static final CurrencyDto ZEUS = new CurrencyDto("ZEUS", EnumC7081g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.ZEUS
        {
            String str = "ZEUS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ZEUS;
        }
    };
    public static final CurrencyDto GNO = new CurrencyDto("GNO", EnumC7081g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.GNO
        {
            String str = "GNO";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.GNO;
        }
    };
    public static final CurrencyDto SPXU = new CurrencyDto("SPXU", EnumC7081g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.SPXU
        {
            String str = "SPXU";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SPXU;
        }
    };
    public static final CurrencyDto SCHD = new CurrencyDto("SCHD", EnumC7081g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.SCHD
        {
            String str = "SCHD";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SCHD;
        }
    };
    public static final CurrencyDto SLV = new CurrencyDto("SLV", EnumC7081g.SDK_ASSET_ICON_PLAID_LOGO_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.SLV
        {
            String str = "SLV";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SLV;
        }
    };
    public static final CurrencyDto RPL = new CurrencyDto("RPL", EnumC7081g.SDK_ASSET_HEADER_SHIELD_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.RPL
        {
            String str = "RPL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.RPL;
        }
    };
    public static final CurrencyDto PLA = new CurrencyDto("PLA", EnumC7081g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.PLA
        {
            String str = "PLA";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.PLA;
        }
    };
    public static final CurrencyDto WAMPL = new CurrencyDto("WAMPL", EnumC7081g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.WAMPL
        {
            String str = "WAMPL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.WAMPL;
        }
    };
    public static final CurrencyDto ROOT = new CurrencyDto("ROOT", EnumC7081g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.ROOT
        {
            String str = "ROOT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ROOT;
        }
    };
    public static final CurrencyDto KAVA = new CurrencyDto("KAVA", EnumC7081g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.KAVA
        {
            String str = "KAVA";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.KAVA;
        }
    };
    public static final CurrencyDto PINS = new CurrencyDto("PINS", EnumC7081g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.PINS
        {
            String str = "PINS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.PINS;
        }
    };
    public static final CurrencyDto MOVE = new CurrencyDto("MOVE", 271) { // from class: rosetta.blockchain.v1.CurrencyDto.MOVE
        {
            String str = "MOVE";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.MOVE;
        }
    };
    public static final CurrencyDto SOXL = new CurrencyDto("SOXL", EnumC7081g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.SOXL
        {
            String str = "SOXL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SOXL;
        }
    };
    public static final CurrencyDto INTR = new CurrencyDto("INTR", EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.INTR
        {
            String str = "INTR";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.INTR;
        }
    };
    public static final CurrencyDto INDEX = new CurrencyDto("INDEX", EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.INDEX
        {
            String str = "INDEX";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.INDEX;
        }
    };
    public static final CurrencyDto CVS = new CurrencyDto("CVS", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.CVS
        {
            String str = "CVS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.CVS;
        }
    };
    public static final CurrencyDto AVGO = new CurrencyDto("AVGO", EnumC7081g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.AVGO
        {
            String str = "AVGO";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.AVGO;
        }
    };
    public static final CurrencyDto WLD = new CurrencyDto("WLD", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.WLD
        {
            String str = "WLD";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.WLD;
        }
    };
    public static final CurrencyDto BRETT = new CurrencyDto("BRETT", EnumC7081g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.BRETT
        {
            String str = "BRETT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.BRETT;
        }
    };
    public static final CurrencyDto PANW = new CurrencyDto("PANW", EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.PANW
        {
            String str = "PANW";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.PANW;
        }
    };
    public static final CurrencyDto WDAY = new CurrencyDto("WDAY", 280) { // from class: rosetta.blockchain.v1.CurrencyDto.WDAY
        {
            String str = "WDAY";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.WDAY;
        }
    };
    public static final CurrencyDto SNAP = new CurrencyDto("SNAP", EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.SNAP
        {
            String str = "SNAP";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SNAP;
        }
    };
    public static final CurrencyDto BOBA = new CurrencyDto("BOBA", EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.BOBA
        {
            String str = "BOBA";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.BOBA;
        }
    };
    public static final CurrencyDto BABYDOGE = new CurrencyDto("BABYDOGE", 283) { // from class: rosetta.blockchain.v1.CurrencyDto.BABYDOGE
        {
            String str = "BABYDOGE";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.BABYDOGE;
        }
    };
    public static final CurrencyDto MASK = new CurrencyDto("MASK", EnumC7081g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.MASK
        {
            String str = "MASK";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.MASK;
        }
    };
    public static final CurrencyDto KHC = new CurrencyDto("KHC", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.KHC
        {
            String str = "KHC";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.KHC;
        }
    };
    public static final CurrencyDto ORCL = new CurrencyDto("ORCL", EnumC7081g.f2777x89a9e432) { // from class: rosetta.blockchain.v1.CurrencyDto.ORCL
        {
            String str = "ORCL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ORCL;
        }
    };
    public static final CurrencyDto RDDT = new CurrencyDto("RDDT", EnumC7081g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.RDDT
        {
            String str = "RDDT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.RDDT;
        }
    };
    public static final CurrencyDto INTC = new CurrencyDto("INTC", 288) { // from class: rosetta.blockchain.v1.CurrencyDto.INTC
        {
            String str = "INTC";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.INTC;
        }
    };
    public static final CurrencyDto TMF = new CurrencyDto("TMF", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.TMF
        {
            String str = "TMF";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.TMF;
        }
    };
    public static final CurrencyDto ANKR = new CurrencyDto("ANKR", EnumC7081g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.ANKR
        {
            String str = "ANKR";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ANKR;
        }
    };
    public static final CurrencyDto RIVN = new CurrencyDto("RIVN", EnumC7081g.f2776x87e624cb) { // from class: rosetta.blockchain.v1.CurrencyDto.RIVN
        {
            String str = "RIVN";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.RIVN;
        }
    };
    public static final CurrencyDto PRIME = new CurrencyDto("PRIME", EnumC7081g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.PRIME
        {
            String str = "PRIME";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.PRIME;
        }
    };
    public static final CurrencyDto MORPHO = new CurrencyDto("MORPHO", EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.MORPHO
        {
            String str = "MORPHO";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.MORPHO;
        }
    };
    public static final CurrencyDto LYFT = new CurrencyDto("LYFT", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.LYFT
        {
            String str = "LYFT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.LYFT;
        }
    };
    public static final CurrencyDto EUL = new CurrencyDto("EUL", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.EUL
        {
            String str = "EUL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.EUL;
        }
    };
    public static final CurrencyDto XYO = new CurrencyDto("XYO", EnumC7081g.SDK_ASSET_LOADING_INDICATOR_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.XYO
        {
            String str = "XYO";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.XYO;
        }
    };
    public static final CurrencyDto RKT = new CurrencyDto("RKT", EnumC7081g.SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.RKT
        {
            String str = "RKT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.RKT;
        }
    };
    public static final CurrencyDto INOD = new CurrencyDto("INOD", EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.INOD
        {
            String str = "INOD";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.INOD;
        }
    };
    public static final CurrencyDto RBLX = new CurrencyDto("RBLX", EnumC7081g.SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.RBLX
        {
            String str = "RBLX";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.RBLX;
        }
    };
    public static final CurrencyDto VTI = new CurrencyDto("VTI", 300) { // from class: rosetta.blockchain.v1.CurrencyDto.VTI
        {
            String str = "VTI";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.VTI;
        }
    };
    public static final CurrencyDto POLS = new CurrencyDto("POLS", EnumC7081g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.POLS
        {
            String str = "POLS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.POLS;
        }
    };
    public static final CurrencyDto BEAM = new CurrencyDto("BEAM", 302) { // from class: rosetta.blockchain.v1.CurrencyDto.BEAM
        {
            String str = "BEAM";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.BEAM;
        }
    };
    public static final CurrencyDto AAL = new CurrencyDto("AAL", EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.AAL
        {
            String str = "AAL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.AAL;
        }
    };
    public static final CurrencyDto MYTH = new CurrencyDto("MYTH", EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.MYTH
        {
            String str = "MYTH";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.MYTH;
        }
    };
    public static final CurrencyDto JNJ = new CurrencyDto("JNJ", EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.JNJ
        {
            String str = "JNJ";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.JNJ;
        }
    };
    public static final CurrencyDto SRPT = new CurrencyDto("SRPT", EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.SRPT
        {
            String str = "SRPT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SRPT;
        }
    };
    public static final CurrencyDto PHA = new CurrencyDto("PHA", EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.PHA
        {
            String str = "PHA";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.PHA;
        }
    };
    public static final CurrencyDto FARTCOIN = new CurrencyDto("FARTCOIN", EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.FARTCOIN
        {
            String str = "FARTCOIN";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.FARTCOIN;
        }
    };
    public static final CurrencyDto QCOM = new CurrencyDto("QCOM", EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.QCOM
        {
            String str = "QCOM";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.QCOM;
        }
    };
    public static final CurrencyDto ABNB = new CurrencyDto("ABNB", EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.ABNB
        {
            String str = "ABNB";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ABNB;
        }
    };
    public static final CurrencyDto KGC = new CurrencyDto("KGC", EnumC7081g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.KGC
        {
            String str = "KGC";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.KGC;
        }
    };
    public static final CurrencyDto AIOZ = new CurrencyDto("AIOZ", EnumC7081g.f2774x74902ae0) { // from class: rosetta.blockchain.v1.CurrencyDto.AIOZ
        {
            String str = "AIOZ";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.AIOZ;
        }
    };
    public static final CurrencyDto JEPQ = new CurrencyDto("JEPQ", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.JEPQ
        {
            String str = "JEPQ";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.JEPQ;
        }
    };
    public static final CurrencyDto TGT = new CurrencyDto("TGT", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.TGT
        {
            String str = "TGT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.TGT;
        }
    };
    public static final CurrencyDto TEM = new CurrencyDto("TEM", EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.TEM
        {
            String str = "TEM";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.TEM;
        }
    };
    public static final CurrencyDto CAVA = new CurrencyDto("CAVA", 316) { // from class: rosetta.blockchain.v1.CurrencyDto.CAVA
        {
            String str = "CAVA";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.CAVA;
        }
    };
    public static final CurrencyDto PFE = new CurrencyDto("PFE", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.PFE
        {
            String str = "PFE";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.PFE;
        }
    };

    /* renamed from: U */
    public static final CurrencyDto f8168U = new CurrencyDto("U", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.U
        {
            String str = "U";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.f8147U;
        }
    };
    public static final CurrencyDto LQTY = new CurrencyDto("LQTY", EnumC7081g.f2781x2ba65ba3) { // from class: rosetta.blockchain.v1.CurrencyDto.LQTY
        {
            String str = "LQTY";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.LQTY;
        }
    };
    public static final CurrencyDto DOGINME = new CurrencyDto("DOGINME", EnumC7081g.SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.DOGINME
        {
            String str = "DOGINME";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.DOGINME;
        }
    };

    /* renamed from: AI */
    public static final CurrencyDto f8151AI = new CurrencyDto("AI", EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_LIGHT_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.AI
        {
            String str = "AI";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.f8130AI;
        }
    };
    public static final CurrencyDto SNOW = new CurrencyDto("SNOW", EnumC7081g.SDK_ASSET_PLAID_PROFILE_CIRCLE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.SNOW
        {
            String str = "SNOW";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SNOW;
        }
    };

    /* renamed from: IO */
    public static final CurrencyDto f8158IO = new CurrencyDto("IO", EnumC7081g.f2775xbcb7e6f3) { // from class: rosetta.blockchain.v1.CurrencyDto.IO
        {
            String str = "IO";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.f8137IO;
        }
    };
    public static final CurrencyDto CKB = new CurrencyDto("CKB", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.CKB
        {
            String str = "CKB";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.CKB;
        }
    };

    /* renamed from: NU */
    public static final CurrencyDto f8163NU = new CurrencyDto(CountryCode.COUNTRY_CODE_NU, EnumC7081g.SDK_ASSET_ICON_REPORT_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.NU
        {
            String str = CountryCode.COUNTRY_CODE_NU;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.f8142NU;
        }
    };
    public static final CurrencyDto TQQQ = new CurrencyDto("TQQQ", EnumC7081g.SDK_ASSET_ICON_STEP_COMPLETE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.TQQQ
        {
            String str = "TQQQ";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.TQQQ;
        }
    };
    public static final CurrencyDto KAP = new CurrencyDto("KAP", EnumC7081g.SDK_ASSET_ICON_UPLOAD_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.KAP
        {
            String str = "KAP";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.KAP;
        }
    };
    public static final CurrencyDto HOOK = new CurrencyDto("HOOK", EnumC7081g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.HOOK
        {
            String str = "HOOK";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.HOOK;
        }
    };
    public static final CurrencyDto RNDR = new CurrencyDto("RNDR", EnumC7081g.SDK_ASSET_ICON_LIGHTNING_FILLED_BLUE_VALUE) { // from class: rosetta.blockchain.v1.CurrencyDto.RNDR
        {
            String str = "RNDR";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.RNDR;
        }
    };
    public static final CurrencyDto VUG = new CurrencyDto("VUG", 330) { // from class: rosetta.blockchain.v1.CurrencyDto.VUG
        {
            String str = "VUG";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.VUG;
        }
    };
    public static final CurrencyDto ACS = new CurrencyDto("ACS", 331) { // from class: rosetta.blockchain.v1.CurrencyDto.ACS
        {
            String str = "ACS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ACS;
        }
    };
    public static final CurrencyDto ROUTE = new CurrencyDto("ROUTE", 332) { // from class: rosetta.blockchain.v1.CurrencyDto.ROUTE
        {
            String str = "ROUTE";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ROUTE;
        }
    };
    public static final CurrencyDto MRNA = new CurrencyDto("MRNA", 333) { // from class: rosetta.blockchain.v1.CurrencyDto.MRNA
        {
            String str = "MRNA";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.MRNA;
        }
    };
    public static final CurrencyDto SHOP = new CurrencyDto("SHOP", 334) { // from class: rosetta.blockchain.v1.CurrencyDto.SHOP
        {
            String str = "SHOP";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SHOP;
        }
    };

    /* renamed from: B3 */
    public static final CurrencyDto f8152B3 = new CurrencyDto("B3", 335) { // from class: rosetta.blockchain.v1.CurrencyDto.B3
        {
            String str = "B3";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.f8131B3;
        }
    };
    public static final CurrencyDto UNH = new CurrencyDto("UNH", WaitlistAnimationConstants.IN_WAITLIST_ANIMATION_END) { // from class: rosetta.blockchain.v1.CurrencyDto.UNH
        {
            String str = "UNH";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.UNH;
        }
    };
    public static final CurrencyDto ARC = new CurrencyDto("ARC", 337) { // from class: rosetta.blockchain.v1.CurrencyDto.ARC
        {
            String str = "ARC";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ARC;
        }
    };
    public static final CurrencyDto DAL = new CurrencyDto("DAL", 338) { // from class: rosetta.blockchain.v1.CurrencyDto.DAL
        {
            String str = "DAL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.DAL;
        }
    };
    public static final CurrencyDto ZKJ = new CurrencyDto("ZKJ", 339) { // from class: rosetta.blockchain.v1.CurrencyDto.ZKJ
        {
            String str = "ZKJ";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ZKJ;
        }
    };
    public static final CurrencyDto MAGS = new CurrencyDto("MAGS", 340) { // from class: rosetta.blockchain.v1.CurrencyDto.MAGS
        {
            String str = "MAGS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.MAGS;
        }
    };
    public static final CurrencyDto MSTZ = new CurrencyDto("MSTZ", 341) { // from class: rosetta.blockchain.v1.CurrencyDto.MSTZ
        {
            String str = "MSTZ";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.MSTZ;
        }
    };
    public static final CurrencyDto BTRST = new CurrencyDto("BTRST", 342) { // from class: rosetta.blockchain.v1.CurrencyDto.BTRST
        {
            String str = "BTRST";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.BTRST;
        }
    };
    public static final CurrencyDto SUPER = new CurrencyDto("SUPER", 343) { // from class: rosetta.blockchain.v1.CurrencyDto.SUPER
        {
            String str = "SUPER";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SUPER;
        }
    };
    public static final CurrencyDto OKTA = new CurrencyDto("OKTA", 344) { // from class: rosetta.blockchain.v1.CurrencyDto.OKTA
        {
            String str = "OKTA";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.OKTA;
        }
    };
    public static final CurrencyDto ZIL = new CurrencyDto("ZIL", 345) { // from class: rosetta.blockchain.v1.CurrencyDto.ZIL
        {
            String str = "ZIL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ZIL;
        }
    };
    public static final CurrencyDto DKS = new CurrencyDto("DKS", 346) { // from class: rosetta.blockchain.v1.CurrencyDto.DKS
        {
            String str = "DKS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.DKS;
        }
    };

    /* renamed from: F */
    public static final CurrencyDto f8155F = new CurrencyDto("F", 347) { // from class: rosetta.blockchain.v1.CurrencyDto.F
        {
            String str = "F";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.f8134F;
        }
    };
    public static final CurrencyDto CLF = new CurrencyDto("CLF", 348) { // from class: rosetta.blockchain.v1.CurrencyDto.CLF
        {
            String str = "CLF";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.CLF;
        }
    };
    public static final CurrencyDto ROKU = new CurrencyDto("ROKU", 349) { // from class: rosetta.blockchain.v1.CurrencyDto.ROKU
        {
            String str = "ROKU";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ROKU;
        }
    };
    public static final CurrencyDto BIGTIME = new CurrencyDto("BIGTIME", 350) { // from class: rosetta.blockchain.v1.CurrencyDto.BIGTIME
        {
            String str = "BIGTIME";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.BIGTIME;
        }
    };
    public static final CurrencyDto GRASS = new CurrencyDto("GRASS", 351) { // from class: rosetta.blockchain.v1.CurrencyDto.GRASS
        {
            String str = "GRASS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.GRASS;
        }
    };
    public static final CurrencyDto AVA = new CurrencyDto("AVA", 352) { // from class: rosetta.blockchain.v1.CurrencyDto.AVA
        {
            String str = "AVA";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.AVA;
        }
    };
    public static final CurrencyDto BIL = new CurrencyDto("BIL", 353) { // from class: rosetta.blockchain.v1.CurrencyDto.BIL
        {
            String str = "BIL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.BIL;
        }
    };
    public static final CurrencyDto AFRM = new CurrencyDto("AFRM", 354) { // from class: rosetta.blockchain.v1.CurrencyDto.AFRM
        {
            String str = "AFRM";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.AFRM;
        }
    };
    public static final CurrencyDto TNA = new CurrencyDto("TNA", 355) { // from class: rosetta.blockchain.v1.CurrencyDto.TNA
        {
            String str = "TNA";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.TNA;
        }
    };
    public static final CurrencyDto AMPL = new CurrencyDto("AMPL", 356) { // from class: rosetta.blockchain.v1.CurrencyDto.AMPL
        {
            String str = "AMPL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.AMPL;
        }
    };
    public static final CurrencyDto GOAT = new CurrencyDto("GOAT", 357) { // from class: rosetta.blockchain.v1.CurrencyDto.GOAT
        {
            String str = "GOAT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.GOAT;
        }
    };
    public static final CurrencyDto IBIT = new CurrencyDto("IBIT", 358) { // from class: rosetta.blockchain.v1.CurrencyDto.IBIT
        {
            String str = "IBIT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.IBIT;
        }
    };
    public static final CurrencyDto AIXBT = new CurrencyDto("AIXBT", 359) { // from class: rosetta.blockchain.v1.CurrencyDto.AIXBT
        {
            String str = "AIXBT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.AIXBT;
        }
    };
    public static final CurrencyDto ONE = new CurrencyDto("ONE", 360) { // from class: rosetta.blockchain.v1.CurrencyDto.ONE
        {
            String str = "ONE";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ONE;
        }
    };
    public static final CurrencyDto GAP = new CurrencyDto("GAP", 361) { // from class: rosetta.blockchain.v1.CurrencyDto.GAP
        {
            String str = "GAP";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.GAP;
        }
    };
    public static final CurrencyDto GOOGL = new CurrencyDto("GOOGL", 362) { // from class: rosetta.blockchain.v1.CurrencyDto.GOOGL
        {
            String str = "GOOGL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.GOOGL;
        }
    };
    public static final CurrencyDto VRT = new CurrencyDto("VRT", 363) { // from class: rosetta.blockchain.v1.CurrencyDto.VRT
        {
            String str = "VRT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.VRT;
        }
    };
    public static final CurrencyDto CHEX = new CurrencyDto("CHEX", 364) { // from class: rosetta.blockchain.v1.CurrencyDto.CHEX
        {
            String str = "CHEX";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.CHEX;
        }
    };
    public static final CurrencyDto HUM = new CurrencyDto("HUM", 365) { // from class: rosetta.blockchain.v1.CurrencyDto.HUM
        {
            String str = "HUM";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.HUM;
        }
    };
    public static final CurrencyDto TTWO = new CurrencyDto("TTWO", 366) { // from class: rosetta.blockchain.v1.CurrencyDto.TTWO
        {
            String str = "TTWO";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.TTWO;
        }
    };

    /* renamed from: HD */
    public static final CurrencyDto f8157HD = new CurrencyDto("HD", 367) { // from class: rosetta.blockchain.v1.CurrencyDto.HD
        {
            String str = "HD";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.f8136HD;
        }
    };
    public static final CurrencyDto VXX = new CurrencyDto("VXX", 368) { // from class: rosetta.blockchain.v1.CurrencyDto.VXX
        {
            String str = "VXX";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.VXX;
        }
    };
    public static final CurrencyDto RDNT = new CurrencyDto("RDNT", 369) { // from class: rosetta.blockchain.v1.CurrencyDto.RDNT
        {
            String str = "RDNT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.RDNT;
        }
    };
    public static final CurrencyDto SMCI = new CurrencyDto("SMCI", 370) { // from class: rosetta.blockchain.v1.CurrencyDto.SMCI
        {
            String str = "SMCI";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SMCI;
        }
    };
    public static final CurrencyDto CFX = new CurrencyDto("CFX", 371) { // from class: rosetta.blockchain.v1.CurrencyDto.CFX
        {
            String str = "CFX";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.CFX;
        }
    };
    public static final CurrencyDto SOXS = new CurrencyDto("SOXS", 372) { // from class: rosetta.blockchain.v1.CurrencyDto.SOXS
        {
            String str = "SOXS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SOXS;
        }
    };
    public static final CurrencyDto INDP = new CurrencyDto("INDP", 373) { // from class: rosetta.blockchain.v1.CurrencyDto.INDP
        {
            String str = "INDP";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.INDP;
        }
    };
    public static final CurrencyDto PAAL = new CurrencyDto("PAAL", 374) { // from class: rosetta.blockchain.v1.CurrencyDto.PAAL
        {
            String str = "PAAL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.PAAL;
        }
    };
    public static final CurrencyDto ENPH = new CurrencyDto("ENPH", 375) { // from class: rosetta.blockchain.v1.CurrencyDto.ENPH
        {
            String str = "ENPH";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ENPH;
        }
    };
    public static final CurrencyDto CLSK = new CurrencyDto("CLSK", 376) { // from class: rosetta.blockchain.v1.CurrencyDto.CLSK
        {
            String str = "CLSK";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.CLSK;
        }
    };
    public static final CurrencyDto KEY = new CurrencyDto("KEY", 377) { // from class: rosetta.blockchain.v1.CurrencyDto.KEY
        {
            String str = "KEY";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.KEY;
        }
    };
    public static final CurrencyDto AGIX = new CurrencyDto("AGIX", 378) { // from class: rosetta.blockchain.v1.CurrencyDto.AGIX
        {
            String str = "AGIX";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.AGIX;
        }
    };
    public static final CurrencyDto JTO = new CurrencyDto("JTO", 379) { // from class: rosetta.blockchain.v1.CurrencyDto.JTO
        {
            String str = "JTO";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.JTO;
        }
    };
    public static final CurrencyDto ACE = new CurrencyDto("ACE", 380) { // from class: rosetta.blockchain.v1.CurrencyDto.ACE
        {
            String str = "ACE";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ACE;
        }
    };
    public static final CurrencyDto PYPL = new CurrencyDto("PYPL", 381) { // from class: rosetta.blockchain.v1.CurrencyDto.PYPL
        {
            String str = "PYPL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.PYPL;
        }
    };
    public static final CurrencyDto AI16Z = new CurrencyDto("AI16Z", 382) { // from class: rosetta.blockchain.v1.CurrencyDto.AI16Z
        {
            String str = "AI16Z";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.AI16Z;
        }
    };
    public static final CurrencyDto CSCO = new CurrencyDto("CSCO", 383) { // from class: rosetta.blockchain.v1.CurrencyDto.CSCO
        {
            String str = "CSCO";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.CSCO;
        }
    };
    public static final CurrencyDto SPXS = new CurrencyDto("SPXS", 384) { // from class: rosetta.blockchain.v1.CurrencyDto.SPXS
        {
            String str = "SPXS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SPXS;
        }
    };
    public static final CurrencyDto TECL = new CurrencyDto("TECL", 385) { // from class: rosetta.blockchain.v1.CurrencyDto.TECL
        {
            String str = "TECL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.TECL;
        }
    };
    public static final CurrencyDto FXS = new CurrencyDto("FXS", 386) { // from class: rosetta.blockchain.v1.CurrencyDto.FXS
        {
            String str = "FXS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.FXS;
        }
    };
    public static final CurrencyDto ETHFI = new CurrencyDto("ETHFI", 387) { // from class: rosetta.blockchain.v1.CurrencyDto.ETHFI
        {
            String str = "ETHFI";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ETHFI;
        }
    };
    public static final CurrencyDto ALCH = new CurrencyDto("ALCH", 388) { // from class: rosetta.blockchain.v1.CurrencyDto.ALCH
        {
            String str = "ALCH";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ALCH;
        }
    };
    public static final CurrencyDto LLY = new CurrencyDto("LLY", 389) { // from class: rosetta.blockchain.v1.CurrencyDto.LLY
        {
            String str = "LLY";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.LLY;
        }
    };
    public static final CurrencyDto PYR = new CurrencyDto("PYR", 390) { // from class: rosetta.blockchain.v1.CurrencyDto.PYR
        {
            String str = "PYR";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.PYR;
        }
    };
    public static final CurrencyDto IBKR = new CurrencyDto("IBKR", 391) { // from class: rosetta.blockchain.v1.CurrencyDto.IBKR
        {
            String str = "IBKR";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.IBKR;
        }
    };
    public static final CurrencyDto AERO = new CurrencyDto("AERO", 392) { // from class: rosetta.blockchain.v1.CurrencyDto.AERO
        {
            String str = "AERO";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.AERO;
        }
    };
    public static final CurrencyDto LPT = new CurrencyDto("LPT", 393) { // from class: rosetta.blockchain.v1.CurrencyDto.LPT
        {
            String str = "LPT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.LPT;
        }
    };
    public static final CurrencyDto ARKM = new CurrencyDto("ARKM", 394) { // from class: rosetta.blockchain.v1.CurrencyDto.ARKM
        {
            String str = "ARKM";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ARKM;
        }
    };
    public static final CurrencyDto ACX = new CurrencyDto("ACX", 395) { // from class: rosetta.blockchain.v1.CurrencyDto.ACX
        {
            String str = "ACX";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ACX;
        }
    };
    public static final CurrencyDto TRNR = new CurrencyDto("TRNR", WaitlistAnimationConstants.LEFT_YAW_START) { // from class: rosetta.blockchain.v1.CurrencyDto.TRNR
        {
            String str = "TRNR";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.TRNR;
        }
    };
    public static final CurrencyDto BICO = new CurrencyDto("BICO", 397) { // from class: rosetta.blockchain.v1.CurrencyDto.BICO
        {
            String str = "BICO";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.BICO;
        }
    };
    public static final CurrencyDto MSTY = new CurrencyDto("MSTY", 398) { // from class: rosetta.blockchain.v1.CurrencyDto.MSTY
        {
            String str = "MSTY";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.MSTY;
        }
    };
    public static final CurrencyDto CEG = new CurrencyDto("CEG", 399) { // from class: rosetta.blockchain.v1.CurrencyDto.CEG
        {
            String str = "CEG";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.CEG;
        }
    };
    public static final CurrencyDto BITU = new CurrencyDto("BITU", 400) { // from class: rosetta.blockchain.v1.CurrencyDto.BITU
        {
            String str = "BITU";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.BITU;
        }
    };
    public static final CurrencyDto VGT = new CurrencyDto("VGT", 401) { // from class: rosetta.blockchain.v1.CurrencyDto.VGT
        {
            String str = "VGT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.VGT;
        }
    };
    public static final CurrencyDto DECK = new CurrencyDto("DECK", 402) { // from class: rosetta.blockchain.v1.CurrencyDto.DECK
        {
            String str = "DECK";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.DECK;
        }
    };
    public static final CurrencyDto WEEK = new CurrencyDto("WEEK", HttpStatusCode.FORBIDDEN) { // from class: rosetta.blockchain.v1.CurrencyDto.WEEK
        {
            String str = "WEEK";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.WEEK;
        }
    };
    public static final CurrencyDto NKE = new CurrencyDto("NKE", 404) { // from class: rosetta.blockchain.v1.CurrencyDto.NKE
        {
            String str = "NKE";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.NKE;
        }
    };
    public static final CurrencyDto TTD = new CurrencyDto("TTD", 405) { // from class: rosetta.blockchain.v1.CurrencyDto.TTD
        {
            String str = "TTD";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.TTD;
        }
    };
    public static final CurrencyDto AMAT = new CurrencyDto("AMAT", 406) { // from class: rosetta.blockchain.v1.CurrencyDto.AMAT
        {
            String str = "AMAT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.AMAT;
        }
    };
    public static final CurrencyDto VOO = new CurrencyDto("VOO", 407) { // from class: rosetta.blockchain.v1.CurrencyDto.VOO
        {
            String str = "VOO";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.VOO;
        }
    };
    public static final CurrencyDto SBUX = new CurrencyDto("SBUX", 408) { // from class: rosetta.blockchain.v1.CurrencyDto.SBUX
        {
            String str = "SBUX";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SBUX;
        }
    };
    public static final CurrencyDto AIDOGE = new CurrencyDto("AIDOGE", 409) { // from class: rosetta.blockchain.v1.CurrencyDto.AIDOGE
        {
            String str = "AIDOGE";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.AIDOGE;
        }
    };
    public static final CurrencyDto IWM = new CurrencyDto("IWM", HttpStatusCode.GONE) { // from class: rosetta.blockchain.v1.CurrencyDto.IWM
        {
            String str = "IWM";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.IWM;
        }
    };
    public static final CurrencyDto CVNA = new CurrencyDto("CVNA", 411) { // from class: rosetta.blockchain.v1.CurrencyDto.CVNA
        {
            String str = "CVNA";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.CVNA;
        }
    };
    public static final CurrencyDto RWM = new CurrencyDto("RWM", 412) { // from class: rosetta.blockchain.v1.CurrencyDto.RWM
        {
            String str = "RWM";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.RWM;
        }
    };
    public static final CurrencyDto BROS = new CurrencyDto("BROS", 413) { // from class: rosetta.blockchain.v1.CurrencyDto.BROS
        {
            String str = "BROS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.BROS;
        }
    };
    public static final CurrencyDto OKLO = new CurrencyDto("OKLO", 414) { // from class: rosetta.blockchain.v1.CurrencyDto.OKLO
        {
            String str = "OKLO";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.OKLO;
        }
    };
    public static final CurrencyDto FBTC = new CurrencyDto("FBTC", 415) { // from class: rosetta.blockchain.v1.CurrencyDto.FBTC
        {
            String str = "FBTC";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.FBTC;
        }
    };
    public static final CurrencyDto KOLD = new CurrencyDto("KOLD", 416) { // from class: rosetta.blockchain.v1.CurrencyDto.KOLD
        {
            String str = "KOLD";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.KOLD;
        }
    };
    public static final CurrencyDto SOFI = new CurrencyDto("SOFI", 417) { // from class: rosetta.blockchain.v1.CurrencyDto.SOFI
        {
            String str = "SOFI";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SOFI;
        }
    };
    public static final CurrencyDto OUNZ = new CurrencyDto("OUNZ", 418) { // from class: rosetta.blockchain.v1.CurrencyDto.OUNZ
        {
            String str = "OUNZ";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.OUNZ;
        }
    };
    public static final CurrencyDto ZVZZT = new CurrencyDto("ZVZZT", 419) { // from class: rosetta.blockchain.v1.CurrencyDto.ZVZZT
        {
            String str = "ZVZZT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ZVZZT;
        }
    };
    public static final CurrencyDto MSFT = new CurrencyDto("MSFT", 420) { // from class: rosetta.blockchain.v1.CurrencyDto.MSFT
        {
            String str = "MSFT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.MSFT;
        }
    };

    /* renamed from: OM */
    public static final CurrencyDto f8164OM = new CurrencyDto("OM", 421) { // from class: rosetta.blockchain.v1.CurrencyDto.OM
        {
            String str = "OM";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.f8143OM;
        }
    };
    public static final CurrencyDto TOSHI = new CurrencyDto("TOSHI", 422) { // from class: rosetta.blockchain.v1.CurrencyDto.TOSHI
        {
            String str = "TOSHI";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.TOSHI;
        }
    };
    public static final CurrencyDto ORDI = new CurrencyDto("ORDI", 423) { // from class: rosetta.blockchain.v1.CurrencyDto.ORDI
        {
            String str = "ORDI";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ORDI;
        }
    };
    public static final CurrencyDto DOCS = new CurrencyDto("DOCS", 424) { // from class: rosetta.blockchain.v1.CurrencyDto.DOCS
        {
            String str = "DOCS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.DOCS;
        }
    };
    public static final CurrencyDto UPRO = new CurrencyDto("UPRO", CompanyFinancialsSection.BAR_ANIMATION_DURATION) { // from class: rosetta.blockchain.v1.CurrencyDto.UPRO
        {
            String str = "UPRO";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.UPRO;
        }
    };
    public static final CurrencyDto OSCR = new CurrencyDto("OSCR", 426) { // from class: rosetta.blockchain.v1.CurrencyDto.OSCR
        {
            String str = "OSCR";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.OSCR;
        }
    };
    public static final CurrencyDto GDX = new CurrencyDto("GDX", 427) { // from class: rosetta.blockchain.v1.CurrencyDto.GDX
        {
            String str = "GDX";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.GDX;
        }
    };
    public static final CurrencyDto APP = new CurrencyDto("APP", 428) { // from class: rosetta.blockchain.v1.CurrencyDto.APP
        {
            String str = "APP";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.APP;
        }
    };
    public static final CurrencyDto MXC = new CurrencyDto("MXC", 429) { // from class: rosetta.blockchain.v1.CurrencyDto.MXC
        {
            String str = "MXC";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.MXC;
        }
    };
    public static final CurrencyDto PEP = new CurrencyDto("PEP", 430) { // from class: rosetta.blockchain.v1.CurrencyDto.PEP
        {
            String str = "PEP";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.PEP;
        }
    };
    public static final CurrencyDto CFG = new CurrencyDto("CFG", 431) { // from class: rosetta.blockchain.v1.CurrencyDto.CFG
        {
            String str = "CFG";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.CFG;
        }
    };
    public static final CurrencyDto API3 = new CurrencyDto("API3", 432) { // from class: rosetta.blockchain.v1.CurrencyDto.API3
        {
            String str = "API3";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.API3;
        }
    };
    public static final CurrencyDto NFLX = new CurrencyDto("NFLX", 433) { // from class: rosetta.blockchain.v1.CurrencyDto.NFLX
        {
            String str = "NFLX";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.NFLX;
        }
    };
    public static final CurrencyDto REQ = new CurrencyDto("REQ", 434) { // from class: rosetta.blockchain.v1.CurrencyDto.REQ
        {
            String str = "REQ";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.REQ;
        }
    };
    public static final CurrencyDto ELF = new CurrencyDto("ELF", 435) { // from class: rosetta.blockchain.v1.CurrencyDto.ELF
        {
            String str = "ELF";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ELF;
        }
    };
    public static final CurrencyDto YGG = new CurrencyDto("YGG", 436) { // from class: rosetta.blockchain.v1.CurrencyDto.YGG
        {
            String str = "YGG";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.YGG;
        }
    };
    public static final CurrencyDto DKNG = new CurrencyDto("DKNG", 437) { // from class: rosetta.blockchain.v1.CurrencyDto.DKNG
        {
            String str = "DKNG";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.DKNG;
        }
    };
    public static final CurrencyDto PONKE = new CurrencyDto("PONKE", 438) { // from class: rosetta.blockchain.v1.CurrencyDto.PONKE
        {
            String str = "PONKE";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.PONKE;
        }
    };
    public static final CurrencyDto PENDLE = new CurrencyDto("PENDLE", 439) { // from class: rosetta.blockchain.v1.CurrencyDto.PENDLE
        {
            String str = "PENDLE";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.PENDLE;
        }
    };
    public static final CurrencyDto ALT = new CurrencyDto("ALT", 440) { // from class: rosetta.blockchain.v1.CurrencyDto.ALT
        {
            String str = "ALT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ALT;
        }
    };
    public static final CurrencyDto DELL = new CurrencyDto("DELL", 441) { // from class: rosetta.blockchain.v1.CurrencyDto.DELL
        {
            String str = "DELL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.DELL;
        }
    };
    public static final CurrencyDto IAUM = new CurrencyDto("IAUM", 442) { // from class: rosetta.blockchain.v1.CurrencyDto.IAUM
        {
            String str = "IAUM";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.IAUM;
        }
    };
    public static final CurrencyDto NVD = new CurrencyDto("NVD", 443) { // from class: rosetta.blockchain.v1.CurrencyDto.NVD
        {
            String str = "NVD";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.NVD;
        }
    };
    public static final CurrencyDto REN = new CurrencyDto("REN", 444) { // from class: rosetta.blockchain.v1.CurrencyDto.REN
        {
            String str = "REN";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.REN;
        }
    };
    public static final CurrencyDto KCS = new CurrencyDto("KCS", 445) { // from class: rosetta.blockchain.v1.CurrencyDto.KCS
        {
            String str = "KCS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.KCS;
        }
    };
    public static final CurrencyDto CLS = new CurrencyDto("CLS", 446) { // from class: rosetta.blockchain.v1.CurrencyDto.CLS
        {
            String str = "CLS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.CLS;
        }
    };
    public static final CurrencyDto CCL = new CurrencyDto("CCL", 447) { // from class: rosetta.blockchain.v1.CurrencyDto.CCL
        {
            String str = "CCL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.CCL;
        }
    };
    public static final CurrencyDto ANET = new CurrencyDto("ANET", 448) { // from class: rosetta.blockchain.v1.CurrencyDto.ANET
        {
            String str = "ANET";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ANET;
        }
    };
    public static final CurrencyDto NVDL = new CurrencyDto("NVDL", 449) { // from class: rosetta.blockchain.v1.CurrencyDto.NVDL
        {
            String str = "NVDL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.NVDL;
        }
    };
    public static final CurrencyDto VST = new CurrencyDto("VST", 450) { // from class: rosetta.blockchain.v1.CurrencyDto.VST
        {
            String str = "VST";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.VST;
        }
    };
    public static final CurrencyDto VVV = new CurrencyDto("VVV", 451) { // from class: rosetta.blockchain.v1.CurrencyDto.VVV
        {
            String str = "VVV";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.VVV;
        }
    };
    public static final CurrencyDto FSLR = new CurrencyDto("FSLR", 452) { // from class: rosetta.blockchain.v1.CurrencyDto.FSLR
        {
            String str = "FSLR";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.FSLR;
        }
    };
    public static final CurrencyDto CLANKER = new CurrencyDto("CLANKER", 453) { // from class: rosetta.blockchain.v1.CurrencyDto.CLANKER
        {
            String str = "CLANKER";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.CLANKER;
        }
    };
    public static final CurrencyDto SPXL = new CurrencyDto("SPXL", 454) { // from class: rosetta.blockchain.v1.CurrencyDto.SPXL
        {
            String str = "SPXL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SPXL;
        }
    };
    public static final CurrencyDto OPAI = new CurrencyDto("OPAI", 455) { // from class: rosetta.blockchain.v1.CurrencyDto.OPAI
        {
            String str = "OPAI";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.OPAI;
        }
    };

    /* renamed from: MU */
    public static final CurrencyDto f8162MU = new CurrencyDto("MU", WaitlistAnimationConstants.MIDDLE_YAW_FRAME) { // from class: rosetta.blockchain.v1.CurrencyDto.MU
        {
            String str = "MU";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.f8141MU;
        }
    };
    public static final CurrencyDto CONL = new CurrencyDto("CONL", 457) { // from class: rosetta.blockchain.v1.CurrencyDto.CONL
        {
            String str = "CONL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.CONL;
        }
    };
    public static final CurrencyDto STG = new CurrencyDto("STG", 458) { // from class: rosetta.blockchain.v1.CurrencyDto.STG
        {
            String str = "STG";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.STG;
        }
    };
    public static final CurrencyDto HUT = new CurrencyDto("HUT", 459) { // from class: rosetta.blockchain.v1.CurrencyDto.HUT
        {
            String str = "HUT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.HUT;
        }
    };
    public static final CurrencyDto LABU = new CurrencyDto("LABU", 460) { // from class: rosetta.blockchain.v1.CurrencyDto.LABU
        {
            String str = "LABU";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.LABU;
        }
    };
    public static final CurrencyDto RED = new CurrencyDto("RED", 461) { // from class: rosetta.blockchain.v1.CurrencyDto.RED
        {
            String str = "RED";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.RED;
        }
    };
    public static final CurrencyDto PLUME = new CurrencyDto("PLUME", 462) { // from class: rosetta.blockchain.v1.CurrencyDto.PLUME
        {
            String str = "PLUME";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.PLUME;
        }
    };
    public static final CurrencyDto MRK = new CurrencyDto("MRK", 463) { // from class: rosetta.blockchain.v1.CurrencyDto.MRK
        {
            String str = "MRK";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.MRK;
        }
    };
    public static final CurrencyDto IOTX = new CurrencyDto("IOTX", 464) { // from class: rosetta.blockchain.v1.CurrencyDto.IOTX
        {
            String str = "IOTX";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.IOTX;
        }
    };
    public static final CurrencyDto DJT = new CurrencyDto("DJT", 465) { // from class: rosetta.blockchain.v1.CurrencyDto.DJT
        {
            String str = "DJT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.DJT;
        }
    };
    public static final CurrencyDto AYRO = new CurrencyDto("AYRO", 466) { // from class: rosetta.blockchain.v1.CurrencyDto.AYRO
        {
            String str = "AYRO";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.AYRO;
        }
    };
    public static final CurrencyDto FAI = new CurrencyDto("FAI", 467) { // from class: rosetta.blockchain.v1.CurrencyDto.FAI
        {
            String str = "FAI";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.FAI;
        }
    };
    public static final CurrencyDto HFT = new CurrencyDto("HFT", 468) { // from class: rosetta.blockchain.v1.CurrencyDto.HFT
        {
            String str = "HFT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.HFT;
        }
    };
    public static final CurrencyDto NBIS = new CurrencyDto("NBIS", 469) { // from class: rosetta.blockchain.v1.CurrencyDto.NBIS
        {
            String str = "NBIS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.NBIS;
        }
    };
    public static final CurrencyDto MNT = new CurrencyDto("MNT", 470) { // from class: rosetta.blockchain.v1.CurrencyDto.MNT
        {
            String str = "MNT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.MNT;
        }
    };
    public static final CurrencyDto BITO = new CurrencyDto("BITO", 471) { // from class: rosetta.blockchain.v1.CurrencyDto.BITO
        {
            String str = "BITO";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.BITO;
        }
    };
    public static final CurrencyDto JPM = new CurrencyDto("JPM", 472) { // from class: rosetta.blockchain.v1.CurrencyDto.JPM
        {
            String str = "JPM";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.JPM;
        }
    };
    public static final CurrencyDto IONQ = new CurrencyDto("IONQ", 473) { // from class: rosetta.blockchain.v1.CurrencyDto.IONQ
        {
            String str = "IONQ";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.IONQ;
        }
    };
    public static final CurrencyDto KP3R = new CurrencyDto("KP3R", 474) { // from class: rosetta.blockchain.v1.CurrencyDto.KP3R
        {
            String str = "KP3R";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.KP3R;
        }
    };
    public static final CurrencyDto COW = new CurrencyDto("COW", 475) { // from class: rosetta.blockchain.v1.CurrencyDto.COW
        {
            String str = "COW";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.COW;
        }
    };
    public static final CurrencyDto GLD = new CurrencyDto("GLD", 476) { // from class: rosetta.blockchain.v1.CurrencyDto.GLD
        {
            String str = "GLD";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.GLD;
        }
    };
    public static final CurrencyDto LCX = new CurrencyDto("LCX", 477) { // from class: rosetta.blockchain.v1.CurrencyDto.LCX
        {
            String str = "LCX";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.LCX;
        }
    };
    public static final CurrencyDto SQQQ = new CurrencyDto("SQQQ", 478) { // from class: rosetta.blockchain.v1.CurrencyDto.SQQQ
        {
            String str = "SQQQ";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SQQQ;
        }
    };

    /* renamed from: MP */
    public static final CurrencyDto f8161MP = new CurrencyDto(CountryCode.COUNTRY_CODE_MP, 479) { // from class: rosetta.blockchain.v1.CurrencyDto.MP
        {
            String str = CountryCode.COUNTRY_CODE_MP;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.f8140MP;
        }
    };
    public static final CurrencyDto ORCA = new CurrencyDto("ORCA", 480) { // from class: rosetta.blockchain.v1.CurrencyDto.ORCA
        {
            String str = "ORCA";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ORCA;
        }
    };
    public static final CurrencyDto SGOV = new CurrencyDto("SGOV", 481) { // from class: rosetta.blockchain.v1.CurrencyDto.SGOV
        {
            String str = "SGOV";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SGOV;
        }
    };
    public static final CurrencyDto KAITO = new CurrencyDto("KAITO", 482) { // from class: rosetta.blockchain.v1.CurrencyDto.KAITO
        {
            String str = "KAITO";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.KAITO;
        }
    };
    public static final CurrencyDto RIOT = new CurrencyDto("RIOT", 483) { // from class: rosetta.blockchain.v1.CurrencyDto.RIOT
        {
            String str = "RIOT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.RIOT;
        }
    };
    public static final CurrencyDto NOW = new CurrencyDto("NOW", 484) { // from class: rosetta.blockchain.v1.CurrencyDto.NOW
        {
            String str = "NOW";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.NOW;
        }
    };
    public static final CurrencyDto MARA = new CurrencyDto("MARA", 485) { // from class: rosetta.blockchain.v1.CurrencyDto.MARA
        {
            String str = "MARA";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.MARA;
        }
    };
    public static final CurrencyDto MEOW = new CurrencyDto(ProfitAndLossTradeItemFixtures.REQUEST_SYMBOL, 486) { // from class: rosetta.blockchain.v1.CurrencyDto.MEOW
        {
            String str = ProfitAndLossTradeItemFixtures.REQUEST_SYMBOL;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.MEOW;
        }
    };
    public static final CurrencyDto MPLX = new CurrencyDto("MPLX", 487) { // from class: rosetta.blockchain.v1.CurrencyDto.MPLX
        {
            String str = "MPLX";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.MPLX;
        }
    };
    public static final CurrencyDto MELI = new CurrencyDto("MELI", 488) { // from class: rosetta.blockchain.v1.CurrencyDto.MELI
        {
            String str = "MELI";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.MELI;
        }
    };
    public static final CurrencyDto ZIM = new CurrencyDto("ZIM", 489) { // from class: rosetta.blockchain.v1.CurrencyDto.ZIM
        {
            String str = "ZIM";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ZIM;
        }
    };
    public static final CurrencyDto QRDO = new CurrencyDto("QRDO", 490) { // from class: rosetta.blockchain.v1.CurrencyDto.QRDO
        {
            String str = "QRDO";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.QRDO;
        }
    };
    public static final CurrencyDto APT = new CurrencyDto("APT", 491) { // from class: rosetta.blockchain.v1.CurrencyDto.APT
        {
            String str = "APT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.APT;
        }
    };
    public static final CurrencyDto XYZ = new CurrencyDto("XYZ", 492) { // from class: rosetta.blockchain.v1.CurrencyDto.XYZ
        {
            String str = "XYZ";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.XYZ;
        }
    };
    public static final CurrencyDto NVDA = new CurrencyDto("NVDA", 493) { // from class: rosetta.blockchain.v1.CurrencyDto.NVDA
        {
            String str = "NVDA";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.NVDA;
        }
    };
    public static final CurrencyDto MAGIC = new CurrencyDto("MAGIC", 494) { // from class: rosetta.blockchain.v1.CurrencyDto.MAGIC
        {
            String str = "MAGIC";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.MAGIC;
        }
    };
    public static final CurrencyDto ALEX = new CurrencyDto("ALEX", 495) { // from class: rosetta.blockchain.v1.CurrencyDto.ALEX
        {
            String str = "ALEX";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ALEX;
        }
    };
    public static final CurrencyDto COST = new CurrencyDto("COST", 496) { // from class: rosetta.blockchain.v1.CurrencyDto.COST
        {
            String str = "COST";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.COST;
        }
    };
    public static final CurrencyDto QUARTZ = new CurrencyDto("QUARTZ", 497) { // from class: rosetta.blockchain.v1.CurrencyDto.QUARTZ
        {
            String str = "QUARTZ";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.QUARTZ;
        }
    };
    public static final CurrencyDto XOM = new CurrencyDto("XOM", 498) { // from class: rosetta.blockchain.v1.CurrencyDto.XOM
        {
            String str = "XOM";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.XOM;
        }
    };
    public static final CurrencyDto SPACEX = new CurrencyDto("SPACEX", 499) { // from class: rosetta.blockchain.v1.CurrencyDto.SPACEX
        {
            String str = "SPACEX";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SPACEX;
        }
    };
    public static final CurrencyDto QQQ = new CurrencyDto("QQQ", 500) { // from class: rosetta.blockchain.v1.CurrencyDto.QQQ
        {
            String str = "QQQ";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.QQQ;
        }
    };
    public static final CurrencyDto ACH = new CurrencyDto("ACH", 501) { // from class: rosetta.blockchain.v1.CurrencyDto.ACH
        {
            String str = "ACH";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ACH;
        }
    };
    public static final CurrencyDto ATH = new CurrencyDto("ATH", com.withpersona.sdk2.inquiry.network.core.HttpStatusCode.BAD_GATEWAY_502) { // from class: rosetta.blockchain.v1.CurrencyDto.ATH
        {
            String str = "ATH";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ATH;
        }
    };
    public static final CurrencyDto DIS = new CurrencyDto("DIS", 503) { // from class: rosetta.blockchain.v1.CurrencyDto.DIS
        {
            String str = "DIS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.DIS;
        }
    };
    public static final CurrencyDto SAFE = new CurrencyDto("SAFE", 504) { // from class: rosetta.blockchain.v1.CurrencyDto.SAFE
        {
            String str = "SAFE";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SAFE;
        }
    };
    public static final CurrencyDto TLT = new CurrencyDto("TLT", 505) { // from class: rosetta.blockchain.v1.CurrencyDto.TLT
        {
            String str = "TLT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.TLT;
        }
    };
    public static final CurrencyDto OXY = new CurrencyDto("OXY", 506) { // from class: rosetta.blockchain.v1.CurrencyDto.OXY
        {
            String str = "OXY";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.OXY;
        }
    };
    public static final CurrencyDto RLC = new CurrencyDto("RLC", 507) { // from class: rosetta.blockchain.v1.CurrencyDto.RLC
        {
            String str = "RLC";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.RLC;
        }
    };
    public static final CurrencyDto GEOD = new CurrencyDto("GEOD", 508) { // from class: rosetta.blockchain.v1.CurrencyDto.GEOD
        {
            String str = "GEOD";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.GEOD;
        }
    };
    public static final CurrencyDto KMNO = new CurrencyDto("KMNO", 509) { // from class: rosetta.blockchain.v1.CurrencyDto.KMNO
        {
            String str = "KMNO";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.KMNO;
        }
    };
    public static final CurrencyDto COOKIE = new CurrencyDto("COOKIE", 510) { // from class: rosetta.blockchain.v1.CurrencyDto.COOKIE
        {
            String str = "COOKIE";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.COOKIE;
        }
    };
    public static final CurrencyDto UBER = new CurrencyDto("UBER", 511) { // from class: rosetta.blockchain.v1.CurrencyDto.UBER
        {
            String str = "UBER";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.UBER;
        }
    };
    public static final CurrencyDto KWEB = new CurrencyDto("KWEB", 512) { // from class: rosetta.blockchain.v1.CurrencyDto.KWEB
        {
            String str = "KWEB";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.KWEB;
        }
    };
    public static final CurrencyDto ALAB = new CurrencyDto("ALAB", 513) { // from class: rosetta.blockchain.v1.CurrencyDto.ALAB
        {
            String str = "ALAB";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ALAB;
        }
    };
    public static final CurrencyDto GNLN = new CurrencyDto("GNLN", 514) { // from class: rosetta.blockchain.v1.CurrencyDto.GNLN
        {
            String str = "GNLN";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.GNLN;
        }
    };
    public static final CurrencyDto CRCL = new CurrencyDto("CRCL", 515) { // from class: rosetta.blockchain.v1.CurrencyDto.CRCL
        {
            String str = "CRCL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.CRCL;
        }
    };
    public static final CurrencyDto BITI = new CurrencyDto("BITI", WaitlistAnimationConstants.RIGHT_YAW_END) { // from class: rosetta.blockchain.v1.CurrencyDto.BITI
        {
            String str = "BITI";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.BITI;
        }
    };
    public static final CurrencyDto SPY = new CurrencyDto(OptionChainOnboardingDuxo.DEFAULT, 517) { // from class: rosetta.blockchain.v1.CurrencyDto.SPY
        {
            String str = OptionChainOnboardingDuxo.DEFAULT;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SPY;
        }
    };
    public static final CurrencyDto QQQM = new CurrencyDto("QQQM", 518) { // from class: rosetta.blockchain.v1.CurrencyDto.QQQM
        {
            String str = "QQQM";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.QQQM;
        }
    };
    public static final CurrencyDto GRIFFAIN = new CurrencyDto("GRIFFAIN", 519) { // from class: rosetta.blockchain.v1.CurrencyDto.GRIFFAIN
        {
            String str = "GRIFFAIN";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.GRIFFAIN;
        }
    };
    public static final CurrencyDto WELL = new CurrencyDto("WELL", 520) { // from class: rosetta.blockchain.v1.CurrencyDto.WELL
        {
            String str = "WELL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.WELL;
        }
    };
    public static final CurrencyDto JEPI = new CurrencyDto("JEPI", HttpStatusCode.DOWNTIME_ERROR) { // from class: rosetta.blockchain.v1.CurrencyDto.JEPI
        {
            String str = "JEPI";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.JEPI;
        }
    };
    public static final CurrencyDto SBIT = new CurrencyDto("SBIT", 522) { // from class: rosetta.blockchain.v1.CurrencyDto.SBIT
        {
            String str = "SBIT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SBIT;
        }
    };
    public static final CurrencyDto NVDU = new CurrencyDto("NVDU", 523) { // from class: rosetta.blockchain.v1.CurrencyDto.NVDU
        {
            String str = "NVDU";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.NVDU;
        }
    };
    public static final CurrencyDto ETHA = new CurrencyDto("ETHA", 524) { // from class: rosetta.blockchain.v1.CurrencyDto.ETHA
        {
            String str = "ETHA";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ETHA;
        }
    };
    public static final CurrencyDto TMUS = new CurrencyDto("TMUS", 525) { // from class: rosetta.blockchain.v1.CurrencyDto.TMUS
        {
            String str = "TMUS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.TMUS;
        }
    };
    public static final CurrencyDto DRIFT = new CurrencyDto("DRIFT", 526) { // from class: rosetta.blockchain.v1.CurrencyDto.DRIFT
        {
            String str = "DRIFT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.DRIFT;
        }
    };
    public static final CurrencyDto NVDY = new CurrencyDto("NVDY", 527) { // from class: rosetta.blockchain.v1.CurrencyDto.NVDY
        {
            String str = "NVDY";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.NVDY;
        }
    };
    public static final CurrencyDto SMH = new CurrencyDto("SMH", 528) { // from class: rosetta.blockchain.v1.CurrencyDto.SMH
        {
            String str = "SMH";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SMH;
        }
    };
    public static final CurrencyDto FAZ = new CurrencyDto("FAZ", 529) { // from class: rosetta.blockchain.v1.CurrencyDto.FAZ
        {
            String str = "FAZ";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.FAZ;
        }
    };

    /* renamed from: T */
    public static final CurrencyDto f8167T = new CurrencyDto("T", 530) { // from class: rosetta.blockchain.v1.CurrencyDto.T
        {
            String str = "T";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.f8146T;
        }
    };
    public static final CurrencyDto AAAU = new CurrencyDto("AAAU", 531) { // from class: rosetta.blockchain.v1.CurrencyDto.AAAU
        {
            String str = "AAAU";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.AAAU;
        }
    };
    public static final CurrencyDto LABD = new CurrencyDto("LABD", 532) { // from class: rosetta.blockchain.v1.CurrencyDto.LABD
        {
            String str = "LABD";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.LABD;
        }
    };
    public static final CurrencyDto AXL = new CurrencyDto("AXL", 533) { // from class: rosetta.blockchain.v1.CurrencyDto.AXL
        {
            String str = "AXL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.AXL;
        }
    };
    public static final CurrencyDto SPX = new CurrencyDto(OptionChainOnboardingDuxo.UK_DEFAULT, 534) { // from class: rosetta.blockchain.v1.CurrencyDto.SPX
        {
            String str = OptionChainOnboardingDuxo.UK_DEFAULT;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SPX;
        }
    };
    public static final CurrencyDto QWAN = new CurrencyDto("QWAN", 535) { // from class: rosetta.blockchain.v1.CurrencyDto.QWAN
        {
            String str = "QWAN";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.QWAN;
        }
    };
    public static final CurrencyDto GMX = new CurrencyDto("GMX", 536) { // from class: rosetta.blockchain.v1.CurrencyDto.GMX
        {
            String str = "GMX";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.GMX;
        }
    };
    public static final CurrencyDto TSLY = new CurrencyDto("TSLY", 537) { // from class: rosetta.blockchain.v1.CurrencyDto.TSLY
        {
            String str = "TSLY";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.TSLY;
        }
    };
    public static final CurrencyDto QLD = new CurrencyDto("QLD", 538) { // from class: rosetta.blockchain.v1.CurrencyDto.QLD
        {
            String str = "QLD";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.QLD;
        }
    };
    public static final CurrencyDto YMAX = new CurrencyDto("YMAX", 539) { // from class: rosetta.blockchain.v1.CurrencyDto.YMAX
        {
            String str = "YMAX";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.YMAX;
        }
    };
    public static final CurrencyDto TSLL = new CurrencyDto("TSLL", 540) { // from class: rosetta.blockchain.v1.CurrencyDto.TSLL
        {
            String str = "TSLL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.TSLL;
        }
    };
    public static final CurrencyDto CMG = new CurrencyDto("CMG", 541) { // from class: rosetta.blockchain.v1.CurrencyDto.CMG
        {
            String str = "CMG";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.CMG;
        }
    };
    public static final CurrencyDto CRM = new CurrencyDto("CRM", 542) { // from class: rosetta.blockchain.v1.CurrencyDto.CRM
        {
            String str = "CRM";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.CRM;
        }
    };
    public static final CurrencyDto BAC = new CurrencyDto("BAC", 543) { // from class: rosetta.blockchain.v1.CurrencyDto.BAC
        {
            String str = "BAC";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.BAC;
        }
    };
    public static final CurrencyDto RUN = new CurrencyDto("RUN", 544) { // from class: rosetta.blockchain.v1.CurrencyDto.RUN
        {
            String str = "RUN";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.RUN;
        }
    };
    public static final CurrencyDto HIMS = new CurrencyDto("HIMS", 545) { // from class: rosetta.blockchain.v1.CurrencyDto.HIMS
        {
            String str = "HIMS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.HIMS;
        }
    };
    public static final CurrencyDto KSM = new CurrencyDto("KSM", 546) { // from class: rosetta.blockchain.v1.CurrencyDto.KSM
        {
            String str = "KSM";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.KSM;
        }
    };
    public static final CurrencyDto SGOL = new CurrencyDto("SGOL", 547) { // from class: rosetta.blockchain.v1.CurrencyDto.SGOL
        {
            String str = "SGOL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SGOL;
        }
    };
    public static final CurrencyDto NEIRO = new CurrencyDto("NEIRO", 548) { // from class: rosetta.blockchain.v1.CurrencyDto.NEIRO
        {
            String str = "NEIRO";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.NEIRO;
        }
    };
    public static final CurrencyDto ARKB = new CurrencyDto("ARKB", 549) { // from class: rosetta.blockchain.v1.CurrencyDto.ARKB
        {
            String str = "ARKB";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ARKB;
        }
    };

    /* renamed from: EL */
    public static final CurrencyDto f8154EL = new CurrencyDto("EL", 550) { // from class: rosetta.blockchain.v1.CurrencyDto.EL
        {
            String str = "EL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.f8133EL;
        }
    };
    public static final CurrencyDto NCLH = new CurrencyDto("NCLH", 551) { // from class: rosetta.blockchain.v1.CurrencyDto.NCLH
        {
            String str = "NCLH";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.NCLH;
        }
    };
    public static final CurrencyDto NET = new CurrencyDto("NET", RhRoomDatabase.MIGRATION_START_VER) { // from class: rosetta.blockchain.v1.CurrencyDto.NET
        {
            String str = "NET";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.NET;
        }
    };
    public static final CurrencyDto SMR = new CurrencyDto("SMR", 553) { // from class: rosetta.blockchain.v1.CurrencyDto.SMR
        {
            String str = "SMR";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.SMR;
        }
    };
    public static final CurrencyDto METIS = new CurrencyDto("METIS", 554) { // from class: rosetta.blockchain.v1.CurrencyDto.METIS
        {
            String str = "METIS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.METIS;
        }
    };
    public static final CurrencyDto UPST = new CurrencyDto("UPST", 555) { // from class: rosetta.blockchain.v1.CurrencyDto.UPST
        {
            String str = "UPST";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.UPST;
        }
    };
    public static final CurrencyDto TNSR = new CurrencyDto("TNSR", 556) { // from class: rosetta.blockchain.v1.CurrencyDto.TNSR
        {
            String str = "TNSR";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.TNSR;
        }
    };
    public static final CurrencyDto WMT = new CurrencyDto("WMT", 557) { // from class: rosetta.blockchain.v1.CurrencyDto.WMT
        {
            String str = "WMT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.WMT;
        }
    };
    public static final CurrencyDto LBRDA = new CurrencyDto("LBRDA", 558) { // from class: rosetta.blockchain.v1.CurrencyDto.LBRDA
        {
            String str = "LBRDA";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.LBRDA;
        }
    };
    public static final CurrencyDto ARKG = new CurrencyDto("ARKG", 559) { // from class: rosetta.blockchain.v1.CurrencyDto.ARKG
        {
            String str = "ARKG";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ARKG;
        }
    };
    public static final CurrencyDto GLIBA = new CurrencyDto("GLIBA", 560) { // from class: rosetta.blockchain.v1.CurrencyDto.GLIBA
        {
            String str = "GLIBA";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.GLIBA;
        }
    };
    public static final CurrencyDto GLBAV = new CurrencyDto("GLBAV", 561) { // from class: rosetta.blockchain.v1.CurrencyDto.GLBAV
        {
            String str = "GLBAV";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.GLBAV;
        }
    };
    public static final CurrencyDto WLFI = new CurrencyDto("WLFI", 562) { // from class: rosetta.blockchain.v1.CurrencyDto.WLFI
        {
            String str = "WLFI";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.WLFI;
        }
    };
    public static final CurrencyDto ZORA = new CurrencyDto("ZORA", 563) { // from class: rosetta.blockchain.v1.CurrencyDto.ZORA
        {
            String str = "ZORA";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ZORA;
        }
    };
    public static final CurrencyDto ASTER = new CurrencyDto("ASTER", 564) { // from class: rosetta.blockchain.v1.CurrencyDto.ASTER
        {
            String str = "ASTER";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.ASTER;
        }
    };
    public static final CurrencyDto XPL = new CurrencyDto("XPL", 565) { // from class: rosetta.blockchain.v1.CurrencyDto.XPL
        {
            String str = "XPL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.XPL;
        }
    };
    public static final CurrencyDto HYPE = new CurrencyDto("HYPE", 566) { // from class: rosetta.blockchain.v1.CurrencyDto.HYPE
        {
            String str = "HYPE";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.HYPE;
        }
    };
    public static final CurrencyDto AVNT = new CurrencyDto("AVNT", 567) { // from class: rosetta.blockchain.v1.CurrencyDto.AVNT
        {
            String str = "AVNT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.AVNT;
        }
    };
    public static final CurrencyDto OPENL = new CurrencyDto("OPENL", 568) { // from class: rosetta.blockchain.v1.CurrencyDto.OPENL
        {
            String str = "OPENL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.OPENL;
        }
    };
    public static final CurrencyDto OPENW = new CurrencyDto("OPENW", 569) { // from class: rosetta.blockchain.v1.CurrencyDto.OPENW
        {
            String str = "OPENW";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.OPENW;
        }
    };
    public static final CurrencyDto OPENZ = new CurrencyDto("OPENZ", 570) { // from class: rosetta.blockchain.v1.CurrencyDto.OPENZ
        {
            String str = "OPENZ";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.OPENZ;
        }
    };
    public static final CurrencyDto XCN = new CurrencyDto("XCN", 571) { // from class: rosetta.blockchain.v1.CurrencyDto.XCN
        {
            String str = "XCN";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Currency toProto() {
            return Currency.XCN;
        }
    };

    private static final /* synthetic */ CurrencyDto[] $values() {
        return new CurrencyDto[]{CURRENCY_UNSPECIFIED, BTC, BCH, BSV, LTC, DOGE, ETH, ETC, USD, USDT, XRP, QTUM, NEO, XMR, DASH, BTG, LSK, OMG, BNB, USDC, LUNA, XLM, ZEC, SOL, ADA, AVAX, DOT, BUSD, UST, CRO, DAI, ATOM, NEAR, UNI, FTT, TRX, ALGO, LEO, FTM, BTCB, HBAR, ICP, SAND, FIL, AXS, VET, EGLD, THETA, KLAY, XTZ, HNT, FLOW, AAVE, LINK, LRC, SHIB, COMP, MATIC, MANA, CELO, BAL, WETH, ZRX, RUNE, PAXG, CAKE, USDP, STX, APE, YFI, BAT, GUSD, ENJ, WBTC, DCR, XEM, MKR, TUSD, DFI, RARI, WAVES, CRV, FRAX, GMT, GRT, MIOTA, ETHW, LDO, CELR, LOOM, GHST, PEPE, CVX, HOPR, EOS, EUROC, FUN, OCEAN, SNX, SUSHI, ARB, BONK, f8165OP, TIA, WIF, COQ, JUP, TON, f8170W, STETH, f8171ZK, ZRO, EUR, IMX, RENDER, FLOKI, EIGEN, ENA, EURC, AKT, PYUSD, POL, AAPL, TSLA, f8166S, TRUMP, PENGU, ONDO, INJ, JASMY, STRK, PYTH, STO, COON, RANP, ALTL, AEC, STOP, POPCAT, VIRTUAL, PNUT, MEW, SIMPSON, VINO, YOM, BERA, AMEX, KCT, XAI, ATC, HOOD, AMZN, GME, AMD, META, CRWD, COIN, MSTR, GOOG, PLTR, QNT, AKITA, SAFEMOON, BABYUNI, MEGA, ONEINCH, AMP, AUDIO, BAND, BLUR, BNT, BOME, CHZ, COREUM, CSPR, CTSI, CVC, CXT, CTX, DGLD, DYDX, ENS, EURCV, EURT, FET, FLR, GALA, GYEN, KNC, LMWR, MELANIA, MOG, NEXO, PERP, RAD, RLUSD, RLY, SEI, SGB, SKL, SLP, SMT, SPELL, STORJ, SUI, SYRUP, TRAC, TRUF, UMA, VCHF, VEUR, VEXT, WEN, WOO, WECAN, XCHNG, XDC, XSGD, ZETA, ZUSD, MOODENG, GLUB, NOODLE, PLS, TURBO, GMXP, SDS, MTC, TMDX, ELON, IVV, HMND, HONEY, LAYER, GLMR, f8159KO, SPOT, SMCX, GIGA, USFR, f8169VZ, IAU, ARPA, UAL, RAY, f8160ME, MRVL, HOT, UPS, f8153BA, DEPRECATED_EUROC, GEV, TZA, GAL, LMT, f8156GE, CONY, BIO, CELH, IOST, ZEUS, GNO, SPXU, SCHD, SLV, RPL, PLA, WAMPL, ROOT, KAVA, PINS, MOVE, SOXL, INTR, INDEX, CVS, AVGO, WLD, BRETT, PANW, WDAY, SNAP, BOBA, BABYDOGE, MASK, KHC, ORCL, RDDT, INTC, TMF, ANKR, RIVN, PRIME, MORPHO, LYFT, EUL, XYO, RKT, INOD, RBLX, VTI, POLS, BEAM, AAL, MYTH, JNJ, SRPT, PHA, FARTCOIN, QCOM, ABNB, KGC, AIOZ, JEPQ, TGT, TEM, CAVA, PFE, f8168U, LQTY, DOGINME, f8151AI, SNOW, f8158IO, CKB, f8163NU, TQQQ, KAP, HOOK, RNDR, VUG, ACS, ROUTE, MRNA, SHOP, f8152B3, UNH, ARC, DAL, ZKJ, MAGS, MSTZ, BTRST, SUPER, OKTA, ZIL, DKS, f8155F, CLF, ROKU, BIGTIME, GRASS, AVA, BIL, AFRM, TNA, AMPL, GOAT, IBIT, AIXBT, ONE, GAP, GOOGL, VRT, CHEX, HUM, TTWO, f8157HD, VXX, RDNT, SMCI, CFX, SOXS, INDP, PAAL, ENPH, CLSK, KEY, AGIX, JTO, ACE, PYPL, AI16Z, CSCO, SPXS, TECL, FXS, ETHFI, ALCH, LLY, PYR, IBKR, AERO, LPT, ARKM, ACX, TRNR, BICO, MSTY, CEG, BITU, VGT, DECK, WEEK, NKE, TTD, AMAT, VOO, SBUX, AIDOGE, IWM, CVNA, RWM, BROS, OKLO, FBTC, KOLD, SOFI, OUNZ, ZVZZT, MSFT, f8164OM, TOSHI, ORDI, DOCS, UPRO, OSCR, GDX, APP, MXC, PEP, CFG, API3, NFLX, REQ, ELF, YGG, DKNG, PONKE, PENDLE, ALT, DELL, IAUM, NVD, REN, KCS, CLS, CCL, ANET, NVDL, VST, VVV, FSLR, CLANKER, SPXL, OPAI, f8162MU, CONL, STG, HUT, LABU, RED, PLUME, MRK, IOTX, DJT, AYRO, FAI, HFT, NBIS, MNT, BITO, JPM, IONQ, KP3R, COW, GLD, LCX, SQQQ, f8161MP, ORCA, SGOV, KAITO, RIOT, NOW, MARA, MEOW, MPLX, MELI, ZIM, QRDO, APT, XYZ, NVDA, MAGIC, ALEX, COST, QUARTZ, XOM, SPACEX, QQQ, ACH, ATH, DIS, SAFE, TLT, OXY, RLC, GEOD, KMNO, COOKIE, UBER, KWEB, ALAB, GNLN, CRCL, BITI, SPY, QQQM, GRIFFAIN, WELL, JEPI, SBIT, NVDU, ETHA, TMUS, DRIFT, NVDY, SMH, FAZ, f8167T, AAAU, LABD, AXL, SPX, QWAN, GMX, TSLY, QLD, YMAX, TSLL, CMG, CRM, BAC, RUN, HIMS, KSM, SGOL, NEIRO, ARKB, f8154EL, NCLH, NET, SMR, METIS, UPST, TNSR, WMT, LBRDA, ARKG, GLIBA, GLBAV, WLFI, ZORA, ASTER, XPL, HYPE, AVNT, OPENL, OPENW, OPENZ, XCN};
    }

    public /* synthetic */ CurrencyDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<CurrencyDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CurrencyDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        CurrencyDto[] currencyDtoArr$values = $values();
        $VALUES = currencyDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(currencyDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.blockchain.v1.CurrencyDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CurrencyDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: CurrencyDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/blockchain/v1/CurrencyDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrosetta/blockchain/v1/CurrencyDto;", "Lrosetta/blockchain/v1/Currency;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/blockchain/v1/CurrencyDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.blockchain.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<CurrencyDto, Currency> {

        /* compiled from: CurrencyDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Currency.values().length];
                try {
                    iArr[Currency.CURRENCY_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Currency.BTC.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Currency.BCH.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Currency.BSV.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Currency.LTC.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Currency.DOGE.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Currency.ETH.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[Currency.ETC.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[Currency.USD.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[Currency.USDT.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[Currency.XRP.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[Currency.QTUM.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[Currency.NEO.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[Currency.XMR.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[Currency.DASH.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[Currency.BTG.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[Currency.LSK.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[Currency.OMG.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[Currency.BNB.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[Currency.USDC.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[Currency.LUNA.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[Currency.XLM.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[Currency.ZEC.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[Currency.SOL.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[Currency.ADA.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[Currency.AVAX.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[Currency.DOT.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[Currency.BUSD.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[Currency.UST.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[Currency.CRO.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[Currency.DAI.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[Currency.ATOM.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[Currency.NEAR.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[Currency.UNI.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[Currency.FTT.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[Currency.TRX.ordinal()] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[Currency.ALGO.ordinal()] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr[Currency.LEO.ordinal()] = 38;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr[Currency.FTM.ordinal()] = 39;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr[Currency.BTCB.ordinal()] = 40;
                } catch (NoSuchFieldError unused40) {
                }
                try {
                    iArr[Currency.HBAR.ordinal()] = 41;
                } catch (NoSuchFieldError unused41) {
                }
                try {
                    iArr[Currency.ICP.ordinal()] = 42;
                } catch (NoSuchFieldError unused42) {
                }
                try {
                    iArr[Currency.SAND.ordinal()] = 43;
                } catch (NoSuchFieldError unused43) {
                }
                try {
                    iArr[Currency.FIL.ordinal()] = 44;
                } catch (NoSuchFieldError unused44) {
                }
                try {
                    iArr[Currency.AXS.ordinal()] = 45;
                } catch (NoSuchFieldError unused45) {
                }
                try {
                    iArr[Currency.VET.ordinal()] = 46;
                } catch (NoSuchFieldError unused46) {
                }
                try {
                    iArr[Currency.EGLD.ordinal()] = 47;
                } catch (NoSuchFieldError unused47) {
                }
                try {
                    iArr[Currency.THETA.ordinal()] = 48;
                } catch (NoSuchFieldError unused48) {
                }
                try {
                    iArr[Currency.KLAY.ordinal()] = 49;
                } catch (NoSuchFieldError unused49) {
                }
                try {
                    iArr[Currency.XTZ.ordinal()] = 50;
                } catch (NoSuchFieldError unused50) {
                }
                try {
                    iArr[Currency.HNT.ordinal()] = 51;
                } catch (NoSuchFieldError unused51) {
                }
                try {
                    iArr[Currency.FLOW.ordinal()] = 52;
                } catch (NoSuchFieldError unused52) {
                }
                try {
                    iArr[Currency.AAVE.ordinal()] = 53;
                } catch (NoSuchFieldError unused53) {
                }
                try {
                    iArr[Currency.LINK.ordinal()] = 54;
                } catch (NoSuchFieldError unused54) {
                }
                try {
                    iArr[Currency.LRC.ordinal()] = 55;
                } catch (NoSuchFieldError unused55) {
                }
                try {
                    iArr[Currency.SHIB.ordinal()] = 56;
                } catch (NoSuchFieldError unused56) {
                }
                try {
                    iArr[Currency.COMP.ordinal()] = 57;
                } catch (NoSuchFieldError unused57) {
                }
                try {
                    iArr[Currency.MATIC.ordinal()] = 58;
                } catch (NoSuchFieldError unused58) {
                }
                try {
                    iArr[Currency.MANA.ordinal()] = 59;
                } catch (NoSuchFieldError unused59) {
                }
                try {
                    iArr[Currency.CELO.ordinal()] = 60;
                } catch (NoSuchFieldError unused60) {
                }
                try {
                    iArr[Currency.BAL.ordinal()] = 61;
                } catch (NoSuchFieldError unused61) {
                }
                try {
                    iArr[Currency.WETH.ordinal()] = 62;
                } catch (NoSuchFieldError unused62) {
                }
                try {
                    iArr[Currency.ZRX.ordinal()] = 63;
                } catch (NoSuchFieldError unused63) {
                }
                try {
                    iArr[Currency.RUNE.ordinal()] = 64;
                } catch (NoSuchFieldError unused64) {
                }
                try {
                    iArr[Currency.PAXG.ordinal()] = 65;
                } catch (NoSuchFieldError unused65) {
                }
                try {
                    iArr[Currency.CAKE.ordinal()] = 66;
                } catch (NoSuchFieldError unused66) {
                }
                try {
                    iArr[Currency.USDP.ordinal()] = 67;
                } catch (NoSuchFieldError unused67) {
                }
                try {
                    iArr[Currency.STX.ordinal()] = 68;
                } catch (NoSuchFieldError unused68) {
                }
                try {
                    iArr[Currency.APE.ordinal()] = 69;
                } catch (NoSuchFieldError unused69) {
                }
                try {
                    iArr[Currency.YFI.ordinal()] = 70;
                } catch (NoSuchFieldError unused70) {
                }
                try {
                    iArr[Currency.BAT.ordinal()] = 71;
                } catch (NoSuchFieldError unused71) {
                }
                try {
                    iArr[Currency.GUSD.ordinal()] = 72;
                } catch (NoSuchFieldError unused72) {
                }
                try {
                    iArr[Currency.ENJ.ordinal()] = 73;
                } catch (NoSuchFieldError unused73) {
                }
                try {
                    iArr[Currency.WBTC.ordinal()] = 74;
                } catch (NoSuchFieldError unused74) {
                }
                try {
                    iArr[Currency.DCR.ordinal()] = 75;
                } catch (NoSuchFieldError unused75) {
                }
                try {
                    iArr[Currency.XEM.ordinal()] = 76;
                } catch (NoSuchFieldError unused76) {
                }
                try {
                    iArr[Currency.MKR.ordinal()] = 77;
                } catch (NoSuchFieldError unused77) {
                }
                try {
                    iArr[Currency.TUSD.ordinal()] = 78;
                } catch (NoSuchFieldError unused78) {
                }
                try {
                    iArr[Currency.DFI.ordinal()] = 79;
                } catch (NoSuchFieldError unused79) {
                }
                try {
                    iArr[Currency.RARI.ordinal()] = 80;
                } catch (NoSuchFieldError unused80) {
                }
                try {
                    iArr[Currency.WAVES.ordinal()] = 81;
                } catch (NoSuchFieldError unused81) {
                }
                try {
                    iArr[Currency.CRV.ordinal()] = 82;
                } catch (NoSuchFieldError unused82) {
                }
                try {
                    iArr[Currency.FRAX.ordinal()] = 83;
                } catch (NoSuchFieldError unused83) {
                }
                try {
                    iArr[Currency.GMT.ordinal()] = 84;
                } catch (NoSuchFieldError unused84) {
                }
                try {
                    iArr[Currency.GRT.ordinal()] = 85;
                } catch (NoSuchFieldError unused85) {
                }
                try {
                    iArr[Currency.MIOTA.ordinal()] = 86;
                } catch (NoSuchFieldError unused86) {
                }
                try {
                    iArr[Currency.ETHW.ordinal()] = 87;
                } catch (NoSuchFieldError unused87) {
                }
                try {
                    iArr[Currency.LDO.ordinal()] = 88;
                } catch (NoSuchFieldError unused88) {
                }
                try {
                    iArr[Currency.CELR.ordinal()] = 89;
                } catch (NoSuchFieldError unused89) {
                }
                try {
                    iArr[Currency.LOOM.ordinal()] = 90;
                } catch (NoSuchFieldError unused90) {
                }
                try {
                    iArr[Currency.GHST.ordinal()] = 91;
                } catch (NoSuchFieldError unused91) {
                }
                try {
                    iArr[Currency.PEPE.ordinal()] = 92;
                } catch (NoSuchFieldError unused92) {
                }
                try {
                    iArr[Currency.CVX.ordinal()] = 93;
                } catch (NoSuchFieldError unused93) {
                }
                try {
                    iArr[Currency.HOPR.ordinal()] = 94;
                } catch (NoSuchFieldError unused94) {
                }
                try {
                    iArr[Currency.EOS.ordinal()] = 95;
                } catch (NoSuchFieldError unused95) {
                }
                try {
                    iArr[Currency.EUROC.ordinal()] = 96;
                } catch (NoSuchFieldError unused96) {
                }
                try {
                    iArr[Currency.FUN.ordinal()] = 97;
                } catch (NoSuchFieldError unused97) {
                }
                try {
                    iArr[Currency.OCEAN.ordinal()] = 98;
                } catch (NoSuchFieldError unused98) {
                }
                try {
                    iArr[Currency.SNX.ordinal()] = 99;
                } catch (NoSuchFieldError unused99) {
                }
                try {
                    iArr[Currency.SUSHI.ordinal()] = 100;
                } catch (NoSuchFieldError unused100) {
                }
                try {
                    iArr[Currency.ARB.ordinal()] = 101;
                } catch (NoSuchFieldError unused101) {
                }
                try {
                    iArr[Currency.BONK.ordinal()] = 102;
                } catch (NoSuchFieldError unused102) {
                }
                try {
                    iArr[Currency.f8144OP.ordinal()] = 103;
                } catch (NoSuchFieldError unused103) {
                }
                try {
                    iArr[Currency.TIA.ordinal()] = 104;
                } catch (NoSuchFieldError unused104) {
                }
                try {
                    iArr[Currency.WIF.ordinal()] = 105;
                } catch (NoSuchFieldError unused105) {
                }
                try {
                    iArr[Currency.COQ.ordinal()] = 106;
                } catch (NoSuchFieldError unused106) {
                }
                try {
                    iArr[Currency.JUP.ordinal()] = 107;
                } catch (NoSuchFieldError unused107) {
                }
                try {
                    iArr[Currency.TON.ordinal()] = 108;
                } catch (NoSuchFieldError unused108) {
                }
                try {
                    iArr[Currency.f8149W.ordinal()] = 109;
                } catch (NoSuchFieldError unused109) {
                }
                try {
                    iArr[Currency.STETH.ordinal()] = 110;
                } catch (NoSuchFieldError unused110) {
                }
                try {
                    iArr[Currency.f8150ZK.ordinal()] = 111;
                } catch (NoSuchFieldError unused111) {
                }
                try {
                    iArr[Currency.ZRO.ordinal()] = 112;
                } catch (NoSuchFieldError unused112) {
                }
                try {
                    iArr[Currency.EUR.ordinal()] = 113;
                } catch (NoSuchFieldError unused113) {
                }
                try {
                    iArr[Currency.IMX.ordinal()] = 114;
                } catch (NoSuchFieldError unused114) {
                }
                try {
                    iArr[Currency.RENDER.ordinal()] = 115;
                } catch (NoSuchFieldError unused115) {
                }
                try {
                    iArr[Currency.FLOKI.ordinal()] = 116;
                } catch (NoSuchFieldError unused116) {
                }
                try {
                    iArr[Currency.EIGEN.ordinal()] = 117;
                } catch (NoSuchFieldError unused117) {
                }
                try {
                    iArr[Currency.ENA.ordinal()] = 118;
                } catch (NoSuchFieldError unused118) {
                }
                try {
                    iArr[Currency.EURC.ordinal()] = 119;
                } catch (NoSuchFieldError unused119) {
                }
                try {
                    iArr[Currency.AKT.ordinal()] = 120;
                } catch (NoSuchFieldError unused120) {
                }
                try {
                    iArr[Currency.PYUSD.ordinal()] = 121;
                } catch (NoSuchFieldError unused121) {
                }
                try {
                    iArr[Currency.POL.ordinal()] = 122;
                } catch (NoSuchFieldError unused122) {
                }
                try {
                    iArr[Currency.AAPL.ordinal()] = 123;
                } catch (NoSuchFieldError unused123) {
                }
                try {
                    iArr[Currency.TSLA.ordinal()] = 124;
                } catch (NoSuchFieldError unused124) {
                }
                try {
                    iArr[Currency.f8145S.ordinal()] = 125;
                } catch (NoSuchFieldError unused125) {
                }
                try {
                    iArr[Currency.TRUMP.ordinal()] = 126;
                } catch (NoSuchFieldError unused126) {
                }
                try {
                    iArr[Currency.PENGU.ordinal()] = 127;
                } catch (NoSuchFieldError unused127) {
                }
                try {
                    iArr[Currency.ONDO.ordinal()] = 128;
                } catch (NoSuchFieldError unused128) {
                }
                try {
                    iArr[Currency.INJ.ordinal()] = 129;
                } catch (NoSuchFieldError unused129) {
                }
                try {
                    iArr[Currency.JASMY.ordinal()] = 130;
                } catch (NoSuchFieldError unused130) {
                }
                try {
                    iArr[Currency.STRK.ordinal()] = 131;
                } catch (NoSuchFieldError unused131) {
                }
                try {
                    iArr[Currency.PYTH.ordinal()] = 132;
                } catch (NoSuchFieldError unused132) {
                }
                try {
                    iArr[Currency.STO.ordinal()] = 133;
                } catch (NoSuchFieldError unused133) {
                }
                try {
                    iArr[Currency.COON.ordinal()] = 134;
                } catch (NoSuchFieldError unused134) {
                }
                try {
                    iArr[Currency.RANP.ordinal()] = 135;
                } catch (NoSuchFieldError unused135) {
                }
                try {
                    iArr[Currency.ALTL.ordinal()] = 136;
                } catch (NoSuchFieldError unused136) {
                }
                try {
                    iArr[Currency.AEC.ordinal()] = 137;
                } catch (NoSuchFieldError unused137) {
                }
                try {
                    iArr[Currency.STOP.ordinal()] = 138;
                } catch (NoSuchFieldError unused138) {
                }
                try {
                    iArr[Currency.POPCAT.ordinal()] = 139;
                } catch (NoSuchFieldError unused139) {
                }
                try {
                    iArr[Currency.VIRTUAL.ordinal()] = 140;
                } catch (NoSuchFieldError unused140) {
                }
                try {
                    iArr[Currency.PNUT.ordinal()] = 141;
                } catch (NoSuchFieldError unused141) {
                }
                try {
                    iArr[Currency.MEW.ordinal()] = 142;
                } catch (NoSuchFieldError unused142) {
                }
                try {
                    iArr[Currency.SIMPSON.ordinal()] = 143;
                } catch (NoSuchFieldError unused143) {
                }
                try {
                    iArr[Currency.VINO.ordinal()] = 144;
                } catch (NoSuchFieldError unused144) {
                }
                try {
                    iArr[Currency.YOM.ordinal()] = 145;
                } catch (NoSuchFieldError unused145) {
                }
                try {
                    iArr[Currency.BERA.ordinal()] = 146;
                } catch (NoSuchFieldError unused146) {
                }
                try {
                    iArr[Currency.AMEX.ordinal()] = 147;
                } catch (NoSuchFieldError unused147) {
                }
                try {
                    iArr[Currency.KCT.ordinal()] = 148;
                } catch (NoSuchFieldError unused148) {
                }
                try {
                    iArr[Currency.XAI.ordinal()] = 149;
                } catch (NoSuchFieldError unused149) {
                }
                try {
                    iArr[Currency.ATC.ordinal()] = 150;
                } catch (NoSuchFieldError unused150) {
                }
                try {
                    iArr[Currency.HOOD.ordinal()] = 151;
                } catch (NoSuchFieldError unused151) {
                }
                try {
                    iArr[Currency.AMZN.ordinal()] = 152;
                } catch (NoSuchFieldError unused152) {
                }
                try {
                    iArr[Currency.GME.ordinal()] = 153;
                } catch (NoSuchFieldError unused153) {
                }
                try {
                    iArr[Currency.AMD.ordinal()] = 154;
                } catch (NoSuchFieldError unused154) {
                }
                try {
                    iArr[Currency.META.ordinal()] = 155;
                } catch (NoSuchFieldError unused155) {
                }
                try {
                    iArr[Currency.CRWD.ordinal()] = 156;
                } catch (NoSuchFieldError unused156) {
                }
                try {
                    iArr[Currency.COIN.ordinal()] = 157;
                } catch (NoSuchFieldError unused157) {
                }
                try {
                    iArr[Currency.MSTR.ordinal()] = 158;
                } catch (NoSuchFieldError unused158) {
                }
                try {
                    iArr[Currency.GOOG.ordinal()] = 159;
                } catch (NoSuchFieldError unused159) {
                }
                try {
                    iArr[Currency.PLTR.ordinal()] = 160;
                } catch (NoSuchFieldError unused160) {
                }
                try {
                    iArr[Currency.QNT.ordinal()] = 161;
                } catch (NoSuchFieldError unused161) {
                }
                try {
                    iArr[Currency.AKITA.ordinal()] = 162;
                } catch (NoSuchFieldError unused162) {
                }
                try {
                    iArr[Currency.SAFEMOON.ordinal()] = 163;
                } catch (NoSuchFieldError unused163) {
                }
                try {
                    iArr[Currency.BABYUNI.ordinal()] = 164;
                } catch (NoSuchFieldError unused164) {
                }
                try {
                    iArr[Currency.MEGA.ordinal()] = 165;
                } catch (NoSuchFieldError unused165) {
                }
                try {
                    iArr[Currency.ONEINCH.ordinal()] = 166;
                } catch (NoSuchFieldError unused166) {
                }
                try {
                    iArr[Currency.AMP.ordinal()] = 167;
                } catch (NoSuchFieldError unused167) {
                }
                try {
                    iArr[Currency.AUDIO.ordinal()] = 168;
                } catch (NoSuchFieldError unused168) {
                }
                try {
                    iArr[Currency.BAND.ordinal()] = 169;
                } catch (NoSuchFieldError unused169) {
                }
                try {
                    iArr[Currency.BLUR.ordinal()] = 170;
                } catch (NoSuchFieldError unused170) {
                }
                try {
                    iArr[Currency.BNT.ordinal()] = 171;
                } catch (NoSuchFieldError unused171) {
                }
                try {
                    iArr[Currency.BOME.ordinal()] = 172;
                } catch (NoSuchFieldError unused172) {
                }
                try {
                    iArr[Currency.CHZ.ordinal()] = 173;
                } catch (NoSuchFieldError unused173) {
                }
                try {
                    iArr[Currency.COREUM.ordinal()] = 174;
                } catch (NoSuchFieldError unused174) {
                }
                try {
                    iArr[Currency.CSPR.ordinal()] = 175;
                } catch (NoSuchFieldError unused175) {
                }
                try {
                    iArr[Currency.CTSI.ordinal()] = 176;
                } catch (NoSuchFieldError unused176) {
                }
                try {
                    iArr[Currency.CVC.ordinal()] = 177;
                } catch (NoSuchFieldError unused177) {
                }
                try {
                    iArr[Currency.CXT.ordinal()] = 178;
                } catch (NoSuchFieldError unused178) {
                }
                try {
                    iArr[Currency.CTX.ordinal()] = 179;
                } catch (NoSuchFieldError unused179) {
                }
                try {
                    iArr[Currency.DGLD.ordinal()] = 180;
                } catch (NoSuchFieldError unused180) {
                }
                try {
                    iArr[Currency.DYDX.ordinal()] = 181;
                } catch (NoSuchFieldError unused181) {
                }
                try {
                    iArr[Currency.ENS.ordinal()] = 182;
                } catch (NoSuchFieldError unused182) {
                }
                try {
                    iArr[Currency.EURCV.ordinal()] = 183;
                } catch (NoSuchFieldError unused183) {
                }
                try {
                    iArr[Currency.EURT.ordinal()] = 184;
                } catch (NoSuchFieldError unused184) {
                }
                try {
                    iArr[Currency.FET.ordinal()] = 185;
                } catch (NoSuchFieldError unused185) {
                }
                try {
                    iArr[Currency.FLR.ordinal()] = 186;
                } catch (NoSuchFieldError unused186) {
                }
                try {
                    iArr[Currency.GALA.ordinal()] = 187;
                } catch (NoSuchFieldError unused187) {
                }
                try {
                    iArr[Currency.GYEN.ordinal()] = 188;
                } catch (NoSuchFieldError unused188) {
                }
                try {
                    iArr[Currency.KNC.ordinal()] = 189;
                } catch (NoSuchFieldError unused189) {
                }
                try {
                    iArr[Currency.LMWR.ordinal()] = 190;
                } catch (NoSuchFieldError unused190) {
                }
                try {
                    iArr[Currency.MELANIA.ordinal()] = 191;
                } catch (NoSuchFieldError unused191) {
                }
                try {
                    iArr[Currency.MOG.ordinal()] = 192;
                } catch (NoSuchFieldError unused192) {
                }
                try {
                    iArr[Currency.NEXO.ordinal()] = 193;
                } catch (NoSuchFieldError unused193) {
                }
                try {
                    iArr[Currency.PERP.ordinal()] = 194;
                } catch (NoSuchFieldError unused194) {
                }
                try {
                    iArr[Currency.RAD.ordinal()] = 195;
                } catch (NoSuchFieldError unused195) {
                }
                try {
                    iArr[Currency.RLUSD.ordinal()] = 196;
                } catch (NoSuchFieldError unused196) {
                }
                try {
                    iArr[Currency.RLY.ordinal()] = 197;
                } catch (NoSuchFieldError unused197) {
                }
                try {
                    iArr[Currency.SEI.ordinal()] = 198;
                } catch (NoSuchFieldError unused198) {
                }
                try {
                    iArr[Currency.SGB.ordinal()] = 199;
                } catch (NoSuchFieldError unused199) {
                }
                try {
                    iArr[Currency.SKL.ordinal()] = 200;
                } catch (NoSuchFieldError unused200) {
                }
                try {
                    iArr[Currency.SLP.ordinal()] = 201;
                } catch (NoSuchFieldError unused201) {
                }
                try {
                    iArr[Currency.SMT.ordinal()] = 202;
                } catch (NoSuchFieldError unused202) {
                }
                try {
                    iArr[Currency.SPELL.ordinal()] = 203;
                } catch (NoSuchFieldError unused203) {
                }
                try {
                    iArr[Currency.STORJ.ordinal()] = 204;
                } catch (NoSuchFieldError unused204) {
                }
                try {
                    iArr[Currency.SUI.ordinal()] = 205;
                } catch (NoSuchFieldError unused205) {
                }
                try {
                    iArr[Currency.SYRUP.ordinal()] = 206;
                } catch (NoSuchFieldError unused206) {
                }
                try {
                    iArr[Currency.TRAC.ordinal()] = 207;
                } catch (NoSuchFieldError unused207) {
                }
                try {
                    iArr[Currency.TRUF.ordinal()] = 208;
                } catch (NoSuchFieldError unused208) {
                }
                try {
                    iArr[Currency.UMA.ordinal()] = 209;
                } catch (NoSuchFieldError unused209) {
                }
                try {
                    iArr[Currency.VCHF.ordinal()] = 210;
                } catch (NoSuchFieldError unused210) {
                }
                try {
                    iArr[Currency.VEUR.ordinal()] = 211;
                } catch (NoSuchFieldError unused211) {
                }
                try {
                    iArr[Currency.VEXT.ordinal()] = 212;
                } catch (NoSuchFieldError unused212) {
                }
                try {
                    iArr[Currency.WEN.ordinal()] = 213;
                } catch (NoSuchFieldError unused213) {
                }
                try {
                    iArr[Currency.WOO.ordinal()] = 214;
                } catch (NoSuchFieldError unused214) {
                }
                try {
                    iArr[Currency.WECAN.ordinal()] = 215;
                } catch (NoSuchFieldError unused215) {
                }
                try {
                    iArr[Currency.XCHNG.ordinal()] = 216;
                } catch (NoSuchFieldError unused216) {
                }
                try {
                    iArr[Currency.XDC.ordinal()] = 217;
                } catch (NoSuchFieldError unused217) {
                }
                try {
                    iArr[Currency.XSGD.ordinal()] = 218;
                } catch (NoSuchFieldError unused218) {
                }
                try {
                    iArr[Currency.ZETA.ordinal()] = 219;
                } catch (NoSuchFieldError unused219) {
                }
                try {
                    iArr[Currency.ZUSD.ordinal()] = 220;
                } catch (NoSuchFieldError unused220) {
                }
                try {
                    iArr[Currency.MOODENG.ordinal()] = 221;
                } catch (NoSuchFieldError unused221) {
                }
                try {
                    iArr[Currency.GLUB.ordinal()] = 222;
                } catch (NoSuchFieldError unused222) {
                }
                try {
                    iArr[Currency.NOODLE.ordinal()] = 223;
                } catch (NoSuchFieldError unused223) {
                }
                try {
                    iArr[Currency.PLS.ordinal()] = 224;
                } catch (NoSuchFieldError unused224) {
                }
                try {
                    iArr[Currency.TURBO.ordinal()] = 225;
                } catch (NoSuchFieldError unused225) {
                }
                try {
                    iArr[Currency.GMXP.ordinal()] = 226;
                } catch (NoSuchFieldError unused226) {
                }
                try {
                    iArr[Currency.SDS.ordinal()] = 227;
                } catch (NoSuchFieldError unused227) {
                }
                try {
                    iArr[Currency.MTC.ordinal()] = 228;
                } catch (NoSuchFieldError unused228) {
                }
                try {
                    iArr[Currency.TMDX.ordinal()] = 229;
                } catch (NoSuchFieldError unused229) {
                }
                try {
                    iArr[Currency.ELON.ordinal()] = 230;
                } catch (NoSuchFieldError unused230) {
                }
                try {
                    iArr[Currency.IVV.ordinal()] = 231;
                } catch (NoSuchFieldError unused231) {
                }
                try {
                    iArr[Currency.HMND.ordinal()] = 232;
                } catch (NoSuchFieldError unused232) {
                }
                try {
                    iArr[Currency.HONEY.ordinal()] = 233;
                } catch (NoSuchFieldError unused233) {
                }
                try {
                    iArr[Currency.LAYER.ordinal()] = 234;
                } catch (NoSuchFieldError unused234) {
                }
                try {
                    iArr[Currency.GLMR.ordinal()] = 235;
                } catch (NoSuchFieldError unused235) {
                }
                try {
                    iArr[Currency.f8138KO.ordinal()] = 236;
                } catch (NoSuchFieldError unused236) {
                }
                try {
                    iArr[Currency.SPOT.ordinal()] = 237;
                } catch (NoSuchFieldError unused237) {
                }
                try {
                    iArr[Currency.SMCX.ordinal()] = 238;
                } catch (NoSuchFieldError unused238) {
                }
                try {
                    iArr[Currency.GIGA.ordinal()] = 239;
                } catch (NoSuchFieldError unused239) {
                }
                try {
                    iArr[Currency.USFR.ordinal()] = 240;
                } catch (NoSuchFieldError unused240) {
                }
                try {
                    iArr[Currency.f8148VZ.ordinal()] = 241;
                } catch (NoSuchFieldError unused241) {
                }
                try {
                    iArr[Currency.IAU.ordinal()] = 242;
                } catch (NoSuchFieldError unused242) {
                }
                try {
                    iArr[Currency.ARPA.ordinal()] = 243;
                } catch (NoSuchFieldError unused243) {
                }
                try {
                    iArr[Currency.UAL.ordinal()] = 244;
                } catch (NoSuchFieldError unused244) {
                }
                try {
                    iArr[Currency.RAY.ordinal()] = 245;
                } catch (NoSuchFieldError unused245) {
                }
                try {
                    iArr[Currency.f8139ME.ordinal()] = 246;
                } catch (NoSuchFieldError unused246) {
                }
                try {
                    iArr[Currency.MRVL.ordinal()] = 247;
                } catch (NoSuchFieldError unused247) {
                }
                try {
                    iArr[Currency.HOT.ordinal()] = 248;
                } catch (NoSuchFieldError unused248) {
                }
                try {
                    iArr[Currency.UPS.ordinal()] = 249;
                } catch (NoSuchFieldError unused249) {
                }
                try {
                    iArr[Currency.f8132BA.ordinal()] = 250;
                } catch (NoSuchFieldError unused250) {
                }
                try {
                    iArr[Currency.DEPRECATED_EUROC.ordinal()] = 251;
                } catch (NoSuchFieldError unused251) {
                }
                try {
                    iArr[Currency.GEV.ordinal()] = 252;
                } catch (NoSuchFieldError unused252) {
                }
                try {
                    iArr[Currency.TZA.ordinal()] = 253;
                } catch (NoSuchFieldError unused253) {
                }
                try {
                    iArr[Currency.GAL.ordinal()] = 254;
                } catch (NoSuchFieldError unused254) {
                }
                try {
                    iArr[Currency.LMT.ordinal()] = 255;
                } catch (NoSuchFieldError unused255) {
                }
                try {
                    iArr[Currency.f8135GE.ordinal()] = 256;
                } catch (NoSuchFieldError unused256) {
                }
                try {
                    iArr[Currency.CONY.ordinal()] = 257;
                } catch (NoSuchFieldError unused257) {
                }
                try {
                    iArr[Currency.BIO.ordinal()] = 258;
                } catch (NoSuchFieldError unused258) {
                }
                try {
                    iArr[Currency.CELH.ordinal()] = 259;
                } catch (NoSuchFieldError unused259) {
                }
                try {
                    iArr[Currency.IOST.ordinal()] = 260;
                } catch (NoSuchFieldError unused260) {
                }
                try {
                    iArr[Currency.ZEUS.ordinal()] = 261;
                } catch (NoSuchFieldError unused261) {
                }
                try {
                    iArr[Currency.GNO.ordinal()] = 262;
                } catch (NoSuchFieldError unused262) {
                }
                try {
                    iArr[Currency.SPXU.ordinal()] = 263;
                } catch (NoSuchFieldError unused263) {
                }
                try {
                    iArr[Currency.SCHD.ordinal()] = 264;
                } catch (NoSuchFieldError unused264) {
                }
                try {
                    iArr[Currency.SLV.ordinal()] = 265;
                } catch (NoSuchFieldError unused265) {
                }
                try {
                    iArr[Currency.RPL.ordinal()] = 266;
                } catch (NoSuchFieldError unused266) {
                }
                try {
                    iArr[Currency.PLA.ordinal()] = 267;
                } catch (NoSuchFieldError unused267) {
                }
                try {
                    iArr[Currency.WAMPL.ordinal()] = 268;
                } catch (NoSuchFieldError unused268) {
                }
                try {
                    iArr[Currency.ROOT.ordinal()] = 269;
                } catch (NoSuchFieldError unused269) {
                }
                try {
                    iArr[Currency.KAVA.ordinal()] = 270;
                } catch (NoSuchFieldError unused270) {
                }
                try {
                    iArr[Currency.PINS.ordinal()] = 271;
                } catch (NoSuchFieldError unused271) {
                }
                try {
                    iArr[Currency.MOVE.ordinal()] = 272;
                } catch (NoSuchFieldError unused272) {
                }
                try {
                    iArr[Currency.SOXL.ordinal()] = 273;
                } catch (NoSuchFieldError unused273) {
                }
                try {
                    iArr[Currency.INTR.ordinal()] = 274;
                } catch (NoSuchFieldError unused274) {
                }
                try {
                    iArr[Currency.INDEX.ordinal()] = 275;
                } catch (NoSuchFieldError unused275) {
                }
                try {
                    iArr[Currency.CVS.ordinal()] = 276;
                } catch (NoSuchFieldError unused276) {
                }
                try {
                    iArr[Currency.AVGO.ordinal()] = 277;
                } catch (NoSuchFieldError unused277) {
                }
                try {
                    iArr[Currency.WLD.ordinal()] = 278;
                } catch (NoSuchFieldError unused278) {
                }
                try {
                    iArr[Currency.BRETT.ordinal()] = 279;
                } catch (NoSuchFieldError unused279) {
                }
                try {
                    iArr[Currency.PANW.ordinal()] = 280;
                } catch (NoSuchFieldError unused280) {
                }
                try {
                    iArr[Currency.WDAY.ordinal()] = 281;
                } catch (NoSuchFieldError unused281) {
                }
                try {
                    iArr[Currency.SNAP.ordinal()] = 282;
                } catch (NoSuchFieldError unused282) {
                }
                try {
                    iArr[Currency.BOBA.ordinal()] = 283;
                } catch (NoSuchFieldError unused283) {
                }
                try {
                    iArr[Currency.BABYDOGE.ordinal()] = 284;
                } catch (NoSuchFieldError unused284) {
                }
                try {
                    iArr[Currency.MASK.ordinal()] = 285;
                } catch (NoSuchFieldError unused285) {
                }
                try {
                    iArr[Currency.KHC.ordinal()] = 286;
                } catch (NoSuchFieldError unused286) {
                }
                try {
                    iArr[Currency.ORCL.ordinal()] = 287;
                } catch (NoSuchFieldError unused287) {
                }
                try {
                    iArr[Currency.RDDT.ordinal()] = 288;
                } catch (NoSuchFieldError unused288) {
                }
                try {
                    iArr[Currency.INTC.ordinal()] = 289;
                } catch (NoSuchFieldError unused289) {
                }
                try {
                    iArr[Currency.TMF.ordinal()] = 290;
                } catch (NoSuchFieldError unused290) {
                }
                try {
                    iArr[Currency.ANKR.ordinal()] = 291;
                } catch (NoSuchFieldError unused291) {
                }
                try {
                    iArr[Currency.RIVN.ordinal()] = 292;
                } catch (NoSuchFieldError unused292) {
                }
                try {
                    iArr[Currency.PRIME.ordinal()] = 293;
                } catch (NoSuchFieldError unused293) {
                }
                try {
                    iArr[Currency.MORPHO.ordinal()] = 294;
                } catch (NoSuchFieldError unused294) {
                }
                try {
                    iArr[Currency.LYFT.ordinal()] = 295;
                } catch (NoSuchFieldError unused295) {
                }
                try {
                    iArr[Currency.EUL.ordinal()] = 296;
                } catch (NoSuchFieldError unused296) {
                }
                try {
                    iArr[Currency.XYO.ordinal()] = 297;
                } catch (NoSuchFieldError unused297) {
                }
                try {
                    iArr[Currency.RKT.ordinal()] = 298;
                } catch (NoSuchFieldError unused298) {
                }
                try {
                    iArr[Currency.INOD.ordinal()] = 299;
                } catch (NoSuchFieldError unused299) {
                }
                try {
                    iArr[Currency.RBLX.ordinal()] = 300;
                } catch (NoSuchFieldError unused300) {
                }
                try {
                    iArr[Currency.VTI.ordinal()] = 301;
                } catch (NoSuchFieldError unused301) {
                }
                try {
                    iArr[Currency.POLS.ordinal()] = 302;
                } catch (NoSuchFieldError unused302) {
                }
                try {
                    iArr[Currency.BEAM.ordinal()] = 303;
                } catch (NoSuchFieldError unused303) {
                }
                try {
                    iArr[Currency.AAL.ordinal()] = 304;
                } catch (NoSuchFieldError unused304) {
                }
                try {
                    iArr[Currency.MYTH.ordinal()] = 305;
                } catch (NoSuchFieldError unused305) {
                }
                try {
                    iArr[Currency.JNJ.ordinal()] = 306;
                } catch (NoSuchFieldError unused306) {
                }
                try {
                    iArr[Currency.SRPT.ordinal()] = 307;
                } catch (NoSuchFieldError unused307) {
                }
                try {
                    iArr[Currency.PHA.ordinal()] = 308;
                } catch (NoSuchFieldError unused308) {
                }
                try {
                    iArr[Currency.FARTCOIN.ordinal()] = 309;
                } catch (NoSuchFieldError unused309) {
                }
                try {
                    iArr[Currency.QCOM.ordinal()] = 310;
                } catch (NoSuchFieldError unused310) {
                }
                try {
                    iArr[Currency.ABNB.ordinal()] = 311;
                } catch (NoSuchFieldError unused311) {
                }
                try {
                    iArr[Currency.KGC.ordinal()] = 312;
                } catch (NoSuchFieldError unused312) {
                }
                try {
                    iArr[Currency.AIOZ.ordinal()] = 313;
                } catch (NoSuchFieldError unused313) {
                }
                try {
                    iArr[Currency.JEPQ.ordinal()] = 314;
                } catch (NoSuchFieldError unused314) {
                }
                try {
                    iArr[Currency.TGT.ordinal()] = 315;
                } catch (NoSuchFieldError unused315) {
                }
                try {
                    iArr[Currency.TEM.ordinal()] = 316;
                } catch (NoSuchFieldError unused316) {
                }
                try {
                    iArr[Currency.CAVA.ordinal()] = 317;
                } catch (NoSuchFieldError unused317) {
                }
                try {
                    iArr[Currency.PFE.ordinal()] = 318;
                } catch (NoSuchFieldError unused318) {
                }
                try {
                    iArr[Currency.f8147U.ordinal()] = 319;
                } catch (NoSuchFieldError unused319) {
                }
                try {
                    iArr[Currency.LQTY.ordinal()] = 320;
                } catch (NoSuchFieldError unused320) {
                }
                try {
                    iArr[Currency.DOGINME.ordinal()] = 321;
                } catch (NoSuchFieldError unused321) {
                }
                try {
                    iArr[Currency.f8130AI.ordinal()] = 322;
                } catch (NoSuchFieldError unused322) {
                }
                try {
                    iArr[Currency.SNOW.ordinal()] = 323;
                } catch (NoSuchFieldError unused323) {
                }
                try {
                    iArr[Currency.f8137IO.ordinal()] = 324;
                } catch (NoSuchFieldError unused324) {
                }
                try {
                    iArr[Currency.CKB.ordinal()] = 325;
                } catch (NoSuchFieldError unused325) {
                }
                try {
                    iArr[Currency.f8142NU.ordinal()] = 326;
                } catch (NoSuchFieldError unused326) {
                }
                try {
                    iArr[Currency.TQQQ.ordinal()] = 327;
                } catch (NoSuchFieldError unused327) {
                }
                try {
                    iArr[Currency.KAP.ordinal()] = 328;
                } catch (NoSuchFieldError unused328) {
                }
                try {
                    iArr[Currency.HOOK.ordinal()] = 329;
                } catch (NoSuchFieldError unused329) {
                }
                try {
                    iArr[Currency.RNDR.ordinal()] = 330;
                } catch (NoSuchFieldError unused330) {
                }
                try {
                    iArr[Currency.VUG.ordinal()] = 331;
                } catch (NoSuchFieldError unused331) {
                }
                try {
                    iArr[Currency.ACS.ordinal()] = 332;
                } catch (NoSuchFieldError unused332) {
                }
                try {
                    iArr[Currency.ROUTE.ordinal()] = 333;
                } catch (NoSuchFieldError unused333) {
                }
                try {
                    iArr[Currency.MRNA.ordinal()] = 334;
                } catch (NoSuchFieldError unused334) {
                }
                try {
                    iArr[Currency.SHOP.ordinal()] = 335;
                } catch (NoSuchFieldError unused335) {
                }
                try {
                    iArr[Currency.f8131B3.ordinal()] = 336;
                } catch (NoSuchFieldError unused336) {
                }
                try {
                    iArr[Currency.UNH.ordinal()] = 337;
                } catch (NoSuchFieldError unused337) {
                }
                try {
                    iArr[Currency.ARC.ordinal()] = 338;
                } catch (NoSuchFieldError unused338) {
                }
                try {
                    iArr[Currency.DAL.ordinal()] = 339;
                } catch (NoSuchFieldError unused339) {
                }
                try {
                    iArr[Currency.ZKJ.ordinal()] = 340;
                } catch (NoSuchFieldError unused340) {
                }
                try {
                    iArr[Currency.MAGS.ordinal()] = 341;
                } catch (NoSuchFieldError unused341) {
                }
                try {
                    iArr[Currency.MSTZ.ordinal()] = 342;
                } catch (NoSuchFieldError unused342) {
                }
                try {
                    iArr[Currency.BTRST.ordinal()] = 343;
                } catch (NoSuchFieldError unused343) {
                }
                try {
                    iArr[Currency.SUPER.ordinal()] = 344;
                } catch (NoSuchFieldError unused344) {
                }
                try {
                    iArr[Currency.OKTA.ordinal()] = 345;
                } catch (NoSuchFieldError unused345) {
                }
                try {
                    iArr[Currency.ZIL.ordinal()] = 346;
                } catch (NoSuchFieldError unused346) {
                }
                try {
                    iArr[Currency.DKS.ordinal()] = 347;
                } catch (NoSuchFieldError unused347) {
                }
                try {
                    iArr[Currency.f8134F.ordinal()] = 348;
                } catch (NoSuchFieldError unused348) {
                }
                try {
                    iArr[Currency.CLF.ordinal()] = 349;
                } catch (NoSuchFieldError unused349) {
                }
                try {
                    iArr[Currency.ROKU.ordinal()] = 350;
                } catch (NoSuchFieldError unused350) {
                }
                try {
                    iArr[Currency.BIGTIME.ordinal()] = 351;
                } catch (NoSuchFieldError unused351) {
                }
                try {
                    iArr[Currency.GRASS.ordinal()] = 352;
                } catch (NoSuchFieldError unused352) {
                }
                try {
                    iArr[Currency.AVA.ordinal()] = 353;
                } catch (NoSuchFieldError unused353) {
                }
                try {
                    iArr[Currency.BIL.ordinal()] = 354;
                } catch (NoSuchFieldError unused354) {
                }
                try {
                    iArr[Currency.AFRM.ordinal()] = 355;
                } catch (NoSuchFieldError unused355) {
                }
                try {
                    iArr[Currency.TNA.ordinal()] = 356;
                } catch (NoSuchFieldError unused356) {
                }
                try {
                    iArr[Currency.AMPL.ordinal()] = 357;
                } catch (NoSuchFieldError unused357) {
                }
                try {
                    iArr[Currency.GOAT.ordinal()] = 358;
                } catch (NoSuchFieldError unused358) {
                }
                try {
                    iArr[Currency.IBIT.ordinal()] = 359;
                } catch (NoSuchFieldError unused359) {
                }
                try {
                    iArr[Currency.AIXBT.ordinal()] = 360;
                } catch (NoSuchFieldError unused360) {
                }
                try {
                    iArr[Currency.ONE.ordinal()] = 361;
                } catch (NoSuchFieldError unused361) {
                }
                try {
                    iArr[Currency.GAP.ordinal()] = 362;
                } catch (NoSuchFieldError unused362) {
                }
                try {
                    iArr[Currency.GOOGL.ordinal()] = 363;
                } catch (NoSuchFieldError unused363) {
                }
                try {
                    iArr[Currency.VRT.ordinal()] = 364;
                } catch (NoSuchFieldError unused364) {
                }
                try {
                    iArr[Currency.CHEX.ordinal()] = 365;
                } catch (NoSuchFieldError unused365) {
                }
                try {
                    iArr[Currency.HUM.ordinal()] = 366;
                } catch (NoSuchFieldError unused366) {
                }
                try {
                    iArr[Currency.TTWO.ordinal()] = 367;
                } catch (NoSuchFieldError unused367) {
                }
                try {
                    iArr[Currency.f8136HD.ordinal()] = 368;
                } catch (NoSuchFieldError unused368) {
                }
                try {
                    iArr[Currency.VXX.ordinal()] = 369;
                } catch (NoSuchFieldError unused369) {
                }
                try {
                    iArr[Currency.RDNT.ordinal()] = 370;
                } catch (NoSuchFieldError unused370) {
                }
                try {
                    iArr[Currency.SMCI.ordinal()] = 371;
                } catch (NoSuchFieldError unused371) {
                }
                try {
                    iArr[Currency.CFX.ordinal()] = 372;
                } catch (NoSuchFieldError unused372) {
                }
                try {
                    iArr[Currency.SOXS.ordinal()] = 373;
                } catch (NoSuchFieldError unused373) {
                }
                try {
                    iArr[Currency.INDP.ordinal()] = 374;
                } catch (NoSuchFieldError unused374) {
                }
                try {
                    iArr[Currency.PAAL.ordinal()] = 375;
                } catch (NoSuchFieldError unused375) {
                }
                try {
                    iArr[Currency.ENPH.ordinal()] = 376;
                } catch (NoSuchFieldError unused376) {
                }
                try {
                    iArr[Currency.CLSK.ordinal()] = 377;
                } catch (NoSuchFieldError unused377) {
                }
                try {
                    iArr[Currency.KEY.ordinal()] = 378;
                } catch (NoSuchFieldError unused378) {
                }
                try {
                    iArr[Currency.AGIX.ordinal()] = 379;
                } catch (NoSuchFieldError unused379) {
                }
                try {
                    iArr[Currency.JTO.ordinal()] = 380;
                } catch (NoSuchFieldError unused380) {
                }
                try {
                    iArr[Currency.ACE.ordinal()] = 381;
                } catch (NoSuchFieldError unused381) {
                }
                try {
                    iArr[Currency.PYPL.ordinal()] = 382;
                } catch (NoSuchFieldError unused382) {
                }
                try {
                    iArr[Currency.AI16Z.ordinal()] = 383;
                } catch (NoSuchFieldError unused383) {
                }
                try {
                    iArr[Currency.CSCO.ordinal()] = 384;
                } catch (NoSuchFieldError unused384) {
                }
                try {
                    iArr[Currency.SPXS.ordinal()] = 385;
                } catch (NoSuchFieldError unused385) {
                }
                try {
                    iArr[Currency.TECL.ordinal()] = 386;
                } catch (NoSuchFieldError unused386) {
                }
                try {
                    iArr[Currency.FXS.ordinal()] = 387;
                } catch (NoSuchFieldError unused387) {
                }
                try {
                    iArr[Currency.ETHFI.ordinal()] = 388;
                } catch (NoSuchFieldError unused388) {
                }
                try {
                    iArr[Currency.ALCH.ordinal()] = 389;
                } catch (NoSuchFieldError unused389) {
                }
                try {
                    iArr[Currency.LLY.ordinal()] = 390;
                } catch (NoSuchFieldError unused390) {
                }
                try {
                    iArr[Currency.PYR.ordinal()] = 391;
                } catch (NoSuchFieldError unused391) {
                }
                try {
                    iArr[Currency.IBKR.ordinal()] = 392;
                } catch (NoSuchFieldError unused392) {
                }
                try {
                    iArr[Currency.AERO.ordinal()] = 393;
                } catch (NoSuchFieldError unused393) {
                }
                try {
                    iArr[Currency.LPT.ordinal()] = 394;
                } catch (NoSuchFieldError unused394) {
                }
                try {
                    iArr[Currency.ARKM.ordinal()] = 395;
                } catch (NoSuchFieldError unused395) {
                }
                try {
                    iArr[Currency.ACX.ordinal()] = 396;
                } catch (NoSuchFieldError unused396) {
                }
                try {
                    iArr[Currency.TRNR.ordinal()] = 397;
                } catch (NoSuchFieldError unused397) {
                }
                try {
                    iArr[Currency.BICO.ordinal()] = 398;
                } catch (NoSuchFieldError unused398) {
                }
                try {
                    iArr[Currency.MSTY.ordinal()] = 399;
                } catch (NoSuchFieldError unused399) {
                }
                try {
                    iArr[Currency.CEG.ordinal()] = 400;
                } catch (NoSuchFieldError unused400) {
                }
                try {
                    iArr[Currency.BITU.ordinal()] = 401;
                } catch (NoSuchFieldError unused401) {
                }
                try {
                    iArr[Currency.VGT.ordinal()] = 402;
                } catch (NoSuchFieldError unused402) {
                }
                try {
                    iArr[Currency.DECK.ordinal()] = 403;
                } catch (NoSuchFieldError unused403) {
                }
                try {
                    iArr[Currency.WEEK.ordinal()] = 404;
                } catch (NoSuchFieldError unused404) {
                }
                try {
                    iArr[Currency.NKE.ordinal()] = 405;
                } catch (NoSuchFieldError unused405) {
                }
                try {
                    iArr[Currency.TTD.ordinal()] = 406;
                } catch (NoSuchFieldError unused406) {
                }
                try {
                    iArr[Currency.AMAT.ordinal()] = 407;
                } catch (NoSuchFieldError unused407) {
                }
                try {
                    iArr[Currency.VOO.ordinal()] = 408;
                } catch (NoSuchFieldError unused408) {
                }
                try {
                    iArr[Currency.SBUX.ordinal()] = 409;
                } catch (NoSuchFieldError unused409) {
                }
                try {
                    iArr[Currency.AIDOGE.ordinal()] = 410;
                } catch (NoSuchFieldError unused410) {
                }
                try {
                    iArr[Currency.IWM.ordinal()] = 411;
                } catch (NoSuchFieldError unused411) {
                }
                try {
                    iArr[Currency.CVNA.ordinal()] = 412;
                } catch (NoSuchFieldError unused412) {
                }
                try {
                    iArr[Currency.RWM.ordinal()] = 413;
                } catch (NoSuchFieldError unused413) {
                }
                try {
                    iArr[Currency.BROS.ordinal()] = 414;
                } catch (NoSuchFieldError unused414) {
                }
                try {
                    iArr[Currency.OKLO.ordinal()] = 415;
                } catch (NoSuchFieldError unused415) {
                }
                try {
                    iArr[Currency.FBTC.ordinal()] = 416;
                } catch (NoSuchFieldError unused416) {
                }
                try {
                    iArr[Currency.KOLD.ordinal()] = 417;
                } catch (NoSuchFieldError unused417) {
                }
                try {
                    iArr[Currency.SOFI.ordinal()] = 418;
                } catch (NoSuchFieldError unused418) {
                }
                try {
                    iArr[Currency.OUNZ.ordinal()] = 419;
                } catch (NoSuchFieldError unused419) {
                }
                try {
                    iArr[Currency.ZVZZT.ordinal()] = 420;
                } catch (NoSuchFieldError unused420) {
                }
                try {
                    iArr[Currency.MSFT.ordinal()] = 421;
                } catch (NoSuchFieldError unused421) {
                }
                try {
                    iArr[Currency.f8143OM.ordinal()] = 422;
                } catch (NoSuchFieldError unused422) {
                }
                try {
                    iArr[Currency.TOSHI.ordinal()] = 423;
                } catch (NoSuchFieldError unused423) {
                }
                try {
                    iArr[Currency.ORDI.ordinal()] = 424;
                } catch (NoSuchFieldError unused424) {
                }
                try {
                    iArr[Currency.DOCS.ordinal()] = 425;
                } catch (NoSuchFieldError unused425) {
                }
                try {
                    iArr[Currency.UPRO.ordinal()] = 426;
                } catch (NoSuchFieldError unused426) {
                }
                try {
                    iArr[Currency.OSCR.ordinal()] = 427;
                } catch (NoSuchFieldError unused427) {
                }
                try {
                    iArr[Currency.GDX.ordinal()] = 428;
                } catch (NoSuchFieldError unused428) {
                }
                try {
                    iArr[Currency.APP.ordinal()] = 429;
                } catch (NoSuchFieldError unused429) {
                }
                try {
                    iArr[Currency.MXC.ordinal()] = 430;
                } catch (NoSuchFieldError unused430) {
                }
                try {
                    iArr[Currency.PEP.ordinal()] = 431;
                } catch (NoSuchFieldError unused431) {
                }
                try {
                    iArr[Currency.CFG.ordinal()] = 432;
                } catch (NoSuchFieldError unused432) {
                }
                try {
                    iArr[Currency.API3.ordinal()] = 433;
                } catch (NoSuchFieldError unused433) {
                }
                try {
                    iArr[Currency.NFLX.ordinal()] = 434;
                } catch (NoSuchFieldError unused434) {
                }
                try {
                    iArr[Currency.REQ.ordinal()] = 435;
                } catch (NoSuchFieldError unused435) {
                }
                try {
                    iArr[Currency.ELF.ordinal()] = 436;
                } catch (NoSuchFieldError unused436) {
                }
                try {
                    iArr[Currency.YGG.ordinal()] = 437;
                } catch (NoSuchFieldError unused437) {
                }
                try {
                    iArr[Currency.DKNG.ordinal()] = 438;
                } catch (NoSuchFieldError unused438) {
                }
                try {
                    iArr[Currency.PONKE.ordinal()] = 439;
                } catch (NoSuchFieldError unused439) {
                }
                try {
                    iArr[Currency.PENDLE.ordinal()] = 440;
                } catch (NoSuchFieldError unused440) {
                }
                try {
                    iArr[Currency.ALT.ordinal()] = 441;
                } catch (NoSuchFieldError unused441) {
                }
                try {
                    iArr[Currency.DELL.ordinal()] = 442;
                } catch (NoSuchFieldError unused442) {
                }
                try {
                    iArr[Currency.IAUM.ordinal()] = 443;
                } catch (NoSuchFieldError unused443) {
                }
                try {
                    iArr[Currency.NVD.ordinal()] = 444;
                } catch (NoSuchFieldError unused444) {
                }
                try {
                    iArr[Currency.REN.ordinal()] = 445;
                } catch (NoSuchFieldError unused445) {
                }
                try {
                    iArr[Currency.KCS.ordinal()] = 446;
                } catch (NoSuchFieldError unused446) {
                }
                try {
                    iArr[Currency.CLS.ordinal()] = 447;
                } catch (NoSuchFieldError unused447) {
                }
                try {
                    iArr[Currency.CCL.ordinal()] = 448;
                } catch (NoSuchFieldError unused448) {
                }
                try {
                    iArr[Currency.ANET.ordinal()] = 449;
                } catch (NoSuchFieldError unused449) {
                }
                try {
                    iArr[Currency.NVDL.ordinal()] = 450;
                } catch (NoSuchFieldError unused450) {
                }
                try {
                    iArr[Currency.VST.ordinal()] = 451;
                } catch (NoSuchFieldError unused451) {
                }
                try {
                    iArr[Currency.VVV.ordinal()] = 452;
                } catch (NoSuchFieldError unused452) {
                }
                try {
                    iArr[Currency.FSLR.ordinal()] = 453;
                } catch (NoSuchFieldError unused453) {
                }
                try {
                    iArr[Currency.CLANKER.ordinal()] = 454;
                } catch (NoSuchFieldError unused454) {
                }
                try {
                    iArr[Currency.SPXL.ordinal()] = 455;
                } catch (NoSuchFieldError unused455) {
                }
                try {
                    iArr[Currency.OPAI.ordinal()] = 456;
                } catch (NoSuchFieldError unused456) {
                }
                try {
                    iArr[Currency.f8141MU.ordinal()] = 457;
                } catch (NoSuchFieldError unused457) {
                }
                try {
                    iArr[Currency.CONL.ordinal()] = 458;
                } catch (NoSuchFieldError unused458) {
                }
                try {
                    iArr[Currency.STG.ordinal()] = 459;
                } catch (NoSuchFieldError unused459) {
                }
                try {
                    iArr[Currency.HUT.ordinal()] = 460;
                } catch (NoSuchFieldError unused460) {
                }
                try {
                    iArr[Currency.LABU.ordinal()] = 461;
                } catch (NoSuchFieldError unused461) {
                }
                try {
                    iArr[Currency.RED.ordinal()] = 462;
                } catch (NoSuchFieldError unused462) {
                }
                try {
                    iArr[Currency.PLUME.ordinal()] = 463;
                } catch (NoSuchFieldError unused463) {
                }
                try {
                    iArr[Currency.MRK.ordinal()] = 464;
                } catch (NoSuchFieldError unused464) {
                }
                try {
                    iArr[Currency.IOTX.ordinal()] = 465;
                } catch (NoSuchFieldError unused465) {
                }
                try {
                    iArr[Currency.DJT.ordinal()] = 466;
                } catch (NoSuchFieldError unused466) {
                }
                try {
                    iArr[Currency.AYRO.ordinal()] = 467;
                } catch (NoSuchFieldError unused467) {
                }
                try {
                    iArr[Currency.FAI.ordinal()] = 468;
                } catch (NoSuchFieldError unused468) {
                }
                try {
                    iArr[Currency.HFT.ordinal()] = 469;
                } catch (NoSuchFieldError unused469) {
                }
                try {
                    iArr[Currency.NBIS.ordinal()] = 470;
                } catch (NoSuchFieldError unused470) {
                }
                try {
                    iArr[Currency.MNT.ordinal()] = 471;
                } catch (NoSuchFieldError unused471) {
                }
                try {
                    iArr[Currency.BITO.ordinal()] = 472;
                } catch (NoSuchFieldError unused472) {
                }
                try {
                    iArr[Currency.JPM.ordinal()] = 473;
                } catch (NoSuchFieldError unused473) {
                }
                try {
                    iArr[Currency.IONQ.ordinal()] = 474;
                } catch (NoSuchFieldError unused474) {
                }
                try {
                    iArr[Currency.KP3R.ordinal()] = 475;
                } catch (NoSuchFieldError unused475) {
                }
                try {
                    iArr[Currency.COW.ordinal()] = 476;
                } catch (NoSuchFieldError unused476) {
                }
                try {
                    iArr[Currency.GLD.ordinal()] = 477;
                } catch (NoSuchFieldError unused477) {
                }
                try {
                    iArr[Currency.LCX.ordinal()] = 478;
                } catch (NoSuchFieldError unused478) {
                }
                try {
                    iArr[Currency.SQQQ.ordinal()] = 479;
                } catch (NoSuchFieldError unused479) {
                }
                try {
                    iArr[Currency.f8140MP.ordinal()] = 480;
                } catch (NoSuchFieldError unused480) {
                }
                try {
                    iArr[Currency.ORCA.ordinal()] = 481;
                } catch (NoSuchFieldError unused481) {
                }
                try {
                    iArr[Currency.SGOV.ordinal()] = 482;
                } catch (NoSuchFieldError unused482) {
                }
                try {
                    iArr[Currency.KAITO.ordinal()] = 483;
                } catch (NoSuchFieldError unused483) {
                }
                try {
                    iArr[Currency.RIOT.ordinal()] = 484;
                } catch (NoSuchFieldError unused484) {
                }
                try {
                    iArr[Currency.NOW.ordinal()] = 485;
                } catch (NoSuchFieldError unused485) {
                }
                try {
                    iArr[Currency.MARA.ordinal()] = 486;
                } catch (NoSuchFieldError unused486) {
                }
                try {
                    iArr[Currency.MEOW.ordinal()] = 487;
                } catch (NoSuchFieldError unused487) {
                }
                try {
                    iArr[Currency.MPLX.ordinal()] = 488;
                } catch (NoSuchFieldError unused488) {
                }
                try {
                    iArr[Currency.MELI.ordinal()] = 489;
                } catch (NoSuchFieldError unused489) {
                }
                try {
                    iArr[Currency.ZIM.ordinal()] = 490;
                } catch (NoSuchFieldError unused490) {
                }
                try {
                    iArr[Currency.QRDO.ordinal()] = 491;
                } catch (NoSuchFieldError unused491) {
                }
                try {
                    iArr[Currency.APT.ordinal()] = 492;
                } catch (NoSuchFieldError unused492) {
                }
                try {
                    iArr[Currency.XYZ.ordinal()] = 493;
                } catch (NoSuchFieldError unused493) {
                }
                try {
                    iArr[Currency.NVDA.ordinal()] = 494;
                } catch (NoSuchFieldError unused494) {
                }
                try {
                    iArr[Currency.MAGIC.ordinal()] = 495;
                } catch (NoSuchFieldError unused495) {
                }
                try {
                    iArr[Currency.ALEX.ordinal()] = 496;
                } catch (NoSuchFieldError unused496) {
                }
                try {
                    iArr[Currency.COST.ordinal()] = 497;
                } catch (NoSuchFieldError unused497) {
                }
                try {
                    iArr[Currency.QUARTZ.ordinal()] = 498;
                } catch (NoSuchFieldError unused498) {
                }
                try {
                    iArr[Currency.XOM.ordinal()] = 499;
                } catch (NoSuchFieldError unused499) {
                }
                try {
                    iArr[Currency.SPACEX.ordinal()] = 500;
                } catch (NoSuchFieldError unused500) {
                }
                try {
                    iArr[Currency.QQQ.ordinal()] = 501;
                } catch (NoSuchFieldError unused501) {
                }
                try {
                    iArr[Currency.ACH.ordinal()] = 502;
                } catch (NoSuchFieldError unused502) {
                }
                try {
                    iArr[Currency.ATH.ordinal()] = 503;
                } catch (NoSuchFieldError unused503) {
                }
                try {
                    iArr[Currency.DIS.ordinal()] = 504;
                } catch (NoSuchFieldError unused504) {
                }
                try {
                    iArr[Currency.SAFE.ordinal()] = 505;
                } catch (NoSuchFieldError unused505) {
                }
                try {
                    iArr[Currency.TLT.ordinal()] = 506;
                } catch (NoSuchFieldError unused506) {
                }
                try {
                    iArr[Currency.OXY.ordinal()] = 507;
                } catch (NoSuchFieldError unused507) {
                }
                try {
                    iArr[Currency.RLC.ordinal()] = 508;
                } catch (NoSuchFieldError unused508) {
                }
                try {
                    iArr[Currency.GEOD.ordinal()] = 509;
                } catch (NoSuchFieldError unused509) {
                }
                try {
                    iArr[Currency.KMNO.ordinal()] = 510;
                } catch (NoSuchFieldError unused510) {
                }
                try {
                    iArr[Currency.COOKIE.ordinal()] = 511;
                } catch (NoSuchFieldError unused511) {
                }
                try {
                    iArr[Currency.UBER.ordinal()] = 512;
                } catch (NoSuchFieldError unused512) {
                }
                try {
                    iArr[Currency.KWEB.ordinal()] = 513;
                } catch (NoSuchFieldError unused513) {
                }
                try {
                    iArr[Currency.ALAB.ordinal()] = 514;
                } catch (NoSuchFieldError unused514) {
                }
                try {
                    iArr[Currency.GNLN.ordinal()] = 515;
                } catch (NoSuchFieldError unused515) {
                }
                try {
                    iArr[Currency.CRCL.ordinal()] = 516;
                } catch (NoSuchFieldError unused516) {
                }
                try {
                    iArr[Currency.BITI.ordinal()] = 517;
                } catch (NoSuchFieldError unused517) {
                }
                try {
                    iArr[Currency.SPY.ordinal()] = 518;
                } catch (NoSuchFieldError unused518) {
                }
                try {
                    iArr[Currency.QQQM.ordinal()] = 519;
                } catch (NoSuchFieldError unused519) {
                }
                try {
                    iArr[Currency.GRIFFAIN.ordinal()] = 520;
                } catch (NoSuchFieldError unused520) {
                }
                try {
                    iArr[Currency.WELL.ordinal()] = 521;
                } catch (NoSuchFieldError unused521) {
                }
                try {
                    iArr[Currency.JEPI.ordinal()] = 522;
                } catch (NoSuchFieldError unused522) {
                }
                try {
                    iArr[Currency.SBIT.ordinal()] = 523;
                } catch (NoSuchFieldError unused523) {
                }
                try {
                    iArr[Currency.NVDU.ordinal()] = 524;
                } catch (NoSuchFieldError unused524) {
                }
                try {
                    iArr[Currency.ETHA.ordinal()] = 525;
                } catch (NoSuchFieldError unused525) {
                }
                try {
                    iArr[Currency.TMUS.ordinal()] = 526;
                } catch (NoSuchFieldError unused526) {
                }
                try {
                    iArr[Currency.DRIFT.ordinal()] = 527;
                } catch (NoSuchFieldError unused527) {
                }
                try {
                    iArr[Currency.NVDY.ordinal()] = 528;
                } catch (NoSuchFieldError unused528) {
                }
                try {
                    iArr[Currency.SMH.ordinal()] = 529;
                } catch (NoSuchFieldError unused529) {
                }
                try {
                    iArr[Currency.FAZ.ordinal()] = 530;
                } catch (NoSuchFieldError unused530) {
                }
                try {
                    iArr[Currency.f8146T.ordinal()] = 531;
                } catch (NoSuchFieldError unused531) {
                }
                try {
                    iArr[Currency.AAAU.ordinal()] = 532;
                } catch (NoSuchFieldError unused532) {
                }
                try {
                    iArr[Currency.LABD.ordinal()] = 533;
                } catch (NoSuchFieldError unused533) {
                }
                try {
                    iArr[Currency.AXL.ordinal()] = 534;
                } catch (NoSuchFieldError unused534) {
                }
                try {
                    iArr[Currency.SPX.ordinal()] = 535;
                } catch (NoSuchFieldError unused535) {
                }
                try {
                    iArr[Currency.QWAN.ordinal()] = 536;
                } catch (NoSuchFieldError unused536) {
                }
                try {
                    iArr[Currency.GMX.ordinal()] = 537;
                } catch (NoSuchFieldError unused537) {
                }
                try {
                    iArr[Currency.TSLY.ordinal()] = 538;
                } catch (NoSuchFieldError unused538) {
                }
                try {
                    iArr[Currency.QLD.ordinal()] = 539;
                } catch (NoSuchFieldError unused539) {
                }
                try {
                    iArr[Currency.YMAX.ordinal()] = 540;
                } catch (NoSuchFieldError unused540) {
                }
                try {
                    iArr[Currency.TSLL.ordinal()] = 541;
                } catch (NoSuchFieldError unused541) {
                }
                try {
                    iArr[Currency.CMG.ordinal()] = 542;
                } catch (NoSuchFieldError unused542) {
                }
                try {
                    iArr[Currency.CRM.ordinal()] = 543;
                } catch (NoSuchFieldError unused543) {
                }
                try {
                    iArr[Currency.BAC.ordinal()] = 544;
                } catch (NoSuchFieldError unused544) {
                }
                try {
                    iArr[Currency.RUN.ordinal()] = 545;
                } catch (NoSuchFieldError unused545) {
                }
                try {
                    iArr[Currency.HIMS.ordinal()] = 546;
                } catch (NoSuchFieldError unused546) {
                }
                try {
                    iArr[Currency.KSM.ordinal()] = 547;
                } catch (NoSuchFieldError unused547) {
                }
                try {
                    iArr[Currency.SGOL.ordinal()] = 548;
                } catch (NoSuchFieldError unused548) {
                }
                try {
                    iArr[Currency.NEIRO.ordinal()] = 549;
                } catch (NoSuchFieldError unused549) {
                }
                try {
                    iArr[Currency.ARKB.ordinal()] = 550;
                } catch (NoSuchFieldError unused550) {
                }
                try {
                    iArr[Currency.f8133EL.ordinal()] = 551;
                } catch (NoSuchFieldError unused551) {
                }
                try {
                    iArr[Currency.NCLH.ordinal()] = 552;
                } catch (NoSuchFieldError unused552) {
                }
                try {
                    iArr[Currency.NET.ordinal()] = 553;
                } catch (NoSuchFieldError unused553) {
                }
                try {
                    iArr[Currency.SMR.ordinal()] = 554;
                } catch (NoSuchFieldError unused554) {
                }
                try {
                    iArr[Currency.METIS.ordinal()] = 555;
                } catch (NoSuchFieldError unused555) {
                }
                try {
                    iArr[Currency.UPST.ordinal()] = 556;
                } catch (NoSuchFieldError unused556) {
                }
                try {
                    iArr[Currency.TNSR.ordinal()] = 557;
                } catch (NoSuchFieldError unused557) {
                }
                try {
                    iArr[Currency.WMT.ordinal()] = 558;
                } catch (NoSuchFieldError unused558) {
                }
                try {
                    iArr[Currency.LBRDA.ordinal()] = 559;
                } catch (NoSuchFieldError unused559) {
                }
                try {
                    iArr[Currency.ARKG.ordinal()] = 560;
                } catch (NoSuchFieldError unused560) {
                }
                try {
                    iArr[Currency.GLIBA.ordinal()] = 561;
                } catch (NoSuchFieldError unused561) {
                }
                try {
                    iArr[Currency.GLBAV.ordinal()] = 562;
                } catch (NoSuchFieldError unused562) {
                }
                try {
                    iArr[Currency.WLFI.ordinal()] = 563;
                } catch (NoSuchFieldError unused563) {
                }
                try {
                    iArr[Currency.ZORA.ordinal()] = 564;
                } catch (NoSuchFieldError unused564) {
                }
                try {
                    iArr[Currency.ASTER.ordinal()] = 565;
                } catch (NoSuchFieldError unused565) {
                }
                try {
                    iArr[Currency.XPL.ordinal()] = 566;
                } catch (NoSuchFieldError unused566) {
                }
                try {
                    iArr[Currency.HYPE.ordinal()] = 567;
                } catch (NoSuchFieldError unused567) {
                }
                try {
                    iArr[Currency.AVNT.ordinal()] = 568;
                } catch (NoSuchFieldError unused568) {
                }
                try {
                    iArr[Currency.OPENL.ordinal()] = 569;
                } catch (NoSuchFieldError unused569) {
                }
                try {
                    iArr[Currency.OPENW.ordinal()] = 570;
                } catch (NoSuchFieldError unused570) {
                }
                try {
                    iArr[Currency.OPENZ.ordinal()] = 571;
                } catch (NoSuchFieldError unused571) {
                }
                try {
                    iArr[Currency.XCN.ordinal()] = 572;
                } catch (NoSuchFieldError unused572) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CurrencyDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CurrencyDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CurrencyDto> getBinaryBase64Serializer() {
            return (KSerializer) CurrencyDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Currency> getProtoAdapter() {
            return Currency.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CurrencyDto getZeroValue() {
            return CurrencyDto.CURRENCY_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CurrencyDto fromProto(Currency proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return CurrencyDto.CURRENCY_UNSPECIFIED;
                case 2:
                    return CurrencyDto.BTC;
                case 3:
                    return CurrencyDto.BCH;
                case 4:
                    return CurrencyDto.BSV;
                case 5:
                    return CurrencyDto.LTC;
                case 6:
                    return CurrencyDto.DOGE;
                case 7:
                    return CurrencyDto.ETH;
                case 8:
                    return CurrencyDto.ETC;
                case 9:
                    return CurrencyDto.USD;
                case 10:
                    return CurrencyDto.USDT;
                case 11:
                    return CurrencyDto.XRP;
                case 12:
                    return CurrencyDto.QTUM;
                case 13:
                    return CurrencyDto.NEO;
                case 14:
                    return CurrencyDto.XMR;
                case 15:
                    return CurrencyDto.DASH;
                case 16:
                    return CurrencyDto.BTG;
                case 17:
                    return CurrencyDto.LSK;
                case 18:
                    return CurrencyDto.OMG;
                case 19:
                    return CurrencyDto.BNB;
                case 20:
                    return CurrencyDto.USDC;
                case 21:
                    return CurrencyDto.LUNA;
                case 22:
                    return CurrencyDto.XLM;
                case 23:
                    return CurrencyDto.ZEC;
                case 24:
                    return CurrencyDto.SOL;
                case 25:
                    return CurrencyDto.ADA;
                case 26:
                    return CurrencyDto.AVAX;
                case 27:
                    return CurrencyDto.DOT;
                case 28:
                    return CurrencyDto.BUSD;
                case 29:
                    return CurrencyDto.UST;
                case 30:
                    return CurrencyDto.CRO;
                case 31:
                    return CurrencyDto.DAI;
                case 32:
                    return CurrencyDto.ATOM;
                case 33:
                    return CurrencyDto.NEAR;
                case 34:
                    return CurrencyDto.UNI;
                case 35:
                    return CurrencyDto.FTT;
                case 36:
                    return CurrencyDto.TRX;
                case 37:
                    return CurrencyDto.ALGO;
                case 38:
                    return CurrencyDto.LEO;
                case 39:
                    return CurrencyDto.FTM;
                case 40:
                    return CurrencyDto.BTCB;
                case 41:
                    return CurrencyDto.HBAR;
                case 42:
                    return CurrencyDto.ICP;
                case 43:
                    return CurrencyDto.SAND;
                case 44:
                    return CurrencyDto.FIL;
                case 45:
                    return CurrencyDto.AXS;
                case 46:
                    return CurrencyDto.VET;
                case 47:
                    return CurrencyDto.EGLD;
                case 48:
                    return CurrencyDto.THETA;
                case 49:
                    return CurrencyDto.KLAY;
                case 50:
                    return CurrencyDto.XTZ;
                case 51:
                    return CurrencyDto.HNT;
                case 52:
                    return CurrencyDto.FLOW;
                case 53:
                    return CurrencyDto.AAVE;
                case 54:
                    return CurrencyDto.LINK;
                case 55:
                    return CurrencyDto.LRC;
                case 56:
                    return CurrencyDto.SHIB;
                case 57:
                    return CurrencyDto.COMP;
                case 58:
                    return CurrencyDto.MATIC;
                case 59:
                    return CurrencyDto.MANA;
                case 60:
                    return CurrencyDto.CELO;
                case 61:
                    return CurrencyDto.BAL;
                case 62:
                    return CurrencyDto.WETH;
                case 63:
                    return CurrencyDto.ZRX;
                case 64:
                    return CurrencyDto.RUNE;
                case 65:
                    return CurrencyDto.PAXG;
                case 66:
                    return CurrencyDto.CAKE;
                case 67:
                    return CurrencyDto.USDP;
                case SDK_ASSET_ICON_HOME_VALUE:
                    return CurrencyDto.STX;
                case 69:
                    return CurrencyDto.APE;
                case 70:
                    return CurrencyDto.YFI;
                case SDK_ASSET_ICON_GUIDE_VALUE:
                    return CurrencyDto.BAT;
                case SDK_ASSET_ICON_GLOBE_VALUE:
                    return CurrencyDto.GUSD;
                case 73:
                    return CurrencyDto.ENJ;
                case 74:
                    return CurrencyDto.WBTC;
                case 75:
                    return CurrencyDto.DCR;
                case 76:
                    return CurrencyDto.XEM;
                case 77:
                    return CurrencyDto.MKR;
                case 78:
                    return CurrencyDto.TUSD;
                case 79:
                    return CurrencyDto.DFI;
                case 80:
                    return CurrencyDto.RARI;
                case 81:
                    return CurrencyDto.WAVES;
                case 82:
                    return CurrencyDto.CRV;
                case 83:
                    return CurrencyDto.FRAX;
                case 84:
                    return CurrencyDto.GMT;
                case 85:
                    return CurrencyDto.GRT;
                case 86:
                    return CurrencyDto.MIOTA;
                case 87:
                    return CurrencyDto.ETHW;
                case 88:
                    return CurrencyDto.LDO;
                case 89:
                    return CurrencyDto.CELR;
                case 90:
                    return CurrencyDto.LOOM;
                case 91:
                    return CurrencyDto.GHST;
                case 92:
                    return CurrencyDto.PEPE;
                case 93:
                    return CurrencyDto.CVX;
                case 94:
                    return CurrencyDto.HOPR;
                case 95:
                    return CurrencyDto.EOS;
                case 96:
                    return CurrencyDto.EUROC;
                case 97:
                    return CurrencyDto.FUN;
                case 98:
                    return CurrencyDto.OCEAN;
                case 99:
                    return CurrencyDto.SNX;
                case 100:
                    return CurrencyDto.SUSHI;
                case 101:
                    return CurrencyDto.ARB;
                case 102:
                    return CurrencyDto.BONK;
                case 103:
                    return CurrencyDto.f8165OP;
                case 104:
                    return CurrencyDto.TIA;
                case 105:
                    return CurrencyDto.WIF;
                case 106:
                    return CurrencyDto.COQ;
                case 107:
                    return CurrencyDto.JUP;
                case 108:
                    return CurrencyDto.TON;
                case 109:
                    return CurrencyDto.f8170W;
                case 110:
                    return CurrencyDto.STETH;
                case 111:
                    return CurrencyDto.f8171ZK;
                case 112:
                    return CurrencyDto.ZRO;
                case 113:
                    return CurrencyDto.EUR;
                case 114:
                    return CurrencyDto.IMX;
                case 115:
                    return CurrencyDto.RENDER;
                case 116:
                    return CurrencyDto.FLOKI;
                case 117:
                    return CurrencyDto.EIGEN;
                case 118:
                    return CurrencyDto.ENA;
                case 119:
                    return CurrencyDto.EURC;
                case 120:
                    return CurrencyDto.AKT;
                case SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE:
                    return CurrencyDto.PYUSD;
                case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                    return CurrencyDto.POL;
                case 123:
                    return CurrencyDto.AAPL;
                case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                    return CurrencyDto.TSLA;
                case 125:
                    return CurrencyDto.f8166S;
                case SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE:
                    return CurrencyDto.TRUMP;
                case SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE:
                    return CurrencyDto.PENGU;
                case 128:
                    return CurrencyDto.ONDO;
                case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                    return CurrencyDto.INJ;
                case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                    return CurrencyDto.JASMY;
                case 131:
                    return CurrencyDto.STRK;
                case SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE:
                    return CurrencyDto.PYTH;
                case SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE:
                    return CurrencyDto.STO;
                case SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE:
                    return CurrencyDto.COON;
                case SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE:
                    return CurrencyDto.RANP;
                case 136:
                    return CurrencyDto.ALTL;
                case SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE:
                    return CurrencyDto.AEC;
                case SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE:
                    return CurrencyDto.STOP;
                case SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE:
                    return CurrencyDto.POPCAT;
                case SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE:
                    return CurrencyDto.VIRTUAL;
                case SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE:
                    return CurrencyDto.PNUT;
                case SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE:
                    return CurrencyDto.MEW;
                case SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE:
                    return CurrencyDto.SIMPSON;
                case 144:
                    return CurrencyDto.VINO;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE:
                    return CurrencyDto.YOM;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE:
                    return CurrencyDto.BERA;
                case 147:
                    return CurrencyDto.AMEX;
                case SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE:
                    return CurrencyDto.KCT;
                case SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE:
                    return CurrencyDto.XAI;
                case 150:
                    return CurrencyDto.ATC;
                case 151:
                    return CurrencyDto.HOOD;
                case SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE:
                    return CurrencyDto.AMZN;
                case SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE:
                    return CurrencyDto.GME;
                case SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE:
                    return CurrencyDto.AMD;
                case 155:
                    return CurrencyDto.META;
                case 156:
                    return CurrencyDto.CRWD;
                case SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE:
                    return CurrencyDto.COIN;
                case SDK_ASSET_ILLUSTRATION_WALLET_VALUE:
                    return CurrencyDto.MSTR;
                case SDK_ASSET_ILLUSTRATION_INCOME_VALUE:
                    return CurrencyDto.GOOG;
                case SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE:
                    return CurrencyDto.PLTR;
                case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE:
                    return CurrencyDto.QNT;
                case SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE:
                    return CurrencyDto.AKITA;
                case SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE:
                    return CurrencyDto.SAFEMOON;
                case SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE:
                    return CurrencyDto.BABYUNI;
                case 165:
                    return CurrencyDto.MEGA;
                case SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE:
                    return CurrencyDto.ONEINCH;
                case 167:
                    return CurrencyDto.AMP;
                case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE:
                    return CurrencyDto.AUDIO;
                case SDK_ASSET_HEADER_CARD_COLLECT_VALUE:
                    return CurrencyDto.BAND;
                case SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE:
                    return CurrencyDto.BLUR;
                case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE:
                    return CurrencyDto.BNT;
                case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE:
                    return CurrencyDto.BOME;
                case SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE:
                    return CurrencyDto.CHZ;
                case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE:
                    return CurrencyDto.COREUM;
                case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE:
                    return CurrencyDto.CSPR;
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE:
                    return CurrencyDto.CTSI;
                case SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE:
                    return CurrencyDto.CVC;
                case f2773x8d9721ad:
                    return CurrencyDto.CXT;
                case f2780x600b66fe:
                    return CurrencyDto.CTX;
                case SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE:
                    return CurrencyDto.DGLD;
                case SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE:
                    return CurrencyDto.DYDX;
                case 182:
                    return CurrencyDto.ENS;
                case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE:
                    return CurrencyDto.EURCV;
                case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE:
                    return CurrencyDto.EURT;
                case SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE:
                    return CurrencyDto.FET;
                case SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE:
                    return CurrencyDto.FLR;
                case SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE:
                    return CurrencyDto.GALA;
                case 188:
                    return CurrencyDto.GYEN;
                case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE:
                    return CurrencyDto.KNC;
                case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE:
                    return CurrencyDto.LMWR;
                case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE:
                    return CurrencyDto.MELANIA;
                case 192:
                    return CurrencyDto.MOG;
                case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE:
                    return CurrencyDto.NEXO;
                case SDK_ASSET_ICON_EXTERNAL_VALUE:
                    return CurrencyDto.PERP;
                case SDK_ASSET_ICON_ALERT_WARNING_VALUE:
                    return CurrencyDto.RAD;
                case SDK_ASSET_ICON_ARROW_DOWN_VALUE:
                    return CurrencyDto.RLUSD;
                case SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE:
                    return CurrencyDto.RLY;
                case SDK_ASSET_ICON_ARROW_UP_VALUE:
                    return CurrencyDto.SEI;
                case SDK_ASSET_ICON_CANCEL_VALUE:
                    return CurrencyDto.SGB;
                case 200:
                    return CurrencyDto.SKL;
                case 201:
                    return CurrencyDto.SLP;
                case 202:
                    return CurrencyDto.SMT;
                case SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE:
                    return CurrencyDto.SPELL;
                case 204:
                    return CurrencyDto.STORJ;
                case SDK_ASSET_ICON_CLIPBOARD_VALUE:
                    return CurrencyDto.SUI;
                case SDK_ASSET_ICON_CLOCK_VALUE:
                    return CurrencyDto.SYRUP;
                case SDK_ASSET_ICON_COMMENT_VALUE:
                    return CurrencyDto.TRAC;
                case SDK_ASSET_ICON_INCOME_VALUE:
                    return CurrencyDto.TRUF;
                case SDK_ASSET_ICON_INCOMPLETE_VALUE:
                    return CurrencyDto.UMA;
                case SDK_ASSET_ICON_NEW_WINDOW_VALUE:
                    return CurrencyDto.VCHF;
                case 211:
                    return CurrencyDto.VEUR;
                case SDK_ASSET_ICON_OVERRIDE_VALUE:
                    return CurrencyDto.VEXT;
                case SDK_ASSET_ICON_PAUSE_VALUE:
                    return CurrencyDto.WEN;
                case SDK_ASSET_ICON_PIN_VALUE:
                    return CurrencyDto.WOO;
                case SDK_ASSET_ICON_PRODUCT_IDV_VALUE:
                    return CurrencyDto.WECAN;
                case SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE:
                    return CurrencyDto.XCHNG;
                case SDK_ASSET_ICON_PROGRESS_VALUE:
                    return CurrencyDto.XDC;
                case SDK_ASSET_ICON_QUESTION_VALUE:
                    return CurrencyDto.XSGD;
                case SDK_ASSET_ICON_REJECTED_REC_VALUE:
                    return CurrencyDto.ZETA;
                case SDK_ASSET_ICON_SHIELD_CAUTION_VALUE:
                    return CurrencyDto.ZUSD;
                case SDK_ASSET_ICON_SUBMIT_VALUE:
                    return CurrencyDto.MOODENG;
                case SDK_ASSET_ICON_SUBTRACT_VALUE:
                    return CurrencyDto.GLUB;
                case SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE:
                    return CurrencyDto.NOODLE;
                case 224:
                    return CurrencyDto.PLS;
                case 225:
                    return CurrencyDto.TURBO;
                case SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE:
                    return CurrencyDto.GMXP;
                case SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE:
                    return CurrencyDto.SDS;
                case SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE:
                    return CurrencyDto.MTC;
                case SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE:
                    return CurrencyDto.TMDX;
                case SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE:
                    return CurrencyDto.ELON;
                case SDK_ASSET_ILLUSTRATION_EXIT_VALUE:
                    return CurrencyDto.IVV;
                case SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE:
                    return CurrencyDto.HMND;
                case SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE:
                    return CurrencyDto.HONEY;
                case SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE:
                    return CurrencyDto.LAYER;
                case SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE:
                    return CurrencyDto.GLMR;
                case SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE:
                    return CurrencyDto.f8159KO;
                case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE:
                    return CurrencyDto.SPOT;
                case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE:
                    return CurrencyDto.SMCX;
                case 239:
                    return CurrencyDto.GIGA;
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE:
                    return CurrencyDto.USFR;
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE:
                    return CurrencyDto.f8169VZ;
                case f2778x3356acf6:
                    return CurrencyDto.IAU;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE:
                    return CurrencyDto.ARPA;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE:
                    return CurrencyDto.UAL;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE:
                    return CurrencyDto.RAY;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE:
                    return CurrencyDto.f8160ME;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE:
                    return CurrencyDto.MRVL;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE:
                    return CurrencyDto.HOT;
                case f2779x59907a3d:
                    return CurrencyDto.UPS;
                case 250:
                    return CurrencyDto.f8153BA;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE:
                    return CurrencyDto.DEPRECATED_EUROC;
                case SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE:
                    return CurrencyDto.GEV;
                case SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE:
                    return CurrencyDto.TZA;
                case SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE:
                    return CurrencyDto.GAL;
                case 255:
                    return CurrencyDto.LMT;
                case 256:
                    return CurrencyDto.f8156GE;
                case SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE:
                    return CurrencyDto.CONY;
                case SDK_ASSET_HEADER_BOLT_VALUE:
                    return CurrencyDto.BIO;
                case SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE:
                    return CurrencyDto.CELH;
                case SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE:
                    return CurrencyDto.IOST;
                case SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE:
                    return CurrencyDto.ZEUS;
                case SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE:
                    return CurrencyDto.GNO;
                case SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE:
                    return CurrencyDto.SPXU;
                case SDK_ASSET_ICON_PLAID_LOGO_VALUE:
                    return CurrencyDto.SCHD;
                case SDK_ASSET_HEADER_SHIELD_VALUE:
                    return CurrencyDto.SLV;
                case SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE:
                    return CurrencyDto.RPL;
                case SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE:
                    return CurrencyDto.PLA;
                case SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE:
                    return CurrencyDto.WAMPL;
                case SDK_ASSET_HEADER_REPORT_SHARED_VALUE:
                    return CurrencyDto.ROOT;
                case SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE:
                    return CurrencyDto.KAVA;
                case 271:
                    return CurrencyDto.PINS;
                case SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE:
                    return CurrencyDto.MOVE;
                case SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE:
                    return CurrencyDto.SOXL;
                case SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE:
                    return CurrencyDto.INTR;
                case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE:
                    return CurrencyDto.INDEX;
                case SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE:
                    return CurrencyDto.CVS;
                case SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE:
                    return CurrencyDto.AVGO;
                case SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE:
                    return CurrencyDto.WLD;
                case SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE:
                    return CurrencyDto.BRETT;
                case 280:
                    return CurrencyDto.PANW;
                case SDK_ASSET_ILLUSTRATION_BANK_VALUE:
                    return CurrencyDto.WDAY;
                case SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE:
                    return CurrencyDto.SNAP;
                case 283:
                    return CurrencyDto.BOBA;
                case SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE:
                    return CurrencyDto.BABYDOGE;
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE:
                    return CurrencyDto.MASK;
                case f2777x89a9e432:
                    return CurrencyDto.KHC;
                case SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE:
                    return CurrencyDto.ORCL;
                case 288:
                    return CurrencyDto.RDDT;
                case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE:
                    return CurrencyDto.INTC;
                case SDK_ASSET_ILLUSTRATION_NOTE_VALUE:
                    return CurrencyDto.TMF;
                case f2776x87e624cb:
                    return CurrencyDto.ANKR;
                case SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE:
                    return CurrencyDto.RIVN;
                case SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE:
                    return CurrencyDto.PRIME;
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE:
                    return CurrencyDto.MORPHO;
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE:
                    return CurrencyDto.LYFT;
                case SDK_ASSET_LOADING_INDICATOR_VALUE:
                    return CurrencyDto.EUL;
                case SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE:
                    return CurrencyDto.XYO;
                case SDK_ASSET_BANK_ICON_CIRCLE_VALUE:
                    return CurrencyDto.RKT;
                case SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE:
                    return CurrencyDto.INOD;
                case 300:
                    return CurrencyDto.RBLX;
                case SDK_ASSET_CASH_ICON_CIRCLE_VALUE:
                    return CurrencyDto.VTI;
                case 302:
                    return CurrencyDto.POLS;
                case SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE:
                    return CurrencyDto.BEAM;
                case SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE:
                    return CurrencyDto.AAL;
                case SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE:
                    return CurrencyDto.MYTH;
                case SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE:
                    return CurrencyDto.JNJ;
                case SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE:
                    return CurrencyDto.SRPT;
                case SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE:
                    return CurrencyDto.PHA;
                case SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE:
                    return CurrencyDto.FARTCOIN;
                case SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE:
                    return CurrencyDto.QCOM;
                case SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE:
                    return CurrencyDto.ABNB;
                case f2774x74902ae0:
                    return CurrencyDto.KGC;
                case SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE:
                    return CurrencyDto.AIOZ;
                case SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE:
                    return CurrencyDto.JEPQ;
                case SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE:
                    return CurrencyDto.TGT;
                case 316:
                    return CurrencyDto.TEM;
                case SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE:
                    return CurrencyDto.CAVA;
                case SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE:
                    return CurrencyDto.PFE;
                case f2781x2ba65ba3:
                    return CurrencyDto.f8168U;
                case SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE:
                    return CurrencyDto.LQTY;
                case SDK_ASSET_BANK_ICON_CIRCLE_LIGHT_VALUE:
                    return CurrencyDto.DOGINME;
                case SDK_ASSET_PLAID_PROFILE_CIRCLE_VALUE:
                    return CurrencyDto.f8151AI;
                case f2775xbcb7e6f3:
                    return CurrencyDto.SNOW;
                case SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE:
                    return CurrencyDto.f8158IO;
                case SDK_ASSET_ICON_REPORT_VALUE:
                    return CurrencyDto.CKB;
                case SDK_ASSET_ICON_STEP_COMPLETE_VALUE:
                    return CurrencyDto.f8163NU;
                case SDK_ASSET_ICON_UPLOAD_VALUE:
                    return CurrencyDto.TQQQ;
                case SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE:
                    return CurrencyDto.KAP;
                case SDK_ASSET_ICON_LIGHTNING_FILLED_BLUE_VALUE:
                    return CurrencyDto.HOOK;
                case 330:
                    return CurrencyDto.RNDR;
                case 331:
                    return CurrencyDto.VUG;
                case 332:
                    return CurrencyDto.ACS;
                case 333:
                    return CurrencyDto.ROUTE;
                case 334:
                    return CurrencyDto.MRNA;
                case 335:
                    return CurrencyDto.SHOP;
                case WaitlistAnimationConstants.IN_WAITLIST_ANIMATION_END /* 336 */:
                    return CurrencyDto.f8152B3;
                case 337:
                    return CurrencyDto.UNH;
                case 338:
                    return CurrencyDto.ARC;
                case 339:
                    return CurrencyDto.DAL;
                case 340:
                    return CurrencyDto.ZKJ;
                case 341:
                    return CurrencyDto.MAGS;
                case 342:
                    return CurrencyDto.MSTZ;
                case 343:
                    return CurrencyDto.BTRST;
                case 344:
                    return CurrencyDto.SUPER;
                case 345:
                    return CurrencyDto.OKTA;
                case 346:
                    return CurrencyDto.ZIL;
                case 347:
                    return CurrencyDto.DKS;
                case 348:
                    return CurrencyDto.f8155F;
                case 349:
                    return CurrencyDto.CLF;
                case 350:
                    return CurrencyDto.ROKU;
                case 351:
                    return CurrencyDto.BIGTIME;
                case 352:
                    return CurrencyDto.GRASS;
                case 353:
                    return CurrencyDto.AVA;
                case 354:
                    return CurrencyDto.BIL;
                case 355:
                    return CurrencyDto.AFRM;
                case 356:
                    return CurrencyDto.TNA;
                case 357:
                    return CurrencyDto.AMPL;
                case 358:
                    return CurrencyDto.GOAT;
                case 359:
                    return CurrencyDto.IBIT;
                case 360:
                    return CurrencyDto.AIXBT;
                case 361:
                    return CurrencyDto.ONE;
                case 362:
                    return CurrencyDto.GAP;
                case 363:
                    return CurrencyDto.GOOGL;
                case 364:
                    return CurrencyDto.VRT;
                case 365:
                    return CurrencyDto.CHEX;
                case 366:
                    return CurrencyDto.HUM;
                case 367:
                    return CurrencyDto.TTWO;
                case 368:
                    return CurrencyDto.f8157HD;
                case 369:
                    return CurrencyDto.VXX;
                case 370:
                    return CurrencyDto.RDNT;
                case 371:
                    return CurrencyDto.SMCI;
                case 372:
                    return CurrencyDto.CFX;
                case 373:
                    return CurrencyDto.SOXS;
                case 374:
                    return CurrencyDto.INDP;
                case 375:
                    return CurrencyDto.PAAL;
                case 376:
                    return CurrencyDto.ENPH;
                case 377:
                    return CurrencyDto.CLSK;
                case 378:
                    return CurrencyDto.KEY;
                case 379:
                    return CurrencyDto.AGIX;
                case 380:
                    return CurrencyDto.JTO;
                case 381:
                    return CurrencyDto.ACE;
                case 382:
                    return CurrencyDto.PYPL;
                case 383:
                    return CurrencyDto.AI16Z;
                case 384:
                    return CurrencyDto.CSCO;
                case 385:
                    return CurrencyDto.SPXS;
                case 386:
                    return CurrencyDto.TECL;
                case 387:
                    return CurrencyDto.FXS;
                case 388:
                    return CurrencyDto.ETHFI;
                case 389:
                    return CurrencyDto.ALCH;
                case 390:
                    return CurrencyDto.LLY;
                case 391:
                    return CurrencyDto.PYR;
                case 392:
                    return CurrencyDto.IBKR;
                case 393:
                    return CurrencyDto.AERO;
                case 394:
                    return CurrencyDto.LPT;
                case 395:
                    return CurrencyDto.ARKM;
                case WaitlistAnimationConstants.LEFT_YAW_START /* 396 */:
                    return CurrencyDto.ACX;
                case 397:
                    return CurrencyDto.TRNR;
                case 398:
                    return CurrencyDto.BICO;
                case 399:
                    return CurrencyDto.MSTY;
                case 400:
                    return CurrencyDto.CEG;
                case 401:
                    return CurrencyDto.BITU;
                case 402:
                    return CurrencyDto.VGT;
                case HttpStatusCode.FORBIDDEN /* 403 */:
                    return CurrencyDto.DECK;
                case 404:
                    return CurrencyDto.WEEK;
                case 405:
                    return CurrencyDto.NKE;
                case 406:
                    return CurrencyDto.TTD;
                case 407:
                    return CurrencyDto.AMAT;
                case 408:
                    return CurrencyDto.VOO;
                case 409:
                    return CurrencyDto.SBUX;
                case HttpStatusCode.GONE /* 410 */:
                    return CurrencyDto.AIDOGE;
                case 411:
                    return CurrencyDto.IWM;
                case 412:
                    return CurrencyDto.CVNA;
                case 413:
                    return CurrencyDto.RWM;
                case 414:
                    return CurrencyDto.BROS;
                case 415:
                    return CurrencyDto.OKLO;
                case 416:
                    return CurrencyDto.FBTC;
                case 417:
                    return CurrencyDto.KOLD;
                case 418:
                    return CurrencyDto.SOFI;
                case 419:
                    return CurrencyDto.OUNZ;
                case 420:
                    return CurrencyDto.ZVZZT;
                case 421:
                    return CurrencyDto.MSFT;
                case 422:
                    return CurrencyDto.f8164OM;
                case 423:
                    return CurrencyDto.TOSHI;
                case 424:
                    return CurrencyDto.ORDI;
                case CompanyFinancialsSection.BAR_ANIMATION_DURATION /* 425 */:
                    return CurrencyDto.DOCS;
                case 426:
                    return CurrencyDto.UPRO;
                case 427:
                    return CurrencyDto.OSCR;
                case 428:
                    return CurrencyDto.GDX;
                case 429:
                    return CurrencyDto.APP;
                case 430:
                    return CurrencyDto.MXC;
                case 431:
                    return CurrencyDto.PEP;
                case 432:
                    return CurrencyDto.CFG;
                case 433:
                    return CurrencyDto.API3;
                case 434:
                    return CurrencyDto.NFLX;
                case 435:
                    return CurrencyDto.REQ;
                case 436:
                    return CurrencyDto.ELF;
                case 437:
                    return CurrencyDto.YGG;
                case 438:
                    return CurrencyDto.DKNG;
                case 439:
                    return CurrencyDto.PONKE;
                case 440:
                    return CurrencyDto.PENDLE;
                case 441:
                    return CurrencyDto.ALT;
                case 442:
                    return CurrencyDto.DELL;
                case 443:
                    return CurrencyDto.IAUM;
                case 444:
                    return CurrencyDto.NVD;
                case 445:
                    return CurrencyDto.REN;
                case 446:
                    return CurrencyDto.KCS;
                case 447:
                    return CurrencyDto.CLS;
                case 448:
                    return CurrencyDto.CCL;
                case 449:
                    return CurrencyDto.ANET;
                case 450:
                    return CurrencyDto.NVDL;
                case 451:
                    return CurrencyDto.VST;
                case 452:
                    return CurrencyDto.VVV;
                case 453:
                    return CurrencyDto.FSLR;
                case 454:
                    return CurrencyDto.CLANKER;
                case 455:
                    return CurrencyDto.SPXL;
                case WaitlistAnimationConstants.MIDDLE_YAW_FRAME /* 456 */:
                    return CurrencyDto.OPAI;
                case 457:
                    return CurrencyDto.f8162MU;
                case 458:
                    return CurrencyDto.CONL;
                case 459:
                    return CurrencyDto.STG;
                case 460:
                    return CurrencyDto.HUT;
                case 461:
                    return CurrencyDto.LABU;
                case 462:
                    return CurrencyDto.RED;
                case 463:
                    return CurrencyDto.PLUME;
                case 464:
                    return CurrencyDto.MRK;
                case 465:
                    return CurrencyDto.IOTX;
                case 466:
                    return CurrencyDto.DJT;
                case 467:
                    return CurrencyDto.AYRO;
                case 468:
                    return CurrencyDto.FAI;
                case 469:
                    return CurrencyDto.HFT;
                case 470:
                    return CurrencyDto.NBIS;
                case 471:
                    return CurrencyDto.MNT;
                case 472:
                    return CurrencyDto.BITO;
                case 473:
                    return CurrencyDto.JPM;
                case 474:
                    return CurrencyDto.IONQ;
                case 475:
                    return CurrencyDto.KP3R;
                case 476:
                    return CurrencyDto.COW;
                case 477:
                    return CurrencyDto.GLD;
                case 478:
                    return CurrencyDto.LCX;
                case 479:
                    return CurrencyDto.SQQQ;
                case 480:
                    return CurrencyDto.f8161MP;
                case 481:
                    return CurrencyDto.ORCA;
                case 482:
                    return CurrencyDto.SGOV;
                case 483:
                    return CurrencyDto.KAITO;
                case 484:
                    return CurrencyDto.RIOT;
                case 485:
                    return CurrencyDto.NOW;
                case 486:
                    return CurrencyDto.MARA;
                case 487:
                    return CurrencyDto.MEOW;
                case 488:
                    return CurrencyDto.MPLX;
                case 489:
                    return CurrencyDto.MELI;
                case 490:
                    return CurrencyDto.ZIM;
                case 491:
                    return CurrencyDto.QRDO;
                case 492:
                    return CurrencyDto.APT;
                case 493:
                    return CurrencyDto.XYZ;
                case 494:
                    return CurrencyDto.NVDA;
                case 495:
                    return CurrencyDto.MAGIC;
                case 496:
                    return CurrencyDto.ALEX;
                case 497:
                    return CurrencyDto.COST;
                case 498:
                    return CurrencyDto.QUARTZ;
                case 499:
                    return CurrencyDto.XOM;
                case 500:
                    return CurrencyDto.SPACEX;
                case 501:
                    return CurrencyDto.QQQ;
                case com.withpersona.sdk2.inquiry.network.core.HttpStatusCode.BAD_GATEWAY_502 /* 502 */:
                    return CurrencyDto.ACH;
                case 503:
                    return CurrencyDto.ATH;
                case 504:
                    return CurrencyDto.DIS;
                case 505:
                    return CurrencyDto.SAFE;
                case 506:
                    return CurrencyDto.TLT;
                case 507:
                    return CurrencyDto.OXY;
                case 508:
                    return CurrencyDto.RLC;
                case 509:
                    return CurrencyDto.GEOD;
                case 510:
                    return CurrencyDto.KMNO;
                case 511:
                    return CurrencyDto.COOKIE;
                case 512:
                    return CurrencyDto.UBER;
                case 513:
                    return CurrencyDto.KWEB;
                case 514:
                    return CurrencyDto.ALAB;
                case 515:
                    return CurrencyDto.GNLN;
                case WaitlistAnimationConstants.RIGHT_YAW_END /* 516 */:
                    return CurrencyDto.CRCL;
                case 517:
                    return CurrencyDto.BITI;
                case 518:
                    return CurrencyDto.SPY;
                case 519:
                    return CurrencyDto.QQQM;
                case 520:
                    return CurrencyDto.GRIFFAIN;
                case HttpStatusCode.DOWNTIME_ERROR /* 521 */:
                    return CurrencyDto.WELL;
                case 522:
                    return CurrencyDto.JEPI;
                case 523:
                    return CurrencyDto.SBIT;
                case 524:
                    return CurrencyDto.NVDU;
                case 525:
                    return CurrencyDto.ETHA;
                case 526:
                    return CurrencyDto.TMUS;
                case 527:
                    return CurrencyDto.DRIFT;
                case 528:
                    return CurrencyDto.NVDY;
                case 529:
                    return CurrencyDto.SMH;
                case 530:
                    return CurrencyDto.FAZ;
                case 531:
                    return CurrencyDto.f8167T;
                case 532:
                    return CurrencyDto.AAAU;
                case 533:
                    return CurrencyDto.LABD;
                case 534:
                    return CurrencyDto.AXL;
                case 535:
                    return CurrencyDto.SPX;
                case 536:
                    return CurrencyDto.QWAN;
                case 537:
                    return CurrencyDto.GMX;
                case 538:
                    return CurrencyDto.TSLY;
                case 539:
                    return CurrencyDto.QLD;
                case 540:
                    return CurrencyDto.YMAX;
                case 541:
                    return CurrencyDto.TSLL;
                case 542:
                    return CurrencyDto.CMG;
                case 543:
                    return CurrencyDto.CRM;
                case 544:
                    return CurrencyDto.BAC;
                case 545:
                    return CurrencyDto.RUN;
                case 546:
                    return CurrencyDto.HIMS;
                case 547:
                    return CurrencyDto.KSM;
                case 548:
                    return CurrencyDto.SGOL;
                case 549:
                    return CurrencyDto.NEIRO;
                case 550:
                    return CurrencyDto.ARKB;
                case 551:
                    return CurrencyDto.f8154EL;
                case RhRoomDatabase.MIGRATION_START_VER /* 552 */:
                    return CurrencyDto.NCLH;
                case 553:
                    return CurrencyDto.NET;
                case 554:
                    return CurrencyDto.SMR;
                case 555:
                    return CurrencyDto.METIS;
                case 556:
                    return CurrencyDto.UPST;
                case 557:
                    return CurrencyDto.TNSR;
                case 558:
                    return CurrencyDto.WMT;
                case 559:
                    return CurrencyDto.LBRDA;
                case 560:
                    return CurrencyDto.ARKG;
                case 561:
                    return CurrencyDto.GLIBA;
                case 562:
                    return CurrencyDto.GLBAV;
                case 563:
                    return CurrencyDto.WLFI;
                case 564:
                    return CurrencyDto.ZORA;
                case 565:
                    return CurrencyDto.ASTER;
                case 566:
                    return CurrencyDto.XPL;
                case 567:
                    return CurrencyDto.HYPE;
                case 568:
                    return CurrencyDto.AVNT;
                case 569:
                    return CurrencyDto.OPENL;
                case 570:
                    return CurrencyDto.OPENW;
                case 571:
                    return CurrencyDto.OPENZ;
                case 572:
                    return CurrencyDto.XCN;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CurrencyDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrosetta/blockchain/v1/CurrencyDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/blockchain/v1/CurrencyDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.blockchain.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<CurrencyDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<CurrencyDto, Currency> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.blockchain.v1.Currency", CurrencyDto.getEntries(), CurrencyDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public CurrencyDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (CurrencyDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CurrencyDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static CurrencyDto valueOf(String str) {
        return (CurrencyDto) Enum.valueOf(CurrencyDto.class, str);
    }

    public static CurrencyDto[] values() {
        return (CurrencyDto[]) $VALUES.clone();
    }
}
