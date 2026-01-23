package com.robinhood.android.odyssey.lib;

import android.R;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import com.robinhood.android.odyssey.lib.view.SdDivider;
import com.robinhood.scarlet.property.StyleProperty;
import com.robinhood.scarlet.property.StyleableProperty;
import com.robinhood.scarlet.transition.StylePropertyTransition;
import com.robinhood.scarlet.transition.attribute.ColorStateListAttributeTransition;
import com.robinhood.scarlet.util.resource.ResourceType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LibOdysseyTransitionsModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/LibOdysseyTransitionsModule;", "", "<init>", "()V", "provideSdDividerBackgroundTint", "Lcom/robinhood/scarlet/transition/StylePropertyTransition;", "resources", "Landroid/content/res/Resources;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class LibOdysseyTransitionsModule {
    public static final int $stable = 0;
    public static final LibOdysseyTransitionsModule INSTANCE = new LibOdysseyTransitionsModule();

    private LibOdysseyTransitionsModule() {
    }

    public final StylePropertyTransition<?, ?> provideSdDividerBackgroundTint(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorStateListAttributeTransition(StyleableProperty.INSTANCE.from(SdDivider.class, C226271.INSTANCE, C226282.INSTANCE, StyleProperty.INSTANCE.from(resources, R.attr.backgroundTint, ResourceType.COLOR_STATE_LIST.INSTANCE)), false, 2, null);
    }

    /* compiled from: LibOdysseyTransitionsModule.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.odyssey.lib.LibOdysseyTransitionsModule$provideSdDividerBackgroundTint$1 */
    /* synthetic */ class C226271 extends FunctionReferenceImpl implements Function1<SdDivider, ColorStateList> {
        public static final C226271 INSTANCE = new C226271();

        C226271() {
            super(1, SdDivider.class, "getBackgroundTintList", "getBackgroundTintList()Landroid/content/res/ColorStateList;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ColorStateList invoke(SdDivider p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return p0.getBackgroundTintList();
        }
    }

    /* compiled from: LibOdysseyTransitionsModule.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.odyssey.lib.LibOdysseyTransitionsModule$provideSdDividerBackgroundTint$2 */
    /* synthetic */ class C226282 extends FunctionReferenceImpl implements Function2<SdDivider, ColorStateList, Unit> {
        public static final C226282 INSTANCE = new C226282();

        C226282() {
            super(2, SdDivider.class, "setBackgroundTintList", "setBackgroundTintList(Landroid/content/res/ColorStateList;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(SdDivider sdDivider, ColorStateList colorStateList) {
            invoke2(sdDivider, colorStateList);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SdDivider p0, ColorStateList colorStateList) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            p0.setBackgroundTintList(colorStateList);
        }
    }
}
