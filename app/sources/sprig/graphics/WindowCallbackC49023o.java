package sprig.graphics;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.content.Context;
import android.graphics.Point;
import android.view.ActionMode;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sprig.graphics.C49022n;

@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010+\u001a\u00020\u0001\u0012\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u000e0,\u0012\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u000e0,¢\u0006\u0004\b:\u0010;J\u0019\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\u0096\u0001J\u0019\u0010\b\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00070\u0007H\u0096\u0001J\u0019\u0010\t\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00070\u0007H\u0096\u0001J\u0019\u0010\u000b\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\n0\nH\u0096\u0001J\u0019\u0010\f\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\u0096\u0001J\u0019\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\r0\rH\u0096\u0001J\u0019\u0010\u0010\u001a\u00020\u000e2\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\r0\rH\u0096\u0001J\t\u0010\u0011\u001a\u00020\u000eH\u0096\u0001J\t\u0010\u0012\u001a\u00020\u000eH\u0096\u0001J\u001b\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00132\b\b\u0001\u0010\u0015\u001a\u00020\u0014H\u0096\u0001J\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0004\u001a\u00020\u0013H\u0097\u0001J\t\u0010\u0019\u001a\u00020\u000eH\u0096\u0001J\u001b\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00132\b\b\u0001\u0010\u0015\u001a\u00020\u001aH\u0096\u0001J\u001b\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00132\b\b\u0001\u0010\u0015\u001a\u00020\u0014H\u0096\u0001J\u001b\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00132\b\b\u0001\u0010\u0015\u001a\u00020\u0014H\u0096\u0001J'\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00132\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00172\b\b\u0001\u0010\u001e\u001a\u00020\u0014H\u0096\u0001J\t\u0010 \u001a\u00020\u0005H\u0096\u0001J\u0019\u0010 \u001a\u00020\u00052\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010!0!H\u0096\u0001J\u0019\u0010#\u001a\u00020\u000e2\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\"0\"H\u0096\u0001J\u0011\u0010$\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H\u0096\u0001J\u001b\u0010&\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010%0%H\u0097\u0001J#\u0010&\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010%0%2\u0006\u0010\u0015\u001a\u00020\u0013H\u0097\u0001J\u0010\u0010(\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0002H\u0016R\u0014\u0010+\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R#\u00101\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u000e0,8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b)\u00100R#\u00105\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u000e0,8\u0006¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b4\u00100R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u0006<"}, m3636d2 = {"Lsprig/e/o;", "Landroid/view/Window$Callback;", "Landroid/view/MotionEvent;", "kotlin.jvm.PlatformType", "p0", "", "dispatchGenericMotionEvent", "Landroid/view/KeyEvent;", "dispatchKeyEvent", "dispatchKeyShortcutEvent", "Landroid/view/accessibility/AccessibilityEvent;", "dispatchPopulateAccessibilityEvent", "dispatchTrackballEvent", "Landroid/view/ActionMode;", "", "onActionModeFinished", "onActionModeStarted", "onAttachedToWindow", "onContentChanged", "", "Landroid/view/Menu;", "p1", "onCreatePanelMenu", "Landroid/view/View;", "onCreatePanelView", "onDetachedFromWindow", "Landroid/view/MenuItem;", "onMenuItemSelected", "onMenuOpened", "onPanelClosed", "p2", "onPreparePanel", "onSearchRequested", "Landroid/view/SearchEvent;", "Landroid/view/WindowManager$LayoutParams;", "onWindowAttributesChanged", "onWindowFocusChanged", "Landroid/view/ActionMode$Callback;", "onWindowStartingActionMode", "event", "dispatchTouchEvent", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "Landroid/view/Window$Callback;", "delegate", "Lkotlin/Function1;", "Landroid/graphics/Point;", "b", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "onTouch", "Lsprig/e/n$d;", "c", "getOnSwipe", "onSwipe", "Landroid/view/GestureDetector;", "d", "Landroid/view/GestureDetector;", "gestureDetector", "<init>", "(Landroid/view/Window$Callback;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
/* renamed from: sprig.e.o */
/* loaded from: classes28.dex */
public final class WindowCallbackC49023o implements Window.Callback {

