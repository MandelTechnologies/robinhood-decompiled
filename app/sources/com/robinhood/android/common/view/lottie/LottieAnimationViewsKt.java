package com.robinhood.android.common.view.lottie;

import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.SimpleLottieValueCallback;
import com.plaid.internal.EnumC7081g;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LottieAnimationViews.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u001aT\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00062\u001c\b\u0004\u0010\t\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u000b\u0012\u0004\u0012\u0002H\u00020\nH\u0086\bø\u0001\u0000\u001a_\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\f\"\u0002H\u00022\u001c\b\u0004\u0010\t\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u000b\u0012\u0004\u0012\u0002H\u00020\nH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, m3636d2 = {"addValueCallbacks", "", "T", "", "Lcom/airbnb/lottie/LottieAnimationView;", "keyPaths", "", "Lcom/airbnb/lottie/model/KeyPath;", "properties", "callback", "Lkotlin/Function1;", "Lcom/airbnb/lottie/value/LottieFrameInfo;", "", "(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/Iterable;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LottieAnimationViewsKt {
    public static final <T> void addValueCallbacks(LottieAnimationView lottieAnimationView, Iterable<? extends KeyPath> keyPaths, Iterable<? extends T> properties, Function1<? super LottieFrameInfo<? extends T>, ? extends T> callback) {
        Intrinsics.checkNotNullParameter(lottieAnimationView, "<this>");
        Intrinsics.checkNotNullParameter(keyPaths, "keyPaths");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(callback, "callback");
        for (KeyPath keyPath : keyPaths) {
            Iterator<? extends T> it = properties.iterator();
            while (it.hasNext()) {
                lottieAnimationView.addValueCallback(keyPath, (KeyPath) it.next(), (SimpleLottieValueCallback<KeyPath>) new C118921(callback));
            }
        }
    }

    /* compiled from: LottieAnimationViews.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    /* renamed from: com.robinhood.android.common.view.lottie.LottieAnimationViewsKt$addValueCallbacks$1 */
    public static final class C118921<T> implements SimpleLottieValueCallback {
        final /* synthetic */ Function1<LottieFrameInfo<? extends T>, T> $callback;

        /* JADX WARN: Multi-variable type inference failed */
        public C118921(Function1<? super LottieFrameInfo<? extends T>, ? extends T> function1) {
            this.$callback = function1;
        }

        @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
        public final T getValue(LottieFrameInfo<T> lottieFrameInfo) {
            Function1<LottieFrameInfo<? extends T>, T> function1 = this.$callback;
            Intrinsics.checkNotNull(lottieFrameInfo);
            return function1.invoke(lottieFrameInfo);
        }
    }

    public static final <T> void addValueCallbacks(LottieAnimationView lottieAnimationView, Iterable<? extends KeyPath> keyPaths, T[] properties, Function1<? super LottieFrameInfo<? extends T>, ? extends T> callback) {
        Intrinsics.checkNotNullParameter(lottieAnimationView, "<this>");
        Intrinsics.checkNotNullParameter(keyPaths, "keyPaths");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Iterable iterableAsIterable = ArraysKt.asIterable(properties);
        for (KeyPath keyPath : keyPaths) {
            Iterator<T> it = iterableAsIterable.iterator();
            while (it.hasNext()) {
                lottieAnimationView.addValueCallback(keyPath, (KeyPath) it.next(), (SimpleLottieValueCallback<KeyPath>) new C118921(callback));
            }
        }
    }
}
