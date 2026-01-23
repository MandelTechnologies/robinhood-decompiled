package io.ktor.client.request.forms;

import io.ktor.utils.p478io.ByteReadChannelJVM;
import io.ktor.utils.p478io.core.Input;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FormDataContent.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\f\rB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lio/ktor/client/request/forms/PreparedPart;", "", "headers", "", "size", "", "([BLjava/lang/Long;)V", "getHeaders", "()[B", "getSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "ChannelPart", "InputPart", "Lio/ktor/client/request/forms/PreparedPart$ChannelPart;", "Lio/ktor/client/request/forms/PreparedPart$InputPart;", "ktor-client-core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.client.request.forms.PreparedPart, reason: use source file name */
/* loaded from: classes14.dex */
abstract class FormDataContent4 {
    private final byte[] headers;
    private final Long size;

    public /* synthetic */ FormDataContent4(byte[] bArr, Long l, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, l);
    }

    private FormDataContent4(byte[] bArr, Long l) {
        this.headers = bArr;
        this.size = l;
    }

    public final byte[] getHeaders() {
        return this.headers;
    }

    public final Long getSize() {
        return this.size;
    }

    /* compiled from: FormDataContent.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lio/ktor/client/request/forms/PreparedPart$InputPart;", "Lio/ktor/client/request/forms/PreparedPart;", "headers", "", "provider", "Lkotlin/Function0;", "Lio/ktor/utils/io/core/Input;", "size", "", "([BLkotlin/jvm/functions/Function0;Ljava/lang/Long;)V", "getProvider", "()Lkotlin/jvm/functions/Function0;", "ktor-client-core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* renamed from: io.ktor.client.request.forms.PreparedPart$InputPart */
    public static final class InputPart extends FormDataContent4 {
        private final Function0<Input> provider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public InputPart(byte[] headers, Function0<? extends Input> provider, Long l) {
            super(headers, l, null);
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(provider, "provider");
            this.provider = provider;
        }

        public final Function0<Input> getProvider() {
            return this.provider;
        }
    }

    /* compiled from: FormDataContent.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lio/ktor/client/request/forms/PreparedPart$ChannelPart;", "Lio/ktor/client/request/forms/PreparedPart;", "headers", "", "provider", "Lkotlin/Function0;", "Lio/ktor/utils/io/ByteReadChannel;", "size", "", "([BLkotlin/jvm/functions/Function0;Ljava/lang/Long;)V", "getProvider", "()Lkotlin/jvm/functions/Function0;", "ktor-client-core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* renamed from: io.ktor.client.request.forms.PreparedPart$ChannelPart */
    public static final class ChannelPart extends FormDataContent4 {
        private final Function0<ByteReadChannelJVM> provider;

        public final Function0<ByteReadChannelJVM> getProvider() {
            return this.provider;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ChannelPart(byte[] headers, Function0<? extends ByteReadChannelJVM> provider, Long l) {
            super(headers, l, null);
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(provider, "provider");
            this.provider = provider;
        }
    }
}
