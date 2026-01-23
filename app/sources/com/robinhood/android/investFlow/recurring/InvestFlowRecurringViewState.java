package com.robinhood.android.investFlow.recurring;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.ach.format.AchRelationships;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet4;
import com.robinhood.android.common.util.NumberUtils;
import com.robinhood.android.investFlow.C19349R;
import com.robinhood.android.investFlow.core.InvestFlowPaymentMethod;
import com.robinhood.android.investFlow.submit.InvestFlowOrderArgs2;
import com.robinhood.investflow.models.api.ApiAssetAllocation;
import com.robinhood.investflow.models.api.ApiInvestFlowRecurringSchedulePostBody;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.datetime.LocalDates4;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDate;
import p479j$.time.format.TextStyle;

/* compiled from: InvestFlowRecurringViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u0000\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 ¸\u00012\u00020\u0001:\u0004¹\u0001¸\u0001B«\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\r\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\u00182\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u0015\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020%2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b(\u0010'J\r\u0010)\u001a\u00020%¢\u0006\u0004\b)\u0010*J\u001d\u0010/\u001a\u00020 2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020-¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b;\u0010:J\u0010\u0010<\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b<\u0010=J\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0016\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00120\rHÆ\u0003¢\u0006\u0004\bB\u0010?J\u0012\u0010C\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bC\u00104J\u0018\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bF\u0010=J\u0010\u0010G\u001a\u00020\u0018HÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0012\u0010I\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\bI\u0010JJ¼\u0001\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÆ\u0001¢\u0006\u0004\bK\u0010LJ\u0010\u0010M\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\bM\u0010HJ\u0010\u0010N\u001a\u00020-HÖ\u0001¢\u0006\u0004\bN\u00102J\u001a\u0010Q\u001a\u00020\u000b2\b\u0010P\u001a\u0004\u0018\u00010OHÖ\u0003¢\u0006\u0004\bQ\u0010RR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010S\u001a\u0004\bT\u00104R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010U\u001a\u0004\bV\u00106R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010W\u001a\u0004\bX\u00108R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010Y\u001a\u0004\bZ\u0010:R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010Y\u001a\u0004\b[\u0010:R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\\\u001a\u0004\b\f\u0010=R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010]\u001a\u0004\b^\u0010?R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010_\u001a\u0004\b`\u0010AR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\r8\u0006¢\u0006\f\n\u0004\b\u0013\u0010]\u001a\u0004\ba\u0010?R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010S\u001a\u0004\bb\u00104R\u001f\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010c\u001a\u0004\bd\u0010ER\u0017\u0010\u0017\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\\\u001a\u0004\b\u0017\u0010=R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010e\u001a\u0004\bf\u0010HR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010g\u001a\u0004\bh\u0010JR(\u0010i\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\bi\u0010\\\u0012\u0004\bl\u0010\"\u001a\u0004\bi\u0010=\"\u0004\bj\u0010kR\u0014\u0010m\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bm\u0010=R\u001a\u0010p\u001a\b\u0012\u0004\u0012\u00020n0\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bo\u0010?R\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020n0\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bq\u0010?R\u0016\u0010v\u001a\u0004\u0018\u00010s8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0014\u0010x\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bw\u0010*R\u0014\u0010z\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\by\u0010*R\u0014\u0010|\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b{\u0010*R\u0014\u0010~\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b}\u0010*R\u0015\u0010\u0080\u0001\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010HR\u0013\u0010\u0081\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010=R\u0013\u0010\u0083\u0001\u001a\u00020-8F¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u00102R\u0013\u0010\u0085\u0001\u001a\u00020%8F¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010*R\u0013\u0010\u0087\u0001\u001a\u00020%8F¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010*R\u0019\u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020n0\r8F¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010?R\u0013\u0010\u008a\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010=R\u0013\u0010\u008c\u0001\u001a\u00020%8F¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010*R\u0013\u0010\u008e\u0001\u001a\u00020%8F¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010*R\u0013\u0010\u0090\u0001\u001a\u00020%8F¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u0010*R\u0013\u0010\u0092\u0001\u001a\u00020%8F¢\u0006\u0007\u001a\u0005\b\u0091\u0001\u0010*R\u0013\u0010\u0094\u0001\u001a\u00020%8F¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010*R\u0013\u0010\u0096\u0001\u001a\u00020%8F¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010*R\u0015\u0010\u0098\u0001\u001a\u0004\u0018\u00010%8F¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010*R\u0013\u0010\u009a\u0001\u001a\u00020%8F¢\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010*R\u0015\u0010\u009c\u0001\u001a\u0004\u0018\u00010%8F¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u0010*R\u0013\u0010\u009e\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010=R\u0015\u0010 \u0001\u001a\u0004\u0018\u00010%8F¢\u0006\u0007\u001a\u0005\b\u009f\u0001\u0010*R\u0015\u0010¢\u0001\u001a\u0004\u0018\u00010%8F¢\u0006\u0007\u001a\u0005\b¡\u0001\u0010*R\u0015\u0010¤\u0001\u001a\u0004\u0018\u00010%8F¢\u0006\u0007\u001a\u0005\b£\u0001\u0010*R\u0013\u0010¦\u0001\u001a\u00020%8F¢\u0006\u0007\u001a\u0005\b¥\u0001\u0010*R\u0013\u0010¨\u0001\u001a\u00020%8F¢\u0006\u0007\u001a\u0005\b§\u0001\u0010*R\u0013\u0010ª\u0001\u001a\u00020%8F¢\u0006\u0007\u001a\u0005\b©\u0001\u0010*R\u0013\u0010¬\u0001\u001a\u00020%8F¢\u0006\u0007\u001a\u0005\b«\u0001\u0010*R\u0013\u0010®\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b\u00ad\u0001\u0010=R\u001a\u0010±\u0001\u001a\t\u0012\u0005\u0012\u00030¯\u00010\r8F¢\u0006\u0007\u001a\u0005\b°\u0001\u0010?R\u0013\u0010³\u0001\u001a\u00020%8F¢\u0006\u0007\u001a\u0005\b²\u0001\u0010*R\u0015\u0010µ\u0001\u001a\u0004\u0018\u00010%8F¢\u0006\u0007\u001a\u0005\b´\u0001\u0010*R\u0015\u0010·\u0001\u001a\u0004\u0018\u00010%8F¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010*¨\u0006º\u0001"}, m3636d2 = {"Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringViewState;", "Lcom/robinhood/android/investFlow/submit/InvestFlowOrderSubmitViewState;", "Lcom/robinhood/models/util/Money;", "totalAmount", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "frequency", "j$/time/LocalDate", "startDate", "Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;", "primaryPaymentMethod", "backupPaymentMethod", "", "isCrypto", "", "Lcom/robinhood/models/db/Instrument;", "instruments", "Lcom/robinhood/models/api/BrokerageAccountType;", "brokerageAccountType", "Lcom/robinhood/investflow/models/api/ApiAssetAllocation;", "assetAllocations", "accountBuyingPower", "Lcom/robinhood/udf/UiEvent;", "onReviewEvent", "isRecurringUpsell", "", "accountNumber", "Lcom/robinhood/models/db/Account;", "account", "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lj$/time/LocalDate;Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;ZLjava/util/List;Lcom/robinhood/models/api/BrokerageAccountType;Ljava/util/List;Lcom/robinhood/models/util/Money;Lcom/robinhood/udf/UiEvent;ZLjava/lang/String;Lcom/robinhood/models/db/Account;)V", "getOrderSummaryMultipleString", "(Ljava/util/List;)Ljava/lang/String;", "", "toggleExpanded", "()V", "Landroid/content/res/Resources;", "res", "Lcom/robinhood/utils/resource/StringResource;", "startDateMetadataPrimaryText", "(Landroid/content/res/Resources;)Lcom/robinhood/utils/resource/StringResource;", "submitOrderSummary", "getAccountTypeRowText", "()Lcom/robinhood/utils/resource/StringResource;", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/robinhood/models/util/Money;", "component2", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "component3", "()Lj$/time/LocalDate;", "component4", "()Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;", "component5", "component6", "()Z", "component7", "()Ljava/util/List;", "component8", "()Lcom/robinhood/models/api/BrokerageAccountType;", "component9", "component10", "component11", "()Lcom/robinhood/udf/UiEvent;", "component12", "component13", "()Ljava/lang/String;", "component14", "()Lcom/robinhood/models/db/Account;", "copy", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lj$/time/LocalDate;Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;ZLjava/util/List;Lcom/robinhood/models/api/BrokerageAccountType;Ljava/util/List;Lcom/robinhood/models/util/Money;Lcom/robinhood/udf/UiEvent;ZLjava/lang/String;Lcom/robinhood/models/db/Account;)Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringViewState;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/util/Money;", "getTotalAmount", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "getFrequency", "Lj$/time/LocalDate;", "getStartDate", "Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;", "getPrimaryPaymentMethod", "getBackupPaymentMethod", "Z", "Ljava/util/List;", "getInstruments", "Lcom/robinhood/models/api/BrokerageAccountType;", "getBrokerageAccountType", "getAssetAllocations", "getAccountBuyingPower", "Lcom/robinhood/udf/UiEvent;", "getOnReviewEvent", "Ljava/lang/String;", "getAccountNumber", "Lcom/robinhood/models/db/Account;", "getAccount", "isExpanded", "setExpanded", "(Z)V", "isExpanded$annotations", "isJoint", "Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringViewState$Row;", "getAllRows", "allRows", "getTopRows", "topRows", "Lcom/robinhood/models/db/AchRelationship;", "getAchRelationship", "()Lcom/robinhood/models/db/AchRelationship;", "achRelationship", "getSelectedAchRelationshipNickname", "selectedAchRelationshipNickname", "getAddPaymentMethodStringResource", "addPaymentMethodStringResource", "getBuyingPowerPaymentMethodStringResource", "buyingPowerPaymentMethodStringResource", "getFrequencyTextLowerCase", "frequencyTextLowerCase", "getTaxYear", "taxYear", "isLoading", "getNumInstruments", "numInstruments", "getRecurringTitleText", "recurringTitleText", "getInstrumentsMetadataText", "instrumentsMetadataText", "getRows", "rows", "isExpandBtnVisible", "getExpandBtnText", "expandBtnText", "getTotalAmountMetadataPrimaryText", "totalAmountMetadataPrimaryText", "getTotalAmountMetadataSecondaryText", "totalAmountMetadataSecondaryText", "getFrequencyMetadataPrimaryText", "frequencyMetadataPrimaryText", "getFrequencyMetadataSecondaryText", "frequencyMetadataSecondaryText", "getStartDateMetadataSecondaryText", "startDateMetadataSecondaryText", "getPaymentMethodCtaText", "paymentMethodCtaText", "getPaymentMethodMetadataPrimaryText", "paymentMethodMetadataPrimaryText", "getPaymentMethodMetadataSecondaryText", "paymentMethodMetadataSecondaryText", "getBackupPaymentMethodRowVisible", "backupPaymentMethodRowVisible", "getBackupPaymentMethodCtaText", "backupPaymentMethodCtaText", "getBackupPaymentMethodMetadataPrimaryText", "backupPaymentMethodMetadataPrimaryText", "getBackupPaymentMethodMetadataSecondaryText", "backupPaymentMethodMetadataSecondaryText", "getDisclaimerText", "disclaimerText", "getDisclaimerCtaText", "disclaimerCtaText", "getDisclosureTitle", "disclosureTitle", "getDisclosureDescription", "disclosureDescription", "getReviewButtonEnabled", "reviewButtonEnabled", "Lcom/robinhood/investflow/models/api/ApiInvestFlowRecurringSchedulePostBody;", "getRecurringSchedulesPostBody", "recurringSchedulesPostBody", "getRetirementSubtitle", "retirementSubtitle", "getAccountNameTitle", "accountNameTitle", "getAccountNameSubtitle", "accountNameSubtitle", "Companion", "Row", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final /* data */ class InvestFlowRecurringViewState implements InvestFlowOrderArgs2 {
    private static final int MAX_NUM_OF_ROWS = 5;
    private final Account account;
    private final Money accountBuyingPower;
    private final String accountNumber;
    private final List<ApiAssetAllocation> assetAllocations;
    private final InvestFlowPaymentMethod backupPaymentMethod;
    private final BrokerageAccountType brokerageAccountType;
    private final ApiInvestmentSchedule.Frequency frequency;
    private final List<Instrument> instruments;
    private final boolean isCrypto;
    private boolean isExpanded;
    private final boolean isRecurringUpsell;
    private final UiEvent<LocalDate> onReviewEvent;
    private final InvestFlowPaymentMethod primaryPaymentMethod;
    private final LocalDate startDate;
    private final Money totalAmount;
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestFlowRecurringViewState> CREATOR = new Creator();

    /* compiled from: InvestFlowRecurringViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<InvestFlowRecurringViewState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestFlowRecurringViewState createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Money money = (Money) parcel.readParcelable(InvestFlowRecurringViewState.class.getClassLoader());
            ApiInvestmentSchedule.Frequency frequencyValueOf = ApiInvestmentSchedule.Frequency.valueOf(parcel.readString());
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            InvestFlowPaymentMethod investFlowPaymentMethod = (InvestFlowPaymentMethod) parcel.readParcelable(InvestFlowRecurringViewState.class.getClassLoader());
            InvestFlowPaymentMethod investFlowPaymentMethod2 = (InvestFlowPaymentMethod) parcel.readParcelable(InvestFlowRecurringViewState.class.getClassLoader());
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(InvestFlowRecurringViewState.class.getClassLoader()));
            }
            BrokerageAccountType brokerageAccountTypeValueOf = parcel.readInt() == 0 ? null : BrokerageAccountType.valueOf(parcel.readString());
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(parcel.readParcelable(InvestFlowRecurringViewState.class.getClassLoader()));
            }
            return new InvestFlowRecurringViewState(money, frequencyValueOf, localDate, investFlowPaymentMethod, investFlowPaymentMethod2, z2, arrayList, brokerageAccountTypeValueOf, arrayList2, (Money) parcel.readParcelable(InvestFlowRecurringViewState.class.getClassLoader()), (UiEvent) parcel.readValue(InvestFlowRecurringViewState.class.getClassLoader()), parcel.readInt() != 0 ? z : false, parcel.readString(), (Account) parcel.readValue(InvestFlowRecurringViewState.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestFlowRecurringViewState[] newArray(int i) {
            return new InvestFlowRecurringViewState[i];
        }
    }

    /* compiled from: InvestFlowRecurringViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiInvestmentSchedule.Frequency.values().length];
            try {
                iArr[ApiInvestmentSchedule.Frequency.EVERY_PAYCHECK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.DAILY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.WEEKLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.BIWEEKLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.MONTHLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void isExpanded$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final Money getTotalAmount() {
        return this.totalAmount;
    }

    /* renamed from: component10, reason: from getter */
    public final Money getAccountBuyingPower() {
        return this.accountBuyingPower;
    }

    public final UiEvent<LocalDate> component11() {
        return this.onReviewEvent;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsRecurringUpsell() {
        return this.isRecurringUpsell;
    }

    /* renamed from: component13, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component14, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiInvestmentSchedule.Frequency getFrequency() {
        return this.frequency;
    }

    /* renamed from: component3, reason: from getter */
    public final LocalDate getStartDate() {
        return this.startDate;
    }

    /* renamed from: component4, reason: from getter */
    public final InvestFlowPaymentMethod getPrimaryPaymentMethod() {
        return this.primaryPaymentMethod;
    }

    /* renamed from: component5, reason: from getter */
    public final InvestFlowPaymentMethod getBackupPaymentMethod() {
        return this.backupPaymentMethod;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsCrypto() {
        return this.isCrypto;
    }

    public final List<Instrument> component7() {
        return this.instruments;
    }

    /* renamed from: component8, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final List<ApiAssetAllocation> component9() {
        return this.assetAllocations;
    }

    public final InvestFlowRecurringViewState copy(Money totalAmount, ApiInvestmentSchedule.Frequency frequency, LocalDate startDate, InvestFlowPaymentMethod primaryPaymentMethod, InvestFlowPaymentMethod backupPaymentMethod, boolean isCrypto, List<Instrument> instruments, BrokerageAccountType brokerageAccountType, List<ApiAssetAllocation> assetAllocations, Money accountBuyingPower, UiEvent<LocalDate> onReviewEvent, boolean isRecurringUpsell, String accountNumber, Account account) {
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        Intrinsics.checkNotNullParameter(assetAllocations, "assetAllocations");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return new InvestFlowRecurringViewState(totalAmount, frequency, startDate, primaryPaymentMethod, backupPaymentMethod, isCrypto, instruments, brokerageAccountType, assetAllocations, accountBuyingPower, onReviewEvent, isRecurringUpsell, accountNumber, account);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestFlowRecurringViewState)) {
            return false;
        }
        InvestFlowRecurringViewState investFlowRecurringViewState = (InvestFlowRecurringViewState) other;
        return Intrinsics.areEqual(this.totalAmount, investFlowRecurringViewState.totalAmount) && this.frequency == investFlowRecurringViewState.frequency && Intrinsics.areEqual(this.startDate, investFlowRecurringViewState.startDate) && Intrinsics.areEqual(this.primaryPaymentMethod, investFlowRecurringViewState.primaryPaymentMethod) && Intrinsics.areEqual(this.backupPaymentMethod, investFlowRecurringViewState.backupPaymentMethod) && this.isCrypto == investFlowRecurringViewState.isCrypto && Intrinsics.areEqual(this.instruments, investFlowRecurringViewState.instruments) && this.brokerageAccountType == investFlowRecurringViewState.brokerageAccountType && Intrinsics.areEqual(this.assetAllocations, investFlowRecurringViewState.assetAllocations) && Intrinsics.areEqual(this.accountBuyingPower, investFlowRecurringViewState.accountBuyingPower) && Intrinsics.areEqual(this.onReviewEvent, investFlowRecurringViewState.onReviewEvent) && this.isRecurringUpsell == investFlowRecurringViewState.isRecurringUpsell && Intrinsics.areEqual(this.accountNumber, investFlowRecurringViewState.accountNumber) && Intrinsics.areEqual(this.account, investFlowRecurringViewState.account);
    }

    public int hashCode() {
        int iHashCode = ((this.totalAmount.hashCode() * 31) + this.frequency.hashCode()) * 31;
        LocalDate localDate = this.startDate;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        InvestFlowPaymentMethod investFlowPaymentMethod = this.primaryPaymentMethod;
        int iHashCode3 = (iHashCode2 + (investFlowPaymentMethod == null ? 0 : investFlowPaymentMethod.hashCode())) * 31;
        InvestFlowPaymentMethod investFlowPaymentMethod2 = this.backupPaymentMethod;
        int iHashCode4 = (((((iHashCode3 + (investFlowPaymentMethod2 == null ? 0 : investFlowPaymentMethod2.hashCode())) * 31) + Boolean.hashCode(this.isCrypto)) * 31) + this.instruments.hashCode()) * 31;
        BrokerageAccountType brokerageAccountType = this.brokerageAccountType;
        int iHashCode5 = (((iHashCode4 + (brokerageAccountType == null ? 0 : brokerageAccountType.hashCode())) * 31) + this.assetAllocations.hashCode()) * 31;
        Money money = this.accountBuyingPower;
        int iHashCode6 = (iHashCode5 + (money == null ? 0 : money.hashCode())) * 31;
        UiEvent<LocalDate> uiEvent = this.onReviewEvent;
        int iHashCode7 = (((((iHashCode6 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31) + Boolean.hashCode(this.isRecurringUpsell)) * 31) + this.accountNumber.hashCode()) * 31;
        Account account = this.account;
        return iHashCode7 + (account != null ? account.hashCode() : 0);
    }

    public String toString() {
        return "InvestFlowRecurringViewState(totalAmount=" + this.totalAmount + ", frequency=" + this.frequency + ", startDate=" + this.startDate + ", primaryPaymentMethod=" + this.primaryPaymentMethod + ", backupPaymentMethod=" + this.backupPaymentMethod + ", isCrypto=" + this.isCrypto + ", instruments=" + this.instruments + ", brokerageAccountType=" + this.brokerageAccountType + ", assetAllocations=" + this.assetAllocations + ", accountBuyingPower=" + this.accountBuyingPower + ", onReviewEvent=" + this.onReviewEvent + ", isRecurringUpsell=" + this.isRecurringUpsell + ", accountNumber=" + this.accountNumber + ", account=" + this.account + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.totalAmount, flags);
        dest.writeString(this.frequency.name());
        dest.writeSerializable(this.startDate);
        dest.writeParcelable(this.primaryPaymentMethod, flags);
        dest.writeParcelable(this.backupPaymentMethod, flags);
        dest.writeInt(this.isCrypto ? 1 : 0);
        List<Instrument> list = this.instruments;
        dest.writeInt(list.size());
        Iterator<Instrument> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        BrokerageAccountType brokerageAccountType = this.brokerageAccountType;
        if (brokerageAccountType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(brokerageAccountType.name());
        }
        List<ApiAssetAllocation> list2 = this.assetAllocations;
        dest.writeInt(list2.size());
        Iterator<ApiAssetAllocation> it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable(it2.next(), flags);
        }
        dest.writeParcelable(this.accountBuyingPower, flags);
        dest.writeValue(this.onReviewEvent);
        dest.writeInt(this.isRecurringUpsell ? 1 : 0);
        dest.writeString(this.accountNumber);
        dest.writeValue(this.account);
    }

    public InvestFlowRecurringViewState(Money totalAmount, ApiInvestmentSchedule.Frequency frequency, LocalDate localDate, InvestFlowPaymentMethod investFlowPaymentMethod, InvestFlowPaymentMethod investFlowPaymentMethod2, boolean z, List<Instrument> instruments, BrokerageAccountType brokerageAccountType, List<ApiAssetAllocation> assetAllocations, Money money, UiEvent<LocalDate> uiEvent, boolean z2, String accountNumber, Account account) {
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        Intrinsics.checkNotNullParameter(assetAllocations, "assetAllocations");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.totalAmount = totalAmount;
        this.frequency = frequency;
        this.startDate = localDate;
        this.primaryPaymentMethod = investFlowPaymentMethod;
        this.backupPaymentMethod = investFlowPaymentMethod2;
        this.isCrypto = z;
        this.instruments = instruments;
        this.brokerageAccountType = brokerageAccountType;
        this.assetAllocations = assetAllocations;
        this.accountBuyingPower = money;
        this.onReviewEvent = uiEvent;
        this.isRecurringUpsell = z2;
        this.accountNumber = accountNumber;
        this.account = account;
    }

    public final Money getTotalAmount() {
        return this.totalAmount;
    }

    public final ApiInvestmentSchedule.Frequency getFrequency() {
        return this.frequency;
    }

    public final LocalDate getStartDate() {
        return this.startDate;
    }

    public final InvestFlowPaymentMethod getPrimaryPaymentMethod() {
        return this.primaryPaymentMethod;
    }

    public final InvestFlowPaymentMethod getBackupPaymentMethod() {
        return this.backupPaymentMethod;
    }

    public final boolean isCrypto() {
        return this.isCrypto;
    }

    public /* synthetic */ InvestFlowRecurringViewState(Money money, ApiInvestmentSchedule.Frequency frequency, LocalDate localDate, InvestFlowPaymentMethod investFlowPaymentMethod, InvestFlowPaymentMethod investFlowPaymentMethod2, boolean z, List list, BrokerageAccountType brokerageAccountType, List list2, Money money2, UiEvent uiEvent, boolean z2, String str, Account account, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(money, frequency, (i & 4) != 0 ? null : localDate, (i & 8) != 0 ? null : investFlowPaymentMethod, (i & 16) != 0 ? null : investFlowPaymentMethod2, (i & 32) != 0 ? false : z, (i & 64) != 0 ? CollectionsKt.emptyList() : list, brokerageAccountType, (i & 256) != 0 ? CollectionsKt.emptyList() : list2, (i & 512) != 0 ? null : money2, (i & 1024) != 0 ? null : uiEvent, (i & 2048) != 0 ? false : z2, str, (i & 8192) != 0 ? null : account);
    }

    public final List<Instrument> getInstruments() {
        return this.instruments;
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final List<ApiAssetAllocation> getAssetAllocations() {
        return this.assetAllocations;
    }

    public final Money getAccountBuyingPower() {
        return this.accountBuyingPower;
    }

    public final UiEvent<LocalDate> getOnReviewEvent() {
        return this.onReviewEvent;
    }

    public final boolean isRecurringUpsell() {
        return this.isRecurringUpsell;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final boolean isLoading() {
        return this.startDate == null;
    }

    private final boolean isJoint() {
        return this.brokerageAccountType == BrokerageAccountType.JOINT_TENANCY_WITH_ROS;
    }

    public final int getNumInstruments() {
        return this.instruments.size();
    }

    public final StringResource getRecurringTitleText() {
        if (getNumInstruments() == 1) {
            return StringResource.INSTANCE.invoke(C19349R.string.invest_flow_recurring_investment_single_title, this.instruments.get(0).getSymbol());
        }
        return StringResource.INSTANCE.invoke(C19349R.string.invest_flow_recurring_investment_title, new Object[0]);
    }

    public final StringResource getInstrumentsMetadataText() {
        return StringResource.INSTANCE.invoke(CollectionsKt.joinToString$default(this.instruments, null, null, null, 3, "+" + (getNumInstruments() - 3), new Function1() { // from class: com.robinhood.android.investFlow.recurring.InvestFlowRecurringViewState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowRecurringViewState._get_instrumentsMetadataText_$lambda$0((Instrument) obj);
            }
        }, 7, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence _get_instrumentsMetadataText_$lambda$0(Instrument it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getSymbol();
    }

    public final List<Row> getRows() {
        return this.isExpanded ? getAllRows() : getTopRows();
    }

    private final List<Row> getAllRows() {
        List<Instrument> list = this.instruments;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String symbol = ((Instrument) obj).getSymbol();
            Money dollar = this.assetAllocations.get(i).getDollar();
            arrayList.add(new Row(symbol, dollar != null ? Money.format$default(dollar, null, false, null, false, 0, null, false, null, false, false, 1023, null) : null));
            i = i2;
        }
        return arrayList;
    }

    private final List<Row> getTopRows() {
        return CollectionsKt.take(getAllRows(), 5);
    }

    public final boolean isExpandBtnVisible() {
        return this.instruments.size() > 5;
    }

    /* renamed from: isExpanded, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    public final void setExpanded(boolean z) {
        this.isExpanded = z;
    }

    public final void toggleExpanded() {
        this.isExpanded = !this.isExpanded;
    }

    public final StringResource getExpandBtnText() {
        int i;
        StringResource.Companion companion = StringResource.INSTANCE;
        if (this.isExpanded) {
            i = C19349R.string.invest_flow_recurring_button_view_less;
        } else {
            i = C19349R.string.invest_flow_recurring_button_view_all;
        }
        return companion.invoke(i, new Object[0]);
    }

    public final StringResource getTotalAmountMetadataPrimaryText() {
        return StringResource.INSTANCE.invoke(Money.format$default(this.totalAmount, null, false, null, false, 0, null, false, null, false, false, 1023, null));
    }

    public final StringResource getTotalAmountMetadataSecondaryText() {
        return StringResource.INSTANCE.invoke(C19349R.string.invest_flow_recurring_order_total_secondary, Integer.valueOf(getNumInstruments()));
    }

    public final StringResource getFrequencyMetadataPrimaryText() {
        StringResource.Companion companion = StringResource.INSTANCE;
        RecurringFrequencyBottomSheet.Row bottomSheetRow = RecurringFrequencyBottomSheet4.toBottomSheetRow(this.frequency, this.isCrypto);
        Intrinsics.checkNotNull(bottomSheetRow);
        return companion.invoke(bottomSheetRow.getTitle(), new Object[0]);
    }

    public final StringResource getFrequencyMetadataSecondaryText() {
        String displayName;
        LocalDate localDate = this.startDate;
        if (localDate != null) {
            StringResource.Companion companion = StringResource.INSTANCE;
            RecurringFrequencyBottomSheet.Row bottomSheetRow = RecurringFrequencyBottomSheet4.toBottomSheetRow(this.frequency, this.isCrypto);
            Intrinsics.checkNotNull(bottomSheetRow);
            int description = bottomSheetRow.getDescription();
            int i = WhenMappings.$EnumSwitchMapping$0[this.frequency.ordinal()];
            if (i == 1) {
                throw new IllegalStateException("we don't support paycheck in this flow");
            }
            if (i == 2 || i == 3 || i == 4) {
                displayName = localDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault(Locale.Category.DISPLAY));
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                displayName = NumberUtils.getDayOfMonthOrdinalString(localDate);
            }
            StringResource stringResourceInvoke = companion.invoke(description, displayName);
            if (stringResourceInvoke != null) {
                return stringResourceInvoke;
            }
        }
        return StringResource.INSTANCE.invoke("");
    }

    public final StringResource startDateMetadataPrimaryText(Resources res) {
        StringResource stringResourceInvoke;
        Intrinsics.checkNotNullParameter(res, "res");
        LocalDate localDate = this.startDate;
        return (localDate == null || (stringResourceInvoke = StringResource.INSTANCE.invoke(LocalDates4.formatRecent(localDate, res, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 2) != 0 ? LocalDateFormatter.MEDIUM : null, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 4) != 0 ? null : null, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 8) != 0, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 16) != 0, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 32) != 0, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 64) == 0 ? false : true, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 128) != 0 ? false : false))) == null) ? StringResource.INSTANCE.invoke("") : stringResourceInvoke;
    }

    public final StringResource getStartDateMetadataSecondaryText() {
        return getFrequencyMetadataSecondaryText();
    }

    private final AchRelationship getAchRelationship() {
        AchRelationship achRelationship;
        InvestFlowPaymentMethod investFlowPaymentMethod = this.primaryPaymentMethod;
        InvestFlowPaymentMethod.Ach ach = investFlowPaymentMethod instanceof InvestFlowPaymentMethod.Ach ? (InvestFlowPaymentMethod.Ach) investFlowPaymentMethod : null;
        if (ach != null && (achRelationship = ach.getAchRelationship()) != null) {
            return achRelationship;
        }
        InvestFlowPaymentMethod investFlowPaymentMethod2 = this.backupPaymentMethod;
        InvestFlowPaymentMethod.Ach ach2 = investFlowPaymentMethod2 instanceof InvestFlowPaymentMethod.Ach ? (InvestFlowPaymentMethod.Ach) investFlowPaymentMethod2 : null;
        if (ach2 != null) {
            return ach2.getAchRelationship();
        }
        return null;
    }

    private final StringResource getSelectedAchRelationshipNickname() {
        AchRelationship achRelationship = getAchRelationship();
        String bankAccountNickname = achRelationship != null ? achRelationship.getBankAccountNickname() : null;
        if (bankAccountNickname != null) {
            return StringResource.INSTANCE.invoke(bankAccountNickname);
        }
        return StringResource.INSTANCE.invoke(C11048R.string.general_label_emdash, new Object[0]);
    }

    private final StringResource getAddPaymentMethodStringResource() {
        return StringResource.INSTANCE.invoke(C19349R.string.invest_flow_add_payment_method, new Object[0]);
    }

    private final StringResource getBuyingPowerPaymentMethodStringResource() {
        int i;
        StringResource.Companion companion = StringResource.INSTANCE;
        if (this.isCrypto) {
            i = C19349R.string.gated_crypto_invest_flow_crypto_buying_power;
        } else if (isJoint()) {
            i = C19349R.string.invest_flow_joint_buying_power;
        } else {
            i = C19349R.string.invest_flow_buying_power;
        }
        return companion.invoke(i, new Object[0]);
    }

    public final StringResource getPaymentMethodCtaText() {
        if (this.primaryPaymentMethod == null) {
            return getAddPaymentMethodStringResource();
        }
        return null;
    }

    public final StringResource getPaymentMethodMetadataPrimaryText() {
        InvestFlowPaymentMethod investFlowPaymentMethod = this.primaryPaymentMethod;
        if (investFlowPaymentMethod instanceof InvestFlowPaymentMethod.Ach) {
            return getSelectedAchRelationshipNickname();
        }
        if (investFlowPaymentMethod instanceof InvestFlowPaymentMethod.BuyingPower) {
            return getBuyingPowerPaymentMethodStringResource();
        }
        if (investFlowPaymentMethod != null) {
            throw new NoWhenBranchMatchedException();
        }
        return getAddPaymentMethodStringResource();
    }

    public final StringResource getPaymentMethodMetadataSecondaryText() {
        Money money;
        String str;
        InvestFlowPaymentMethod investFlowPaymentMethod = this.primaryPaymentMethod;
        if (investFlowPaymentMethod instanceof InvestFlowPaymentMethod.Ach) {
            AchRelationship achRelationship = getAchRelationship();
            if (achRelationship != null) {
                return AchRelationships.getTypeAndLastFourDisplayStringResource(achRelationship);
            }
            return null;
        }
        if (!(investFlowPaymentMethod instanceof InvestFlowPaymentMethod.BuyingPower) || this.isCrypto || (money = this.accountBuyingPower) == null || (str = Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null)) == null) {
            return null;
        }
        return StringResource.INSTANCE.invoke(C19349R.string.invest_flow_amount_available, str);
    }

    public final boolean getBackupPaymentMethodRowVisible() {
        return this.primaryPaymentMethod instanceof InvestFlowPaymentMethod.BuyingPower;
    }

    public final StringResource getBackupPaymentMethodCtaText() {
        if (this.backupPaymentMethod == null) {
            return getAddPaymentMethodStringResource();
        }
        return null;
    }

    public final StringResource getBackupPaymentMethodMetadataPrimaryText() {
        String bankAccountNickname;
        InvestFlowPaymentMethod investFlowPaymentMethod = this.backupPaymentMethod;
        if (investFlowPaymentMethod instanceof InvestFlowPaymentMethod.Ach) {
            AchRelationship achRelationship = getAchRelationship();
            if (achRelationship == null || (bankAccountNickname = achRelationship.getBankAccountNickname()) == null) {
                return null;
            }
            return StringResource.INSTANCE.invoke(bankAccountNickname);
        }
        if (investFlowPaymentMethod instanceof InvestFlowPaymentMethod.BuyingPower) {
            return StringResource.INSTANCE.invoke(C19349R.string.invest_flow_buying_power, new Object[0]);
        }
        if (investFlowPaymentMethod == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final StringResource getBackupPaymentMethodMetadataSecondaryText() {
        InvestFlowPaymentMethod investFlowPaymentMethod = this.backupPaymentMethod;
        if (investFlowPaymentMethod instanceof InvestFlowPaymentMethod.Ach) {
            AchRelationship achRelationship = getAchRelationship();
            if (achRelationship != null) {
                return AchRelationships.getTypeAndLastFourDisplayStringResource(achRelationship);
            }
            return null;
        }
        if ((investFlowPaymentMethod instanceof InvestFlowPaymentMethod.BuyingPower) || investFlowPaymentMethod == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final StringResource getDisclaimerText() {
        int i;
        StringResource.Companion companion = StringResource.INSTANCE;
        BrokerageAccountType brokerageAccountType = this.brokerageAccountType;
        if (brokerageAccountType != null && brokerageAccountType.isRetirement()) {
            i = C19349R.string.invest_flow_recurring_retirement_disclaimer;
        } else {
            i = C19349R.string.invest_flow_recurring_disclaimer;
        }
        return companion.invoke(i, new Object[0]);
    }

    public final StringResource getDisclaimerCtaText() {
        int i;
        StringResource.Companion companion = StringResource.INSTANCE;
        BrokerageAccountType brokerageAccountType = this.brokerageAccountType;
        if (brokerageAccountType != null && brokerageAccountType.isRetirement()) {
            i = C11048R.string.general_action_learn_more;
        } else {
            i = C19349R.string.invest_flow_recurring_disclosure_cta;
        }
        return companion.invoke(i, new Object[0]);
    }

    public final StringResource getDisclosureTitle() {
        int i;
        StringResource.Companion companion = StringResource.INSTANCE;
        BrokerageAccountType brokerageAccountType = this.brokerageAccountType;
        if (brokerageAccountType != null && brokerageAccountType.isRetirement()) {
            i = C19349R.string.invest_flow_recurring_retirement_disclosure_title;
        } else {
            i = C19349R.string.invest_flow_recurring_disclosure_title;
        }
        return companion.invoke(i, new Object[0]);
    }

    public final StringResource getDisclosureDescription() {
        int i;
        StringResource.Companion companion = StringResource.INSTANCE;
        BrokerageAccountType brokerageAccountType = this.brokerageAccountType;
        if (brokerageAccountType != null && brokerageAccountType.isRetirement()) {
            i = C19349R.string.invest_flow_recurring_retirement_full_disclosure;
        } else {
            i = C19349R.string.invest_flow_recurring_full_disclosure;
        }
        return companion.invoke(i, new Object[0]);
    }

    public final boolean getReviewButtonEnabled() {
        return this.primaryPaymentMethod != null;
    }

    private final StringResource getFrequencyTextLowerCase() {
        StringResource.Companion companion = StringResource.INSTANCE;
        RecurringFrequencyBottomSheet.Row bottomSheetRow = RecurringFrequencyBottomSheet4.toBottomSheetRow(this.frequency, this.isCrypto);
        Intrinsics.checkNotNull(bottomSheetRow);
        return companion.invoke(bottomSheetRow.getTitleLowercase(), new Object[0]);
    }

    public final StringResource submitOrderSummary(Resources res) {
        Intrinsics.checkNotNullParameter(res, "res");
        if (getNumInstruments() > 1) {
            return StringResource.INSTANCE.invoke(C19349R.string.invest_flow_recurring_submit_summary_multiple, getOrderSummaryMultipleString(this.assetAllocations), getFrequencyTextLowerCase(), startDateMetadataPrimaryText(res));
        }
        return StringResource.INSTANCE.invoke(C19349R.string.invest_flow_recurring_submit_summary_single, Money.format$default(this.totalAmount, null, false, null, false, 0, null, false, null, false, false, 1023, null), getInstrumentsMetadataText(), getFrequencyTextLowerCase(), startDateMetadataPrimaryText(res), getInstrumentsMetadataText());
    }

    private final String getOrderSummaryMultipleString(List<ApiAssetAllocation> assetAllocations) {
        List<ApiAssetAllocation> list = assetAllocations;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        String str = "";
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ApiAssetAllocation apiAssetAllocation = (ApiAssetAllocation) obj;
            Money dollar = apiAssetAllocation.getDollar();
            String str2 = dollar != null ? Money.format$default(dollar, null, false, null, false, 0, null, false, null, false, false, 1023, null) : null;
            str = ((Object) str) + (str2 + " in " + apiAssetAllocation.getAsset().getAsset_symbol());
            if (i == this.instruments.size() - 2) {
                str = ((Object) str) + " and ";
            } else if (i != this.instruments.size() - 1) {
                str = ((Object) str) + ", ";
            }
            arrayList.add(Unit.INSTANCE);
            i = i2;
        }
        return str;
    }

    public final List<ApiInvestFlowRecurringSchedulePostBody> getRecurringSchedulesPostBody() {
        ApiInvestmentSchedule.SourceOfFunds sourceOfFunds;
        UUID id;
        LocalDate localDate = this.startDate;
        if (localDate != null) {
            InvestFlowPaymentMethod investFlowPaymentMethod = this.primaryPaymentMethod;
            Intrinsics.checkNotNull(investFlowPaymentMethod);
            ApiInvestmentSchedule.SourceOfFunds sourceOfFunds2 = investFlowPaymentMethod.getSourceOfFunds();
            InvestFlowPaymentMethod investFlowPaymentMethod2 = this.backupPaymentMethod;
            if (investFlowPaymentMethod2 != null) {
                sourceOfFunds = investFlowPaymentMethod2.getSourceOfFunds();
                id = null;
            } else {
                sourceOfFunds = null;
                id = null;
            }
            ApiInvestmentSchedule.Frequency frequency = this.frequency;
            AchRelationship achRelationship = getAchRelationship();
            if (achRelationship != null) {
                id = achRelationship.getId();
            }
            List<ApiInvestFlowRecurringSchedulePostBody> listListOf = CollectionsKt.listOf(new ApiInvestFlowRecurringSchedulePostBody(sourceOfFunds2, sourceOfFunds, localDate, frequency, id));
            if (listListOf != null) {
                return listListOf;
            }
        }
        return CollectionsKt.emptyList();
    }

    private final String getTaxYear() {
        LocalDate localDate = this.startDate;
        return String.valueOf(localDate != null ? Integer.valueOf(localDate.getYear()) : null);
    }

    public final StringResource getRetirementSubtitle() {
        return StringResource.INSTANCE.invoke(C19349R.string.invest_flow_recurring_retirement_subtitle, getTaxYear());
    }

    public final StringResource getAccountNameTitle() {
        DisplayName displayName;
        DisplayName.Variants withInvesting;
        Account account = this.account;
        if (account == null || (displayName = AccountDisplayNames.getDisplayName(account)) == null || (withInvesting = displayName.getWithInvesting()) == null) {
            return null;
        }
        return withInvesting.getTitle();
    }

    public final StringResource getAccountNameSubtitle() {
        Account account = this.account;
        if (account == null || !account.getHasNickname()) {
            return null;
        }
        return AccountDisplayNames.getDisplayNameWithoutNickname(this.account).getShort().getTitle();
    }

    public final StringResource getAccountTypeRowText() {
        return StringResource.INSTANCE.invoke(C19349R.string.account, new Object[0]);
    }

    /* compiled from: InvestFlowRecurringViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringViewState$Row;", "", "symbol", "", "amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getAmount", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Row {
        public static final int $stable = 0;
        private final String amount;
        private final String symbol;

        public Row(String symbol, String str) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            this.symbol = symbol;
            this.amount = str;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final String getAmount() {
            return this.amount;
        }
    }
}
