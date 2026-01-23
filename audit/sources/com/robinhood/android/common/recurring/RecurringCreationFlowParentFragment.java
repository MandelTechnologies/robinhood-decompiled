package com.robinhood.android.common.recurring;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.os.Bundle2;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.recurring.agreement.paycheck.PaycheckRecurringInvestmentAgreementFragment;
import com.robinhood.android.common.recurring.amount.type.RecurringOrderAmountTypeArgs;
import com.robinhood.android.common.recurring.amount.type.RecurringOrderAmountTypeShimFragment;
import com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionFragment;
import com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodFragment;
import com.robinhood.android.common.recurring.intro.RecurringInvestmentIntroCallbacks;
import com.robinhood.android.common.recurring.intro.RecurringInvestmentIntroGraphFragment;
import com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleFragment;
import com.robinhood.android.common.recurring.sourceoffunds.InvestmentSchedulesFrequencies;
import com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderActionType;
import com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsFragment;
import com.robinhood.android.common.recurring.sourceoffunds.paycheck.RecurringOrderPaycheckSourceFragment;
import com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationFragment;
import com.robinhood.android.common.recurring.utils.UiPaycheckInvestmentSchedules;
import com.robinhood.android.common.search.C11798R;
import com.robinhood.android.common.search.p087ui.SearchRecurringOrderFragment;
import com.robinhood.android.crypto.contracts.CryptoOrderIntentKey;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.ReturnedData;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.navigation.fragment.ReplaceFragmentBuilder;
import com.robinhood.android.recurring.contracts.ForceIntro;
import com.robinhood.android.recurring.contracts.RecurringGenericCreationFragmentKey;
import com.robinhood.android.recurring.contracts.RecurringOrderConfiguration;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowFrequency;
import com.robinhood.android.retirement.contracts.RetirementIntentKeys7;
import com.robinhood.android.retirement.contracts.RetirementLastKnownEntryPointManager;
import com.robinhood.android.retirement.contracts.RetirementSignUp;
import com.robinhood.android.sweep.contracts.SweepOnboardingContract;
import com.robinhood.android.sweep.contracts.SweepOnboardingIntentKey;
import com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration;
import com.robinhood.android.util.notification.RhGcmListenerService;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.bonfire.DirectDepositRelationship;
import com.robinhood.models.p355ui.recurring.paycheck.UiPaycheckInvestmentSchedule;
import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.AmountType;
import com.robinhood.recurring.models.InvestmentScheduleAmount;
import com.robinhood.recurring.models.RecurringInvestmentCategory;
import com.robinhood.recurring.models.RecurringInvestmentCategory2;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.recurring.models.p365db.InvestmentTarget;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.crypto.contracts.lib.TradeAction;
import com.robinhood.shared.education.contracts.OrderTypeEducationFragmentKey;
import com.robinhood.shared.education.order.OrderTypeEducationFragmentCallbacks;
import com.robinhood.shared.education.order.OrderTypeEducationLearnMoreFragment;
import com.robinhood.shared.recurring.contracts.InvestmentScheduleSettingsFragmentKey;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import p479j$.time.LocalDate;

