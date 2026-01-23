package io.ktor.utils.p478io.jvm.javaio;

import io.ktor.utils.p478io.ByteReadChannelJVM;
import java.io.InputStream;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* compiled from: Blocking.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\"#\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, m3636d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "Lkotlinx/coroutines/Job;", "parent", "Ljava/io/InputStream;", "toInputStream", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlinx/coroutines/Job;)Ljava/io/InputStream;", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "ADAPTER_LOGGER$delegate", "Lkotlin/Lazy;", "getADAPTER_LOGGER", "()Lorg/slf4j/Logger;", "ADAPTER_LOGGER", "", "CloseToken", "Ljava/lang/Object;", "FlushToken", "ktor-io"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class BlockingKt {
    private static final Lazy ADAPTER_LOGGER$delegate = LazyKt.lazy(new Function0<Logger>() { // from class: io.ktor.utils.io.jvm.javaio.BlockingKt$ADAPTER_LOGGER$2
        @Override // kotlin.jvm.functions.Function0
        public final Logger invoke() {
            return LoggerFactory.getLogger((Class<?>) BlockingAdapter.class);
        }
    });
    private static final Object CloseToken = new Object();
    private static final Object FlushToken = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Logger getADAPTER_LOGGER() {
        return (Logger) ADAPTER_LOGGER$delegate.getValue();
    }

    public static final InputStream toInputStream(ByteReadChannelJVM byteReadChannelJVM, Job job) {
        Intrinsics.checkNotNullParameter(byteReadChannelJVM, "<this>");
        return new InputAdapter(job, byteReadChannelJVM);
    }

    public static /* synthetic */ InputStream toInputStream$default(ByteReadChannelJVM byteReadChannelJVM, Job job, int i, Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return toInputStream(byteReadChannelJVM, job);
    }
}
