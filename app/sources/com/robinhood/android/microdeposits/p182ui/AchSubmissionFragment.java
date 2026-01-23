package com.robinhood.android.microdeposits.p182ui;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.p088ui.NoTitleToolbarFragment;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.microdeposits.C21805R;
import com.robinhood.android.microdeposits.p182ui.AchSubmissionFragment;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.ApiAchRelationship;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.store.achrelationship.MicrodepositsStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: AchSubmissionFragment.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 (2\u00020\u0001:\u0002'(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0012\u0010\"\u001a\u00020\u001f2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001c\u0010\u0019R\u0016\u0010%\u001a\u0004\u0018\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0019¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/microdeposits/ui/AchSubmissionFragment;", "Lcom/robinhood/android/common/ui/NoTitleToolbarFragment;", "<init>", "()V", "microdepositsStore", "Lcom/robinhood/store/achrelationship/MicrodepositsStore;", "getMicrodepositsStore", "()Lcom/robinhood/store/achrelationship/MicrodepositsStore;", "setMicrodepositsStore", "(Lcom/robinhood/store/achrelationship/MicrodepositsStore;)V", "callbacks", "Lcom/robinhood/android/microdeposits/ui/AchSubmissionFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/microdeposits/ui/AchSubmissionFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bankAccountType", "Lcom/robinhood/models/api/ApiAchRelationship$BankAccountType;", "getBankAccountType", "()Lcom/robinhood/models/api/ApiAchRelationship$BankAccountType;", "bankAccountType$delegate", "Lkotlin/Lazy;", "routingNumber", "", "getRoutingNumber", "()Ljava/lang/String;", "routingNumber$delegate", "accountNumber", "getAccountNumber", "accountNumber$delegate", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "screenDescription", "getScreenDescription", "Callbacks", "Companion", "feature-microdeposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class AchSubmissionFragment extends NoTitleToolbarFragment {
    private static final String EXTRA_ACCOUNT_NUMBER = "extraAccountNumber";
    private static final String EXTRA_BANK_ACCOUNT_TYPE = "extraBankAccountType";
    private static final String EXTRA_ROUTING_NUMBER = "extraRoutingNumber";

    /* renamed from: accountNumber$delegate, reason: from kotlin metadata */
    private final Lazy accountNumber;

    /* renamed from: bankAccountType$delegate, reason: from kotlin metadata */
    private final Lazy bankAccountType;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public MicrodepositsStore microdepositsStore;

    /* renamed from: routingNumber$delegate, reason: from kotlin metadata */
    private final Lazy routingNumber;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AchSubmissionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/microdeposits/ui/AchSubmissionFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AchSubmissionFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/microdeposits/ui/AchSubmissionFragment$Callbacks;", "", "onAccountLinked", "", "isQueued", "", "onAccountLinkError", "t", "", "onDocumentsRequestedForAccount", "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", "feature-microdeposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAccountLinkError(Throwable t);

        void onAccountLinked(boolean isQueued);

        void onDocumentsRequestedForAccount(AchRelationship achRelationship);
    }

    @JvmStatic
    public static final AchSubmissionFragment newInstance(ApiAchRelationship.BankAccountType bankAccountType, String str, String str2) {
        return INSTANCE.newInstance(bankAccountType, str, str2);
    }

    public AchSubmissionFragment() {
        super(C21805R.layout.fragment_ach_review);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.microdeposits.ui.AchSubmissionFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof AchSubmissionFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.bankAccountType = Fragments2.argument(this, EXTRA_BANK_ACCOUNT_TYPE);
        this.routingNumber = Fragments2.argument(this, EXTRA_ROUTING_NUMBER);
        this.accountNumber = Fragments2.argument(this, EXTRA_ACCOUNT_NUMBER);
    }

    public final MicrodepositsStore getMicrodepositsStore() {
        MicrodepositsStore microdepositsStore = this.microdepositsStore;
        if (microdepositsStore != null) {
            return microdepositsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("microdepositsStore");
        return null;
    }

    public final void setMicrodepositsStore(MicrodepositsStore microdepositsStore) {
        Intrinsics.checkNotNullParameter(microdepositsStore, "<set-?>");
        this.microdepositsStore = microdepositsStore;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final ApiAchRelationship.BankAccountType getBankAccountType() {
        return (ApiAchRelationship.BankAccountType) this.bankAccountType.getValue();
    }

    private final String getRoutingNumber() {
        return (String) this.routingNumber.getValue();
    }

    private final String getAccountNumber() {
        return (String) this.accountNumber.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(getMicrodepositsStore().createAchRelationship(getBankAccountType(), getAccountNumber(), getRoutingNumber())), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.microdeposits.ui.AchSubmissionFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchSubmissionFragment.onCreate$lambda$1(this.f$0, (Optional) obj);
            }
        }, new C218152(getCallbacks()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(AchSubmissionFragment achSubmissionFragment, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        AchRelationship achRelationship = (AchRelationship) optional.component1();
        if (achRelationship == null) {
            achSubmissionFragment.getCallbacks().onAccountLinked(true);
        } else if (achRelationship.getState() == ApiAchRelationship.State.NEEDS_APPROVAL) {
            achSubmissionFragment.getCallbacks().onDocumentsRequestedForAccount(achRelationship);
        } else {
            achSubmissionFragment.getCallbacks().onAccountLinked(false);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: AchSubmissionFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.microdeposits.ui.AchSubmissionFragment$onCreate$2 */
    /* synthetic */ class C218152 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        C218152(Object obj) {
            super(1, obj, Callbacks.class, "onAccountLinkError", "onAccountLinkError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((Callbacks) this.receiver).onAccountLinkError(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.robinhood.android.microdeposits.ui.CreateAchRelationshipActivity");
        return ((CreateAchRelationshipActivity) fragmentActivityRequireActivity).getIavSource$feature_microdeposits_externalDebug().getAnalyticsTag();
    }

    /* compiled from: AchSubmissionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/microdeposits/ui/AchSubmissionFragment$Companion;", "", "<init>", "()V", "EXTRA_BANK_ACCOUNT_TYPE", "", "EXTRA_ROUTING_NUMBER", "EXTRA_ACCOUNT_NUMBER", "newInstance", "Lcom/robinhood/android/microdeposits/ui/AchSubmissionFragment;", "bankAccountType", "Lcom/robinhood/models/api/ApiAchRelationship$BankAccountType;", "routingNumber", "accountNumber", "feature-microdeposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AchSubmissionFragment newInstance(ApiAchRelationship.BankAccountType bankAccountType, String routingNumber, String accountNumber) {
            Intrinsics.checkNotNullParameter(bankAccountType, "bankAccountType");
            Intrinsics.checkNotNullParameter(routingNumber, "routingNumber");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            AchSubmissionFragment achSubmissionFragment = new AchSubmissionFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable(AchSubmissionFragment.EXTRA_BANK_ACCOUNT_TYPE, bankAccountType);
            bundle.putString(AchSubmissionFragment.EXTRA_ROUTING_NUMBER, routingNumber);
            bundle.putString(AchSubmissionFragment.EXTRA_ACCOUNT_NUMBER, accountNumber);
            achSubmissionFragment.setArguments(bundle);
            return achSubmissionFragment;
        }
    }
}
