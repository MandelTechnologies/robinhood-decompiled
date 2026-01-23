package rosetta.blockchain.p533v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.apitestdata.models.ApiCreateUserRequest;
import com.robinhood.android.equities.companyfinancials.p116ui.CompanyFinancialsSection;
import com.robinhood.android.optionschain.sbschain.onboarding.OptionChainOnboardingDuxo;
import com.robinhood.android.portfolio.pnl.fixtures.ProfitAndLossTradeItemFixtures;
import com.robinhood.android.waitlist.spot.WaitlistAnimationConstants;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.dao.RhRoomDatabase;
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
/* compiled from: Currency.kt */
@Metadata(m3635d1 = {"\u0000\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0003\bÂ\u0004\b\u0086\u0081\u0002\u0018\u0000 Å\u00042\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0002Å\u0004B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001j\u0003\b\u0098\u0001j\u0003\b\u0099\u0001j\u0003\b\u009a\u0001j\u0003\b\u009b\u0001j\u0003\b\u009c\u0001j\u0003\b\u009d\u0001j\u0003\b\u009e\u0001j\u0003\b\u009f\u0001j\u0003\b \u0001j\u0003\b¡\u0001j\u0003\b¢\u0001j\u0003\b£\u0001j\u0003\b¤\u0001j\u0003\b¥\u0001j\u0003\b¦\u0001j\u0003\b§\u0001j\u0003\b¨\u0001j\u0003\b©\u0001j\u0003\bª\u0001j\u0003\b«\u0001j\u0003\b¬\u0001j\u0003\b\u00ad\u0001j\u0003\b®\u0001j\u0003\b¯\u0001j\u0003\b°\u0001j\u0003\b±\u0001j\u0003\b²\u0001j\u0003\b³\u0001j\u0003\b´\u0001j\u0003\bµ\u0001j\u0003\b¶\u0001j\u0003\b·\u0001j\u0003\b¸\u0001j\u0003\b¹\u0001j\u0003\bº\u0001j\u0003\b»\u0001j\u0003\b¼\u0001j\u0003\b½\u0001j\u0003\b¾\u0001j\u0003\b¿\u0001j\u0003\bÀ\u0001j\u0003\bÁ\u0001j\u0003\bÂ\u0001j\u0003\bÃ\u0001j\u0003\bÄ\u0001j\u0003\bÅ\u0001j\u0003\bÆ\u0001j\u0003\bÇ\u0001j\u0003\bÈ\u0001j\u0003\bÉ\u0001j\u0003\bÊ\u0001j\u0003\bË\u0001j\u0003\bÌ\u0001j\u0003\bÍ\u0001j\u0003\bÎ\u0001j\u0003\bÏ\u0001j\u0003\bÐ\u0001j\u0003\bÑ\u0001j\u0003\bÒ\u0001j\u0003\bÓ\u0001j\u0003\bÔ\u0001j\u0003\bÕ\u0001j\u0003\bÖ\u0001j\u0003\b×\u0001j\u0003\bØ\u0001j\u0003\bÙ\u0001j\u0003\bÚ\u0001j\u0003\bÛ\u0001j\u0003\bÜ\u0001j\u0003\bÝ\u0001j\u0003\bÞ\u0001j\u0003\bß\u0001j\u0003\bà\u0001j\u0003\bá\u0001j\u0003\bâ\u0001j\u0003\bã\u0001j\u0003\bä\u0001j\u0003\bå\u0001j\u0003\bæ\u0001j\u0003\bç\u0001j\u0003\bè\u0001j\u0003\bé\u0001j\u0003\bê\u0001j\u0003\bë\u0001j\u0003\bì\u0001j\u0003\bí\u0001j\u0003\bî\u0001j\u0003\bï\u0001j\u0003\bð\u0001j\u0003\bñ\u0001j\u0003\bò\u0001j\u0003\bó\u0001j\u0003\bô\u0001j\u0003\bõ\u0001j\u0003\bö\u0001j\u0003\b÷\u0001j\u0003\bø\u0001j\u0003\bù\u0001j\u0003\bú\u0001j\u0003\bû\u0001j\u0003\bü\u0001j\u0003\bý\u0001j\u0003\bþ\u0001j\u0003\bÿ\u0001j\u0003\b\u0080\u0002j\u0003\b\u0081\u0002j\u0003\b\u0082\u0002j\u0003\b\u0083\u0002j\u0003\b\u0084\u0002j\u0003\b\u0085\u0002j\u0003\b\u0086\u0002j\u0003\b\u0087\u0002j\u0003\b\u0088\u0002j\u0003\b\u0089\u0002j\u0003\b\u008a\u0002j\u0003\b\u008b\u0002j\u0003\b\u008c\u0002j\u0003\b\u008d\u0002j\u0003\b\u008e\u0002j\u0003\b\u008f\u0002j\u0003\b\u0090\u0002j\u0003\b\u0091\u0002j\u0003\b\u0092\u0002j\u0003\b\u0093\u0002j\u0003\b\u0094\u0002j\u0003\b\u0095\u0002j\u0003\b\u0096\u0002j\u0003\b\u0097\u0002j\u0003\b\u0098\u0002j\u0003\b\u0099\u0002j\u0003\b\u009a\u0002j\u0003\b\u009b\u0002j\u0003\b\u009c\u0002j\u0003\b\u009d\u0002j\u0003\b\u009e\u0002j\u0003\b\u009f\u0002j\u0003\b \u0002j\u0003\b¡\u0002j\u0003\b¢\u0002j\u0003\b£\u0002j\u0003\b¤\u0002j\u0003\b¥\u0002j\u0003\b¦\u0002j\u0003\b§\u0002j\u0003\b¨\u0002j\u0003\b©\u0002j\u0003\bª\u0002j\u0003\b«\u0002j\u0003\b¬\u0002j\u0003\b\u00ad\u0002j\u0003\b®\u0002j\u0003\b¯\u0002j\u0003\b°\u0002j\u0003\b±\u0002j\u0003\b²\u0002j\u0003\b³\u0002j\u0003\b´\u0002j\u0003\bµ\u0002j\u0003\b¶\u0002j\u0003\b·\u0002j\u0003\b¸\u0002j\u0003\b¹\u0002j\u0003\bº\u0002j\u0003\b»\u0002j\u0003\b¼\u0002j\u0003\b½\u0002j\u0003\b¾\u0002j\u0003\b¿\u0002j\u0003\bÀ\u0002j\u0003\bÁ\u0002j\u0003\bÂ\u0002j\u0003\bÃ\u0002j\u0003\bÄ\u0002j\u0003\bÅ\u0002j\u0003\bÆ\u0002j\u0003\bÇ\u0002j\u0003\bÈ\u0002j\u0003\bÉ\u0002j\u0003\bÊ\u0002j\u0003\bË\u0002j\u0003\bÌ\u0002j\u0003\bÍ\u0002j\u0003\bÎ\u0002j\u0003\bÏ\u0002j\u0003\bÐ\u0002j\u0003\bÑ\u0002j\u0003\bÒ\u0002j\u0003\bÓ\u0002j\u0003\bÔ\u0002j\u0003\bÕ\u0002j\u0003\bÖ\u0002j\u0003\b×\u0002j\u0003\bØ\u0002j\u0003\bÙ\u0002j\u0003\bÚ\u0002j\u0003\bÛ\u0002j\u0003\bÜ\u0002j\u0003\bÝ\u0002j\u0003\bÞ\u0002j\u0003\bß\u0002j\u0003\bà\u0002j\u0003\bá\u0002j\u0003\bâ\u0002j\u0003\bã\u0002j\u0003\bä\u0002j\u0003\bå\u0002j\u0003\bæ\u0002j\u0003\bç\u0002j\u0003\bè\u0002j\u0003\bé\u0002j\u0003\bê\u0002j\u0003\bë\u0002j\u0003\bì\u0002j\u0003\bí\u0002j\u0003\bî\u0002j\u0003\bï\u0002j\u0003\bð\u0002j\u0003\bñ\u0002j\u0003\bò\u0002j\u0003\bó\u0002j\u0003\bô\u0002j\u0003\bõ\u0002j\u0003\bö\u0002j\u0003\b÷\u0002j\u0003\bø\u0002j\u0003\bù\u0002j\u0003\bú\u0002j\u0003\bû\u0002j\u0003\bü\u0002j\u0003\bý\u0002j\u0003\bþ\u0002j\u0003\bÿ\u0002j\u0003\b\u0080\u0003j\u0003\b\u0081\u0003j\u0003\b\u0082\u0003j\u0003\b\u0083\u0003j\u0003\b\u0084\u0003j\u0003\b\u0085\u0003j\u0003\b\u0086\u0003j\u0003\b\u0087\u0003j\u0003\b\u0088\u0003j\u0003\b\u0089\u0003j\u0003\b\u008a\u0003j\u0003\b\u008b\u0003j\u0003\b\u008c\u0003j\u0003\b\u008d\u0003j\u0003\b\u008e\u0003j\u0003\b\u008f\u0003j\u0003\b\u0090\u0003j\u0003\b\u0091\u0003j\u0003\b\u0092\u0003j\u0003\b\u0093\u0003j\u0003\b\u0094\u0003j\u0003\b\u0095\u0003j\u0003\b\u0096\u0003j\u0003\b\u0097\u0003j\u0003\b\u0098\u0003j\u0003\b\u0099\u0003j\u0003\b\u009a\u0003j\u0003\b\u009b\u0003j\u0003\b\u009c\u0003j\u0003\b\u009d\u0003j\u0003\b\u009e\u0003j\u0003\b\u009f\u0003j\u0003\b \u0003j\u0003\b¡\u0003j\u0003\b¢\u0003j\u0003\b£\u0003j\u0003\b¤\u0003j\u0003\b¥\u0003j\u0003\b¦\u0003j\u0003\b§\u0003j\u0003\b¨\u0003j\u0003\b©\u0003j\u0003\bª\u0003j\u0003\b«\u0003j\u0003\b¬\u0003j\u0003\b\u00ad\u0003j\u0003\b®\u0003j\u0003\b¯\u0003j\u0003\b°\u0003j\u0003\b±\u0003j\u0003\b²\u0003j\u0003\b³\u0003j\u0003\b´\u0003j\u0003\bµ\u0003j\u0003\b¶\u0003j\u0003\b·\u0003j\u0003\b¸\u0003j\u0003\b¹\u0003j\u0003\bº\u0003j\u0003\b»\u0003j\u0003\b¼\u0003j\u0003\b½\u0003j\u0003\b¾\u0003j\u0003\b¿\u0003j\u0003\bÀ\u0003j\u0003\bÁ\u0003j\u0003\bÂ\u0003j\u0003\bÃ\u0003j\u0003\bÄ\u0003j\u0003\bÅ\u0003j\u0003\bÆ\u0003j\u0003\bÇ\u0003j\u0003\bÈ\u0003j\u0003\bÉ\u0003j\u0003\bÊ\u0003j\u0003\bË\u0003j\u0003\bÌ\u0003j\u0003\bÍ\u0003j\u0003\bÎ\u0003j\u0003\bÏ\u0003j\u0003\bÐ\u0003j\u0003\bÑ\u0003j\u0003\bÒ\u0003j\u0003\bÓ\u0003j\u0003\bÔ\u0003j\u0003\bÕ\u0003j\u0003\bÖ\u0003j\u0003\b×\u0003j\u0003\bØ\u0003j\u0003\bÙ\u0003j\u0003\bÚ\u0003j\u0003\bÛ\u0003j\u0003\bÜ\u0003j\u0003\bÝ\u0003j\u0003\bÞ\u0003j\u0003\bß\u0003j\u0003\bà\u0003j\u0003\bá\u0003j\u0003\bâ\u0003j\u0003\bã\u0003j\u0003\bä\u0003j\u0003\bå\u0003j\u0003\bæ\u0003j\u0003\bç\u0003j\u0003\bè\u0003j\u0003\bé\u0003j\u0003\bê\u0003j\u0003\bë\u0003j\u0003\bì\u0003j\u0003\bí\u0003j\u0003\bî\u0003j\u0003\bï\u0003j\u0003\bð\u0003j\u0003\bñ\u0003j\u0003\bò\u0003j\u0003\bó\u0003j\u0003\bô\u0003j\u0003\bõ\u0003j\u0003\bö\u0003j\u0003\b÷\u0003j\u0003\bø\u0003j\u0003\bù\u0003j\u0003\bú\u0003j\u0003\bû\u0003j\u0003\bü\u0003j\u0003\bý\u0003j\u0003\bþ\u0003j\u0003\bÿ\u0003j\u0003\b\u0080\u0004j\u0003\b\u0081\u0004j\u0003\b\u0082\u0004j\u0003\b\u0083\u0004j\u0003\b\u0084\u0004j\u0003\b\u0085\u0004j\u0003\b\u0086\u0004j\u0003\b\u0087\u0004j\u0003\b\u0088\u0004j\u0003\b\u0089\u0004j\u0003\b\u008a\u0004j\u0003\b\u008b\u0004j\u0003\b\u008c\u0004j\u0003\b\u008d\u0004j\u0003\b\u008e\u0004j\u0003\b\u008f\u0004j\u0003\b\u0090\u0004j\u0003\b\u0091\u0004j\u0003\b\u0092\u0004j\u0003\b\u0093\u0004j\u0003\b\u0094\u0004j\u0003\b\u0095\u0004j\u0003\b\u0096\u0004j\u0003\b\u0097\u0004j\u0003\b\u0098\u0004j\u0003\b\u0099\u0004j\u0003\b\u009a\u0004j\u0003\b\u009b\u0004j\u0003\b\u009c\u0004j\u0003\b\u009d\u0004j\u0003\b\u009e\u0004j\u0003\b\u009f\u0004j\u0003\b \u0004j\u0003\b¡\u0004j\u0003\b¢\u0004j\u0003\b£\u0004j\u0003\b¤\u0004j\u0003\b¥\u0004j\u0003\b¦\u0004j\u0003\b§\u0004j\u0003\b¨\u0004j\u0003\b©\u0004j\u0003\bª\u0004j\u0003\b«\u0004j\u0003\b¬\u0004j\u0003\b\u00ad\u0004j\u0003\b®\u0004j\u0003\b¯\u0004j\u0003\b°\u0004j\u0003\b±\u0004j\u0003\b²\u0004j\u0003\b³\u0004j\u0003\b´\u0004j\u0003\bµ\u0004j\u0003\b¶\u0004j\u0003\b·\u0004j\u0003\b¸\u0004j\u0003\b¹\u0004j\u0003\bº\u0004j\u0003\b»\u0004j\u0003\b¼\u0004j\u0003\b½\u0004j\u0003\b¾\u0004j\u0003\b¿\u0004j\u0003\bÀ\u0004j\u0003\bÁ\u0004j\u0003\bÂ\u0004j\u0003\bÃ\u0004j\u0003\bÄ\u0004¨\u0006Æ\u0004"}, m3636d2 = {"Lrosetta/blockchain/v1/Currency;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CURRENCY_UNSPECIFIED", ApiCreateUserRequest.SYMBOL_FOR_CRYPTO, "BCH", "BSV", "LTC", "DOGE", "ETH", "ETC", "USD", "USDT", "XRP", "QTUM", "NEO", "XMR", "DASH", "BTG", "LSK", "OMG", "BNB", "USDC", "LUNA", "XLM", "ZEC", "SOL", "ADA", "AVAX", "DOT", "BUSD", "UST", "CRO", "DAI", "ATOM", "NEAR", "UNI", "FTT", "TRX", "ALGO", "LEO", "FTM", "BTCB", "HBAR", "ICP", "SAND", "FIL", "AXS", "VET", "EGLD", "THETA", "KLAY", "XTZ", "HNT", "FLOW", "AAVE", "LINK", "LRC", "SHIB", "COMP", "MATIC", "MANA", "CELO", "BAL", "WETH", "ZRX", "RUNE", "PAXG", "CAKE", "USDP", "STX", "APE", "YFI", "BAT", "GUSD", "ENJ", "WBTC", "DCR", "XEM", "MKR", "TUSD", "DFI", "RARI", "WAVES", "CRV", "FRAX", "GMT", "GRT", "MIOTA", "ETHW", "LDO", "CELR", "LOOM", "GHST", "PEPE", "CVX", "HOPR", "EOS", "EUROC", "FUN", "OCEAN", "SNX", "SUSHI", "ARB", "BONK", "OP", "TIA", "WIF", "COQ", "JUP", "TON", "W", "STETH", "ZK", "ZRO", "EUR", "IMX", "RENDER", "FLOKI", "EIGEN", "ENA", "EURC", "AKT", "PYUSD", "POL", "AAPL", "TSLA", "S", "TRUMP", "PENGU", "ONDO", "INJ", "JASMY", "STRK", "PYTH", "STO", "COON", "RANP", "ALTL", "AEC", "STOP", "POPCAT", "VIRTUAL", "PNUT", "MEW", "SIMPSON", "VINO", "YOM", "BERA", "AMEX", "KCT", "XAI", "ATC", "HOOD", "AMZN", "GME", "AMD", "META", "CRWD", "COIN", "MSTR", "GOOG", "PLTR", "QNT", "AKITA", "SAFEMOON", "BABYUNI", "MEGA", "ONEINCH", "AMP", "AUDIO", "BAND", "BLUR", "BNT", "BOME", "CHZ", "COREUM", "CSPR", "CTSI", "CVC", "CXT", "CTX", "DGLD", "DYDX", "ENS", "EURCV", "EURT", "FET", "FLR", "GALA", "GYEN", "KNC", "LMWR", "MELANIA", "MOG", "NEXO", "PERP", "RAD", "RLUSD", "RLY", "SEI", "SGB", "SKL", "SLP", "SMT", "SPELL", "STORJ", "SUI", "SYRUP", "TRAC", "TRUF", "UMA", "VCHF", "VEUR", "VEXT", "WEN", "WOO", "WECAN", "XCHNG", "XDC", "XSGD", "ZETA", "ZUSD", "MOODENG", "GLUB", "NOODLE", "PLS", "TURBO", "GMXP", "SDS", "MTC", "TMDX", "ELON", "IVV", "HMND", "HONEY", "LAYER", "GLMR", "KO", "SPOT", "SMCX", "GIGA", "USFR", "VZ", "IAU", "ARPA", "UAL", "RAY", "ME", "MRVL", "HOT", "UPS", "BA", "DEPRECATED_EUROC", "GEV", "TZA", "GAL", "LMT", "GE", "CONY", "BIO", "CELH", "IOST", "ZEUS", "GNO", "SPXU", "SCHD", "SLV", "RPL", "PLA", "WAMPL", "ROOT", "KAVA", "PINS", "MOVE", "SOXL", "INTR", "INDEX", "CVS", "AVGO", "WLD", "BRETT", "PANW", "WDAY", "SNAP", "BOBA", "BABYDOGE", "MASK", "KHC", "ORCL", "RDDT", "INTC", "TMF", "ANKR", "RIVN", "PRIME", "MORPHO", "LYFT", "EUL", "XYO", "RKT", "INOD", "RBLX", "VTI", "POLS", "BEAM", "AAL", "MYTH", "JNJ", "SRPT", "PHA", "FARTCOIN", "QCOM", "ABNB", "KGC", "AIOZ", "JEPQ", "TGT", "TEM", "CAVA", "PFE", "U", "LQTY", "DOGINME", "AI", "SNOW", "IO", "CKB", CountryCode.COUNTRY_CODE_NU, "TQQQ", "KAP", "HOOK", "RNDR", "VUG", "ACS", "ROUTE", "MRNA", "SHOP", "B3", "UNH", "ARC", "DAL", "ZKJ", "MAGS", "MSTZ", "BTRST", "SUPER", "OKTA", "ZIL", "DKS", "F", "CLF", "ROKU", "BIGTIME", "GRASS", "AVA", "BIL", "AFRM", "TNA", "AMPL", "GOAT", "IBIT", "AIXBT", "ONE", "GAP", "GOOGL", "VRT", "CHEX", "HUM", "TTWO", "HD", "VXX", "RDNT", "SMCI", "CFX", "SOXS", "INDP", "PAAL", "ENPH", "CLSK", "KEY", "AGIX", "JTO", "ACE", "PYPL", "AI16Z", "CSCO", "SPXS", "TECL", "FXS", "ETHFI", "ALCH", "LLY", "PYR", "IBKR", "AERO", "LPT", "ARKM", "ACX", "TRNR", "BICO", "MSTY", "CEG", "BITU", "VGT", "DECK", "WEEK", "NKE", "TTD", "AMAT", "VOO", "SBUX", "AIDOGE", "IWM", "CVNA", "RWM", "BROS", "OKLO", "FBTC", "KOLD", "SOFI", "OUNZ", "ZVZZT", "MSFT", "OM", "TOSHI", "ORDI", "DOCS", "UPRO", "OSCR", "GDX", "APP", "MXC", "PEP", "CFG", "API3", "NFLX", "REQ", "ELF", "YGG", "DKNG", "PONKE", "PENDLE", "ALT", "DELL", "IAUM", "NVD", "REN", "KCS", "CLS", "CCL", "ANET", "NVDL", "VST", "VVV", "FSLR", "CLANKER", "SPXL", "OPAI", "MU", "CONL", "STG", "HUT", "LABU", "RED", "PLUME", "MRK", "IOTX", "DJT", "AYRO", "FAI", "HFT", "NBIS", "MNT", "BITO", "JPM", "IONQ", "KP3R", "COW", "GLD", "LCX", "SQQQ", CountryCode.COUNTRY_CODE_MP, "ORCA", "SGOV", "KAITO", "RIOT", "NOW", "MARA", ProfitAndLossTradeItemFixtures.REQUEST_SYMBOL, "MPLX", "MELI", "ZIM", "QRDO", "APT", "XYZ", "NVDA", "MAGIC", "ALEX", "COST", "QUARTZ", "XOM", "SPACEX", "QQQ", "ACH", "ATH", "DIS", "SAFE", "TLT", "OXY", "RLC", "GEOD", "KMNO", "COOKIE", "UBER", "KWEB", "ALAB", "GNLN", "CRCL", "BITI", OptionChainOnboardingDuxo.DEFAULT, "QQQM", "GRIFFAIN", "WELL", "JEPI", "SBIT", "NVDU", "ETHA", "TMUS", "DRIFT", "NVDY", "SMH", "FAZ", "T", "AAAU", "LABD", "AXL", OptionChainOnboardingDuxo.UK_DEFAULT, "QWAN", "GMX", "TSLY", "QLD", "YMAX", "TSLL", "CMG", "CRM", "BAC", "RUN", "HIMS", "KSM", "SGOL", "NEIRO", "ARKB", "EL", "NCLH", "NET", "SMR", "METIS", "UPST", "TNSR", "WMT", "LBRDA", "ARKG", "GLIBA", "GLBAV", "WLFI", "ZORA", "ASTER", "XPL", "HYPE", "AVNT", "OPENL", "OPENW", "OPENZ", "XCN", "Companion", "rosetta.blockchain.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class Currency implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Currency[] $VALUES;
    public static final Currency AAAU;
    public static final Currency AAL;
    public static final Currency AAPL;
    public static final Currency AAVE;
    public static final Currency ABNB;
    public static final Currency ACE;
    public static final Currency ACH;
    public static final Currency ACS;
    public static final Currency ACX;
    public static final Currency ADA;

    @JvmField
    public static final ProtoAdapter<Currency> ADAPTER;
    public static final Currency AEC;
    public static final Currency AERO;
    public static final Currency AFRM;
    public static final Currency AGIX;

    /* renamed from: AI */
    public static final Currency f8130AI;
    public static final Currency AI16Z;
    public static final Currency AIDOGE;
    public static final Currency AIOZ;
    public static final Currency AIXBT;
    public static final Currency AKITA;
    public static final Currency AKT;
    public static final Currency ALAB;
    public static final Currency ALCH;
    public static final Currency ALEX;
    public static final Currency ALGO;
    public static final Currency ALT;
    public static final Currency ALTL;
    public static final Currency AMAT;
    public static final Currency AMD;
    public static final Currency AMEX;
    public static final Currency AMP;
    public static final Currency AMPL;
    public static final Currency AMZN;
    public static final Currency ANET;
    public static final Currency ANKR;
    public static final Currency APE;
    public static final Currency API3;
    public static final Currency APP;
    public static final Currency APT;
    public static final Currency ARB;
    public static final Currency ARC;
    public static final Currency ARKB;
    public static final Currency ARKG;
    public static final Currency ARKM;
    public static final Currency ARPA;
    public static final Currency ASTER;
    public static final Currency ATC;
    public static final Currency ATH;
    public static final Currency ATOM;
    public static final Currency AUDIO;
    public static final Currency AVA;
    public static final Currency AVAX;
    public static final Currency AVGO;
    public static final Currency AVNT;
    public static final Currency AXL;
    public static final Currency AXS;
    public static final Currency AYRO;

    /* renamed from: B3 */
    public static final Currency f8131B3;

    /* renamed from: BA */
    public static final Currency f8132BA;
    public static final Currency BABYDOGE;
    public static final Currency BABYUNI;
    public static final Currency BAC;
    public static final Currency BAL;
    public static final Currency BAND;
    public static final Currency BAT;
    public static final Currency BCH;
    public static final Currency BEAM;
    public static final Currency BERA;
    public static final Currency BICO;
    public static final Currency BIGTIME;
    public static final Currency BIL;
    public static final Currency BIO;
    public static final Currency BITI;
    public static final Currency BITO;
    public static final Currency BITU;
    public static final Currency BLUR;
    public static final Currency BNB;
    public static final Currency BNT;
    public static final Currency BOBA;
    public static final Currency BOME;
    public static final Currency BONK;
    public static final Currency BRETT;
    public static final Currency BROS;
    public static final Currency BSV;
    public static final Currency BTC;
    public static final Currency BTCB;
    public static final Currency BTG;
    public static final Currency BTRST;
    public static final Currency BUSD;
    public static final Currency CAKE;
    public static final Currency CAVA;
    public static final Currency CCL;
    public static final Currency CEG;
    public static final Currency CELH;
    public static final Currency CELO;
    public static final Currency CELR;
    public static final Currency CFG;
    public static final Currency CFX;
    public static final Currency CHEX;
    public static final Currency CHZ;
    public static final Currency CKB;
    public static final Currency CLANKER;
    public static final Currency CLF;
    public static final Currency CLS;
    public static final Currency CLSK;
    public static final Currency CMG;
    public static final Currency COIN;
    public static final Currency COMP;
    public static final Currency CONL;
    public static final Currency CONY;
    public static final Currency COOKIE;
    public static final Currency COON;
    public static final Currency COQ;
    public static final Currency COREUM;
    public static final Currency COST;
    public static final Currency COW;
    public static final Currency CRCL;
    public static final Currency CRM;
    public static final Currency CRO;
    public static final Currency CRV;
    public static final Currency CRWD;
    public static final Currency CSCO;
    public static final Currency CSPR;
    public static final Currency CTSI;
    public static final Currency CTX;
    public static final Currency CURRENCY_UNSPECIFIED;
    public static final Currency CVC;
    public static final Currency CVNA;
    public static final Currency CVS;
    public static final Currency CVX;
    public static final Currency CXT;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final Currency DAI;
    public static final Currency DAL;
    public static final Currency DASH;
    public static final Currency DCR;
    public static final Currency DECK;
    public static final Currency DELL;
    public static final Currency DEPRECATED_EUROC;
    public static final Currency DFI;
    public static final Currency DGLD;
    public static final Currency DIS;
    public static final Currency DJT;
    public static final Currency DKNG;
    public static final Currency DKS;
    public static final Currency DOCS;
    public static final Currency DOGE;
    public static final Currency DOGINME;
    public static final Currency DOT;
    public static final Currency DRIFT;
    public static final Currency DYDX;
    public static final Currency EGLD;
    public static final Currency EIGEN;

    /* renamed from: EL */
    public static final Currency f8133EL;
    public static final Currency ELF;
    public static final Currency ELON;
    public static final Currency ENA;
    public static final Currency ENJ;
    public static final Currency ENPH;
    public static final Currency ENS;
    public static final Currency EOS;
    public static final Currency ETC;
    public static final Currency ETH;
    public static final Currency ETHA;
    public static final Currency ETHFI;
    public static final Currency ETHW;
    public static final Currency EUL;
    public static final Currency EUR;
    public static final Currency EURC;
    public static final Currency EURCV;
    public static final Currency EUROC;
    public static final Currency EURT;

    /* renamed from: F */
    public static final Currency f8134F;
    public static final Currency FAI;
    public static final Currency FARTCOIN;
    public static final Currency FAZ;
    public static final Currency FBTC;
    public static final Currency FET;
    public static final Currency FIL;
    public static final Currency FLOKI;
    public static final Currency FLOW;
    public static final Currency FLR;
    public static final Currency FRAX;
    public static final Currency FSLR;
    public static final Currency FTM;
    public static final Currency FTT;
    public static final Currency FUN;
    public static final Currency FXS;
    public static final Currency GAL;
    public static final Currency GALA;
    public static final Currency GAP;
    public static final Currency GDX;

    /* renamed from: GE */
    public static final Currency f8135GE;
    public static final Currency GEOD;
    public static final Currency GEV;
    public static final Currency GHST;
    public static final Currency GIGA;
    public static final Currency GLBAV;
    public static final Currency GLD;
    public static final Currency GLIBA;
    public static final Currency GLMR;
    public static final Currency GLUB;
    public static final Currency GME;
    public static final Currency GMT;
    public static final Currency GMX;
    public static final Currency GMXP;
    public static final Currency GNLN;
    public static final Currency GNO;
    public static final Currency GOAT;
    public static final Currency GOOG;
    public static final Currency GOOGL;
    public static final Currency GRASS;
    public static final Currency GRIFFAIN;
    public static final Currency GRT;
    public static final Currency GUSD;
    public static final Currency GYEN;
    public static final Currency HBAR;

    /* renamed from: HD */
    public static final Currency f8136HD;
    public static final Currency HFT;
    public static final Currency HIMS;
    public static final Currency HMND;
    public static final Currency HNT;
    public static final Currency HONEY;
    public static final Currency HOOD;
    public static final Currency HOOK;
    public static final Currency HOPR;
    public static final Currency HOT;
    public static final Currency HUM;
    public static final Currency HUT;
    public static final Currency HYPE;
    public static final Currency IAU;
    public static final Currency IAUM;
    public static final Currency IBIT;
    public static final Currency IBKR;
    public static final Currency ICP;
    public static final Currency IMX;
    public static final Currency INDEX;
    public static final Currency INDP;
    public static final Currency INJ;
    public static final Currency INOD;
    public static final Currency INTC;
    public static final Currency INTR;

    /* renamed from: IO */
    public static final Currency f8137IO;
    public static final Currency IONQ;
    public static final Currency IOST;
    public static final Currency IOTX;
    public static final Currency IVV;
    public static final Currency IWM;
    public static final Currency JASMY;
    public static final Currency JEPI;
    public static final Currency JEPQ;
    public static final Currency JNJ;
    public static final Currency JPM;
    public static final Currency JTO;
    public static final Currency JUP;
    public static final Currency KAITO;
    public static final Currency KAP;
    public static final Currency KAVA;
    public static final Currency KCS;
    public static final Currency KCT;
    public static final Currency KEY;
    public static final Currency KGC;
    public static final Currency KHC;
    public static final Currency KLAY;
    public static final Currency KMNO;
    public static final Currency KNC;

    /* renamed from: KO */
    public static final Currency f8138KO;
    public static final Currency KOLD;
    public static final Currency KP3R;
    public static final Currency KSM;
    public static final Currency KWEB;
    public static final Currency LABD;
    public static final Currency LABU;
    public static final Currency LAYER;
    public static final Currency LBRDA;
    public static final Currency LCX;
    public static final Currency LDO;
    public static final Currency LEO;
    public static final Currency LINK;
    public static final Currency LLY;
    public static final Currency LMT;
    public static final Currency LMWR;
    public static final Currency LOOM;
    public static final Currency LPT;
    public static final Currency LQTY;
    public static final Currency LRC;
    public static final Currency LSK;
    public static final Currency LTC;
    public static final Currency LUNA;
    public static final Currency LYFT;
    public static final Currency MAGIC;
    public static final Currency MAGS;
    public static final Currency MANA;
    public static final Currency MARA;
    public static final Currency MASK;
    public static final Currency MATIC;

    /* renamed from: ME */
    public static final Currency f8139ME;
    public static final Currency MEGA;
    public static final Currency MELANIA;
    public static final Currency MELI;
    public static final Currency MEOW;
    public static final Currency META;
    public static final Currency METIS;
    public static final Currency MEW;
    public static final Currency MIOTA;
    public static final Currency MKR;
    public static final Currency MNT;
    public static final Currency MOG;
    public static final Currency MOODENG;
    public static final Currency MORPHO;
    public static final Currency MOVE;

    /* renamed from: MP */
    public static final Currency f8140MP;
    public static final Currency MPLX;
    public static final Currency MRK;
    public static final Currency MRNA;
    public static final Currency MRVL;
    public static final Currency MSFT;
    public static final Currency MSTR;
    public static final Currency MSTY;
    public static final Currency MSTZ;
    public static final Currency MTC;

    /* renamed from: MU */
    public static final Currency f8141MU;
    public static final Currency MXC;
    public static final Currency MYTH;
    public static final Currency NBIS;
    public static final Currency NCLH;
    public static final Currency NEAR;
    public static final Currency NEIRO;
    public static final Currency NEO;
    public static final Currency NET;
    public static final Currency NEXO;
    public static final Currency NFLX;
    public static final Currency NKE;
    public static final Currency NOODLE;
    public static final Currency NOW;

    /* renamed from: NU */
    public static final Currency f8142NU;
    public static final Currency NVD;
    public static final Currency NVDA;
    public static final Currency NVDL;
    public static final Currency NVDU;
    public static final Currency NVDY;
    public static final Currency OCEAN;
    public static final Currency OKLO;
    public static final Currency OKTA;

    /* renamed from: OM */
    public static final Currency f8143OM;
    public static final Currency OMG;
    public static final Currency ONDO;
    public static final Currency ONE;
    public static final Currency ONEINCH;

    /* renamed from: OP */
    public static final Currency f8144OP;
    public static final Currency OPAI;
    public static final Currency OPENL;
    public static final Currency OPENW;
    public static final Currency OPENZ;
    public static final Currency ORCA;
    public static final Currency ORCL;
    public static final Currency ORDI;
    public static final Currency OSCR;
    public static final Currency OUNZ;
    public static final Currency OXY;
    public static final Currency PAAL;
    public static final Currency PANW;
    public static final Currency PAXG;
    public static final Currency PENDLE;
    public static final Currency PENGU;
    public static final Currency PEP;
    public static final Currency PEPE;
    public static final Currency PERP;
    public static final Currency PFE;
    public static final Currency PHA;
    public static final Currency PINS;
    public static final Currency PLA;
    public static final Currency PLS;
    public static final Currency PLTR;
    public static final Currency PLUME;
    public static final Currency PNUT;
    public static final Currency POL;
    public static final Currency POLS;
    public static final Currency PONKE;
    public static final Currency POPCAT;
    public static final Currency PRIME;
    public static final Currency PYPL;
    public static final Currency PYR;
    public static final Currency PYTH;
    public static final Currency PYUSD;
    public static final Currency QCOM;
    public static final Currency QLD;
    public static final Currency QNT;
    public static final Currency QQQ;
    public static final Currency QQQM;
    public static final Currency QRDO;
    public static final Currency QTUM;
    public static final Currency QUARTZ;
    public static final Currency QWAN;
    public static final Currency RAD;
    public static final Currency RANP;
    public static final Currency RARI;
    public static final Currency RAY;
    public static final Currency RBLX;
    public static final Currency RDDT;
    public static final Currency RDNT;
    public static final Currency RED;
    public static final Currency REN;
    public static final Currency RENDER;
    public static final Currency REQ;
    public static final Currency RIOT;
    public static final Currency RIVN;
    public static final Currency RKT;
    public static final Currency RLC;
    public static final Currency RLUSD;
    public static final Currency RLY;
    public static final Currency RNDR;
    public static final Currency ROKU;
    public static final Currency ROOT;
    public static final Currency ROUTE;
    public static final Currency RPL;
    public static final Currency RUN;
    public static final Currency RUNE;
    public static final Currency RWM;

    /* renamed from: S */
    public static final Currency f8145S;
    public static final Currency SAFE;
    public static final Currency SAFEMOON;
    public static final Currency SAND;
    public static final Currency SBIT;
    public static final Currency SBUX;
    public static final Currency SCHD;
    public static final Currency SDS;
    public static final Currency SEI;
    public static final Currency SGB;
    public static final Currency SGOL;
    public static final Currency SGOV;
    public static final Currency SHIB;
    public static final Currency SHOP;
    public static final Currency SIMPSON;
    public static final Currency SKL;
    public static final Currency SLP;
    public static final Currency SLV;
    public static final Currency SMCI;
    public static final Currency SMCX;
    public static final Currency SMH;
    public static final Currency SMR;
    public static final Currency SMT;
    public static final Currency SNAP;
    public static final Currency SNOW;
    public static final Currency SNX;
    public static final Currency SOFI;
    public static final Currency SOL;
    public static final Currency SOXL;
    public static final Currency SOXS;
    public static final Currency SPACEX;
    public static final Currency SPELL;
    public static final Currency SPOT;
    public static final Currency SPX;
    public static final Currency SPXL;
    public static final Currency SPXS;
    public static final Currency SPXU;
    public static final Currency SPY;
    public static final Currency SQQQ;
    public static final Currency SRPT;
    public static final Currency STETH;
    public static final Currency STG;
    public static final Currency STO;
    public static final Currency STOP;
    public static final Currency STORJ;
    public static final Currency STRK;
    public static final Currency STX;
    public static final Currency SUI;
    public static final Currency SUPER;
    public static final Currency SUSHI;
    public static final Currency SYRUP;

    /* renamed from: T */
    public static final Currency f8146T;
    public static final Currency TECL;
    public static final Currency TEM;
    public static final Currency TGT;
    public static final Currency THETA;
    public static final Currency TIA;
    public static final Currency TLT;
    public static final Currency TMDX;
    public static final Currency TMF;
    public static final Currency TMUS;
    public static final Currency TNA;
    public static final Currency TNSR;
    public static final Currency TON;
    public static final Currency TOSHI;
    public static final Currency TQQQ;
    public static final Currency TRAC;
    public static final Currency TRNR;
    public static final Currency TRUF;
    public static final Currency TRUMP;
    public static final Currency TRX;
    public static final Currency TSLA;
    public static final Currency TSLL;
    public static final Currency TSLY;
    public static final Currency TTD;
    public static final Currency TTWO;
    public static final Currency TURBO;
    public static final Currency TUSD;
    public static final Currency TZA;

    /* renamed from: U */
    public static final Currency f8147U;
    public static final Currency UAL;
    public static final Currency UBER;
    public static final Currency UMA;
    public static final Currency UNH;
    public static final Currency UNI;
    public static final Currency UPRO;
    public static final Currency UPS;
    public static final Currency UPST;
    public static final Currency USD;
    public static final Currency USDC;
    public static final Currency USDP;
    public static final Currency USDT;
    public static final Currency USFR;
    public static final Currency UST;
    public static final Currency VCHF;
    public static final Currency VET;
    public static final Currency VEUR;
    public static final Currency VEXT;
    public static final Currency VGT;
    public static final Currency VINO;
    public static final Currency VIRTUAL;
    public static final Currency VOO;
    public static final Currency VRT;
    public static final Currency VST;
    public static final Currency VTI;
    public static final Currency VUG;
    public static final Currency VVV;
    public static final Currency VXX;

    /* renamed from: VZ */
    public static final Currency f8148VZ;

    /* renamed from: W */
    public static final Currency f8149W;
    public static final Currency WAMPL;
    public static final Currency WAVES;
    public static final Currency WBTC;
    public static final Currency WDAY;
    public static final Currency WECAN;
    public static final Currency WEEK;
    public static final Currency WELL;
    public static final Currency WEN;
    public static final Currency WETH;
    public static final Currency WIF;
    public static final Currency WLD;
    public static final Currency WLFI;
    public static final Currency WMT;
    public static final Currency WOO;
    public static final Currency XAI;
    public static final Currency XCHNG;
    public static final Currency XCN;
    public static final Currency XDC;
    public static final Currency XEM;
    public static final Currency XLM;
    public static final Currency XMR;
    public static final Currency XOM;
    public static final Currency XPL;
    public static final Currency XRP;
    public static final Currency XSGD;
    public static final Currency XTZ;
    public static final Currency XYO;
    public static final Currency XYZ;
    public static final Currency YFI;
    public static final Currency YGG;
    public static final Currency YMAX;
    public static final Currency YOM;
    public static final Currency ZEC;
    public static final Currency ZETA;
    public static final Currency ZEUS;
    public static final Currency ZIL;
    public static final Currency ZIM;

    /* renamed from: ZK */
    public static final Currency f8150ZK;
    public static final Currency ZKJ;
    public static final Currency ZORA;
    public static final Currency ZRO;
    public static final Currency ZRX;
    public static final Currency ZUSD;
    public static final Currency ZVZZT;
    private final int value;

    private static final /* synthetic */ Currency[] $values() {
        return new Currency[]{CURRENCY_UNSPECIFIED, BTC, BCH, BSV, LTC, DOGE, ETH, ETC, USD, USDT, XRP, QTUM, NEO, XMR, DASH, BTG, LSK, OMG, BNB, USDC, LUNA, XLM, ZEC, SOL, ADA, AVAX, DOT, BUSD, UST, CRO, DAI, ATOM, NEAR, UNI, FTT, TRX, ALGO, LEO, FTM, BTCB, HBAR, ICP, SAND, FIL, AXS, VET, EGLD, THETA, KLAY, XTZ, HNT, FLOW, AAVE, LINK, LRC, SHIB, COMP, MATIC, MANA, CELO, BAL, WETH, ZRX, RUNE, PAXG, CAKE, USDP, STX, APE, YFI, BAT, GUSD, ENJ, WBTC, DCR, XEM, MKR, TUSD, DFI, RARI, WAVES, CRV, FRAX, GMT, GRT, MIOTA, ETHW, LDO, CELR, LOOM, GHST, PEPE, CVX, HOPR, EOS, EUROC, FUN, OCEAN, SNX, SUSHI, ARB, BONK, f8144OP, TIA, WIF, COQ, JUP, TON, f8149W, STETH, f8150ZK, ZRO, EUR, IMX, RENDER, FLOKI, EIGEN, ENA, EURC, AKT, PYUSD, POL, AAPL, TSLA, f8145S, TRUMP, PENGU, ONDO, INJ, JASMY, STRK, PYTH, STO, COON, RANP, ALTL, AEC, STOP, POPCAT, VIRTUAL, PNUT, MEW, SIMPSON, VINO, YOM, BERA, AMEX, KCT, XAI, ATC, HOOD, AMZN, GME, AMD, META, CRWD, COIN, MSTR, GOOG, PLTR, QNT, AKITA, SAFEMOON, BABYUNI, MEGA, ONEINCH, AMP, AUDIO, BAND, BLUR, BNT, BOME, CHZ, COREUM, CSPR, CTSI, CVC, CXT, CTX, DGLD, DYDX, ENS, EURCV, EURT, FET, FLR, GALA, GYEN, KNC, LMWR, MELANIA, MOG, NEXO, PERP, RAD, RLUSD, RLY, SEI, SGB, SKL, SLP, SMT, SPELL, STORJ, SUI, SYRUP, TRAC, TRUF, UMA, VCHF, VEUR, VEXT, WEN, WOO, WECAN, XCHNG, XDC, XSGD, ZETA, ZUSD, MOODENG, GLUB, NOODLE, PLS, TURBO, GMXP, SDS, MTC, TMDX, ELON, IVV, HMND, HONEY, LAYER, GLMR, f8138KO, SPOT, SMCX, GIGA, USFR, f8148VZ, IAU, ARPA, UAL, RAY, f8139ME, MRVL, HOT, UPS, f8132BA, DEPRECATED_EUROC, GEV, TZA, GAL, LMT, f8135GE, CONY, BIO, CELH, IOST, ZEUS, GNO, SPXU, SCHD, SLV, RPL, PLA, WAMPL, ROOT, KAVA, PINS, MOVE, SOXL, INTR, INDEX, CVS, AVGO, WLD, BRETT, PANW, WDAY, SNAP, BOBA, BABYDOGE, MASK, KHC, ORCL, RDDT, INTC, TMF, ANKR, RIVN, PRIME, MORPHO, LYFT, EUL, XYO, RKT, INOD, RBLX, VTI, POLS, BEAM, AAL, MYTH, JNJ, SRPT, PHA, FARTCOIN, QCOM, ABNB, KGC, AIOZ, JEPQ, TGT, TEM, CAVA, PFE, f8147U, LQTY, DOGINME, f8130AI, SNOW, f8137IO, CKB, f8142NU, TQQQ, KAP, HOOK, RNDR, VUG, ACS, ROUTE, MRNA, SHOP, f8131B3, UNH, ARC, DAL, ZKJ, MAGS, MSTZ, BTRST, SUPER, OKTA, ZIL, DKS, f8134F, CLF, ROKU, BIGTIME, GRASS, AVA, BIL, AFRM, TNA, AMPL, GOAT, IBIT, AIXBT, ONE, GAP, GOOGL, VRT, CHEX, HUM, TTWO, f8136HD, VXX, RDNT, SMCI, CFX, SOXS, INDP, PAAL, ENPH, CLSK, KEY, AGIX, JTO, ACE, PYPL, AI16Z, CSCO, SPXS, TECL, FXS, ETHFI, ALCH, LLY, PYR, IBKR, AERO, LPT, ARKM, ACX, TRNR, BICO, MSTY, CEG, BITU, VGT, DECK, WEEK, NKE, TTD, AMAT, VOO, SBUX, AIDOGE, IWM, CVNA, RWM, BROS, OKLO, FBTC, KOLD, SOFI, OUNZ, ZVZZT, MSFT, f8143OM, TOSHI, ORDI, DOCS, UPRO, OSCR, GDX, APP, MXC, PEP, CFG, API3, NFLX, REQ, ELF, YGG, DKNG, PONKE, PENDLE, ALT, DELL, IAUM, NVD, REN, KCS, CLS, CCL, ANET, NVDL, VST, VVV, FSLR, CLANKER, SPXL, OPAI, f8141MU, CONL, STG, HUT, LABU, RED, PLUME, MRK, IOTX, DJT, AYRO, FAI, HFT, NBIS, MNT, BITO, JPM, IONQ, KP3R, COW, GLD, LCX, SQQQ, f8140MP, ORCA, SGOV, KAITO, RIOT, NOW, MARA, MEOW, MPLX, MELI, ZIM, QRDO, APT, XYZ, NVDA, MAGIC, ALEX, COST, QUARTZ, XOM, SPACEX, QQQ, ACH, ATH, DIS, SAFE, TLT, OXY, RLC, GEOD, KMNO, COOKIE, UBER, KWEB, ALAB, GNLN, CRCL, BITI, SPY, QQQM, GRIFFAIN, WELL, JEPI, SBIT, NVDU, ETHA, TMUS, DRIFT, NVDY, SMH, FAZ, f8146T, AAAU, LABD, AXL, SPX, QWAN, GMX, TSLY, QLD, YMAX, TSLL, CMG, CRM, BAC, RUN, HIMS, KSM, SGOL, NEIRO, ARKB, f8133EL, NCLH, NET, SMR, METIS, UPST, TNSR, WMT, LBRDA, ARKG, GLIBA, GLBAV, WLFI, ZORA, ASTER, XPL, HYPE, AVNT, OPENL, OPENW, OPENZ, XCN};
    }

    @JvmStatic
    public static final Currency fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<Currency> getEntries() {
        return $ENTRIES;
    }

    private Currency(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final Currency currency = new Currency("CURRENCY_UNSPECIFIED", 0, 0);
        CURRENCY_UNSPECIFIED = currency;
        BTC = new Currency(ApiCreateUserRequest.SYMBOL_FOR_CRYPTO, 1, 1);
        BCH = new Currency("BCH", 2, 2);
        BSV = new Currency("BSV", 3, 3);
        LTC = new Currency("LTC", 4, 4);
        DOGE = new Currency("DOGE", 5, 5);
        ETH = new Currency("ETH", 6, 6);
        ETC = new Currency("ETC", 7, 7);
        USD = new Currency("USD", 8, 8);
        USDT = new Currency("USDT", 9, 9);
        XRP = new Currency("XRP", 10, 10);
        QTUM = new Currency("QTUM", 11, 11);
        NEO = new Currency("NEO", 12, 12);
        XMR = new Currency("XMR", 13, 13);
        DASH = new Currency("DASH", 14, 14);
        BTG = new Currency("BTG", 15, 15);
        LSK = new Currency("LSK", 16, 16);
        OMG = new Currency("OMG", 17, 17);
        BNB = new Currency("BNB", 18, 18);
        USDC = new Currency("USDC", 19, 19);
        LUNA = new Currency("LUNA", 20, 20);
        XLM = new Currency("XLM", 21, 21);
        ZEC = new Currency("ZEC", 22, 22);
        SOL = new Currency("SOL", 23, 23);
        ADA = new Currency("ADA", 24, 24);
        AVAX = new Currency("AVAX", 25, 25);
        DOT = new Currency("DOT", 26, 26);
        BUSD = new Currency("BUSD", 27, 27);
        UST = new Currency("UST", 28, 28);
        CRO = new Currency("CRO", 29, 29);
        DAI = new Currency("DAI", 30, 30);
        ATOM = new Currency("ATOM", 31, 31);
        NEAR = new Currency("NEAR", 32, 32);
        UNI = new Currency("UNI", 33, 33);
        FTT = new Currency("FTT", 34, 34);
        TRX = new Currency("TRX", 35, 35);
        ALGO = new Currency("ALGO", 36, 36);
        LEO = new Currency("LEO", 37, 37);
        FTM = new Currency("FTM", 38, 38);
        BTCB = new Currency("BTCB", 39, 39);
        HBAR = new Currency("HBAR", 40, 40);
        ICP = new Currency("ICP", 41, 41);
        SAND = new Currency("SAND", 42, 42);
        FIL = new Currency("FIL", 43, 43);
        AXS = new Currency("AXS", 44, 44);
        VET = new Currency("VET", 45, 45);
        EGLD = new Currency("EGLD", 46, 46);
        THETA = new Currency("THETA", 47, 47);
        KLAY = new Currency("KLAY", 48, 48);
        XTZ = new Currency("XTZ", 49, 49);
        HNT = new Currency("HNT", 50, 50);
        FLOW = new Currency("FLOW", 51, 51);
        AAVE = new Currency("AAVE", 52, 52);
        LINK = new Currency("LINK", 53, 53);
        LRC = new Currency("LRC", 54, 54);
        SHIB = new Currency("SHIB", 55, 55);
        COMP = new Currency("COMP", 56, 56);
        MATIC = new Currency("MATIC", 57, 57);
        MANA = new Currency("MANA", 58, 58);
        CELO = new Currency("CELO", 59, 59);
        BAL = new Currency("BAL", 60, 60);
        WETH = new Currency("WETH", 61, 61);
        ZRX = new Currency("ZRX", 62, 62);
        RUNE = new Currency("RUNE", 63, 63);
        PAXG = new Currency("PAXG", 64, 64);
        CAKE = new Currency("CAKE", 65, 65);
        USDP = new Currency("USDP", 66, 66);
        STX = new Currency("STX", 67, 67);
        APE = new Currency("APE", 68, 68);
        YFI = new Currency("YFI", 69, 69);
        BAT = new Currency("BAT", 70, 70);
        GUSD = new Currency("GUSD", 71, 71);
        ENJ = new Currency("ENJ", 72, 72);
        WBTC = new Currency("WBTC", 73, 73);
        DCR = new Currency("DCR", 74, 74);
        XEM = new Currency("XEM", 75, 75);
        MKR = new Currency("MKR", 76, 76);
        TUSD = new Currency("TUSD", 77, 77);
        DFI = new Currency("DFI", 78, 78);
        RARI = new Currency("RARI", 79, 79);
        WAVES = new Currency("WAVES", 80, 80);
        CRV = new Currency("CRV", 81, 81);
        FRAX = new Currency("FRAX", 82, 82);
        GMT = new Currency("GMT", 83, 83);
        GRT = new Currency("GRT", 84, 84);
        MIOTA = new Currency("MIOTA", 85, 85);
        ETHW = new Currency("ETHW", 86, 86);
        LDO = new Currency("LDO", 87, 87);
        CELR = new Currency("CELR", 88, 88);
        LOOM = new Currency("LOOM", 89, 89);
        GHST = new Currency("GHST", 90, 90);
        PEPE = new Currency("PEPE", 91, 91);
        CVX = new Currency("CVX", 92, 92);
        HOPR = new Currency("HOPR", 93, 93);
        EOS = new Currency("EOS", 94, 94);
        EUROC = new Currency("EUROC", 95, 95);
        FUN = new Currency("FUN", 96, 96);
        OCEAN = new Currency("OCEAN", 97, 97);
        SNX = new Currency("SNX", 98, 98);
        SUSHI = new Currency("SUSHI", 99, 99);
        ARB = new Currency("ARB", 100, 100);
        BONK = new Currency("BONK", 101, 101);
        f8144OP = new Currency("OP", 102, 102);
        TIA = new Currency("TIA", 103, 103);
        WIF = new Currency("WIF", 104, 104);
        COQ = new Currency("COQ", 105, 105);
        JUP = new Currency("JUP", 106, 106);
        TON = new Currency("TON", 107, 107);
        f8149W = new Currency("W", 108, 108);
        STETH = new Currency("STETH", 109, 109);
        f8150ZK = new Currency("ZK", 110, 110);
        ZRO = new Currency("ZRO", 111, 111);
        EUR = new Currency("EUR", 112, 112);
        IMX = new Currency("IMX", 113, 113);
        RENDER = new Currency("RENDER", 114, 114);
        FLOKI = new Currency("FLOKI", 115, 115);
        EIGEN = new Currency("EIGEN", 116, 116);
        ENA = new Currency("ENA", 117, 117);
        EURC = new Currency("EURC", 118, 118);
        AKT = new Currency("AKT", 119, 119);
        PYUSD = new Currency("PYUSD", 120, 120);
        POL = new Currency("POL", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE);
        AAPL = new Currency("AAPL", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
        TSLA = new Currency("TSLA", 123, 123);
        f8145S = new Currency("S", EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
        TRUMP = new Currency("TRUMP", 125, 125);
        PENGU = new Currency("PENGU", EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        ONDO = new Currency("ONDO", EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE);
        INJ = new Currency("INJ", 128, 128);
        JASMY = new Currency("JASMY", EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE);
        STRK = new Currency("STRK", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE);
        PYTH = new Currency("PYTH", 131, 131);
        STO = new Currency("STO", EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE);
        COON = new Currency("COON", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE);
        RANP = new Currency("RANP", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE);
        ALTL = new Currency("ALTL", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE);
        AEC = new Currency("AEC", 136, 136);
        STOP = new Currency("STOP", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE);
        POPCAT = new Currency("POPCAT", EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE);
        VIRTUAL = new Currency("VIRTUAL", EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE);
        PNUT = new Currency("PNUT", EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE);
        MEW = new Currency("MEW", EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE, EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE);
        SIMPSON = new Currency("SIMPSON", EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE, EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE);
        VINO = new Currency("VINO", EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE, EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE);
        YOM = new Currency("YOM", 144, 144);
        BERA = new Currency("BERA", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE);
        AMEX = new Currency("AMEX", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE);
        KCT = new Currency("KCT", 147, 147);
        XAI = new Currency("XAI", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE);
        ATC = new Currency("ATC", EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE);
        HOOD = new Currency("HOOD", 150, 150);
        AMZN = new Currency("AMZN", 151, 151);
        GME = new Currency("GME", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE);
        AMD = new Currency("AMD", EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE);
        META = new Currency("META", EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE);
        CRWD = new Currency("CRWD", 155, 155);
        COIN = new Currency("COIN", 156, 156);
        MSTR = new Currency("MSTR", EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE);
        GOOG = new Currency("GOOG", EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE);
        PLTR = new Currency("PLTR", EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE);
        QNT = new Currency("QNT", EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
        AKITA = new Currency("AKITA", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE);
        SAFEMOON = new Currency("SAFEMOON", EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE);
        BABYUNI = new Currency("BABYUNI", EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE);
        MEGA = new Currency("MEGA", EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE);
        ONEINCH = new Currency("ONEINCH", 165, 165);
        AMP = new Currency("AMP", EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE);
        AUDIO = new Currency("AUDIO", 167, 167);
        BAND = new Currency("BAND", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
        BLUR = new Currency("BLUR", EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE);
        BNT = new Currency("BNT", EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE);
        BOME = new Currency("BOME", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE);
        CHZ = new Currency("CHZ", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE);
        COREUM = new Currency("COREUM", EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE);
        CSPR = new Currency("CSPR", EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE);
        CTSI = new Currency("CTSI", EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE);
        CVC = new Currency("CVC", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE);
        CXT = new Currency("CXT", EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE);
        CTX = new Currency("CTX", EnumC7081g.f2773x8d9721ad, EnumC7081g.f2773x8d9721ad);
        DGLD = new Currency("DGLD", EnumC7081g.f2780x600b66fe, EnumC7081g.f2780x600b66fe);
        DYDX = new Currency("DYDX", EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE);
        ENS = new Currency("ENS", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE);
        EURCV = new Currency("EURCV", 182, 182);
        EURT = new Currency("EURT", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE);
        FET = new Currency("FET", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE);
        FLR = new Currency("FLR", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE);
        GALA = new Currency("GALA", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE);
        GYEN = new Currency("GYEN", EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE);
        KNC = new Currency("KNC", 188, 188);
        LMWR = new Currency("LMWR", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE);
        MELANIA = new Currency("MELANIA", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE);
        MOG = new Currency("MOG", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE);
        NEXO = new Currency("NEXO", 192, 192);
        PERP = new Currency("PERP", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE);
        RAD = new Currency("RAD", EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE, EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE);
        RLUSD = new Currency("RLUSD", EnumC7081g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, EnumC7081g.SDK_ASSET_ICON_ALERT_WARNING_VALUE);
        RLY = new Currency("RLY", EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE);
        SEI = new Currency("SEI", EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE, EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE);
        SGB = new Currency("SGB", EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE, EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE);
        SKL = new Currency("SKL", EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE, EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE);
        SLP = new Currency("SLP", 200, 200);
        SMT = new Currency("SMT", 201, 201);
        SPELL = new Currency("SPELL", 202, 202);
        STORJ = new Currency("STORJ", EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE, EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE);
        SUI = new Currency("SUI", 204, 204);
        SYRUP = new Currency("SYRUP", EnumC7081g.SDK_ASSET_ICON_CLIPBOARD_VALUE, EnumC7081g.SDK_ASSET_ICON_CLIPBOARD_VALUE);
        TRAC = new Currency("TRAC", EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE, EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE);
        TRUF = new Currency("TRUF", EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE, EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE);
        UMA = new Currency("UMA", EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE, EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE);
        VCHF = new Currency("VCHF", EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE, EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE);
        VEUR = new Currency("VEUR", EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE);
        VEXT = new Currency("VEXT", 211, 211);
        WEN = new Currency("WEN", EnumC7081g.SDK_ASSET_ICON_OVERRIDE_VALUE, EnumC7081g.SDK_ASSET_ICON_OVERRIDE_VALUE);
        WOO = new Currency("WOO", EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE, EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE);
        WECAN = new Currency("WECAN", EnumC7081g.SDK_ASSET_ICON_PIN_VALUE, EnumC7081g.SDK_ASSET_ICON_PIN_VALUE);
        XCHNG = new Currency("XCHNG", EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE, EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE);
        XDC = new Currency("XDC", EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
        XSGD = new Currency("XSGD", EnumC7081g.SDK_ASSET_ICON_PROGRESS_VALUE, EnumC7081g.SDK_ASSET_ICON_PROGRESS_VALUE);
        ZETA = new Currency("ZETA", EnumC7081g.SDK_ASSET_ICON_QUESTION_VALUE, EnumC7081g.SDK_ASSET_ICON_QUESTION_VALUE);
        ZUSD = new Currency("ZUSD", EnumC7081g.SDK_ASSET_ICON_REJECTED_REC_VALUE, EnumC7081g.SDK_ASSET_ICON_REJECTED_REC_VALUE);
        MOODENG = new Currency("MOODENG", EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE);
        GLUB = new Currency("GLUB", EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE, EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE);
        NOODLE = new Currency("NOODLE", EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
        PLS = new Currency("PLS", EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
        TURBO = new Currency("TURBO", 224, 224);
        GMXP = new Currency("GMXP", 225, 225);
        SDS = new Currency("SDS", EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE);
        MTC = new Currency("MTC", EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE);
        TMDX = new Currency("TMDX", EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE);
        ELON = new Currency("ELON", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE);
        IVV = new Currency("IVV", EnumC7081g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE);
        HMND = new Currency("HMND", EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE);
        HONEY = new Currency("HONEY", EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
        LAYER = new Currency("LAYER", EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE);
        GLMR = new Currency("GLMR", EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE);
        f8138KO = new Currency("KO", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE);
        SPOT = new Currency("SPOT", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE);
        SMCX = new Currency("SMCX", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE);
        GIGA = new Currency("GIGA", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE);
        USFR = new Currency("USFR", 239, 239);
        f8148VZ = new Currency("VZ", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
        IAU = new Currency("IAU", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE);
        ARPA = new Currency("ARPA", EnumC7081g.f2778x3356acf6, EnumC7081g.f2778x3356acf6);
        UAL = new Currency("UAL", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE);
        RAY = new Currency("RAY", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE);
        f8139ME = new Currency("ME", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE);
        MRVL = new Currency("MRVL", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE);
        HOT = new Currency("HOT", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE);
        UPS = new Currency("UPS", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
        f8132BA = new Currency("BA", EnumC7081g.f2779x59907a3d, EnumC7081g.f2779x59907a3d);
        DEPRECATED_EUROC = new Currency("DEPRECATED_EUROC", 250, 250);
        GEV = new Currency("GEV", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE);
        TZA = new Currency("TZA", EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
        GAL = new Currency("GAL", EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
        LMT = new Currency("LMT", EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
        f8135GE = new Currency("GE", 255, 255);
        CONY = new Currency("CONY", 256, 256);
        BIO = new Currency("BIO", EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE, EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
        CELH = new Currency("CELH", EnumC7081g.SDK_ASSET_HEADER_BOLT_VALUE, EnumC7081g.SDK_ASSET_HEADER_BOLT_VALUE);
        IOST = new Currency("IOST", EnumC7081g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE, EnumC7081g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE);
        ZEUS = new Currency("ZEUS", EnumC7081g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE, EnumC7081g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE);
        GNO = new Currency("GNO", EnumC7081g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE);
        SPXU = new Currency("SPXU", EnumC7081g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE);
        SCHD = new Currency("SCHD", EnumC7081g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE, EnumC7081g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE);
        SLV = new Currency("SLV", EnumC7081g.SDK_ASSET_ICON_PLAID_LOGO_VALUE, EnumC7081g.SDK_ASSET_ICON_PLAID_LOGO_VALUE);
        RPL = new Currency("RPL", EnumC7081g.SDK_ASSET_HEADER_SHIELD_VALUE, EnumC7081g.SDK_ASSET_HEADER_SHIELD_VALUE);
        PLA = new Currency("PLA", EnumC7081g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE);
        WAMPL = new Currency("WAMPL", EnumC7081g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE, EnumC7081g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE);
        ROOT = new Currency("ROOT", EnumC7081g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE, EnumC7081g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE);
        KAVA = new Currency("KAVA", EnumC7081g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE, EnumC7081g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE);
        PINS = new Currency("PINS", EnumC7081g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE, EnumC7081g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE);
        MOVE = new Currency("MOVE", 271, 271);
        SOXL = new Currency("SOXL", EnumC7081g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE);
        INTR = new Currency("INTR", EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE);
        INDEX = new Currency("INDEX", EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE);
        CVS = new Currency("CVS", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE);
        AVGO = new Currency("AVGO", EnumC7081g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE);
        WLD = new Currency("WLD", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE);
        BRETT = new Currency("BRETT", EnumC7081g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, EnumC7081g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE);
        PANW = new Currency("PANW", EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE);
        WDAY = new Currency("WDAY", 280, 280);
        SNAP = new Currency("SNAP", EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_VALUE);
        BOBA = new Currency("BOBA", EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE);
        BABYDOGE = new Currency("BABYDOGE", 283, 283);
        MASK = new Currency("MASK", EnumC7081g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE);
        KHC = new Currency("KHC", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE);
        ORCL = new Currency("ORCL", EnumC7081g.f2777x89a9e432, EnumC7081g.f2777x89a9e432);
        RDDT = new Currency("RDDT", EnumC7081g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE);
        INTC = new Currency("INTC", 288, 288);
        TMF = new Currency("TMF", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE);
        ANKR = new Currency("ANKR", EnumC7081g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE);
        RIVN = new Currency("RIVN", EnumC7081g.f2776x87e624cb, EnumC7081g.f2776x87e624cb);
        PRIME = new Currency("PRIME", EnumC7081g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE);
        MORPHO = new Currency("MORPHO", EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE);
        LYFT = new Currency("LYFT", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE);
        EUL = new Currency("EUL", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE);
        XYO = new Currency("XYO", EnumC7081g.SDK_ASSET_LOADING_INDICATOR_VALUE, EnumC7081g.SDK_ASSET_LOADING_INDICATOR_VALUE);
        RKT = new Currency("RKT", EnumC7081g.SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE, EnumC7081g.SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE);
        INOD = new Currency("INOD", EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE);
        RBLX = new Currency("RBLX", EnumC7081g.SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE);
        VTI = new Currency("VTI", 300, 300);
        POLS = new Currency("POLS", EnumC7081g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE);
        BEAM = new Currency("BEAM", 302, 302);
        AAL = new Currency("AAL", EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE);
        MYTH = new Currency("MYTH", EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE, EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE);
        JNJ = new Currency("JNJ", EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE);
        SRPT = new Currency("SRPT", EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE);
        PHA = new Currency("PHA", EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE);
        FARTCOIN = new Currency("FARTCOIN", EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE, EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE);
        QCOM = new Currency("QCOM", EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE);
        ABNB = new Currency("ABNB", EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE, EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE);
        KGC = new Currency("KGC", EnumC7081g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE);
        AIOZ = new Currency("AIOZ", EnumC7081g.f2774x74902ae0, EnumC7081g.f2774x74902ae0);
        JEPQ = new Currency("JEPQ", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE);
        TGT = new Currency("TGT", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE);
        TEM = new Currency("TEM", EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE);
        CAVA = new Currency("CAVA", 316, 316);
        PFE = new Currency("PFE", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE);
        f8147U = new Currency("U", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE);
        LQTY = new Currency("LQTY", EnumC7081g.f2781x2ba65ba3, EnumC7081g.f2781x2ba65ba3);
        DOGINME = new Currency("DOGINME", EnumC7081g.SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE);
        f8130AI = new Currency("AI", EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_LIGHT_VALUE, EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_LIGHT_VALUE);
        SNOW = new Currency("SNOW", EnumC7081g.SDK_ASSET_PLAID_PROFILE_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_PLAID_PROFILE_CIRCLE_VALUE);
        f8137IO = new Currency("IO", EnumC7081g.f2775xbcb7e6f3, EnumC7081g.f2775xbcb7e6f3);
        CKB = new Currency("CKB", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE);
        f8142NU = new Currency(CountryCode.COUNTRY_CODE_NU, EnumC7081g.SDK_ASSET_ICON_REPORT_VALUE, EnumC7081g.SDK_ASSET_ICON_REPORT_VALUE);
        TQQQ = new Currency("TQQQ", EnumC7081g.SDK_ASSET_ICON_STEP_COMPLETE_VALUE, EnumC7081g.SDK_ASSET_ICON_STEP_COMPLETE_VALUE);
        KAP = new Currency("KAP", EnumC7081g.SDK_ASSET_ICON_UPLOAD_VALUE, EnumC7081g.SDK_ASSET_ICON_UPLOAD_VALUE);
        HOOK = new Currency("HOOK", EnumC7081g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE);
        RNDR = new Currency("RNDR", EnumC7081g.SDK_ASSET_ICON_LIGHTNING_FILLED_BLUE_VALUE, EnumC7081g.SDK_ASSET_ICON_LIGHTNING_FILLED_BLUE_VALUE);
        VUG = new Currency("VUG", 330, 330);
        ACS = new Currency("ACS", 331, 331);
        ROUTE = new Currency("ROUTE", 332, 332);
        MRNA = new Currency("MRNA", 333, 333);
        SHOP = new Currency("SHOP", 334, 334);
        f8131B3 = new Currency("B3", 335, 335);
        UNH = new Currency("UNH", WaitlistAnimationConstants.IN_WAITLIST_ANIMATION_END, WaitlistAnimationConstants.IN_WAITLIST_ANIMATION_END);
        ARC = new Currency("ARC", 337, 337);
        DAL = new Currency("DAL", 338, 338);
        ZKJ = new Currency("ZKJ", 339, 339);
        MAGS = new Currency("MAGS", 340, 340);
        MSTZ = new Currency("MSTZ", 341, 341);
        BTRST = new Currency("BTRST", 342, 342);
        SUPER = new Currency("SUPER", 343, 343);
        OKTA = new Currency("OKTA", 344, 344);
        ZIL = new Currency("ZIL", 345, 345);
        DKS = new Currency("DKS", 346, 346);
        f8134F = new Currency("F", 347, 347);
        CLF = new Currency("CLF", 348, 348);
        ROKU = new Currency("ROKU", 349, 349);
        BIGTIME = new Currency("BIGTIME", 350, 350);
        GRASS = new Currency("GRASS", 351, 351);
        AVA = new Currency("AVA", 352, 352);
        BIL = new Currency("BIL", 353, 353);
        AFRM = new Currency("AFRM", 354, 354);
        TNA = new Currency("TNA", 355, 355);
        AMPL = new Currency("AMPL", 356, 356);
        GOAT = new Currency("GOAT", 357, 357);
        IBIT = new Currency("IBIT", 358, 358);
        AIXBT = new Currency("AIXBT", 359, 359);
        ONE = new Currency("ONE", 360, 360);
        GAP = new Currency("GAP", 361, 361);
        GOOGL = new Currency("GOOGL", 362, 362);
        VRT = new Currency("VRT", 363, 363);
        CHEX = new Currency("CHEX", 364, 364);
        HUM = new Currency("HUM", 365, 365);
        TTWO = new Currency("TTWO", 366, 366);
        f8136HD = new Currency("HD", 367, 367);
        VXX = new Currency("VXX", 368, 368);
        RDNT = new Currency("RDNT", 369, 369);
        SMCI = new Currency("SMCI", 370, 370);
        CFX = new Currency("CFX", 371, 371);
        SOXS = new Currency("SOXS", 372, 372);
        INDP = new Currency("INDP", 373, 373);
        PAAL = new Currency("PAAL", 374, 374);
        ENPH = new Currency("ENPH", 375, 375);
        CLSK = new Currency("CLSK", 376, 376);
        KEY = new Currency("KEY", 377, 377);
        AGIX = new Currency("AGIX", 378, 378);
        JTO = new Currency("JTO", 379, 379);
        ACE = new Currency("ACE", 380, 380);
        PYPL = new Currency("PYPL", 381, 381);
        AI16Z = new Currency("AI16Z", 382, 382);
        CSCO = new Currency("CSCO", 383, 383);
        SPXS = new Currency("SPXS", 384, 384);
        TECL = new Currency("TECL", 385, 385);
        FXS = new Currency("FXS", 386, 386);
        ETHFI = new Currency("ETHFI", 387, 387);
        ALCH = new Currency("ALCH", 388, 388);
        LLY = new Currency("LLY", 389, 389);
        PYR = new Currency("PYR", 390, 390);
        IBKR = new Currency("IBKR", 391, 391);
        AERO = new Currency("AERO", 392, 392);
        LPT = new Currency("LPT", 393, 393);
        ARKM = new Currency("ARKM", 394, 394);
        ACX = new Currency("ACX", 395, 395);
        TRNR = new Currency("TRNR", WaitlistAnimationConstants.LEFT_YAW_START, WaitlistAnimationConstants.LEFT_YAW_START);
        BICO = new Currency("BICO", 397, 397);
        MSTY = new Currency("MSTY", 398, 398);
        CEG = new Currency("CEG", 399, 399);
        BITU = new Currency("BITU", 400, 400);
        VGT = new Currency("VGT", 401, 401);
        DECK = new Currency("DECK", 402, 402);
        WEEK = new Currency("WEEK", HttpStatusCode.FORBIDDEN, HttpStatusCode.FORBIDDEN);
        NKE = new Currency("NKE", 404, 404);
        TTD = new Currency("TTD", 405, 405);
        AMAT = new Currency("AMAT", 406, 406);
        VOO = new Currency("VOO", 407, 407);
        SBUX = new Currency("SBUX", 408, 408);
        AIDOGE = new Currency("AIDOGE", 409, 409);
        IWM = new Currency("IWM", HttpStatusCode.GONE, HttpStatusCode.GONE);
        CVNA = new Currency("CVNA", 411, 411);
        RWM = new Currency("RWM", 412, 412);
        BROS = new Currency("BROS", 413, 413);
        OKLO = new Currency("OKLO", 414, 414);
        FBTC = new Currency("FBTC", 415, 415);
        KOLD = new Currency("KOLD", 416, 416);
        SOFI = new Currency("SOFI", 417, 417);
        OUNZ = new Currency("OUNZ", 418, 418);
        ZVZZT = new Currency("ZVZZT", 419, 419);
        MSFT = new Currency("MSFT", 420, 420);
        f8143OM = new Currency("OM", 421, 421);
        TOSHI = new Currency("TOSHI", 422, 422);
        ORDI = new Currency("ORDI", 423, 423);
        DOCS = new Currency("DOCS", 424, 424);
        UPRO = new Currency("UPRO", CompanyFinancialsSection.BAR_ANIMATION_DURATION, CompanyFinancialsSection.BAR_ANIMATION_DURATION);
        OSCR = new Currency("OSCR", 426, 426);
        GDX = new Currency("GDX", 427, 427);
        APP = new Currency("APP", 428, 428);
        MXC = new Currency("MXC", 429, 429);
        PEP = new Currency("PEP", 430, 430);
        CFG = new Currency("CFG", 431, 431);
        API3 = new Currency("API3", 432, 432);
        NFLX = new Currency("NFLX", 433, 433);
        REQ = new Currency("REQ", 434, 434);
        ELF = new Currency("ELF", 435, 435);
        YGG = new Currency("YGG", 436, 436);
        DKNG = new Currency("DKNG", 437, 437);
        PONKE = new Currency("PONKE", 438, 438);
        PENDLE = new Currency("PENDLE", 439, 439);
        ALT = new Currency("ALT", 440, 440);
        DELL = new Currency("DELL", 441, 441);
        IAUM = new Currency("IAUM", 442, 442);
        NVD = new Currency("NVD", 443, 443);
        REN = new Currency("REN", 444, 444);
        KCS = new Currency("KCS", 445, 445);
        CLS = new Currency("CLS", 446, 446);
        CCL = new Currency("CCL", 447, 447);
        ANET = new Currency("ANET", 448, 448);
        NVDL = new Currency("NVDL", 449, 449);
        VST = new Currency("VST", 450, 450);
        VVV = new Currency("VVV", 451, 451);
        FSLR = new Currency("FSLR", 452, 452);
        CLANKER = new Currency("CLANKER", 453, 453);
        SPXL = new Currency("SPXL", 454, 454);
        OPAI = new Currency("OPAI", 455, 455);
        f8141MU = new Currency("MU", WaitlistAnimationConstants.MIDDLE_YAW_FRAME, WaitlistAnimationConstants.MIDDLE_YAW_FRAME);
        CONL = new Currency("CONL", 457, 457);
        STG = new Currency("STG", 458, 458);
        HUT = new Currency("HUT", 459, 459);
        LABU = new Currency("LABU", 460, 460);
        RED = new Currency("RED", 461, 461);
        PLUME = new Currency("PLUME", 462, 462);
        MRK = new Currency("MRK", 463, 463);
        IOTX = new Currency("IOTX", 464, 464);
        DJT = new Currency("DJT", 465, 465);
        AYRO = new Currency("AYRO", 466, 466);
        FAI = new Currency("FAI", 467, 467);
        HFT = new Currency("HFT", 468, 468);
        NBIS = new Currency("NBIS", 469, 469);
        MNT = new Currency("MNT", 470, 470);
        BITO = new Currency("BITO", 471, 471);
        JPM = new Currency("JPM", 472, 472);
        IONQ = new Currency("IONQ", 473, 473);
        KP3R = new Currency("KP3R", 474, 474);
        COW = new Currency("COW", 475, 475);
        GLD = new Currency("GLD", 476, 476);
        LCX = new Currency("LCX", 477, 477);
        SQQQ = new Currency("SQQQ", 478, 478);
        f8140MP = new Currency(CountryCode.COUNTRY_CODE_MP, 479, 479);
        ORCA = new Currency("ORCA", 480, 480);
        SGOV = new Currency("SGOV", 481, 481);
        KAITO = new Currency("KAITO", 482, 482);
        RIOT = new Currency("RIOT", 483, 483);
        NOW = new Currency("NOW", 484, 484);
        MARA = new Currency("MARA", 485, 485);
        MEOW = new Currency(ProfitAndLossTradeItemFixtures.REQUEST_SYMBOL, 486, 486);
        MPLX = new Currency("MPLX", 487, 487);
        MELI = new Currency("MELI", 488, 488);
        ZIM = new Currency("ZIM", 489, 489);
        QRDO = new Currency("QRDO", 490, 490);
        APT = new Currency("APT", 491, 491);
        XYZ = new Currency("XYZ", 492, 492);
        NVDA = new Currency("NVDA", 493, 493);
        MAGIC = new Currency("MAGIC", 494, 494);
        ALEX = new Currency("ALEX", 495, 495);
        COST = new Currency("COST", 496, 496);
        QUARTZ = new Currency("QUARTZ", 497, 497);
        XOM = new Currency("XOM", 498, 498);
        SPACEX = new Currency("SPACEX", 499, 499);
        QQQ = new Currency("QQQ", 500, 500);
        ACH = new Currency("ACH", 501, 501);
        ATH = new Currency("ATH", com.withpersona.sdk2.inquiry.network.core.HttpStatusCode.BAD_GATEWAY_502, com.withpersona.sdk2.inquiry.network.core.HttpStatusCode.BAD_GATEWAY_502);
        DIS = new Currency("DIS", 503, 503);
        SAFE = new Currency("SAFE", 504, 504);
        TLT = new Currency("TLT", 505, 505);
        OXY = new Currency("OXY", 506, 506);
        RLC = new Currency("RLC", 507, 507);
        GEOD = new Currency("GEOD", 508, 508);
        KMNO = new Currency("KMNO", 509, 509);
        COOKIE = new Currency("COOKIE", 510, 510);
        UBER = new Currency("UBER", 511, 511);
        KWEB = new Currency("KWEB", 512, 512);
        ALAB = new Currency("ALAB", 513, 513);
        GNLN = new Currency("GNLN", 514, 514);
        CRCL = new Currency("CRCL", 515, 515);
        BITI = new Currency("BITI", WaitlistAnimationConstants.RIGHT_YAW_END, WaitlistAnimationConstants.RIGHT_YAW_END);
        SPY = new Currency(OptionChainOnboardingDuxo.DEFAULT, 517, 517);
        QQQM = new Currency("QQQM", 518, 518);
        GRIFFAIN = new Currency("GRIFFAIN", 519, 519);
        WELL = new Currency("WELL", 520, 520);
        JEPI = new Currency("JEPI", HttpStatusCode.DOWNTIME_ERROR, HttpStatusCode.DOWNTIME_ERROR);
        SBIT = new Currency("SBIT", 522, 522);
        NVDU = new Currency("NVDU", 523, 523);
        ETHA = new Currency("ETHA", 524, 524);
        TMUS = new Currency("TMUS", 525, 525);
        DRIFT = new Currency("DRIFT", 526, 526);
        NVDY = new Currency("NVDY", 527, 527);
        SMH = new Currency("SMH", 528, 528);
        FAZ = new Currency("FAZ", 529, 529);
        f8146T = new Currency("T", 530, 530);
        AAAU = new Currency("AAAU", 531, 531);
        LABD = new Currency("LABD", 532, 532);
        AXL = new Currency("AXL", 533, 533);
        SPX = new Currency(OptionChainOnboardingDuxo.UK_DEFAULT, 534, 534);
        QWAN = new Currency("QWAN", 535, 535);
        GMX = new Currency("GMX", 536, 536);
        TSLY = new Currency("TSLY", 537, 537);
        QLD = new Currency("QLD", 538, 538);
        YMAX = new Currency("YMAX", 539, 539);
        TSLL = new Currency("TSLL", 540, 540);
        CMG = new Currency("CMG", 541, 541);
        CRM = new Currency("CRM", 542, 542);
        BAC = new Currency("BAC", 543, 543);
        RUN = new Currency("RUN", 544, 544);
        HIMS = new Currency("HIMS", 545, 545);
        KSM = new Currency("KSM", 546, 546);
        SGOL = new Currency("SGOL", 547, 547);
        NEIRO = new Currency("NEIRO", 548, 548);
        ARKB = new Currency("ARKB", 549, 549);
        f8133EL = new Currency("EL", 550, 550);
        NCLH = new Currency("NCLH", 551, 551);
        NET = new Currency("NET", RhRoomDatabase.MIGRATION_START_VER, RhRoomDatabase.MIGRATION_START_VER);
        SMR = new Currency("SMR", 553, 553);
        METIS = new Currency("METIS", 554, 554);
        UPST = new Currency("UPST", 555, 555);
        TNSR = new Currency("TNSR", 556, 556);
        WMT = new Currency("WMT", 557, 557);
        LBRDA = new Currency("LBRDA", 558, 558);
        ARKG = new Currency("ARKG", 559, 559);
        GLIBA = new Currency("GLIBA", 560, 560);
        GLBAV = new Currency("GLBAV", 561, 561);
        WLFI = new Currency("WLFI", 562, 562);
        ZORA = new Currency("ZORA", 563, 563);
        ASTER = new Currency("ASTER", 564, 564);
        XPL = new Currency("XPL", 565, 565);
        HYPE = new Currency("HYPE", 566, 566);
        AVNT = new Currency("AVNT", 567, 567);
        OPENL = new Currency("OPENL", 568, 568);
        OPENW = new Currency("OPENW", 569, 569);
        OPENZ = new Currency("OPENZ", 570, 570);
        XCN = new Currency("XCN", 571, 571);
        Currency[] currencyArr$values = $values();
        $VALUES = currencyArr$values;
        $ENTRIES = EnumEntries2.enumEntries(currencyArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Currency.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<Currency>(orCreateKotlinClass, syntax, currency) { // from class: rosetta.blockchain.v1.Currency$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public Currency fromValue(int value) {
                return Currency.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: Currency.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/blockchain/v1/Currency$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/blockchain/v1/Currency;", "fromValue", "value", "", "rosetta.blockchain.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Currency fromValue(int value) {
            switch (value) {
                case 0:
                    return Currency.CURRENCY_UNSPECIFIED;
                case 1:
                    return Currency.BTC;
                case 2:
                    return Currency.BCH;
                case 3:
                    return Currency.BSV;
                case 4:
                    return Currency.LTC;
                case 5:
                    return Currency.DOGE;
                case 6:
                    return Currency.ETH;
                case 7:
                    return Currency.ETC;
                case 8:
                    return Currency.USD;
                case 9:
                    return Currency.USDT;
                case 10:
                    return Currency.XRP;
                case 11:
                    return Currency.QTUM;
                case 12:
                    return Currency.NEO;
                case 13:
                    return Currency.XMR;
                case 14:
                    return Currency.DASH;
                case 15:
                    return Currency.BTG;
                case 16:
                    return Currency.LSK;
                case 17:
                    return Currency.OMG;
                case 18:
                    return Currency.BNB;
                case 19:
                    return Currency.USDC;
                case 20:
                    return Currency.LUNA;
                case 21:
                    return Currency.XLM;
                case 22:
                    return Currency.ZEC;
                case 23:
                    return Currency.SOL;
                case 24:
                    return Currency.ADA;
                case 25:
                    return Currency.AVAX;
                case 26:
                    return Currency.DOT;
                case 27:
                    return Currency.BUSD;
                case 28:
                    return Currency.UST;
                case 29:
                    return Currency.CRO;
                case 30:
                    return Currency.DAI;
                case 31:
                    return Currency.ATOM;
                case 32:
                    return Currency.NEAR;
                case 33:
                    return Currency.UNI;
                case 34:
                    return Currency.FTT;
                case 35:
                    return Currency.TRX;
                case 36:
                    return Currency.ALGO;
                case 37:
                    return Currency.LEO;
                case 38:
                    return Currency.FTM;
                case 39:
                    return Currency.BTCB;
                case 40:
                    return Currency.HBAR;
                case 41:
                    return Currency.ICP;
                case 42:
                    return Currency.SAND;
                case 43:
                    return Currency.FIL;
                case 44:
                    return Currency.AXS;
                case 45:
                    return Currency.VET;
                case 46:
                    return Currency.EGLD;
                case 47:
                    return Currency.THETA;
                case 48:
                    return Currency.KLAY;
                case 49:
                    return Currency.XTZ;
                case 50:
                    return Currency.HNT;
                case 51:
                    return Currency.FLOW;
                case 52:
                    return Currency.AAVE;
                case 53:
                    return Currency.LINK;
                case 54:
                    return Currency.LRC;
                case 55:
                    return Currency.SHIB;
                case 56:
                    return Currency.COMP;
                case 57:
                    return Currency.MATIC;
                case 58:
                    return Currency.MANA;
                case 59:
                    return Currency.CELO;
                case 60:
                    return Currency.BAL;
                case 61:
                    return Currency.WETH;
                case 62:
                    return Currency.ZRX;
                case 63:
                    return Currency.RUNE;
                case 64:
                    return Currency.PAXG;
                case 65:
                    return Currency.CAKE;
                case 66:
                    return Currency.USDP;
                case 67:
                    return Currency.STX;
                case SDK_ASSET_ICON_HOME_VALUE:
                    return Currency.APE;
                case 69:
                    return Currency.YFI;
                case 70:
                    return Currency.BAT;
                case SDK_ASSET_ICON_GUIDE_VALUE:
                    return Currency.GUSD;
                case SDK_ASSET_ICON_GLOBE_VALUE:
                    return Currency.ENJ;
                case 73:
                    return Currency.WBTC;
                case 74:
                    return Currency.DCR;
                case 75:
                    return Currency.XEM;
                case 76:
                    return Currency.MKR;
                case 77:
                    return Currency.TUSD;
                case 78:
                    return Currency.DFI;
                case 79:
                    return Currency.RARI;
                case 80:
                    return Currency.WAVES;
                case 81:
                    return Currency.CRV;
                case 82:
                    return Currency.FRAX;
                case 83:
                    return Currency.GMT;
                case 84:
                    return Currency.GRT;
                case 85:
                    return Currency.MIOTA;
                case 86:
                    return Currency.ETHW;
                case 87:
                    return Currency.LDO;
                case 88:
                    return Currency.CELR;
                case 89:
                    return Currency.LOOM;
                case 90:
                    return Currency.GHST;
                case 91:
                    return Currency.PEPE;
                case 92:
                    return Currency.CVX;
                case 93:
                    return Currency.HOPR;
                case 94:
                    return Currency.EOS;
                case 95:
                    return Currency.EUROC;
                case 96:
                    return Currency.FUN;
                case 97:
                    return Currency.OCEAN;
                case 98:
                    return Currency.SNX;
                case 99:
                    return Currency.SUSHI;
                case 100:
                    return Currency.ARB;
                case 101:
                    return Currency.BONK;
                case 102:
                    return Currency.f8144OP;
                case 103:
                    return Currency.TIA;
                case 104:
                    return Currency.WIF;
                case 105:
                    return Currency.COQ;
                case 106:
                    return Currency.JUP;
                case 107:
                    return Currency.TON;
                case 108:
                    return Currency.f8149W;
                case 109:
                    return Currency.STETH;
                case 110:
                    return Currency.f8150ZK;
                case 111:
                    return Currency.ZRO;
                case 112:
                    return Currency.EUR;
                case 113:
                    return Currency.IMX;
                case 114:
                    return Currency.RENDER;
                case 115:
                    return Currency.FLOKI;
                case 116:
                    return Currency.EIGEN;
                case 117:
                    return Currency.ENA;
                case 118:
                    return Currency.EURC;
                case 119:
                    return Currency.AKT;
                case 120:
                    return Currency.PYUSD;
                case SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE:
                    return Currency.POL;
                case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                    return Currency.AAPL;
                case 123:
                    return Currency.TSLA;
                case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                    return Currency.f8145S;
                case 125:
                    return Currency.TRUMP;
                case SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE:
                    return Currency.PENGU;
                case SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE:
                    return Currency.ONDO;
                case 128:
                    return Currency.INJ;
                case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                    return Currency.JASMY;
                case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                    return Currency.STRK;
                case 131:
                    return Currency.PYTH;
                case SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE:
                    return Currency.STO;
                case SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE:
                    return Currency.COON;
                case SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE:
                    return Currency.RANP;
                case SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE:
                    return Currency.ALTL;
                case 136:
                    return Currency.AEC;
                case SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE:
                    return Currency.STOP;
                case SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE:
                    return Currency.POPCAT;
                case SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE:
                    return Currency.VIRTUAL;
                case SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE:
                    return Currency.PNUT;
                case SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE:
                    return Currency.MEW;
                case SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE:
                    return Currency.SIMPSON;
                case SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE:
                    return Currency.VINO;
                case 144:
                    return Currency.YOM;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE:
                    return Currency.BERA;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE:
                    return Currency.AMEX;
                case 147:
                    return Currency.KCT;
                case SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE:
                    return Currency.XAI;
                case SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE:
                    return Currency.ATC;
                case 150:
                    return Currency.HOOD;
                case 151:
                    return Currency.AMZN;
                case SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE:
                    return Currency.GME;
                case SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE:
                    return Currency.AMD;
                case SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE:
                    return Currency.META;
                case 155:
                    return Currency.CRWD;
                case 156:
                    return Currency.COIN;
                case SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE:
                    return Currency.MSTR;
                case SDK_ASSET_ILLUSTRATION_WALLET_VALUE:
                    return Currency.GOOG;
                case SDK_ASSET_ILLUSTRATION_INCOME_VALUE:
                    return Currency.PLTR;
                case SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE:
                    return Currency.QNT;
                case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE:
                    return Currency.AKITA;
                case SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE:
                    return Currency.SAFEMOON;
                case SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE:
                    return Currency.BABYUNI;
                case SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE:
                    return Currency.MEGA;
                case 165:
                    return Currency.ONEINCH;
                case SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE:
                    return Currency.AMP;
                case 167:
                    return Currency.AUDIO;
                case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE:
                    return Currency.BAND;
                case SDK_ASSET_HEADER_CARD_COLLECT_VALUE:
                    return Currency.BLUR;
                case SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE:
                    return Currency.BNT;
                case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE:
                    return Currency.BOME;
                case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE:
                    return Currency.CHZ;
                case SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE:
                    return Currency.COREUM;
                case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE:
                    return Currency.CSPR;
                case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE:
                    return Currency.CTSI;
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE:
                    return Currency.CVC;
                case SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE:
                    return Currency.CXT;
                case f2773x8d9721ad:
                    return Currency.CTX;
                case f2780x600b66fe:
                    return Currency.DGLD;
                case SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE:
                    return Currency.DYDX;
                case SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE:
                    return Currency.ENS;
                case 182:
                    return Currency.EURCV;
                case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE:
                    return Currency.EURT;
                case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE:
                    return Currency.FET;
                case SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE:
                    return Currency.FLR;
                case SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE:
                    return Currency.GALA;
                case SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE:
                    return Currency.GYEN;
                case 188:
                    return Currency.KNC;
                case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE:
                    return Currency.LMWR;
                case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE:
                    return Currency.MELANIA;
                case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE:
                    return Currency.MOG;
                case 192:
                    return Currency.NEXO;
                case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE:
                    return Currency.PERP;
                case SDK_ASSET_ICON_EXTERNAL_VALUE:
                    return Currency.RAD;
                case SDK_ASSET_ICON_ALERT_WARNING_VALUE:
                    return Currency.RLUSD;
                case SDK_ASSET_ICON_ARROW_DOWN_VALUE:
                    return Currency.RLY;
                case SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE:
                    return Currency.SEI;
                case SDK_ASSET_ICON_ARROW_UP_VALUE:
                    return Currency.SGB;
                case SDK_ASSET_ICON_CANCEL_VALUE:
                    return Currency.SKL;
                case 200:
                    return Currency.SLP;
                case 201:
                    return Currency.SMT;
                case 202:
                    return Currency.SPELL;
                case SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE:
                    return Currency.STORJ;
                case 204:
                    return Currency.SUI;
                case SDK_ASSET_ICON_CLIPBOARD_VALUE:
                    return Currency.SYRUP;
                case SDK_ASSET_ICON_CLOCK_VALUE:
                    return Currency.TRAC;
                case SDK_ASSET_ICON_COMMENT_VALUE:
                    return Currency.TRUF;
                case SDK_ASSET_ICON_INCOME_VALUE:
                    return Currency.UMA;
                case SDK_ASSET_ICON_INCOMPLETE_VALUE:
                    return Currency.VCHF;
                case SDK_ASSET_ICON_NEW_WINDOW_VALUE:
                    return Currency.VEUR;
                case 211:
                    return Currency.VEXT;
                case SDK_ASSET_ICON_OVERRIDE_VALUE:
                    return Currency.WEN;
                case SDK_ASSET_ICON_PAUSE_VALUE:
                    return Currency.WOO;
                case SDK_ASSET_ICON_PIN_VALUE:
                    return Currency.WECAN;
                case SDK_ASSET_ICON_PRODUCT_IDV_VALUE:
                    return Currency.XCHNG;
                case SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE:
                    return Currency.XDC;
                case SDK_ASSET_ICON_PROGRESS_VALUE:
                    return Currency.XSGD;
                case SDK_ASSET_ICON_QUESTION_VALUE:
                    return Currency.ZETA;
                case SDK_ASSET_ICON_REJECTED_REC_VALUE:
                    return Currency.ZUSD;
                case SDK_ASSET_ICON_SHIELD_CAUTION_VALUE:
                    return Currency.MOODENG;
                case SDK_ASSET_ICON_SUBMIT_VALUE:
                    return Currency.GLUB;
                case SDK_ASSET_ICON_SUBTRACT_VALUE:
                    return Currency.NOODLE;
                case SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE:
                    return Currency.PLS;
                case 224:
                    return Currency.TURBO;
                case 225:
                    return Currency.GMXP;
                case SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE:
                    return Currency.SDS;
                case SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE:
                    return Currency.MTC;
                case SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE:
                    return Currency.TMDX;
                case SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE:
                    return Currency.ELON;
                case SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE:
                    return Currency.IVV;
                case SDK_ASSET_ILLUSTRATION_EXIT_VALUE:
                    return Currency.HMND;
                case SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE:
                    return Currency.HONEY;
                case SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE:
                    return Currency.LAYER;
                case SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE:
                    return Currency.GLMR;
                case SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE:
                    return Currency.f8138KO;
                case SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE:
                    return Currency.SPOT;
                case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE:
                    return Currency.SMCX;
                case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE:
                    return Currency.GIGA;
                case 239:
                    return Currency.USFR;
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE:
                    return Currency.f8148VZ;
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE:
                    return Currency.IAU;
                case f2778x3356acf6:
                    return Currency.ARPA;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE:
                    return Currency.UAL;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE:
                    return Currency.RAY;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE:
                    return Currency.f8139ME;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE:
                    return Currency.MRVL;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE:
                    return Currency.HOT;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE:
                    return Currency.UPS;
                case f2779x59907a3d:
                    return Currency.f8132BA;
                case 250:
                    return Currency.DEPRECATED_EUROC;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE:
                    return Currency.GEV;
                case SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE:
                    return Currency.TZA;
                case SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE:
                    return Currency.GAL;
                case SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE:
                    return Currency.LMT;
                case 255:
                    return Currency.f8135GE;
                case 256:
                    return Currency.CONY;
                case SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE:
                    return Currency.BIO;
                case SDK_ASSET_HEADER_BOLT_VALUE:
                    return Currency.CELH;
                case SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE:
                    return Currency.IOST;
                case SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE:
                    return Currency.ZEUS;
                case SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE:
                    return Currency.GNO;
                case SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE:
                    return Currency.SPXU;
                case SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE:
                    return Currency.SCHD;
                case SDK_ASSET_ICON_PLAID_LOGO_VALUE:
                    return Currency.SLV;
                case SDK_ASSET_HEADER_SHIELD_VALUE:
                    return Currency.RPL;
                case SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE:
                    return Currency.PLA;
                case SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE:
                    return Currency.WAMPL;
                case SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE:
                    return Currency.ROOT;
                case SDK_ASSET_HEADER_REPORT_SHARED_VALUE:
                    return Currency.KAVA;
                case SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE:
                    return Currency.PINS;
                case 271:
                    return Currency.MOVE;
                case SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE:
                    return Currency.SOXL;
                case SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE:
                    return Currency.INTR;
                case SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE:
                    return Currency.INDEX;
                case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE:
                    return Currency.CVS;
                case SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE:
                    return Currency.AVGO;
                case SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE:
                    return Currency.WLD;
                case SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE:
                    return Currency.BRETT;
                case SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE:
                    return Currency.PANW;
                case 280:
                    return Currency.WDAY;
                case SDK_ASSET_ILLUSTRATION_BANK_VALUE:
                    return Currency.SNAP;
                case SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE:
                    return Currency.BOBA;
                case 283:
                    return Currency.BABYDOGE;
                case SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE:
                    return Currency.MASK;
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE:
                    return Currency.KHC;
                case f2777x89a9e432:
                    return Currency.ORCL;
                case SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE:
                    return Currency.RDDT;
                case 288:
                    return Currency.INTC;
                case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE:
                    return Currency.TMF;
                case SDK_ASSET_ILLUSTRATION_NOTE_VALUE:
                    return Currency.ANKR;
                case f2776x87e624cb:
                    return Currency.RIVN;
                case SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE:
                    return Currency.PRIME;
                case SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE:
                    return Currency.MORPHO;
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE:
                    return Currency.LYFT;
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE:
                    return Currency.EUL;
                case SDK_ASSET_LOADING_INDICATOR_VALUE:
                    return Currency.XYO;
                case SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE:
                    return Currency.RKT;
                case SDK_ASSET_BANK_ICON_CIRCLE_VALUE:
                    return Currency.INOD;
                case SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE:
                    return Currency.RBLX;
                case 300:
                    return Currency.VTI;
                case SDK_ASSET_CASH_ICON_CIRCLE_VALUE:
                    return Currency.POLS;
                case 302:
                    return Currency.BEAM;
                case SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE:
                    return Currency.AAL;
                case SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE:
                    return Currency.MYTH;
                case SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE:
                    return Currency.JNJ;
                case SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE:
                    return Currency.SRPT;
                case SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE:
                    return Currency.PHA;
                case SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE:
                    return Currency.FARTCOIN;
                case SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE:
                    return Currency.QCOM;
                case SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE:
                    return Currency.ABNB;
                case SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE:
                    return Currency.KGC;
                case f2774x74902ae0:
                    return Currency.AIOZ;
                case SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE:
                    return Currency.JEPQ;
                case SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE:
                    return Currency.TGT;
                case SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE:
                    return Currency.TEM;
                case 316:
                    return Currency.CAVA;
                case SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE:
                    return Currency.PFE;
                case SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE:
                    return Currency.f8147U;
                case f2781x2ba65ba3:
                    return Currency.LQTY;
                case SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE:
                    return Currency.DOGINME;
                case SDK_ASSET_BANK_ICON_CIRCLE_LIGHT_VALUE:
                    return Currency.f8130AI;
                case SDK_ASSET_PLAID_PROFILE_CIRCLE_VALUE:
                    return Currency.SNOW;
                case f2775xbcb7e6f3:
                    return Currency.f8137IO;
                case SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE:
                    return Currency.CKB;
                case SDK_ASSET_ICON_REPORT_VALUE:
                    return Currency.f8142NU;
                case SDK_ASSET_ICON_STEP_COMPLETE_VALUE:
                    return Currency.TQQQ;
                case SDK_ASSET_ICON_UPLOAD_VALUE:
                    return Currency.KAP;
                case SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE:
                    return Currency.HOOK;
                case SDK_ASSET_ICON_LIGHTNING_FILLED_BLUE_VALUE:
                    return Currency.RNDR;
                case 330:
                    return Currency.VUG;
                case 331:
                    return Currency.ACS;
                case 332:
                    return Currency.ROUTE;
                case 333:
                    return Currency.MRNA;
                case 334:
                    return Currency.SHOP;
                case 335:
                    return Currency.f8131B3;
                case WaitlistAnimationConstants.IN_WAITLIST_ANIMATION_END /* 336 */:
                    return Currency.UNH;
                case 337:
                    return Currency.ARC;
                case 338:
                    return Currency.DAL;
                case 339:
                    return Currency.ZKJ;
                case 340:
                    return Currency.MAGS;
                case 341:
                    return Currency.MSTZ;
                case 342:
                    return Currency.BTRST;
                case 343:
                    return Currency.SUPER;
                case 344:
                    return Currency.OKTA;
                case 345:
                    return Currency.ZIL;
                case 346:
                    return Currency.DKS;
                case 347:
                    return Currency.f8134F;
                case 348:
                    return Currency.CLF;
                case 349:
                    return Currency.ROKU;
                case 350:
                    return Currency.BIGTIME;
                case 351:
                    return Currency.GRASS;
                case 352:
                    return Currency.AVA;
                case 353:
                    return Currency.BIL;
                case 354:
                    return Currency.AFRM;
                case 355:
                    return Currency.TNA;
                case 356:
                    return Currency.AMPL;
                case 357:
                    return Currency.GOAT;
                case 358:
                    return Currency.IBIT;
                case 359:
                    return Currency.AIXBT;
                case 360:
                    return Currency.ONE;
                case 361:
                    return Currency.GAP;
                case 362:
                    return Currency.GOOGL;
                case 363:
                    return Currency.VRT;
                case 364:
                    return Currency.CHEX;
                case 365:
                    return Currency.HUM;
                case 366:
                    return Currency.TTWO;
                case 367:
                    return Currency.f8136HD;
                case 368:
                    return Currency.VXX;
                case 369:
                    return Currency.RDNT;
                case 370:
                    return Currency.SMCI;
                case 371:
                    return Currency.CFX;
                case 372:
                    return Currency.SOXS;
                case 373:
                    return Currency.INDP;
                case 374:
                    return Currency.PAAL;
                case 375:
                    return Currency.ENPH;
                case 376:
                    return Currency.CLSK;
                case 377:
                    return Currency.KEY;
                case 378:
                    return Currency.AGIX;
                case 379:
                    return Currency.JTO;
                case 380:
                    return Currency.ACE;
                case 381:
                    return Currency.PYPL;
                case 382:
                    return Currency.AI16Z;
                case 383:
                    return Currency.CSCO;
                case 384:
                    return Currency.SPXS;
                case 385:
                    return Currency.TECL;
                case 386:
                    return Currency.FXS;
                case 387:
                    return Currency.ETHFI;
                case 388:
                    return Currency.ALCH;
                case 389:
                    return Currency.LLY;
                case 390:
                    return Currency.PYR;
                case 391:
                    return Currency.IBKR;
                case 392:
                    return Currency.AERO;
                case 393:
                    return Currency.LPT;
                case 394:
                    return Currency.ARKM;
                case 395:
                    return Currency.ACX;
                case WaitlistAnimationConstants.LEFT_YAW_START /* 396 */:
                    return Currency.TRNR;
                case 397:
                    return Currency.BICO;
                case 398:
                    return Currency.MSTY;
                case 399:
                    return Currency.CEG;
                case 400:
                    return Currency.BITU;
                case 401:
                    return Currency.VGT;
                case 402:
                    return Currency.DECK;
                case HttpStatusCode.FORBIDDEN /* 403 */:
                    return Currency.WEEK;
                case 404:
                    return Currency.NKE;
                case 405:
                    return Currency.TTD;
                case 406:
                    return Currency.AMAT;
                case 407:
                    return Currency.VOO;
                case 408:
                    return Currency.SBUX;
                case 409:
                    return Currency.AIDOGE;
                case HttpStatusCode.GONE /* 410 */:
                    return Currency.IWM;
                case 411:
                    return Currency.CVNA;
                case 412:
                    return Currency.RWM;
                case 413:
                    return Currency.BROS;
                case 414:
                    return Currency.OKLO;
                case 415:
                    return Currency.FBTC;
                case 416:
                    return Currency.KOLD;
                case 417:
                    return Currency.SOFI;
                case 418:
                    return Currency.OUNZ;
                case 419:
                    return Currency.ZVZZT;
                case 420:
                    return Currency.MSFT;
                case 421:
                    return Currency.f8143OM;
                case 422:
                    return Currency.TOSHI;
                case 423:
                    return Currency.ORDI;
                case 424:
                    return Currency.DOCS;
                case CompanyFinancialsSection.BAR_ANIMATION_DURATION /* 425 */:
                    return Currency.UPRO;
                case 426:
                    return Currency.OSCR;
                case 427:
                    return Currency.GDX;
                case 428:
                    return Currency.APP;
                case 429:
                    return Currency.MXC;
                case 430:
                    return Currency.PEP;
                case 431:
                    return Currency.CFG;
                case 432:
                    return Currency.API3;
                case 433:
                    return Currency.NFLX;
                case 434:
                    return Currency.REQ;
                case 435:
                    return Currency.ELF;
                case 436:
                    return Currency.YGG;
                case 437:
                    return Currency.DKNG;
                case 438:
                    return Currency.PONKE;
                case 439:
                    return Currency.PENDLE;
                case 440:
                    return Currency.ALT;
                case 441:
                    return Currency.DELL;
                case 442:
                    return Currency.IAUM;
                case 443:
                    return Currency.NVD;
                case 444:
                    return Currency.REN;
                case 445:
                    return Currency.KCS;
                case 446:
                    return Currency.CLS;
                case 447:
                    return Currency.CCL;
                case 448:
                    return Currency.ANET;
                case 449:
                    return Currency.NVDL;
                case 450:
                    return Currency.VST;
                case 451:
                    return Currency.VVV;
                case 452:
                    return Currency.FSLR;
                case 453:
                    return Currency.CLANKER;
                case 454:
                    return Currency.SPXL;
                case 455:
                    return Currency.OPAI;
                case WaitlistAnimationConstants.MIDDLE_YAW_FRAME /* 456 */:
                    return Currency.f8141MU;
                case 457:
                    return Currency.CONL;
                case 458:
                    return Currency.STG;
                case 459:
                    return Currency.HUT;
                case 460:
                    return Currency.LABU;
                case 461:
                    return Currency.RED;
                case 462:
                    return Currency.PLUME;
                case 463:
                    return Currency.MRK;
                case 464:
                    return Currency.IOTX;
                case 465:
                    return Currency.DJT;
                case 466:
                    return Currency.AYRO;
                case 467:
                    return Currency.FAI;
                case 468:
                    return Currency.HFT;
                case 469:
                    return Currency.NBIS;
                case 470:
                    return Currency.MNT;
                case 471:
                    return Currency.BITO;
                case 472:
                    return Currency.JPM;
                case 473:
                    return Currency.IONQ;
                case 474:
                    return Currency.KP3R;
                case 475:
                    return Currency.COW;
                case 476:
                    return Currency.GLD;
                case 477:
                    return Currency.LCX;
                case 478:
                    return Currency.SQQQ;
                case 479:
                    return Currency.f8140MP;
                case 480:
                    return Currency.ORCA;
                case 481:
                    return Currency.SGOV;
                case 482:
                    return Currency.KAITO;
                case 483:
                    return Currency.RIOT;
                case 484:
                    return Currency.NOW;
                case 485:
                    return Currency.MARA;
                case 486:
                    return Currency.MEOW;
                case 487:
                    return Currency.MPLX;
                case 488:
                    return Currency.MELI;
                case 489:
                    return Currency.ZIM;
                case 490:
                    return Currency.QRDO;
                case 491:
                    return Currency.APT;
                case 492:
                    return Currency.XYZ;
                case 493:
                    return Currency.NVDA;
                case 494:
                    return Currency.MAGIC;
                case 495:
                    return Currency.ALEX;
                case 496:
                    return Currency.COST;
                case 497:
                    return Currency.QUARTZ;
                case 498:
                    return Currency.XOM;
                case 499:
                    return Currency.SPACEX;
                case 500:
                    return Currency.QQQ;
                case 501:
                    return Currency.ACH;
                case com.withpersona.sdk2.inquiry.network.core.HttpStatusCode.BAD_GATEWAY_502 /* 502 */:
                    return Currency.ATH;
                case 503:
                    return Currency.DIS;
                case 504:
                    return Currency.SAFE;
                case 505:
                    return Currency.TLT;
                case 506:
                    return Currency.OXY;
                case 507:
                    return Currency.RLC;
                case 508:
                    return Currency.GEOD;
                case 509:
                    return Currency.KMNO;
                case 510:
                    return Currency.COOKIE;
                case 511:
                    return Currency.UBER;
                case 512:
                    return Currency.KWEB;
                case 513:
                    return Currency.ALAB;
                case 514:
                    return Currency.GNLN;
                case 515:
                    return Currency.CRCL;
                case WaitlistAnimationConstants.RIGHT_YAW_END /* 516 */:
                    return Currency.BITI;
                case 517:
                    return Currency.SPY;
                case 518:
                    return Currency.QQQM;
                case 519:
                    return Currency.GRIFFAIN;
                case 520:
                    return Currency.WELL;
                case HttpStatusCode.DOWNTIME_ERROR /* 521 */:
                    return Currency.JEPI;
                case 522:
                    return Currency.SBIT;
                case 523:
                    return Currency.NVDU;
                case 524:
                    return Currency.ETHA;
                case 525:
                    return Currency.TMUS;
                case 526:
                    return Currency.DRIFT;
                case 527:
                    return Currency.NVDY;
                case 528:
                    return Currency.SMH;
                case 529:
                    return Currency.FAZ;
                case 530:
                    return Currency.f8146T;
                case 531:
                    return Currency.AAAU;
                case 532:
                    return Currency.LABD;
                case 533:
                    return Currency.AXL;
                case 534:
                    return Currency.SPX;
                case 535:
                    return Currency.QWAN;
                case 536:
                    return Currency.GMX;
                case 537:
                    return Currency.TSLY;
                case 538:
                    return Currency.QLD;
                case 539:
                    return Currency.YMAX;
                case 540:
                    return Currency.TSLL;
                case 541:
                    return Currency.CMG;
                case 542:
                    return Currency.CRM;
                case 543:
                    return Currency.BAC;
                case 544:
                    return Currency.RUN;
                case 545:
                    return Currency.HIMS;
                case 546:
                    return Currency.KSM;
                case 547:
                    return Currency.SGOL;
                case 548:
                    return Currency.NEIRO;
                case 549:
                    return Currency.ARKB;
                case 550:
                    return Currency.f8133EL;
                case 551:
                    return Currency.NCLH;
                case RhRoomDatabase.MIGRATION_START_VER /* 552 */:
                    return Currency.NET;
                case 553:
                    return Currency.SMR;
                case 554:
                    return Currency.METIS;
                case 555:
                    return Currency.UPST;
                case 556:
                    return Currency.TNSR;
                case 557:
                    return Currency.WMT;
                case 558:
                    return Currency.LBRDA;
                case 559:
                    return Currency.ARKG;
                case 560:
                    return Currency.GLIBA;
                case 561:
                    return Currency.GLBAV;
                case 562:
                    return Currency.WLFI;
                case 563:
                    return Currency.ZORA;
                case 564:
                    return Currency.ASTER;
                case 565:
                    return Currency.XPL;
                case 566:
                    return Currency.HYPE;
                case 567:
                    return Currency.AVNT;
                case 568:
                    return Currency.OPENL;
                case 569:
                    return Currency.OPENW;
                case 570:
                    return Currency.OPENZ;
                case 571:
                    return Currency.XCN;
                default:
                    return null;
            }
        }
    }

    public static Currency valueOf(String str) {
        return (Currency) Enum.valueOf(Currency.class, str);
    }

    public static Currency[] values() {
        return (Currency[]) $VALUES.clone();
    }
}
