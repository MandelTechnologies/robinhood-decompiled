package com.robinhood.android.matcha.p177ui.deeplink;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.C11839R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.matcha.models.p176ui.Transactor;
import com.robinhood.android.matcha.models.p176ui.UiMatchaUser2;
import com.robinhood.android.models.matcha.api.MatchaTransactionType;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.social.contracts.matcha.MatchaTransaction;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.bonfire.ApiSocialProfileInfo;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MatchaTransferDeeplinkActivity.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\fH\u0014J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/deeplink/MatchaTransferDeeplinkActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "<init>", "()V", "duxo", "Lcom/robinhood/android/matcha/ui/deeplink/MatchaTransferDeeplinkDuxo;", "getDuxo", "()Lcom/robinhood/android/matcha/ui/deeplink/MatchaTransferDeeplinkDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onDialogDismissed", "id", "", "bindState", "state", "Lcom/robinhood/android/matcha/ui/deeplink/MatchaTransferDeeplinkState;", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MatchaTransferDeeplinkActivity extends BaseActivity implements RhDialogFragment.OnDismissListener {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: MatchaTransferDeeplinkActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MatchaTransactionType.values().length];
            try {
                iArr[MatchaTransactionType.MATCHA_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MatchaTransactionType.MATCHA_TRANSFER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MatchaTransferDeeplinkActivity() {
        super(C11839R.layout.activity_rds_loading);
        this.duxo = OldDuxos.oldDuxo(this, MatchaTransferDeeplinkDuxo.class);
    }

    private final MatchaTransferDeeplinkDuxo getDuxo() {
        return (MatchaTransferDeeplinkDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), AchromaticOverlay.INSTANCE, null, 2, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C213141(this));
    }

    /* compiled from: MatchaTransferDeeplinkActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.deeplink.MatchaTransferDeeplinkActivity$onStart$1 */
    /* synthetic */ class C213141 extends FunctionReferenceImpl implements Function1<MatchaTransferDeeplinkState, Unit> {
        C213141(Object obj) {
            super(1, obj, MatchaTransferDeeplinkActivity.class, "bindState", "bindState(Lcom/robinhood/android/matcha/ui/deeplink/MatchaTransferDeeplinkState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MatchaTransferDeeplinkState matchaTransferDeeplinkState) {
            invoke2(matchaTransferDeeplinkState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(MatchaTransferDeeplinkState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((MatchaTransferDeeplinkActivity) this.receiver).bindState(p0);
        }
    }

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindState(MatchaTransferDeeplinkState state) {
        UiEvent<Result<ApiSocialProfileInfo>> profileResult = state.getProfileResult();
        if (profileResult != null) {
            profileResult.consumeWith(new Function1() { // from class: com.robinhood.android.matcha.ui.deeplink.MatchaTransferDeeplinkActivity$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MatchaTransferDeeplinkActivity.bindState$lambda$2(this.f$0, (Result) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindState$lambda$2(MatchaTransferDeeplinkActivity matchaTransferDeeplinkActivity, Result result) throws Throwable {
        MatchaTransaction.Direction direction;
        MatchaTransaction.EntryPoint entryPoint;
        Object value = result.getValue();
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(value);
        if (thM28553exceptionOrNullimpl == null) {
            Navigator navigator = matchaTransferDeeplinkActivity.getNavigator();
            Companion companion = INSTANCE;
            Transactor.User user = new Transactor.User(UiMatchaUser2.toUiMatchaUser((ApiSocialProfileInfo) value, ((LegacyIntentKey.MatchaTransferFromDeepLink) companion.getExtras((Activity) matchaTransferDeeplinkActivity)).getUserId()), false, 2, null);
            int i = WhenMappings.$EnumSwitchMapping$0[((LegacyIntentKey.MatchaTransferFromDeepLink) companion.getExtras((Activity) matchaTransferDeeplinkActivity)).getType().ordinal()];
            if (i == 1) {
                direction = MatchaTransaction.Direction.REQUEST;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                direction = MatchaTransaction.Direction.SEND;
            }
            BigDecimal amount = ((LegacyIntentKey.MatchaTransferFromDeepLink) companion.getExtras((Activity) matchaTransferDeeplinkActivity)).getAmount();
            Money money = amount != null ? Money3.toMoney(amount, Currencies.USD) : null;
            if (((LegacyIntentKey.MatchaTransferFromDeepLink) companion.getExtras((Activity) matchaTransferDeeplinkActivity)).getAmount() != null) {
                entryPoint = MatchaTransaction.EntryPoint.QR_CODE;
            } else {
                entryPoint = MatchaTransaction.EntryPoint.PROFILE;
            }
            Navigator.DefaultImpls.startActivity$default(navigator, matchaTransferDeeplinkActivity, new MatchaTransaction.Review(money, user, direction, entryPoint), null, false, null, null, 60, null);
            matchaTransferDeeplinkActivity.finish();
        } else {
            ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, matchaTransferDeeplinkActivity, thM28553exceptionOrNullimpl, true, false, 0, null, 56, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: MatchaTransferDeeplinkActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/deeplink/MatchaTransferDeeplinkActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/matcha/ui/deeplink/MatchaTransferDeeplinkActivity;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$MatchaTransferFromDeepLink;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<MatchaTransferDeeplinkActivity, LegacyIntentKey.MatchaTransferFromDeepLink> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public LegacyIntentKey.MatchaTransferFromDeepLink getExtras(MatchaTransferDeeplinkActivity matchaTransferDeeplinkActivity) {
            return (LegacyIntentKey.MatchaTransferFromDeepLink) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, matchaTransferDeeplinkActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.MatchaTransferFromDeepLink matchaTransferFromDeepLink) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, matchaTransferFromDeepLink);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, LegacyIntentKey.MatchaTransferFromDeepLink matchaTransferFromDeepLink) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, matchaTransferFromDeepLink);
        }
    }
}
