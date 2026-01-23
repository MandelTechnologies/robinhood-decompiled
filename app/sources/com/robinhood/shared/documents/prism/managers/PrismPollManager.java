package com.robinhood.shared.documents.prism.managers;

import com.robinhood.librobinhood.data.store.identi.DocumentRequestStore;
import com.robinhood.models.api.identi.ApiVideoSelfieVerificationResponse;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.shared.documents.prism.models.PrismVerificationResult;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.logging.CrashReporter;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: PrismPollManager.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/documents/prism/managers/PrismPollManager;", "", "Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;", "documentRequestStore", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;Lj$/time/Clock;)V", "Ljava/util/UUID;", "documentRequestId", "", "verificationTimeoutSeconds", "Lcom/robinhood/shared/documents/prism/models/PrismVerificationResult;", "pollForVerification", "(Ljava/util/UUID;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;", "Lj$/time/Clock;", "Companion", "feature-prism_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class PrismPollManager {
    private static final int MAX_POLL_ATTEMPTS = 60;
    private final Clock clock;
    private final DocumentRequestStore documentRequestStore;
    public static final int $stable = 8;

    /* compiled from: PrismPollManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiVideoSelfieVerificationResponse.State.values().length];
            try {
                iArr[ApiVideoSelfieVerificationResponse.State.VERIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiVideoSelfieVerificationResponse.State.DENIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiVideoSelfieVerificationResponse.State.PENDING_MANUAL_REVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiVideoSelfieVerificationResponse.State.PENDING_SYSTEM_CHECKS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: PrismPollManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.documents.prism.managers.PrismPollManager", m3645f = "PrismPollManager.kt", m3646l = {30}, m3647m = "pollForVerification")
    /* renamed from: com.robinhood.shared.documents.prism.managers.PrismPollManager$pollForVerification$1 */
    static final class C387771 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C387771(Continuation<? super C387771> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PrismPollManager.this.pollForVerification(null, 0, this);
        }
    }

    public PrismPollManager(DocumentRequestStore documentRequestStore, Clock clock) {
        Intrinsics.checkNotNullParameter(documentRequestStore, "documentRequestStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.documentRequestStore = documentRequestStore;
        this.clock = clock;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object pollForVerification(UUID uuid, int i, Continuation<? super PrismVerificationResult> continuation) {
        C387771 c387771;
        Instant instant;
        if (continuation instanceof C387771) {
            c387771 = (C387771) continuation;
            int i2 = c387771.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c387771.label = i2 - Integer.MIN_VALUE;
            } else {
                c387771 = new C387771(continuation);
            }
        }
        Object objFirstOrNull = c387771.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c387771.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objFirstOrNull);
            Instant instantPlusSeconds = this.clock.instant().plusSeconds(i);
            Flow flowDropWhile = FlowKt.dropWhile(FlowKt.take(this.documentRequestStore.pollVideoSelfieVerification(uuid), 60), new PrismPollManager2(null));
            c387771.L$0 = instantPlusSeconds;
            c387771.label = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowDropWhile, c387771);
            if (objFirstOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
            instant = instantPlusSeconds;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            instant = (Instant) c387771.L$0;
            ResultKt.throwOnFailure(objFirstOrNull);
        }
        ApiVideoSelfieVerificationResponse apiVideoSelfieVerificationResponse = (ApiVideoSelfieVerificationResponse) objFirstOrNull;
        if (this.clock.instant().compareTo(instant) >= 0) {
            CrashReporter.INSTANCE.log("Prism verification timed out");
            return PrismVerificationResult.TIMEOUT;
        }
        ApiVideoSelfieVerificationResponse.State state = apiVideoSelfieVerificationResponse != null ? apiVideoSelfieVerificationResponse.getState() : null;
        int i4 = state == null ? -1 : WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i4 != -1) {
            if (i4 == 1) {
                return PrismVerificationResult.SUCCESS;
            }
            if (i4 != 2 && i4 != 3) {
                if (i4 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                Preconditions.INSTANCE.failUnexpectedItemKotlin(state);
                throw new ExceptionsH();
            }
        }
        return PrismVerificationResult.FAILURE;
    }
}
