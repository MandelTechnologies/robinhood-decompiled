package com.robinhood.android.creditcard.p091ui.waitlist;

import android.content.Context;
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.common.collect.ImmutableMap;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.creditcard.contracts.CreditCardRhySpendingSunset;
import com.robinhood.android.creditcard.p091ui.CreditCardApplicationReferralsExperiment;
import com.robinhood.android.creditcard.p091ui.CreditCardWaitlistBlockGoldFlowExperiment;
import com.robinhood.android.creditcard.p091ui.CreditCardWaitlistBlockReferralsExperiment;
import com.robinhood.android.creditcard.p091ui.waitlist.CreditCardWaitlistEvent;
import com.robinhood.android.gold.subscription.store.GoldSubscriptionStore;
import com.robinhood.android.lib.creditcard.CreditCardSolidGoldReferralProgramTermination;
import com.robinhood.android.lib.store.creditcard.CreditCardStore;
import com.robinhood.android.lib.store.creditcard.CreditCardWaitlistStore;
import com.robinhood.android.lib.store.creditcard.prefs.CreditCardApplicationReferralCodePref;
import com.robinhood.android.lib.store.creditcard.prefs.CreditCardEntryPointSourcePref;
import com.robinhood.android.lib.store.creditcard.prefs.CreditCardWaitlistAutoJoinPref;
import com.robinhood.android.models.creditcard.api.graphql.CreditApplicationsResponse;
import com.robinhood.android.models.creditcard.api.graphql.GraphqlQueryResponse;
import com.robinhood.android.models.creditcard.api.graphql.ReferralCodeResponse;
import com.robinhood.android.models.creditcard.api.graphql.ReferralCodeType;
import com.robinhood.android.models.creditcard.api.graphql.ReferralCodeType2;
import com.robinhood.android.models.creditcard.api.graphql.ReferralContextResponse;
import com.robinhood.android.models.creditcard.api.graphql.ValidCreditApplicationInviteResponse;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.waitlist.spot.WaitlistAnimationConstants;
import com.robinhood.coroutines.dagger.annotation.DefaultDispatcher;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.bonfire.waitlist.ApiEmailWaitlistSpot;
import com.robinhood.models.api.bonfire.waitlist.EmailWaitlistSpotStatus;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.targetbackend.Endpoint;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.p408rx.DownloadManagerOnSubscribe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;
import okhttp3.HttpUrl;
import p479j$.time.Instant;
import timber.log.Timber;

