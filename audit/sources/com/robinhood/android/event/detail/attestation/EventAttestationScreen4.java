package com.robinhood.android.event.detail.attestation;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.robinhood.android.agreements.models.ApiAgreement;
import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.event.detail.attestation.EventAttestationDuxo5;
import java.io.IOException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import okhttp3.HttpUrl;

/* compiled from: EventAttestationScreen.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/event/detail/attestation/ViewStateParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/android/event/detail/attestation/EventAttestationViewState;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.detail.attestation.ViewStateParameterProvider, reason: use source file name */
/* loaded from: classes3.dex */
final class EventAttestationScreen4 implements PreviewParameterProvider<EventAttestationDuxo5> {
    private final Sequence<EventAttestationDuxo5> values = SequencesKt.plus(SequencesKt.sequenceOf(EventAttestationDuxo5.Loading.INSTANCE, new EventAttestationDuxo5.Error(new IOException())), SequencesKt.map(SequencesKt.sequenceOf(Boolean.FALSE, Boolean.TRUE), new Function1() { // from class: com.robinhood.android.event.detail.attestation.ViewStateParameterProvider$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return EventAttestationScreen4.values$lambda$0(((Boolean) obj).booleanValue());
        }
    }));

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<EventAttestationDuxo5> getValues() {
        return this.values;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EventAttestationDuxo5.Loaded values$lambda$0(boolean z) {
        return new EventAttestationDuxo5.Loaded(new UiAgreementWithContent(new ApiAgreement(new UUID(0L, 0L), HttpUrl.INSTANCE.get("https://127.0.0.1")), EventAttestationScreen.loremIpsum()), z);
    }
}
