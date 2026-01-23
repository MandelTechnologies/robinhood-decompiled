package com.robinhood.shared.crypto.acats.reviewassets;

import android.content.res.Resources;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsDuxo2;
import com.robinhood.utils.extensions.Throwables;
import crypto_portkey.service.p443v1.MigrationService;
import crypto_portkey.service.p443v1.ProcessMigrationAuthedRequestDto;
import crypto_portkey.service.p443v1.ProcessMigrationAuthedResponseDto;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Clock;

/* compiled from: MigrationReviewAssetsDuxo.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B9\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m3636d2 = {"Lcom/robinhood/shared/crypto/acats/reviewassets/MigrationReviewAssetsDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/crypto/acats/reviewassets/MigrationReviewAssetsDataState;", "Lcom/robinhood/shared/crypto/acats/reviewassets/MigrationReviewAssetsViewState;", "Lcom/robinhood/shared/crypto/acats/reviewassets/MigrationReviewAssetsEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroid/content/res/Resources;", "resources", "Lcom/robinhood/shared/crypto/acats/reviewassets/MigrationReviewAssetsStateProvider;", "stateProvider", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "j$/time/Clock", Card.Icon.CLOCK, "Lcrypto_portkey/service/v1/MigrationService;", "migrationService", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Landroid/content/res/Resources;Lcom/robinhood/shared/crypto/acats/reviewassets/MigrationReviewAssetsStateProvider;Landroidx/lifecycle/SavedStateHandle;Lj$/time/Clock;Lcrypto_portkey/service/v1/MigrationService;)V", "", "onCreate", "()V", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Lj$/time/Clock;", "Lcrypto_portkey/service/v1/MigrationService;", "", "refId", "Ljava/lang/String;", "getRefId", "()Ljava/lang/String;", "feature-acats_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class MigrationReviewAssetsDuxo extends BaseDuxo3<MigrationReviewAssetsDataState, MigrationReviewAssetsViewState, MigrationReviewAssetsDuxo2> implements HasSavedState {
    public static final int $stable = 8;
    private final Clock clock;
    private final MigrationService migrationService;
    private final String refId;
    private final SavedStateHandle savedStateHandle;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MigrationReviewAssetsDuxo(DuxoBundle duxoBundle, Resources resources, MigrationReviewAssetsDuxo3 stateProvider, SavedStateHandle savedStateHandle, Clock clock, MigrationService migrationService) {
        super(new MigrationReviewAssetsDataState(null, resources, 1, 0 == true ? 1 : 0), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(migrationService, "migrationService");
        this.savedStateHandle = savedStateHandle;
        this.clock = clock;
        this.migrationService = migrationService;
        String string2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        this.refId = string2;
    }

    public final String getRefId() {
        return this.refId;
    }

    /* compiled from: MigrationReviewAssetsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsDuxo$onCreate$1", m3645f = "MigrationReviewAssetsDuxo.kt", m3646l = {39}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsDuxo$onCreate$1 */
    static final class C375831 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C375831(Continuation<? super C375831> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MigrationReviewAssetsDuxo.this.new C375831(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C375831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Exception {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MigrationService migrationService = MigrationReviewAssetsDuxo.this.migrationService;
                    ProcessMigrationAuthedRequestDto processMigrationAuthedRequestDto = new ProcessMigrationAuthedRequestDto(MigrationReviewAssetsDuxo.this.getRefId(), MigrationReviewAssetsDuxo.this.clock.millis(), "balance_request", null, "bitstamp", 8, null);
                    this.label = 1;
                    obj = migrationService.ProcessMigrationAuthed(processMigrationAuthedRequestDto, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ProcessMigrationAuthedResponseDto processMigrationAuthedResponseDto = (ProcessMigrationAuthedResponseDto) obj;
                MigrationReviewAssetsDuxo.this.applyMutation(new AnonymousClass1(processMigrationAuthedResponseDto, null));
                if (Intrinsics.areEqual(processMigrationAuthedResponseDto.getSuccess(), boxing.boxBoolean(false)) && processMigrationAuthedResponseDto.getError_message() != null) {
                    MigrationReviewAssetsDuxo migrationReviewAssetsDuxo = MigrationReviewAssetsDuxo.this;
                    String error_message = processMigrationAuthedResponseDto.getError_message();
                    if (error_message == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    migrationReviewAssetsDuxo.submit(new MigrationReviewAssetsDuxo2.ErrorDialog(error_message));
                }
            } catch (Exception e) {
                if (Throwables.isNetworkRelated(e)) {
                    MigrationReviewAssetsDuxo.this.submit(new MigrationReviewAssetsDuxo2.Error(e));
                } else {
                    throw e;
                }
            }
            return Unit.INSTANCE;
        }

        /* compiled from: MigrationReviewAssetsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/acats/reviewassets/MigrationReviewAssetsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsDuxo$onCreate$1$1", m3645f = "MigrationReviewAssetsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MigrationReviewAssetsDataState, Continuation<? super MigrationReviewAssetsDataState>, Object> {
            final /* synthetic */ ProcessMigrationAuthedResponseDto $response;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ProcessMigrationAuthedResponseDto processMigrationAuthedResponseDto, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$response = processMigrationAuthedResponseDto;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$response, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MigrationReviewAssetsDataState migrationReviewAssetsDataState, Continuation<? super MigrationReviewAssetsDataState> continuation) {
                return ((AnonymousClass1) create(migrationReviewAssetsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return MigrationReviewAssetsDataState.copy$default((MigrationReviewAssetsDataState) this.L$0, this.$response, null, 2, null);
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C375831(null));
    }
}
