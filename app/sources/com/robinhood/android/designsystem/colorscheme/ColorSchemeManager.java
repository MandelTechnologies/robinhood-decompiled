package com.robinhood.android.designsystem.colorscheme;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.core.content.res.TypedArray2;
import com.robinhood.android.designsystem.style.ColorScheme;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.utils.extensions.KProperties2;
import com.robinhood.utils.extensions.ObservablesAndroid;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.rxkotlin.Observables;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty3;

/* compiled from: ColorSchemeManager.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0019\u001a\u00020\u001a2\b\b\u0001\u0010\u001b\u001a\u00020\u001aH\u0007JA\u0010\u001c\u001a\u0002H\u001d\"\b\b\u0000\u0010\u001d*\u00020\u00012\b\b\u0001\u0010\u001b\u001a\u00020\u001a2\u001d\u0010\u001e\u001a\u0019\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u0002H\u001d0\u001f¢\u0006\u0002\b!H\u0083\b¢\u0006\u0002\u0010\"R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR+\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R#\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "", "app", "Landroid/app/Application;", "preference", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/designsystem/style/ColorScheme;", "<init>", "(Landroid/app/Application;Lcom/robinhood/prefs/EnumPreference;)V", "getPreference", "()Lcom/robinhood/prefs/EnumPreference;", "<set-?>", "colorScheme", "getColorScheme", "()Lcom/robinhood/android/designsystem/style/ColorScheme;", "setColorScheme", "(Lcom/robinhood/android/designsystem/style/ColorScheme;)V", "colorScheme$delegate", "Lkotlin/reflect/KMutableProperty0;", "changes", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "getChanges", "()Lio/reactivex/Observable;", "getColor", "", "attributeResId", "getResource", "T", "get", "Lkotlin/Function2;", "Landroid/content/res/TypedArray;", "Lkotlin/ExtensionFunctionType;", "(ILkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "lib-design-system-color-scheme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class ColorSchemeManager {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(ColorSchemeManager.class, "colorScheme", "getColorScheme()Lcom/robinhood/android/designsystem/style/ColorScheme;", 0))};
    private final Application app;
    private final Observable<Tuples2<ColorScheme, Boolean>> changes;

    /* renamed from: colorScheme$delegate, reason: from kotlin metadata */
    private final KProperty3 colorScheme;
    private final EnumPreference<ColorScheme> preference;

    public ColorSchemeManager(Application app, final EnumPreference<ColorScheme> preference) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(preference, "preference");
        this.app = app;
        this.preference = preference;
        this.colorScheme = new MutablePropertyReference0Impl(preference) { // from class: com.robinhood.android.designsystem.colorscheme.ColorSchemeManager$colorScheme$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return ((EnumPreference) this.receiver).getValue();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                ((EnumPreference) this.receiver).setValue((Enum) obj);
            }
        };
        Observables observables = Observables.INSTANCE;
        ObservableSource changes = preference.getChanges();
        Observable observableJust = Observable.just(Boolean.TRUE, Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        this.changes = ObservablesAndroid.observeOnFastPath(observables.combineLatest(changes, observableJust));
    }

    public final EnumPreference<ColorScheme> getPreference() {
        return this.preference;
    }

    public final ColorScheme getColorScheme() {
        return (ColorScheme) KProperties2.getValue(this.colorScheme, this, (KProperty<?>) $$delegatedProperties[0]);
    }

    public final void setColorScheme(ColorScheme colorScheme) {
        Intrinsics.checkNotNullParameter(colorScheme, "<set-?>");
        KProperties2.setValue((KProperty3<ColorScheme>) this.colorScheme, this, (KProperty<?>) $$delegatedProperties[0], colorScheme);
    }

    public final Observable<Tuples2<ColorScheme, Boolean>> getChanges() {
        return this.changes;
    }

    @SuppressLint({"Recycle"})
    private final <T> T getResource(int attributeResId, Function2<? super TypedArray, ? super Integer, ? extends T> get) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = this.app.obtainStyledAttributes(getColorScheme().getStyleReference().getResId(), new int[]{attributeResId});
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        T tInvoke = get.invoke(typedArrayObtainStyledAttributes, 0);
        typedArrayObtainStyledAttributes.recycle();
        return tInvoke;
    }

    public final int getColor(int attributeResId) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = this.app.obtainStyledAttributes(getColorScheme().getStyleReference().getResId(), new int[]{attributeResId});
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int colorOrThrow = TypedArray2.getColorOrThrow(typedArrayObtainStyledAttributes, 0);
        typedArrayObtainStyledAttributes.recycle();
        return colorOrThrow;
    }
}
