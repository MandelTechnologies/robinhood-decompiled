package com.truelayer.payments.core.network.experience;

import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.experience.localisation.Legals;
import com.truelayer.payments.core.domain.experience.localisation.LocalisedText;
import com.truelayer.payments.core.domain.experience.localisation.UserPriming;
import com.truelayer.payments.core.domain.payments.PaymentContext;
import com.truelayer.payments.core.domain.utils.Outcome;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.SharedFlow;

/* compiled from: TranslationProvider.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006H&J:\u0010\u0016\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006H¦@¢\u0006\u0002\u0010\u0017J \u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001aH&J2\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001aH¦@¢\u0006\u0002\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0006H&J*\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0017R0\u0010\u0002\u001a \u0012\u001c\u0012\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0004\u0012\u00020\b0\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\nR$\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\n¨\u0006 "}, m3636d2 = {"Lcom/truelayer/payments/core/network/experience/TranslationProvider;", "", "inputTranslations", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "", "", "Lcom/truelayer/payments/core/domain/experience/localisation/LocalisedText;", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "getInputTranslations", "()Lkotlinx/coroutines/flow/SharedFlow;", "legalTranslations", "Lcom/truelayer/payments/core/domain/experience/localisation/Legals;", "getLegalTranslations", "primingTranslations", "Lcom/truelayer/payments/core/domain/experience/localisation/UserPriming;", "getPrimingTranslations", "updateInputs", "", "paymentContext", "Lcom/truelayer/payments/core/domain/payments/PaymentContext;", "countryCode", "updateInputsSync", "(Lcom/truelayer/payments/core/domain/payments/PaymentContext;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateLegals", "isSignupPlus", "", "updateLegalsSync", "(Lcom/truelayer/payments/core/domain/payments/PaymentContext;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePriming", "providerId", "updatePrimingSync", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface TranslationProvider {
    SharedFlow<Outcome<Map<String, LocalisedText>, CoreError>> getInputTranslations();

    SharedFlow<Outcome<Legals, CoreError>> getLegalTranslations();

    SharedFlow<Outcome<UserPriming, CoreError>> getPrimingTranslations();

    void updateInputs(PaymentContext paymentContext, String countryCode);

    Object updateInputsSync(PaymentContext paymentContext, String str, Continuation<? super Outcome<? extends Map<String, LocalisedText>, ? extends CoreError>> continuation);

    void updateLegals(PaymentContext paymentContext, String countryCode, boolean isSignupPlus);

    Object updateLegalsSync(PaymentContext paymentContext, String str, boolean z, Continuation<? super Outcome<Legals, ? extends CoreError>> continuation);

    void updatePriming(PaymentContext paymentContext, String providerId);

    Object updatePrimingSync(PaymentContext paymentContext, String str, Continuation<? super Outcome<? extends UserPriming, ? extends CoreError>> continuation);

    /* compiled from: TranslationProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void updateInputs$default(TranslationProvider translationProvider, PaymentContext paymentContext, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateInputs");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            translationProvider.updateInputs(paymentContext, str);
        }

        public static /* synthetic */ Object updateInputsSync$default(TranslationProvider translationProvider, PaymentContext paymentContext, String str, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateInputsSync");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            return translationProvider.updateInputsSync(paymentContext, str, continuation);
        }
    }
}
