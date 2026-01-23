package androidx.compose.p011ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.collection.ObjectIntMap2;
import androidx.collection.ObjectIntMap3;
import androidx.collection.ObjectList;
import androidx.collection.ObjectList2;
import androidx.collection.ScatterMap6;
import androidx.collection.ScatterMap7;
import androidx.collection.ScatterSet2;
import androidx.collection.ScatterSet5;
import com.robinhood.compose.bento.component.BentoCurrencyPicker;
import java.util.Collections;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;

/* compiled from: FocusFinderCompat.android.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 (2\u00020\u0001:\u0002()B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ)\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J9\u0010\u0012\u001a\u0004\u0018\u00010\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00142\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J9\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00142\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u001f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010\rR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, m3636d2 = {"Landroidx/compose/ui/platform/FocusFinderCompat;", "", "<init>", "()V", "Landroid/view/ViewGroup;", BentoCurrencyPicker.ROOT_TEST_TAG, "Landroid/view/View;", "focused", "getEffectiveRoot", "(Landroid/view/ViewGroup;Landroid/view/View;)Landroid/view/ViewGroup;", "", "direction", "findNextUserSpecifiedFocus", "(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;", "Landroidx/collection/MutableObjectList;", "focusables", "findNextFocus", "(Landroid/view/ViewGroup;Landroid/view/View;ILandroidx/collection/MutableObjectList;)Landroid/view/View;", "findNextFocusInRelativeDirection", "(Landroidx/collection/MutableObjectList;Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;", "Landroidx/collection/ObjectList;", "count", "", "outLooped", "getNextFocusable", "(Landroid/view/View;Landroidx/collection/ObjectList;I[Z)Landroid/view/View;", "getPreviousFocusable", "id", "", "isValidId", "(I)Z", "findNextFocus1d", "Landroid/graphics/Rect;", "focusedRect", "Landroid/graphics/Rect;", "Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator;", "userSpecifiedFocusComparator", "Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator;", "tmpList", "Landroidx/collection/MutableObjectList;", "Companion", "UserSpecifiedFocusComparator", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class FocusFinderCompat {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final FocusFinderCompat$Companion$FocusFinderThreadLocal$1 FocusFinderThreadLocal = new ThreadLocal<FocusFinderCompat>() { // from class: androidx.compose.ui.platform.FocusFinderCompat$Companion$FocusFinderThreadLocal$1
        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public FocusFinderCompat initialValue() {
            return new FocusFinderCompat();
        }
    };
    private final Rect focusedRect = new Rect();
    private final UserSpecifiedFocusComparator userSpecifiedFocusComparator = new UserSpecifiedFocusComparator(new UserSpecifiedFocusComparator.NextFocusGetter() { // from class: androidx.compose.ui.platform.FocusFinderCompat$$ExternalSyntheticLambda0
        @Override // androidx.compose.ui.platform.FocusFinderCompat.UserSpecifiedFocusComparator.NextFocusGetter
        public final View get(View view, View view2) {
            return FocusFinderCompat.userSpecifiedFocusComparator$lambda$0(this.f$0, view, view2);
        }
    });
    private final ObjectList2<View> tmpList = new ObjectList2<>(0, 1, null);

    private final boolean isValidId(int id) {
        return (id == 0 || id == -1) ? false : true;
    }

    /* compiled from: FocusFinderCompat.android.kt */
    @Metadata(m3635d1 = {"\u0000\u001b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Landroidx/compose/ui/platform/FocusFinderCompat$Companion;", "", "()V", "FocusFinderThreadLocal", "androidx/compose/ui/platform/FocusFinderCompat$Companion$FocusFinderThreadLocal$1", "Landroidx/compose/ui/platform/FocusFinderCompat$Companion$FocusFinderThreadLocal$1;", "instance", "Landroidx/compose/ui/platform/FocusFinderCompat;", "getInstance", "()Landroidx/compose/ui/platform/FocusFinderCompat;", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FocusFinderCompat getInstance() {
            FocusFinderCompat focusFinderCompat = FocusFinderCompat.FocusFinderThreadLocal.get();
            Intrinsics.checkNotNull(focusFinderCompat);
            return focusFinderCompat;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View userSpecifiedFocusComparator$lambda$0(FocusFinderCompat focusFinderCompat, View view, View view2) {
        if (focusFinderCompat.isValidId(view2.getNextFocusForwardId())) {
            return FocusFinderCompat_androidKt.findUserSetNextFocus(view2, view, 2);
        }
        return null;
    }

    public final View findNextFocus1d(ViewGroup root, View focused, int direction) {
        ViewGroup effectiveRoot = getEffectiveRoot(root, focused);
        View viewFindNextUserSpecifiedFocus = findNextUserSpecifiedFocus(effectiveRoot, focused, direction);
        if (viewFindNextUserSpecifiedFocus != null) {
            return viewFindNextUserSpecifiedFocus;
        }
        ObjectList2<View> objectList2 = this.tmpList;
        try {
            objectList2.clear();
            FocusFinderCompat_androidKt.addFocusableViews(effectiveRoot, objectList2, direction);
            if (!objectList2.isEmpty()) {
                viewFindNextUserSpecifiedFocus = findNextFocus(effectiveRoot, focused, direction, objectList2);
            }
            return viewFindNextUserSpecifiedFocus;
        } finally {
            objectList2.clear();
        }
    }

    private final ViewGroup getEffectiveRoot(ViewGroup root, View focused) {
        if (focused != null && focused != root) {
            ViewParent parent = focused.getParent();
            ViewGroup viewGroup = null;
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                if (parent == root) {
                    if (viewGroup == null) {
                        break;
                    }
                    return viewGroup;
                }
                ViewGroup viewGroup2 = (ViewGroup) parent;
                if (viewGroup2.getTouchscreenBlocksFocus() && focused.getContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
                    viewGroup = viewGroup2;
                }
                parent = viewGroup2.getParent();
            }
        }
        return root;
    }

    private final View findNextUserSpecifiedFocus(ViewGroup root, View focused, int direction) {
        View viewFindUserSetNextFocus = FocusFinderCompat_androidKt.findUserSetNextFocus(focused, root, direction);
        boolean z = true;
        View viewFindUserSetNextFocus2 = viewFindUserSetNextFocus;
        while (viewFindUserSetNextFocus != null) {
            if (viewFindUserSetNextFocus.isFocusable() && viewFindUserSetNextFocus.getVisibility() == 0 && (!viewFindUserSetNextFocus.isInTouchMode() || viewFindUserSetNextFocus.isFocusableInTouchMode())) {
                return viewFindUserSetNextFocus;
            }
            viewFindUserSetNextFocus = FocusFinderCompat_androidKt.findUserSetNextFocus(viewFindUserSetNextFocus, root, direction);
            boolean z2 = !z;
            if (!z) {
                viewFindUserSetNextFocus2 = viewFindUserSetNextFocus2 != null ? FocusFinderCompat_androidKt.findUserSetNextFocus(viewFindUserSetNextFocus2, root, direction) : null;
                if (viewFindUserSetNextFocus2 == viewFindUserSetNextFocus) {
                    break;
                }
            }
            z = z2;
        }
        return null;
    }

    private final View findNextFocus(ViewGroup root, View focused, int direction, ObjectList2<View> focusables) {
        Rect rect = this.focusedRect;
        focused.getFocusedRect(rect);
        root.offsetDescendantRectToMyCoords(focused, rect);
        return findNextFocusInRelativeDirection(focusables, root, focused, direction);
    }

    @SuppressLint({"AsCollectionCall"})
    private final View findNextFocusInRelativeDirection(ObjectList2<View> focusables, ViewGroup root, View focused, int direction) {
        try {
            UserSpecifiedFocusComparator userSpecifiedFocusComparator = this.userSpecifiedFocusComparator;
            Intrinsics.checkNotNull(root);
            userSpecifiedFocusComparator.setFocusables(focusables, root);
            Collections.sort(focusables.asMutableList(), this.userSpecifiedFocusComparator);
            this.userSpecifiedFocusComparator.recycle();
            int i = focusables.get_size();
            View previousFocusable = null;
            if (i < 2) {
                return null;
            }
            boolean[] zArr = new boolean[1];
            if (direction == 1) {
                previousFocusable = getPreviousFocusable(focused, focusables, i, zArr);
            } else if (direction == 2) {
                previousFocusable = getNextFocusable(focused, focusables, i, zArr);
            }
            return previousFocusable == null ? focusables.get(i - 1) : previousFocusable;
        } catch (Throwable th) {
            this.userSpecifiedFocusComparator.recycle();
            throw th;
        }
    }

    private final View getNextFocusable(View focused, ObjectList<View> focusables, int count, boolean[] outLooped) {
        int i;
        if (count < 2) {
            return null;
        }
        int iLastIndexOf = focusables.lastIndexOf(focused);
        if (iLastIndexOf >= 0 && (i = iLastIndexOf + 1) < count) {
            return focusables.get(i);
        }
        outLooped[0] = true;
        return focusables.get(0);
    }

    private final View getPreviousFocusable(View focused, ObjectList<View> focusables, int count, boolean[] outLooped) {
        int iIndexOf;
        if (count < 2) {
            return null;
        }
        if (focused != null && (iIndexOf = focusables.indexOf(focused)) > 0) {
            return focusables.get(iIndexOf - 1);
        }
        outLooped[0] = true;
        return focusables.get(count - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FocusFinderCompat.android.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\u0003:\u0001\u001aB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0016J\u0006\u0010\u0013\u001a\u00020\u0014J\u001c\u0010\u0015\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u0002J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0002R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator;", "Ljava/util/Comparator;", "Landroid/view/View;", "Lkotlin/Comparator;", "mNextFocusGetter", "Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator$NextFocusGetter;", "(Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator$NextFocusGetter;)V", "headsOfChains", "Landroidx/collection/MutableScatterMap;", "isConnectedTo", "Landroidx/collection/MutableScatterSet;", "nextFoci", "originalOrdinal", "Landroidx/collection/MutableObjectIntMap;", BentoCurrencyPicker.ROOT_TEST_TAG, "compare", "", "first", "second", "recycle", "", "setFocusables", "focusables", "Landroidx/collection/ObjectList;", "setHeadOfChain", "head", "NextFocusGetter", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    static final class UserSpecifiedFocusComparator implements Comparator<View> {
        private final NextFocusGetter mNextFocusGetter;
        private View root;
        private final ScatterMap6<View, View> nextFoci = ScatterMap7.mutableScatterMapOf();
        private final ScatterSet2<View> isConnectedTo = ScatterSet5.mutableScatterSetOf();
        private final ScatterMap6<View, View> headsOfChains = ScatterMap7.mutableScatterMapOf();
        private final ObjectIntMap2<View> originalOrdinal = ObjectIntMap3.mutableObjectIntMapOf();

        /* compiled from: FocusFinderCompat.android.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m3636d2 = {"Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator$NextFocusGetter;", "", "get", "Landroid/view/View;", BentoCurrencyPicker.ROOT_TEST_TAG, "view", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public interface NextFocusGetter {
            View get(View root, View view);
        }

        public UserSpecifiedFocusComparator(NextFocusGetter nextFocusGetter) {
            this.mNextFocusGetter = nextFocusGetter;
        }

        public final void recycle() {
            this.root = null;
            this.headsOfChains.clear();
            this.isConnectedTo.clear();
            this.originalOrdinal.clear();
            this.nextFoci.clear();
        }

        public final void setFocusables(ObjectList<View> focusables, View root) {
            this.root = root;
            Object[] objArr = focusables.content;
            int i = focusables._size;
            for (int i2 = 0; i2 < i; i2++) {
                this.originalOrdinal.set((View) objArr[i2], i2);
            }
            PrimitiveRanges2 primitiveRanges2Until = RangesKt.until(0, focusables._size);
            int first = primitiveRanges2Until.getFirst();
            int last = primitiveRanges2Until.getLast();
            if (first <= last) {
                while (true) {
                    View view = focusables.get(last);
                    View view2 = this.mNextFocusGetter.get(root, view);
                    if (view2 != null && this.originalOrdinal.containsKey(view2)) {
                        this.nextFoci.set(view, view2);
                        this.isConnectedTo.add(view2);
                    }
                    if (last == first) {
                        break;
                    } else {
                        last--;
                    }
                }
            }
            PrimitiveRanges2 primitiveRanges2Until2 = RangesKt.until(0, focusables._size);
            int first2 = primitiveRanges2Until2.getFirst();
            int last2 = primitiveRanges2Until2.getLast();
            if (first2 > last2) {
                return;
            }
            while (true) {
                View view3 = focusables.get(last2);
                if (this.nextFoci.get(view3) != null && !this.isConnectedTo.contains(view3)) {
                    setHeadOfChain(view3);
                }
                if (last2 == first2) {
                    return;
                } else {
                    last2--;
                }
            }
        }

        public final void setHeadOfChain(View head) {
            View view = head;
            while (head != null) {
                View view2 = this.headsOfChains.get(head);
                if (view2 != null) {
                    if (view2 == view) {
                        return;
                    }
                    head = view;
                    view = view2;
                }
                this.headsOfChains.set(head, view);
                head = this.nextFoci.get(head);
            }
        }

        @Override // java.util.Comparator
        public int compare(View first, View second) {
            if (first == second) {
                return 0;
            }
            if (first == null) {
                return -1;
            }
            if (second == null) {
                return 1;
            }
            View view = this.headsOfChains.get(first);
            View view2 = this.headsOfChains.get(second);
            if (view == view2 && view != null) {
                if (first == view) {
                    return -1;
                }
                return (second == view || this.nextFoci.get(first) == null) ? 1 : -1;
            }
            if (view != null) {
                first = view;
            }
            if (view2 != null) {
                second = view2;
            }
            if (view == null && view2 == null) {
                return 0;
            }
            return this.originalOrdinal.get(first) < this.originalOrdinal.get(second) ? -1 : 1;
        }
    }
}
