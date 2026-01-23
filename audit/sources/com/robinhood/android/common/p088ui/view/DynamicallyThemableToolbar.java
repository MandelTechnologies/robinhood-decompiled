package com.robinhood.android.common.p088ui.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.DirectResourceReference;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.StyleResource;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DynamicallyThemableToolbar.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 $2\u00020\u0001:\u0004!\"#$B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001dH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00038B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/common/ui/view/DynamicallyThemableToolbar;", "Landroidx/appcompat/widget/Toolbar;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "_popupScarletContext", "Lcom/robinhood/scarlet/ScarletContextWrapper;", "popupScarletContext", "getPopupScarletContext", "()Lcom/robinhood/scarlet/ScarletContextWrapper;", "value", "popupContext", "getPopupContext", "()Landroid/content/Context;", "setPopupContext", "(Landroid/content/Context;)V", "menuView", "Landroidx/appcompat/widget/ActionMenuView;", "getMenuView", "()Landroidx/appcompat/widget/ActionMenuView;", "popupThemeReference", "Lcom/robinhood/scarlet/util/resource/DirectResourceReference;", "Lcom/robinhood/scarlet/util/resource/StyleResource;", "getPopupThemeReference", "()Lcom/robinhood/scarlet/util/resource/DirectResourceReference;", "setPopupTheme", "", "resId", "", "ensureMenuView", "ToolbarMethods", "ToolbarFields", "ActionMenuViewFields", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class DynamicallyThemableToolbar extends Toolbar {
    private ScarletContextWrapper _popupScarletContext;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public DynamicallyThemableToolbar(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ DynamicallyThemableToolbar(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DynamicallyThemableToolbar(Context context, AttributeSet attributeSet) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setPopupContext(getPopupScarletContext());
        ensureMenuView();
        Companion companion = INSTANCE;
        ActionMenuView menuView = getMenuView();
        Intrinsics.checkNotNull(menuView);
        companion.setPopupContext(menuView, getPopupContext());
    }

    private final ScarletContextWrapper getPopupScarletContext() {
        if (this._popupScarletContext == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this._popupScarletContext = new ScarletContextWrapper(context, null, null, 6, null);
        }
        ScarletContextWrapper scarletContextWrapper = this._popupScarletContext;
        if (scarletContextWrapper != null) {
            return scarletContextWrapper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("_popupScarletContext");
        return null;
    }

    private final Context getPopupContext() throws IllegalAccessException, IllegalArgumentException {
        Object obj = ToolbarFields.INSTANCE.getPopupContext().get(this);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.content.Context");
        return (Context) obj;
    }

    private final void setPopupContext(Context context) throws IllegalAccessException, IllegalArgumentException {
        ToolbarFields.INSTANCE.getPopupContext().set(this, context);
    }

    public final ActionMenuView getMenuView() {
        return (ActionMenuView) ToolbarFields.INSTANCE.getMenuView().get(this);
    }

    private final DirectResourceReference<StyleResource> getPopupThemeReference() {
        if (getPopupTheme() == 0) {
            return null;
        }
        return new DirectResourceReference<>(ResourceType.STYLE.INSTANCE, getPopupTheme());
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setPopupTheme(int resId) throws IllegalAccessException, IllegalArgumentException {
        super.setPopupTheme(resId);
        ScarletContextWrapper popupScarletContext = getPopupScarletContext();
        ScarletManager2.getScarletManager(popupScarletContext).setRootOverlay(getPopupThemeReference());
        setPopupContext(popupScarletContext);
    }

    private final void ensureMenuView() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ToolbarMethods.INSTANCE.getEnsureMenuView().invoke(this, null);
    }

    /* compiled from: DynamicallyThemableToolbar.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/ui/view/DynamicallyThemableToolbar$ToolbarMethods;", "", "<init>", "()V", "ensureMenuView", "Ljava/lang/reflect/Method;", "getEnsureMenuView", "()Ljava/lang/reflect/Method;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class ToolbarMethods {
        public static final ToolbarMethods INSTANCE = new ToolbarMethods();
        private static final Method ensureMenuView;

        private ToolbarMethods() {
        }

        static {
            Method declaredMethod = Toolbar.class.getDeclaredMethod("ensureMenuView", null);
            declaredMethod.setAccessible(true);
            Intrinsics.checkNotNullExpressionValue(declaredMethod, "apply(...)");
            ensureMenuView = declaredMethod;
        }

        public final Method getEnsureMenuView() {
            return ensureMenuView;
        }
    }

    /* compiled from: DynamicallyThemableToolbar.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/ui/view/DynamicallyThemableToolbar$ToolbarFields;", "", "<init>", "()V", "popupContext", "Ljava/lang/reflect/Field;", "getPopupContext", "()Ljava/lang/reflect/Field;", "menuView", "getMenuView", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class ToolbarFields {
        public static final ToolbarFields INSTANCE = new ToolbarFields();
        private static final Field menuView;
        private static final Field popupContext;

        private ToolbarFields() {
        }

        static {
            Field declaredField = Toolbar.class.getDeclaredField("mPopupContext");
            declaredField.setAccessible(true);
            Intrinsics.checkNotNullExpressionValue(declaredField, "apply(...)");
            popupContext = declaredField;
            Field declaredField2 = Toolbar.class.getDeclaredField("mMenuView");
            declaredField2.setAccessible(true);
            Intrinsics.checkNotNullExpressionValue(declaredField2, "apply(...)");
            menuView = declaredField2;
        }

        public final Field getPopupContext() {
            return popupContext;
        }

        public final Field getMenuView() {
            return menuView;
        }
    }

    /* compiled from: DynamicallyThemableToolbar.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/ui/view/DynamicallyThemableToolbar$ActionMenuViewFields;", "", "<init>", "()V", "popupContext", "Ljava/lang/reflect/Field;", "getPopupContext", "()Ljava/lang/reflect/Field;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class ActionMenuViewFields {
        public static final ActionMenuViewFields INSTANCE = new ActionMenuViewFields();
        private static final Field popupContext;

        private ActionMenuViewFields() {
        }

        public final Field getPopupContext() {
            return popupContext;
        }

        static {
            Field declaredField = ActionMenuView.class.getDeclaredField("mPopupContext");
            declaredField.setAccessible(true);
            Intrinsics.checkNotNullExpressionValue(declaredField, "apply(...)");
            popupContext = declaredField;
        }
    }

    /* compiled from: DynamicallyThemableToolbar.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\u0006\u001a\u00020\u0005*\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00058B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/ui/view/DynamicallyThemableToolbar$Companion;", "", "<init>", "()V", "value", "Landroid/content/Context;", "popupContext", "Landroidx/appcompat/widget/ActionMenuView;", "getPopupContext", "(Landroidx/appcompat/widget/ActionMenuView;)Landroid/content/Context;", "setPopupContext", "(Landroidx/appcompat/widget/ActionMenuView;Landroid/content/Context;)V", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final Context getPopupContext(ActionMenuView actionMenuView) throws IllegalAccessException, IllegalArgumentException {
            Object obj = ActionMenuViewFields.INSTANCE.getPopupContext().get(actionMenuView);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.content.Context");
            return (Context) obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setPopupContext(ActionMenuView actionMenuView, Context context) throws IllegalAccessException, IllegalArgumentException {
            ActionMenuViewFields.INSTANCE.getPopupContext().set(actionMenuView, context);
        }
    }
}