    /* renamed from: a, reason: from kotlin metadata */
    private final Window.Callback delegate;

    /* renamed from: b, reason: from kotlin metadata */
    private final Function1<Point, Unit> onTouch;

    /* renamed from: c, reason: from kotlin metadata */
    private final Function1<C49022n.SwipeData, Unit> onSwipe;

    /* renamed from: d, reason: from kotlin metadata */
    private GestureDetector gestureDetector;

    @Metadata(m3635d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m3636d2 = {"sprig/e/o$a", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "Landroid/view/MotionEvent;", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "", "onSingleTapUp", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
    /* renamed from: sprig.e.o$a */
    public static final class a extends GestureDetector.SimpleOnGestureListener {
        a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            WindowCallbackC49023o.this.m4274a().invoke(new Point((int) e.getX(), (int) e.getY()));
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WindowCallbackC49023o(Window.Callback delegate, Function1<? super Point, Unit> onTouch, Function1<? super C49022n.SwipeData, Unit> onSwipe) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(onTouch, "onTouch");
        Intrinsics.checkNotNullParameter(onSwipe, "onSwipe");
        this.delegate = delegate;
        this.onTouch = onTouch;
        this.onSwipe = onSwipe;
        this.gestureDetector = new GestureDetector((Context) null, new a());
    }

    /* renamed from: a */
    public final Function1<Point, Unit> m4274a() {
        return this.onTouch;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent p0) {
        return this.delegate.dispatchGenericMotionEvent(p0);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent p0) {
        return this.delegate.dispatchKeyEvent(p0);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent p0) {
        return this.delegate.dispatchKeyShortcutEvent(p0);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent p0) {
        return this.delegate.dispatchPopulateAccessibilityEvent(p0);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        GestureDetector gestureDetector = this.gestureDetector;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(event);
        }
        return this.delegate.dispatchTouchEvent(event);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent p0) {
        return this.delegate.dispatchTrackballEvent(p0);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode p0) {
        this.delegate.onActionModeFinished(p0);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode p0) {
        this.delegate.onActionModeStarted(p0);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.delegate.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        this.delegate.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int p0, @NonNull Menu p1) {
        Intrinsics.checkNotNullParameter(p1, "p1");
        return this.delegate.onCreatePanelMenu(p0, p1);
    }

    @Override // android.view.Window.Callback
    @Nullable
    public View onCreatePanelView(int p0) {
        return this.delegate.onCreatePanelView(p0);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.delegate.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int p0, @NonNull MenuItem p1) {
        Intrinsics.checkNotNullParameter(p1, "p1");
        return this.delegate.onMenuItemSelected(p0, p1);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int p0, @NonNull Menu p1) {
        Intrinsics.checkNotNullParameter(p1, "p1");
        return this.delegate.onMenuOpened(p0, p1);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int p0, @NonNull Menu p1) {
        Intrinsics.checkNotNullParameter(p1, "p1");
        this.delegate.onPanelClosed(p0, p1);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int p0, @Nullable View p1, @NonNull Menu p2) {
        Intrinsics.checkNotNullParameter(p2, "p2");
        return this.delegate.onPreparePanel(p0, p1, p2);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.delegate.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(SearchEvent p0) {
        return this.delegate.onSearchRequested(p0);
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams p0) {
        this.delegate.onWindowAttributesChanged(p0);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean p0) {
        this.delegate.onWindowFocusChanged(p0);
    }

    @Override // android.view.Window.Callback
    @Nullable
    public ActionMode onWindowStartingActionMode(ActionMode.Callback p0) {
        return this.delegate.onWindowStartingActionMode(p0);
    }

    @Override // android.view.Window.Callback
    @Nullable
    public ActionMode onWindowStartingActionMode(ActionMode.Callback p0, int p1) {
        return this.delegate.onWindowStartingActionMode(p0, p1);
    }
}
