package com.robinhood.android.microgramsdui;

import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.microgram.sdui.BottomSheetMessage3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.p507ui.p508v1.BottomSheetContentDto;

/* compiled from: MicrogramBottomSheetDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/BottomSheetViewState;", "", "<init>", "()V", "Loading", "Success", "Lcom/robinhood/android/microgramsdui/BottomSheetViewState$Loading;", "Lcom/robinhood/android/microgramsdui/BottomSheetViewState$Success;", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.microgramsdui.BottomSheetViewState, reason: use source file name */
/* loaded from: classes8.dex */
public abstract class MicrogramBottomSheetDuxo3 {
    public static final int $stable = 0;

    public /* synthetic */ MicrogramBottomSheetDuxo3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: MicrogramBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/BottomSheetViewState$Loading;", "Lcom/robinhood/android/microgramsdui/BottomSheetViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.microgramsdui.BottomSheetViewState$Loading */
    public static final /* data */ class Loading extends MicrogramBottomSheetDuxo3 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 389676776;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    private MicrogramBottomSheetDuxo3() {
    }

    /* compiled from: MicrogramBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006HÆ\u0003J#\u0010\f\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/BottomSheetViewState$Success;", "Lcom/robinhood/android/microgramsdui/BottomSheetViewState;", "screen", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/BottomSheetPayload;", "Lmicrogram/ui/v1/BottomSheetContentDto;", "Lcom/robinhood/microgram/sdui/AnyBottomSheetPayload;", "<init>", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)V", "getScreen", "()Lcom/robinhood/android/shared/serverui/utils/UiObject;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.microgramsdui.BottomSheetViewState$Success, reason: from toString */
    public static final /* data */ class Success extends MicrogramBottomSheetDuxo3 {
        public static final int $stable = 8;
        private final UiObject<BottomSheetMessage3, BottomSheetContentDto> screen;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, UiObject uiObject, int i, Object obj) {
            if ((i & 1) != 0) {
                uiObject = success.screen;
            }
            return success.copy(uiObject);
        }

        public final UiObject<BottomSheetMessage3, BottomSheetContentDto> component1() {
            return this.screen;
        }

        public final Success copy(UiObject<BottomSheetMessage3, BottomSheetContentDto> screen) {
            Intrinsics.checkNotNullParameter(screen, "screen");
            return new Success(screen);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.screen, ((Success) other).screen);
        }

        public int hashCode() {
            return this.screen.hashCode();
        }

        public String toString() {
            return "Success(screen=" + this.screen + ")";
        }

        public final UiObject<BottomSheetMessage3, BottomSheetContentDto> getScreen() {
            return this.screen;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(UiObject<BottomSheetMessage3, BottomSheetContentDto> screen) {
            super(null);
            Intrinsics.checkNotNullParameter(screen, "screen");
            this.screen = screen;
        }
    }
}
