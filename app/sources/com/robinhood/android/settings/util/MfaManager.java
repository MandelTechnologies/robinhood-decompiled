package com.robinhood.android.settings.util;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.api.retrofit.Sheriff;
import com.robinhood.models.api.Mfa;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MfaManager.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0013\u001a\u00020\u0014J\"\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0086@¢\u0006\u0002\u0010\u001aJ\"\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0086@¢\u0006\u0002\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001e2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0086@¢\u0006\u0002\u0010\u001fJ\u001e\u0010 \u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010#J&\u0010$\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010&J\"\u0010'\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0086@¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\n\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r \u000e*\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/settings/util/MfaManager;", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "sheriff", "Lcom/robinhood/api/retrofit/Sheriff;", "brokeback", "Lcom/robinhood/api/retrofit/Brokeback;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/api/retrofit/Sheriff;Lcom/robinhood/api/retrofit/Brokeback;)V", "mfaRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/api/Mfa;", "kotlin.jvm.PlatformType", "mfaObservable", "Lio/reactivex/Observable;", "getMfaObservable", "()Lio/reactivex/Observable;", "refresh", "", "enableSmsMfa", "phoneNumber", "", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "(Ljava/lang/String;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifySmsMfa", "mfaCode", "enableAppMfa", "Lcom/robinhood/models/api/Mfa$EnableAppMfaResponse;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recoverAppMfa", "Lcom/robinhood/models/api/Mfa$RecoverAppMfaResponse;", "enrollmentToken", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recoverSmsMfa", "Lcom/robinhood/models/api/Mfa$RecoverSmsMfaResponse;", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyAppMfa", "lib-mfa_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class MfaManager {
    private final Brokeback brokeback;
    private final CoroutineScope coroutineScope;
    private final BehaviorRelay<Optional<Mfa>> mfaRelay;
    private final Sheriff sheriff;

    /* compiled from: MfaManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.settings.util.MfaManager", m3645f = "MfaManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "verifyAppMfa")
    /* renamed from: com.robinhood.android.settings.util.MfaManager$verifyAppMfa$1 */
    static final class C284701 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C284701(Continuation<? super C284701> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MfaManager.this.verifyAppMfa(null, null, this);
        }
    }

    /* compiled from: MfaManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.settings.util.MfaManager", m3645f = "MfaManager.kt", m3646l = {48}, m3647m = "verifySmsMfa")
    /* renamed from: com.robinhood.android.settings.util.MfaManager$verifySmsMfa$1 */
    static final class C284711 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C284711(Continuation<? super C284711> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MfaManager.this.verifySmsMfa(null, null, this);
        }
    }

    public MfaManager(@RootCoroutineScope CoroutineScope coroutineScope, Sheriff sheriff, Brokeback brokeback) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(sheriff, "sheriff");
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        this.coroutineScope = coroutineScope;
        this.sheriff = sheriff;
        this.brokeback = brokeback;
        BehaviorRelay<Optional<Mfa>> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.mfaRelay = behaviorRelayCreate;
    }

    public final Observable<Mfa> getMfaObservable() {
        return ObservablesKt.filterIsPresent(this.mfaRelay);
    }

    /* compiled from: MfaManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.settings.util.MfaManager$refresh$1", m3645f = "MfaManager.kt", m3646l = {34}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.settings.util.MfaManager$refresh$1 */
    static final class C284691 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C284691(Continuation<? super C284691> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MfaManager.this.new C284691(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C284691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Optional optionalAsOptional;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Brokeback brokeback = MfaManager.this.brokeback;
                    this.label = 1;
                    obj = brokeback.getMfa(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                optionalAsOptional = Optional3.asOptional(obj);
            } catch (Exception unused) {
                optionalAsOptional = Optional2.INSTANCE;
            }
            MfaManager.this.mfaRelay.accept(optionalAsOptional);
            return Unit.INSTANCE;
        }
    }

    public final void refresh() {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C284691(null), 3, null);
    }

    public static /* synthetic */ Object enableSmsMfa$default(MfaManager mfaManager, String str, UUID uuid, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            uuid = null;
        }
        return mfaManager.enableSmsMfa(str, uuid, continuation);
    }

    public final Object enableSmsMfa(String str, UUID uuid, Continuation<? super Unit> continuation) {
        Object objRequestSmsMfa = this.brokeback.requestSmsMfa(uuid, str, continuation);
        return objRequestSmsMfa == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRequestSmsMfa : Unit.INSTANCE;
    }

    public static /* synthetic */ Object verifySmsMfa$default(MfaManager mfaManager, String str, UUID uuid, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            uuid = null;
        }
        return mfaManager.verifySmsMfa(str, uuid, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object verifySmsMfa(String str, UUID uuid, Continuation<? super Mfa> continuation) {
        C284711 c284711;
        if (continuation instanceof C284711) {
            c284711 = (C284711) continuation;
            int i = c284711.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c284711.label = i - Integer.MIN_VALUE;
            } else {
                c284711 = new C284711(continuation);
            }
        }
        Object objVerifySmsMfa = c284711.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c284711.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objVerifySmsMfa);
            Brokeback brokeback = this.brokeback;
            c284711.label = 1;
            objVerifySmsMfa = brokeback.verifySmsMfa(uuid, str, c284711);
            if (objVerifySmsMfa == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objVerifySmsMfa);
        }
        this.mfaRelay.accept(Optional3.asOptional((Mfa) objVerifySmsMfa));
        return objVerifySmsMfa;
    }

    public static /* synthetic */ Object enableAppMfa$default(MfaManager mfaManager, UUID uuid, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = null;
        }
        return mfaManager.enableAppMfa(uuid, continuation);
    }

    public final Object enableAppMfa(UUID uuid, Continuation<? super Mfa.EnableAppMfaResponse> continuation) {
        return this.brokeback.requestAppMfa(uuid, continuation);
    }

    public final Object recoverAppMfa(String str, String str2, Continuation<? super Mfa.RecoverAppMfaResponse> continuation) {
        return this.brokeback.recoverAppMfa(str, str2, continuation);
    }

    public final Object recoverSmsMfa(UUID uuid, String str, String str2, Continuation<? super Mfa.RecoverSmsMfaResponse> continuation) {
        return this.sheriff.recoverSmsMfa(uuid, str, str2, continuation);
    }

    public static /* synthetic */ Object verifyAppMfa$default(MfaManager mfaManager, String str, UUID uuid, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            uuid = null;
        }
        return mfaManager.verifyAppMfa(str, uuid, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object verifyAppMfa(String str, UUID uuid, Continuation<? super Mfa> continuation) {
        C284701 c284701;
        if (continuation instanceof C284701) {
            c284701 = (C284701) continuation;
            int i = c284701.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c284701.label = i - Integer.MIN_VALUE;
            } else {
                c284701 = new C284701(continuation);
            }
        }
        Object objVerifyAppMfa = c284701.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c284701.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objVerifyAppMfa);
            Brokeback brokeback = this.brokeback;
            c284701.label = 1;
            objVerifyAppMfa = brokeback.verifyAppMfa(uuid, str, c284701);
            if (objVerifyAppMfa == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objVerifyAppMfa);
        }
        this.mfaRelay.accept(Optional3.asOptional((Mfa) objVerifyAppMfa));
        return objVerifyAppMfa;
    }
}
