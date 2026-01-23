package microgram.android.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty7;
import microgram.manifest.AppInfo;

/* compiled from: HostCompatibilityFlags.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\b\u0011J?\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u0002H\u00140\u0013\"\b\b\u0000\u0010\u0014*\u00020\u0001*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u0001H\u00140\u00152\u0006\u0010\u0016\u001a\u0002H\u0014H\u0002¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lmicrogram/android/internal/HostCompatibilityFlags;", "", "<init>", "()V", "applicationFlags", "Lmicrogram/manifest/AppInfo$CompatibilityFlags;", "<set-?>", "", "neverTearDownAndroidUi", "getNeverTearDownAndroidUi", "()Z", "setNeverTearDownAndroidUi", "(Z)V", "neverTearDownAndroidUi$delegate", "Lkotlin/properties/ReadWriteProperty;", "initialize", "", "initialize$lib_microgram_externalRelease", "flag", "Lkotlin/properties/ReadWriteProperty;", "T", "Lkotlin/reflect/KProperty1;", "defaultValue", "(Lkotlin/reflect/KProperty1;Ljava/lang/Object;)Lkotlin/properties/ReadWriteProperty;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class HostCompatibilityFlags {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(HostCompatibilityFlags.class, "neverTearDownAndroidUi", "getNeverTearDownAndroidUi()Z", 0))};
    private volatile AppInfo.CompatibilityFlags applicationFlags = new AppInfo.CompatibilityFlags((Boolean) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));

    /* renamed from: neverTearDownAndroidUi$delegate, reason: from kotlin metadata */
    private final Interfaces3 neverTearDownAndroidUi = flag(new PropertyReference1Impl() { // from class: microgram.android.internal.HostCompatibilityFlags$neverTearDownAndroidUi$2
        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
        public Object get(Object obj) {
            return ((AppInfo.CompatibilityFlags) obj).getNeverTearDownAndroidUi();
        }
    }, Boolean.FALSE);

    public final boolean getNeverTearDownAndroidUi() {
        return ((Boolean) this.neverTearDownAndroidUi.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final void setNeverTearDownAndroidUi(boolean z) {
        this.neverTearDownAndroidUi.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public final void initialize$lib_microgram_externalRelease(AppInfo.CompatibilityFlags applicationFlags) {
        Intrinsics.checkNotNullParameter(applicationFlags, "applicationFlags");
        this.applicationFlags = applicationFlags;
    }

    private final <T> Interfaces3<Object, T> flag(final KProperty7<AppInfo.CompatibilityFlags, ? extends T> kProperty7, final T t) {
        return new Interfaces3<Object, T>() { // from class: microgram.android.internal.HostCompatibilityFlags.flag.1
            private T assignedValue;

            @Override // kotlin.properties.Interfaces3, kotlin.properties.Interfaces2
            public T getValue(Object thisRef, KProperty<?> property) {
                Intrinsics.checkNotNullParameter(property, "property");
                T t2 = kProperty7.get(this.applicationFlags);
                if (t2 != null) {
                    return t2;
                }
                T t3 = this.assignedValue;
                return t3 == null ? t : t3;
            }

            @Override // kotlin.properties.Interfaces3
            public void setValue(Object thisRef, KProperty<?> property, T value) {
                Intrinsics.checkNotNullParameter(property, "property");
                Intrinsics.checkNotNullParameter(value, "value");
                this.assignedValue = value;
            }
        };
    }
}
