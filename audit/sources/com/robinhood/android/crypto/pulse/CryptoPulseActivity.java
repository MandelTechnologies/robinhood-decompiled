package com.robinhood.android.crypto.pulse;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.cortex.contracts.AssetDigestFragmentKey;
import com.robinhood.android.cortex.models.asset.AssetDigest;
import com.robinhood.android.crypto.pulse.CryptoPulseActivity;
import com.robinhood.android.crypto.pulse.CryptoPulseEvent;
import com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedFragment;
import com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedFragmentArgs;
import com.robinhood.android.crypto.pulse.loading.CryptoPulseLoadingFragment;
import com.robinhood.android.crypto.pulse.primer.CryptoPulsePrimerFragment;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.shared.agreements.contracts.IdentiAgreementKey;
import com.robinhood.shared.agreements.contracts.IdentiAgreementType;
import com.robinhood.shared.crypto.contracts.pulse.CryptoPulseIntentKey;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoPulseActivity.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 !2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002 !B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0018\u001a\u00020\u0010H\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\t\u0010\u001a\u001a\u00020\u0014H\u0096\u0001R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/crypto/pulse/CryptoPulseActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/crypto/pulse/primer/CryptoPulsePrimerFragment$Callbacks;", "Lcom/robinhood/shared/agreements/contracts/IdentiAgreementKey$Callbacks;", "<init>", "()V", "duxo", "Lcom/robinhood/android/crypto/pulse/CryptoPulseDuxo;", "getDuxo", "()Lcom/robinhood/android/crypto/pulse/CryptoPulseDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "pendingDestinationAfterPrimer", "Lcom/robinhood/android/crypto/pulse/CryptoPulseActivity$PendingDestination;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onPositiveButtonClicked", "", "id", "", "passthroughArgs", "onCryptoPulsePrimerContinue", "onAgreementAccepted", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "PendingDestination", "Companion", "feature-crypto-pulse_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CryptoPulseActivity extends BaseActivity implements RegionGated, CryptoPulsePrimerFragment.Callbacks, IdentiAgreementKey.Callbacks {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private PendingDestination pendingDestinationAfterPrimer;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // com.robinhood.shared.agreements.contracts.IdentiAgreementKey.Callbacks
    public void onSubmissionStateChanged(boolean z) {
        IdentiAgreementKey.Callbacks.DefaultImpls.onSubmissionStateChanged(this, z);
    }

    public CryptoPulseActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(CryptoRegionGate.INSTANCE);
        this.duxo = DuxosKt.duxo(this, CryptoPulseDuxo.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CryptoPulseDuxo getDuxo() {
        return (CryptoPulseDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CryptoPulseActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/crypto/pulse/CryptoPulseActivity$PendingDestination;", "", "<init>", "()V", "Feed", "DigestFragment", "Lcom/robinhood/android/crypto/pulse/CryptoPulseActivity$PendingDestination$DigestFragment;", "Lcom/robinhood/android/crypto/pulse/CryptoPulseActivity$PendingDestination$Feed;", "feature-crypto-pulse_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static abstract class PendingDestination {
        public /* synthetic */ PendingDestination(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: CryptoPulseActivity.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/crypto/pulse/CryptoPulseActivity$PendingDestination$Feed;", "Lcom/robinhood/android/crypto/pulse/CryptoPulseActivity$PendingDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-pulse_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Feed extends PendingDestination {
            public static final int $stable = 0;
            public static final Feed INSTANCE = new Feed();

            public boolean equals(Object other) {
                return this == other || (other instanceof Feed);
            }

            public int hashCode() {
                return 1743114816;
            }

            public String toString() {
                return "Feed";
            }

            private Feed() {
                super(null);
            }
        }

        private PendingDestination() {
        }

        /* compiled from: CryptoPulseActivity.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/crypto/pulse/CryptoPulseActivity$PendingDestination$DigestFragment;", "Lcom/robinhood/android/crypto/pulse/CryptoPulseActivity$PendingDestination;", "fragmentKey", "Lcom/robinhood/android/cortex/contracts/AssetDigestFragmentKey;", "<init>", "(Lcom/robinhood/android/cortex/contracts/AssetDigestFragmentKey;)V", "getFragmentKey", "()Lcom/robinhood/android/cortex/contracts/AssetDigestFragmentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-pulse_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class DigestFragment extends PendingDestination {
            public static final int $stable = 8;
            private final AssetDigestFragmentKey fragmentKey;

            public static /* synthetic */ DigestFragment copy$default(DigestFragment digestFragment, AssetDigestFragmentKey assetDigestFragmentKey, int i, Object obj) {
                if ((i & 1) != 0) {
                    assetDigestFragmentKey = digestFragment.fragmentKey;
                }
                return digestFragment.copy(assetDigestFragmentKey);
            }

            /* renamed from: component1, reason: from getter */
            public final AssetDigestFragmentKey getFragmentKey() {
                return this.fragmentKey;
            }

            public final DigestFragment copy(AssetDigestFragmentKey fragmentKey) {
                Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
                return new DigestFragment(fragmentKey);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DigestFragment) && Intrinsics.areEqual(this.fragmentKey, ((DigestFragment) other).fragmentKey);
            }

            public int hashCode() {
                return this.fragmentKey.hashCode();
            }

            public String toString() {
                return "DigestFragment(fragmentKey=" + this.fragmentKey + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DigestFragment(AssetDigestFragmentKey fragmentKey) {
                super(null);
                Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
                this.fragmentKey = fragmentKey;
            }

            public final AssetDigestFragmentKey getFragmentKey() {
                return this.fragmentKey;
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CryptoPulseIntentKey.Destination destinationOverride = ((CryptoPulseIntentKey) INSTANCE.getExtras((Activity) this)).getDestinationOverride();
        if (Intrinsics.areEqual(destinationOverride, CryptoPulseIntentKey.Destination.Feed.INSTANCE)) {
            setFragment(C11048R.id.fragment_container, CryptoPulseLoadingFragment.INSTANCE.newInstance());
            getDuxo().fetchSignedAgreementStatusForFeed();
        } else if (destinationOverride instanceof CryptoPulseIntentKey.Destination.ShowDigestFragment) {
            CryptoPulseIntentKey.Destination.ShowDigestFragment showDigestFragment = (CryptoPulseIntentKey.Destination.ShowDigestFragment) destinationOverride;
            AssetDigest instrumentDigest = showDigestFragment.getFragmentKey().getInstrumentDigest();
            if (instrumentDigest instanceof AssetDigest.HasSignedAgreement) {
                setFragment(C11048R.id.fragment_container, Navigator.DefaultImpls.createFragment$default(getNavigator(), showDigestFragment.getFragmentKey(), null, 2, null));
            } else {
                if (!(instrumentDigest instanceof AssetDigest.NeedsAgreement)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.pendingDestinationAfterPrimer = new PendingDestination.DigestFragment(showDigestFragment.getFragmentKey());
                setFragment(C11048R.id.fragment_container, CryptoPulsePrimerFragment.INSTANCE.newInstance());
            }
        } else {
            if (destinationOverride != null) {
                throw new NoWhenBranchMatchedException();
            }
            setFragment(C11048R.id.fragment_container, CryptoPulseLoadingFragment.INSTANCE.newInstance());
        }
        BaseActivity.collectDuxoState$default(this, null, new C129171(null), 1, null);
    }

    /* compiled from: CryptoPulseActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.pulse.CryptoPulseActivity$onCreate$1", m3645f = "CryptoPulseActivity.kt", m3646l = {82}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.pulse.CryptoPulseActivity$onCreate$1 */
    static final class C129171 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C129171(Continuation<? super C129171> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C129171 c129171 = CryptoPulseActivity.this.new C129171(continuation);
            c129171.L$0 = obj;
            return c129171;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C129171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoPulseActivity.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/crypto/pulse/CryptoPulseEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.pulse.CryptoPulseActivity$onCreate$1$1", m3645f = "CryptoPulseActivity.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.crypto.pulse.CryptoPulseActivity$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Event<CryptoPulseEvent>, Continuation<? super Unit>, Object> {
            final /* synthetic */ CoroutineScope $$this$collectDuxoState;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoPulseActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoPulseActivity cryptoPulseActivity, CoroutineScope coroutineScope, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoPulseActivity;
                this.$$this$collectDuxoState = coroutineScope;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$$this$collectDuxoState, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Event<CryptoPulseEvent> event, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(event, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                EventConsumer eventConsumer;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final Event event = (Event) this.L$0;
                final CryptoPulseActivity cryptoPulseActivity = this.this$0;
                final CoroutineScope coroutineScope = this.$$this$collectDuxoState;
                if ((event.getData() instanceof CryptoPulseEvent) && (eventConsumer = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                    eventConsumer.consume(event, new Function1() { // from class: com.robinhood.android.crypto.pulse.CryptoPulseActivity$onCreate$1$1$invokeSuspend$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            m12954invoke(obj2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m12954invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            CryptoPulseEvent cryptoPulseEvent = (CryptoPulseEvent) event.getData();
                            if (cryptoPulseEvent instanceof CryptoPulseEvent.ShowFeed) {
                                CryptoPulseEvent.ShowFeed showFeed = (CryptoPulseEvent.ShowFeed) cryptoPulseEvent;
                                cryptoPulseActivity.setFragment(C11048R.id.fragment_container, CryptoPulseFeedFragment.Companion.newInstance((Parcelable) new CryptoPulseFeedFragmentArgs(showFeed.getFeedResponse(), showFeed.getRefreshResponse())));
                                return;
                            }
                            if (cryptoPulseEvent instanceof CryptoPulseEvent.ShowDigestFragment) {
                                CryptoPulseActivity cryptoPulseActivity2 = cryptoPulseActivity;
                                cryptoPulseActivity2.setFragment(C11048R.id.fragment_container, Navigator.DefaultImpls.createFragment$default(cryptoPulseActivity2.getNavigator(), ((CryptoPulseEvent.ShowDigestFragment) cryptoPulseEvent).getFragmentKey(), null, 2, null));
                                return;
                            }
                            if (Intrinsics.areEqual(cryptoPulseEvent, CryptoPulseEvent.ShowAgreementForFeed.INSTANCE)) {
                                CryptoPulseActivity cryptoPulseActivity3 = cryptoPulseActivity;
                                cryptoPulseActivity3.setFragment(C11048R.id.fragment_container, Navigator.DefaultImpls.createFragment$default(cryptoPulseActivity3.getNavigator(), new IdentiAgreementKey(IdentiAgreementType.ClientDriven.COPILOT_DIGEST, null, null, 6, null), null, 2, null));
                                return;
                            }
                            if (Intrinsics.areEqual(cryptoPulseEvent, CryptoPulseEvent.ShowPrimerForFeed.INSTANCE)) {
                                cryptoPulseActivity.pendingDestinationAfterPrimer = CryptoPulseActivity.PendingDestination.Feed.INSTANCE;
                                cryptoPulseActivity.setFragment(C11048R.id.fragment_container, CryptoPulsePrimerFragment.INSTANCE.newInstance());
                            } else if (cryptoPulseEvent instanceof CryptoPulseEvent.ShowPrimerForDigestFragment) {
                                cryptoPulseActivity.pendingDestinationAfterPrimer = new CryptoPulseActivity.PendingDestination.DigestFragment(((CryptoPulseEvent.ShowPrimerForDigestFragment) cryptoPulseEvent).getFragmentKey());
                                cryptoPulseActivity.setFragment(C11048R.id.fragment_container, CryptoPulsePrimerFragment.INSTANCE.newInstance());
                            } else {
                                if (!(cryptoPulseEvent instanceof CryptoPulseEvent.ShowErrorAlert)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                RhDialogFragment.Builder positiveButton = RhDialogFragment.INSTANCE.create(cryptoPulseActivity).setId(C12924R.id.crypto_pulse_failure_id).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome).setMessage(cryptoPulseActivity.getString(C12924R.string.crypto_pulse_error_message)).setPositiveButton(cryptoPulseActivity.getString(C12924R.string.crypto_pulse_error_cta));
                                FragmentManager supportFragmentManager = cryptoPulseActivity.getSupportFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                                RhDialogFragment.Builder.show$default(positiveButton, supportFragmentManager, coroutineScope.getClass().getSimpleName(), false, 4, null);
                            }
                        }
                    });
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Flow flowFilterNotNull = FlowKt.filterNotNull(CryptoPulseActivity.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoPulseActivity.this, coroutineScope, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowFilterNotNull, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C12924R.id.crypto_pulse_failure_id) {
            finish();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.crypto.pulse.primer.CryptoPulsePrimerFragment.Callbacks
    public void onCryptoPulsePrimerContinue() {
        PendingDestination pendingDestination = this.pendingDestinationAfterPrimer;
        if (Intrinsics.areEqual(pendingDestination, PendingDestination.Feed.INSTANCE)) {
            this.pendingDestinationAfterPrimer = null;
            setFragment(C11048R.id.fragment_container, Navigator.DefaultImpls.createFragment$default(getNavigator(), new IdentiAgreementKey(IdentiAgreementType.ClientDriven.COPILOT_DIGEST, null, null, 6, null), null, 2, null));
        } else if (pendingDestination instanceof PendingDestination.DigestFragment) {
            this.pendingDestinationAfterPrimer = null;
            setFragment(C11048R.id.fragment_container, Navigator.DefaultImpls.createFragment$default(getNavigator(), ((PendingDestination.DigestFragment) pendingDestination).getFragmentKey(), null, 2, null));
        } else if (pendingDestination != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.robinhood.shared.agreements.contracts.IdentiAgreementKey.Callbacks
    public void onAgreementAccepted() {
        getDuxo().pollSignedAgreementStatusForFeedUntilSigned();
    }

    /* compiled from: CryptoPulseActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/crypto/pulse/CryptoPulseActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/crypto/pulse/CryptoPulseActivity;", "Lcom/robinhood/shared/crypto/contracts/pulse/CryptoPulseIntentKey;", "<init>", "()V", "feature-crypto-pulse_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<CryptoPulseActivity, CryptoPulseIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public CryptoPulseIntentKey getExtras(CryptoPulseActivity cryptoPulseActivity) {
            return (CryptoPulseIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, cryptoPulseActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, CryptoPulseIntentKey cryptoPulseIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, cryptoPulseIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, CryptoPulseIntentKey cryptoPulseIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, cryptoPulseIntentKey);
        }
    }
}
