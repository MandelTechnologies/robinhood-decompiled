package com.airbnb.lottie.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LottieDynamicProperties.kt */
@Metadata(m3635d1 = {"\u00001\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001\u0012\u001a+\u0010\u0004\u001a\u00020\u00032\u001a\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000\"\u0006\u0012\u0002\b\u00030\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a?\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00002\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0000\"\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a@\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u0006*#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00028\u00000\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016²\u00063\u0010\u0015\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00068\nX\u008a\u0084\u0002"}, m3636d2 = {"", "Lcom/airbnb/lottie/compose/LottieDynamicProperty;", "properties", "Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "rememberLottieDynamicProperties", "([Lcom/airbnb/lottie/compose/LottieDynamicProperty;Landroidx/compose/runtime/Composer;I)Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "T", "property", "value", "", "keyPath", "rememberLottieDynamicProperty", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lcom/airbnb/lottie/compose/LottieDynamicProperty;", "Lkotlin/Function1;", "Lcom/airbnb/lottie/value/LottieFrameInfo;", "Lkotlin/ParameterName;", "name", "frameInfo", "com/airbnb/lottie/compose/LottieDynamicPropertiesKt$toValueCallback$1", "toValueCallback", "(Lkotlin/jvm/functions/Function1;)Lcom/airbnb/lottie/compose/LottieDynamicPropertiesKt$toValueCallback$1;", "callbackState", "lottie-compose_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.airbnb.lottie.compose.LottieDynamicPropertiesKt, reason: use source file name */
/* loaded from: classes16.dex */
public final class LottieDynamicProperties2 {
    public static final LottieDynamicProperties rememberLottieDynamicProperties(LottieDynamicProperties3<?>[] properties, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        composer.startReplaceableGroup(-395574495);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-395574495, i, -1, "com.airbnb.lottie.compose.rememberLottieDynamicProperties (LottieDynamicProperties.kt:27)");
        }
        int iHashCode = Arrays.hashCode(properties);
        composer.startReplaceableGroup(34468001);
        boolean zChanged = composer.changed(iHashCode);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new LottieDynamicProperties(ArraysKt.toList(properties));
            composer.updateRememberedValue(objRememberedValue);
        }
        LottieDynamicProperties lottieDynamicProperties = (LottieDynamicProperties) objRememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lottieDynamicProperties;
    }

    public static final <T> LottieDynamicProperties3<T> rememberLottieDynamicProperty(T t, T t2, String[] keyPath, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(keyPath, "keyPath");
        composer.startReplaceableGroup(-1788530187);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1788530187, i, -1, "com.airbnb.lottie.compose.rememberLottieDynamicProperty (LottieDynamicProperties.kt:46)");
        }
        composer.startReplaceableGroup(1613443961);
        boolean zChanged = composer.changed(keyPath);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new KeyPath((String[]) Arrays.copyOf(keyPath, keyPath.length));
            composer.updateRememberedValue(objRememberedValue);
        }
        KeyPath keyPath2 = (KeyPath) objRememberedValue;
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(1613444012);
        boolean zChanged2 = composer.changed(keyPath2) | ((((i & 14) ^ 6) > 4 && composer.changed(t)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(t2)) || (i & 48) == 32);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new LottieDynamicProperties3(t, keyPath2, t2);
            composer.updateRememberedValue(objRememberedValue2);
        }
        LottieDynamicProperties3<T> lottieDynamicProperties3 = (LottieDynamicProperties3) objRememberedValue2;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lottieDynamicProperties3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.airbnb.lottie.compose.LottieDynamicPropertiesKt$toValueCallback$1] */
    public static final C47771 toValueCallback(final Function1 function1) {
        return new LottieValueCallback<Object>() { // from class: com.airbnb.lottie.compose.LottieDynamicPropertiesKt.toValueCallback.1
            @Override // com.airbnb.lottie.value.LottieValueCallback
            public Object getValue(LottieFrameInfo<Object> frameInfo) {
                Intrinsics.checkNotNullParameter(frameInfo, "frameInfo");
                return function1.invoke(frameInfo);
            }
        };
    }
}
