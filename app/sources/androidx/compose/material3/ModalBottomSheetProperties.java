package androidx.compose.material3;

import androidx.compose.p011ui.window.SecureFlagPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ModalBottomSheet.android.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\bJ\u001a\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Landroidx/compose/material3/ModalBottomSheetProperties;", "", "Landroidx/compose/ui/window/SecureFlagPolicy;", "securePolicy", "", "shouldDismissOnBackPress", "<init>", "(Landroidx/compose/ui/window/SecureFlagPolicy;Z)V", "(Z)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/window/SecureFlagPolicy;", "getSecurePolicy", "()Landroidx/compose/ui/window/SecureFlagPolicy;", "Z", "getShouldDismissOnBackPress", "()Z", "material3_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class ModalBottomSheetProperties {
    private final SecureFlagPolicy securePolicy;
    private final boolean shouldDismissOnBackPress;

    /* JADX WARN: Multi-variable type inference failed */
    public ModalBottomSheetProperties() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public ModalBottomSheetProperties(SecureFlagPolicy secureFlagPolicy, boolean z) {
        this.securePolicy = secureFlagPolicy;
        this.shouldDismissOnBackPress = z;
    }

    public /* synthetic */ ModalBottomSheetProperties(SecureFlagPolicy secureFlagPolicy, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i & 2) != 0 ? true : z);
    }

    public final SecureFlagPolicy getSecurePolicy() {
        return this.securePolicy;
    }

    public final boolean getShouldDismissOnBackPress() {
        return this.shouldDismissOnBackPress;
    }

    public /* synthetic */ ModalBottomSheetProperties(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    public ModalBottomSheetProperties(boolean z) {
        this(SecureFlagPolicy.Inherit, z);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ModalBottomSheetProperties) && this.securePolicy == ((ModalBottomSheetProperties) other).securePolicy;
    }

    public int hashCode() {
        return (this.securePolicy.hashCode() * 31) + Boolean.hashCode(this.shouldDismissOnBackPress);
    }
}
