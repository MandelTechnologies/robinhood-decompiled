package androidx.navigation;

import androidx.navigation.NavType;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class NavType$$ExternalSyntheticDesugaredLibraryBridge0 {
    /* renamed from: m */
    public static /* synthetic */ NavType m662m(NavType.Companion companion, String str, String str2) {
        if (str == null || !str.startsWith("java")) {
            return companion.fromArgType(str, str2);
        }
        try {
            return companion.fromArgType("j$" + str.substring(4), str2);
        } catch (RuntimeException e) {
            if (e.getCause() instanceof ClassNotFoundException) {
                return companion.fromArgType(str, str2);
            }
            throw e;
        }
    }
}
