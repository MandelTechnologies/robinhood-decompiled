package com.twilio.conversations;

import com.plaid.internal.EnumC7081g;
import com.twilio.util.ErrorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MediaUploadListener.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u008b\u0001\u0010\u0000\u001a\u00020\u00012\u000e\b\u0006\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032#\b\u0006\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00040\u00062#\b\u0006\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00040\u00062#\b\u0006\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00040\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, m3636d2 = {"MediaUploadListener", "Lcom/twilio/conversations/MediaUploadListener;", "onStarted", "Lkotlin/Function0;", "", "onProgress", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "bytesSent", "onCompleted", "", "mediaSid", "onFailed", "Lcom/twilio/util/ErrorInfo;", "errorInfo", "convo-android_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.twilio.conversations.MediaUploadListenerKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class MediaUploadListener3 {
    public static /* synthetic */ MediaUploadListener MediaUploadListener$default(Function0 onStarted, Function1 onProgress, Function1 onCompleted, Function1 onFailed, int i, Object obj) {
        if ((i & 1) != 0) {
            onStarted = new Function0<Unit>() { // from class: com.twilio.conversations.MediaUploadListenerKt.MediaUploadListener.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 2) != 0) {
            onProgress = new Function1<Long, Unit>() { // from class: com.twilio.conversations.MediaUploadListenerKt.MediaUploadListener.2
                public final void invoke(long j) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                    invoke(l.longValue());
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 4) != 0) {
            onCompleted = new Function1<String, Unit>() { // from class: com.twilio.conversations.MediaUploadListenerKt.MediaUploadListener.3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 8) != 0) {
            onFailed = new Function1<ErrorInfo, Unit>() { // from class: com.twilio.conversations.MediaUploadListenerKt.MediaUploadListener.4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ErrorInfo it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ErrorInfo errorInfo) {
                    invoke2(errorInfo);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(onStarted, "onStarted");
        Intrinsics.checkNotNullParameter(onProgress, "onProgress");
        Intrinsics.checkNotNullParameter(onCompleted, "onCompleted");
        Intrinsics.checkNotNullParameter(onFailed, "onFailed");
        return new C433335(onStarted, onProgress, onCompleted, onFailed);
    }

    /* compiled from: MediaUploadListener.kt */
    @Metadata(m3635d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, m3636d2 = {"com/twilio/conversations/MediaUploadListenerKt$MediaUploadListener$5", "Lcom/twilio/conversations/MediaUploadListener;", "onStarted", "", "onProgress", "bytesSent", "", "onCompleted", "mediaSid", "", "onFailed", "errorInfo", "Lcom/twilio/util/ErrorInfo;", "convo-android_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    /* renamed from: com.twilio.conversations.MediaUploadListenerKt$MediaUploadListener$5 */
    public static final class C433335 implements MediaUploadListener {
        final /* synthetic */ Function1<String, Unit> $onCompleted;
        final /* synthetic */ Function1<ErrorInfo, Unit> $onFailed;
        final /* synthetic */ Function1<Long, Unit> $onProgress;
        final /* synthetic */ Function0<Unit> $onStarted;

        /* JADX WARN: Multi-variable type inference failed */
        public C433335(Function0<Unit> function0, Function1<? super Long, Unit> function1, Function1<? super String, Unit> function12, Function1<? super ErrorInfo, Unit> function13) {
            this.$onStarted = function0;
            this.$onProgress = function1;
            this.$onCompleted = function12;
            this.$onFailed = function13;
        }

        @Override // com.twilio.conversations.MediaUploadListener
        public void onStarted() {
            this.$onStarted.invoke();
        }

        @Override // com.twilio.conversations.MediaUploadListener
        public void onProgress(long bytesSent) {
            this.$onProgress.invoke(Long.valueOf(bytesSent));
        }

        @Override // com.twilio.conversations.MediaUploadListener
        public void onCompleted(String mediaSid) {
            Intrinsics.checkNotNullParameter(mediaSid, "mediaSid");
            this.$onCompleted.invoke(mediaSid);
        }

        @Override // com.twilio.conversations.MediaUploadListener
        public void onFailed(ErrorInfo errorInfo) {
            Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
            this.$onFailed.invoke(errorInfo);
        }
    }

    public static final MediaUploadListener MediaUploadListener(Function0<Unit> onStarted, Function1<? super Long, Unit> onProgress, Function1<? super String, Unit> onCompleted, Function1<? super ErrorInfo, Unit> onFailed) {
        Intrinsics.checkNotNullParameter(onStarted, "onStarted");
        Intrinsics.checkNotNullParameter(onProgress, "onProgress");
        Intrinsics.checkNotNullParameter(onCompleted, "onCompleted");
        Intrinsics.checkNotNullParameter(onFailed, "onFailed");
        return new C433335(onStarted, onProgress, onCompleted, onFailed);
    }
}
