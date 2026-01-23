package com.twilio.conversations;

import com.twilio.conversations.MediaUploadListener3;
import com.twilio.util.ErrorInfo;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MediaUploadListener.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u000e\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J)\u0010\u0010\u001a\u00020\u00062!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00060\bJ)\u0010\u0014\u001a\u00020\u00062!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00060\bJ\u001a\u0010\u0016\u001a\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\bJ\b\u0010\u0017\u001a\u00020\u0018H\u0001R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/twilio/conversations/MediaUploadListenerBuilder;", "", "<init>", "()V", "_onStarted", "Lkotlin/Function0;", "", "_onProgress", "Lkotlin/Function1;", "", "_onCompleted", "", "_onFailed", "Lcom/twilio/util/ErrorInfo;", "onStarted", "block", "onProgress", "Lkotlin/ParameterName;", "name", "bytesSent", "onCompleted", "mediaSid", "onFailed", "build", "Lcom/twilio/conversations/MediaUploadListener;", "convo-android_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.twilio.conversations.MediaUploadListenerBuilder, reason: use source file name */
/* loaded from: classes12.dex */
public final class MediaUploadListener2 {
    private Function0<Unit> _onStarted = new Function0() { // from class: com.twilio.conversations.MediaUploadListenerBuilder$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Unit.INSTANCE;
        }
    };
    private Function1<? super Long, Unit> _onProgress = new Function1() { // from class: com.twilio.conversations.MediaUploadListenerBuilder$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return MediaUploadListener2._onProgress$lambda$1(((Long) obj).longValue());
        }
    };
    private Function1<? super String, Unit> _onCompleted = new Function1() { // from class: com.twilio.conversations.MediaUploadListenerBuilder$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return MediaUploadListener2._onCompleted$lambda$2((String) obj);
        }
    };
    private Function1<? super ErrorInfo, Unit> _onFailed = new Function1() { // from class: com.twilio.conversations.MediaUploadListenerBuilder$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return MediaUploadListener2._onFailed$lambda$3((ErrorInfo) obj);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _onProgress$lambda$1(long j) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _onCompleted$lambda$2(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _onFailed$lambda$3(ErrorInfo it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final void onStarted(Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this._onStarted = block;
    }

    public final void onProgress(Function1<? super Long, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this._onProgress = block;
    }

    public final void onCompleted(Function1<? super String, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this._onCompleted = block;
    }

    public final void onFailed(Function1<? super ErrorInfo, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this._onFailed = block;
    }

    @PublishedApi
    public final MediaUploadListener build() {
        return new MediaUploadListener3.C433335(this._onStarted, this._onProgress, this._onCompleted, this._onFailed);
    }
}
