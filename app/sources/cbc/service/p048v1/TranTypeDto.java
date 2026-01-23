package cbc.service.p048v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListDuxo;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
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
/* compiled from: TranTypeDto.kt */
@Metadata(m3635d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0003\b\u0091\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u009e\u00022\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0004\u009e\u0002\u009f\u0002B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\u0097\u0002\u001a\u00030\u0098\u00022\b\u0010\u0099\u0002\u001a\u00030\u009a\u00022\b\u0010\u009b\u0002\u001a\u00030\u009c\u0002H\u0016J\n\u0010\u009d\u0002\u001a\u00030\u009c\u0002H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001j\u0003\b\u0098\u0001j\u0003\b\u0099\u0001j\u0003\b\u009a\u0001j\u0003\b\u009b\u0001j\u0003\b\u009c\u0001j\u0003\b\u009d\u0001j\u0003\b\u009e\u0001j\u0003\b\u009f\u0001j\u0003\b \u0001j\u0003\b¡\u0001j\u0003\b¢\u0001j\u0003\b£\u0001j\u0003\b¤\u0001j\u0003\b¥\u0001j\u0003\b¦\u0001j\u0003\b§\u0001j\u0003\b¨\u0001j\u0003\b©\u0001j\u0003\bª\u0001j\u0003\b«\u0001j\u0003\b¬\u0001j\u0003\b\u00ad\u0001j\u0003\b®\u0001j\u0003\b¯\u0001j\u0003\b°\u0001j\u0003\b±\u0001j\u0003\b²\u0001j\u0003\b³\u0001j\u0003\b´\u0001j\u0003\bµ\u0001j\u0003\b¶\u0001j\u0003\b·\u0001j\u0003\b¸\u0001j\u0003\b¹\u0001j\u0003\bº\u0001j\u0003\b»\u0001j\u0003\b¼\u0001j\u0003\b½\u0001j\u0003\b¾\u0001j\u0003\b¿\u0001j\u0003\bÀ\u0001j\u0003\bÁ\u0001j\u0003\bÂ\u0001j\u0003\bÃ\u0001j\u0003\bÄ\u0001j\u0003\bÅ\u0001j\u0003\bÆ\u0001j\u0003\bÇ\u0001j\u0003\bÈ\u0001j\u0003\bÉ\u0001j\u0003\bÊ\u0001j\u0003\bË\u0001j\u0003\bÌ\u0001j\u0003\bÍ\u0001j\u0003\bÎ\u0001j\u0003\bÏ\u0001j\u0003\bÐ\u0001j\u0003\bÑ\u0001j\u0003\bÒ\u0001j\u0003\bÓ\u0001j\u0003\bÔ\u0001j\u0003\bÕ\u0001j\u0003\bÖ\u0001j\u0003\b×\u0001j\u0003\bØ\u0001j\u0003\bÙ\u0001j\u0003\bÚ\u0001j\u0003\bÛ\u0001j\u0003\bÜ\u0001j\u0003\bÝ\u0001j\u0003\bÞ\u0001j\u0003\bß\u0001j\u0003\bà\u0001j\u0003\bá\u0001j\u0003\bâ\u0001j\u0003\bã\u0001j\u0003\bä\u0001j\u0003\bå\u0001j\u0003\bæ\u0001j\u0003\bç\u0001j\u0003\bè\u0001j\u0003\bé\u0001j\u0003\bê\u0001j\u0003\bë\u0001j\u0003\bì\u0001j\u0003\bí\u0001j\u0003\bî\u0001j\u0003\bï\u0001j\u0003\bð\u0001j\u0003\bñ\u0001j\u0003\bò\u0001j\u0003\bó\u0001j\u0003\bô\u0001j\u0003\bõ\u0001j\u0003\bö\u0001j\u0003\b÷\u0001j\u0003\bø\u0001j\u0003\bù\u0001j\u0003\bú\u0001j\u0003\bû\u0001j\u0003\bü\u0001j\u0003\bý\u0001j\u0003\bþ\u0001j\u0003\bÿ\u0001j\u0003\b\u0080\u0002j\u0003\b\u0081\u0002j\u0003\b\u0082\u0002j\u0003\b\u0083\u0002j\u0003\b\u0084\u0002j\u0003\b\u0085\u0002j\u0003\b\u0086\u0002j\u0003\b\u0087\u0002j\u0003\b\u0088\u0002j\u0003\b\u0089\u0002j\u0003\b\u008a\u0002j\u0003\b\u008b\u0002j\u0003\b\u008c\u0002j\u0003\b\u008d\u0002j\u0003\b\u008e\u0002j\u0003\b\u008f\u0002j\u0003\b\u0090\u0002j\u0003\b\u0091\u0002j\u0003\b\u0092\u0002j\u0003\b\u0093\u0002j\u0003\b\u0094\u0002j\u0003\b\u0095\u0002j\u0003\b\u0096\u0002¨\u0006 \u0002"}, m3636d2 = {"Lcbc/service/v1/TranTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcbc/service/v1/TranType;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "TRAN_TYPE_UNSPECIFIED", "TRAN_TYPE_ADJ_BUY", "TRAN_TYPE_ALIGN_DOWN", "TRAN_TYPE_ALIGN_UP", "TRAN_TYPE_ASSET_TRANSFER_IN", "TRAN_TYPE_ASSET_TRANSFER_OUT", "TRAN_TYPE_ASSET_TRANSFER_OUT_BY_ID", "TRAN_TYPE_ASSIGN", "TRAN_TYPE_ASSIGN_BUY", "TRAN_TYPE_ASSIGN_CALL_CLOSE", "TRAN_TYPE_ASSIGN_CALL_ML", "TRAN_TYPE_ASSIGN_CASH", "TRAN_TYPE_ASSIGN_CASH_SETTLED", "TRAN_TYPE_ASSIGN_CLOSE", "TRAN_TYPE_ASSIGN_COVER_SHORT", "TRAN_TYPE_ASSIGN_PUT_CLOSE", "TRAN_TYPE_ASSIGN_PUT_ML", "TRAN_TYPE_ASSIGN_RIGHT", "TRAN_TYPE_ASSIGN_SELL", "TRAN_TYPE_ASSIGN_SELL_BY_ID", "TRAN_TYPE_ASSIGN_SELL_SHORT", "TRAN_TYPE_ASSIGN_SELL_SHORT_BY_ID", "TRAN_TYPE_ASSIGN_WARRANT", "TRAN_TYPE_AUTO_EXPIRE_ALL", "TRAN_TYPE_BASELINE", "TRAN_TYPE_BASELINE_LOSS", "TRAN_TYPE_BASELINE_LOT", "TRAN_TYPE_BASELINE_TAX_LOT", "TRAN_TYPE_BASELINE_WS_ADJ", "TRAN_TYPE_BOOK_TO_CERT_BY_ID", "TRAN_TYPE_BUY", "TRAN_TYPE_BUY_IN_KIND", "TRAN_TYPE_BUY_TO_CLOSE", "TRAN_TYPE_BUY_TO_CLOSE_BY_ID", "TRAN_TYPE_BUY_TO_OPEN", "TRAN_TYPE_CALL", "TRAN_TYPE_CALL_PARTIAL", "TRAN_TYPE_CANCEL", "TRAN_TYPE_CANCEL_ACC", "TRAN_TYPE_CASH_DIV", "TRAN_TYPE_CASH_IN_LIEU", "TRAN_TYPE_CASH_LIEU", "TRAN_TYPE_CCONVERSION", "TRAN_TYPE_CCONVERSION_IN", "TRAN_TYPE_CCONVERSION_OUT", "TRAN_TYPE_CCONVERSION_OUT_BY_ID", "TRAN_TYPE_CDIV_RE", "TRAN_TYPE_CERT_TO_BOOK_BY_ID", "TRAN_TYPE_CFICONVERSION", "TRAN_TYPE_CFICONVERSION_IN", "TRAN_TYPE_CFICONVERSION_OUT", "TRAN_TYPE_CFIDEFEASANCE", "TRAN_TYPE_CFIDEFEASANCE_IN", "TRAN_TYPE_CFIDEFEASANCE_OUT", "TRAN_TYPE_CFIEXCHANGE", "TRAN_TYPE_CFIEXCHANGE_IN", "TRAN_TYPE_CFIEXCHANGE_OUT", "TRAN_TYPE_CFIPREREFUND", "TRAN_TYPE_CFIPREREFUND_IN", "TRAN_TYPE_CFIPREREFUND_OUT", "TRAN_TYPE_CFITENDER_CASH", "TRAN_TYPE_CFITENDER_SELL", "TRAN_TYPE_CFITENDER_SELL_BY_ID", "TRAN_TYPE_CFUTURE_REORG", "TRAN_TYPE_CFUTURE_REORG_IN", "TRAN_TYPE_CFUTURE_REORG_OUT", "TRAN_TYPE_CILEXACT", "TRAN_TYPE_COPTION_REORG", "TRAN_TYPE_COPTION_REORG_IN", "TRAN_TYPE_COPTION_REORG_OUT", "TRAN_TYPE_COST_ADJ_BY_ID", "TRAN_TYPE_COVER_BY_ID", "TRAN_TYPE_COVER_AGAINST_BOX_FIFO", "TRAN_TYPE_COVER_SHORT", "TRAN_TYPE_CRET_CAPITAL", "TRAN_TYPE_CRET_CAPITAL_BY_ID", "TRAN_TYPE_CUITGRTR_COST_ADJ", "TRAN_TYPE_CUITRIC_COST_ADJ", "TRAN_TYPE_DEPOSIT", "TRAN_TYPE_DEPOSITS_OPT", "TRAN_TYPE_DIV_RE", "TRAN_TYPE_EXERCISE", "TRAN_TYPE_EXERCISE_B_SHARES", "TRAN_TYPE_EXERCISE_BUY", "TRAN_TYPE_EXERCISE_CALL_CLOSE", "TRAN_TYPE_EXERCISE_CALL_ML", "TRAN_TYPE_EXERCISE_CASH", "TRAN_TYPE_EXERCISE_CASH_SETTLED", "TRAN_TYPE_EXERCISE_CLOSE", "TRAN_TYPE_EXERCISE_COUPON", "TRAN_TYPE_EXERCISE_COVER_SHORT", "TRAN_TYPE_EXERCISE_COVER_SHORT_BY_ID", "TRAN_TYPE_EXERCISE_PUT_CLOSE", "TRAN_TYPE_EXERCISE_PUT_ML", "TRAN_TYPE_EXERCISE_RIGHT", "TRAN_TYPE_EXERCISE_SELL", "TRAN_TYPE_EXERCISE_SELL_BY_ID", "TRAN_TYPE_EXERCISE_SELL_SHORT", "TRAN_TYPE_EXERCISE_WARRANT", "TRAN_TYPE_EXPIRE", "TRAN_TYPE_EXPIRE_BY_ID", "TRAN_TYPE_EXPIRE_LONG", "TRAN_TYPE_EXPIRE_SHORT", "TRAN_TYPE_GAIN_LOSS", "TRAN_TYPE_INTEREST", "TRAN_TYPE_INTERNAL_TAX_LOT_TRANSFER", "TRAN_TYPE_INTERNAL_TRANSFER_CONV_IN", "TRAN_TYPE_INTERNAL_TRANSFER_CONV_OUT", "TRAN_TYPE_INTERNAL_TRANSFER_CONV_OUT_BY_ID", "TRAN_TYPE_INTERNAL_TRANSFER_IN", "TRAN_TYPE_INTERNAL_TRANSFER_OUT", "TRAN_TYPE_INTERNAL_TRANSFER_OUT_BY_ID", "TRAN_TYPE_LIQUIDATION", "TRAN_TYPE_LTRANSFER_CONV_IN", "TRAN_TYPE_LTRANSFER_CONV_OUT", "TRAN_TYPE_MARK_TO_MARKET_ALL", "TRAN_TYPE_MATURITY", "TRAN_TYPE_MCA_TRAN", "TRAN_TYPE_MCA_TRAN_IN", "TRAN_TYPE_MCA_TRAN_OUT", "TRAN_TYPE_OPEN_SHORT", "TRAN_TYPE_PAIR_OFF_BY_ID", "TRAN_TYPE_PUT", "TRAN_TYPE_REDEMPTION", "TRAN_TYPE_ROC", "TRAN_TYPE_REMOVE_SHARES", "TRAN_TYPE_REPO", "TRAN_TYPE_RETCAPITAL", "TRAN_TYPE_REVERSE_REPO", "TRAN_TYPE_RIGHTS_LAPSE", "TRAN_TYPE_RIK", "TRAN_TYPE_SELL", "TRAN_TYPE_SELL_AMT_BY_FIFO", "TRAN_TYPE_SELL_AMT_BY_ID", "TRAN_TYPE_SELL_BY_ID", "TRAN_TYPE_SELL_SHORT", "TRAN_TYPE_SELL_TO_CLOSE", "TRAN_TYPE_SELL_TO_CLOSE_BY_ID", "TRAN_TYPE_SELL_TO_OPEN", "TRAN_TYPE_SET_AVG_COST", "TRAN_TYPE_SET_CDRP_BY_ID", "TRAN_TYPE_SET_COST_ALLOC_RIGHT_ISSUE", "TRAN_TYPE_SET_ELECTIONS", "TRAN_TYPE_SET_TRADING_METHOD", "TRAN_TYPE_SUB_ACCT_TRANSFER", "TRAN_TYPE_SUB_ACCT_TRANSFER_BY_ID", "TRAN_TYPE_TAX_LOT_TRANSFER", "TRAN_TYPE_TENDER_SELL", "TRAN_TYPE_TENDER_SELL_BY_ID", "TRAN_TYPE_TRANSFER_IN_PLACE", "TRAN_TYPE_TRANSFER_IN_PLACE_BY_ID", "TRAN_TYPE_UNDIST_CAP_GAIN_ADJ", "TRAN_TYPE_UNDIST_CAP_GAIN_ADJ_BY_ID", "TRAN_TYPE_VCA_ELECTION", "TRAN_TYPE_VCAFI_TRAN_IN", "TRAN_TYPE_VCAFI_TRAN_OUT", "TRAN_TYPE_VCA_TRAN", "TRAN_TYPE_VCA_TRAN_IN", "TRAN_TYPE_VCA_TRAN_OUT", "TRAN_TYPE_VOID", "TRAN_TYPE_WITHDRAW", "TRAN_TYPE_WITHDRAW_BY_ID", "TRAN_TYPE_WITHDRAW_SHORT", "TRAN_TYPE_WRITE_OFF", "TRAN_TYPE_WS", "TRAN_TYPE_WS_ADJ", "TRAN_TYPE_ASSIGN_COVER_SHORT_BY_ID", "TRAN_TYPE_BANKRUPTCY_REORG", "TRAN_TYPE_CASH_MERGER", "TRAN_TYPE_COMPLETE_CALL", "TRAN_TYPE_COMPLETE_PUT", "TRAN_TYPE_CONV", "TRAN_TYPE_DISTRIB_SPINOFF", "TRAN_TYPE_EXCHANGE", "TRAN_TYPE_FIBANKRUPTCY_EXCHANGE", "TRAN_TYPE_FIEQUITY_LINKED_CONV", "TRAN_TYPE_FIESCROW_DISTRIB", "TRAN_TYPE_FIEXCHANGE", "TRAN_TYPE_FIREORG_EXCHANGE", "TRAN_TYPE_MERGER", "TRAN_TYPE_ODD_LOT_TENDER", "TRAN_TYPE_PAIDOFF", "TRAN_TYPE_REINCORPORATION", "TRAN_TYPE_REORGANIZATION", "TRAN_TYPE_RIGHTS_EXPIRE", "TRAN_TYPE_TERMINATION", "TRAN_TYPE_VDUTCH_AUCTION_TENDER", "TRAN_TYPE_VEXCHANGE_OFFER", "TRAN_TYPE_VMERGER", "TRAN_TYPE_VTENDER_NEW", "TRAN_TYPE_WARRANTS_EXPIRE", "TRAN_TYPE_DELISTING", "TRAN_TYPE_FI_DEEMED_EXTD_MATURITY", "TRAN_TYPE_FI_DEEMED_PREREFUND", "TRAN_TYPE_FI_DEEMED_REMARKETING", "TRAN_TYPE_LISTING_CHANGE", "TRAN_TYPE_NAME_SYMBOL_CHANGE", "TRAN_TYPE_OPTION_REORG", "TRAN_TYPE_OPTION_SPLIT", "TRAN_TYPE_OPTION_SYMBOL_CHANGE", "TRAN_TYPE_REVERSE_STOCK_SPLIT", "TRAN_TYPE_RIGHTS_ISSUE", "TRAN_TYPE_WORTHLESS", "TRAN_TYPE_ASSIMILATION", "TRAN_TYPE_B_SHARES_EXPIRE", "TRAN_TYPE_B_SHARES_ISSUE", "TRAN_TYPE_BANKRUPTCY_PAYMENT", "TRAN_TYPE_BONUS_ISSUE", "TRAN_TYPE_CLOTPOOLTRANSFER", "TRAN_TYPE_CLOTPOOLTRANSFERBYID", "TRAN_TYPE_COMPULSORY_ACQUISITION", "TRAN_TYPE_COUPON_DISTRIB", "TRAN_TYPE_COUPON_EXPIRE", "TRAN_TYPE_CUNDISTCAPGAINADJ", "TRAN_TYPE_DEEMED_DIVIDEND_ADJ", "TRAN_TYPE_DEMERGER", "TRAN_TYPE_DEPAIRING", "TRAN_TYPE_DIVREAUTO", "TRAN_TYPE_EXCHANGE_OFFER", "TRAN_TYPE_FICONVERSION", "TRAN_TYPE_FIDEEMED_REISSUE", "TRAN_TYPE_FIDEFEASANCE", "TRAN_TYPE_FILIQUIDATION", "TRAN_TYPE_FIPREREFUND", "TRAN_TYPE_FIREDEMPTION_CONV", "TRAN_TYPE_FIREORG_DISTRIB", "TRAN_TYPE_FIREORG_EXCHANGE_OFFER", "TRAN_TYPE_FORWARD_STOCK_SPLIT", "TRAN_TYPE_FUTURE_LEAP_CONV", "TRAN_TYPE_FUTURE_NODIVRISK", "TRAN_TYPE_FUTURE_REORG", "TRAN_TYPE_FUTURE_SPLIT", "TRAN_TYPE_FUTURE_SYMBOL_CHANGE", "TRAN_TYPE_LIQUIDATION_DIV", "TRAN_TYPE_ODD_LOT_TENDER_SHARES", "TRAN_TYPE_OPTION_LEAP_CONV", "TRAN_TYPE_PAID_IN_KIND_DIVIDEND", "TRAN_TYPE_PLAN_OF_ARRANGEMENT", "TRAN_TYPE_POISON_PILL", "TRAN_TYPE_REFPAYDOWNLOT", "TRAN_TYPE_REMARKETING", "TRAN_TYPE_REORG_DISTRIB", "TRAN_TYPE_REORG_EXCHANGE", "TRAN_TYPE_REORG_EXCHANGEOFFER", "TRAN_TYPE_RETURN_OF_CAPITAL", "TRAN_TYPE_RETURN_OF_PRINCIPAL", "TRAN_TYPE_SCHEME_OF_ARRANGEMENT", "TRAN_TYPE_SEPARATION_OF_UNITS", "TRAN_TYPE_STOCK_DIVIDEND", "TRAN_TYPE_STOCK_SPLIT", "TRAN_TYPE_SUBSCRIPTION_OFFER", "TRAN_TYPE_SWING", "TRAN_TYPE_TIERED_SPLIT", "TRAN_TYPE_UIT_TERMINATION", "TRAN_TYPE_UNSTAPLING_OF_BUNDLED", "TRAN_TYPE_VFIBANKRUPTCY_EXCHANGE", "TRAN_TYPE_VFIBANKRUPTCY_EXCHANGEOFFER", "TRAN_TYPE_VFIREORG_EXCHANGE", "TRAN_TYPE_VFIREORG_EXCHANGEOFFER", "TRAN_TYPE_WARRANTS_ISSUE", "TRAN_TYPE_UNKNOWN", "TRAN_TYPE_GAINLOSSWS", "TRAN_TYPE_EXERCISERTWT_BUY", "TRAN_TYPE_EXERCISERTWT_CASH", "TRAN_TYPE_EXERCISERTWT_COVER_SHORT", "TRAN_TYPE_EXERCISERTWT_COVER_SHORT_BY_ID", "TRAN_TYPE_EXERCISERTWT_CLOSE", "TRAN_TYPE_EXERCISERTWT_ML", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "cbc.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public abstract class TranTypeDto implements Dto2<TranType>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TranTypeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<TranTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TranTypeDto, TranType>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final TranTypeDto TRAN_TYPE_UNSPECIFIED = new TranTypeDto("TRAN_TYPE_UNSPECIFIED", 0) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_UNSPECIFIED;
        }
    };
    public static final TranTypeDto TRAN_TYPE_ADJ_BUY = new TranTypeDto("TRAN_TYPE_ADJ_BUY", 1) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_ADJ_BUY
        {
            String str = "adjbuy";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_ADJ_BUY;
        }
    };
    public static final TranTypeDto TRAN_TYPE_ALIGN_DOWN = new TranTypeDto("TRAN_TYPE_ALIGN_DOWN", 2) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_ALIGN_DOWN
        {
            String str = "aligndown";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_ALIGN_DOWN;
        }
    };
    public static final TranTypeDto TRAN_TYPE_ALIGN_UP = new TranTypeDto("TRAN_TYPE_ALIGN_UP", 3) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_ALIGN_UP
        {
            String str = "alignup";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_ALIGN_UP;
        }
    };
    public static final TranTypeDto TRAN_TYPE_ASSET_TRANSFER_IN = new TranTypeDto("TRAN_TYPE_ASSET_TRANSFER_IN", 4) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_ASSET_TRANSFER_IN
        {
            String str = "assettransferin";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_ASSET_TRANSFER_IN;
        }
    };
    public static final TranTypeDto TRAN_TYPE_ASSET_TRANSFER_OUT = new TranTypeDto("TRAN_TYPE_ASSET_TRANSFER_OUT", 5) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_ASSET_TRANSFER_OUT
        {
            String str = "assettransferout";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_ASSET_TRANSFER_OUT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_ASSET_TRANSFER_OUT_BY_ID = new TranTypeDto("TRAN_TYPE_ASSET_TRANSFER_OUT_BY_ID", 6) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_ASSET_TRANSFER_OUT_BY_ID
        {
            String str = "assettransferoutbyid";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_ASSET_TRANSFER_OUT_BY_ID;
        }
    };
    public static final TranTypeDto TRAN_TYPE_ASSIGN = new TranTypeDto("TRAN_TYPE_ASSIGN", 7) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_ASSIGN
        {
            String str = "assign";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_ASSIGN;
        }
    };
    public static final TranTypeDto TRAN_TYPE_ASSIGN_BUY = new TranTypeDto("TRAN_TYPE_ASSIGN_BUY", 8) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_ASSIGN_BUY
        {
            String str = "assignbuy";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_ASSIGN_BUY;
        }
    };
    public static final TranTypeDto TRAN_TYPE_ASSIGN_CALL_CLOSE = new TranTypeDto("TRAN_TYPE_ASSIGN_CALL_CLOSE", 9) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_ASSIGN_CALL_CLOSE
        {
            String str = "assigncallclose";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_ASSIGN_CALL_CLOSE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_ASSIGN_CALL_ML = new TranTypeDto("TRAN_TYPE_ASSIGN_CALL_ML", 10) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_ASSIGN_CALL_ML
        {
            String str = "assigncallml";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_ASSIGN_CALL_ML;
        }
    };
    public static final TranTypeDto TRAN_TYPE_ASSIGN_CASH = new TranTypeDto("TRAN_TYPE_ASSIGN_CASH", 11) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_ASSIGN_CASH
        {
            String str = "assigncash";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_ASSIGN_CASH;
        }
    };
    public static final TranTypeDto TRAN_TYPE_ASSIGN_CASH_SETTLED = new TranTypeDto("TRAN_TYPE_ASSIGN_CASH_SETTLED", 12) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_ASSIGN_CASH_SETTLED
        {
            String str = "assigncashsettled";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_ASSIGN_CASH_SETTLED;
        }
    };
    public static final TranTypeDto TRAN_TYPE_ASSIGN_CLOSE = new TranTypeDto("TRAN_TYPE_ASSIGN_CLOSE", 13) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_ASSIGN_CLOSE
        {
            String str = "assignclose";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_ASSIGN_CLOSE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_ASSIGN_COVER_SHORT = new TranTypeDto("TRAN_TYPE_ASSIGN_COVER_SHORT", 14) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_ASSIGN_COVER_SHORT
        {
            String str = "assigncovershort";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_ASSIGN_COVER_SHORT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_ASSIGN_PUT_CLOSE = new TranTypeDto("TRAN_TYPE_ASSIGN_PUT_CLOSE", 15) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_ASSIGN_PUT_CLOSE
        {
            String str = "assignputclose";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_ASSIGN_PUT_CLOSE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_ASSIGN_PUT_ML = new TranTypeDto("TRAN_TYPE_ASSIGN_PUT_ML", 16) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_ASSIGN_PUT_ML
        {
            String str = "assignputml";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_ASSIGN_PUT_ML;
        }
    };
    public static final TranTypeDto TRAN_TYPE_ASSIGN_RIGHT = new TranTypeDto("TRAN_TYPE_ASSIGN_RIGHT", 17) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_ASSIGN_RIGHT
        {
            String str = "assignright";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_ASSIGN_RIGHT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_ASSIGN_SELL = new TranTypeDto("TRAN_TYPE_ASSIGN_SELL", 18) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_ASSIGN_SELL
        {
            String str = "assignsell";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_ASSIGN_SELL;
        }
    };
    public static final TranTypeDto TRAN_TYPE_ASSIGN_SELL_BY_ID = new TranTypeDto("TRAN_TYPE_ASSIGN_SELL_BY_ID", 19) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_ASSIGN_SELL_BY_ID
        {
            String str = "assignsellbyid";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_ASSIGN_SELL_BY_ID;
        }
    };
    public static final TranTypeDto TRAN_TYPE_ASSIGN_SELL_SHORT = new TranTypeDto("TRAN_TYPE_ASSIGN_SELL_SHORT", 20) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_ASSIGN_SELL_SHORT
        {
            String str = "assignsellshort";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_ASSIGN_SELL_SHORT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_ASSIGN_SELL_SHORT_BY_ID = new TranTypeDto("TRAN_TYPE_ASSIGN_SELL_SHORT_BY_ID", 21) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_ASSIGN_SELL_SHORT_BY_ID
        {
            String str = "assignsellshortbyid";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_ASSIGN_SELL_SHORT_BY_ID;
        }
    };
    public static final TranTypeDto TRAN_TYPE_ASSIGN_WARRANT = new TranTypeDto("TRAN_TYPE_ASSIGN_WARRANT", 22) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_ASSIGN_WARRANT
        {
            String str = "assignwarrant";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_ASSIGN_WARRANT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_AUTO_EXPIRE_ALL = new TranTypeDto("TRAN_TYPE_AUTO_EXPIRE_ALL", 23) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_AUTO_EXPIRE_ALL
        {
            String str = "autoexpireall";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_AUTO_EXPIRE_ALL;
        }
    };
    public static final TranTypeDto TRAN_TYPE_BASELINE = new TranTypeDto("TRAN_TYPE_BASELINE", 24) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_BASELINE
        {
            String str = "baseline";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_BASELINE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_BASELINE_LOSS = new TranTypeDto("TRAN_TYPE_BASELINE_LOSS", 25) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_BASELINE_LOSS
        {
            String str = "baselineloss";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_BASELINE_LOSS;
        }
    };
    public static final TranTypeDto TRAN_TYPE_BASELINE_LOT = new TranTypeDto("TRAN_TYPE_BASELINE_LOT", 26) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_BASELINE_LOT
        {
            String str = "baselinelot";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_BASELINE_LOT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_BASELINE_TAX_LOT = new TranTypeDto("TRAN_TYPE_BASELINE_TAX_LOT", 27) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_BASELINE_TAX_LOT
        {
            String str = "baselinetaxlot";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_BASELINE_TAX_LOT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_BASELINE_WS_ADJ = new TranTypeDto("TRAN_TYPE_BASELINE_WS_ADJ", 28) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_BASELINE_WS_ADJ
        {
            String str = "baselinewsadj";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_BASELINE_WS_ADJ;
        }
    };
    public static final TranTypeDto TRAN_TYPE_BOOK_TO_CERT_BY_ID = new TranTypeDto("TRAN_TYPE_BOOK_TO_CERT_BY_ID", 29) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_BOOK_TO_CERT_BY_ID
        {
            String str = "booktocertbyid";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_BOOK_TO_CERT_BY_ID;
        }
    };
    public static final TranTypeDto TRAN_TYPE_BUY = new TranTypeDto("TRAN_TYPE_BUY", 30) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_BUY
        {
            String str = "buy";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_BUY;
        }
    };
    public static final TranTypeDto TRAN_TYPE_BUY_IN_KIND = new TranTypeDto("TRAN_TYPE_BUY_IN_KIND", 31) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_BUY_IN_KIND
        {
            String str = "buyinkind";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_BUY_IN_KIND;
        }
    };
    public static final TranTypeDto TRAN_TYPE_BUY_TO_CLOSE = new TranTypeDto("TRAN_TYPE_BUY_TO_CLOSE", 32) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_BUY_TO_CLOSE
        {
            String str = "buytoclose";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_BUY_TO_CLOSE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_BUY_TO_CLOSE_BY_ID = new TranTypeDto("TRAN_TYPE_BUY_TO_CLOSE_BY_ID", 33) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_BUY_TO_CLOSE_BY_ID
        {
            String str = "buytoclosebyid";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_BUY_TO_CLOSE_BY_ID;
        }
    };
    public static final TranTypeDto TRAN_TYPE_BUY_TO_OPEN = new TranTypeDto("TRAN_TYPE_BUY_TO_OPEN", 34) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_BUY_TO_OPEN
        {
            String str = "buytoopen";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_BUY_TO_OPEN;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CALL = new TranTypeDto("TRAN_TYPE_CALL", 35) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CALL
        {
            String str = "call";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CALL;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CALL_PARTIAL = new TranTypeDto("TRAN_TYPE_CALL_PARTIAL", 36) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CALL_PARTIAL
        {
            String str = "callpartial";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CALL_PARTIAL;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CANCEL = new TranTypeDto("TRAN_TYPE_CANCEL", 37) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CANCEL
        {
            String str = "cancel";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CANCEL;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CANCEL_ACC = new TranTypeDto("TRAN_TYPE_CANCEL_ACC", 38) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CANCEL_ACC
        {
            String str = "cancelacc";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CANCEL_ACC;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CASH_DIV = new TranTypeDto("TRAN_TYPE_CASH_DIV", 39) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CASH_DIV
        {
            String str = "cashdiv";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CASH_DIV;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CASH_IN_LIEU = new TranTypeDto("TRAN_TYPE_CASH_IN_LIEU", 40) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CASH_IN_LIEU
        {
            String str = "cashinlieu";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CASH_IN_LIEU;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CASH_LIEU = new TranTypeDto("TRAN_TYPE_CASH_LIEU", 41) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CASH_LIEU
        {
            String str = "cashlieu";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CASH_LIEU;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CCONVERSION = new TranTypeDto("TRAN_TYPE_CCONVERSION", 42) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CCONVERSION
        {
            String str = "cconversion";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CCONVERSION;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CCONVERSION_IN = new TranTypeDto("TRAN_TYPE_CCONVERSION_IN", 43) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CCONVERSION_IN
        {
            String str = "cconversionin";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CCONVERSION_IN;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CCONVERSION_OUT = new TranTypeDto("TRAN_TYPE_CCONVERSION_OUT", 44) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CCONVERSION_OUT
        {
            String str = "cconversionout";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CCONVERSION_OUT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CCONVERSION_OUT_BY_ID = new TranTypeDto("TRAN_TYPE_CCONVERSION_OUT_BY_ID", 45) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CCONVERSION_OUT_BY_ID
        {
            String str = "cconversionoutbyid";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CCONVERSION_OUT_BY_ID;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CDIV_RE = new TranTypeDto("TRAN_TYPE_CDIV_RE", 46) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CDIV_RE
        {
            String str = "cdivre";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CDIV_RE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CERT_TO_BOOK_BY_ID = new TranTypeDto("TRAN_TYPE_CERT_TO_BOOK_BY_ID", 47) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CERT_TO_BOOK_BY_ID
        {
            String str = "certtobookbyid";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CERT_TO_BOOK_BY_ID;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CFICONVERSION = new TranTypeDto("TRAN_TYPE_CFICONVERSION", 48) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CFICONVERSION
        {
            String str = "cficonversion";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CFICONVERSION;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CFICONVERSION_IN = new TranTypeDto("TRAN_TYPE_CFICONVERSION_IN", 49) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CFICONVERSION_IN
        {
            String str = "cficonversionin";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CFICONVERSION_IN;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CFICONVERSION_OUT = new TranTypeDto("TRAN_TYPE_CFICONVERSION_OUT", 50) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CFICONVERSION_OUT
        {
            String str = "cficonversionout";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CFICONVERSION_OUT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CFIDEFEASANCE = new TranTypeDto("TRAN_TYPE_CFIDEFEASANCE", 51) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CFIDEFEASANCE
        {
            String str = "cfidefeasance";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CFIDEFEASANCE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CFIDEFEASANCE_IN = new TranTypeDto("TRAN_TYPE_CFIDEFEASANCE_IN", 52) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CFIDEFEASANCE_IN
        {
            String str = "cfidefeasancein";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CFIDEFEASANCE_IN;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CFIDEFEASANCE_OUT = new TranTypeDto("TRAN_TYPE_CFIDEFEASANCE_OUT", 53) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CFIDEFEASANCE_OUT
        {
            String str = "cfidefeasanceout";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CFIDEFEASANCE_OUT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CFIEXCHANGE = new TranTypeDto("TRAN_TYPE_CFIEXCHANGE", 54) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CFIEXCHANGE
        {
            String str = "cfiexchange";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CFIEXCHANGE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CFIEXCHANGE_IN = new TranTypeDto("TRAN_TYPE_CFIEXCHANGE_IN", 55) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CFIEXCHANGE_IN
        {
            String str = "cfiexchangein";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CFIEXCHANGE_IN;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CFIEXCHANGE_OUT = new TranTypeDto("TRAN_TYPE_CFIEXCHANGE_OUT", 56) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CFIEXCHANGE_OUT
        {
            String str = "cfiexchangeout";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CFIEXCHANGE_OUT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CFIPREREFUND = new TranTypeDto("TRAN_TYPE_CFIPREREFUND", 57) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CFIPREREFUND
        {
            String str = "cfiprerefund";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CFIPREREFUND;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CFIPREREFUND_IN = new TranTypeDto("TRAN_TYPE_CFIPREREFUND_IN", 58) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CFIPREREFUND_IN
        {
            String str = "cfiprerefundin";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CFIPREREFUND_IN;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CFIPREREFUND_OUT = new TranTypeDto("TRAN_TYPE_CFIPREREFUND_OUT", 59) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CFIPREREFUND_OUT
        {
            String str = "cfiprerefundout";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CFIPREREFUND_OUT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CFITENDER_CASH = new TranTypeDto("TRAN_TYPE_CFITENDER_CASH", 60) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CFITENDER_CASH
        {
            String str = "cfitendercash";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CFITENDER_CASH;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CFITENDER_SELL = new TranTypeDto("TRAN_TYPE_CFITENDER_SELL", 61) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CFITENDER_SELL
        {
            String str = "cfitendersell";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CFITENDER_SELL;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CFITENDER_SELL_BY_ID = new TranTypeDto("TRAN_TYPE_CFITENDER_SELL_BY_ID", 62) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CFITENDER_SELL_BY_ID
        {
            String str = "cfitendersellbyid";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CFITENDER_SELL_BY_ID;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CFUTURE_REORG = new TranTypeDto("TRAN_TYPE_CFUTURE_REORG", 63) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CFUTURE_REORG
        {
            String str = "cfuturereorg";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CFUTURE_REORG;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CFUTURE_REORG_IN = new TranTypeDto("TRAN_TYPE_CFUTURE_REORG_IN", 64) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CFUTURE_REORG_IN
        {
            String str = "cfuturereorgin";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CFUTURE_REORG_IN;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CFUTURE_REORG_OUT = new TranTypeDto("TRAN_TYPE_CFUTURE_REORG_OUT", 65) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CFUTURE_REORG_OUT
        {
            String str = "cfuturereorgout";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CFUTURE_REORG_OUT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CILEXACT = new TranTypeDto("TRAN_TYPE_CILEXACT", 66) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CILEXACT
        {
            String str = "cilexact";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CILEXACT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_COPTION_REORG = new TranTypeDto("TRAN_TYPE_COPTION_REORG", 67) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_COPTION_REORG
        {
            String str = "coptionreorg";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_COPTION_REORG;
        }
    };
    public static final TranTypeDto TRAN_TYPE_COPTION_REORG_IN = new TranTypeDto("TRAN_TYPE_COPTION_REORG_IN", 68) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_COPTION_REORG_IN
        {
            String str = "coptionreorgin";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_COPTION_REORG_IN;
        }
    };
    public static final TranTypeDto TRAN_TYPE_COPTION_REORG_OUT = new TranTypeDto("TRAN_TYPE_COPTION_REORG_OUT", 69) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_COPTION_REORG_OUT
        {
            String str = "coptionreorgout";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_COPTION_REORG_OUT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_COST_ADJ_BY_ID = new TranTypeDto("TRAN_TYPE_COST_ADJ_BY_ID", 70) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_COST_ADJ_BY_ID
        {
            String str = "costadjbyid";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_COST_ADJ_BY_ID;
        }
    };
    public static final TranTypeDto TRAN_TYPE_COVER_BY_ID = new TranTypeDto("TRAN_TYPE_COVER_BY_ID", 71) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_COVER_BY_ID
        {
            String str = "coverbyid";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_COVER_BY_ID;
        }
    };
    public static final TranTypeDto TRAN_TYPE_COVER_AGAINST_BOX_FIFO = new TranTypeDto("TRAN_TYPE_COVER_AGAINST_BOX_FIFO", 72) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_COVER_AGAINST_BOX_FIFO
        {
            String str = "coveragainstboxfifo";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_COVER_AGAINST_BOX_FIFO;
        }
    };
    public static final TranTypeDto TRAN_TYPE_COVER_SHORT = new TranTypeDto("TRAN_TYPE_COVER_SHORT", 73) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_COVER_SHORT
        {
            String str = "covershort";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_COVER_SHORT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CRET_CAPITAL = new TranTypeDto("TRAN_TYPE_CRET_CAPITAL", 74) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CRET_CAPITAL
        {
            String str = "cretcapital";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CRET_CAPITAL;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CRET_CAPITAL_BY_ID = new TranTypeDto("TRAN_TYPE_CRET_CAPITAL_BY_ID", 75) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CRET_CAPITAL_BY_ID
        {
            String str = "cretcapitalbyid";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CRET_CAPITAL_BY_ID;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CUITGRTR_COST_ADJ = new TranTypeDto("TRAN_TYPE_CUITGRTR_COST_ADJ", 76) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CUITGRTR_COST_ADJ
        {
            String str = "cuitgrtrcostadj";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CUITGRTR_COST_ADJ;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CUITRIC_COST_ADJ = new TranTypeDto("TRAN_TYPE_CUITRIC_COST_ADJ", 77) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CUITRIC_COST_ADJ
        {
            String str = "cuitriccostadj";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CUITRIC_COST_ADJ;
        }
    };
    public static final TranTypeDto TRAN_TYPE_DEPOSIT = new TranTypeDto("TRAN_TYPE_DEPOSIT", 78) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_DEPOSIT
        {
            String str = CryptoCostBasisDetailsListDuxo.SOURCE_TYPE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_DEPOSIT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_DEPOSITS_OPT = new TranTypeDto("TRAN_TYPE_DEPOSITS_OPT", 79) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_DEPOSITS_OPT
        {
            String str = "depositsopt";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_DEPOSITS_OPT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_DIV_RE = new TranTypeDto("TRAN_TYPE_DIV_RE", 80) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_DIV_RE
        {
            String str = "divre";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_DIV_RE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_EXERCISE = new TranTypeDto("TRAN_TYPE_EXERCISE", 81) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_EXERCISE
        {
            String str = "exercise";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_EXERCISE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_EXERCISE_B_SHARES = new TranTypeDto("TRAN_TYPE_EXERCISE_B_SHARES", 82) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_EXERCISE_B_SHARES
        {
            String str = "exercisebshares";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_EXERCISE_B_SHARES;
        }
    };
    public static final TranTypeDto TRAN_TYPE_EXERCISE_BUY = new TranTypeDto("TRAN_TYPE_EXERCISE_BUY", 83) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_EXERCISE_BUY
        {
            String str = "exercisebuy";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_EXERCISE_BUY;
        }
    };
    public static final TranTypeDto TRAN_TYPE_EXERCISE_CALL_CLOSE = new TranTypeDto("TRAN_TYPE_EXERCISE_CALL_CLOSE", 84) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_EXERCISE_CALL_CLOSE
        {
            String str = "exercisecallclose";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_EXERCISE_CALL_CLOSE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_EXERCISE_CALL_ML = new TranTypeDto("TRAN_TYPE_EXERCISE_CALL_ML", 85) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_EXERCISE_CALL_ML
        {
            String str = "exercisecallml";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_EXERCISE_CALL_ML;
        }
    };
    public static final TranTypeDto TRAN_TYPE_EXERCISE_CASH = new TranTypeDto("TRAN_TYPE_EXERCISE_CASH", 86) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_EXERCISE_CASH
        {
            String str = "exercisecash";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_EXERCISE_CASH;
        }
    };
    public static final TranTypeDto TRAN_TYPE_EXERCISE_CASH_SETTLED = new TranTypeDto("TRAN_TYPE_EXERCISE_CASH_SETTLED", 87) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_EXERCISE_CASH_SETTLED
        {
            String str = "exercisecashsettled";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_EXERCISE_CASH_SETTLED;
        }
    };
    public static final TranTypeDto TRAN_TYPE_EXERCISE_CLOSE = new TranTypeDto("TRAN_TYPE_EXERCISE_CLOSE", 88) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_EXERCISE_CLOSE
        {
            String str = "exerciseclose";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_EXERCISE_CLOSE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_EXERCISE_COUPON = new TranTypeDto("TRAN_TYPE_EXERCISE_COUPON", 89) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_EXERCISE_COUPON
        {
            String str = "exercisecoupon";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_EXERCISE_COUPON;
        }
    };
    public static final TranTypeDto TRAN_TYPE_EXERCISE_COVER_SHORT = new TranTypeDto("TRAN_TYPE_EXERCISE_COVER_SHORT", 90) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_EXERCISE_COVER_SHORT
        {
            String str = "exercisecovershort";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_EXERCISE_COVER_SHORT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_EXERCISE_COVER_SHORT_BY_ID = new TranTypeDto("TRAN_TYPE_EXERCISE_COVER_SHORT_BY_ID", 91) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_EXERCISE_COVER_SHORT_BY_ID
        {
            String str = "exercisecovershortbyid";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_EXERCISE_COVER_SHORT_BY_ID;
        }
    };
    public static final TranTypeDto TRAN_TYPE_EXERCISE_PUT_CLOSE = new TranTypeDto("TRAN_TYPE_EXERCISE_PUT_CLOSE", 92) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_EXERCISE_PUT_CLOSE
        {
            String str = "exerciseputclose";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_EXERCISE_PUT_CLOSE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_EXERCISE_PUT_ML = new TranTypeDto("TRAN_TYPE_EXERCISE_PUT_ML", 93) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_EXERCISE_PUT_ML
        {
            String str = "exerciseputml";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_EXERCISE_PUT_ML;
        }
    };
    public static final TranTypeDto TRAN_TYPE_EXERCISE_RIGHT = new TranTypeDto("TRAN_TYPE_EXERCISE_RIGHT", 94) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_EXERCISE_RIGHT
        {
            String str = "exerciseright";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_EXERCISE_RIGHT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_EXERCISE_SELL = new TranTypeDto("TRAN_TYPE_EXERCISE_SELL", 95) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_EXERCISE_SELL
        {
            String str = "exercisesell";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_EXERCISE_SELL;
        }
    };
    public static final TranTypeDto TRAN_TYPE_EXERCISE_SELL_BY_ID = new TranTypeDto("TRAN_TYPE_EXERCISE_SELL_BY_ID", 96) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_EXERCISE_SELL_BY_ID
        {
            String str = "exercisesellbyid";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_EXERCISE_SELL_BY_ID;
        }
    };
    public static final TranTypeDto TRAN_TYPE_EXERCISE_SELL_SHORT = new TranTypeDto("TRAN_TYPE_EXERCISE_SELL_SHORT", 97) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_EXERCISE_SELL_SHORT
        {
            String str = "exercisesellshort";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_EXERCISE_SELL_SHORT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_EXERCISE_WARRANT = new TranTypeDto("TRAN_TYPE_EXERCISE_WARRANT", 98) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_EXERCISE_WARRANT
        {
            String str = "exercisewarrant";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_EXERCISE_WARRANT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_EXPIRE = new TranTypeDto("TRAN_TYPE_EXPIRE", 99) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_EXPIRE
        {
            String str = "expire";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_EXPIRE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_EXPIRE_BY_ID = new TranTypeDto("TRAN_TYPE_EXPIRE_BY_ID", 100) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_EXPIRE_BY_ID
        {
            String str = "expirebyid";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_EXPIRE_BY_ID;
        }
    };
    public static final TranTypeDto TRAN_TYPE_EXPIRE_LONG = new TranTypeDto("TRAN_TYPE_EXPIRE_LONG", 101) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_EXPIRE_LONG
        {
            String str = "expirelong";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_EXPIRE_LONG;
        }
    };
    public static final TranTypeDto TRAN_TYPE_EXPIRE_SHORT = new TranTypeDto("TRAN_TYPE_EXPIRE_SHORT", 102) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_EXPIRE_SHORT
        {
            String str = "expireshort";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_EXPIRE_SHORT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_GAIN_LOSS = new TranTypeDto("TRAN_TYPE_GAIN_LOSS", 103) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_GAIN_LOSS
        {
            String str = "gainloss";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_GAIN_LOSS;
        }
    };
    public static final TranTypeDto TRAN_TYPE_INTEREST = new TranTypeDto("TRAN_TYPE_INTEREST", 104) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_INTEREST
        {
            String str = "interest";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_INTEREST;
        }
    };
    public static final TranTypeDto TRAN_TYPE_INTERNAL_TAX_LOT_TRANSFER = new TranTypeDto("TRAN_TYPE_INTERNAL_TAX_LOT_TRANSFER", 105) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_INTERNAL_TAX_LOT_TRANSFER
        {
            String str = "internaltaxlottransfer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_INTERNAL_TAX_LOT_TRANSFER;
        }
    };
    public static final TranTypeDto TRAN_TYPE_INTERNAL_TRANSFER_CONV_IN = new TranTypeDto("TRAN_TYPE_INTERNAL_TRANSFER_CONV_IN", 106) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_INTERNAL_TRANSFER_CONV_IN
        {
            String str = "internaltransferconvin";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_INTERNAL_TRANSFER_CONV_IN;
        }
    };
    public static final TranTypeDto TRAN_TYPE_INTERNAL_TRANSFER_CONV_OUT = new TranTypeDto("TRAN_TYPE_INTERNAL_TRANSFER_CONV_OUT", 107) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_INTERNAL_TRANSFER_CONV_OUT
        {
            String str = "internaltransferconvout";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_INTERNAL_TRANSFER_CONV_OUT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_INTERNAL_TRANSFER_CONV_OUT_BY_ID = new TranTypeDto("TRAN_TYPE_INTERNAL_TRANSFER_CONV_OUT_BY_ID", 108) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_INTERNAL_TRANSFER_CONV_OUT_BY_ID
        {
            String str = "internaltransferconvoutbyid";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_INTERNAL_TRANSFER_CONV_OUT_BY_ID;
        }
    };
    public static final TranTypeDto TRAN_TYPE_INTERNAL_TRANSFER_IN = new TranTypeDto("TRAN_TYPE_INTERNAL_TRANSFER_IN", 109) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_INTERNAL_TRANSFER_IN
        {
            String str = "internaltransferin";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_INTERNAL_TRANSFER_IN;
        }
    };
    public static final TranTypeDto TRAN_TYPE_INTERNAL_TRANSFER_OUT = new TranTypeDto("TRAN_TYPE_INTERNAL_TRANSFER_OUT", 110) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_INTERNAL_TRANSFER_OUT
        {
            String str = "internaltransferout";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_INTERNAL_TRANSFER_OUT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_INTERNAL_TRANSFER_OUT_BY_ID = new TranTypeDto("TRAN_TYPE_INTERNAL_TRANSFER_OUT_BY_ID", 111) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_INTERNAL_TRANSFER_OUT_BY_ID
        {
            String str = "internaltransferoutbyid";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_INTERNAL_TRANSFER_OUT_BY_ID;
        }
    };
    public static final TranTypeDto TRAN_TYPE_LIQUIDATION = new TranTypeDto("TRAN_TYPE_LIQUIDATION", 112) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_LIQUIDATION
        {
            String str = "liquidation";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_LIQUIDATION;
        }
    };
    public static final TranTypeDto TRAN_TYPE_LTRANSFER_CONV_IN = new TranTypeDto("TRAN_TYPE_LTRANSFER_CONV_IN", 113) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_LTRANSFER_CONV_IN
        {
            String str = "ltransferconvin";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_LTRANSFER_CONV_IN;
        }
    };
    public static final TranTypeDto TRAN_TYPE_LTRANSFER_CONV_OUT = new TranTypeDto("TRAN_TYPE_LTRANSFER_CONV_OUT", 114) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_LTRANSFER_CONV_OUT
        {
            String str = "ltransferconvout";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_LTRANSFER_CONV_OUT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_MARK_TO_MARKET_ALL = new TranTypeDto("TRAN_TYPE_MARK_TO_MARKET_ALL", 115) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_MARK_TO_MARKET_ALL
        {
            String str = "marktomarketall";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_MARK_TO_MARKET_ALL;
        }
    };
    public static final TranTypeDto TRAN_TYPE_MATURITY = new TranTypeDto("TRAN_TYPE_MATURITY", 116) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_MATURITY
        {
            String str = "maturity";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_MATURITY;
        }
    };
    public static final TranTypeDto TRAN_TYPE_MCA_TRAN = new TranTypeDto("TRAN_TYPE_MCA_TRAN", 117) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_MCA_TRAN
        {
            String str = "mcatran";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_MCA_TRAN;
        }
    };
    public static final TranTypeDto TRAN_TYPE_MCA_TRAN_IN = new TranTypeDto("TRAN_TYPE_MCA_TRAN_IN", 118) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_MCA_TRAN_IN
        {
            String str = "mcatranin";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_MCA_TRAN_IN;
        }
    };
    public static final TranTypeDto TRAN_TYPE_MCA_TRAN_OUT = new TranTypeDto("TRAN_TYPE_MCA_TRAN_OUT", 119) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_MCA_TRAN_OUT
        {
            String str = "mcatranout";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_MCA_TRAN_OUT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_OPEN_SHORT = new TranTypeDto("TRAN_TYPE_OPEN_SHORT", 120) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_OPEN_SHORT
        {
            String str = "openshort";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_OPEN_SHORT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_PAIR_OFF_BY_ID = new TranTypeDto("TRAN_TYPE_PAIR_OFF_BY_ID", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_PAIR_OFF_BY_ID
        {
            String str = "pairoffbyid";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_PAIR_OFF_BY_ID;
        }
    };
    public static final TranTypeDto TRAN_TYPE_PUT = new TranTypeDto("TRAN_TYPE_PUT", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_PUT
        {
            String str = "put";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_PUT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_REDEMPTION = new TranTypeDto("TRAN_TYPE_REDEMPTION", 123) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_REDEMPTION
        {
            String str = "redemption";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_REDEMPTION;
        }
    };
    public static final TranTypeDto TRAN_TYPE_ROC = new TranTypeDto("TRAN_TYPE_ROC", EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_ROC
        {
            String str = "roc";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_ROC;
        }
    };
    public static final TranTypeDto TRAN_TYPE_REMOVE_SHARES = new TranTypeDto("TRAN_TYPE_REMOVE_SHARES", 125) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_REMOVE_SHARES
        {
            String str = "removeshares";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_REMOVE_SHARES;
        }
    };
    public static final TranTypeDto TRAN_TYPE_REPO = new TranTypeDto("TRAN_TYPE_REPO", EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_REPO
        {
            String str = "repo";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_REPO;
        }
    };
    public static final TranTypeDto TRAN_TYPE_RETCAPITAL = new TranTypeDto("TRAN_TYPE_RETCAPITAL", EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_RETCAPITAL
        {
            String str = "retcapital";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_RETCAPITAL;
        }
    };
    public static final TranTypeDto TRAN_TYPE_REVERSE_REPO = new TranTypeDto("TRAN_TYPE_REVERSE_REPO", 128) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_REVERSE_REPO
        {
            String str = "reverserepo";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_REVERSE_REPO;
        }
    };
    public static final TranTypeDto TRAN_TYPE_RIGHTS_LAPSE = new TranTypeDto("TRAN_TYPE_RIGHTS_LAPSE", EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_RIGHTS_LAPSE
        {
            String str = "rightslapse";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_RIGHTS_LAPSE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_RIK = new TranTypeDto("TRAN_TYPE_RIK", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_RIK
        {
            String str = "rik";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_RIK;
        }
    };
    public static final TranTypeDto TRAN_TYPE_SELL = new TranTypeDto("TRAN_TYPE_SELL", 131) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_SELL
        {
            String str = "sell";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_SELL;
        }
    };
    public static final TranTypeDto TRAN_TYPE_SELL_AMT_BY_FIFO = new TranTypeDto("TRAN_TYPE_SELL_AMT_BY_FIFO", EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_SELL_AMT_BY_FIFO
        {
            String str = "sellamtbyfifo";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_SELL_AMT_BY_FIFO;
        }
    };
    public static final TranTypeDto TRAN_TYPE_SELL_AMT_BY_ID = new TranTypeDto("TRAN_TYPE_SELL_AMT_BY_ID", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_SELL_AMT_BY_ID
        {
            String str = "sellamtbyid";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_SELL_AMT_BY_ID;
        }
    };
    public static final TranTypeDto TRAN_TYPE_SELL_BY_ID = new TranTypeDto("TRAN_TYPE_SELL_BY_ID", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_SELL_BY_ID
        {
            String str = "sellbyid";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_SELL_BY_ID;
        }
    };
    public static final TranTypeDto TRAN_TYPE_SELL_SHORT = new TranTypeDto("TRAN_TYPE_SELL_SHORT", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_SELL_SHORT
        {
            String str = "sellshort";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_SELL_SHORT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_SELL_TO_CLOSE = new TranTypeDto("TRAN_TYPE_SELL_TO_CLOSE", 136) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_SELL_TO_CLOSE
        {
            String str = "selltoclose";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_SELL_TO_CLOSE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_SELL_TO_CLOSE_BY_ID = new TranTypeDto("TRAN_TYPE_SELL_TO_CLOSE_BY_ID", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_SELL_TO_CLOSE_BY_ID
        {
            String str = "selltoclosebyid";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_SELL_TO_CLOSE_BY_ID;
        }
    };
    public static final TranTypeDto TRAN_TYPE_SELL_TO_OPEN = new TranTypeDto("TRAN_TYPE_SELL_TO_OPEN", EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_SELL_TO_OPEN
        {
            String str = "selltoopen";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_SELL_TO_OPEN;
        }
    };
    public static final TranTypeDto TRAN_TYPE_SET_AVG_COST = new TranTypeDto("TRAN_TYPE_SET_AVG_COST", EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_SET_AVG_COST
        {
            String str = "setavgcost";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_SET_AVG_COST;
        }
    };
    public static final TranTypeDto TRAN_TYPE_SET_CDRP_BY_ID = new TranTypeDto("TRAN_TYPE_SET_CDRP_BY_ID", EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_SET_CDRP_BY_ID
        {
            String str = "setcdrpbyid";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_SET_CDRP_BY_ID;
        }
    };
    public static final TranTypeDto TRAN_TYPE_SET_COST_ALLOC_RIGHT_ISSUE = new TranTypeDto("TRAN_TYPE_SET_COST_ALLOC_RIGHT_ISSUE", EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_SET_COST_ALLOC_RIGHT_ISSUE
        {
            String str = "setcostallocrightissue";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_SET_COST_ALLOC_RIGHT_ISSUE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_SET_ELECTIONS = new TranTypeDto("TRAN_TYPE_SET_ELECTIONS", EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_SET_ELECTIONS
        {
            String str = "setelections";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_SET_ELECTIONS;
        }
    };
    public static final TranTypeDto TRAN_TYPE_SET_TRADING_METHOD = new TranTypeDto("TRAN_TYPE_SET_TRADING_METHOD", EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_SET_TRADING_METHOD
        {
            String str = "settradingmethod";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_SET_TRADING_METHOD;
        }
    };
    public static final TranTypeDto TRAN_TYPE_SUB_ACCT_TRANSFER = new TranTypeDto("TRAN_TYPE_SUB_ACCT_TRANSFER", 144) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_SUB_ACCT_TRANSFER
        {
            String str = "subaccttransfer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_SUB_ACCT_TRANSFER;
        }
    };
    public static final TranTypeDto TRAN_TYPE_SUB_ACCT_TRANSFER_BY_ID = new TranTypeDto("TRAN_TYPE_SUB_ACCT_TRANSFER_BY_ID", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_SUB_ACCT_TRANSFER_BY_ID
        {
            String str = "subaccttransferbyid";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_SUB_ACCT_TRANSFER_BY_ID;
        }
    };
    public static final TranTypeDto TRAN_TYPE_TAX_LOT_TRANSFER = new TranTypeDto("TRAN_TYPE_TAX_LOT_TRANSFER", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_TAX_LOT_TRANSFER
        {
            String str = "taxlottransfer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_TAX_LOT_TRANSFER;
        }
    };
    public static final TranTypeDto TRAN_TYPE_TENDER_SELL = new TranTypeDto("TRAN_TYPE_TENDER_SELL", 147) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_TENDER_SELL
        {
            String str = "tendersell";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_TENDER_SELL;
        }
    };
    public static final TranTypeDto TRAN_TYPE_TENDER_SELL_BY_ID = new TranTypeDto("TRAN_TYPE_TENDER_SELL_BY_ID", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_TENDER_SELL_BY_ID
        {
            String str = "tendersellbyid";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_TENDER_SELL_BY_ID;
        }
    };
    public static final TranTypeDto TRAN_TYPE_TRANSFER_IN_PLACE = new TranTypeDto("TRAN_TYPE_TRANSFER_IN_PLACE", EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_TRANSFER_IN_PLACE
        {
            String str = "transferinplace";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_TRANSFER_IN_PLACE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_TRANSFER_IN_PLACE_BY_ID = new TranTypeDto("TRAN_TYPE_TRANSFER_IN_PLACE_BY_ID", 150) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_TRANSFER_IN_PLACE_BY_ID
        {
            String str = "transferinplacebyid";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_TRANSFER_IN_PLACE_BY_ID;
        }
    };
    public static final TranTypeDto TRAN_TYPE_UNDIST_CAP_GAIN_ADJ = new TranTypeDto("TRAN_TYPE_UNDIST_CAP_GAIN_ADJ", 151) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_UNDIST_CAP_GAIN_ADJ
        {
            String str = "undistcapgainadj";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_UNDIST_CAP_GAIN_ADJ;
        }
    };
    public static final TranTypeDto TRAN_TYPE_UNDIST_CAP_GAIN_ADJ_BY_ID = new TranTypeDto("TRAN_TYPE_UNDIST_CAP_GAIN_ADJ_BY_ID", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_UNDIST_CAP_GAIN_ADJ_BY_ID
        {
            String str = "undistcapgainadjbyid";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_UNDIST_CAP_GAIN_ADJ_BY_ID;
        }
    };
    public static final TranTypeDto TRAN_TYPE_VCA_ELECTION = new TranTypeDto("TRAN_TYPE_VCA_ELECTION", EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_VCA_ELECTION
        {
            String str = "vcaelection";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_VCA_ELECTION;
        }
    };
    public static final TranTypeDto TRAN_TYPE_VCAFI_TRAN_IN = new TranTypeDto("TRAN_TYPE_VCAFI_TRAN_IN", EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_VCAFI_TRAN_IN
        {
            String str = "vcafitranin";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_VCAFI_TRAN_IN;
        }
    };
    public static final TranTypeDto TRAN_TYPE_VCAFI_TRAN_OUT = new TranTypeDto("TRAN_TYPE_VCAFI_TRAN_OUT", 155) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_VCAFI_TRAN_OUT
        {
            String str = "vcafitranout";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_VCAFI_TRAN_OUT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_VCA_TRAN = new TranTypeDto("TRAN_TYPE_VCA_TRAN", 156) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_VCA_TRAN
        {
            String str = "vcatran";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_VCA_TRAN;
        }
    };
    public static final TranTypeDto TRAN_TYPE_VCA_TRAN_IN = new TranTypeDto("TRAN_TYPE_VCA_TRAN_IN", EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_VCA_TRAN_IN
        {
            String str = "vcatranin";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_VCA_TRAN_IN;
        }
    };
    public static final TranTypeDto TRAN_TYPE_VCA_TRAN_OUT = new TranTypeDto("TRAN_TYPE_VCA_TRAN_OUT", EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_VCA_TRAN_OUT
        {
            String str = "vcatranout";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_VCA_TRAN_OUT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_VOID = new TranTypeDto("TRAN_TYPE_VOID", EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_VOID
        {
            String str = "void";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_VOID;
        }
    };
    public static final TranTypeDto TRAN_TYPE_WITHDRAW = new TranTypeDto("TRAN_TYPE_WITHDRAW", EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_WITHDRAW
        {
            String str = "withdraw";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_WITHDRAW;
        }
    };
    public static final TranTypeDto TRAN_TYPE_WITHDRAW_BY_ID = new TranTypeDto("TRAN_TYPE_WITHDRAW_BY_ID", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_WITHDRAW_BY_ID
        {
            String str = "withdrawbyid";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_WITHDRAW_BY_ID;
        }
    };
    public static final TranTypeDto TRAN_TYPE_WITHDRAW_SHORT = new TranTypeDto("TRAN_TYPE_WITHDRAW_SHORT", EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_WITHDRAW_SHORT
        {
            String str = "withdrawshort";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_WITHDRAW_SHORT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_WRITE_OFF = new TranTypeDto("TRAN_TYPE_WRITE_OFF", EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_WRITE_OFF
        {
            String str = "writeoff";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_WRITE_OFF;
        }
    };
    public static final TranTypeDto TRAN_TYPE_WS = new TranTypeDto("TRAN_TYPE_WS", EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_WS
        {
            String str = "ws";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_WS;
        }
    };
    public static final TranTypeDto TRAN_TYPE_WS_ADJ = new TranTypeDto("TRAN_TYPE_WS_ADJ", 165) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_WS_ADJ
        {
            String str = "wsadj";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_WS_ADJ;
        }
    };
    public static final TranTypeDto TRAN_TYPE_ASSIGN_COVER_SHORT_BY_ID = new TranTypeDto("TRAN_TYPE_ASSIGN_COVER_SHORT_BY_ID", EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_ASSIGN_COVER_SHORT_BY_ID
        {
            String str = "assigncovershortbyid";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_ASSIGN_COVER_SHORT_BY_ID;
        }
    };
    public static final TranTypeDto TRAN_TYPE_BANKRUPTCY_REORG = new TranTypeDto("TRAN_TYPE_BANKRUPTCY_REORG", 167) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_BANKRUPTCY_REORG
        {
            String str = "bankruptcy_reorg";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_BANKRUPTCY_REORG;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CASH_MERGER = new TranTypeDto("TRAN_TYPE_CASH_MERGER", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CASH_MERGER
        {
            String str = "cash_merger";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CASH_MERGER;
        }
    };
    public static final TranTypeDto TRAN_TYPE_COMPLETE_CALL = new TranTypeDto("TRAN_TYPE_COMPLETE_CALL", EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_COMPLETE_CALL
        {
            String str = "completecall";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_COMPLETE_CALL;
        }
    };
    public static final TranTypeDto TRAN_TYPE_COMPLETE_PUT = new TranTypeDto("TRAN_TYPE_COMPLETE_PUT", EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_COMPLETE_PUT
        {
            String str = "completeput";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_COMPLETE_PUT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CONV = new TranTypeDto("TRAN_TYPE_CONV", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CONV
        {
            String str = "conv";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CONV;
        }
    };
    public static final TranTypeDto TRAN_TYPE_DISTRIB_SPINOFF = new TranTypeDto("TRAN_TYPE_DISTRIB_SPINOFF", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_DISTRIB_SPINOFF
        {
            String str = "distrib_spinoff";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_DISTRIB_SPINOFF;
        }
    };
    public static final TranTypeDto TRAN_TYPE_EXCHANGE = new TranTypeDto("TRAN_TYPE_EXCHANGE", EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_EXCHANGE
        {
            String str = "exchange";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_EXCHANGE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_FIBANKRUPTCY_EXCHANGE = new TranTypeDto("TRAN_TYPE_FIBANKRUPTCY_EXCHANGE", EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_FIBANKRUPTCY_EXCHANGE
        {
            String str = "fibankruptcy_exchange";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_FIBANKRUPTCY_EXCHANGE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_FIEQUITY_LINKED_CONV = new TranTypeDto("TRAN_TYPE_FIEQUITY_LINKED_CONV", EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_FIEQUITY_LINKED_CONV
        {
            String str = "fiequity_linked_conv";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_FIEQUITY_LINKED_CONV;
        }
    };
    public static final TranTypeDto TRAN_TYPE_FIESCROW_DISTRIB = new TranTypeDto("TRAN_TYPE_FIESCROW_DISTRIB", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_FIESCROW_DISTRIB
        {
            String str = "fiescrow_distrib";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_FIESCROW_DISTRIB;
        }
    };
    public static final TranTypeDto TRAN_TYPE_FIEXCHANGE = new TranTypeDto("TRAN_TYPE_FIEXCHANGE", EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_FIEXCHANGE
        {
            String str = "fiexchange";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_FIEXCHANGE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_FIREORG_EXCHANGE = new TranTypeDto("TRAN_TYPE_FIREORG_EXCHANGE", EnumC7081g.f2773x8d9721ad) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_FIREORG_EXCHANGE
        {
            String str = "fireorg_exchange";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_FIREORG_EXCHANGE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_MERGER = new TranTypeDto("TRAN_TYPE_MERGER", EnumC7081g.f2780x600b66fe) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_MERGER
        {
            String str = "merger";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_MERGER;
        }
    };
    public static final TranTypeDto TRAN_TYPE_ODD_LOT_TENDER = new TranTypeDto("TRAN_TYPE_ODD_LOT_TENDER", EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_ODD_LOT_TENDER
        {
            String str = "odd_lot_tender";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_ODD_LOT_TENDER;
        }
    };
    public static final TranTypeDto TRAN_TYPE_PAIDOFF = new TranTypeDto("TRAN_TYPE_PAIDOFF", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_PAIDOFF
        {
            String str = "paidoff";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_PAIDOFF;
        }
    };
    public static final TranTypeDto TRAN_TYPE_REINCORPORATION = new TranTypeDto("TRAN_TYPE_REINCORPORATION", 182) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_REINCORPORATION
        {
            String str = "reincorporation";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_REINCORPORATION;
        }
    };
    public static final TranTypeDto TRAN_TYPE_REORGANIZATION = new TranTypeDto("TRAN_TYPE_REORGANIZATION", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_REORGANIZATION
        {
            String str = "reorganization";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_REORGANIZATION;
        }
    };
    public static final TranTypeDto TRAN_TYPE_RIGHTS_EXPIRE = new TranTypeDto("TRAN_TYPE_RIGHTS_EXPIRE", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_RIGHTS_EXPIRE
        {
            String str = "rights_expire";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_RIGHTS_EXPIRE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_TERMINATION = new TranTypeDto("TRAN_TYPE_TERMINATION", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_TERMINATION
        {
            String str = "termination";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_TERMINATION;
        }
    };
    public static final TranTypeDto TRAN_TYPE_VDUTCH_AUCTION_TENDER = new TranTypeDto("TRAN_TYPE_VDUTCH_AUCTION_TENDER", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_VDUTCH_AUCTION_TENDER
        {
            String str = "vdutchauctiontender";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_VDUTCH_AUCTION_TENDER;
        }
    };
    public static final TranTypeDto TRAN_TYPE_VEXCHANGE_OFFER = new TranTypeDto("TRAN_TYPE_VEXCHANGE_OFFER", EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_VEXCHANGE_OFFER
        {
            String str = "vexchangeoffer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_VEXCHANGE_OFFER;
        }
    };
    public static final TranTypeDto TRAN_TYPE_VMERGER = new TranTypeDto("TRAN_TYPE_VMERGER", 188) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_VMERGER
        {
            String str = "vmerger";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_VMERGER;
        }
    };
    public static final TranTypeDto TRAN_TYPE_VTENDER_NEW = new TranTypeDto("TRAN_TYPE_VTENDER_NEW", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_VTENDER_NEW
        {
            String str = "vtendernew";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_VTENDER_NEW;
        }
    };
    public static final TranTypeDto TRAN_TYPE_WARRANTS_EXPIRE = new TranTypeDto("TRAN_TYPE_WARRANTS_EXPIRE", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_WARRANTS_EXPIRE
        {
            String str = "warrants_expire";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_WARRANTS_EXPIRE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_DELISTING = new TranTypeDto("TRAN_TYPE_DELISTING", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_DELISTING
        {
            String str = "delisting";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_DELISTING;
        }
    };
    public static final TranTypeDto TRAN_TYPE_FI_DEEMED_EXTD_MATURITY = new TranTypeDto("TRAN_TYPE_FI_DEEMED_EXTD_MATURITY", 192) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_FI_DEEMED_EXTD_MATURITY
        {
            String str = "fideemed_extdmaturity";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_FI_DEEMED_EXTD_MATURITY;
        }
    };
    public static final TranTypeDto TRAN_TYPE_FI_DEEMED_PREREFUND = new TranTypeDto("TRAN_TYPE_FI_DEEMED_PREREFUND", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_FI_DEEMED_PREREFUND
        {
            String str = "fideemed_prerefund";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_FI_DEEMED_PREREFUND;
        }
    };
    public static final TranTypeDto TRAN_TYPE_FI_DEEMED_REMARKETING = new TranTypeDto("TRAN_TYPE_FI_DEEMED_REMARKETING", EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_FI_DEEMED_REMARKETING
        {
            String str = "fideemed_remarketing";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_FI_DEEMED_REMARKETING;
        }
    };
    public static final TranTypeDto TRAN_TYPE_LISTING_CHANGE = new TranTypeDto("TRAN_TYPE_LISTING_CHANGE", EnumC7081g.SDK_ASSET_ICON_ALERT_WARNING_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_LISTING_CHANGE
        {
            String str = "listing_change";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_LISTING_CHANGE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_NAME_SYMBOL_CHANGE = new TranTypeDto("TRAN_TYPE_NAME_SYMBOL_CHANGE", EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_NAME_SYMBOL_CHANGE
        {
            String str = "name_symbol_change";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_NAME_SYMBOL_CHANGE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_OPTION_REORG = new TranTypeDto("TRAN_TYPE_OPTION_REORG", EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_OPTION_REORG
        {
            String str = "option_reorg";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_OPTION_REORG;
        }
    };
    public static final TranTypeDto TRAN_TYPE_OPTION_SPLIT = new TranTypeDto("TRAN_TYPE_OPTION_SPLIT", EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_OPTION_SPLIT
        {
            String str = "option_split";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_OPTION_SPLIT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_OPTION_SYMBOL_CHANGE = new TranTypeDto("TRAN_TYPE_OPTION_SYMBOL_CHANGE", EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_OPTION_SYMBOL_CHANGE
        {
            String str = "option_symbol_change";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_OPTION_SYMBOL_CHANGE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_REVERSE_STOCK_SPLIT = new TranTypeDto("TRAN_TYPE_REVERSE_STOCK_SPLIT", 200) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_REVERSE_STOCK_SPLIT
        {
            String str = "reverse_stock_split";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_REVERSE_STOCK_SPLIT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_RIGHTS_ISSUE = new TranTypeDto("TRAN_TYPE_RIGHTS_ISSUE", 201) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_RIGHTS_ISSUE
        {
            String str = "rights_issue";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_RIGHTS_ISSUE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_WORTHLESS = new TranTypeDto("TRAN_TYPE_WORTHLESS", 202) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_WORTHLESS
        {
            String str = "worthless";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_WORTHLESS;
        }
    };
    public static final TranTypeDto TRAN_TYPE_ASSIMILATION = new TranTypeDto("TRAN_TYPE_ASSIMILATION", EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_ASSIMILATION
        {
            String str = "assimilation";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_ASSIMILATION;
        }
    };
    public static final TranTypeDto TRAN_TYPE_B_SHARES_EXPIRE = new TranTypeDto("TRAN_TYPE_B_SHARES_EXPIRE", 204) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_B_SHARES_EXPIRE
        {
            String str = "b_shares_expire";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_B_SHARES_EXPIRE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_B_SHARES_ISSUE = new TranTypeDto("TRAN_TYPE_B_SHARES_ISSUE", EnumC7081g.SDK_ASSET_ICON_CLIPBOARD_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_B_SHARES_ISSUE
        {
            String str = "b_shares_issue";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_B_SHARES_ISSUE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_BANKRUPTCY_PAYMENT = new TranTypeDto("TRAN_TYPE_BANKRUPTCY_PAYMENT", EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_BANKRUPTCY_PAYMENT
        {
            String str = "bankruptcy_payment";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_BANKRUPTCY_PAYMENT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_BONUS_ISSUE = new TranTypeDto("TRAN_TYPE_BONUS_ISSUE", EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_BONUS_ISSUE
        {
            String str = "bonus_issue";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_BONUS_ISSUE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CLOTPOOLTRANSFER = new TranTypeDto("TRAN_TYPE_CLOTPOOLTRANSFER", EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CLOTPOOLTRANSFER
        {
            String str = "clotpooltransfer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CLOTPOOLTRANSFER;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CLOTPOOLTRANSFERBYID = new TranTypeDto("TRAN_TYPE_CLOTPOOLTRANSFERBYID", EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CLOTPOOLTRANSFERBYID
        {
            String str = "clotpooltransferbyid";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CLOTPOOLTRANSFERBYID;
        }
    };
    public static final TranTypeDto TRAN_TYPE_COMPULSORY_ACQUISITION = new TranTypeDto("TRAN_TYPE_COMPULSORY_ACQUISITION", EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_COMPULSORY_ACQUISITION
        {
            String str = "compulsory_acquisition";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_COMPULSORY_ACQUISITION;
        }
    };
    public static final TranTypeDto TRAN_TYPE_COUPON_DISTRIB = new TranTypeDto("TRAN_TYPE_COUPON_DISTRIB", 211) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_COUPON_DISTRIB
        {
            String str = "coupon_distrib";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_COUPON_DISTRIB;
        }
    };
    public static final TranTypeDto TRAN_TYPE_COUPON_EXPIRE = new TranTypeDto("TRAN_TYPE_COUPON_EXPIRE", EnumC7081g.SDK_ASSET_ICON_OVERRIDE_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_COUPON_EXPIRE
        {
            String str = "coupon_expire";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_COUPON_EXPIRE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_CUNDISTCAPGAINADJ = new TranTypeDto("TRAN_TYPE_CUNDISTCAPGAINADJ", EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_CUNDISTCAPGAINADJ
        {
            String str = "cundistcapgainadj";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_CUNDISTCAPGAINADJ;
        }
    };
    public static final TranTypeDto TRAN_TYPE_DEEMED_DIVIDEND_ADJ = new TranTypeDto("TRAN_TYPE_DEEMED_DIVIDEND_ADJ", EnumC7081g.SDK_ASSET_ICON_PIN_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_DEEMED_DIVIDEND_ADJ
        {
            String str = "deemed_dividend_adj";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_DEEMED_DIVIDEND_ADJ;
        }
    };
    public static final TranTypeDto TRAN_TYPE_DEMERGER = new TranTypeDto("TRAN_TYPE_DEMERGER", EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_DEMERGER
        {
            String str = "demerger";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_DEMERGER;
        }
    };
    public static final TranTypeDto TRAN_TYPE_DEPAIRING = new TranTypeDto("TRAN_TYPE_DEPAIRING", EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_DEPAIRING
        {
            String str = "depairing";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_DEPAIRING;
        }
    };
    public static final TranTypeDto TRAN_TYPE_DIVREAUTO = new TranTypeDto("TRAN_TYPE_DIVREAUTO", EnumC7081g.SDK_ASSET_ICON_PROGRESS_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_DIVREAUTO
        {
            String str = "divreauto";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_DIVREAUTO;
        }
    };
    public static final TranTypeDto TRAN_TYPE_EXCHANGE_OFFER = new TranTypeDto("TRAN_TYPE_EXCHANGE_OFFER", EnumC7081g.SDK_ASSET_ICON_QUESTION_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_EXCHANGE_OFFER
        {
            String str = "exchange_offer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_EXCHANGE_OFFER;
        }
    };
    public static final TranTypeDto TRAN_TYPE_FICONVERSION = new TranTypeDto("TRAN_TYPE_FICONVERSION", EnumC7081g.SDK_ASSET_ICON_REJECTED_REC_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_FICONVERSION
        {
            String str = "ficonversion";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_FICONVERSION;
        }
    };
    public static final TranTypeDto TRAN_TYPE_FIDEEMED_REISSUE = new TranTypeDto("TRAN_TYPE_FIDEEMED_REISSUE", EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_FIDEEMED_REISSUE
        {
            String str = "fideemed_reissue";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_FIDEEMED_REISSUE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_FIDEFEASANCE = new TranTypeDto("TRAN_TYPE_FIDEFEASANCE", EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_FIDEFEASANCE
        {
            String str = "fidefeasance";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_FIDEFEASANCE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_FILIQUIDATION = new TranTypeDto("TRAN_TYPE_FILIQUIDATION", EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_FILIQUIDATION
        {
            String str = "filiquidation";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_FILIQUIDATION;
        }
    };
    public static final TranTypeDto TRAN_TYPE_FIPREREFUND = new TranTypeDto("TRAN_TYPE_FIPREREFUND", EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_FIPREREFUND
        {
            String str = "fiprerefund";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_FIPREREFUND;
        }
    };
    public static final TranTypeDto TRAN_TYPE_FIREDEMPTION_CONV = new TranTypeDto("TRAN_TYPE_FIREDEMPTION_CONV", 224) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_FIREDEMPTION_CONV
        {
            String str = "firedemption_conv";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_FIREDEMPTION_CONV;
        }
    };
    public static final TranTypeDto TRAN_TYPE_FIREORG_DISTRIB = new TranTypeDto("TRAN_TYPE_FIREORG_DISTRIB", 225) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_FIREORG_DISTRIB
        {
            String str = "fireorg_distrib";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_FIREORG_DISTRIB;
        }
    };
    public static final TranTypeDto TRAN_TYPE_FIREORG_EXCHANGE_OFFER = new TranTypeDto("TRAN_TYPE_FIREORG_EXCHANGE_OFFER", EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_FIREORG_EXCHANGE_OFFER
        {
            String str = "fireorg_exchange_offer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_FIREORG_EXCHANGE_OFFER;
        }
    };
    public static final TranTypeDto TRAN_TYPE_FORWARD_STOCK_SPLIT = new TranTypeDto("TRAN_TYPE_FORWARD_STOCK_SPLIT", EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_FORWARD_STOCK_SPLIT
        {
            String str = "forward_stock_split";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_FORWARD_STOCK_SPLIT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_FUTURE_LEAP_CONV = new TranTypeDto("TRAN_TYPE_FUTURE_LEAP_CONV", EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_FUTURE_LEAP_CONV
        {
            String str = "future_leap_conv";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_FUTURE_LEAP_CONV;
        }
    };
    public static final TranTypeDto TRAN_TYPE_FUTURE_NODIVRISK = new TranTypeDto("TRAN_TYPE_FUTURE_NODIVRISK", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_FUTURE_NODIVRISK
        {
            String str = "future_nodivrisk";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_FUTURE_NODIVRISK;
        }
    };
    public static final TranTypeDto TRAN_TYPE_FUTURE_REORG = new TranTypeDto("TRAN_TYPE_FUTURE_REORG", EnumC7081g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_FUTURE_REORG
        {
            String str = "future_reorg";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_FUTURE_REORG;
        }
    };
    public static final TranTypeDto TRAN_TYPE_FUTURE_SPLIT = new TranTypeDto("TRAN_TYPE_FUTURE_SPLIT", EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_FUTURE_SPLIT
        {
            String str = "future_split";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_FUTURE_SPLIT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_FUTURE_SYMBOL_CHANGE = new TranTypeDto("TRAN_TYPE_FUTURE_SYMBOL_CHANGE", EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_FUTURE_SYMBOL_CHANGE
        {
            String str = "future_symbol_change";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_FUTURE_SYMBOL_CHANGE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_LIQUIDATION_DIV = new TranTypeDto("TRAN_TYPE_LIQUIDATION_DIV", EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_LIQUIDATION_DIV
        {
            String str = "liquidation_div";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_LIQUIDATION_DIV;
        }
    };
    public static final TranTypeDto TRAN_TYPE_ODD_LOT_TENDER_SHARES = new TranTypeDto("TRAN_TYPE_ODD_LOT_TENDER_SHARES", EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_ODD_LOT_TENDER_SHARES
        {
            String str = "odd_lot_tender_shares";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_ODD_LOT_TENDER_SHARES;
        }
    };
    public static final TranTypeDto TRAN_TYPE_OPTION_LEAP_CONV = new TranTypeDto("TRAN_TYPE_OPTION_LEAP_CONV", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_OPTION_LEAP_CONV
        {
            String str = "option_leap_conv";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_OPTION_LEAP_CONV;
        }
    };
    public static final TranTypeDto TRAN_TYPE_PAID_IN_KIND_DIVIDEND = new TranTypeDto("TRAN_TYPE_PAID_IN_KIND_DIVIDEND", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_PAID_IN_KIND_DIVIDEND
        {
            String str = "paid_in_kind_dividend";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_PAID_IN_KIND_DIVIDEND;
        }
    };
    public static final TranTypeDto TRAN_TYPE_PLAN_OF_ARRANGEMENT = new TranTypeDto("TRAN_TYPE_PLAN_OF_ARRANGEMENT", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_PLAN_OF_ARRANGEMENT
        {
            String str = "plan_of_arrangement";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_PLAN_OF_ARRANGEMENT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_POISON_PILL = new TranTypeDto("TRAN_TYPE_POISON_PILL", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_POISON_PILL
        {
            String str = "poison_pill";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_POISON_PILL;
        }
    };
    public static final TranTypeDto TRAN_TYPE_REFPAYDOWNLOT = new TranTypeDto("TRAN_TYPE_REFPAYDOWNLOT", 239) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_REFPAYDOWNLOT
        {
            String str = "refpaydownlot";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_REFPAYDOWNLOT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_REMARKETING = new TranTypeDto("TRAN_TYPE_REMARKETING", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_REMARKETING
        {
            String str = "remarketing";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_REMARKETING;
        }
    };
    public static final TranTypeDto TRAN_TYPE_REORG_DISTRIB = new TranTypeDto("TRAN_TYPE_REORG_DISTRIB", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_REORG_DISTRIB
        {
            String str = "reorg_distrib";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_REORG_DISTRIB;
        }
    };
    public static final TranTypeDto TRAN_TYPE_REORG_EXCHANGE = new TranTypeDto("TRAN_TYPE_REORG_EXCHANGE", EnumC7081g.f2778x3356acf6) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_REORG_EXCHANGE
        {
            String str = "reorg_exchange";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_REORG_EXCHANGE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_REORG_EXCHANGEOFFER = new TranTypeDto("TRAN_TYPE_REORG_EXCHANGEOFFER", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_REORG_EXCHANGEOFFER
        {
            String str = "reorg_exchangeoffer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_REORG_EXCHANGEOFFER;
        }
    };
    public static final TranTypeDto TRAN_TYPE_RETURN_OF_CAPITAL = new TranTypeDto("TRAN_TYPE_RETURN_OF_CAPITAL", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_RETURN_OF_CAPITAL
        {
            String str = "return_of_capital";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_RETURN_OF_CAPITAL;
        }
    };
    public static final TranTypeDto TRAN_TYPE_RETURN_OF_PRINCIPAL = new TranTypeDto("TRAN_TYPE_RETURN_OF_PRINCIPAL", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_RETURN_OF_PRINCIPAL
        {
            String str = "return_of_principal";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_RETURN_OF_PRINCIPAL;
        }
    };
    public static final TranTypeDto TRAN_TYPE_SCHEME_OF_ARRANGEMENT = new TranTypeDto("TRAN_TYPE_SCHEME_OF_ARRANGEMENT", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_SCHEME_OF_ARRANGEMENT
        {
            String str = "scheme_of_arrangement";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_SCHEME_OF_ARRANGEMENT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_SEPARATION_OF_UNITS = new TranTypeDto("TRAN_TYPE_SEPARATION_OF_UNITS", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_SEPARATION_OF_UNITS
        {
            String str = "separation_of_units";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_SEPARATION_OF_UNITS;
        }
    };
    public static final TranTypeDto TRAN_TYPE_STOCK_DIVIDEND = new TranTypeDto("TRAN_TYPE_STOCK_DIVIDEND", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_STOCK_DIVIDEND
        {
            String str = "stock_dividend";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_STOCK_DIVIDEND;
        }
    };
    public static final TranTypeDto TRAN_TYPE_STOCK_SPLIT = new TranTypeDto("TRAN_TYPE_STOCK_SPLIT", EnumC7081g.f2779x59907a3d) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_STOCK_SPLIT
        {
            String str = "stock_split";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_STOCK_SPLIT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_SUBSCRIPTION_OFFER = new TranTypeDto("TRAN_TYPE_SUBSCRIPTION_OFFER", 250) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_SUBSCRIPTION_OFFER
        {
            String str = "subscription_offer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_SUBSCRIPTION_OFFER;
        }
    };
    public static final TranTypeDto TRAN_TYPE_SWING = new TranTypeDto("TRAN_TYPE_SWING", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_SWING
        {
            String str = "swing";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_SWING;
        }
    };
    public static final TranTypeDto TRAN_TYPE_TIERED_SPLIT = new TranTypeDto("TRAN_TYPE_TIERED_SPLIT", EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_TIERED_SPLIT
        {
            String str = "tiered_split";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_TIERED_SPLIT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_UIT_TERMINATION = new TranTypeDto("TRAN_TYPE_UIT_TERMINATION", EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_UIT_TERMINATION
        {
            String str = "uit_termination";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_UIT_TERMINATION;
        }
    };
    public static final TranTypeDto TRAN_TYPE_UNSTAPLING_OF_BUNDLED = new TranTypeDto("TRAN_TYPE_UNSTAPLING_OF_BUNDLED", EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_UNSTAPLING_OF_BUNDLED
        {
            String str = "unstapling_of_bundled";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_UNSTAPLING_OF_BUNDLED;
        }
    };
    public static final TranTypeDto TRAN_TYPE_VFIBANKRUPTCY_EXCHANGE = new TranTypeDto("TRAN_TYPE_VFIBANKRUPTCY_EXCHANGE", 255) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_VFIBANKRUPTCY_EXCHANGE
        {
            String str = "vfibankruptcy_exchange";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_VFIBANKRUPTCY_EXCHANGE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_VFIBANKRUPTCY_EXCHANGEOFFER = new TranTypeDto("TRAN_TYPE_VFIBANKRUPTCY_EXCHANGEOFFER", 256) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_VFIBANKRUPTCY_EXCHANGEOFFER
        {
            String str = "vfibankruptcy_exchangeoffer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_VFIBANKRUPTCY_EXCHANGEOFFER;
        }
    };
    public static final TranTypeDto TRAN_TYPE_VFIREORG_EXCHANGE = new TranTypeDto("TRAN_TYPE_VFIREORG_EXCHANGE", EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_VFIREORG_EXCHANGE
        {
            String str = "vfireorg_exchange";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_VFIREORG_EXCHANGE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_VFIREORG_EXCHANGEOFFER = new TranTypeDto("TRAN_TYPE_VFIREORG_EXCHANGEOFFER", EnumC7081g.SDK_ASSET_HEADER_BOLT_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_VFIREORG_EXCHANGEOFFER
        {
            String str = "vfireorg_exchangeoffer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_VFIREORG_EXCHANGEOFFER;
        }
    };
    public static final TranTypeDto TRAN_TYPE_WARRANTS_ISSUE = new TranTypeDto("TRAN_TYPE_WARRANTS_ISSUE", EnumC7081g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_WARRANTS_ISSUE
        {
            String str = "warrants_issue";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_WARRANTS_ISSUE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_UNKNOWN = new TranTypeDto("TRAN_TYPE_UNKNOWN", EnumC7081g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_UNKNOWN
        {
            String str = "unknown";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_UNKNOWN;
        }
    };
    public static final TranTypeDto TRAN_TYPE_GAINLOSSWS = new TranTypeDto("TRAN_TYPE_GAINLOSSWS", EnumC7081g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_GAINLOSSWS
        {
            String str = "gainlossws";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_GAINLOSSWS;
        }
    };
    public static final TranTypeDto TRAN_TYPE_EXERCISERTWT_BUY = new TranTypeDto("TRAN_TYPE_EXERCISERTWT_BUY", EnumC7081g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_EXERCISERTWT_BUY
        {
            String str = "exercisertwtbuy";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_EXERCISERTWT_BUY;
        }
    };
    public static final TranTypeDto TRAN_TYPE_EXERCISERTWT_CASH = new TranTypeDto("TRAN_TYPE_EXERCISERTWT_CASH", EnumC7081g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_EXERCISERTWT_CASH
        {
            String str = "exercisertwtcash";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_EXERCISERTWT_CASH;
        }
    };
    public static final TranTypeDto TRAN_TYPE_EXERCISERTWT_COVER_SHORT = new TranTypeDto("TRAN_TYPE_EXERCISERTWT_COVER_SHORT", EnumC7081g.SDK_ASSET_ICON_PLAID_LOGO_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_EXERCISERTWT_COVER_SHORT
        {
            String str = "exercisertwtcovershort";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_EXERCISERTWT_COVER_SHORT;
        }
    };
    public static final TranTypeDto TRAN_TYPE_EXERCISERTWT_COVER_SHORT_BY_ID = new TranTypeDto("TRAN_TYPE_EXERCISERTWT_COVER_SHORT_BY_ID", EnumC7081g.SDK_ASSET_HEADER_SHIELD_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_EXERCISERTWT_COVER_SHORT_BY_ID
        {
            String str = "exercisertwtcovershortbyid";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_EXERCISERTWT_COVER_SHORT_BY_ID;
        }
    };
    public static final TranTypeDto TRAN_TYPE_EXERCISERTWT_CLOSE = new TranTypeDto("TRAN_TYPE_EXERCISERTWT_CLOSE", EnumC7081g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_EXERCISERTWT_CLOSE
        {
            String str = "exercisertwtclose";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_EXERCISERTWT_CLOSE;
        }
    };
    public static final TranTypeDto TRAN_TYPE_EXERCISERTWT_ML = new TranTypeDto("TRAN_TYPE_EXERCISERTWT_ML", EnumC7081g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE) { // from class: cbc.service.v1.TranTypeDto.TRAN_TYPE_EXERCISERTWT_ML
        {
            String str = "exercisertwtml";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TranType toProto() {
            return TranType.TRAN_TYPE_EXERCISERTWT_ML;
        }
    };

    private static final /* synthetic */ TranTypeDto[] $values() {
        return new TranTypeDto[]{TRAN_TYPE_UNSPECIFIED, TRAN_TYPE_ADJ_BUY, TRAN_TYPE_ALIGN_DOWN, TRAN_TYPE_ALIGN_UP, TRAN_TYPE_ASSET_TRANSFER_IN, TRAN_TYPE_ASSET_TRANSFER_OUT, TRAN_TYPE_ASSET_TRANSFER_OUT_BY_ID, TRAN_TYPE_ASSIGN, TRAN_TYPE_ASSIGN_BUY, TRAN_TYPE_ASSIGN_CALL_CLOSE, TRAN_TYPE_ASSIGN_CALL_ML, TRAN_TYPE_ASSIGN_CASH, TRAN_TYPE_ASSIGN_CASH_SETTLED, TRAN_TYPE_ASSIGN_CLOSE, TRAN_TYPE_ASSIGN_COVER_SHORT, TRAN_TYPE_ASSIGN_PUT_CLOSE, TRAN_TYPE_ASSIGN_PUT_ML, TRAN_TYPE_ASSIGN_RIGHT, TRAN_TYPE_ASSIGN_SELL, TRAN_TYPE_ASSIGN_SELL_BY_ID, TRAN_TYPE_ASSIGN_SELL_SHORT, TRAN_TYPE_ASSIGN_SELL_SHORT_BY_ID, TRAN_TYPE_ASSIGN_WARRANT, TRAN_TYPE_AUTO_EXPIRE_ALL, TRAN_TYPE_BASELINE, TRAN_TYPE_BASELINE_LOSS, TRAN_TYPE_BASELINE_LOT, TRAN_TYPE_BASELINE_TAX_LOT, TRAN_TYPE_BASELINE_WS_ADJ, TRAN_TYPE_BOOK_TO_CERT_BY_ID, TRAN_TYPE_BUY, TRAN_TYPE_BUY_IN_KIND, TRAN_TYPE_BUY_TO_CLOSE, TRAN_TYPE_BUY_TO_CLOSE_BY_ID, TRAN_TYPE_BUY_TO_OPEN, TRAN_TYPE_CALL, TRAN_TYPE_CALL_PARTIAL, TRAN_TYPE_CANCEL, TRAN_TYPE_CANCEL_ACC, TRAN_TYPE_CASH_DIV, TRAN_TYPE_CASH_IN_LIEU, TRAN_TYPE_CASH_LIEU, TRAN_TYPE_CCONVERSION, TRAN_TYPE_CCONVERSION_IN, TRAN_TYPE_CCONVERSION_OUT, TRAN_TYPE_CCONVERSION_OUT_BY_ID, TRAN_TYPE_CDIV_RE, TRAN_TYPE_CERT_TO_BOOK_BY_ID, TRAN_TYPE_CFICONVERSION, TRAN_TYPE_CFICONVERSION_IN, TRAN_TYPE_CFICONVERSION_OUT, TRAN_TYPE_CFIDEFEASANCE, TRAN_TYPE_CFIDEFEASANCE_IN, TRAN_TYPE_CFIDEFEASANCE_OUT, TRAN_TYPE_CFIEXCHANGE, TRAN_TYPE_CFIEXCHANGE_IN, TRAN_TYPE_CFIEXCHANGE_OUT, TRAN_TYPE_CFIPREREFUND, TRAN_TYPE_CFIPREREFUND_IN, TRAN_TYPE_CFIPREREFUND_OUT, TRAN_TYPE_CFITENDER_CASH, TRAN_TYPE_CFITENDER_SELL, TRAN_TYPE_CFITENDER_SELL_BY_ID, TRAN_TYPE_CFUTURE_REORG, TRAN_TYPE_CFUTURE_REORG_IN, TRAN_TYPE_CFUTURE_REORG_OUT, TRAN_TYPE_CILEXACT, TRAN_TYPE_COPTION_REORG, TRAN_TYPE_COPTION_REORG_IN, TRAN_TYPE_COPTION_REORG_OUT, TRAN_TYPE_COST_ADJ_BY_ID, TRAN_TYPE_COVER_BY_ID, TRAN_TYPE_COVER_AGAINST_BOX_FIFO, TRAN_TYPE_COVER_SHORT, TRAN_TYPE_CRET_CAPITAL, TRAN_TYPE_CRET_CAPITAL_BY_ID, TRAN_TYPE_CUITGRTR_COST_ADJ, TRAN_TYPE_CUITRIC_COST_ADJ, TRAN_TYPE_DEPOSIT, TRAN_TYPE_DEPOSITS_OPT, TRAN_TYPE_DIV_RE, TRAN_TYPE_EXERCISE, TRAN_TYPE_EXERCISE_B_SHARES, TRAN_TYPE_EXERCISE_BUY, TRAN_TYPE_EXERCISE_CALL_CLOSE, TRAN_TYPE_EXERCISE_CALL_ML, TRAN_TYPE_EXERCISE_CASH, TRAN_TYPE_EXERCISE_CASH_SETTLED, TRAN_TYPE_EXERCISE_CLOSE, TRAN_TYPE_EXERCISE_COUPON, TRAN_TYPE_EXERCISE_COVER_SHORT, TRAN_TYPE_EXERCISE_COVER_SHORT_BY_ID, TRAN_TYPE_EXERCISE_PUT_CLOSE, TRAN_TYPE_EXERCISE_PUT_ML, TRAN_TYPE_EXERCISE_RIGHT, TRAN_TYPE_EXERCISE_SELL, TRAN_TYPE_EXERCISE_SELL_BY_ID, TRAN_TYPE_EXERCISE_SELL_SHORT, TRAN_TYPE_EXERCISE_WARRANT, TRAN_TYPE_EXPIRE, TRAN_TYPE_EXPIRE_BY_ID, TRAN_TYPE_EXPIRE_LONG, TRAN_TYPE_EXPIRE_SHORT, TRAN_TYPE_GAIN_LOSS, TRAN_TYPE_INTEREST, TRAN_TYPE_INTERNAL_TAX_LOT_TRANSFER, TRAN_TYPE_INTERNAL_TRANSFER_CONV_IN, TRAN_TYPE_INTERNAL_TRANSFER_CONV_OUT, TRAN_TYPE_INTERNAL_TRANSFER_CONV_OUT_BY_ID, TRAN_TYPE_INTERNAL_TRANSFER_IN, TRAN_TYPE_INTERNAL_TRANSFER_OUT, TRAN_TYPE_INTERNAL_TRANSFER_OUT_BY_ID, TRAN_TYPE_LIQUIDATION, TRAN_TYPE_LTRANSFER_CONV_IN, TRAN_TYPE_LTRANSFER_CONV_OUT, TRAN_TYPE_MARK_TO_MARKET_ALL, TRAN_TYPE_MATURITY, TRAN_TYPE_MCA_TRAN, TRAN_TYPE_MCA_TRAN_IN, TRAN_TYPE_MCA_TRAN_OUT, TRAN_TYPE_OPEN_SHORT, TRAN_TYPE_PAIR_OFF_BY_ID, TRAN_TYPE_PUT, TRAN_TYPE_REDEMPTION, TRAN_TYPE_ROC, TRAN_TYPE_REMOVE_SHARES, TRAN_TYPE_REPO, TRAN_TYPE_RETCAPITAL, TRAN_TYPE_REVERSE_REPO, TRAN_TYPE_RIGHTS_LAPSE, TRAN_TYPE_RIK, TRAN_TYPE_SELL, TRAN_TYPE_SELL_AMT_BY_FIFO, TRAN_TYPE_SELL_AMT_BY_ID, TRAN_TYPE_SELL_BY_ID, TRAN_TYPE_SELL_SHORT, TRAN_TYPE_SELL_TO_CLOSE, TRAN_TYPE_SELL_TO_CLOSE_BY_ID, TRAN_TYPE_SELL_TO_OPEN, TRAN_TYPE_SET_AVG_COST, TRAN_TYPE_SET_CDRP_BY_ID, TRAN_TYPE_SET_COST_ALLOC_RIGHT_ISSUE, TRAN_TYPE_SET_ELECTIONS, TRAN_TYPE_SET_TRADING_METHOD, TRAN_TYPE_SUB_ACCT_TRANSFER, TRAN_TYPE_SUB_ACCT_TRANSFER_BY_ID, TRAN_TYPE_TAX_LOT_TRANSFER, TRAN_TYPE_TENDER_SELL, TRAN_TYPE_TENDER_SELL_BY_ID, TRAN_TYPE_TRANSFER_IN_PLACE, TRAN_TYPE_TRANSFER_IN_PLACE_BY_ID, TRAN_TYPE_UNDIST_CAP_GAIN_ADJ, TRAN_TYPE_UNDIST_CAP_GAIN_ADJ_BY_ID, TRAN_TYPE_VCA_ELECTION, TRAN_TYPE_VCAFI_TRAN_IN, TRAN_TYPE_VCAFI_TRAN_OUT, TRAN_TYPE_VCA_TRAN, TRAN_TYPE_VCA_TRAN_IN, TRAN_TYPE_VCA_TRAN_OUT, TRAN_TYPE_VOID, TRAN_TYPE_WITHDRAW, TRAN_TYPE_WITHDRAW_BY_ID, TRAN_TYPE_WITHDRAW_SHORT, TRAN_TYPE_WRITE_OFF, TRAN_TYPE_WS, TRAN_TYPE_WS_ADJ, TRAN_TYPE_ASSIGN_COVER_SHORT_BY_ID, TRAN_TYPE_BANKRUPTCY_REORG, TRAN_TYPE_CASH_MERGER, TRAN_TYPE_COMPLETE_CALL, TRAN_TYPE_COMPLETE_PUT, TRAN_TYPE_CONV, TRAN_TYPE_DISTRIB_SPINOFF, TRAN_TYPE_EXCHANGE, TRAN_TYPE_FIBANKRUPTCY_EXCHANGE, TRAN_TYPE_FIEQUITY_LINKED_CONV, TRAN_TYPE_FIESCROW_DISTRIB, TRAN_TYPE_FIEXCHANGE, TRAN_TYPE_FIREORG_EXCHANGE, TRAN_TYPE_MERGER, TRAN_TYPE_ODD_LOT_TENDER, TRAN_TYPE_PAIDOFF, TRAN_TYPE_REINCORPORATION, TRAN_TYPE_REORGANIZATION, TRAN_TYPE_RIGHTS_EXPIRE, TRAN_TYPE_TERMINATION, TRAN_TYPE_VDUTCH_AUCTION_TENDER, TRAN_TYPE_VEXCHANGE_OFFER, TRAN_TYPE_VMERGER, TRAN_TYPE_VTENDER_NEW, TRAN_TYPE_WARRANTS_EXPIRE, TRAN_TYPE_DELISTING, TRAN_TYPE_FI_DEEMED_EXTD_MATURITY, TRAN_TYPE_FI_DEEMED_PREREFUND, TRAN_TYPE_FI_DEEMED_REMARKETING, TRAN_TYPE_LISTING_CHANGE, TRAN_TYPE_NAME_SYMBOL_CHANGE, TRAN_TYPE_OPTION_REORG, TRAN_TYPE_OPTION_SPLIT, TRAN_TYPE_OPTION_SYMBOL_CHANGE, TRAN_TYPE_REVERSE_STOCK_SPLIT, TRAN_TYPE_RIGHTS_ISSUE, TRAN_TYPE_WORTHLESS, TRAN_TYPE_ASSIMILATION, TRAN_TYPE_B_SHARES_EXPIRE, TRAN_TYPE_B_SHARES_ISSUE, TRAN_TYPE_BANKRUPTCY_PAYMENT, TRAN_TYPE_BONUS_ISSUE, TRAN_TYPE_CLOTPOOLTRANSFER, TRAN_TYPE_CLOTPOOLTRANSFERBYID, TRAN_TYPE_COMPULSORY_ACQUISITION, TRAN_TYPE_COUPON_DISTRIB, TRAN_TYPE_COUPON_EXPIRE, TRAN_TYPE_CUNDISTCAPGAINADJ, TRAN_TYPE_DEEMED_DIVIDEND_ADJ, TRAN_TYPE_DEMERGER, TRAN_TYPE_DEPAIRING, TRAN_TYPE_DIVREAUTO, TRAN_TYPE_EXCHANGE_OFFER, TRAN_TYPE_FICONVERSION, TRAN_TYPE_FIDEEMED_REISSUE, TRAN_TYPE_FIDEFEASANCE, TRAN_TYPE_FILIQUIDATION, TRAN_TYPE_FIPREREFUND, TRAN_TYPE_FIREDEMPTION_CONV, TRAN_TYPE_FIREORG_DISTRIB, TRAN_TYPE_FIREORG_EXCHANGE_OFFER, TRAN_TYPE_FORWARD_STOCK_SPLIT, TRAN_TYPE_FUTURE_LEAP_CONV, TRAN_TYPE_FUTURE_NODIVRISK, TRAN_TYPE_FUTURE_REORG, TRAN_TYPE_FUTURE_SPLIT, TRAN_TYPE_FUTURE_SYMBOL_CHANGE, TRAN_TYPE_LIQUIDATION_DIV, TRAN_TYPE_ODD_LOT_TENDER_SHARES, TRAN_TYPE_OPTION_LEAP_CONV, TRAN_TYPE_PAID_IN_KIND_DIVIDEND, TRAN_TYPE_PLAN_OF_ARRANGEMENT, TRAN_TYPE_POISON_PILL, TRAN_TYPE_REFPAYDOWNLOT, TRAN_TYPE_REMARKETING, TRAN_TYPE_REORG_DISTRIB, TRAN_TYPE_REORG_EXCHANGE, TRAN_TYPE_REORG_EXCHANGEOFFER, TRAN_TYPE_RETURN_OF_CAPITAL, TRAN_TYPE_RETURN_OF_PRINCIPAL, TRAN_TYPE_SCHEME_OF_ARRANGEMENT, TRAN_TYPE_SEPARATION_OF_UNITS, TRAN_TYPE_STOCK_DIVIDEND, TRAN_TYPE_STOCK_SPLIT, TRAN_TYPE_SUBSCRIPTION_OFFER, TRAN_TYPE_SWING, TRAN_TYPE_TIERED_SPLIT, TRAN_TYPE_UIT_TERMINATION, TRAN_TYPE_UNSTAPLING_OF_BUNDLED, TRAN_TYPE_VFIBANKRUPTCY_EXCHANGE, TRAN_TYPE_VFIBANKRUPTCY_EXCHANGEOFFER, TRAN_TYPE_VFIREORG_EXCHANGE, TRAN_TYPE_VFIREORG_EXCHANGEOFFER, TRAN_TYPE_WARRANTS_ISSUE, TRAN_TYPE_UNKNOWN, TRAN_TYPE_GAINLOSSWS, TRAN_TYPE_EXERCISERTWT_BUY, TRAN_TYPE_EXERCISERTWT_CASH, TRAN_TYPE_EXERCISERTWT_COVER_SHORT, TRAN_TYPE_EXERCISERTWT_COVER_SHORT_BY_ID, TRAN_TYPE_EXERCISERTWT_CLOSE, TRAN_TYPE_EXERCISERTWT_ML};
    }

    public /* synthetic */ TranTypeDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<TranTypeDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TranTypeDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        TranTypeDto[] tranTypeDtoArr$values = $values();
        $VALUES = tranTypeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(tranTypeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: cbc.service.v1.TranTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TranTypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: TranTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcbc/service/v1/TranTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcbc/service/v1/TranTypeDto;", "Lcbc/service/v1/TranType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcbc/service/v1/TranTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "cbc.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<TranTypeDto, TranType> {

        /* compiled from: TranTypeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes16.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TranType.values().length];
                try {
                    iArr[TranType.TRAN_TYPE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_ADJ_BUY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_ALIGN_DOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_ALIGN_UP.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_ASSET_TRANSFER_IN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_ASSET_TRANSFER_OUT.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_ASSET_TRANSFER_OUT_BY_ID.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_ASSIGN.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_ASSIGN_BUY.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_ASSIGN_CALL_CLOSE.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_ASSIGN_CALL_ML.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_ASSIGN_CASH.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_ASSIGN_CASH_SETTLED.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_ASSIGN_CLOSE.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_ASSIGN_COVER_SHORT.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_ASSIGN_PUT_CLOSE.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_ASSIGN_PUT_ML.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_ASSIGN_RIGHT.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_ASSIGN_SELL.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_ASSIGN_SELL_BY_ID.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_ASSIGN_SELL_SHORT.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_ASSIGN_SELL_SHORT_BY_ID.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_ASSIGN_WARRANT.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_AUTO_EXPIRE_ALL.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_BASELINE.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_BASELINE_LOSS.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_BASELINE_LOT.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_BASELINE_TAX_LOT.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_BASELINE_WS_ADJ.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_BOOK_TO_CERT_BY_ID.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_BUY.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_BUY_IN_KIND.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_BUY_TO_CLOSE.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_BUY_TO_CLOSE_BY_ID.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_BUY_TO_OPEN.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CALL.ordinal()] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CALL_PARTIAL.ordinal()] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CANCEL.ordinal()] = 38;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CANCEL_ACC.ordinal()] = 39;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CASH_DIV.ordinal()] = 40;
                } catch (NoSuchFieldError unused40) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CASH_IN_LIEU.ordinal()] = 41;
                } catch (NoSuchFieldError unused41) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CASH_LIEU.ordinal()] = 42;
                } catch (NoSuchFieldError unused42) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CCONVERSION.ordinal()] = 43;
                } catch (NoSuchFieldError unused43) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CCONVERSION_IN.ordinal()] = 44;
                } catch (NoSuchFieldError unused44) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CCONVERSION_OUT.ordinal()] = 45;
                } catch (NoSuchFieldError unused45) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CCONVERSION_OUT_BY_ID.ordinal()] = 46;
                } catch (NoSuchFieldError unused46) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CDIV_RE.ordinal()] = 47;
                } catch (NoSuchFieldError unused47) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CERT_TO_BOOK_BY_ID.ordinal()] = 48;
                } catch (NoSuchFieldError unused48) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CFICONVERSION.ordinal()] = 49;
                } catch (NoSuchFieldError unused49) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CFICONVERSION_IN.ordinal()] = 50;
                } catch (NoSuchFieldError unused50) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CFICONVERSION_OUT.ordinal()] = 51;
                } catch (NoSuchFieldError unused51) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CFIDEFEASANCE.ordinal()] = 52;
                } catch (NoSuchFieldError unused52) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CFIDEFEASANCE_IN.ordinal()] = 53;
                } catch (NoSuchFieldError unused53) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CFIDEFEASANCE_OUT.ordinal()] = 54;
                } catch (NoSuchFieldError unused54) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CFIEXCHANGE.ordinal()] = 55;
                } catch (NoSuchFieldError unused55) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CFIEXCHANGE_IN.ordinal()] = 56;
                } catch (NoSuchFieldError unused56) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CFIEXCHANGE_OUT.ordinal()] = 57;
                } catch (NoSuchFieldError unused57) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CFIPREREFUND.ordinal()] = 58;
                } catch (NoSuchFieldError unused58) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CFIPREREFUND_IN.ordinal()] = 59;
                } catch (NoSuchFieldError unused59) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CFIPREREFUND_OUT.ordinal()] = 60;
                } catch (NoSuchFieldError unused60) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CFITENDER_CASH.ordinal()] = 61;
                } catch (NoSuchFieldError unused61) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CFITENDER_SELL.ordinal()] = 62;
                } catch (NoSuchFieldError unused62) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CFITENDER_SELL_BY_ID.ordinal()] = 63;
                } catch (NoSuchFieldError unused63) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CFUTURE_REORG.ordinal()] = 64;
                } catch (NoSuchFieldError unused64) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CFUTURE_REORG_IN.ordinal()] = 65;
                } catch (NoSuchFieldError unused65) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CFUTURE_REORG_OUT.ordinal()] = 66;
                } catch (NoSuchFieldError unused66) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CILEXACT.ordinal()] = 67;
                } catch (NoSuchFieldError unused67) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_COPTION_REORG.ordinal()] = 68;
                } catch (NoSuchFieldError unused68) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_COPTION_REORG_IN.ordinal()] = 69;
                } catch (NoSuchFieldError unused69) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_COPTION_REORG_OUT.ordinal()] = 70;
                } catch (NoSuchFieldError unused70) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_COST_ADJ_BY_ID.ordinal()] = 71;
                } catch (NoSuchFieldError unused71) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_COVER_BY_ID.ordinal()] = 72;
                } catch (NoSuchFieldError unused72) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_COVER_AGAINST_BOX_FIFO.ordinal()] = 73;
                } catch (NoSuchFieldError unused73) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_COVER_SHORT.ordinal()] = 74;
                } catch (NoSuchFieldError unused74) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CRET_CAPITAL.ordinal()] = 75;
                } catch (NoSuchFieldError unused75) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CRET_CAPITAL_BY_ID.ordinal()] = 76;
                } catch (NoSuchFieldError unused76) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CUITGRTR_COST_ADJ.ordinal()] = 77;
                } catch (NoSuchFieldError unused77) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CUITRIC_COST_ADJ.ordinal()] = 78;
                } catch (NoSuchFieldError unused78) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_DEPOSIT.ordinal()] = 79;
                } catch (NoSuchFieldError unused79) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_DEPOSITS_OPT.ordinal()] = 80;
                } catch (NoSuchFieldError unused80) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_DIV_RE.ordinal()] = 81;
                } catch (NoSuchFieldError unused81) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_EXERCISE.ordinal()] = 82;
                } catch (NoSuchFieldError unused82) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_EXERCISE_B_SHARES.ordinal()] = 83;
                } catch (NoSuchFieldError unused83) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_EXERCISE_BUY.ordinal()] = 84;
                } catch (NoSuchFieldError unused84) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_EXERCISE_CALL_CLOSE.ordinal()] = 85;
                } catch (NoSuchFieldError unused85) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_EXERCISE_CALL_ML.ordinal()] = 86;
                } catch (NoSuchFieldError unused86) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_EXERCISE_CASH.ordinal()] = 87;
                } catch (NoSuchFieldError unused87) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_EXERCISE_CASH_SETTLED.ordinal()] = 88;
                } catch (NoSuchFieldError unused88) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_EXERCISE_CLOSE.ordinal()] = 89;
                } catch (NoSuchFieldError unused89) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_EXERCISE_COUPON.ordinal()] = 90;
                } catch (NoSuchFieldError unused90) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_EXERCISE_COVER_SHORT.ordinal()] = 91;
                } catch (NoSuchFieldError unused91) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_EXERCISE_COVER_SHORT_BY_ID.ordinal()] = 92;
                } catch (NoSuchFieldError unused92) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_EXERCISE_PUT_CLOSE.ordinal()] = 93;
                } catch (NoSuchFieldError unused93) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_EXERCISE_PUT_ML.ordinal()] = 94;
                } catch (NoSuchFieldError unused94) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_EXERCISE_RIGHT.ordinal()] = 95;
                } catch (NoSuchFieldError unused95) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_EXERCISE_SELL.ordinal()] = 96;
                } catch (NoSuchFieldError unused96) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_EXERCISE_SELL_BY_ID.ordinal()] = 97;
                } catch (NoSuchFieldError unused97) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_EXERCISE_SELL_SHORT.ordinal()] = 98;
                } catch (NoSuchFieldError unused98) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_EXERCISE_WARRANT.ordinal()] = 99;
                } catch (NoSuchFieldError unused99) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_EXPIRE.ordinal()] = 100;
                } catch (NoSuchFieldError unused100) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_EXPIRE_BY_ID.ordinal()] = 101;
                } catch (NoSuchFieldError unused101) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_EXPIRE_LONG.ordinal()] = 102;
                } catch (NoSuchFieldError unused102) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_EXPIRE_SHORT.ordinal()] = 103;
                } catch (NoSuchFieldError unused103) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_GAIN_LOSS.ordinal()] = 104;
                } catch (NoSuchFieldError unused104) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_INTEREST.ordinal()] = 105;
                } catch (NoSuchFieldError unused105) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_INTERNAL_TAX_LOT_TRANSFER.ordinal()] = 106;
                } catch (NoSuchFieldError unused106) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_INTERNAL_TRANSFER_CONV_IN.ordinal()] = 107;
                } catch (NoSuchFieldError unused107) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_INTERNAL_TRANSFER_CONV_OUT.ordinal()] = 108;
                } catch (NoSuchFieldError unused108) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_INTERNAL_TRANSFER_CONV_OUT_BY_ID.ordinal()] = 109;
                } catch (NoSuchFieldError unused109) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_INTERNAL_TRANSFER_IN.ordinal()] = 110;
                } catch (NoSuchFieldError unused110) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_INTERNAL_TRANSFER_OUT.ordinal()] = 111;
                } catch (NoSuchFieldError unused111) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_INTERNAL_TRANSFER_OUT_BY_ID.ordinal()] = 112;
                } catch (NoSuchFieldError unused112) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_LIQUIDATION.ordinal()] = 113;
                } catch (NoSuchFieldError unused113) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_LTRANSFER_CONV_IN.ordinal()] = 114;
                } catch (NoSuchFieldError unused114) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_LTRANSFER_CONV_OUT.ordinal()] = 115;
                } catch (NoSuchFieldError unused115) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_MARK_TO_MARKET_ALL.ordinal()] = 116;
                } catch (NoSuchFieldError unused116) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_MATURITY.ordinal()] = 117;
                } catch (NoSuchFieldError unused117) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_MCA_TRAN.ordinal()] = 118;
                } catch (NoSuchFieldError unused118) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_MCA_TRAN_IN.ordinal()] = 119;
                } catch (NoSuchFieldError unused119) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_MCA_TRAN_OUT.ordinal()] = 120;
                } catch (NoSuchFieldError unused120) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_OPEN_SHORT.ordinal()] = 121;
                } catch (NoSuchFieldError unused121) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_PAIR_OFF_BY_ID.ordinal()] = 122;
                } catch (NoSuchFieldError unused122) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_PUT.ordinal()] = 123;
                } catch (NoSuchFieldError unused123) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_REDEMPTION.ordinal()] = 124;
                } catch (NoSuchFieldError unused124) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_ROC.ordinal()] = 125;
                } catch (NoSuchFieldError unused125) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_REMOVE_SHARES.ordinal()] = 126;
                } catch (NoSuchFieldError unused126) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_REPO.ordinal()] = 127;
                } catch (NoSuchFieldError unused127) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_RETCAPITAL.ordinal()] = 128;
                } catch (NoSuchFieldError unused128) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_REVERSE_REPO.ordinal()] = 129;
                } catch (NoSuchFieldError unused129) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_RIGHTS_LAPSE.ordinal()] = 130;
                } catch (NoSuchFieldError unused130) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_RIK.ordinal()] = 131;
                } catch (NoSuchFieldError unused131) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_SELL.ordinal()] = 132;
                } catch (NoSuchFieldError unused132) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_SELL_AMT_BY_FIFO.ordinal()] = 133;
                } catch (NoSuchFieldError unused133) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_SELL_AMT_BY_ID.ordinal()] = 134;
                } catch (NoSuchFieldError unused134) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_SELL_BY_ID.ordinal()] = 135;
                } catch (NoSuchFieldError unused135) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_SELL_SHORT.ordinal()] = 136;
                } catch (NoSuchFieldError unused136) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_SELL_TO_CLOSE.ordinal()] = 137;
                } catch (NoSuchFieldError unused137) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_SELL_TO_CLOSE_BY_ID.ordinal()] = 138;
                } catch (NoSuchFieldError unused138) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_SELL_TO_OPEN.ordinal()] = 139;
                } catch (NoSuchFieldError unused139) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_SET_AVG_COST.ordinal()] = 140;
                } catch (NoSuchFieldError unused140) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_SET_CDRP_BY_ID.ordinal()] = 141;
                } catch (NoSuchFieldError unused141) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_SET_COST_ALLOC_RIGHT_ISSUE.ordinal()] = 142;
                } catch (NoSuchFieldError unused142) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_SET_ELECTIONS.ordinal()] = 143;
                } catch (NoSuchFieldError unused143) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_SET_TRADING_METHOD.ordinal()] = 144;
                } catch (NoSuchFieldError unused144) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_SUB_ACCT_TRANSFER.ordinal()] = 145;
                } catch (NoSuchFieldError unused145) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_SUB_ACCT_TRANSFER_BY_ID.ordinal()] = 146;
                } catch (NoSuchFieldError unused146) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_TAX_LOT_TRANSFER.ordinal()] = 147;
                } catch (NoSuchFieldError unused147) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_TENDER_SELL.ordinal()] = 148;
                } catch (NoSuchFieldError unused148) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_TENDER_SELL_BY_ID.ordinal()] = 149;
                } catch (NoSuchFieldError unused149) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_TRANSFER_IN_PLACE.ordinal()] = 150;
                } catch (NoSuchFieldError unused150) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_TRANSFER_IN_PLACE_BY_ID.ordinal()] = 151;
                } catch (NoSuchFieldError unused151) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_UNDIST_CAP_GAIN_ADJ.ordinal()] = 152;
                } catch (NoSuchFieldError unused152) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_UNDIST_CAP_GAIN_ADJ_BY_ID.ordinal()] = 153;
                } catch (NoSuchFieldError unused153) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_VCA_ELECTION.ordinal()] = 154;
                } catch (NoSuchFieldError unused154) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_VCAFI_TRAN_IN.ordinal()] = 155;
                } catch (NoSuchFieldError unused155) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_VCAFI_TRAN_OUT.ordinal()] = 156;
                } catch (NoSuchFieldError unused156) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_VCA_TRAN.ordinal()] = 157;
                } catch (NoSuchFieldError unused157) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_VCA_TRAN_IN.ordinal()] = 158;
                } catch (NoSuchFieldError unused158) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_VCA_TRAN_OUT.ordinal()] = 159;
                } catch (NoSuchFieldError unused159) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_VOID.ordinal()] = 160;
                } catch (NoSuchFieldError unused160) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_WITHDRAW.ordinal()] = 161;
                } catch (NoSuchFieldError unused161) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_WITHDRAW_BY_ID.ordinal()] = 162;
                } catch (NoSuchFieldError unused162) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_WITHDRAW_SHORT.ordinal()] = 163;
                } catch (NoSuchFieldError unused163) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_WRITE_OFF.ordinal()] = 164;
                } catch (NoSuchFieldError unused164) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_WS.ordinal()] = 165;
                } catch (NoSuchFieldError unused165) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_WS_ADJ.ordinal()] = 166;
                } catch (NoSuchFieldError unused166) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_ASSIGN_COVER_SHORT_BY_ID.ordinal()] = 167;
                } catch (NoSuchFieldError unused167) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_BANKRUPTCY_REORG.ordinal()] = 168;
                } catch (NoSuchFieldError unused168) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CASH_MERGER.ordinal()] = 169;
                } catch (NoSuchFieldError unused169) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_COMPLETE_CALL.ordinal()] = 170;
                } catch (NoSuchFieldError unused170) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_COMPLETE_PUT.ordinal()] = 171;
                } catch (NoSuchFieldError unused171) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CONV.ordinal()] = 172;
                } catch (NoSuchFieldError unused172) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_DISTRIB_SPINOFF.ordinal()] = 173;
                } catch (NoSuchFieldError unused173) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_EXCHANGE.ordinal()] = 174;
                } catch (NoSuchFieldError unused174) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_FIBANKRUPTCY_EXCHANGE.ordinal()] = 175;
                } catch (NoSuchFieldError unused175) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_FIEQUITY_LINKED_CONV.ordinal()] = 176;
                } catch (NoSuchFieldError unused176) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_FIESCROW_DISTRIB.ordinal()] = 177;
                } catch (NoSuchFieldError unused177) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_FIEXCHANGE.ordinal()] = 178;
                } catch (NoSuchFieldError unused178) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_FIREORG_EXCHANGE.ordinal()] = 179;
                } catch (NoSuchFieldError unused179) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_MERGER.ordinal()] = 180;
                } catch (NoSuchFieldError unused180) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_ODD_LOT_TENDER.ordinal()] = 181;
                } catch (NoSuchFieldError unused181) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_PAIDOFF.ordinal()] = 182;
                } catch (NoSuchFieldError unused182) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_REINCORPORATION.ordinal()] = 183;
                } catch (NoSuchFieldError unused183) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_REORGANIZATION.ordinal()] = 184;
                } catch (NoSuchFieldError unused184) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_RIGHTS_EXPIRE.ordinal()] = 185;
                } catch (NoSuchFieldError unused185) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_TERMINATION.ordinal()] = 186;
                } catch (NoSuchFieldError unused186) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_VDUTCH_AUCTION_TENDER.ordinal()] = 187;
                } catch (NoSuchFieldError unused187) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_VEXCHANGE_OFFER.ordinal()] = 188;
                } catch (NoSuchFieldError unused188) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_VMERGER.ordinal()] = 189;
                } catch (NoSuchFieldError unused189) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_VTENDER_NEW.ordinal()] = 190;
                } catch (NoSuchFieldError unused190) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_WARRANTS_EXPIRE.ordinal()] = 191;
                } catch (NoSuchFieldError unused191) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_DELISTING.ordinal()] = 192;
                } catch (NoSuchFieldError unused192) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_FI_DEEMED_EXTD_MATURITY.ordinal()] = 193;
                } catch (NoSuchFieldError unused193) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_FI_DEEMED_PREREFUND.ordinal()] = 194;
                } catch (NoSuchFieldError unused194) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_FI_DEEMED_REMARKETING.ordinal()] = 195;
                } catch (NoSuchFieldError unused195) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_LISTING_CHANGE.ordinal()] = 196;
                } catch (NoSuchFieldError unused196) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_NAME_SYMBOL_CHANGE.ordinal()] = 197;
                } catch (NoSuchFieldError unused197) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_OPTION_REORG.ordinal()] = 198;
                } catch (NoSuchFieldError unused198) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_OPTION_SPLIT.ordinal()] = 199;
                } catch (NoSuchFieldError unused199) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_OPTION_SYMBOL_CHANGE.ordinal()] = 200;
                } catch (NoSuchFieldError unused200) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_REVERSE_STOCK_SPLIT.ordinal()] = 201;
                } catch (NoSuchFieldError unused201) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_RIGHTS_ISSUE.ordinal()] = 202;
                } catch (NoSuchFieldError unused202) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_WORTHLESS.ordinal()] = 203;
                } catch (NoSuchFieldError unused203) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_ASSIMILATION.ordinal()] = 204;
                } catch (NoSuchFieldError unused204) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_B_SHARES_EXPIRE.ordinal()] = 205;
                } catch (NoSuchFieldError unused205) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_B_SHARES_ISSUE.ordinal()] = 206;
                } catch (NoSuchFieldError unused206) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_BANKRUPTCY_PAYMENT.ordinal()] = 207;
                } catch (NoSuchFieldError unused207) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_BONUS_ISSUE.ordinal()] = 208;
                } catch (NoSuchFieldError unused208) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CLOTPOOLTRANSFER.ordinal()] = 209;
                } catch (NoSuchFieldError unused209) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CLOTPOOLTRANSFERBYID.ordinal()] = 210;
                } catch (NoSuchFieldError unused210) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_COMPULSORY_ACQUISITION.ordinal()] = 211;
                } catch (NoSuchFieldError unused211) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_COUPON_DISTRIB.ordinal()] = 212;
                } catch (NoSuchFieldError unused212) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_COUPON_EXPIRE.ordinal()] = 213;
                } catch (NoSuchFieldError unused213) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_CUNDISTCAPGAINADJ.ordinal()] = 214;
                } catch (NoSuchFieldError unused214) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_DEEMED_DIVIDEND_ADJ.ordinal()] = 215;
                } catch (NoSuchFieldError unused215) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_DEMERGER.ordinal()] = 216;
                } catch (NoSuchFieldError unused216) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_DEPAIRING.ordinal()] = 217;
                } catch (NoSuchFieldError unused217) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_DIVREAUTO.ordinal()] = 218;
                } catch (NoSuchFieldError unused218) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_EXCHANGE_OFFER.ordinal()] = 219;
                } catch (NoSuchFieldError unused219) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_FICONVERSION.ordinal()] = 220;
                } catch (NoSuchFieldError unused220) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_FIDEEMED_REISSUE.ordinal()] = 221;
                } catch (NoSuchFieldError unused221) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_FIDEFEASANCE.ordinal()] = 222;
                } catch (NoSuchFieldError unused222) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_FILIQUIDATION.ordinal()] = 223;
                } catch (NoSuchFieldError unused223) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_FIPREREFUND.ordinal()] = 224;
                } catch (NoSuchFieldError unused224) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_FIREDEMPTION_CONV.ordinal()] = 225;
                } catch (NoSuchFieldError unused225) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_FIREORG_DISTRIB.ordinal()] = 226;
                } catch (NoSuchFieldError unused226) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_FIREORG_EXCHANGE_OFFER.ordinal()] = 227;
                } catch (NoSuchFieldError unused227) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_FORWARD_STOCK_SPLIT.ordinal()] = 228;
                } catch (NoSuchFieldError unused228) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_FUTURE_LEAP_CONV.ordinal()] = 229;
                } catch (NoSuchFieldError unused229) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_FUTURE_NODIVRISK.ordinal()] = 230;
                } catch (NoSuchFieldError unused230) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_FUTURE_REORG.ordinal()] = 231;
                } catch (NoSuchFieldError unused231) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_FUTURE_SPLIT.ordinal()] = 232;
                } catch (NoSuchFieldError unused232) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_FUTURE_SYMBOL_CHANGE.ordinal()] = 233;
                } catch (NoSuchFieldError unused233) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_LIQUIDATION_DIV.ordinal()] = 234;
                } catch (NoSuchFieldError unused234) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_ODD_LOT_TENDER_SHARES.ordinal()] = 235;
                } catch (NoSuchFieldError unused235) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_OPTION_LEAP_CONV.ordinal()] = 236;
                } catch (NoSuchFieldError unused236) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_PAID_IN_KIND_DIVIDEND.ordinal()] = 237;
                } catch (NoSuchFieldError unused237) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_PLAN_OF_ARRANGEMENT.ordinal()] = 238;
                } catch (NoSuchFieldError unused238) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_POISON_PILL.ordinal()] = 239;
                } catch (NoSuchFieldError unused239) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_REFPAYDOWNLOT.ordinal()] = 240;
                } catch (NoSuchFieldError unused240) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_REMARKETING.ordinal()] = 241;
                } catch (NoSuchFieldError unused241) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_REORG_DISTRIB.ordinal()] = 242;
                } catch (NoSuchFieldError unused242) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_REORG_EXCHANGE.ordinal()] = 243;
                } catch (NoSuchFieldError unused243) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_REORG_EXCHANGEOFFER.ordinal()] = 244;
                } catch (NoSuchFieldError unused244) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_RETURN_OF_CAPITAL.ordinal()] = 245;
                } catch (NoSuchFieldError unused245) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_RETURN_OF_PRINCIPAL.ordinal()] = 246;
                } catch (NoSuchFieldError unused246) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_SCHEME_OF_ARRANGEMENT.ordinal()] = 247;
                } catch (NoSuchFieldError unused247) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_SEPARATION_OF_UNITS.ordinal()] = 248;
                } catch (NoSuchFieldError unused248) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_STOCK_DIVIDEND.ordinal()] = 249;
                } catch (NoSuchFieldError unused249) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_STOCK_SPLIT.ordinal()] = 250;
                } catch (NoSuchFieldError unused250) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_SUBSCRIPTION_OFFER.ordinal()] = 251;
                } catch (NoSuchFieldError unused251) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_SWING.ordinal()] = 252;
                } catch (NoSuchFieldError unused252) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_TIERED_SPLIT.ordinal()] = 253;
                } catch (NoSuchFieldError unused253) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_UIT_TERMINATION.ordinal()] = 254;
                } catch (NoSuchFieldError unused254) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_UNSTAPLING_OF_BUNDLED.ordinal()] = 255;
                } catch (NoSuchFieldError unused255) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_VFIBANKRUPTCY_EXCHANGE.ordinal()] = 256;
                } catch (NoSuchFieldError unused256) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_VFIBANKRUPTCY_EXCHANGEOFFER.ordinal()] = 257;
                } catch (NoSuchFieldError unused257) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_VFIREORG_EXCHANGE.ordinal()] = 258;
                } catch (NoSuchFieldError unused258) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_VFIREORG_EXCHANGEOFFER.ordinal()] = 259;
                } catch (NoSuchFieldError unused259) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_WARRANTS_ISSUE.ordinal()] = 260;
                } catch (NoSuchFieldError unused260) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_UNKNOWN.ordinal()] = 261;
                } catch (NoSuchFieldError unused261) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_GAINLOSSWS.ordinal()] = 262;
                } catch (NoSuchFieldError unused262) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_EXERCISERTWT_BUY.ordinal()] = 263;
                } catch (NoSuchFieldError unused263) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_EXERCISERTWT_CASH.ordinal()] = 264;
                } catch (NoSuchFieldError unused264) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_EXERCISERTWT_COVER_SHORT.ordinal()] = 265;
                } catch (NoSuchFieldError unused265) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_EXERCISERTWT_COVER_SHORT_BY_ID.ordinal()] = 266;
                } catch (NoSuchFieldError unused266) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_EXERCISERTWT_CLOSE.ordinal()] = 267;
                } catch (NoSuchFieldError unused267) {
                }
                try {
                    iArr[TranType.TRAN_TYPE_EXERCISERTWT_ML.ordinal()] = 268;
                } catch (NoSuchFieldError unused268) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TranTypeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TranTypeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TranTypeDto> getBinaryBase64Serializer() {
            return (KSerializer) TranTypeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TranType> getProtoAdapter() {
            return TranType.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TranTypeDto getZeroValue() {
            return TranTypeDto.TRAN_TYPE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TranTypeDto fromProto(TranType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return TranTypeDto.TRAN_TYPE_UNSPECIFIED;
                case 2:
                    return TranTypeDto.TRAN_TYPE_ADJ_BUY;
                case 3:
                    return TranTypeDto.TRAN_TYPE_ALIGN_DOWN;
                case 4:
                    return TranTypeDto.TRAN_TYPE_ALIGN_UP;
                case 5:
                    return TranTypeDto.TRAN_TYPE_ASSET_TRANSFER_IN;
                case 6:
                    return TranTypeDto.TRAN_TYPE_ASSET_TRANSFER_OUT;
                case 7:
                    return TranTypeDto.TRAN_TYPE_ASSET_TRANSFER_OUT_BY_ID;
                case 8:
                    return TranTypeDto.TRAN_TYPE_ASSIGN;
                case 9:
                    return TranTypeDto.TRAN_TYPE_ASSIGN_BUY;
                case 10:
                    return TranTypeDto.TRAN_TYPE_ASSIGN_CALL_CLOSE;
                case 11:
                    return TranTypeDto.TRAN_TYPE_ASSIGN_CALL_ML;
                case 12:
                    return TranTypeDto.TRAN_TYPE_ASSIGN_CASH;
                case 13:
                    return TranTypeDto.TRAN_TYPE_ASSIGN_CASH_SETTLED;
                case 14:
                    return TranTypeDto.TRAN_TYPE_ASSIGN_CLOSE;
                case 15:
                    return TranTypeDto.TRAN_TYPE_ASSIGN_COVER_SHORT;
                case 16:
                    return TranTypeDto.TRAN_TYPE_ASSIGN_PUT_CLOSE;
                case 17:
                    return TranTypeDto.TRAN_TYPE_ASSIGN_PUT_ML;
                case 18:
                    return TranTypeDto.TRAN_TYPE_ASSIGN_RIGHT;
                case 19:
                    return TranTypeDto.TRAN_TYPE_ASSIGN_SELL;
                case 20:
                    return TranTypeDto.TRAN_TYPE_ASSIGN_SELL_BY_ID;
                case 21:
                    return TranTypeDto.TRAN_TYPE_ASSIGN_SELL_SHORT;
                case 22:
                    return TranTypeDto.TRAN_TYPE_ASSIGN_SELL_SHORT_BY_ID;
                case 23:
                    return TranTypeDto.TRAN_TYPE_ASSIGN_WARRANT;
                case 24:
                    return TranTypeDto.TRAN_TYPE_AUTO_EXPIRE_ALL;
                case 25:
                    return TranTypeDto.TRAN_TYPE_BASELINE;
                case 26:
                    return TranTypeDto.TRAN_TYPE_BASELINE_LOSS;
                case 27:
                    return TranTypeDto.TRAN_TYPE_BASELINE_LOT;
                case 28:
                    return TranTypeDto.TRAN_TYPE_BASELINE_TAX_LOT;
                case 29:
                    return TranTypeDto.TRAN_TYPE_BASELINE_WS_ADJ;
                case 30:
                    return TranTypeDto.TRAN_TYPE_BOOK_TO_CERT_BY_ID;
                case 31:
                    return TranTypeDto.TRAN_TYPE_BUY;
                case 32:
                    return TranTypeDto.TRAN_TYPE_BUY_IN_KIND;
                case 33:
                    return TranTypeDto.TRAN_TYPE_BUY_TO_CLOSE;
                case 34:
                    return TranTypeDto.TRAN_TYPE_BUY_TO_CLOSE_BY_ID;
                case 35:
                    return TranTypeDto.TRAN_TYPE_BUY_TO_OPEN;
                case 36:
                    return TranTypeDto.TRAN_TYPE_CALL;
                case 37:
                    return TranTypeDto.TRAN_TYPE_CALL_PARTIAL;
                case 38:
                    return TranTypeDto.TRAN_TYPE_CANCEL;
                case 39:
                    return TranTypeDto.TRAN_TYPE_CANCEL_ACC;
                case 40:
                    return TranTypeDto.TRAN_TYPE_CASH_DIV;
                case 41:
                    return TranTypeDto.TRAN_TYPE_CASH_IN_LIEU;
                case 42:
                    return TranTypeDto.TRAN_TYPE_CASH_LIEU;
                case 43:
                    return TranTypeDto.TRAN_TYPE_CCONVERSION;
                case 44:
                    return TranTypeDto.TRAN_TYPE_CCONVERSION_IN;
                case 45:
                    return TranTypeDto.TRAN_TYPE_CCONVERSION_OUT;
                case 46:
                    return TranTypeDto.TRAN_TYPE_CCONVERSION_OUT_BY_ID;
                case 47:
                    return TranTypeDto.TRAN_TYPE_CDIV_RE;
                case 48:
                    return TranTypeDto.TRAN_TYPE_CERT_TO_BOOK_BY_ID;
                case 49:
                    return TranTypeDto.TRAN_TYPE_CFICONVERSION;
                case 50:
                    return TranTypeDto.TRAN_TYPE_CFICONVERSION_IN;
                case 51:
                    return TranTypeDto.TRAN_TYPE_CFICONVERSION_OUT;
                case 52:
                    return TranTypeDto.TRAN_TYPE_CFIDEFEASANCE;
                case 53:
                    return TranTypeDto.TRAN_TYPE_CFIDEFEASANCE_IN;
                case 54:
                    return TranTypeDto.TRAN_TYPE_CFIDEFEASANCE_OUT;
                case 55:
                    return TranTypeDto.TRAN_TYPE_CFIEXCHANGE;
                case 56:
                    return TranTypeDto.TRAN_TYPE_CFIEXCHANGE_IN;
                case 57:
                    return TranTypeDto.TRAN_TYPE_CFIEXCHANGE_OUT;
                case 58:
                    return TranTypeDto.TRAN_TYPE_CFIPREREFUND;
                case 59:
                    return TranTypeDto.TRAN_TYPE_CFIPREREFUND_IN;
                case 60:
                    return TranTypeDto.TRAN_TYPE_CFIPREREFUND_OUT;
                case 61:
                    return TranTypeDto.TRAN_TYPE_CFITENDER_CASH;
                case 62:
                    return TranTypeDto.TRAN_TYPE_CFITENDER_SELL;
                case 63:
                    return TranTypeDto.TRAN_TYPE_CFITENDER_SELL_BY_ID;
                case 64:
                    return TranTypeDto.TRAN_TYPE_CFUTURE_REORG;
                case 65:
                    return TranTypeDto.TRAN_TYPE_CFUTURE_REORG_IN;
                case 66:
                    return TranTypeDto.TRAN_TYPE_CFUTURE_REORG_OUT;
                case 67:
                    return TranTypeDto.TRAN_TYPE_CILEXACT;
                case SDK_ASSET_ICON_HOME_VALUE:
                    return TranTypeDto.TRAN_TYPE_COPTION_REORG;
                case 69:
                    return TranTypeDto.TRAN_TYPE_COPTION_REORG_IN;
                case 70:
                    return TranTypeDto.TRAN_TYPE_COPTION_REORG_OUT;
                case SDK_ASSET_ICON_GUIDE_VALUE:
                    return TranTypeDto.TRAN_TYPE_COST_ADJ_BY_ID;
                case SDK_ASSET_ICON_GLOBE_VALUE:
                    return TranTypeDto.TRAN_TYPE_COVER_BY_ID;
                case 73:
                    return TranTypeDto.TRAN_TYPE_COVER_AGAINST_BOX_FIFO;
                case 74:
                    return TranTypeDto.TRAN_TYPE_COVER_SHORT;
                case 75:
                    return TranTypeDto.TRAN_TYPE_CRET_CAPITAL;
                case 76:
                    return TranTypeDto.TRAN_TYPE_CRET_CAPITAL_BY_ID;
                case 77:
                    return TranTypeDto.TRAN_TYPE_CUITGRTR_COST_ADJ;
                case 78:
                    return TranTypeDto.TRAN_TYPE_CUITRIC_COST_ADJ;
                case 79:
                    return TranTypeDto.TRAN_TYPE_DEPOSIT;
                case 80:
                    return TranTypeDto.TRAN_TYPE_DEPOSITS_OPT;
                case 81:
                    return TranTypeDto.TRAN_TYPE_DIV_RE;
                case 82:
                    return TranTypeDto.TRAN_TYPE_EXERCISE;
                case 83:
                    return TranTypeDto.TRAN_TYPE_EXERCISE_B_SHARES;
                case 84:
                    return TranTypeDto.TRAN_TYPE_EXERCISE_BUY;
                case 85:
                    return TranTypeDto.TRAN_TYPE_EXERCISE_CALL_CLOSE;
                case 86:
                    return TranTypeDto.TRAN_TYPE_EXERCISE_CALL_ML;
                case 87:
                    return TranTypeDto.TRAN_TYPE_EXERCISE_CASH;
                case 88:
                    return TranTypeDto.TRAN_TYPE_EXERCISE_CASH_SETTLED;
                case 89:
                    return TranTypeDto.TRAN_TYPE_EXERCISE_CLOSE;
                case 90:
                    return TranTypeDto.TRAN_TYPE_EXERCISE_COUPON;
                case 91:
                    return TranTypeDto.TRAN_TYPE_EXERCISE_COVER_SHORT;
                case 92:
                    return TranTypeDto.TRAN_TYPE_EXERCISE_COVER_SHORT_BY_ID;
                case 93:
                    return TranTypeDto.TRAN_TYPE_EXERCISE_PUT_CLOSE;
                case 94:
                    return TranTypeDto.TRAN_TYPE_EXERCISE_PUT_ML;
                case 95:
                    return TranTypeDto.TRAN_TYPE_EXERCISE_RIGHT;
                case 96:
                    return TranTypeDto.TRAN_TYPE_EXERCISE_SELL;
                case 97:
                    return TranTypeDto.TRAN_TYPE_EXERCISE_SELL_BY_ID;
                case 98:
                    return TranTypeDto.TRAN_TYPE_EXERCISE_SELL_SHORT;
                case 99:
                    return TranTypeDto.TRAN_TYPE_EXERCISE_WARRANT;
                case 100:
                    return TranTypeDto.TRAN_TYPE_EXPIRE;
                case 101:
                    return TranTypeDto.TRAN_TYPE_EXPIRE_BY_ID;
                case 102:
                    return TranTypeDto.TRAN_TYPE_EXPIRE_LONG;
                case 103:
                    return TranTypeDto.TRAN_TYPE_EXPIRE_SHORT;
                case 104:
                    return TranTypeDto.TRAN_TYPE_GAIN_LOSS;
                case 105:
                    return TranTypeDto.TRAN_TYPE_INTEREST;
                case 106:
                    return TranTypeDto.TRAN_TYPE_INTERNAL_TAX_LOT_TRANSFER;
                case 107:
                    return TranTypeDto.TRAN_TYPE_INTERNAL_TRANSFER_CONV_IN;
                case 108:
                    return TranTypeDto.TRAN_TYPE_INTERNAL_TRANSFER_CONV_OUT;
                case 109:
                    return TranTypeDto.TRAN_TYPE_INTERNAL_TRANSFER_CONV_OUT_BY_ID;
                case 110:
                    return TranTypeDto.TRAN_TYPE_INTERNAL_TRANSFER_IN;
                case 111:
                    return TranTypeDto.TRAN_TYPE_INTERNAL_TRANSFER_OUT;
                case 112:
                    return TranTypeDto.TRAN_TYPE_INTERNAL_TRANSFER_OUT_BY_ID;
                case 113:
                    return TranTypeDto.TRAN_TYPE_LIQUIDATION;
                case 114:
                    return TranTypeDto.TRAN_TYPE_LTRANSFER_CONV_IN;
                case 115:
                    return TranTypeDto.TRAN_TYPE_LTRANSFER_CONV_OUT;
                case 116:
                    return TranTypeDto.TRAN_TYPE_MARK_TO_MARKET_ALL;
                case 117:
                    return TranTypeDto.TRAN_TYPE_MATURITY;
                case 118:
                    return TranTypeDto.TRAN_TYPE_MCA_TRAN;
                case 119:
                    return TranTypeDto.TRAN_TYPE_MCA_TRAN_IN;
                case 120:
                    return TranTypeDto.TRAN_TYPE_MCA_TRAN_OUT;
                case SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE:
                    return TranTypeDto.TRAN_TYPE_OPEN_SHORT;
                case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                    return TranTypeDto.TRAN_TYPE_PAIR_OFF_BY_ID;
                case 123:
                    return TranTypeDto.TRAN_TYPE_PUT;
                case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                    return TranTypeDto.TRAN_TYPE_REDEMPTION;
                case 125:
                    return TranTypeDto.TRAN_TYPE_ROC;
                case SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE:
                    return TranTypeDto.TRAN_TYPE_REMOVE_SHARES;
                case SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE:
                    return TranTypeDto.TRAN_TYPE_REPO;
                case 128:
                    return TranTypeDto.TRAN_TYPE_RETCAPITAL;
                case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                    return TranTypeDto.TRAN_TYPE_REVERSE_REPO;
                case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                    return TranTypeDto.TRAN_TYPE_RIGHTS_LAPSE;
                case 131:
                    return TranTypeDto.TRAN_TYPE_RIK;
                case SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE:
                    return TranTypeDto.TRAN_TYPE_SELL;
                case SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE:
                    return TranTypeDto.TRAN_TYPE_SELL_AMT_BY_FIFO;
                case SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE:
                    return TranTypeDto.TRAN_TYPE_SELL_AMT_BY_ID;
                case SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE:
                    return TranTypeDto.TRAN_TYPE_SELL_BY_ID;
                case 136:
                    return TranTypeDto.TRAN_TYPE_SELL_SHORT;
                case SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE:
                    return TranTypeDto.TRAN_TYPE_SELL_TO_CLOSE;
                case SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE:
                    return TranTypeDto.TRAN_TYPE_SELL_TO_CLOSE_BY_ID;
                case SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE:
                    return TranTypeDto.TRAN_TYPE_SELL_TO_OPEN;
                case SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE:
                    return TranTypeDto.TRAN_TYPE_SET_AVG_COST;
                case SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE:
                    return TranTypeDto.TRAN_TYPE_SET_CDRP_BY_ID;
                case SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE:
                    return TranTypeDto.TRAN_TYPE_SET_COST_ALLOC_RIGHT_ISSUE;
                case SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE:
                    return TranTypeDto.TRAN_TYPE_SET_ELECTIONS;
                case 144:
                    return TranTypeDto.TRAN_TYPE_SET_TRADING_METHOD;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE:
                    return TranTypeDto.TRAN_TYPE_SUB_ACCT_TRANSFER;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE:
                    return TranTypeDto.TRAN_TYPE_SUB_ACCT_TRANSFER_BY_ID;
                case 147:
                    return TranTypeDto.TRAN_TYPE_TAX_LOT_TRANSFER;
                case SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE:
                    return TranTypeDto.TRAN_TYPE_TENDER_SELL;
                case SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE:
                    return TranTypeDto.TRAN_TYPE_TENDER_SELL_BY_ID;
                case 150:
                    return TranTypeDto.TRAN_TYPE_TRANSFER_IN_PLACE;
                case 151:
                    return TranTypeDto.TRAN_TYPE_TRANSFER_IN_PLACE_BY_ID;
                case SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE:
                    return TranTypeDto.TRAN_TYPE_UNDIST_CAP_GAIN_ADJ;
                case SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE:
                    return TranTypeDto.TRAN_TYPE_UNDIST_CAP_GAIN_ADJ_BY_ID;
                case SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE:
                    return TranTypeDto.TRAN_TYPE_VCA_ELECTION;
                case 155:
                    return TranTypeDto.TRAN_TYPE_VCAFI_TRAN_IN;
                case 156:
                    return TranTypeDto.TRAN_TYPE_VCAFI_TRAN_OUT;
                case SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE:
                    return TranTypeDto.TRAN_TYPE_VCA_TRAN;
                case SDK_ASSET_ILLUSTRATION_WALLET_VALUE:
                    return TranTypeDto.TRAN_TYPE_VCA_TRAN_IN;
                case SDK_ASSET_ILLUSTRATION_INCOME_VALUE:
                    return TranTypeDto.TRAN_TYPE_VCA_TRAN_OUT;
                case SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE:
                    return TranTypeDto.TRAN_TYPE_VOID;
                case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE:
                    return TranTypeDto.TRAN_TYPE_WITHDRAW;
                case SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE:
                    return TranTypeDto.TRAN_TYPE_WITHDRAW_BY_ID;
                case SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE:
                    return TranTypeDto.TRAN_TYPE_WITHDRAW_SHORT;
                case SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE:
                    return TranTypeDto.TRAN_TYPE_WRITE_OFF;
                case 165:
                    return TranTypeDto.TRAN_TYPE_WS;
                case SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE:
                    return TranTypeDto.TRAN_TYPE_WS_ADJ;
                case 167:
                    return TranTypeDto.TRAN_TYPE_ASSIGN_COVER_SHORT_BY_ID;
                case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE:
                    return TranTypeDto.TRAN_TYPE_BANKRUPTCY_REORG;
                case SDK_ASSET_HEADER_CARD_COLLECT_VALUE:
                    return TranTypeDto.TRAN_TYPE_CASH_MERGER;
                case SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE:
                    return TranTypeDto.TRAN_TYPE_COMPLETE_CALL;
                case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE:
                    return TranTypeDto.TRAN_TYPE_COMPLETE_PUT;
                case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE:
                    return TranTypeDto.TRAN_TYPE_CONV;
                case SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE:
                    return TranTypeDto.TRAN_TYPE_DISTRIB_SPINOFF;
                case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE:
                    return TranTypeDto.TRAN_TYPE_EXCHANGE;
                case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE:
                    return TranTypeDto.TRAN_TYPE_FIBANKRUPTCY_EXCHANGE;
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE:
                    return TranTypeDto.TRAN_TYPE_FIEQUITY_LINKED_CONV;
                case SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE:
                    return TranTypeDto.TRAN_TYPE_FIESCROW_DISTRIB;
                case f2773x8d9721ad:
                    return TranTypeDto.TRAN_TYPE_FIEXCHANGE;
                case f2780x600b66fe:
                    return TranTypeDto.TRAN_TYPE_FIREORG_EXCHANGE;
                case SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE:
                    return TranTypeDto.TRAN_TYPE_MERGER;
                case SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE:
                    return TranTypeDto.TRAN_TYPE_ODD_LOT_TENDER;
                case 182:
                    return TranTypeDto.TRAN_TYPE_PAIDOFF;
                case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE:
                    return TranTypeDto.TRAN_TYPE_REINCORPORATION;
                case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE:
                    return TranTypeDto.TRAN_TYPE_REORGANIZATION;
                case SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE:
                    return TranTypeDto.TRAN_TYPE_RIGHTS_EXPIRE;
                case SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE:
                    return TranTypeDto.TRAN_TYPE_TERMINATION;
                case SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE:
                    return TranTypeDto.TRAN_TYPE_VDUTCH_AUCTION_TENDER;
                case 188:
                    return TranTypeDto.TRAN_TYPE_VEXCHANGE_OFFER;
                case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE:
                    return TranTypeDto.TRAN_TYPE_VMERGER;
                case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE:
                    return TranTypeDto.TRAN_TYPE_VTENDER_NEW;
                case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE:
                    return TranTypeDto.TRAN_TYPE_WARRANTS_EXPIRE;
                case 192:
                    return TranTypeDto.TRAN_TYPE_DELISTING;
                case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE:
                    return TranTypeDto.TRAN_TYPE_FI_DEEMED_EXTD_MATURITY;
                case SDK_ASSET_ICON_EXTERNAL_VALUE:
                    return TranTypeDto.TRAN_TYPE_FI_DEEMED_PREREFUND;
                case SDK_ASSET_ICON_ALERT_WARNING_VALUE:
                    return TranTypeDto.TRAN_TYPE_FI_DEEMED_REMARKETING;
                case SDK_ASSET_ICON_ARROW_DOWN_VALUE:
                    return TranTypeDto.TRAN_TYPE_LISTING_CHANGE;
                case SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE:
                    return TranTypeDto.TRAN_TYPE_NAME_SYMBOL_CHANGE;
                case SDK_ASSET_ICON_ARROW_UP_VALUE:
                    return TranTypeDto.TRAN_TYPE_OPTION_REORG;
                case SDK_ASSET_ICON_CANCEL_VALUE:
                    return TranTypeDto.TRAN_TYPE_OPTION_SPLIT;
                case 200:
                    return TranTypeDto.TRAN_TYPE_OPTION_SYMBOL_CHANGE;
                case 201:
                    return TranTypeDto.TRAN_TYPE_REVERSE_STOCK_SPLIT;
                case 202:
                    return TranTypeDto.TRAN_TYPE_RIGHTS_ISSUE;
                case SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE:
                    return TranTypeDto.TRAN_TYPE_WORTHLESS;
                case 204:
                    return TranTypeDto.TRAN_TYPE_ASSIMILATION;
                case SDK_ASSET_ICON_CLIPBOARD_VALUE:
                    return TranTypeDto.TRAN_TYPE_B_SHARES_EXPIRE;
                case SDK_ASSET_ICON_CLOCK_VALUE:
                    return TranTypeDto.TRAN_TYPE_B_SHARES_ISSUE;
                case SDK_ASSET_ICON_COMMENT_VALUE:
                    return TranTypeDto.TRAN_TYPE_BANKRUPTCY_PAYMENT;
                case SDK_ASSET_ICON_INCOME_VALUE:
                    return TranTypeDto.TRAN_TYPE_BONUS_ISSUE;
                case SDK_ASSET_ICON_INCOMPLETE_VALUE:
                    return TranTypeDto.TRAN_TYPE_CLOTPOOLTRANSFER;
                case SDK_ASSET_ICON_NEW_WINDOW_VALUE:
                    return TranTypeDto.TRAN_TYPE_CLOTPOOLTRANSFERBYID;
                case 211:
                    return TranTypeDto.TRAN_TYPE_COMPULSORY_ACQUISITION;
                case SDK_ASSET_ICON_OVERRIDE_VALUE:
                    return TranTypeDto.TRAN_TYPE_COUPON_DISTRIB;
                case SDK_ASSET_ICON_PAUSE_VALUE:
                    return TranTypeDto.TRAN_TYPE_COUPON_EXPIRE;
                case SDK_ASSET_ICON_PIN_VALUE:
                    return TranTypeDto.TRAN_TYPE_CUNDISTCAPGAINADJ;
                case SDK_ASSET_ICON_PRODUCT_IDV_VALUE:
                    return TranTypeDto.TRAN_TYPE_DEEMED_DIVIDEND_ADJ;
                case SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE:
                    return TranTypeDto.TRAN_TYPE_DEMERGER;
                case SDK_ASSET_ICON_PROGRESS_VALUE:
                    return TranTypeDto.TRAN_TYPE_DEPAIRING;
                case SDK_ASSET_ICON_QUESTION_VALUE:
                    return TranTypeDto.TRAN_TYPE_DIVREAUTO;
                case SDK_ASSET_ICON_REJECTED_REC_VALUE:
                    return TranTypeDto.TRAN_TYPE_EXCHANGE_OFFER;
                case SDK_ASSET_ICON_SHIELD_CAUTION_VALUE:
                    return TranTypeDto.TRAN_TYPE_FICONVERSION;
                case SDK_ASSET_ICON_SUBMIT_VALUE:
                    return TranTypeDto.TRAN_TYPE_FIDEEMED_REISSUE;
                case SDK_ASSET_ICON_SUBTRACT_VALUE:
                    return TranTypeDto.TRAN_TYPE_FIDEFEASANCE;
                case SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE:
                    return TranTypeDto.TRAN_TYPE_FILIQUIDATION;
                case 224:
                    return TranTypeDto.TRAN_TYPE_FIPREREFUND;
                case 225:
                    return TranTypeDto.TRAN_TYPE_FIREDEMPTION_CONV;
                case SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE:
                    return TranTypeDto.TRAN_TYPE_FIREORG_DISTRIB;
                case SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE:
                    return TranTypeDto.TRAN_TYPE_FIREORG_EXCHANGE_OFFER;
                case SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE:
                    return TranTypeDto.TRAN_TYPE_FORWARD_STOCK_SPLIT;
                case SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE:
                    return TranTypeDto.TRAN_TYPE_FUTURE_LEAP_CONV;
                case SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE:
                    return TranTypeDto.TRAN_TYPE_FUTURE_NODIVRISK;
                case SDK_ASSET_ILLUSTRATION_EXIT_VALUE:
                    return TranTypeDto.TRAN_TYPE_FUTURE_REORG;
                case SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE:
                    return TranTypeDto.TRAN_TYPE_FUTURE_SPLIT;
                case SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE:
                    return TranTypeDto.TRAN_TYPE_FUTURE_SYMBOL_CHANGE;
                case SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE:
                    return TranTypeDto.TRAN_TYPE_LIQUIDATION_DIV;
                case SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE:
                    return TranTypeDto.TRAN_TYPE_ODD_LOT_TENDER_SHARES;
                case SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE:
                    return TranTypeDto.TRAN_TYPE_OPTION_LEAP_CONV;
                case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE:
                    return TranTypeDto.TRAN_TYPE_PAID_IN_KIND_DIVIDEND;
                case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE:
                    return TranTypeDto.TRAN_TYPE_PLAN_OF_ARRANGEMENT;
                case 239:
                    return TranTypeDto.TRAN_TYPE_POISON_PILL;
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE:
                    return TranTypeDto.TRAN_TYPE_REFPAYDOWNLOT;
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE:
                    return TranTypeDto.TRAN_TYPE_REMARKETING;
                case f2778x3356acf6:
                    return TranTypeDto.TRAN_TYPE_REORG_DISTRIB;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE:
                    return TranTypeDto.TRAN_TYPE_REORG_EXCHANGE;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE:
                    return TranTypeDto.TRAN_TYPE_REORG_EXCHANGEOFFER;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE:
                    return TranTypeDto.TRAN_TYPE_RETURN_OF_CAPITAL;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE:
                    return TranTypeDto.TRAN_TYPE_RETURN_OF_PRINCIPAL;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE:
                    return TranTypeDto.TRAN_TYPE_SCHEME_OF_ARRANGEMENT;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE:
                    return TranTypeDto.TRAN_TYPE_SEPARATION_OF_UNITS;
                case f2779x59907a3d:
                    return TranTypeDto.TRAN_TYPE_STOCK_DIVIDEND;
                case 250:
                    return TranTypeDto.TRAN_TYPE_STOCK_SPLIT;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE:
                    return TranTypeDto.TRAN_TYPE_SUBSCRIPTION_OFFER;
                case SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE:
                    return TranTypeDto.TRAN_TYPE_SWING;
                case SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE:
                    return TranTypeDto.TRAN_TYPE_TIERED_SPLIT;
                case SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE:
                    return TranTypeDto.TRAN_TYPE_UIT_TERMINATION;
                case 255:
                    return TranTypeDto.TRAN_TYPE_UNSTAPLING_OF_BUNDLED;
                case 256:
                    return TranTypeDto.TRAN_TYPE_VFIBANKRUPTCY_EXCHANGE;
                case SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE:
                    return TranTypeDto.TRAN_TYPE_VFIBANKRUPTCY_EXCHANGEOFFER;
                case SDK_ASSET_HEADER_BOLT_VALUE:
                    return TranTypeDto.TRAN_TYPE_VFIREORG_EXCHANGE;
                case SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE:
                    return TranTypeDto.TRAN_TYPE_VFIREORG_EXCHANGEOFFER;
                case SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE:
                    return TranTypeDto.TRAN_TYPE_WARRANTS_ISSUE;
                case SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE:
                    return TranTypeDto.TRAN_TYPE_UNKNOWN;
                case SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE:
                    return TranTypeDto.TRAN_TYPE_GAINLOSSWS;
                case SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE:
                    return TranTypeDto.TRAN_TYPE_EXERCISERTWT_BUY;
                case SDK_ASSET_ICON_PLAID_LOGO_VALUE:
                    return TranTypeDto.TRAN_TYPE_EXERCISERTWT_CASH;
                case SDK_ASSET_HEADER_SHIELD_VALUE:
                    return TranTypeDto.TRAN_TYPE_EXERCISERTWT_COVER_SHORT;
                case SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE:
                    return TranTypeDto.TRAN_TYPE_EXERCISERTWT_COVER_SHORT_BY_ID;
                case SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE:
                    return TranTypeDto.TRAN_TYPE_EXERCISERTWT_CLOSE;
                case SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE:
                    return TranTypeDto.TRAN_TYPE_EXERCISERTWT_ML;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TranTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcbc/service/v1/TranTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcbc/service/v1/TranTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "cbc.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class Serializer implements KSerializer<TranTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<TranTypeDto, TranType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/cbc.service.v1.TranType", TranTypeDto.getEntries(), TranTypeDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public TranTypeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (TranTypeDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TranTypeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static TranTypeDto valueOf(String str) {
        return (TranTypeDto) Enum.valueOf(TranTypeDto.class, str);
    }

    public static TranTypeDto[] values() {
        return (TranTypeDto[]) $VALUES.clone();
    }
}
