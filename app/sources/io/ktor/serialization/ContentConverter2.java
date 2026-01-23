package io.ktor.serialization;

import com.truelayer.payments.analytics.sender.EventSenderWorker;
import io.ktor.http.ContentTypes2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContentConverter.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JB\u0010\u0002\u001a\u00020\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u0002H\u00042\u0019\b\u0002\u0010\t\u001a\u0013\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0002\b\u000bH&¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"Lio/ktor/serialization/Configuration;", "", "register", "", "T", "Lio/ktor/serialization/ContentConverter;", "contentType", "Lio/ktor/http/ContentType;", "converter", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Lio/ktor/http/ContentType;Lio/ktor/serialization/ContentConverter;Lkotlin/jvm/functions/Function1;)V", "ktor-serialization"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.serialization.Configuration, reason: use source file name */
/* loaded from: classes14.dex */
public interface ContentConverter2 {
    <T extends ContentConverter> void register(ContentTypes2 contentType, T converter, Function1<? super T, Unit> configuration);

    /* compiled from: ContentConverter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* renamed from: io.ktor.serialization.Configuration$DefaultImpls */
    public static final class DefaultImpls {
        public static /* synthetic */ void register$default(ContentConverter2 contentConverter2, ContentTypes2 contentTypes2, ContentConverter contentConverter, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
            }
            if ((i & 4) != 0) {
                function1 = new Function1() { // from class: io.ktor.serialization.Configuration.register.1
                    public final void invoke(ContentConverter contentConverter3) {
                        Intrinsics.checkNotNullParameter(contentConverter3, "$this$null");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((ContentConverter) obj2);
                        return Unit.INSTANCE;
                    }
                };
            }
            contentConverter2.register(contentTypes2, contentConverter, function1);
        }
    }
}