/* compiled from: CreditCardWaitlistFragmentDuxo.kt */
@Metadata(m3635d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 I2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001IBi\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010 \u001a\u00020!H\u0016J\r\u0010\"\u001a\u00020!H\u0000¢\u0006\u0002\b#J\r\u0010$\u001a\u00020!H\u0000¢\u0006\u0002\b%J\u001b\u0010&\u001a\u00020!2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020!0(H\u0000¢\u0006\u0002\b)J\u0015\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020\u001fH\u0000¢\u0006\u0002\b,J\u0015\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020/H\u0000¢\u0006\u0002\b0J \u00101\u001a\u00020\u001c2\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105H\u0082@¢\u0006\u0002\u00106J\u0016\u00107\u001a\u00020\u001c2\u0006\u00108\u001a\u00020\u001cH\u0082@¢\u0006\u0002\u00109J\u0010\u0010:\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020<H\u0002J\u0018\u0010=\u001a\u00020!2\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010?H\u0002J\b\u0010A\u001a\u00020!H\u0002J\b\u0010B\u001a\u00020!H\u0002J,\u0010C\u001a\u001c\u0012\u0004\u0012\u000203\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010F\u0012\u0004\u0012\u00020G0E0D*\b\u0012\u0004\u0012\u00020H0?H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006J"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistFragmentDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistViewState;", "Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistEvent;", "creditCardStore", "Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "goldSubscriptionStore", "Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "waitlistStore", "Lcom/robinhood/android/lib/store/creditcard/CreditCardWaitlistStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "creditCardWaitlistAutoJoin", "Lcom/robinhood/prefs/BooleanPreference;", "creditCardApplicationReferralCode", "Lcom/robinhood/prefs/StringPreference;", "creditCardEntryPointSourcePref", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/lib/store/creditcard/CreditCardWaitlistStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/StringPreference;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/robinhood/android/udf/DuxoBundle;)V", "viewedJoined", "", "viewedGoldUpgradeFlow", "lastScreen", "Lcom/robinhood/android/creditcard/ui/waitlist/Screen;", "onStart", "", "onUpgrade", "onUpgrade$feature_credit_card_externalDebug", "joinWaitlist", "joinWaitlist$feature_credit_card_externalDebug", "acceptInvite", "onSuccess", "Lkotlin/Function0;", "acceptInvite$feature_credit_card_externalDebug", "toNextScreen", "screen", "toNextScreen$feature_credit_card_externalDebug", "startDownloading", "context", "Landroid/content/Context;", "startDownloading$feature_credit_card_externalDebug", "handleUserNotInWaitlist", "email", "", "subscriptionState", "Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore$GoldSubscriptionState;", "(Ljava/lang/String;Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore$GoldSubscriptionState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processReferral", "inCreditAppReferralExperiment", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyReferralCodeAndNavigate", "code", "Lcom/robinhood/android/models/creditcard/api/graphql/ReferralCodeType;", "handleUserInWaitlistWithInvite", "validInvites", "", "Lcom/robinhood/android/models/creditcard/api/graphql/ValidCreditApplicationInviteResponse$Response$Invite;", "handleUserWithCreditCard", "fetchExperiments", "ordered", "Lcom/google/common/collect/ImmutableMap;", "Lkotlin/Pair;", "Landroidx/media3/exoplayer/source/MediaSource;", "Landroidx/media3/common/MediaItem;", "Ljava/io/File;", "Companion", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CreditCardWaitlistFragmentDuxo extends BaseDuxo5<CreditCardWaitlistViewState, CreditCardWaitlistEvent> {
    private static final String FILE_EXTENSION = ".mp4";
    private static final String FROM_REFERRAL_IDENTIFIER = "cc-waitlist-from-referral";
    private static final String ROOT_DIRECTORY = "credit-card/gold";
    private final StringPreference creditCardApplicationReferralCode;
    private final StringPreference creditCardEntryPointSourcePref;
    private final CreditCardStore creditCardStore;
    private final BooleanPreference creditCardWaitlistAutoJoin;
    private final CoroutineDispatcher defaultDispatcher;
    private final EventLogger eventLogger;
    private final ExperimentsStore experimentsStore;
    private final GoldSubscriptionStore goldSubscriptionStore;
    private Screen lastScreen;
    private final UserStore userStore;
    private boolean viewedGoldUpgradeFlow;
    private boolean viewedJoined;
    private final CreditCardWaitlistStore waitlistStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final List<String> fileNames = CollectionsKt.listOf((Object[]) new String[]{"card_reveal", "virtual_cards", "family", "keys", "check_icon", "gold_icon", "forge"});

    /* compiled from: CreditCardWaitlistFragmentDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EmailWaitlistSpotStatus.values().length];
            try {
                iArr[EmailWaitlistSpotStatus.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EmailWaitlistSpotStatus.VERIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EmailWaitlistSpotStatus.INACTIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EmailWaitlistSpotStatus.GRANTED_ACCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CreditCardWaitlistFragmentDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo", m3645f = "CreditCardWaitlistFragmentDuxo.kt", m3646l = {514, EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE, EnumC7081g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE}, m3647m = "handleUserNotInWaitlist")
    /* renamed from: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$handleUserNotInWaitlist$1 */
    static final class C126741 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C126741(Continuation<? super C126741> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CreditCardWaitlistFragmentDuxo.this.handleUserNotInWaitlist(null, null, this);
        }
    }

    /* compiled from: CreditCardWaitlistFragmentDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo", m3645f = "CreditCardWaitlistFragmentDuxo.kt", m3646l = {333}, m3647m = "processReferral")
    /* renamed from: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$processReferral$1 */
    static final class C126831 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C126831(Continuation<? super C126831> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CreditCardWaitlistFragmentDuxo.this.processReferral(false, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditCardWaitlistFragmentDuxo(CreditCardStore creditCardStore, ExperimentsStore experimentsStore, GoldSubscriptionStore goldSubscriptionStore, UserStore userStore, CreditCardWaitlistStore waitlistStore, EventLogger eventLogger, @CreditCardWaitlistAutoJoinPref BooleanPreference creditCardWaitlistAutoJoin, @CreditCardApplicationReferralCodePref StringPreference creditCardApplicationReferralCode, @CreditCardEntryPointSourcePref StringPreference creditCardEntryPointSourcePref, @DefaultDispatcher CoroutineDispatcher defaultDispatcher, DuxoBundle duxoBundle) {
        super(new CreditCardWaitlistViewState(null, false, null, false, null, null, false, null, false, false, false, null, false, null, false, 32767, null), duxoBundle);
        Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(goldSubscriptionStore, "goldSubscriptionStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(waitlistStore, "waitlistStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(creditCardWaitlistAutoJoin, "creditCardWaitlistAutoJoin");
        Intrinsics.checkNotNullParameter(creditCardApplicationReferralCode, "creditCardApplicationReferralCode");
        Intrinsics.checkNotNullParameter(creditCardEntryPointSourcePref, "creditCardEntryPointSourcePref");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.creditCardStore = creditCardStore;
        this.experimentsStore = experimentsStore;
        this.goldSubscriptionStore = goldSubscriptionStore;
        this.userStore = userStore;
        this.waitlistStore = waitlistStore;
        this.eventLogger = eventLogger;
        this.creditCardWaitlistAutoJoin = creditCardWaitlistAutoJoin;
        this.creditCardApplicationReferralCode = creditCardApplicationReferralCode;
        this.creditCardEntryPointSourcePref = creditCardEntryPointSourcePref;
        this.defaultDispatcher = defaultDispatcher;
        this.lastScreen = Screen.LOADING;
    }

    /* compiled from: CreditCardWaitlistFragmentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$onStart$1", m3645f = "CreditCardWaitlistFragmentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$onStart$1 */
    static final class C126811 extends ContinuationImpl7 implements Function2<CreditCardWaitlistViewState, Continuation<? super CreditCardWaitlistViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C126811(Continuation<? super C126811> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C126811 c126811 = new C126811(continuation);
            c126811.L$0 = obj;
            return c126811;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreditCardWaitlistViewState creditCardWaitlistViewState, Continuation<? super CreditCardWaitlistViewState> continuation) {
            return ((C126811) create(creditCardWaitlistViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CreditCardWaitlistViewState creditCardWaitlistViewState = (CreditCardWaitlistViewState) this.L$0;
            return creditCardWaitlistViewState.copy((32703 & 1) != 0 ? creditCardWaitlistViewState.screen : null, (32703 & 2) != 0 ? creditCardWaitlistViewState.joiningWaitlist : false, (32703 & 4) != 0 ? creditCardWaitlistViewState.goldSubscriptionState : null, (32703 & 8) != 0 ? creditCardWaitlistViewState.inBlockGoldFlowExperiment : false, (32703 & 16) != 0 ? creditCardWaitlistViewState.videos : null, (32703 & 32) != 0 ? creditCardWaitlistViewState.referralCode : null, (32703 & 64) != 0 ? creditCardWaitlistViewState.referralsBlocked : false, (32703 & 128) != 0 ? creditCardWaitlistViewState.referralContext : null, (32703 & 256) != 0 ? creditCardWaitlistViewState.canApply : false, (32703 & 512) != 0 ? creditCardWaitlistViewState.hasInvite : false, (32703 & 1024) != 0 ? creditCardWaitlistViewState.hasValidCreditCard : false, (32703 & 2048) != 0 ? creditCardWaitlistViewState.referrerFirstName : null, (32703 & 4096) != 0 ? creditCardWaitlistViewState.waitlistFlowSimplified : false, (32703 & 8192) != 0 ? creditCardWaitlistViewState.entryPointSource : null, (32703 & 16384) != 0 ? creditCardWaitlistViewState.isLoadingWaitlistState : true);
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        applyMutation(new C126811(null));
        fetchExperiments();
        getLifecycleScope().launchWhenStarted(new C126822(null));
    }

    /* compiled from: CreditCardWaitlistFragmentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$onStart$2", m3645f = "CreditCardWaitlistFragmentDuxo.kt", m3646l = {94}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$onStart$2 */
    static final class C126822 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C126822(Continuation<? super C126822> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreditCardWaitlistFragmentDuxo.this.new C126822(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C126822) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CreditCardWaitlistFragmentDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$onStart$2$1", m3645f = "CreditCardWaitlistFragmentDuxo.kt", m3646l = {514, 515, WaitlistAnimationConstants.RIGHT_YAW_END, 113, 517, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$onStart$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int I$0;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;
            final /* synthetic */ CreditCardWaitlistFragmentDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CreditCardWaitlistFragmentDuxo creditCardWaitlistFragmentDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = creditCardWaitlistFragmentDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:97:0x0241, code lost:
            
                if (r15.handleUserNotInWaitlist(r3, r5, r14) == r0) goto L98;
             */
            /* JADX WARN: Removed duplicated region for block: B:29:0x00d6  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x0117  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0143 A[PHI: r1 r5 r15
              0x0143: PHI (r1v24 com.robinhood.android.gold.subscription.store.GoldSubscriptionStore$GoldSubscriptionState) = 
              (r1v20 com.robinhood.android.gold.subscription.store.GoldSubscriptionStore$GoldSubscriptionState)
              (r1v27 com.robinhood.android.gold.subscription.store.GoldSubscriptionStore$GoldSubscriptionState)
             binds: [B:43:0x013f, B:16:0x004a] A[DONT_GENERATE, DONT_INLINE]
              0x0143: PHI (r5v21 java.lang.Boolean) = (r5v17 java.lang.Boolean), (r5v24 java.lang.Boolean) binds: [B:43:0x013f, B:16:0x004a] A[DONT_GENERATE, DONT_INLINE]
              0x0143: PHI (r15v29 java.lang.Object) = (r15v26 java.lang.Object), (r15v0 java.lang.Object) binds: [B:43:0x013f, B:16:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:48:0x0164  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x0166  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x0193  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x01b6  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x01b8  */
            /* JADX WARN: Removed duplicated region for block: B:82:0x0203  */
            /* JADX WARN: Removed duplicated region for block: B:87:0x0214  */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                CreditCardWaitlistFragmentDuxo creditCardWaitlistFragmentDuxo;
                AnonymousClass4 anonymousClass4;
                Object objAwaitFirst;
                Boolean bool;
                Object objAwaitFirst2;
                Boolean bool2;
                GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState;
                Boolean bool3;
                GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState2;
                Object referralContext;
                Object creditApplications;
                UUID uuid;
                Boolean bool4;
                String str;
                GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState3;
                CreditApplicationsResponse creditApplicationsResponse;
                Object validCreditApplicationInvites;
                List<CreditApplicationsResponse.AuthIdentityObject.CreditApplication> list;
                int i;
                String str2;
                GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState4;
                Boolean bool5;
                CreditApplicationsResponse.AuthIdentityObject authIdentity;
                CreditApplicationsResponse.AuthIdentityObject authIdentity2;
                List<CreditApplicationsResponse.AuthIdentityObject.CreditCustomer> creditCustomers;
                ValidCreditApplicationInviteResponse validCreditApplicationInviteResponse;
                ArrayList arrayList;
                List<CreditApplicationsResponse.AuthIdentityObject.CreditApplication> list2;
                ValidCreditApplicationInviteResponse.Response creditApplicationInvites;
                List<ValidCreditApplicationInviteResponse.Response.Invite> invites;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = 0;
                try {
                } catch (Throwable th) {
                    try {
                        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
                        this.this$0.submit(CreditCardWaitlistEvent.Error.INSTANCE);
                        creditCardWaitlistFragmentDuxo = this.this$0;
                        anonymousClass4 = new AnonymousClass4(null);
                    } catch (Throwable th2) {
                        this.this$0.applyMutation(new AnonymousClass4(null));
                        throw th2;
                    }
                }
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C497241(this.this$0.creditCardEntryPointSourcePref.get(), null));
                        Observable observableStreamState$default = ExperimentsProvider.DefaultImpls.streamState$default(this.this$0.experimentsStore, new Experiment[]{CreditCardWaitlistBlockGoldFlowExperiment.INSTANCE}, false, null, 6, null);
                        this.label = 1;
                        obj = RxAwait3.awaitFirst(observableStreamState$default, this);
                        if (obj != coroutine_suspended) {
                            Boolean bool6 = (Boolean) obj;
                            Observable observableStreamState$default2 = ExperimentsProvider.DefaultImpls.streamState$default(this.this$0.experimentsStore, new Experiment[]{CreditCardRhySpendingSunset.INSTANCE}, false, null, 6, null);
                            this.L$0 = bool6;
                            this.label = 2;
                            objAwaitFirst = RxAwait3.awaitFirst(observableStreamState$default2, this);
                            if (objAwaitFirst != coroutine_suspended) {
                                bool = bool6;
                                obj = objAwaitFirst;
                                Boolean bool7 = (Boolean) obj;
                                Observable<GoldSubscriptionStore.GoldSubscriptionState> observableStreamGoldSubscriptionState = this.this$0.goldSubscriptionStore.streamGoldSubscriptionState();
                                this.L$0 = bool;
                                this.L$1 = bool7;
                                this.label = 3;
                                objAwaitFirst2 = RxAwait3.awaitFirst(observableStreamGoldSubscriptionState, this);
                                if (objAwaitFirst2 != coroutine_suspended) {
                                    bool2 = bool7;
                                    obj = objAwaitFirst2;
                                    goldSubscriptionState = (GoldSubscriptionStore.GoldSubscriptionState) obj;
                                    this.this$0.applyMutation(new AnonymousClass2(goldSubscriptionState, bool, null));
                                    try {
                                        CreditCardStore creditCardStore = this.this$0.creditCardStore;
                                        this.L$0 = bool2;
                                        this.L$1 = goldSubscriptionState;
                                        this.label = 4;
                                        referralContext = creditCardStore.getReferralContext(this);
                                    } catch (Exception unused) {
                                        bool3 = bool2;
                                        goldSubscriptionState2 = goldSubscriptionState;
                                    }
                                    if (referralContext != coroutine_suspended) {
                                        Boolean bool8 = bool2;
                                        goldSubscriptionState2 = goldSubscriptionState;
                                        obj = referralContext;
                                        bool3 = bool8;
                                        this.this$0.applyMutation(new AnonymousClass3((ReferralContextResponse) obj, null));
                                        Observable<User> user = this.this$0.userStore.getUser();
                                        this.L$0 = bool3;
                                        this.L$1 = goldSubscriptionState2;
                                        this.label = 5;
                                        obj = RxAwait3.awaitFirst(user, this);
                                        if (obj != coroutine_suspended) {
                                            User user2 = (User) obj;
                                            String email = user2.getEmail();
                                            UUID id = user2.getId();
                                            CreditCardStore creditCardStore2 = this.this$0.creditCardStore;
                                            this.L$0 = bool3;
                                            this.L$1 = goldSubscriptionState2;
                                            this.L$2 = email;
                                            this.L$3 = id;
                                            this.label = 6;
                                            creditApplications = creditCardStore2.getCreditApplications(this);
                                            if (creditApplications == coroutine_suspended) {
                                                GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState5 = goldSubscriptionState2;
                                                uuid = id;
                                                obj = creditApplications;
                                                bool4 = bool3;
                                                str = email;
                                                goldSubscriptionState3 = goldSubscriptionState5;
                                                creditApplicationsResponse = (CreditApplicationsResponse) obj;
                                                if (creditApplicationsResponse != null && (authIdentity2 = creditApplicationsResponse.getAuthIdentity()) != null && (creditCustomers = authIdentity2.getCreditCustomers()) != null && (!creditCustomers.isEmpty())) {
                                                    i2 = 1;
                                                }
                                                List<CreditApplicationsResponse.AuthIdentityObject.CreditApplication> creditApplications2 = (creditApplicationsResponse != null || (authIdentity = creditApplicationsResponse.getAuthIdentity()) == null) ? null : authIdentity.getCreditApplications();
                                                CreditCardStore creditCardStore3 = this.this$0.creditCardStore;
                                                String string2 = uuid.toString();
                                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                                this.L$0 = bool4;
                                                this.L$1 = goldSubscriptionState3;
                                                this.L$2 = str;
                                                this.L$3 = creditApplications2;
                                                this.I$0 = i2;
                                                this.label = 7;
                                                validCreditApplicationInvites = creditCardStore3.getValidCreditApplicationInvites(string2, this);
                                                if (validCreditApplicationInvites == coroutine_suspended) {
                                                    int i3 = i2;
                                                    list = creditApplications2;
                                                    obj = validCreditApplicationInvites;
                                                    i = i3;
                                                    str2 = str;
                                                    goldSubscriptionState4 = goldSubscriptionState3;
                                                    bool5 = bool4;
                                                    validCreditApplicationInviteResponse = (ValidCreditApplicationInviteResponse) obj;
                                                    if (validCreditApplicationInviteResponse != null || (creditApplicationInvites = validCreditApplicationInviteResponse.getCreditApplicationInvites()) == null || (invites = creditApplicationInvites.getInvites()) == null) {
                                                        arrayList = null;
                                                    } else {
                                                        arrayList = new ArrayList();
                                                        for (Object obj2 : invites) {
                                                            Long expiresAt = ((ValidCreditApplicationInviteResponse.Response.Invite) obj2).getExpiresAt();
                                                            if (expiresAt == null || Instant.now().compareTo(Instant.ofEpochMilli(expiresAt.longValue())) <= 0) {
                                                                arrayList.add(obj2);
                                                            }
                                                        }
                                                    }
                                                    if (i == 0 && bool5.booleanValue()) {
                                                        this.this$0.handleUserWithCreditCard();
                                                        Unit unit = Unit.INSTANCE;
                                                    } else if ((arrayList != null || arrayList.isEmpty()) && ((list2 = list) == null || list2.isEmpty())) {
                                                        CreditCardWaitlistFragmentDuxo creditCardWaitlistFragmentDuxo2 = this.this$0;
                                                        this.L$0 = null;
                                                        this.L$1 = null;
                                                        this.L$2 = null;
                                                        this.L$3 = null;
                                                        this.label = 8;
                                                        break;
                                                    } else {
                                                        this.this$0.handleUserInWaitlistWithInvite(arrayList);
                                                        Unit unit2 = Unit.INSTANCE;
                                                    }
                                                    creditCardWaitlistFragmentDuxo = this.this$0;
                                                    anonymousClass4 = new AnonymousClass4(null);
                                                    creditCardWaitlistFragmentDuxo.applyMutation(anonymousClass4);
                                                    return Unit.INSTANCE;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return coroutine_suspended;
                    case 1:
                        ResultKt.throwOnFailure(obj);
                        Boolean bool62 = (Boolean) obj;
                        Observable observableStreamState$default22 = ExperimentsProvider.DefaultImpls.streamState$default(this.this$0.experimentsStore, new Experiment[]{CreditCardRhySpendingSunset.INSTANCE}, false, null, 6, null);
                        this.L$0 = bool62;
                        this.label = 2;
                        objAwaitFirst = RxAwait3.awaitFirst(observableStreamState$default22, this);
                        if (objAwaitFirst != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 2:
                        Boolean bool9 = (Boolean) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        bool = bool9;
                        Boolean bool72 = (Boolean) obj;
                        Observable<GoldSubscriptionStore.GoldSubscriptionState> observableStreamGoldSubscriptionState2 = this.this$0.goldSubscriptionStore.streamGoldSubscriptionState();
                        this.L$0 = bool;
                        this.L$1 = bool72;
                        this.label = 3;
                        objAwaitFirst2 = RxAwait3.awaitFirst(observableStreamGoldSubscriptionState2, this);
                        if (objAwaitFirst2 != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 3:
                        bool2 = (Boolean) this.L$1;
                        bool = (Boolean) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        goldSubscriptionState = (GoldSubscriptionStore.GoldSubscriptionState) obj;
                        this.this$0.applyMutation(new AnonymousClass2(goldSubscriptionState, bool, null));
                        CreditCardStore creditCardStore4 = this.this$0.creditCardStore;
                        this.L$0 = bool2;
                        this.L$1 = goldSubscriptionState;
                        this.label = 4;
                        referralContext = creditCardStore4.getReferralContext(this);
                        if (referralContext != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 4:
                        goldSubscriptionState2 = (GoldSubscriptionStore.GoldSubscriptionState) this.L$1;
                        bool3 = (Boolean) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            this.this$0.applyMutation(new AnonymousClass3((ReferralContextResponse) obj, null));
                        } catch (Exception unused2) {
                        }
                        Observable<User> user3 = this.this$0.userStore.getUser();
                        this.L$0 = bool3;
                        this.L$1 = goldSubscriptionState2;
                        this.label = 5;
                        obj = RxAwait3.awaitFirst(user3, this);
                        if (obj != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 5:
                        goldSubscriptionState2 = (GoldSubscriptionStore.GoldSubscriptionState) this.L$1;
                        bool3 = (Boolean) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        User user22 = (User) obj;
                        String email2 = user22.getEmail();
                        UUID id2 = user22.getId();
                        CreditCardStore creditCardStore22 = this.this$0.creditCardStore;
                        this.L$0 = bool3;
                        this.L$1 = goldSubscriptionState2;
                        this.L$2 = email2;
                        this.L$3 = id2;
                        this.label = 6;
                        creditApplications = creditCardStore22.getCreditApplications(this);
                        if (creditApplications == coroutine_suspended) {
                        }
                        break;
                    case 6:
                        uuid = (UUID) this.L$3;
                        str = (String) this.L$2;
                        goldSubscriptionState3 = (GoldSubscriptionStore.GoldSubscriptionState) this.L$1;
                        bool4 = (Boolean) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        creditApplicationsResponse = (CreditApplicationsResponse) obj;
                        if (creditApplicationsResponse != null) {
                            i2 = 1;
                            break;
                        }
                        if (creditApplicationsResponse != null) {
                            CreditCardStore creditCardStore32 = this.this$0.creditCardStore;
                            String string22 = uuid.toString();
                            Intrinsics.checkNotNullExpressionValue(string22, "toString(...)");
                            this.L$0 = bool4;
                            this.L$1 = goldSubscriptionState3;
                            this.L$2 = str;
                            this.L$3 = creditApplications2;
                            this.I$0 = i2;
                            this.label = 7;
                            validCreditApplicationInvites = creditCardStore32.getValidCreditApplicationInvites(string22, this);
                            if (validCreditApplicationInvites == coroutine_suspended) {
                            }
                            break;
                        }
                        creditCardWaitlistFragmentDuxo.applyMutation(anonymousClass4);
                        return Unit.INSTANCE;
                    case 7:
                        i = this.I$0;
                        list = (List) this.L$3;
                        str2 = (String) this.L$2;
                        goldSubscriptionState4 = (GoldSubscriptionStore.GoldSubscriptionState) this.L$1;
                        bool5 = (Boolean) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        validCreditApplicationInviteResponse = (ValidCreditApplicationInviteResponse) obj;
                        if (validCreditApplicationInviteResponse != null) {
                            arrayList = null;
                            if (i == 0) {
                                if (arrayList != null) {
                                    CreditCardWaitlistFragmentDuxo creditCardWaitlistFragmentDuxo22 = this.this$0;
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.label = 8;
                                    break;
                                } else {
                                    CreditCardWaitlistFragmentDuxo creditCardWaitlistFragmentDuxo222 = this.this$0;
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.label = 8;
                                }
                                break;
                            }
                            break;
                        }
                        creditCardWaitlistFragmentDuxo.applyMutation(anonymousClass4);
                        return Unit.INSTANCE;
                    case 8:
                        ResultKt.throwOnFailure(obj);
                        creditCardWaitlistFragmentDuxo = this.this$0;
                        anonymousClass4 = new AnonymousClass4(null);
                        creditCardWaitlistFragmentDuxo.applyMutation(anonymousClass4);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* compiled from: CreditCardWaitlistFragmentDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$onStart$2$1$1", m3645f = "CreditCardWaitlistFragmentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$onStart$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497241 extends ContinuationImpl7 implements Function2<CreditCardWaitlistViewState, Continuation<? super CreditCardWaitlistViewState>, Object> {
                final /* synthetic */ String $entryPointSource;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497241(String str, Continuation<? super C497241> continuation) {
                    super(2, continuation);
                    this.$entryPointSource = str;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497241 c497241 = new C497241(this.$entryPointSource, continuation);
                    c497241.L$0 = obj;
                    return c497241;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CreditCardWaitlistViewState creditCardWaitlistViewState, Continuation<? super CreditCardWaitlistViewState> continuation) {
                    return ((C497241) create(creditCardWaitlistViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CreditCardWaitlistViewState creditCardWaitlistViewState = (CreditCardWaitlistViewState) this.L$0;
                    return creditCardWaitlistViewState.copy((32703 & 1) != 0 ? creditCardWaitlistViewState.screen : null, (32703 & 2) != 0 ? creditCardWaitlistViewState.joiningWaitlist : false, (32703 & 4) != 0 ? creditCardWaitlistViewState.goldSubscriptionState : null, (32703 & 8) != 0 ? creditCardWaitlistViewState.inBlockGoldFlowExperiment : false, (32703 & 16) != 0 ? creditCardWaitlistViewState.videos : null, (32703 & 32) != 0 ? creditCardWaitlistViewState.referralCode : null, (32703 & 64) != 0 ? creditCardWaitlistViewState.referralsBlocked : false, (32703 & 128) != 0 ? creditCardWaitlistViewState.referralContext : null, (32703 & 256) != 0 ? creditCardWaitlistViewState.canApply : false, (32703 & 512) != 0 ? creditCardWaitlistViewState.hasInvite : false, (32703 & 1024) != 0 ? creditCardWaitlistViewState.hasValidCreditCard : false, (32703 & 2048) != 0 ? creditCardWaitlistViewState.referrerFirstName : null, (32703 & 4096) != 0 ? creditCardWaitlistViewState.waitlistFlowSimplified : false, (32703 & 8192) != 0 ? creditCardWaitlistViewState.entryPointSource : this.$entryPointSource, (32703 & 16384) != 0 ? creditCardWaitlistViewState.isLoadingWaitlistState : false);
                }
            }

            /* compiled from: CreditCardWaitlistFragmentDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$onStart$2$1$2", m3645f = "CreditCardWaitlistFragmentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$onStart$2$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CreditCardWaitlistViewState, Continuation<? super CreditCardWaitlistViewState>, Object> {
                final /* synthetic */ Boolean $inBlockGoldFlow;
                final /* synthetic */ GoldSubscriptionStore.GoldSubscriptionState $subscriptionState;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState, Boolean bool, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.$subscriptionState = goldSubscriptionState;
                    this.$inBlockGoldFlow = bool;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$subscriptionState, this.$inBlockGoldFlow, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CreditCardWaitlistViewState creditCardWaitlistViewState, Continuation<? super CreditCardWaitlistViewState> continuation) {
                    return ((AnonymousClass2) create(creditCardWaitlistViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CreditCardWaitlistViewState creditCardWaitlistViewState = (CreditCardWaitlistViewState) this.L$0;
                    GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState = this.$subscriptionState;
                    Intrinsics.checkNotNull(goldSubscriptionState);
                    Boolean bool = this.$inBlockGoldFlow;
                    Intrinsics.checkNotNull(bool);
                    return creditCardWaitlistViewState.copy((32703 & 1) != 0 ? creditCardWaitlistViewState.screen : null, (32703 & 2) != 0 ? creditCardWaitlistViewState.joiningWaitlist : false, (32703 & 4) != 0 ? creditCardWaitlistViewState.goldSubscriptionState : goldSubscriptionState, (32703 & 8) != 0 ? creditCardWaitlistViewState.inBlockGoldFlowExperiment : bool.booleanValue(), (32703 & 16) != 0 ? creditCardWaitlistViewState.videos : null, (32703 & 32) != 0 ? creditCardWaitlistViewState.referralCode : null, (32703 & 64) != 0 ? creditCardWaitlistViewState.referralsBlocked : false, (32703 & 128) != 0 ? creditCardWaitlistViewState.referralContext : null, (32703 & 256) != 0 ? creditCardWaitlistViewState.canApply : false, (32703 & 512) != 0 ? creditCardWaitlistViewState.hasInvite : false, (32703 & 1024) != 0 ? creditCardWaitlistViewState.hasValidCreditCard : false, (32703 & 2048) != 0 ? creditCardWaitlistViewState.referrerFirstName : null, (32703 & 4096) != 0 ? creditCardWaitlistViewState.waitlistFlowSimplified : false, (32703 & 8192) != 0 ? creditCardWaitlistViewState.entryPointSource : null, (32703 & 16384) != 0 ? creditCardWaitlistViewState.isLoadingWaitlistState : false);
                }
            }

            /* compiled from: CreditCardWaitlistFragmentDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$onStart$2$1$3", m3645f = "CreditCardWaitlistFragmentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$onStart$2$1$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CreditCardWaitlistViewState, Continuation<? super CreditCardWaitlistViewState>, Object> {
                final /* synthetic */ ReferralContextResponse $referralContext;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(ReferralContextResponse referralContextResponse, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.$referralContext = referralContextResponse;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$referralContext, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CreditCardWaitlistViewState creditCardWaitlistViewState, Continuation<? super CreditCardWaitlistViewState> continuation) {
                    return ((AnonymousClass3) create(creditCardWaitlistViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CreditCardWaitlistViewState creditCardWaitlistViewState = (CreditCardWaitlistViewState) this.L$0;
                    ReferralContextResponse referralContextResponse = this.$referralContext;
                    return creditCardWaitlistViewState.copy((32703 & 1) != 0 ? creditCardWaitlistViewState.screen : null, (32703 & 2) != 0 ? creditCardWaitlistViewState.joiningWaitlist : false, (32703 & 4) != 0 ? creditCardWaitlistViewState.goldSubscriptionState : null, (32703 & 8) != 0 ? creditCardWaitlistViewState.inBlockGoldFlowExperiment : false, (32703 & 16) != 0 ? creditCardWaitlistViewState.videos : null, (32703 & 32) != 0 ? creditCardWaitlistViewState.referralCode : null, (32703 & 64) != 0 ? creditCardWaitlistViewState.referralsBlocked : false, (32703 & 128) != 0 ? creditCardWaitlistViewState.referralContext : referralContextResponse != null ? referralContextResponse.getRhReferralContext() : null, (32703 & 256) != 0 ? creditCardWaitlistViewState.canApply : false, (32703 & 512) != 0 ? creditCardWaitlistViewState.hasInvite : false, (32703 & 1024) != 0 ? creditCardWaitlistViewState.hasValidCreditCard : false, (32703 & 2048) != 0 ? creditCardWaitlistViewState.referrerFirstName : null, (32703 & 4096) != 0 ? creditCardWaitlistViewState.waitlistFlowSimplified : false, (32703 & 8192) != 0 ? creditCardWaitlistViewState.entryPointSource : null, (32703 & 16384) != 0 ? creditCardWaitlistViewState.isLoadingWaitlistState : false);
                }
            }

            /* compiled from: CreditCardWaitlistFragmentDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$onStart$2$1$4", m3645f = "CreditCardWaitlistFragmentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$onStart$2$1$4, reason: invalid class name */
            static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CreditCardWaitlistViewState, Continuation<? super CreditCardWaitlistViewState>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(continuation);
                    anonymousClass4.L$0 = obj;
                    return anonymousClass4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CreditCardWaitlistViewState creditCardWaitlistViewState, Continuation<? super CreditCardWaitlistViewState> continuation) {
                    return ((AnonymousClass4) create(creditCardWaitlistViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CreditCardWaitlistViewState creditCardWaitlistViewState = (CreditCardWaitlistViewState) this.L$0;
                    return creditCardWaitlistViewState.copy((32703 & 1) != 0 ? creditCardWaitlistViewState.screen : null, (32703 & 2) != 0 ? creditCardWaitlistViewState.joiningWaitlist : false, (32703 & 4) != 0 ? creditCardWaitlistViewState.goldSubscriptionState : null, (32703 & 8) != 0 ? creditCardWaitlistViewState.inBlockGoldFlowExperiment : false, (32703 & 16) != 0 ? creditCardWaitlistViewState.videos : null, (32703 & 32) != 0 ? creditCardWaitlistViewState.referralCode : null, (32703 & 64) != 0 ? creditCardWaitlistViewState.referralsBlocked : false, (32703 & 128) != 0 ? creditCardWaitlistViewState.referralContext : null, (32703 & 256) != 0 ? creditCardWaitlistViewState.canApply : false, (32703 & 512) != 0 ? creditCardWaitlistViewState.hasInvite : false, (32703 & 1024) != 0 ? creditCardWaitlistViewState.hasValidCreditCard : false, (32703 & 2048) != 0 ? creditCardWaitlistViewState.referrerFirstName : null, (32703 & 4096) != 0 ? creditCardWaitlistViewState.waitlistFlowSimplified : false, (32703 & 8192) != 0 ? creditCardWaitlistViewState.entryPointSource : null, (32703 & 16384) != 0 ? creditCardWaitlistViewState.isLoadingWaitlistState : false);
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher coroutineDispatcher = CreditCardWaitlistFragmentDuxo.this.defaultDispatcher;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CreditCardWaitlistFragmentDuxo.this, null);
                this.label = 1;
                if (BuildersKt.withContext(coroutineDispatcher, anonymousClass1, this) == coroutine_suspended) {
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

    public final void onUpgrade$feature_credit_card_externalDebug() {
        this.viewedGoldUpgradeFlow = true;
        toNextScreen$feature_credit_card_externalDebug(Screen.LOADING);
    }

    public final void joinWaitlist$feature_credit_card_externalDebug() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), this.defaultDispatcher, null, new CreditCardWaitlistFragmentDuxo$joinWaitlist$1(this, null), 2, null);
    }

    public final void acceptInvite$feature_credit_card_externalDebug(Function0<Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), this.defaultDispatcher, null, new CreditCardWaitlistFragmentDuxo$acceptInvite$1(this, onSuccess, null), 2, null);
    }

    public final void toNextScreen$feature_credit_card_externalDebug(Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (screen == Screen.JOINED) {
            this.viewedJoined = true;
        }
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), this.defaultDispatcher, null, new CreditCardWaitlistFragmentDuxo$toNextScreen$1(this, screen, null), 2, null);
    }

    public final void startDownloading$feature_credit_card_externalDebug(final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        final File file = new File(context.getExternalCacheDir(), ROOT_DIRECTORY);
        file.mkdirs();
        Single list = Observable.fromIterable(fileNames).flatMapSingle(new Function() { // from class: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$startDownloading$1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends File> apply(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final File file2 = new File(file, it + ".mp4");
                if (file2.exists()) {
                    return Single.fromCallable(new Callable() { // from class: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$startDownloading$1.1
                        @Override // java.util.concurrent.Callable
                        public final File call() {
                            return file2;
                        }
                    });
                }
                return Single.create(new DownloadManagerOnSubscribe(context, CreditCardWaitlistFragmentDuxo.INSTANCE.assetUrl(it), file2, false));
            }
        }).toList();
        Intrinsics.checkNotNullExpressionValue(list, "toList(...)");
        bind(list, LifecycleEvent.ON_DESTROY).subscribeKotlin(new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreditCardWaitlistFragmentDuxo.startDownloading$lambda$0(this.f$0, (List) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreditCardWaitlistFragmentDuxo.startDownloading$lambda$1(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startDownloading$lambda$0(CreditCardWaitlistFragmentDuxo creditCardWaitlistFragmentDuxo, List list) {
        creditCardWaitlistFragmentDuxo.applyMutation(new CreditCardWaitlistFragmentDuxo$startDownloading$2$1(creditCardWaitlistFragmentDuxo, list, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startDownloading$lambda$1(CreditCardWaitlistFragmentDuxo creditCardWaitlistFragmentDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, it, false, null, 6, null);
        creditCardWaitlistFragmentDuxo.submit(CreditCardWaitlistEvent.Error.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleUserNotInWaitlist(String str, GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState, Continuation<? super Boolean> continuation) {
        C126741 c126741;
        String str2;
        GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState2;
        String str3;
        GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState3;
        final GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState4;
        ApiEmailWaitlistSpot apiEmailWaitlistSpot;
        int i;
        if (continuation instanceof C126741) {
            c126741 = (C126741) continuation;
            int i2 = c126741.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c126741.label = i2 - Integer.MIN_VALUE;
            } else {
                c126741 = new C126741(continuation);
            }
        }
        Object objAwaitFirst = c126741.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c126741.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objAwaitFirst);
            Observable observableStreamState$default = ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{CreditCardApplicationReferralsExperiment.INSTANCE}, false, null, 6, null);
            str2 = str;
            c126741.L$0 = str2;
            goldSubscriptionState2 = goldSubscriptionState;
            c126741.L$1 = goldSubscriptionState2;
            c126741.label = 1;
            objAwaitFirst = RxAwait3.awaitFirst(observableStreamState$default, c126741);
            if (objAwaitFirst != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                goldSubscriptionState4 = (GoldSubscriptionStore.GoldSubscriptionState) c126741.L$0;
                ResultKt.throwOnFailure(objAwaitFirst);
                apiEmailWaitlistSpot = (ApiEmailWaitlistSpot) objAwaitFirst;
                i = WhenMappings.$EnumSwitchMapping$0[apiEmailWaitlistSpot.getState().ordinal()];
                if (i != 1 || i == 2) {
                    applyMutation(new C126752(apiEmailWaitlistSpot, null));
                    withDataState(new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CreditCardWaitlistFragmentDuxo.handleUserNotInWaitlist$lambda$2(this.f$0, goldSubscriptionState4, (CreditCardWaitlistViewState) obj);
                        }
                    });
                } else if (i != 3) {
                    if (i == 4) {
                        toNextScreen$feature_credit_card_externalDebug(Screen.JOINED);
                    } else {
                        submit(CreditCardWaitlistEvent.Error.INSTANCE);
                    }
                } else if (this.creditCardWaitlistAutoJoin.get()) {
                    joinWaitlist$feature_credit_card_externalDebug();
                } else {
                    toNextScreen$feature_credit_card_externalDebug(Screen.INTRO);
                }
                return boxing.boxBoolean(false);
            }
            goldSubscriptionState3 = (GoldSubscriptionStore.GoldSubscriptionState) c126741.L$1;
            str3 = (String) c126741.L$0;
            ResultKt.throwOnFailure(objAwaitFirst);
            if (!((Boolean) objAwaitFirst).booleanValue()) {
                return boxing.boxBoolean(true);
            }
            CreditCardWaitlistStore creditCardWaitlistStore = this.waitlistStore;
            c126741.L$0 = goldSubscriptionState3;
            c126741.L$1 = null;
            c126741.label = 3;
            objAwaitFirst = creditCardWaitlistStore.getWaitlistStatus(str3, c126741);
            if (objAwaitFirst != coroutine_suspended) {
                goldSubscriptionState4 = goldSubscriptionState3;
                apiEmailWaitlistSpot = (ApiEmailWaitlistSpot) objAwaitFirst;
                i = WhenMappings.$EnumSwitchMapping$0[apiEmailWaitlistSpot.getState().ordinal()];
                if (i != 1) {
                    applyMutation(new C126752(apiEmailWaitlistSpot, null));
                    withDataState(new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CreditCardWaitlistFragmentDuxo.handleUserNotInWaitlist$lambda$2(this.f$0, goldSubscriptionState4, (CreditCardWaitlistViewState) obj);
                        }
                    });
                }
                return boxing.boxBoolean(false);
            }
            return coroutine_suspended;
        }
        GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState5 = (GoldSubscriptionStore.GoldSubscriptionState) c126741.L$1;
        String str4 = (String) c126741.L$0;
        ResultKt.throwOnFailure(objAwaitFirst);
        goldSubscriptionState2 = goldSubscriptionState5;
        str2 = str4;
        Boolean bool = (Boolean) objAwaitFirst;
        Intrinsics.checkNotNull(bool);
        boolean zBooleanValue = bool.booleanValue();
        c126741.L$0 = str2;
        c126741.L$1 = goldSubscriptionState2;
        c126741.label = 2;
        objAwaitFirst = processReferral(zBooleanValue, c126741);
        if (objAwaitFirst != coroutine_suspended) {
            GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState6 = goldSubscriptionState2;
            str3 = str2;
            goldSubscriptionState3 = goldSubscriptionState6;
            if (!((Boolean) objAwaitFirst).booleanValue()) {
            }
        }
        return coroutine_suspended;
    }

    /* compiled from: CreditCardWaitlistFragmentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$handleUserNotInWaitlist$2", m3645f = "CreditCardWaitlistFragmentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$handleUserNotInWaitlist$2 */
    static final class C126752 extends ContinuationImpl7 implements Function2<CreditCardWaitlistViewState, Continuation<? super CreditCardWaitlistViewState>, Object> {
        final /* synthetic */ ApiEmailWaitlistSpot $res;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C126752(ApiEmailWaitlistSpot apiEmailWaitlistSpot, Continuation<? super C126752> continuation) {
            super(2, continuation);
            this.$res = apiEmailWaitlistSpot;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C126752 c126752 = new C126752(this.$res, continuation);
            c126752.L$0 = obj;
            return c126752;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreditCardWaitlistViewState creditCardWaitlistViewState, Continuation<? super CreditCardWaitlistViewState> continuation) {
            return ((C126752) create(creditCardWaitlistViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CreditCardWaitlistViewState creditCardWaitlistViewState = (CreditCardWaitlistViewState) this.L$0;
            return creditCardWaitlistViewState.copy((32703 & 1) != 0 ? creditCardWaitlistViewState.screen : null, (32703 & 2) != 0 ? creditCardWaitlistViewState.joiningWaitlist : false, (32703 & 4) != 0 ? creditCardWaitlistViewState.goldSubscriptionState : null, (32703 & 8) != 0 ? creditCardWaitlistViewState.inBlockGoldFlowExperiment : false, (32703 & 16) != 0 ? creditCardWaitlistViewState.videos : null, (32703 & 32) != 0 ? creditCardWaitlistViewState.referralCode : this.$res.getReferral_code(), (32703 & 64) != 0 ? creditCardWaitlistViewState.referralsBlocked : false, (32703 & 128) != 0 ? creditCardWaitlistViewState.referralContext : null, (32703 & 256) != 0 ? creditCardWaitlistViewState.canApply : false, (32703 & 512) != 0 ? creditCardWaitlistViewState.hasInvite : false, (32703 & 1024) != 0 ? creditCardWaitlistViewState.hasValidCreditCard : false, (32703 & 2048) != 0 ? creditCardWaitlistViewState.referrerFirstName : null, (32703 & 4096) != 0 ? creditCardWaitlistViewState.waitlistFlowSimplified : false, (32703 & 8192) != 0 ? creditCardWaitlistViewState.entryPointSource : null, (32703 & 16384) != 0 ? creditCardWaitlistViewState.isLoadingWaitlistState : false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleUserNotInWaitlist$lambda$2(CreditCardWaitlistFragmentDuxo creditCardWaitlistFragmentDuxo, GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState, CreditCardWaitlistViewState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getWaitlistFlowSimplified()) {
            creditCardWaitlistFragmentDuxo.toNextScreen$feature_credit_card_externalDebug(Screen.CONFIRMATION);
        } else {
            Screen screen = dataState.getScreen();
            Screen screen2 = Screen.UPSELL;
            if (screen == screen2 && creditCardWaitlistFragmentDuxo.viewedGoldUpgradeFlow) {
                creditCardWaitlistFragmentDuxo.toNextScreen$feature_credit_card_externalDebug(Screen.JOINED);
            } else if ((goldSubscriptionState == GoldSubscriptionStore.GoldSubscriptionState.ELIGIBLE_FOR_GOLD || goldSubscriptionState == GoldSubscriptionStore.GoldSubscriptionState.NO_BROKERAGE_ACCOUNT) && !creditCardWaitlistFragmentDuxo.viewedJoined) {
                creditCardWaitlistFragmentDuxo.toNextScreen$feature_credit_card_externalDebug(screen2);
            } else {
                creditCardWaitlistFragmentDuxo.toNextScreen$feature_credit_card_externalDebug(Screen.JOINED);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processReferral(boolean z, Continuation<? super Boolean> continuation) {
        C126831 c126831;
        ReferralCodeResponse.ReferralCodeResponse referralCode;
        if (continuation instanceof C126831) {
            c126831 = (C126831) continuation;
            int i = c126831.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c126831.label = i - Integer.MIN_VALUE;
            } else {
                c126831 = new C126831(continuation);
            }
        }
        Object referralCode2 = c126831.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c126831.label;
        try {
        } catch (Exception e) {
            Timber.INSTANCE.mo3355e(e, "Error handling credit application referral code, failing gracefully", new Object[0]);
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(referralCode2);
            if (!z) {
                return boxing.boxBoolean(false);
            }
            String str = this.creditCardApplicationReferralCode.get();
            if (str != null) {
                CreditCardStore creditCardStore = this.creditCardStore;
                c126831.label = 1;
                referralCode2 = creditCardStore.getReferralCode(str, c126831);
                if (referralCode2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return boxing.boxBoolean(false);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(referralCode2);
        ReferralCodeResponse referralCodeResponse = (ReferralCodeResponse) ((GraphqlQueryResponse) referralCode2).getData();
        ReferralCodeType referralCode3 = (referralCodeResponse == null || (referralCode = referralCodeResponse.getReferralCode()) == null) ? null : referralCode.getReferralCode();
        if (referralCode3 != null && verifyReferralCodeAndNavigate(referralCode3)) {
            return boxing.boxBoolean(true);
        }
        return boxing.boxBoolean(false);
    }

    private final boolean verifyReferralCodeAndNavigate(ReferralCodeType code) {
        Integer usesLeft = code.getUsesLeft();
        if (code.getStatus() != ReferralCodeType2.ACTIVE || (usesLeft != null && usesLeft.intValue() <= 0)) {
            submit(new CreditCardWaitlistEvent.CreditApplicationReferralCodeLimitReached(code.getReferrer().getFirstName()));
            this.creditCardApplicationReferralCode.set(null);
            return false;
        }
        EventLogger.DefaultImpls.logScreenAppear$default(this.eventLogger, null, new Screen(Screen.Name.CC_WAITLIST_INTRO, null, FROM_REFERRAL_IDENTIFIER, null, 10, null), null, null, null, 29, null);
        applyMutation(new C126871(code, null));
        toNextScreen$feature_credit_card_externalDebug(Screen.INTRO);
        return true;
    }

    /* compiled from: CreditCardWaitlistFragmentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$verifyReferralCodeAndNavigate$1", m3645f = "CreditCardWaitlistFragmentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$verifyReferralCodeAndNavigate$1 */
    static final class C126871 extends ContinuationImpl7 implements Function2<CreditCardWaitlistViewState, Continuation<? super CreditCardWaitlistViewState>, Object> {
        final /* synthetic */ ReferralCodeType $code;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C126871(ReferralCodeType referralCodeType, Continuation<? super C126871> continuation) {
            super(2, continuation);
            this.$code = referralCodeType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C126871 c126871 = new C126871(this.$code, continuation);
            c126871.L$0 = obj;
            return c126871;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreditCardWaitlistViewState creditCardWaitlistViewState, Continuation<? super CreditCardWaitlistViewState> continuation) {
            return ((C126871) create(creditCardWaitlistViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CreditCardWaitlistViewState creditCardWaitlistViewState = (CreditCardWaitlistViewState) this.L$0;
            return creditCardWaitlistViewState.copy((32703 & 1) != 0 ? creditCardWaitlistViewState.screen : null, (32703 & 2) != 0 ? creditCardWaitlistViewState.joiningWaitlist : false, (32703 & 4) != 0 ? creditCardWaitlistViewState.goldSubscriptionState : null, (32703 & 8) != 0 ? creditCardWaitlistViewState.inBlockGoldFlowExperiment : false, (32703 & 16) != 0 ? creditCardWaitlistViewState.videos : null, (32703 & 32) != 0 ? creditCardWaitlistViewState.referralCode : null, (32703 & 64) != 0 ? creditCardWaitlistViewState.referralsBlocked : false, (32703 & 128) != 0 ? creditCardWaitlistViewState.referralContext : null, (32703 & 256) != 0 ? creditCardWaitlistViewState.canApply : false, (32703 & 512) != 0 ? creditCardWaitlistViewState.hasInvite : true, (32703 & 1024) != 0 ? creditCardWaitlistViewState.hasValidCreditCard : false, (32703 & 2048) != 0 ? creditCardWaitlistViewState.referrerFirstName : this.$code.getReferrer().getFirstName(), (32703 & 4096) != 0 ? creditCardWaitlistViewState.waitlistFlowSimplified : false, (32703 & 8192) != 0 ? creditCardWaitlistViewState.entryPointSource : null, (32703 & 16384) != 0 ? creditCardWaitlistViewState.isLoadingWaitlistState : false);
        }
    }

    /* compiled from: CreditCardWaitlistFragmentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$handleUserInWaitlistWithInvite$1", m3645f = "CreditCardWaitlistFragmentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$handleUserInWaitlistWithInvite$1 */
    static final class C126731 extends ContinuationImpl7 implements Function2<CreditCardWaitlistViewState, Continuation<? super CreditCardWaitlistViewState>, Object> {
        final /* synthetic */ boolean $isSolidGold;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C126731(boolean z, Continuation<? super C126731> continuation) {
            super(2, continuation);
            this.$isSolidGold = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C126731 c126731 = new C126731(this.$isSolidGold, continuation);
            c126731.L$0 = obj;
            return c126731;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreditCardWaitlistViewState creditCardWaitlistViewState, Continuation<? super CreditCardWaitlistViewState> continuation) {
            return ((C126731) create(creditCardWaitlistViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CreditCardWaitlistViewState creditCardWaitlistViewState = (CreditCardWaitlistViewState) this.L$0;
            return creditCardWaitlistViewState.copy((32703 & 1) != 0 ? creditCardWaitlistViewState.screen : this.$isSolidGold ? Screen.SOLID_GOLD_INTRO : Screen.INTRO, (32703 & 2) != 0 ? creditCardWaitlistViewState.joiningWaitlist : false, (32703 & 4) != 0 ? creditCardWaitlistViewState.goldSubscriptionState : null, (32703 & 8) != 0 ? creditCardWaitlistViewState.inBlockGoldFlowExperiment : false, (32703 & 16) != 0 ? creditCardWaitlistViewState.videos : null, (32703 & 32) != 0 ? creditCardWaitlistViewState.referralCode : null, (32703 & 64) != 0 ? creditCardWaitlistViewState.referralsBlocked : false, (32703 & 128) != 0 ? creditCardWaitlistViewState.referralContext : null, (32703 & 256) != 0 ? creditCardWaitlistViewState.canApply : true, (32703 & 512) != 0 ? creditCardWaitlistViewState.hasInvite : false, (32703 & 1024) != 0 ? creditCardWaitlistViewState.hasValidCreditCard : false, (32703 & 2048) != 0 ? creditCardWaitlistViewState.referrerFirstName : null, (32703 & 4096) != 0 ? creditCardWaitlistViewState.waitlistFlowSimplified : false, (32703 & 8192) != 0 ? creditCardWaitlistViewState.entryPointSource : null, (32703 & 16384) != 0 ? creditCardWaitlistViewState.isLoadingWaitlistState : false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleUserInWaitlistWithInvite(List<ValidCreditApplicationInviteResponse.Response.Invite> validInvites) {
        boolean z = false;
        if (validInvites != null) {
            List<ValidCreditApplicationInviteResponse.Response.Invite> list = validInvites;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((ValidCreditApplicationInviteResponse.Response.Invite) it.next()).isSolidGold()) {
                        z = true;
                        break;
                    }
                }
            }
        }
        applyMutation(new C126731(z, null));
    }

    /* compiled from: CreditCardWaitlistFragmentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$handleUserWithCreditCard$1", m3645f = "CreditCardWaitlistFragmentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$handleUserWithCreditCard$1 */
    static final class C126761 extends ContinuationImpl7 implements Function2<CreditCardWaitlistViewState, Continuation<? super CreditCardWaitlistViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C126761(Continuation<? super C126761> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C126761 c126761 = new C126761(continuation);
            c126761.L$0 = obj;
            return c126761;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreditCardWaitlistViewState creditCardWaitlistViewState, Continuation<? super CreditCardWaitlistViewState> continuation) {
            return ((C126761) create(creditCardWaitlistViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CreditCardWaitlistViewState creditCardWaitlistViewState = (CreditCardWaitlistViewState) this.L$0;
            return creditCardWaitlistViewState.copy((32703 & 1) != 0 ? creditCardWaitlistViewState.screen : Screen.INTRO, (32703 & 2) != 0 ? creditCardWaitlistViewState.joiningWaitlist : false, (32703 & 4) != 0 ? creditCardWaitlistViewState.goldSubscriptionState : null, (32703 & 8) != 0 ? creditCardWaitlistViewState.inBlockGoldFlowExperiment : false, (32703 & 16) != 0 ? creditCardWaitlistViewState.videos : null, (32703 & 32) != 0 ? creditCardWaitlistViewState.referralCode : null, (32703 & 64) != 0 ? creditCardWaitlistViewState.referralsBlocked : false, (32703 & 128) != 0 ? creditCardWaitlistViewState.referralContext : null, (32703 & 256) != 0 ? creditCardWaitlistViewState.canApply : false, (32703 & 512) != 0 ? creditCardWaitlistViewState.hasInvite : false, (32703 & 1024) != 0 ? creditCardWaitlistViewState.hasValidCreditCard : true, (32703 & 2048) != 0 ? creditCardWaitlistViewState.referrerFirstName : null, (32703 & 4096) != 0 ? creditCardWaitlistViewState.waitlistFlowSimplified : false, (32703 & 8192) != 0 ? creditCardWaitlistViewState.entryPointSource : null, (32703 & 16384) != 0 ? creditCardWaitlistViewState.isLoadingWaitlistState : false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleUserWithCreditCard() {
        applyMutation(new C126761(null));
    }

    private final void fetchExperiments() {
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{CreditCardWaitlistBlockReferralsExperiment.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreditCardWaitlistFragmentDuxo.fetchExperiments$lambda$5(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{CreditCardSolidGoldReferralProgramTermination.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreditCardWaitlistFragmentDuxo.fetchExperiments$lambda$6(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchExperiments$lambda$5(CreditCardWaitlistFragmentDuxo creditCardWaitlistFragmentDuxo, boolean z) {
        creditCardWaitlistFragmentDuxo.applyMutation(new CreditCardWaitlistFragmentDuxo$fetchExperiments$1$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchExperiments$lambda$6(CreditCardWaitlistFragmentDuxo creditCardWaitlistFragmentDuxo, boolean z) {
        creditCardWaitlistFragmentDuxo.applyMutation(new CreditCardWaitlistFragmentDuxo$fetchExperiments$2$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x006a, code lost:
    
        r0.put(r3, new kotlin.Tuples2(com.robinhood.android.creditcard.p091ui.waitlist.CreditCardWaitlistFragmentDuxoKt.getMediaSource(android.net.Uri.fromFile(r5)), androidx.media3.common.MediaItem.fromUri(com.robinhood.android.creditcard.p091ui.waitlist.CreditCardWaitlistFragmentDuxo.INSTANCE.assetUrl(r3).getUrl())));
        r2.add(kotlin.Unit.INSTANCE);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ImmutableMap<String, Tuples2<MediaSource, MediaItem>> ordered(List<? extends File> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<String> list2 = fileNames;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (String str : list2) {
            for (File file : list) {
                String path = file.getPath();
                Intrinsics.checkNotNull(path);
                String strSubstring = path.substring(StringsKt.lastIndexOf$default((CharSequence) path, "/", 0, false, 6, (Object) null) + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                if (Intrinsics.areEqual(strSubstring, str + FILE_EXTENSION)) {
                    break;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        ImmutableMap<String, Tuples2<MediaSource, MediaItem>> immutableMapCopyOf = ImmutableMap.copyOf((Map) linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(immutableMapCopyOf, "copyOf(...)");
        return immutableMapCopyOf;
    }

    /* compiled from: CreditCardWaitlistFragmentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistFragmentDuxo$Companion;", "", "<init>", "()V", "ROOT_DIRECTORY", "", "FILE_EXTENSION", "FROM_REFERRAL_IDENTIFIER", "fileNames", "", "assetUrl", "Lokhttp3/HttpUrl;", "name", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final HttpUrl assetUrl(String name) {
            return Endpoint.BrokerageStatic.INSTANCE.getURL_APP_ASSETS().newBuilder().addPathSegment("credit-card/gold/" + name + CreditCardWaitlistFragmentDuxo.FILE_EXTENSION).build();
        }
    }
}
