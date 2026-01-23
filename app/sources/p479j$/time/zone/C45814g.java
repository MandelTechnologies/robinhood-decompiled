package p479j$.time.zone;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;

/* renamed from: j$.time.zone.g */
/* loaded from: classes29.dex */
public final class C45814g implements PrivilegedAction {

    /* renamed from: a */
    public final /* synthetic */ List f6997a;

    public C45814g(List list) {
        this.f6997a = list;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        String property = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (property != null) {
            try {
                C45815h c45815h = (C45815h) C45815h.class.cast(Class.forName(property, true, C45815h.class.getClassLoader()).newInstance());
                C45815h.m3633b(c45815h);
                ((ArrayList) this.f6997a).add(c45815h);
                return null;
            } catch (Exception e) {
                throw new Error(e);
            }
        }
        C45815h.m3633b(new C45815h());
        return null;
    }
}
