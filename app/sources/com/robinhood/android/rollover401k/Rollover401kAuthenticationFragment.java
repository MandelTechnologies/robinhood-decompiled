package com.robinhood.android.rollover401k;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.mcduckling.p084ui.detail.card.SecondaryAuthenticationFragment;
import com.robinhood.android.common.p088ui.BaseDialogFragment;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.models.retirement.p194db.Retirement401kRolloverViewModel;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rollover401k.Rollover401kAuthenticationFragment;
import com.robinhood.librobinhood.data.store.bonfire.retirement.Retirement401kRolloverStore;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Rollover401kAuthenticationFragment.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \"2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003 !\"B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\t\u0010\u0019\u001a\u00020\u001aH\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/Rollover401kAuthenticationFragment;", "Lcom/robinhood/android/common/ui/BaseDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/mcduckling/ui/detail/card/SecondaryAuthenticationFragment$Callbacks;", "<init>", "()V", "retirement401kRolloverStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/Retirement401kRolloverStore;", "getRetirement401kRolloverStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/retirement/Retirement401kRolloverStore;", "setRetirement401kRolloverStore", "(Lcom/robinhood/librobinhood/data/store/bonfire/retirement/Retirement401kRolloverStore;)V", "callbacks", "Lcom/robinhood/android/rollover401k/Rollover401kAuthenticationFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/rollover401k/Rollover401kAuthenticationFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onSecondaryAuthenticationSuccess", "requestCode", "", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class Rollover401kAuthenticationFragment extends BaseDialogFragment implements RegionGated, SecondaryAuthenticationFragment.Callbacks {
    private static final int REQUEST_AUTH_CODE = 15;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(RetirementRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.rollover401k.Rollover401kAuthenticationFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof Rollover401kAuthenticationFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    public Retirement401kRolloverStore retirement401kRolloverStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Rollover401kAuthenticationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/rollover401k/Rollover401kAuthenticationFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: Rollover401kAuthenticationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/Rollover401kAuthenticationFragment$Callbacks;", "", "onSecondaryAuthenticationSuccess", "", "isForCapitalize", "", "pendingAccount", "Lcom/robinhood/android/models/retirement/db/Retirement401kRolloverViewModel$AccountNumberRow;", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onSecondaryAuthenticationSuccess(boolean isForCapitalize, Retirement401kRolloverViewModel.AccountNumberRow pendingAccount);
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public final Retirement401kRolloverStore getRetirement401kRolloverStore() {
        Retirement401kRolloverStore retirement401kRolloverStore = this.retirement401kRolloverStore;
        if (retirement401kRolloverStore != null) {
            return retirement401kRolloverStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retirement401kRolloverStore");
        return null;
    }

    public final void setRetirement401kRolloverStore(Retirement401kRolloverStore retirement401kRolloverStore) {
        Intrinsics.checkNotNullParameter(retirement401kRolloverStore, "<set-?>");
        this.retirement401kRolloverStore = retirement401kRolloverStore;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        try {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C277141(null), 3, null);
        } catch (Exception e) {
            ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, e, false, false, 0, null, 60, null);
            dismiss();
        }
    }

    /* compiled from: Rollover401kAuthenticationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rollover401k.Rollover401kAuthenticationFragment$onCreate$1", m3645f = "Rollover401kAuthenticationFragment.kt", m3646l = {47}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rollover401k.Rollover401kAuthenticationFragment$onCreate$1 */
    static final class C277141 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C277141(Continuation<? super C277141> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Rollover401kAuthenticationFragment.this.new C277141(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C277141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            String title;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(Retirement401kRolloverStore.retirement401kRolloverQuery$default(Rollover401kAuthenticationFragment.this.getRetirement401kRolloverStore(), false, 1, null));
                this.label = 1;
                obj = FlowKt.first(flowFilterNotNull, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Retirement401kRolloverViewModel.RolloverViewModels rolloverViewModels = ((Retirement401kRolloverViewModel) obj).getRolloverViewModels();
            SecondaryAuthenticationFragment.Companion companion = SecondaryAuthenticationFragment.INSTANCE;
            Rollover401kAuthenticationFragment rollover401kAuthenticationFragment = Rollover401kAuthenticationFragment.this;
            if (((Args) Rollover401kAuthenticationFragment.INSTANCE.getArgs((Fragment) rollover401kAuthenticationFragment)).isForCapitalize()) {
                title = rolloverViewModels.getAccountNumbersCapitalizeViewModel().getTitle();
            } else {
                title = rolloverViewModels.getAccountNumbersDiyViewModel().getTitle();
            }
            SecondaryAuthenticationFragment secondaryAuthenticationFragmentNewInstance = companion.newInstance(rollover401kAuthenticationFragment, title, 15);
            FragmentManager supportFragmentManager = Rollover401kAuthenticationFragment.this.requireActivity().getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            secondaryAuthenticationFragmentNewInstance.show(supportFragmentManager, "accountNumbersAuth");
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.mcduckling.ui.detail.card.SecondaryAuthenticationFragment.Callbacks
    public void onSecondaryAuthenticationSuccess(int requestCode) {
        if (requestCode == 15) {
            Callbacks callbacks = getCallbacks();
            Companion companion = INSTANCE;
            callbacks.onSecondaryAuthenticationSuccess(((Args) companion.getArgs((Fragment) this)).isForCapitalize(), ((Args) companion.getArgs((Fragment) this)).getPendingAccount());
            dismiss();
        }
    }

    /* compiled from: Rollover401kAuthenticationFragment.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/Rollover401kAuthenticationFragment$Args;", "Landroid/os/Parcelable;", "isForCapitalize", "", "pendingAccount", "Lcom/robinhood/android/models/retirement/db/Retirement401kRolloverViewModel$AccountNumberRow;", "<init>", "(ZLcom/robinhood/android/models/retirement/db/Retirement401kRolloverViewModel$AccountNumberRow;)V", "()Z", "getPendingAccount", "()Lcom/robinhood/android/models/retirement/db/Retirement401kRolloverViewModel$AccountNumberRow;", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean isForCapitalize;
        private final Retirement401kRolloverViewModel.AccountNumberRow pendingAccount;

        /* compiled from: Rollover401kAuthenticationFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readInt() != 0, (Retirement401kRolloverViewModel.AccountNumberRow) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, boolean z, Retirement401kRolloverViewModel.AccountNumberRow accountNumberRow, int i, Object obj) {
            if ((i & 1) != 0) {
                z = args.isForCapitalize;
            }
            if ((i & 2) != 0) {
                accountNumberRow = args.pendingAccount;
            }
            return args.copy(z, accountNumberRow);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsForCapitalize() {
            return this.isForCapitalize;
        }

        /* renamed from: component2, reason: from getter */
        public final Retirement401kRolloverViewModel.AccountNumberRow getPendingAccount() {
            return this.pendingAccount;
        }

        public final Args copy(boolean isForCapitalize, Retirement401kRolloverViewModel.AccountNumberRow pendingAccount) {
            return new Args(isForCapitalize, pendingAccount);
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
            return this.isForCapitalize == args.isForCapitalize && Intrinsics.areEqual(this.pendingAccount, args.pendingAccount);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isForCapitalize) * 31;
            Retirement401kRolloverViewModel.AccountNumberRow accountNumberRow = this.pendingAccount;
            return iHashCode + (accountNumberRow == null ? 0 : accountNumberRow.hashCode());
        }

        public String toString() {
            return "Args(isForCapitalize=" + this.isForCapitalize + ", pendingAccount=" + this.pendingAccount + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isForCapitalize ? 1 : 0);
            dest.writeParcelable(this.pendingAccount, flags);
        }

        public Args(boolean z, Retirement401kRolloverViewModel.AccountNumberRow accountNumberRow) {
            this.isForCapitalize = z;
            this.pendingAccount = accountNumberRow;
        }

        public final boolean isForCapitalize() {
            return this.isForCapitalize;
        }

        public final Retirement401kRolloverViewModel.AccountNumberRow getPendingAccount() {
            return this.pendingAccount;
        }
    }

    /* compiled from: Rollover401kAuthenticationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/Rollover401kAuthenticationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/rollover401k/Rollover401kAuthenticationFragment;", "Lcom/robinhood/android/rollover401k/Rollover401kAuthenticationFragment$Args;", "<init>", "()V", "REQUEST_AUTH_CODE", "", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<Rollover401kAuthenticationFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(Rollover401kAuthenticationFragment rollover401kAuthenticationFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, rollover401kAuthenticationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public Rollover401kAuthenticationFragment newInstance(Args args) {
            return (Rollover401kAuthenticationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(Rollover401kAuthenticationFragment rollover401kAuthenticationFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, rollover401kAuthenticationFragment, args);
        }
    }
}
