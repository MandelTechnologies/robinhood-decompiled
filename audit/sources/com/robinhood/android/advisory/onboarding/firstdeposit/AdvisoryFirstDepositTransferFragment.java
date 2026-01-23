package com.robinhood.android.advisory.onboarding.firstdeposit;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.result.ActivityResultCaller;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferFragment;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.advisory.api.contribution.ApiAdvisoryFirstTimeContributionViewModel2;
import com.robinhood.models.advisory.api.contribution.TransferAccountInfo;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.util.Money;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import defpackage.AdvisoryFirstDepositTransferComposableKt;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: AdvisoryFirstDepositTransferFragment.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0003\u0013\u0014\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0010\u001a\u00020\u0011H\u0017¢\u0006\u0002\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "toolbarVisible", "getToolbarVisible", "callbacks", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "Args", "Companion", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AdvisoryFirstDepositTransferFragment extends GenericComposeFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferFragment$special$$inlined$parentFragmentThenActivityHostCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            ActivityResultCaller parentFragment = CallbacksProperty.getParentFragment();
            if (!(parentFragment instanceof AdvisoryFirstDepositTransferFragment.Callbacks)) {
                parentFragment = null;
            }
            AdvisoryFirstDepositTransferFragment.Callbacks callbacks = (AdvisoryFirstDepositTransferFragment.Callbacks) parentFragment;
            if (callbacks != null) {
                return callbacks;
            }
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof AdvisoryFirstDepositTransferFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AdvisoryFirstDepositTransferFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AdvisoryFirstDepositTransferFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferFragment$Callbacks;", "", "onFirstDepositConfigured", "", "applicationId", "Ljava/util/UUID;", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onFirstDepositConfigured(UUID applicationId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(AdvisoryFirstDepositTransferFragment advisoryFirstDepositTransferFragment, int i, Composer composer, int i2) {
        advisoryFirstDepositTransferFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return false;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1858291439);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1858291439, i2, -1, "com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferFragment.ComposeContent (AdvisoryFirstDepositTransferFragment.kt:34)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(1676784807, true, new C88401(), composerStartRestartGroup, 54), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdvisoryFirstDepositTransferFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: AdvisoryFirstDepositTransferFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferFragment$ComposeContent$1 */
    static final class C88401 implements Function2<Composer, Integer, Unit> {
        C88401() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1676784807, i, -1, "com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferFragment.ComposeContent.<anonymous> (AdvisoryFirstDepositTransferFragment.kt:38)");
            }
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(AdvisoryFirstDepositTransferFragment.this);
            final AdvisoryFirstDepositTransferFragment advisoryFirstDepositTransferFragment = AdvisoryFirstDepositTransferFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AdvisoryFirstDepositTransferFragment.C88401.invoke$lambda$1$lambda$0(advisoryFirstDepositTransferFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(AdvisoryFirstDepositTransferFragment.this);
            final AdvisoryFirstDepositTransferFragment advisoryFirstDepositTransferFragment2 = AdvisoryFirstDepositTransferFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AdvisoryFirstDepositTransferFragment.C88401.invoke$lambda$3$lambda$2(advisoryFirstDepositTransferFragment2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            AdvisoryFirstDepositTransferComposableKt.AdvisoryFirstDepositComposable(function0, (Function0) objRememberedValue2, null, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(AdvisoryFirstDepositTransferFragment advisoryFirstDepositTransferFragment) {
            advisoryFirstDepositTransferFragment.requireBaseActivity().onBackPressed();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(AdvisoryFirstDepositTransferFragment advisoryFirstDepositTransferFragment) {
            advisoryFirstDepositTransferFragment.getCallbacks().onFirstDepositConfigured(((Args) AdvisoryFirstDepositTransferFragment.INSTANCE.getArgs((Fragment) advisoryFirstDepositTransferFragment)).getApplicationId());
            return Unit.INSTANCE;
        }
    }

    /* compiled from: AdvisoryFirstDepositTransferFragment.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003JI\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0006\u0010#\u001a\u00020$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020$HÖ\u0001J\t\u0010*\u001a\u00020\u000bHÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferFragment$Args;", "Landroid/os/Parcelable;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "applicationId", "Ljava/util/UUID;", "minimumDeposit", "Lcom/robinhood/models/util/Money;", "viewModel", "Lcom/robinhood/models/advisory/api/contribution/ContributionViewModel$MoneyTransferViewModel;", "source", "", "sourceTransferAccountInfo", "Lcom/robinhood/models/advisory/api/contribution/TransferAccountInfo;", "<init>", "(Lcom/robinhood/models/api/BrokerageAccountType;Ljava/util/UUID;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/advisory/api/contribution/ContributionViewModel$MoneyTransferViewModel;Ljava/lang/String;Lcom/robinhood/models/advisory/api/contribution/TransferAccountInfo;)V", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getApplicationId", "()Ljava/util/UUID;", "getMinimumDeposit", "()Lcom/robinhood/models/util/Money;", "getViewModel", "()Lcom/robinhood/models/advisory/api/contribution/ContributionViewModel$MoneyTransferViewModel;", "getSource", "()Ljava/lang/String;", "getSourceTransferAccountInfo", "()Lcom/robinhood/models/advisory/api/contribution/TransferAccountInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID applicationId;
        private final BrokerageAccountType brokerageAccountType;
        private final Money minimumDeposit;
        private final String source;
        private final TransferAccountInfo sourceTransferAccountInfo;
        private final ApiAdvisoryFirstTimeContributionViewModel2.MoneyTransferViewModel viewModel;

        /* compiled from: AdvisoryFirstDepositTransferFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(BrokerageAccountType.valueOf(parcel.readString()), (UUID) parcel.readSerializable(), (Money) parcel.readParcelable(Args.class.getClassLoader()), (ApiAdvisoryFirstTimeContributionViewModel2.MoneyTransferViewModel) parcel.readParcelable(Args.class.getClassLoader()), parcel.readString(), (TransferAccountInfo) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, BrokerageAccountType brokerageAccountType, UUID uuid, Money money, ApiAdvisoryFirstTimeContributionViewModel2.MoneyTransferViewModel moneyTransferViewModel, String str, TransferAccountInfo transferAccountInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                brokerageAccountType = args.brokerageAccountType;
            }
            if ((i & 2) != 0) {
                uuid = args.applicationId;
            }
            if ((i & 4) != 0) {
                money = args.minimumDeposit;
            }
            if ((i & 8) != 0) {
                moneyTransferViewModel = args.viewModel;
            }
            if ((i & 16) != 0) {
                str = args.source;
            }
            if ((i & 32) != 0) {
                transferAccountInfo = args.sourceTransferAccountInfo;
            }
            String str2 = str;
            TransferAccountInfo transferAccountInfo2 = transferAccountInfo;
            return args.copy(brokerageAccountType, uuid, money, moneyTransferViewModel, str2, transferAccountInfo2);
        }

        /* renamed from: component1, reason: from getter */
        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getApplicationId() {
            return this.applicationId;
        }

        /* renamed from: component3, reason: from getter */
        public final Money getMinimumDeposit() {
            return this.minimumDeposit;
        }

        /* renamed from: component4, reason: from getter */
        public final ApiAdvisoryFirstTimeContributionViewModel2.MoneyTransferViewModel getViewModel() {
            return this.viewModel;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component6, reason: from getter */
        public final TransferAccountInfo getSourceTransferAccountInfo() {
            return this.sourceTransferAccountInfo;
        }

        public final Args copy(BrokerageAccountType brokerageAccountType, UUID applicationId, Money minimumDeposit, ApiAdvisoryFirstTimeContributionViewModel2.MoneyTransferViewModel viewModel, String source, TransferAccountInfo sourceTransferAccountInfo) {
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(minimumDeposit, "minimumDeposit");
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            return new Args(brokerageAccountType, applicationId, minimumDeposit, viewModel, source, sourceTransferAccountInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return this.brokerageAccountType == args.brokerageAccountType && Intrinsics.areEqual(this.applicationId, args.applicationId) && Intrinsics.areEqual(this.minimumDeposit, args.minimumDeposit) && Intrinsics.areEqual(this.viewModel, args.viewModel) && Intrinsics.areEqual(this.source, args.source) && Intrinsics.areEqual(this.sourceTransferAccountInfo, args.sourceTransferAccountInfo);
        }

        public int hashCode() {
            int iHashCode = ((((((this.brokerageAccountType.hashCode() * 31) + this.applicationId.hashCode()) * 31) + this.minimumDeposit.hashCode()) * 31) + this.viewModel.hashCode()) * 31;
            String str = this.source;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            TransferAccountInfo transferAccountInfo = this.sourceTransferAccountInfo;
            return iHashCode2 + (transferAccountInfo != null ? transferAccountInfo.hashCode() : 0);
        }

        public String toString() {
            return "Args(brokerageAccountType=" + this.brokerageAccountType + ", applicationId=" + this.applicationId + ", minimumDeposit=" + this.minimumDeposit + ", viewModel=" + this.viewModel + ", source=" + this.source + ", sourceTransferAccountInfo=" + this.sourceTransferAccountInfo + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.brokerageAccountType.name());
            dest.writeSerializable(this.applicationId);
            dest.writeParcelable(this.minimumDeposit, flags);
            dest.writeParcelable(this.viewModel, flags);
            dest.writeString(this.source);
            dest.writeParcelable(this.sourceTransferAccountInfo, flags);
        }

        public Args(BrokerageAccountType brokerageAccountType, UUID applicationId, Money minimumDeposit, ApiAdvisoryFirstTimeContributionViewModel2.MoneyTransferViewModel viewModel, String str, TransferAccountInfo transferAccountInfo) {
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(minimumDeposit, "minimumDeposit");
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            this.brokerageAccountType = brokerageAccountType;
            this.applicationId = applicationId;
            this.minimumDeposit = minimumDeposit;
            this.viewModel = viewModel;
            this.source = str;
            this.sourceTransferAccountInfo = transferAccountInfo;
        }

        public /* synthetic */ Args(BrokerageAccountType brokerageAccountType, UUID uuid, Money money, ApiAdvisoryFirstTimeContributionViewModel2.MoneyTransferViewModel moneyTransferViewModel, String str, TransferAccountInfo transferAccountInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(brokerageAccountType, uuid, money, moneyTransferViewModel, (i & 16) != 0 ? null : str, transferAccountInfo);
        }

        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        public final UUID getApplicationId() {
            return this.applicationId;
        }

        public final Money getMinimumDeposit() {
            return this.minimumDeposit;
        }

        public final ApiAdvisoryFirstTimeContributionViewModel2.MoneyTransferViewModel getViewModel() {
            return this.viewModel;
        }

        public final String getSource() {
            return this.source;
        }

        public final TransferAccountInfo getSourceTransferAccountInfo() {
            return this.sourceTransferAccountInfo;
        }
    }

    /* compiled from: AdvisoryFirstDepositTransferFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferFragment;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferFragment$Args;", "<init>", "()V", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<AdvisoryFirstDepositTransferFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(AdvisoryFirstDepositTransferFragment advisoryFirstDepositTransferFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, advisoryFirstDepositTransferFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AdvisoryFirstDepositTransferFragment newInstance(Args args) {
            return (AdvisoryFirstDepositTransferFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AdvisoryFirstDepositTransferFragment advisoryFirstDepositTransferFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, advisoryFirstDepositTransferFragment, args);
        }
    }
}
