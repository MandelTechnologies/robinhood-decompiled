package androidx.camera.core;

import androidx.camera.core.CameraState;

/* loaded from: classes4.dex */
final class AutoValue_CameraState extends CameraState {
    private final CameraState.StateError error;

    /* renamed from: type, reason: collision with root package name */
    private final CameraState.Type f9660type;

    AutoValue_CameraState(CameraState.Type type2, CameraState.StateError stateError) {
        if (type2 == null) {
            throw new NullPointerException("Null type");
        }
        this.f9660type = type2;
        this.error = stateError;
    }

    @Override // androidx.camera.core.CameraState
    public CameraState.Type getType() {
        return this.f9660type;
    }

    @Override // androidx.camera.core.CameraState
    public CameraState.StateError getError() {
        return this.error;
    }

    public String toString() {
        return "CameraState{type=" + this.f9660type + ", error=" + this.error + "}";
    }

    public boolean equals(Object obj) {
        CameraState.StateError stateError;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CameraState) {
            CameraState cameraState = (CameraState) obj;
            if (this.f9660type.equals(cameraState.getType()) && ((stateError = this.error) != null ? stateError.equals(cameraState.getError()) : cameraState.getError() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f9660type.hashCode() ^ 1000003) * 1000003;
        CameraState.StateError stateError = this.error;
        return iHashCode ^ (stateError == null ? 0 : stateError.hashCode());
    }
}