/* compiled from: RecurringCreationFlowParentFragment.kt */
@Metadata(m3635d1 = {"\u0000¨\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 Á\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b:\u0002Á\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJy\u0010+\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010 2\u0006\u0010$\u001a\u00020#2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010*\u001a\u00020\u0018H\u0002¢\u0006\u0004\b+\u0010,J}\u00102\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020 2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\"\u001a\u0004\u0018\u00010 2\u0006\u0010$\u001a\u00020#2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010 2\u0006\u0010.\u001a\u00020&2\u0006\u0010/\u001a\u00020(2\b\b\u0002\u0010*\u001a\u00020\u00182\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J}\u00105\u001a\u00020\u000e2\u0006\u00104\u001a\u00020 2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\"\u001a\u0004\u0018\u00010 2\u0006\u0010$\u001a\u00020#2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010 2\u0006\u0010.\u001a\u00020&2\u0006\u0010/\u001a\u00020(2\b\b\u0002\u0010*\u001a\u00020\u00182\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b5\u00103Ja\u00106\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\"\u001a\u0004\u0018\u00010 2\u0006\u0010$\u001a\u00020#2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010 2\u0006\u0010.\u001a\u00020&2\u0006\u0010/\u001a\u00020(2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b6\u00107Ji\u0010:\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\"\u001a\u0004\u0018\u00010 2\u0006\u0010$\u001a\u00020#2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010 2\u0006\u0010.\u001a\u00020&2\u0006\u0010/\u001a\u00020(2\u0006\u00101\u001a\u0002002\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u00182\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0018H\u0002¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0018H\u0002¢\u0006\u0004\b@\u0010?J\u000f\u0010A\u001a\u00020\u0018H\u0002¢\u0006\u0004\bA\u0010?J\u000f\u0010B\u001a\u00020\u0018H\u0002¢\u0006\u0004\bB\u0010?J-\u0010G\u001a\u0004\u0018\u00010\u0014*\u00020C2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010F\u001a\u0004\u0018\u00010EH\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010K\u001a\u00020\u000e2\u0006\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bK\u0010LJ\u0019\u0010O\u001a\u00020\u000e2\b\u0010N\u001a\u0004\u0018\u00010MH\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u000eH\u0016¢\u0006\u0004\bQ\u0010\rJ\u000f\u0010R\u001a\u00020\u000eH\u0016¢\u0006\u0004\bR\u0010\rJ\u0017\u0010U\u001a\u00020\u000e2\u0006\u0010T\u001a\u00020SH\u0016¢\u0006\u0004\bU\u0010VJ#\u0010Z\u001a\u00020\u000e2\b\b\u0001\u0010X\u001a\u00020W2\b\b\u0001\u0010Y\u001a\u00020WH\u0016¢\u0006\u0004\bZ\u0010[J\u0017\u0010]\u001a\u00020\u000e2\u0006\u0010\\\u001a\u00020CH\u0016¢\u0006\u0004\b]\u0010^J\u001f\u0010`\u001a\u00020\u000e2\u0006\u0010_\u001a\u00020(2\u0006\u0010.\u001a\u00020&H\u0016¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u00020\u000eH\u0016¢\u0006\u0004\bb\u0010\rJ5\u0010d\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010c2\u0006\u0010$\u001a\u00020#2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\bd\u0010eJ-\u0010h\u001a\u00020\u000e2\u0006\u0010g\u001a\u00020f2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016¢\u0006\u0004\bh\u0010iJ!\u0010l\u001a\u00020\u00182\u0006\u0010j\u001a\u00020W2\b\u0010k\u001a\u0004\u0018\u00010MH\u0016¢\u0006\u0004\bl\u0010mJ!\u0010n\u001a\u00020\u00182\u0006\u0010j\u001a\u00020W2\b\u0010k\u001a\u0004\u0018\u00010MH\u0016¢\u0006\u0004\bn\u0010mJ-\u0010p\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016¢\u0006\u0004\bp\u0010qJ\u0019\u0010r\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\br\u0010sJ\u0017\u0010v\u001a\u00020\u000e2\u0006\u0010u\u001a\u00020tH\u0016¢\u0006\u0004\bv\u0010wJ)\u0010|\u001a\u00020\u000e2\u0006\u0010x\u001a\u00020W2\u0006\u0010y\u001a\u00020W2\b\u0010{\u001a\u0004\u0018\u00010zH\u0016¢\u0006\u0004\b|\u0010}R\u0016\u0010~\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0019\u0010/\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b/\u0010\u0080\u0001R\u0019\u0010.\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b.\u0010\u0081\u0001R\u0019\u0010\u0082\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001a\u0010\u001c\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001c\u0010\u0085\u0001R\u0019\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b$\u0010\u0086\u0001R\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b!\u0010\u0087\u0001R\u0019\u0010\"\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\"\u0010\u0087\u0001R\u001a\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0019\u0010\u008b\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0083\u0001R\u0019\u0010\u008c\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u0083\u0001R\u0019\u0010\u008d\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u0083\u0001R\u0019\u0010\u008e\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u0083\u0001R\u0019\u0010\u008f\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0083\u0001R7\u0010\u0097\u0001\u001a\u0004\u0018\u0001002\t\u0010\u0090\u0001\u001a\u0004\u0018\u0001008B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R5\u0010F\u001a\u0004\u0018\u00010t2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010t8B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0006\b\u0098\u0001\u0010\u0092\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0005\b\u009b\u0001\u0010wR*\u0010\u009d\u0001\u001a\u00030\u009c\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R*\u0010¤\u0001\u001a\u00030£\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001R*\u0010«\u0001\u001a\u00030ª\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R7\u0010µ\u0001\u001a\"\u0012\u001d\u0012\u001b\u0012\u0005\u0012\u00030³\u0001 ´\u0001*\f\u0012\u0005\u0012\u00030³\u0001\u0018\u00010²\u00010²\u00010±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R7\u0010¸\u0001\u001a\"\u0012\u001d\u0012\u001b\u0012\u0005\u0012\u00030·\u0001 ´\u0001*\f\u0012\u0005\u0012\u00030·\u0001\u0018\u00010²\u00010²\u00010±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¶\u0001R\u0016\u0010¹\u0001\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¹\u0001\u0010?R\u0016\u0010º\u0001\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bº\u0001\u0010?R\u0018\u00101\u001a\u0004\u0018\u0001008BX\u0082\u0004¢\u0006\b\u001a\u0006\b»\u0001\u0010\u0094\u0001R\u0018\u0010¿\u0001\u001a\u00030¼\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b½\u0001\u0010¾\u0001R\u0016\u0010À\u0001\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÀ\u0001\u0010?¨\u0006Â\u0001"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/RecurringCreationFlowParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/shared/education/order/OrderTypeEducationFragmentCallbacks;", "Lcom/robinhood/android/common/search/ui/SearchRecurringOrderFragment$Callbacks;", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleFragment$Callbacks;", "Lcom/robinhood/android/common/recurring/agreement/paycheck/PaycheckRecurringInvestmentAgreementFragment$Callbacks;", "Lcom/robinhood/android/common/recurring/backup/RecurringOrderBackupPaymentMethodFragment$Callbacks;", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsFragment$Callbacks;", "Lcom/robinhood/android/common/recurring/sourceoffunds/paycheck/RecurringOrderPaycheckSourceFragment$Callbacks;", "Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeShimFragment$Callbacks;", "Lcom/robinhood/android/common/recurring/intro/RecurringInvestmentIntroCallbacks;", "Lcom/robinhood/android/common/recurring/assetSelection/RecurringAssetCategorySelectionFragment$Callbacks;", "<init>", "()V", "", "showIntroFragment", "Landroidx/fragment/app/Fragment;", "getSearchOrNextFragment", "()Landroidx/fragment/app/Fragment;", "", "Lcom/robinhood/models/ui/recurring/paycheck/UiPaycheckInvestmentSchedule;", "existingRecurringSchedules", "Lcom/robinhood/models/db/bonfire/DirectDepositRelationship;", "directDepositRelationship", "", "checkShowEditExistingScheduleDialog", "(Ljava/util/List;Lcom/robinhood/models/db/bonfire/DirectDepositRelationship;)Z", "Lcom/robinhood/models/util/Money;", "amount", "Lcom/robinhood/recurring/models/AmountType;", "amountType", "wasAmountTypePreselected", "Ljava/util/UUID;", "achRelationshipId", "directDepositRelationshipId", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;", "sourceOfFunds", "backupAchRelationshipId", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "newFrequency", "j$/time/LocalDate", "newStartDate", "reviewOnly", "completeOrderConfiguration", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/recurring/models/AmountType;ZLjava/util/UUID;Ljava/util/UUID;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;Ljava/util/UUID;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lj$/time/LocalDate;Z)V", "equityInvestmentId", "frequency", "startDate", "", "accountNumber", "completeOrderConfigurationEquity", "(Ljava/util/UUID;Lcom/robinhood/models/util/Money;Lcom/robinhood/recurring/models/AmountType;ZLjava/util/UUID;Ljava/util/UUID;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;Ljava/util/UUID;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lj$/time/LocalDate;ZLjava/lang/String;)V", "currencyPairId", "completeOrderConfigurationCrypto", "completeOrderConfigurationBrokerageCash", "(Lcom/robinhood/recurring/models/AmountType;ZLjava/util/UUID;Ljava/util/UUID;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;Ljava/util/UUID;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lj$/time/LocalDate;Ljava/lang/String;)V", "Lrosetta/account/BrokerageAccountType;", "accountType", "completeOrderConfigurationRetirement", "(Lcom/robinhood/recurring/models/AmountType;ZLjava/util/UUID;Ljava/util/UUID;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;Ljava/util/UUID;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lj$/time/LocalDate;Ljava/lang/String;Lrosetta/account/BrokerageAccountType;)V", "shouldShowBackupPaymentMethod", "(Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;)Z", "isInstrumentSelected", "()Z", "instrumentSelectionRequired", "canChooseAssetCategory", "isGenericCreationFlow", "Lcom/robinhood/recurring/models/db/InvestmentTarget;", "schedules", "Lcom/robinhood/recurring/models/RecurringInvestmentCategory;", "assetCategory", "match", "(Lcom/robinhood/recurring/models/db/InvestmentTarget;Ljava/util/List;Lcom/robinhood/recurring/models/RecurringInvestmentCategory;)Lcom/robinhood/models/ui/recurring/paycheck/UiPaycheckInvestmentSchedule;", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStartCreateRecurringInvestmentFlow", "onExitCreateRecurringInvestmentFlow", "Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "onOrderTypeEducationFinished", "(Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration;)V", "", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, OrderTypeEducationLearnMoreFragment.ARG_DESCRIPTION_RES, "onLearnMoreClicked", "(II)V", "selectedInvestmentTarget", "onItemSelected", "(Lcom/robinhood/recurring/models/db/InvestmentTarget;)V", InquiryField.DateField.TYPE, "onScheduleSelectionComplete", "(Lj$/time/LocalDate;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;)V", "onPaycheckRecurringInvestmentAgreementAccepted", "Lcom/robinhood/recurring/models/InvestmentScheduleAmount$Dollar;", "onSourceOfFundsSelectionComplete", "(Lcom/robinhood/recurring/models/InvestmentScheduleAmount$Dollar;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;Ljava/util/UUID;Ljava/lang/String;)V", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderActionType;", "actionType", "onDirectDepositRelationshipSelectionComplete", "(Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderActionType;Lcom/robinhood/models/db/bonfire/DirectDepositRelationship;Ljava/util/List;)V", "id", "passthroughArgs", "onPositiveButtonClicked", "(ILandroid/os/Bundle;)Z", "onNegativeButtonClicked", "existingSchedules", "onAmountTypeSelectionComplete", "(ZLcom/robinhood/recurring/models/AmountType;Ljava/util/List;)V", "onBackupPaymentMethodSelectionComplete", "(Ljava/util/UUID;)V", "Lcom/robinhood/recurring/models/RecurringInvestmentSelection;", RhGcmListenerService.EXTRA_CATEGORY, "assetCategorySelected", "(Lcom/robinhood/recurring/models/RecurringInvestmentSelection;)V", "requestCode", "resultCode", "Landroid/content/Intent;", WebsocketGatewayConstants.DATA_KEY, "onActivityResult", "(IILandroid/content/Intent;)V", "investmentTarget", "Lcom/robinhood/recurring/models/db/InvestmentTarget;", "Lj$/time/LocalDate;", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "hasAcceptedPaycheckRecurringInvestmentAgreement", "Z", "Lcom/robinhood/recurring/models/InvestmentScheduleAmount;", "Lcom/robinhood/recurring/models/InvestmentScheduleAmount;", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;", "Ljava/util/UUID;", "Lcom/robinhood/android/recurring/contracts/ForceIntro;", "forceIntro", "Lcom/robinhood/android/recurring/contracts/ForceIntro;", "brokerageCashOptionEnabled", "retirementCashOptionEnabled", "investmentOptionEnabled", "userSweepEligible", "userSweepEnabled", "<set-?>", "individualAccountNumber$delegate", "Lkotlin/properties/ReadWriteProperty;", "getIndividualAccountNumber", "()Ljava/lang/String;", "setIndividualAccountNumber", "(Ljava/lang/String;)V", "individualAccountNumber", "assetCategory$delegate", "getAssetCategory", "()Lcom/robinhood/recurring/models/RecurringInvestmentSelection;", "setAssetCategory", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "getAccountProvider", "()Lcom/robinhood/android/lib/account/AccountProvider;", "setAccountProvider", "(Lcom/robinhood/android/lib/account/AccountProvider;)V", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "investmentScheduleStore", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "getInvestmentScheduleStore", "()Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "setInvestmentScheduleStore", "(Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;)V", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/android/sweep/contracts/SweepOnboardingIntentKey;", "kotlin.jvm.PlatformType", "sweepOnboardingLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/retirement/contracts/RetirementSignUp;", "retirementSignUpLauncher", "isCryptoOrder", RecurringOrderConfirmationFragment.ARG_IS_BROKERAGE_CASH_TRANSFER, "getAccountNumber", "Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration$PaycheckRecurringBrokerageCashStatus;", "getPaycheckRecurringBrokerageCashStatus", "()Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration$PaycheckRecurringBrokerageCashStatus;", "paycheckRecurringBrokerageCashStatus", "isCrypto", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RecurringCreationFlowParentFragment extends BaseFragment implements OrderTypeEducationFragmentCallbacks, SearchRecurringOrderFragment.Callbacks, RecurringOrderScheduleFragment.Callbacks, PaycheckRecurringInvestmentAgreementFragment.Callbacks, RecurringOrderBackupPaymentMethodFragment.Callbacks, RecurringOrderSourceOfFundsFragment.Callbacks, RecurringOrderPaycheckSourceFragment.Callbacks, RecurringOrderAmountTypeShimFragment.Callbacks, RecurringInvestmentIntroCallbacks, RecurringAssetCategorySelectionFragment.Callbacks {
    private static final String EDIT_EXISTING_SCHEDULE_DIALOG_TAG = "edit_existing_schedule";
    private static final String EDIT_EXISTING_SCHEDULE_UUID_KEY = "edit.existing.schedule.uuid.key";
    public static final int REQUEST_CODE_EQUITY_ORDER = 24;
    public AccountProvider accountProvider;
    private UUID achRelationshipId;
    private InvestmentScheduleAmount amount;

    /* renamed from: assetCategory$delegate, reason: from kotlin metadata */
    private final Interfaces3 assetCategory;
    private boolean brokerageCashOptionEnabled;
    private UUID directDepositRelationshipId;
    public ExperimentsStore experimentsStore;
    private ForceIntro forceIntro;
    private ApiInvestmentSchedule.Frequency frequency;
    private boolean hasAcceptedPaycheckRecurringInvestmentAgreement;

    /* renamed from: individualAccountNumber$delegate, reason: from kotlin metadata */
    private final Interfaces3 individualAccountNumber;
    private boolean investmentOptionEnabled;
    public TraderInvestmentScheduleStore investmentScheduleStore;
    private InvestmentTarget investmentTarget;
    private boolean retirementCashOptionEnabled;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<RetirementSignUp>> retirementSignUpLauncher;
    private ApiInvestmentSchedule.SourceOfFunds sourceOfFunds;
    private LocalDate startDate;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<SweepOnboardingIntentKey>> sweepOnboardingLauncher;
    private boolean userSweepEligible;
    private boolean userSweepEnabled;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(RecurringCreationFlowParentFragment.class, "individualAccountNumber", "getIndividualAccountNumber()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RecurringCreationFlowParentFragment.class, "assetCategory", "getAssetCategory()Lcom/robinhood/recurring/models/RecurringInvestmentSelection;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RecurringCreationFlowParentFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

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
            int[] iArr2 = new int[AmountType.values().length];
            try {
                iArr2[AmountType.DOLLAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[AmountType.PERCENTAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ApiAssetType.values().length];
            try {
                iArr3[ApiAssetType.BROKERAGE_CASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[ApiAssetType.EQUITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[ApiAssetType.CRYPTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[ApiAssetType.TOKENIZED_STOCK.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public RecurringCreationFlowParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.forceIntro = ForceIntro.FALSE;
        this.investmentOptionEnabled = true;
        Interfaces<Object, Interfaces3<Object, String>> interfacesSavedString = BindSavedState2.savedString(this);
        KProperty<?>[] kPropertyArr = $$delegatedProperties;
        this.individualAccountNumber = interfacesSavedString.provideDelegate(this, kPropertyArr[0]);
        this.assetCategory = (Interfaces3) BindSavedState2.savedParcelable(this).provideDelegate(this, kPropertyArr[1]);
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<SweepOnboardingIntentKey>> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new SweepOnboardingContract(new Function0() { // from class: com.robinhood.android.common.recurring.RecurringCreationFlowParentFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.common.recurring.RecurringCreationFlowParentFragment$sweepOnboardingLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(SweepOnboardingContract.Result result) {
                FragmentActivity activity;
                if (result instanceof SweepOnboardingContract.Result.Completed) {
                    this.this$0.userSweepEnabled = ((SweepOnboardingContract.Result.Completed) result).isSweepEnabled();
                    RecurringCreationFlowParentFragment recurringCreationFlowParentFragment = this.this$0;
                    recurringCreationFlowParentFragment.setOrReplaceFragment(C11048R.id.fragment_container, recurringCreationFlowParentFragment.getSearchOrNextFragment());
                } else {
                    if (!(result instanceof SweepOnboardingContract.Result.Canceled) && result != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!this.this$0.getChildFragmentManager().getFragments().isEmpty() || (activity = this.this$0.getActivity()) == null) {
                        return;
                    }
                    activity.finish();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.sweepOnboardingLauncher = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<RetirementSignUp>> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new RetirementIntentKeys7(new Function0() { // from class: com.robinhood.android.common.recurring.RecurringCreationFlowParentFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.common.recurring.RecurringCreationFlowParentFragment$retirementSignUpLauncher$2

            /* compiled from: RecurringCreationFlowParentFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.common.recurring.RecurringCreationFlowParentFragment$retirementSignUpLauncher$2$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[BrokerageAccountType.values().length];
                    try {
                        iArr[BrokerageAccountType.IRA_ROTH.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
            @Override // androidx.view.result.ActivityResultCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onActivityResult(RetirementIntentKeys7.Result result) {
                RecurringInvestmentCategory2 rothIra;
                RecurringInvestmentCategory2 recurringInvestmentCategory2;
                if (!(result instanceof RetirementIntentKeys7.Result.Success)) {
                    return;
                }
                RetirementIntentKeys7.Result.Success success = (RetirementIntentKeys7.Result.Success) result;
                int i = WhenMappings.$EnumSwitchMapping$0[success.getBrokerageAccountType().ordinal()];
                if (i == 1) {
                    rothIra = new RecurringInvestmentCategory.RothIra(success.getAccountNumber());
                } else {
                    if (i != 2) {
                        recurringInvestmentCategory2 = null;
                        if (recurringInvestmentCategory2 == null) {
                            this.this$0.assetCategorySelected(recurringInvestmentCategory2);
                            return;
                        }
                        return;
                    }
                    rothIra = new RecurringInvestmentCategory.TraditionalIra(success.getAccountNumber());
                }
                recurringInvestmentCategory2 = rothIra;
                if (recurringInvestmentCategory2 == null) {
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.retirementSignUpLauncher = activityResultLauncherRegisterForActivityResult2;
    }

    private final String getIndividualAccountNumber() {
        return (String) this.individualAccountNumber.getValue(this, $$delegatedProperties[0]);
    }

    private final void setIndividualAccountNumber(String str) {
        this.individualAccountNumber.setValue(this, $$delegatedProperties[0], str);
    }

    private final RecurringInvestmentCategory2 getAssetCategory() {
        return (RecurringInvestmentCategory2) this.assetCategory.getValue(this, $$delegatedProperties[1]);
    }

    private final void setAssetCategory(RecurringInvestmentCategory2 recurringInvestmentCategory2) {
        this.assetCategory.setValue(this, $$delegatedProperties[1], recurringInvestmentCategory2);
    }

    public final ExperimentsStore getExperimentsStore() {
        ExperimentsStore experimentsStore = this.experimentsStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsStore");
        return null;
    }

    public final void setExperimentsStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentsStore = experimentsStore;
    }

    public final AccountProvider getAccountProvider() {
        AccountProvider accountProvider = this.accountProvider;
        if (accountProvider != null) {
            return accountProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountProvider");
        return null;
    }

    public final void setAccountProvider(AccountProvider accountProvider) {
        Intrinsics.checkNotNullParameter(accountProvider, "<set-?>");
        this.accountProvider = accountProvider;
    }

    public final TraderInvestmentScheduleStore getInvestmentScheduleStore() {
        TraderInvestmentScheduleStore traderInvestmentScheduleStore = this.investmentScheduleStore;
        if (traderInvestmentScheduleStore != null) {
            return traderInvestmentScheduleStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("investmentScheduleStore");
        return null;
    }

    public final void setInvestmentScheduleStore(TraderInvestmentScheduleStore traderInvestmentScheduleStore) {
        Intrinsics.checkNotNullParameter(traderInvestmentScheduleStore, "<set-?>");
        this.investmentScheduleStore = traderInvestmentScheduleStore;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    /* renamed from: isCrypto */
    public boolean get_isCrypto() {
        return isCryptoOrder();
    }

    private final boolean isCryptoOrder() {
        return ((RecurringGenericCreationFragmentKey) INSTANCE.getArgs((Fragment) this)).getInvestmentTarget().isCrypto();
    }

    private final boolean isBrokerageCashTransfer() {
        return ((RecurringGenericCreationFragmentKey) INSTANCE.getArgs((Fragment) this)).getInvestmentTarget().isBrokerageCashTransfer();
    }

    private final String getAccountNumber() {
        String accountNumber = ((RecurringGenericCreationFragmentKey) INSTANCE.getArgs((Fragment) this)).getAccountNumber();
        return accountNumber == null ? getIndividualAccountNumber() : accountNumber;
    }

    private final RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus getPaycheckRecurringBrokerageCashStatus() {
        return new RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus(this.userSweepEnabled, this.userSweepEligible);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = getScarletContextWrapper();
        if (scarletContextWrapper == null) {
            scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        }
        putDesignSystemOverlay(scarletContextWrapper);
        if (isBrokerageCashTransfer()) {
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AchromaticOverlay.INSTANCE, null, 2, null);
        }
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        Maybe<String> individualAccountNumberMaybe;
        super.onCreate(savedInstanceState);
        Companion companion = INSTANCE;
        this.investmentTarget = ((RecurringGenericCreationFragmentKey) companion.getArgs((Fragment) this)).getInvestmentTarget();
        this.startDate = ((RecurringGenericCreationFragmentKey) companion.getArgs((Fragment) this)).getStartDate();
        this.frequency = ((RecurringGenericCreationFragmentKey) companion.getArgs((Fragment) this)).getFrequency();
        Money amount = ((RecurringGenericCreationFragmentKey) companion.getArgs((Fragment) this)).getAmount();
        if (amount != null) {
            this.amount = new InvestmentScheduleAmount.Dollar(amount);
        }
        this.brokerageCashOptionEnabled = ((RecurringGenericCreationFragmentKey) companion.getArgs((Fragment) this)).getBrokerageCashOptionEnabled();
        this.retirementCashOptionEnabled = ((RecurringGenericCreationFragmentKey) companion.getArgs((Fragment) this)).getRetirementCashOptionEnabled();
        this.investmentOptionEnabled = ((RecurringGenericCreationFragmentKey) companion.getArgs((Fragment) this)).getInvestmentOptionEnabled();
        this.userSweepEligible = ((RecurringGenericCreationFragmentKey) companion.getArgs((Fragment) this)).getUserSweepEligible();
        this.userSweepEnabled = ((RecurringGenericCreationFragmentKey) companion.getArgs((Fragment) this)).getUserSweepEnabled();
        ForceIntro forceIntro = ForceIntro.SKIP_INTRO;
        this.forceIntro = forceIntro;
        if (savedInstanceState == null) {
            RecurringInvestmentCategory assetCategory = ((RecurringGenericCreationFragmentKey) companion.getArgs((Fragment) this)).getAssetCategory();
            if (assetCategory != null) {
                assetCategorySelected(assetCategory);
            } else {
                setFragment(C11048R.id.fragment_container, getSearchOrNextFragment());
            }
        }
        String accountNumber = ((RecurringGenericCreationFragmentKey) companion.getArgs((Fragment) this)).getAccountNumber();
        if (accountNumber == null || (individualAccountNumberMaybe = Maybe.just(accountNumber)) == null) {
            individualAccountNumberMaybe = getAccountProvider().getIndividualAccountNumberMaybe();
        }
        LifecycleHost.DefaultImpls.bind$default(this, individualAccountNumberMaybe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.RecurringCreationFlowParentFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringCreationFlowParentFragment.onCreate$lambda$6(this.f$0, (String) obj);
            }
        });
        if (this.forceIntro != forceIntro) {
            Observable<R> observableFlatMapObservable = individualAccountNumberMaybe.flatMapObservable(new Function() { // from class: com.robinhood.android.common.recurring.RecurringCreationFlowParentFragment.onCreate.4
                @Override // io.reactivex.functions.Function
                public final ObservableSource<? extends List<InvestmentSchedule>> apply(String accountNumber2) {
                    Intrinsics.checkNotNullParameter(accountNumber2, "accountNumber");
                    return RecurringCreationFlowParentFragment.this.getInvestmentScheduleStore().getStreamAccountInvestmentSchedules().asObservable(accountNumber2);
                }
            });
            Intrinsics.checkNotNullExpressionValue(observableFlatMapObservable, "flatMapObservable(...)");
            LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnFastPath(observableFlatMapObservable), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.RecurringCreationFlowParentFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringCreationFlowParentFragment.onCreate$lambda$7(this.f$0, (List) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$6(RecurringCreationFlowParentFragment recurringCreationFlowParentFragment, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        recurringCreationFlowParentFragment.setIndividualAccountNumber(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$7(RecurringCreationFlowParentFragment recurringCreationFlowParentFragment, List list) {
        if (list.isEmpty() || recurringCreationFlowParentFragment.forceIntro == ForceIntro.TRUE) {
            recurringCreationFlowParentFragment.showIntroFragment();
        }
        return Unit.INSTANCE;
    }

    private final void showIntroFragment() {
        new ReplaceFragmentBuilder(RecurringInvestmentIntroGraphFragment.INSTANCE.newInstance(isCryptoOrder())).setUseDefaultAnimation(false).buildAndExecute(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Fragment getSearchOrNextFragment() {
        InvestmentTarget investmentTarget;
        int i;
        InvestmentTarget investmentTarget2 = this.investmentTarget;
        InvestmentTarget investmentTarget3 = null;
        if (investmentTarget2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("investmentTarget");
            investmentTarget = null;
        } else {
            investmentTarget = investmentTarget2;
        }
        if (!isInstrumentSelected() && canChooseAssetCategory()) {
            RecurringAssetCategorySelectionFragment.Companion companion = RecurringAssetCategorySelectionFragment.INSTANCE;
            boolean z = this.userSweepEligible;
            Companion companion2 = INSTANCE;
            return companion.newInstance((Parcelable) new RecurringAssetCategorySelectionFragment.Args(z, ((RecurringGenericCreationFragmentKey) companion2.getArgs((Fragment) this)).getEntryPoint(), ((RecurringGenericCreationFragmentKey) companion2.getArgs((Fragment) this)).getSource(), this.brokerageCashOptionEnabled, this.retirementCashOptionEnabled, this.investmentOptionEnabled));
        }
        if (!isInstrumentSelected() && instrumentSelectionRequired()) {
            SearchRecurringOrderFragment.Companion companion3 = SearchRecurringOrderFragment.INSTANCE;
            ApiInvestmentSchedule.Frequency frequency = this.frequency;
            int i2 = frequency == null ? -1 : WhenMappings.$EnumSwitchMapping$0[frequency.ordinal()];
            if (i2 == -1) {
                i = C11798R.string.search_recurring_toolbar_title;
            } else if (i2 == 1) {
                i = C11798R.string.search_recurring_paycheck_toolbar_title;
            } else {
                if (i2 != 2 && i2 != 3 && i2 != 4 && i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C11798R.string.search_recurring_toolbar_title;
            }
            return companion3.newInstance((Parcelable) new SearchRecurringOrderFragment.Args(false, false, false, i, null, this.frequency == ApiInvestmentSchedule.Frequency.EVERY_PAYCHECK, null, null, null, 471, null));
        }
        ApiInvestmentSchedule.Frequency frequency2 = this.frequency;
        if (frequency2 == null) {
            RecurringOrderScheduleFragment.Companion companion4 = RecurringOrderScheduleFragment.INSTANCE;
            Companion companion5 = INSTANCE;
            return companion4.newInstance((Parcelable) new RecurringOrderScheduleFragment.Args.Create(((RecurringGenericCreationFragmentKey) companion5.getArgs((Fragment) this)).isFromHook(), ((RecurringGenericCreationFragmentKey) companion5.getArgs((Fragment) this)).getSource(), ((RecurringGenericCreationFragmentKey) companion5.getArgs((Fragment) this)).getEntryPoint(), investmentTarget));
        }
        if (frequency2 == ApiInvestmentSchedule.Frequency.EVERY_PAYCHECK) {
            if (!investmentTarget.isBrokerageCashTransfer() && !this.hasAcceptedPaycheckRecurringInvestmentAgreement) {
                PaycheckRecurringInvestmentAgreementFragment.Companion companion6 = PaycheckRecurringInvestmentAgreementFragment.INSTANCE;
                InvestmentTarget investmentTarget4 = this.investmentTarget;
                if (investmentTarget4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("investmentTarget");
                    investmentTarget4 = null;
                }
                boolean zIsCrypto = investmentTarget4.isCrypto();
                InvestmentTarget investmentTarget5 = this.investmentTarget;
                if (investmentTarget5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("investmentTarget");
                } else {
                    investmentTarget3 = investmentTarget5;
                }
                return (BaseFragment) companion6.newInstance((Parcelable) new PaycheckRecurringInvestmentAgreementFragment.Args(zIsCrypto, investmentTarget3.isBrokerageCashTransfer()));
            }
            Companion companion7 = INSTANCE;
            if (((RecurringGenericCreationFragmentKey) companion7.getArgs((Fragment) this)).getSkipDirectDepositRelationshipSelection()) {
                RecurringOrderAmountTypeShimFragment.Companion companion8 = RecurringOrderAmountTypeShimFragment.INSTANCE;
                InvestmentTarget investmentTarget6 = this.investmentTarget;
                if (investmentTarget6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("investmentTarget");
                    investmentTarget6 = null;
                }
                ApiAssetType targetType = investmentTarget6.getTargetType();
                InvestmentTarget investmentTarget7 = this.investmentTarget;
                if (investmentTarget7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("investmentTarget");
                } else {
                    investmentTarget3 = investmentTarget7;
                }
                boolean zIsBrokerageCashTransfer = investmentTarget3.isBrokerageCashTransfer();
                RecurringOrderActionType.Create create = RecurringOrderActionType.Create.INSTANCE;
                String source = ((RecurringGenericCreationFragmentKey) companion7.getArgs((Fragment) this)).getSource();
                ApiInvestmentSchedule.Frequency frequency3 = this.frequency;
                Intrinsics.checkNotNull(frequency3);
                return (BaseFragment) companion8.newInstance((Parcelable) new RecurringOrderAmountTypeArgs(targetType, zIsBrokerageCashTransfer, create, null, source, frequency3, null, 64, null));
            }
            ApiInvestmentSchedule.Frequency frequency4 = this.frequency;
            Intrinsics.checkNotNull(frequency4);
            return InvestmentSchedulesFrequencies.getSourceOfFundsFragment$default(frequency4, RecurringOrderActionType.Create.INSTANCE, investmentTarget, null, ((RecurringGenericCreationFragmentKey) companion7.getArgs((Fragment) this)).getSource(), false, ((RecurringGenericCreationFragmentKey) companion7.getArgs((Fragment) this)).getAccountNumber(), 32, null);
        }
        Intrinsics.checkNotNull(frequency2);
        RecurringOrderActionType.Create create2 = RecurringOrderActionType.Create.INSTANCE;
        Companion companion9 = INSTANCE;
        return InvestmentSchedulesFrequencies.getSourceOfFundsFragment$default(frequency2, create2, investmentTarget, null, ((RecurringGenericCreationFragmentKey) companion9.getArgs((Fragment) this)).getSource(), false, ((RecurringGenericCreationFragmentKey) companion9.getArgs((Fragment) this)).getAccountNumber(), 32, null);
    }

    @Override // com.robinhood.android.common.recurring.intro.RecurringInvestmentIntroCallbacks
    public void onStartCreateRecurringInvestmentFlow() {
        popLastFragment();
    }

    @Override // com.robinhood.android.common.recurring.intro.RecurringInvestmentIntroCallbacks
    public void onExitCreateRecurringInvestmentFlow() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.robinhood.shared.education.order.OrderTypeEducationFragmentCallbacks
    public void onOrderTypeEducationFinished(OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        replaceFragment(getSearchOrNextFragment());
    }

    @Override // com.robinhood.shared.education.order.OrderTypeEducationFragmentCallbacks
    public void onLearnMoreClicked(int titleRes, int descriptionRes) {
        replaceFragment(OrderTypeEducationLearnMoreFragment.INSTANCE.newInstance(titleRes, descriptionRes));
    }

    @Override // com.robinhood.android.common.search.ui.SearchRecurringOrderFragment.Callbacks
    public void onItemSelected(InvestmentTarget selectedInvestmentTarget) {
        Intrinsics.checkNotNullParameter(selectedInvestmentTarget, "selectedInvestmentTarget");
        this.investmentTarget = selectedInvestmentTarget;
        replaceFragment(getSearchOrNextFragment());
    }

    @Override // com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleFragment.Callbacks
    public void onScheduleSelectionComplete(LocalDate date, ApiInvestmentSchedule.Frequency frequency) {
        BaseFragment sourceOfFundsFragment$default;
        InvestmentTarget investmentTarget;
        InvestmentTarget investmentTarget2;
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        this.startDate = date;
        this.frequency = frequency;
        int i = WhenMappings.$EnumSwitchMapping$0[frequency.ordinal()];
        if (i == 1) {
            InvestmentTarget investmentTarget3 = null;
            InvestmentTarget investmentTarget4 = this.investmentTarget;
            if (investmentTarget4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("investmentTarget");
                investmentTarget4 = null;
            }
            if (investmentTarget4.isBrokerageCashTransfer()) {
                RecurringOrderActionType.Create create = RecurringOrderActionType.Create.INSTANCE;
                InvestmentTarget investmentTarget5 = this.investmentTarget;
                if (investmentTarget5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("investmentTarget");
                    investmentTarget = null;
                } else {
                    investmentTarget = investmentTarget5;
                }
                Companion companion = INSTANCE;
                String source = ((RecurringGenericCreationFragmentKey) companion.getArgs((Fragment) this)).getSource();
                String accountNumber = ((RecurringGenericCreationFragmentKey) companion.getArgs((Fragment) this)).getAccountNumber();
                Intrinsics.checkNotNull(accountNumber);
                sourceOfFundsFragment$default = InvestmentSchedulesFrequencies.getSourceOfFundsFragment$default(frequency, create, investmentTarget, null, source, false, accountNumber, 32, null);
            } else {
                PaycheckRecurringInvestmentAgreementFragment.Companion companion2 = PaycheckRecurringInvestmentAgreementFragment.INSTANCE;
                InvestmentTarget investmentTarget6 = this.investmentTarget;
                if (investmentTarget6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("investmentTarget");
                    investmentTarget6 = null;
                }
                boolean zIsCrypto = investmentTarget6.isCrypto();
                InvestmentTarget investmentTarget7 = this.investmentTarget;
                if (investmentTarget7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("investmentTarget");
                } else {
                    investmentTarget3 = investmentTarget7;
                }
                sourceOfFundsFragment$default = (BaseFragment) companion2.newInstance((Parcelable) new PaycheckRecurringInvestmentAgreementFragment.Args(zIsCrypto, investmentTarget3.isBrokerageCashTransfer()));
            }
        } else {
            if (i != 2 && i != 3 && i != 4 && i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            RecurringOrderActionType.Create create2 = RecurringOrderActionType.Create.INSTANCE;
            InvestmentTarget investmentTarget8 = this.investmentTarget;
            if (investmentTarget8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("investmentTarget");
                investmentTarget2 = null;
            } else {
                investmentTarget2 = investmentTarget8;
            }
            Companion companion3 = INSTANCE;
            sourceOfFundsFragment$default = InvestmentSchedulesFrequencies.getSourceOfFundsFragment$default(frequency, create2, investmentTarget2, null, ((RecurringGenericCreationFragmentKey) companion3.getArgs((Fragment) this)).getSource(), false, ((RecurringGenericCreationFragmentKey) companion3.getArgs((Fragment) this)).getAccountNumber(), 32, null);
        }
        replaceFragment(sourceOfFundsFragment$default);
    }

    @Override // com.robinhood.android.common.recurring.agreement.paycheck.PaycheckRecurringInvestmentAgreementFragment.Callbacks
    public void onPaycheckRecurringInvestmentAgreementAccepted() {
        this.hasAcceptedPaycheckRecurringInvestmentAgreement = true;
        replaceFragment(getSearchOrNextFragment());
    }

    @Override // com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsFragment.Callbacks
    public void onSourceOfFundsSelectionComplete(InvestmentScheduleAmount.Dollar amount, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, UUID achRelationshipId, String accountNumber) {
        Intrinsics.checkNotNullParameter(sourceOfFunds, "sourceOfFunds");
        if (amount != null) {
            this.amount = amount;
        }
        this.sourceOfFunds = sourceOfFunds;
        this.achRelationshipId = achRelationshipId;
        InvestmentTarget investmentTarget = null;
        if (shouldShowBackupPaymentMethod(sourceOfFunds)) {
            RecurringOrderBackupPaymentMethodFragment.Companion companion = RecurringOrderBackupPaymentMethodFragment.INSTANCE;
            InvestmentTarget investmentTarget2 = this.investmentTarget;
            if (investmentTarget2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("investmentTarget");
            } else {
                investmentTarget = investmentTarget2;
            }
            replaceFragment(RecurringOrderBackupPaymentMethodFragment.Companion.newInstance$default(companion, investmentTarget.isCrypto(), false, null, ((RecurringGenericCreationFragmentKey) INSTANCE.getArgs((Fragment) this)).getSource(), false, 22, null));
            return;
        }
        InvestmentScheduleAmount investmentScheduleAmount = this.amount;
        completeOrderConfiguration$default(this, investmentScheduleAmount != null ? investmentScheduleAmount.getDollarAmount() : null, null, false, this.achRelationshipId, null, sourceOfFunds, null, null, null, false, 982, null);
    }

    @Override // com.robinhood.android.common.recurring.sourceoffunds.paycheck.RecurringOrderPaycheckSourceFragment.Callbacks
    public void onDirectDepositRelationshipSelectionComplete(RecurringOrderActionType actionType, DirectDepositRelationship directDepositRelationship, List<UiPaycheckInvestmentSchedule> existingRecurringSchedules) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(directDepositRelationship, "directDepositRelationship");
        Intrinsics.checkNotNullParameter(existingRecurringSchedules, "existingRecurringSchedules");
        this.directDepositRelationshipId = directDepositRelationship.getId();
        if (checkShowEditExistingScheduleDialog(existingRecurringSchedules, directDepositRelationship)) {
            return;
        }
        AmountType paycheckInvestmentAmountType = directDepositRelationship.getPaycheckInvestmentAmountType();
        int i = paycheckInvestmentAmountType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[paycheckInvestmentAmountType.ordinal()];
        if (i != -1) {
            if (i != 1 && i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            onAmountTypeSelectionComplete(true, paycheckInvestmentAmountType, existingRecurringSchedules);
            return;
        }
        RecurringOrderAmountTypeShimFragment.Companion companion = RecurringOrderAmountTypeShimFragment.INSTANCE;
        InvestmentTarget investmentTarget = this.investmentTarget;
        InvestmentTarget investmentTarget2 = null;
        if (investmentTarget == null) {
            Intrinsics.throwUninitializedPropertyAccessException("investmentTarget");
            investmentTarget = null;
        }
        ApiAssetType targetType = investmentTarget.getTargetType();
        InvestmentTarget investmentTarget3 = this.investmentTarget;
        if (investmentTarget3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("investmentTarget");
        } else {
            investmentTarget2 = investmentTarget3;
        }
        boolean zIsBrokerageCashTransfer = investmentTarget2.isBrokerageCashTransfer();
        UUID id = directDepositRelationship.getId();
        String source = ((RecurringGenericCreationFragmentKey) INSTANCE.getArgs((Fragment) this)).getSource();
        ApiInvestmentSchedule.Frequency frequency = this.frequency;
        Intrinsics.checkNotNull(frequency);
        replaceFragment(companion.newInstance((Parcelable) new RecurringOrderAmountTypeArgs(targetType, zIsBrokerageCashTransfer, actionType, id, source, frequency, existingRecurringSchedules)));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C11595R.id.dialog_id_edit_existing_schedule_explanation) {
            Serializable serializable = passthroughArgs != null ? passthroughArgs.getSerializable(EDIT_EXISTING_SCHEDULE_UUID_KEY) : null;
            Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type java.util.UUID");
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new InvestmentScheduleSettingsFragmentKey((UUID) serializable, false, 2, null), false, true, false, false, null, false, null, null, 992, null);
            if (getChildFragmentManager().getFragments().size() == 2) {
                List<Fragment> fragments = getChildFragmentManager().getFragments();
                Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
                if ((CollectionsKt.first((List) fragments) instanceof RecurringOrderAmountTypeShimFragment) && Intrinsics.areEqual(getChildFragmentManager().getFragments().get(1).getTag(), EDIT_EXISTING_SCHEDULE_DIALOG_TAG)) {
                    requireActivity().finish();
                }
            }
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C11595R.id.dialog_id_edit_existing_schedule_explanation) {
            if (this.directDepositRelationshipId != null) {
                return true;
            }
            popLastFragment();
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.recurring.amount.type.RecurringOrderAmountTypeShimFragment.Callbacks
    public void onAmountTypeSelectionComplete(boolean wasAmountTypePreselected, AmountType amountType, List<UiPaycheckInvestmentSchedule> existingSchedules) {
        Intrinsics.checkNotNullParameter(amountType, "amountType");
        Intrinsics.checkNotNullParameter(existingSchedules, "existingSchedules");
        if (checkShowEditExistingScheduleDialog(existingSchedules, null)) {
            return;
        }
        InvestmentScheduleAmount investmentScheduleAmount = this.amount;
        completeOrderConfiguration$default(this, investmentScheduleAmount != null ? investmentScheduleAmount.getDollarAmount() : null, amountType, wasAmountTypePreselected, null, this.directDepositRelationshipId, ApiInvestmentSchedule.SourceOfFunds.DIRECT_DEPOSIT, null, null, null, false, 960, null);
    }

    @Override // com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodFragment.Callbacks
    public void onBackupPaymentMethodSelectionComplete(UUID backupAchRelationshipId) {
        ApiInvestmentSchedule.SourceOfFunds sourceOfFunds = this.sourceOfFunds;
        if (sourceOfFunds == null) {
            throw new IllegalStateException("sourceOfFunds must not be null when showing recurring order confirmation");
        }
        InvestmentScheduleAmount investmentScheduleAmount = this.amount;
        completeOrderConfiguration$default(this, investmentScheduleAmount != null ? investmentScheduleAmount.getDollarAmount() : null, null, false, this.achRelationshipId, null, sourceOfFunds, backupAchRelationshipId, null, null, false, 918, null);
    }

    @Override // com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionFragment.Callbacks
    public void assetCategorySelected(RecurringInvestmentCategory2 category) {
        Intrinsics.checkNotNullParameter(category, "category");
        setAssetCategory(category);
        InvestmentTarget investmentTarget = this.investmentTarget;
        if (investmentTarget == null) {
            Intrinsics.throwUninitializedPropertyAccessException("investmentTarget");
            investmentTarget = null;
        }
        this.investmentTarget = InvestmentTarget.copy$default(investmentTarget, null, null, category.getApiAssetType(), 3, null);
        if ((category instanceof RecurringInvestmentCategory.BrokerageCash) && this.userSweepEligible && !this.userSweepEnabled) {
            NavigationActivityResultContract3.launch$default(this.sweepOnboardingLauncher, new SweepOnboardingIntentKey(null, "recurring_investment", true, 1, null), null, false, 6, null);
        } else if (Intrinsics.areEqual(category, RecurringInvestmentCategory2.RetirementSetUp.INSTANCE)) {
            RetirementLastKnownEntryPointManager.INSTANCE.setLastKnownEntryPoint(RetirementLastKnownEntryPointManager.SYP_UPSELL);
            NavigationActivityResultContract3.launch$default(this.retirementSignUpLauncher, new RetirementSignUp(null, null, true, null, false, null, null, 123, null), null, false, 6, null);
        } else {
            setOrReplaceFragment(C11048R.id.fragment_container, getSearchOrNextFragment());
        }
    }

    /* renamed from: checkShowEditExistingScheduleDialog$showEditExistingScheduleDialog */
    private static final void m1847x51ae7adc(RecurringCreationFlowParentFragment recurringCreationFlowParentFragment, UiPaycheckInvestmentSchedule uiPaycheckInvestmentSchedule, DirectDepositRelationship directDepositRelationship) {
        Context contextRequireContext = recurringCreationFlowParentFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder title = new RhDialogFragment.Builder(contextRequireContext).setId(C11595R.id.dialog_id_edit_existing_schedule_explanation).setTitle(recurringCreationFlowParentFragment.getResources().getString(UiPaycheckInvestmentSchedules.getEditExistingScheduleDialogTitleText(uiPaycheckInvestmentSchedule)));
        StringResource stringResourceEditExistingScheduleDialogMessageText = UiPaycheckInvestmentSchedules.editExistingScheduleDialogMessageText(uiPaycheckInvestmentSchedule, directDepositRelationship);
        Resources resources = recurringCreationFlowParentFragment.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        RhDialogFragment.Builder negativeButton = title.setMessage(stringResourceEditExistingScheduleDialogMessageText.getText(resources)).setPositiveButton(recurringCreationFlowParentFragment.getResources().getString(UiPaycheckInvestmentSchedules.getEditExistingScheduleDialogPrimaryCtaText(uiPaycheckInvestmentSchedule))).setPassthroughArgs(Bundle2.bundleOf(Tuples4.m3642to(EDIT_EXISTING_SCHEDULE_UUID_KEY, uiPaycheckInvestmentSchedule.getInvestmentScheduleId()))).setNegativeButton(recurringCreationFlowParentFragment.getResources().getString(UiPaycheckInvestmentSchedules.getEditExistingScheduleDialogSecondaryCtaText(uiPaycheckInvestmentSchedule)));
        FragmentManager childFragmentManager = recurringCreationFlowParentFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(negativeButton, childFragmentManager, EDIT_EXISTING_SCHEDULE_DIALOG_TAG, false, 4, null);
    }

    private final boolean checkShowEditExistingScheduleDialog(List<UiPaycheckInvestmentSchedule> existingRecurringSchedules, DirectDepositRelationship directDepositRelationship) {
        InvestmentTarget investmentTarget = this.investmentTarget;
        if (investmentTarget == null) {
            Intrinsics.throwUninitializedPropertyAccessException("investmentTarget");
            investmentTarget = null;
        }
        if (investmentTarget.getTargetType() != ApiAssetType.BROKERAGE_CASH) {
            return false;
        }
        InvestmentTarget investmentTarget2 = this.investmentTarget;
        if (investmentTarget2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("investmentTarget");
            investmentTarget2 = null;
        }
        RecurringInvestmentCategory2 assetCategory = getAssetCategory();
        UiPaycheckInvestmentSchedule uiPaycheckInvestmentScheduleMatch = match(investmentTarget2, existingRecurringSchedules, assetCategory instanceof RecurringInvestmentCategory ? (RecurringInvestmentCategory) assetCategory : null);
        if (uiPaycheckInvestmentScheduleMatch == null) {
            return false;
        }
        m1847x51ae7adc(this, uiPaycheckInvestmentScheduleMatch, directDepositRelationship);
        return true;
    }

    static /* synthetic */ void completeOrderConfiguration$default(RecurringCreationFlowParentFragment recurringCreationFlowParentFragment, Money money, AmountType amountType, boolean z, UUID uuid, UUID uuid2, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, UUID uuid3, ApiInvestmentSchedule.Frequency frequency, LocalDate localDate, boolean z2, int i, Object obj) {
        boolean z3;
        RecurringCreationFlowParentFragment recurringCreationFlowParentFragment2;
        Money money2;
        UUID uuid4;
        ApiInvestmentSchedule.SourceOfFunds sourceOfFunds2;
        if ((i & 2) != 0) {
            amountType = AmountType.DOLLAR;
        }
        AmountType amountType2 = amountType;
        boolean z4 = (i & 4) != 0 ? false : z;
        UUID uuid5 = (i & 16) != 0 ? null : uuid2;
        UUID uuid6 = (i & 64) != 0 ? null : uuid3;
        ApiInvestmentSchedule.Frequency frequency2 = (i & 128) != 0 ? null : frequency;
        LocalDate localDate2 = (i & 256) != 0 ? null : localDate;
        if ((i & 512) != 0) {
            z3 = false;
            recurringCreationFlowParentFragment2 = recurringCreationFlowParentFragment;
            uuid4 = uuid;
            sourceOfFunds2 = sourceOfFunds;
            money2 = money;
        } else {
            z3 = z2;
            recurringCreationFlowParentFragment2 = recurringCreationFlowParentFragment;
            money2 = money;
            uuid4 = uuid;
            sourceOfFunds2 = sourceOfFunds;
        }
        recurringCreationFlowParentFragment2.completeOrderConfiguration(money2, amountType2, z4, uuid4, uuid5, sourceOfFunds2, uuid6, frequency2, localDate2, z3);
    }

    private final void completeOrderConfiguration(Money amount, AmountType amountType, boolean wasAmountTypePreselected, UUID achRelationshipId, UUID directDepositRelationshipId, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, UUID backupAchRelationshipId, ApiInvestmentSchedule.Frequency newFrequency, LocalDate newStartDate, boolean reviewOnly) {
        LocalDate localDateDefaultInvestmentStartDate$default;
        rosetta.account.BrokerageAccountType brokerageAccountType;
        InvestmentTarget investmentTarget = this.investmentTarget;
        if (investmentTarget == null) {
            Intrinsics.throwUninitializedPropertyAccessException("investmentTarget");
            investmentTarget = null;
        }
        RecurringInvestmentCategory2 assetCategory = getAssetCategory();
        ApiInvestmentSchedule.Frequency frequency = newFrequency == null ? this.frequency : newFrequency;
        if (frequency == null) {
            throw new IllegalStateException("can not complete recurring order configuration without selected frequency");
        }
        int i = WhenMappings.$EnumSwitchMapping$0[frequency.ordinal()];
        if (i == 1) {
            localDateDefaultInvestmentStartDate$default = InvestFlowFrequency.Companion.defaultInvestmentStartDate$default(InvestFlowFrequency.INSTANCE, null, 1, null);
        } else {
            if (i != 2 && i != 3 && i != 4 && i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            localDateDefaultInvestmentStartDate$default = newStartDate == null ? this.startDate : newStartDate;
            if (localDateDefaultInvestmentStartDate$default == null) {
                throw new IllegalStateException("can not complete recurring order configuration without start date");
            }
        }
        LocalDate localDate = localDateDefaultInvestmentStartDate$default;
        if (assetCategory instanceof RecurringInvestmentCategory.BrokerageCash) {
            completeOrderConfigurationBrokerageCash(amountType, wasAmountTypePreselected, achRelationshipId, directDepositRelationshipId, sourceOfFunds, backupAchRelationshipId, frequency, localDate, ((RecurringInvestmentCategory.BrokerageCash) assetCategory).getAccountNumber());
            return;
        }
        if ((assetCategory instanceof RecurringInvestmentCategory.RothIra) || (assetCategory instanceof RecurringInvestmentCategory.TraditionalIra)) {
            RecurringInvestmentCategory recurringInvestmentCategory = (RecurringInvestmentCategory) assetCategory;
            if (recurringInvestmentCategory instanceof RecurringInvestmentCategory.RothIra) {
                brokerageAccountType = rosetta.account.BrokerageAccountType.IRA_ROTH;
            } else {
                if (!(recurringInvestmentCategory instanceof RecurringInvestmentCategory.TraditionalIra)) {
                    throw new IllegalStateException("Cannot be any other type");
                }
                brokerageAccountType = rosetta.account.BrokerageAccountType.IRA_TRADITIONAL;
            }
            rosetta.account.BrokerageAccountType brokerageAccountType2 = brokerageAccountType;
            Intrinsics.checkNotNull(assetCategory, "null cannot be cast to non-null type com.robinhood.recurring.models.RecurringInvestmentCategory");
            completeOrderConfigurationRetirement(amountType, wasAmountTypePreselected, achRelationshipId, directDepositRelationshipId, sourceOfFunds, backupAchRelationshipId, frequency, localDate, recurringInvestmentCategory.getAccountNumber(), brokerageAccountType2);
            return;
        }
        InvestmentTarget investmentTarget2 = investmentTarget;
        UUID instrumentId = investmentTarget2.getInstrumentId();
        if (instrumentId == null) {
            throw new IllegalStateException("Can't complete order configuration without a investment target id");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$2[investmentTarget2.getTargetType().ordinal()];
        if (i2 == 1) {
            String accountNumber = getAccountNumber();
            Intrinsics.checkNotNull(accountNumber);
            completeOrderConfigurationBrokerageCash(amountType, wasAmountTypePreselected, achRelationshipId, directDepositRelationshipId, sourceOfFunds, backupAchRelationshipId, frequency, localDate, accountNumber);
        } else if (i2 == 2) {
            String accountNumber2 = getAccountNumber();
            Intrinsics.checkNotNull(accountNumber2);
            completeOrderConfigurationEquity(instrumentId, amount, amountType, wasAmountTypePreselected, achRelationshipId, directDepositRelationshipId, sourceOfFunds, backupAchRelationshipId, frequency, localDate, reviewOnly, accountNumber2);
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    throw new IllegalStateException("This flow doesn't support tokenized stocks");
                }
                throw new NoWhenBranchMatchedException();
            }
            String accountNumber3 = getAccountNumber();
            Intrinsics.checkNotNull(accountNumber3);
            completeOrderConfigurationCrypto(instrumentId, amount, amountType, wasAmountTypePreselected, achRelationshipId, directDepositRelationshipId, sourceOfFunds, backupAchRelationshipId, frequency, localDate, reviewOnly, accountNumber3);
        }
    }

    static /* synthetic */ void completeOrderConfigurationEquity$default(RecurringCreationFlowParentFragment recurringCreationFlowParentFragment, UUID uuid, Money money, AmountType amountType, boolean z, UUID uuid2, UUID uuid3, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, UUID uuid4, ApiInvestmentSchedule.Frequency frequency, LocalDate localDate, boolean z2, String str, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 128) != 0) {
            uuid4 = null;
        }
        if ((i & 1024) != 0) {
            z2 = false;
        }
        recurringCreationFlowParentFragment.completeOrderConfigurationEquity(uuid, money, amountType, z, uuid2, uuid3, sourceOfFunds, uuid4, frequency, localDate, z2, str);
    }

    private final void completeOrderConfigurationEquity(UUID equityInvestmentId, Money amount, AmountType amountType, boolean wasAmountTypePreselected, UUID achRelationshipId, UUID directDepositRelationshipId, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, UUID backupAchRelationshipId, ApiInvestmentSchedule.Frequency frequency, LocalDate startDate, boolean reviewOnly, String accountNumber) {
        RecurringOrderConfiguration recurringOrderConfiguration = new RecurringOrderConfiguration(amount, amountType, wasAmountTypePreselected, frequency, startDate, sourceOfFunds, achRelationshipId, backupAchRelationshipId, directDepositRelationshipId, !isGenericCreationFlow(), reviewOnly, getPaycheckRecurringBrokerageCashStatus(), false, rosetta.account.BrokerageAccountType.INDIVIDUAL, accountNumber, 4096, null);
        if (((RecurringGenericCreationFragmentKey) INSTANCE.getArgs((Fragment) this)).getUseFragmentResult()) {
            getParentFragmentManager().setFragmentResult(ReturnedData.EXTRA_RETURNED_DATA, Bundle2.bundleOf(Tuples4.m3642to(ReturnedData.EXTRA_RETURNED_DATA, recurringOrderConfiguration)));
            return;
        }
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        startActivityForResult(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, new EquityOrderActivityIntentKey.WithId(equityInvestmentId, EquityOrderSide.BUY, EquityOrderFlowSource.RECURRING_FLOW_COMPLETION, null, null, null, new EquityOrderConfiguration.Recurring(recurringOrderConfiguration), false, false, 440, null), null, false, 12, null).addFlags(65536), 24);
    }

    static /* synthetic */ void completeOrderConfigurationCrypto$default(RecurringCreationFlowParentFragment recurringCreationFlowParentFragment, UUID uuid, Money money, AmountType amountType, boolean z, UUID uuid2, UUID uuid3, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, UUID uuid4, ApiInvestmentSchedule.Frequency frequency, LocalDate localDate, boolean z2, String str, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 128) != 0) {
            uuid4 = null;
        }
        if ((i & 1024) != 0) {
            z2 = false;
        }
        recurringCreationFlowParentFragment.completeOrderConfigurationCrypto(uuid, money, amountType, z, uuid2, uuid3, sourceOfFunds, uuid4, frequency, localDate, z2, str);
    }

    private final void completeOrderConfigurationCrypto(UUID currencyPairId, Money amount, AmountType amountType, boolean wasAmountTypePreselected, UUID achRelationshipId, UUID directDepositRelationshipId, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, UUID backupAchRelationshipId, ApiInvestmentSchedule.Frequency frequency, LocalDate startDate, boolean reviewOnly, String accountNumber) {
        RecurringOrderConfiguration recurringOrderConfiguration = new RecurringOrderConfiguration(amount, amountType, wasAmountTypePreselected, frequency, startDate, sourceOfFunds, achRelationshipId, backupAchRelationshipId, directDepositRelationshipId, false, reviewOnly, getPaycheckRecurringBrokerageCashStatus(), false, rosetta.account.BrokerageAccountType.INDIVIDUAL, accountNumber, 4608, null);
        if (((RecurringGenericCreationFragmentKey) INSTANCE.getArgs((Fragment) this)).getUseFragmentResult()) {
            getParentFragmentManager().setFragmentResult(ReturnedData.EXTRA_RETURNED_DATA, Bundle2.bundleOf(Tuples4.m3642to(ReturnedData.EXTRA_RETURNED_DATA, recurringOrderConfiguration)));
            return;
        }
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        startActivityForResult(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, new CryptoOrderIntentKey(currencyPairId, TradeAction.BUY, null, new CryptoOrderIntentKey.RecurringAction.ShowOrderConfiguration(recurringOrderConfiguration), null, 20, null), null, false, 12, null).addFlags(65536), 24);
    }

    static /* synthetic */ void completeOrderConfigurationBrokerageCash$default(RecurringCreationFlowParentFragment recurringCreationFlowParentFragment, AmountType amountType, boolean z, UUID uuid, UUID uuid2, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, UUID uuid3, ApiInvestmentSchedule.Frequency frequency, LocalDate localDate, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        recurringCreationFlowParentFragment.completeOrderConfigurationBrokerageCash(amountType, z, uuid, uuid2, sourceOfFunds, (i & 32) != 0 ? null : uuid3, frequency, localDate, str);
    }

    private final void completeOrderConfigurationBrokerageCash(AmountType amountType, boolean wasAmountTypePreselected, UUID achRelationshipId, UUID directDepositRelationshipId, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, UUID backupAchRelationshipId, ApiInvestmentSchedule.Frequency frequency, LocalDate startDate, String accountNumber) {
        RecurringOrderConfiguration recurringOrderConfiguration = new RecurringOrderConfiguration(null, amountType, wasAmountTypePreselected, frequency, startDate, sourceOfFunds, achRelationshipId, backupAchRelationshipId, directDepositRelationshipId, false, false, getPaycheckRecurringBrokerageCashStatus(), true, rosetta.account.BrokerageAccountType.INDIVIDUAL, accountNumber, 512, null);
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        startActivityForResult(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, new LegacyIntentKey.RecurringBrokerageCashTransfer(recurringOrderConfiguration), null, false, 12, null).addFlags(65536), 24);
    }

    static /* synthetic */ void completeOrderConfigurationRetirement$default(RecurringCreationFlowParentFragment recurringCreationFlowParentFragment, AmountType amountType, boolean z, UUID uuid, UUID uuid2, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, UUID uuid3, ApiInvestmentSchedule.Frequency frequency, LocalDate localDate, String str, rosetta.account.BrokerageAccountType brokerageAccountType, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        recurringCreationFlowParentFragment.completeOrderConfigurationRetirement(amountType, z, uuid, uuid2, sourceOfFunds, (i & 32) != 0 ? null : uuid3, frequency, localDate, str, brokerageAccountType);
    }

    private final void completeOrderConfigurationRetirement(AmountType amountType, boolean wasAmountTypePreselected, UUID achRelationshipId, UUID directDepositRelationshipId, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, UUID backupAchRelationshipId, ApiInvestmentSchedule.Frequency frequency, LocalDate startDate, String accountNumber, rosetta.account.BrokerageAccountType accountType) {
        RecurringOrderConfiguration recurringOrderConfiguration = new RecurringOrderConfiguration(null, amountType, wasAmountTypePreselected, frequency, startDate, sourceOfFunds, achRelationshipId, backupAchRelationshipId, directDepositRelationshipId, false, false, getPaycheckRecurringBrokerageCashStatus(), true, accountType, accountNumber, 512, null);
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        startActivityForResult(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, new LegacyIntentKey.RecurringBrokerageCashTransfer(recurringOrderConfiguration), null, false, 12, null).addFlags(65536), 24);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 24 && resultCode == -1) {
            requireActivity().finish();
        }
    }

    private final boolean shouldShowBackupPaymentMethod(ApiInvestmentSchedule.SourceOfFunds sourceOfFunds) {
        return sourceOfFunds == ApiInvestmentSchedule.SourceOfFunds.BUYING_POWER;
    }

    private final boolean isInstrumentSelected() {
        InvestmentTarget investmentTarget = this.investmentTarget;
        if (investmentTarget == null) {
            Intrinsics.throwUninitializedPropertyAccessException("investmentTarget");
            investmentTarget = null;
        }
        return investmentTarget.getInstrumentId() != null;
    }

    private final boolean instrumentSelectionRequired() {
        if (this.brokerageCashOptionEnabled && (getAssetCategory() instanceof RecurringInvestmentCategory.BrokerageCash)) {
            return false;
        }
        if (this.retirementCashOptionEnabled) {
            return ((getAssetCategory() instanceof RecurringInvestmentCategory.RothIra) || (getAssetCategory() instanceof RecurringInvestmentCategory.TraditionalIra)) ? false : true;
        }
        return true;
    }

    private final boolean canChooseAssetCategory() {
        return (this.brokerageCashOptionEnabled || this.retirementCashOptionEnabled) && getAssetCategory() == null;
    }

    private final boolean isGenericCreationFlow() {
        return ((RecurringGenericCreationFragmentKey) INSTANCE.getArgs((Fragment) this)).getInvestmentTarget().getInstrumentId() == null;
    }

    private final UiPaycheckInvestmentSchedule match(InvestmentTarget investmentTarget, List<UiPaycheckInvestmentSchedule> list, RecurringInvestmentCategory recurringInvestmentCategory) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            UiPaycheckInvestmentSchedule uiPaycheckInvestmentSchedule = (UiPaycheckInvestmentSchedule) next;
            if (Intrinsics.areEqual(uiPaycheckInvestmentSchedule.getAccountNumber(), recurringInvestmentCategory != null ? recurringInvestmentCategory.getAccountNumber() : null) && uiPaycheckInvestmentSchedule.getInvestmentTarget().getTargetType() == investmentTarget.getTargetType()) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            UiPaycheckInvestmentSchedule uiPaycheckInvestmentSchedule2 = (UiPaycheckInvestmentSchedule) next2;
            int i = WhenMappings.$EnumSwitchMapping$2[investmentTarget.getTargetType().ordinal()];
            boolean zAreEqual = true;
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("This flow doesn't support tokenized stocks");
                }
                zAreEqual = Intrinsics.areEqual(uiPaycheckInvestmentSchedule2.getInvestmentTarget().getInstrumentId(), investmentTarget.getInstrumentId());
            }
            if (zAreEqual) {
                obj = next2;
                break;
            }
        }
        return (UiPaycheckInvestmentSchedule) obj;
    }

    /* compiled from: RecurringCreationFlowParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/RecurringCreationFlowParentFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/common/recurring/RecurringCreationFlowParentFragment;", "Lcom/robinhood/android/recurring/contracts/RecurringGenericCreationFragmentKey;", "<init>", "()V", "REQUEST_CODE_EQUITY_ORDER", "", "EDIT_EXISTING_SCHEDULE_UUID_KEY", "", "EDIT_EXISTING_SCHEDULE_DIALOG_TAG", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<RecurringCreationFlowParentFragment, RecurringGenericCreationFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(RecurringGenericCreationFragmentKey recurringGenericCreationFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, recurringGenericCreationFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public RecurringGenericCreationFragmentKey getArgs(RecurringCreationFlowParentFragment recurringCreationFlowParentFragment) {
            return (RecurringGenericCreationFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, recurringCreationFlowParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RecurringCreationFlowParentFragment newInstance(RecurringGenericCreationFragmentKey recurringGenericCreationFragmentKey) {
            return (RecurringCreationFlowParentFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, recurringGenericCreationFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RecurringCreationFlowParentFragment recurringCreationFlowParentFragment, RecurringGenericCreationFragmentKey recurringGenericCreationFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, recurringCreationFlowParentFragment, recurringGenericCreationFragmentKey);
        }
    }
}
