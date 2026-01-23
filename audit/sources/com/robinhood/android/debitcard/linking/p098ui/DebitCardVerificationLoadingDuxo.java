package com.robinhood.android.debitcard.linking.p098ui;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.data.store.logging.utils.EventLoggers;
import com.robinhood.android.data.store.logging.utils.LoggingUtils4;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrument;
import com.robinhood.models.api.sortinghat.SortingHatApi;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.NetworkContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentStore;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* compiled from: DebitCardVerificationLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010!\u001a\u00020\"H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationLoadingDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationLoadingViewState;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "debitCardInstrumentStore", "Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;", "sortingHatApi", "Lcom/robinhood/models/api/sortinghat/SortingHatApi;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;Lcom/robinhood/models/api/sortinghat/SortingHatApi;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "verificationCode", "", "getVerificationCode", "()Ljava/lang/String;", "setVerificationCode", "(Ljava/lang/String;)V", "debitCardInstrumentId", "Ljava/util/UUID;", "getDebitCardInstrumentId", "()Ljava/util/UUID;", "setDebitCardInstrumentId", "(Ljava/util/UUID;)V", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "setLoggingContext", "(Lcom/robinhood/rosetta/eventlogging/Context;)V", "onStart", "", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class DebitCardVerificationLoadingDuxo extends BaseDuxo4<DebitCardVerificationLoadingViewState> {
    public static final int $stable = 8;
    public UUID debitCardInstrumentId;
    private final DebitCardInstrumentStore debitCardInstrumentStore;
    private final EventLogger eventLogger;
    private final ExperimentsStore experimentsStore;
    public Context loggingContext;
    private final SortingHatApi sortingHatApi;
    public String verificationCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebitCardVerificationLoadingDuxo(EventLogger eventLogger, DebitCardInstrumentStore debitCardInstrumentStore, SortingHatApi sortingHatApi, ExperimentsStore experimentsStore, DuxoBundle duxoBundle) {
        super(new DebitCardVerificationLoadingViewState(null, null, false, 7, null), duxoBundle);
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(debitCardInstrumentStore, "debitCardInstrumentStore");
        Intrinsics.checkNotNullParameter(sortingHatApi, "sortingHatApi");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.eventLogger = eventLogger;
        this.debitCardInstrumentStore = debitCardInstrumentStore;
        this.sortingHatApi = sortingHatApi;
        this.experimentsStore = experimentsStore;
    }

    public final String getVerificationCode() {
        String str = this.verificationCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("verificationCode");
        return null;
    }

    public final void setVerificationCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.verificationCode = str;
    }

    public final UUID getDebitCardInstrumentId() {
        UUID uuid = this.debitCardInstrumentId;
        if (uuid != null) {
            return uuid;
        }
        Intrinsics.throwUninitializedPropertyAccessException("debitCardInstrumentId");
        return null;
    }

    public final void setDebitCardInstrumentId(UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "<set-?>");
        this.debitCardInstrumentId = uuid;
    }

    public final Context getLoggingContext() {
        Context context = this.loggingContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException(RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT);
        return null;
    }

    public final void setLoggingContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.loggingContext = context;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, EventLoggers.logResponseMetadataAndUnwrap(this.eventLogger, this.debitCardInstrumentStore.verifyDebitCard(false, getDebitCardInstrumentId(), getVerificationCode()), new Function1() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationLoadingDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DebitCardVerificationLoadingDuxo.onStart$lambda$0(this.f$0, (Response) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationLoadingDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DebitCardVerificationLoadingDuxo.onStart$lambda$1(this.f$0, (Throwable) obj);
            }
        }), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationLoadingDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DebitCardVerificationLoadingDuxo.onStart$lambda$2(this.f$0, (ApiPaymentInstrument) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationLoadingDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DebitCardVerificationLoadingDuxo.onStart$lambda$3(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventData onStart$lambda$0(DebitCardVerificationLoadingDuxo debitCardVerificationLoadingDuxo, Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return new UserInteractionEventData(UserInteractionEventData.EventType.NETWORK, null, null, null, Context.copy$default(debitCardVerificationLoadingDuxo.getLoggingContext(), 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LoggingUtils4.toNetworkContext((Response<?>) response, NetworkContext.Tag.VERIFY_DEBIT_CARD), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -8193, -1, -1, -1, -1, 16383, null), null, null, 110, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventData onStart$lambda$1(DebitCardVerificationLoadingDuxo debitCardVerificationLoadingDuxo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return new UserInteractionEventData(UserInteractionEventData.EventType.NETWORK, null, null, null, Context.copy$default(debitCardVerificationLoadingDuxo.getLoggingContext(), 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LoggingUtils4.toNetworkContext(throwable, NetworkContext.Tag.VERIFY_DEBIT_CARD), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -8193, -1, -1, -1, -1, 16383, null), null, null, 110, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(DebitCardVerificationLoadingDuxo debitCardVerificationLoadingDuxo, ApiPaymentInstrument debitCardId) {
        Intrinsics.checkNotNullParameter(debitCardId, "debitCardId");
        debitCardVerificationLoadingDuxo.applyMutation(new DebitCardVerificationLoadingDuxo2(debitCardId, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(DebitCardVerificationLoadingDuxo debitCardVerificationLoadingDuxo, Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        debitCardVerificationLoadingDuxo.applyMutation(new DebitCardVerificationLoadingDuxo3(error, null));
        return Unit.INSTANCE;
    }
}
