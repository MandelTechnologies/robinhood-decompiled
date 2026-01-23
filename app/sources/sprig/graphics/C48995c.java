package sprig.graphics;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.singular.sdk.internal.Constants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016R!\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u00128\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R!\u0010\u0018\u001a\u00020\u000e*\u00020\u000b8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0017R#\u0010\u001a\u001a\u0004\u0018\u00010\u000e*\u00020\u00048BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0019\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, m3636d2 = {"Lsprig/c/c;", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "", "event", "Landroidx/fragment/app/FragmentActivity;", "activity", "", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "", "Landroidx/fragment/app/FragmentManager;", "fm", "Landroidx/fragment/app/Fragment;", "f", "onFragmentResumed", "Lsprig/c/d;", "b", "Ljava/lang/String;", "currentFragment", "", "Lsprig/c/a;", "c", "Ljava/util/Map;", "fragmentForEvent", "(Landroidx/fragment/app/Fragment;)Ljava/lang/String;", "name", "(Landroidx/fragment/app/FragmentActivity;)Ljava/lang/String;", "visibleFragmentName", "<init>", "()V", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
/* renamed from: sprig.c.c */
/* loaded from: classes28.dex */
public final class C48995c extends FragmentManager.FragmentLifecycleCallbacks {

    /* renamed from: b, reason: from kotlin metadata */
    private static String currentFragment;

    /* renamed from: a */
    public static final C48995c f8235a = new C48995c();

    /* renamed from: c, reason: from kotlin metadata */
    private static final Map<C48993a, C48996d> fragmentForEvent = new LinkedHashMap();

    private C48995c() {
    }

    /* renamed from: a */
    public final void m4039a(String event, FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(activity, "activity");
        String strM4037a = m4037a(activity);
        if (strM4037a != null) {
            C48996d c48996dPut = fragmentForEvent.put(C48993a.m4025a(C48993a.m4027b(event)), C48996d.m4041a(strM4037a));
            String name = c48996dPut != null ? c48996dPut.getName() : null;
            C48996d c48996dM4041a = name != null ? C48996d.m4041a(name) : null;
            if (c48996dM4041a != null) {
                c48996dM4041a.getName();
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentResumed(FragmentManager fm, Fragment f) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(f, "f");
        currentFragment = m4036a(f);
        super.onFragmentResumed(fm, f);
    }

    /* renamed from: a */
    public final void m4038a() {
        fragmentForEvent.clear();
    }

    /* renamed from: a */
    public final boolean m4040a(String event) {
        String str;
        Intrinsics.checkNotNullParameter(event, "event");
        C48996d c48996dRemove = fragmentForEvent.remove(C48993a.m4025a(C48993a.m4027b(event)));
        String name = c48996dRemove != null ? c48996dRemove.getName() : null;
        return name == null || (str = currentFragment) == null || Intrinsics.areEqual(name, str);
    }

    /* renamed from: a */
    private final String m4036a(Fragment fragment) {
        String tag = fragment.getTag();
        if (tag == null) {
            tag = fragment.getClass().getName();
        }
        Intrinsics.checkNotNullExpressionValue(tag, "tag ?: javaClass.name");
        return C48996d.m4043b(tag);
    }

    /* renamed from: a */
    private final String m4037a(FragmentActivity fragmentActivity) {
        List<Fragment> fragments = fragmentActivity.getSupportFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "supportFragmentManager.fragments");
        Fragment fragment = (Fragment) CollectionsKt.firstOrNull((List) fragments);
        if (fragment != null) {
            return m4036a(fragment);
        }
        return null;
    }
}
