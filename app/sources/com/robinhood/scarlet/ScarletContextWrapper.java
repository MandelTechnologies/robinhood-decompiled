package com.robinhood.scarlet;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.StyleResource;
import com.robinhood.utils.extensions.ContextSystemServices;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScarletContextWrapper.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B-\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0019H\u0016J\f\u0010\u001a\u001a\u00060\u001bR\u00020\u001cH\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/scarlet/ScarletContextWrapper;", "Landroid/content/ContextWrapper;", "base", "Landroid/content/Context;", "animationMode", "Lcom/robinhood/scarlet/ScarletManager$AnimationMode;", "rootOverlay", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "Lcom/robinhood/scarlet/util/resource/StyleResource;", "<init>", "(Landroid/content/Context;Lcom/robinhood/scarlet/ScarletManager$AnimationMode;Lcom/robinhood/scarlet/util/resource/ResourceReference;)V", "scarletManager", "Lcom/robinhood/scarlet/ScarletManager;", "layoutInflater", "Landroid/view/LayoutInflater;", "getLayoutInflater", "()Landroid/view/LayoutInflater;", "layoutInflater$delegate", "Lkotlin/Lazy;", "getSystemService", "", "name", "", "getSystemServiceName", "serviceClass", "Ljava/lang/Class;", "getTheme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ScarletContextWrapper extends ContextWrapper {
    public static final int $stable = 8;

    /* renamed from: layoutInflater$delegate, reason: from kotlin metadata */
    private final Lazy layoutInflater;
    private final ScarletManager scarletManager;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScarletContextWrapper(Context base) {
        this(base, null, null, 6, null);
        Intrinsics.checkNotNullParameter(base, "base");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScarletContextWrapper(Context base, ScarletManager.AnimationMode animationMode) {
        this(base, animationMode, null, 4, null);
        Intrinsics.checkNotNullParameter(base, "base");
        Intrinsics.checkNotNullParameter(animationMode, "animationMode");
    }

    public /* synthetic */ ScarletContextWrapper(Context context, ScarletManager.AnimationMode animationMode, ResourceReferences4 resourceReferences4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? ScarletManager.AnimationMode.ANIMATED_AND_INHERIT : animationMode, (i & 4) != 0 ? null : resourceReferences4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScarletContextWrapper(Context base, ScarletManager.AnimationMode animationMode, ResourceReferences4<StyleResource> resourceReferences4) {
        super(base);
        Intrinsics.checkNotNullParameter(base, "base");
        Intrinsics.checkNotNullParameter(animationMode, "animationMode");
        this.scarletManager = new ScarletManager(base, animationMode, resourceReferences4);
        this.layoutInflater = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.robinhood.scarlet.ScarletContextWrapper$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ScarletContextWrapper.layoutInflater_delegate$lambda$0(this.f$0);
            }
        });
    }

    private final LayoutInflater getLayoutInflater() {
        Object value = this.layoutInflater.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LayoutInflater) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutInflater layoutInflater_delegate$lambda$0(ScarletContextWrapper scarletContextWrapper) {
        Context baseContext = scarletContextWrapper.getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
        return ContextSystemServices.getLayoutInflater(baseContext).cloneInContext(scarletContextWrapper);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return Intrinsics.areEqual(name, ScarletManager.SERVICE_NAME) ? this.scarletManager : Intrinsics.areEqual(name, "layout_inflater") ? getLayoutInflater() : super.getSystemService(name);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public String getSystemServiceName(Class<?> serviceClass) {
        Intrinsics.checkNotNullParameter(serviceClass, "serviceClass");
        return Intrinsics.areEqual(serviceClass, ScarletManager.class) ? ScarletManager.SERVICE_NAME : super.getSystemServiceName(serviceClass);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        return this.scarletManager.getCurrentTheme();
    }
}
