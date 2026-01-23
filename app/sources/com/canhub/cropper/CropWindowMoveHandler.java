package com.canhub.cropper;

import android.graphics.PointF;
import android.graphics.RectF;
import com.robinhood.android.gold.contracts.GoldFeature;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CropWindowMoveHandler.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0000\u0018\u0000 82\u00020\u0001:\u000289B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJH\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u0018\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J@\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001bH\u0002J\u0018\u0010\"\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J \u0010#\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0007H\u0002JH\u0010$\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001bH\u0002J\u0018\u0010'\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J@\u0010(\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J \u0010*\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J\u0018\u0010+\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J \u0010,\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002JN\u0010-\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u0007J@\u00101\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u0007H\u0002JH\u00103\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J@\u00104\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0007H\u0002J \u00105\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u00107\u001a\u00020\u0007H\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, m3636d2 = {"Lcom/canhub/cropper/CropWindowMoveHandler;", "", "type", "Lcom/canhub/cropper/CropWindowMoveHandler$Type;", "cropWindowHandler", "Lcom/canhub/cropper/CropWindowHandler;", "touchX", "", "touchY", "(Lcom/canhub/cropper/CropWindowMoveHandler$Type;Lcom/canhub/cropper/CropWindowHandler;FF)V", "mMaxCropHeight", "mMaxCropWidth", "mMinCropHeight", "mMinCropWidth", "mTouchOffset", "Landroid/graphics/PointF;", "adjustBottom", "", "rect", "Landroid/graphics/RectF;", "bottom", "bounds", "viewHeight", "", "snapMargin", "aspectRatio", "leftMoves", "", "rightMoves", "adjustBottomByAspectRatio", "adjustLeft", "left", "topMoves", "bottomMoves", "adjustLeftByAspectRatio", "adjustLeftRightByAspectRatio", "adjustRight", "right", "viewWidth", "adjustRightByAspectRatio", "adjustTop", "top", "adjustTopBottomByAspectRatio", "adjustTopByAspectRatio", "calculateTouchOffset", "move", "x", "y", "fixedAspectRatio", "moveCenter", "snapRadius", "moveSizeWithFixedAspectRatio", "moveSizeWithFreeAspectRatio", "snapEdgesToBounds", "edges", GoldFeature.MARGIN, "Companion", "Type", "cropper_release"}, m3637k = 1, m3638mv = {1, 7, 1}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class CropWindowMoveHandler {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final float mMaxCropHeight;
    private final float mMaxCropWidth;
    private final float mMinCropHeight;
    private final float mMinCropWidth;
    private final PointF mTouchOffset;
    private final Type type;

    /* compiled from: CropWindowMoveHandler.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m3636d2 = {"Lcom/canhub/cropper/CropWindowMoveHandler$Type;", "", "(Ljava/lang/String;I)V", "TOP_LEFT", "TOP_RIGHT", "BOTTOM_LEFT", "BOTTOM_RIGHT", "LEFT", "TOP", "RIGHT", "BOTTOM", "CENTER", "cropper_release"}, m3637k = 1, m3638mv = {1, 7, 1}, m3640xi = 48)
    public enum Type {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        CENTER
    }

    /* compiled from: CropWindowMoveHandler.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 7, 1}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Type.BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Type.BOTTOM_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Type.LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Type.TOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Type.RIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Type.BOTTOM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Type.CENTER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CropWindowMoveHandler(Type type2, CropWindowHandler cropWindowHandler, float f, float f2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(cropWindowHandler, "cropWindowHandler");
        this.type = type2;
        this.mMinCropWidth = cropWindowHandler.getMinCropWidth();
        this.mMinCropHeight = cropWindowHandler.getMinCropHeight();
        this.mMaxCropWidth = cropWindowHandler.getMaxCropWidth();
        this.mMaxCropHeight = cropWindowHandler.getMaxCropHeight();
        this.mTouchOffset = new PointF(0.0f, 0.0f);
        calculateTouchOffset(cropWindowHandler.getRect(), f, f2);
    }

    /* compiled from: CropWindowMoveHandler.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J-\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/canhub/cropper/CropWindowMoveHandler$Companion;", "", "()V", "calculateAspectRatio", "", "left", "top", "right", "bottom", "calculateAspectRatio$cropper_release", "cropper_release"}, m3637k = 1, m3638mv = {1, 7, 1}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float calculateAspectRatio$cropper_release(float left, float top, float right, float bottom) {
            return (right - left) / (bottom - top);
        }

        private Companion() {
        }
    }

    public final void move(RectF rect, float x, float y, RectF bounds, int viewWidth, int viewHeight, float snapMargin, boolean fixedAspectRatio, float aspectRatio) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        PointF pointF = this.mTouchOffset;
        float f = pointF.x + x;
        float f2 = pointF.y + y;
        if (this.type == Type.CENTER) {
            moveCenter(rect, f, f2, bounds, viewWidth, viewHeight, snapMargin);
        } else if (fixedAspectRatio) {
            moveSizeWithFixedAspectRatio(rect, f, f2, bounds, viewWidth, viewHeight, snapMargin, aspectRatio);
        } else {
            moveSizeWithFreeAspectRatio(rect, f, f2, bounds, viewWidth, viewHeight, snapMargin);
        }
    }

    private final void calculateTouchOffset(RectF rect, float touchX, float touchY) {
        float fCenterY;
        float f;
        float f2;
        float fCenterX = 0.0f;
        switch (WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()]) {
            case 1:
                fCenterX = rect.left - touchX;
                fCenterY = rect.top;
                f2 = fCenterY - touchY;
                break;
            case 2:
                fCenterX = rect.right - touchX;
                fCenterY = rect.top;
                f2 = fCenterY - touchY;
                break;
            case 3:
                fCenterX = rect.left - touchX;
                fCenterY = rect.bottom;
                f2 = fCenterY - touchY;
                break;
            case 4:
                fCenterX = rect.right - touchX;
                fCenterY = rect.bottom;
                f2 = fCenterY - touchY;
                break;
            case 5:
                f = rect.left;
                fCenterX = f - touchX;
                f2 = 0.0f;
                break;
            case 6:
                fCenterY = rect.top;
                f2 = fCenterY - touchY;
                break;
            case 7:
                f = rect.right;
                fCenterX = f - touchX;
                f2 = 0.0f;
                break;
            case 8:
                fCenterY = rect.bottom;
                f2 = fCenterY - touchY;
                break;
            case 9:
                fCenterX = rect.centerX() - touchX;
                fCenterY = rect.centerY();
                f2 = fCenterY - touchY;
                break;
            default:
                f2 = 0.0f;
                break;
        }
        PointF pointF = this.mTouchOffset;
        pointF.x = fCenterX;
        pointF.y = f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void moveCenter(RectF rect, float x, float y, RectF bounds, int viewWidth, int viewHeight, float snapRadius) {
        float fCenterX = x - rect.centerX();
        float fCenterY = y - rect.centerY();
        float f = rect.left;
        if (f + fCenterX >= 0.0f) {
            float f2 = rect.right;
            if (f2 + fCenterX > viewWidth || f + fCenterX < bounds.left || f2 + fCenterX > bounds.right) {
                fCenterX /= 1.05f;
                this.mTouchOffset.x -= fCenterX / 2;
            }
        }
        float f3 = rect.top;
        if (f3 + fCenterY >= 0.0f) {
            float f4 = rect.bottom;
            if (f4 + fCenterY > viewHeight || f3 + fCenterY < bounds.top || f4 + fCenterY > bounds.bottom) {
                fCenterY /= 1.05f;
                this.mTouchOffset.y -= fCenterY / 2;
            }
        }
        rect.offset(fCenterX, fCenterY);
        snapEdgesToBounds(rect, bounds, snapRadius);
    }

    private final void moveSizeWithFreeAspectRatio(RectF rect, float x, float y, RectF bounds, int viewWidth, int viewHeight, float snapMargin) {
        switch (WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()]) {
            case 1:
                adjustTop(rect, y, bounds, snapMargin, 0.0f, false, false);
                adjustLeft(rect, x, bounds, snapMargin, 0.0f, false, false);
                break;
            case 2:
                adjustTop(rect, y, bounds, snapMargin, 0.0f, false, false);
                adjustRight(rect, x, bounds, viewWidth, snapMargin, 0.0f, false, false);
                break;
            case 3:
                adjustBottom(rect, y, bounds, viewHeight, snapMargin, 0.0f, false, false);
                adjustLeft(rect, x, bounds, snapMargin, 0.0f, false, false);
                break;
            case 4:
                adjustBottom(rect, y, bounds, viewHeight, snapMargin, 0.0f, false, false);
                adjustRight(rect, x, bounds, viewWidth, snapMargin, 0.0f, false, false);
                break;
            case 5:
                adjustLeft(rect, x, bounds, snapMargin, 0.0f, false, false);
                break;
            case 6:
                adjustTop(rect, y, bounds, snapMargin, 0.0f, false, false);
                break;
            case 7:
                adjustRight(rect, x, bounds, viewWidth, snapMargin, 0.0f, false, false);
                break;
            case 8:
                adjustBottom(rect, y, bounds, viewHeight, snapMargin, 0.0f, false, false);
                break;
        }
    }

    private final void moveSizeWithFixedAspectRatio(RectF rect, float x, float y, RectF bounds, int viewWidth, int viewHeight, float snapMargin, float aspectRatio) {
        switch (WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()]) {
            case 1:
                if (INSTANCE.calculateAspectRatio$cropper_release(x, y, rect.right, rect.bottom) < aspectRatio) {
                    adjustTop(rect, y, bounds, snapMargin, aspectRatio, true, false);
                    adjustLeftByAspectRatio(rect, aspectRatio);
                    break;
                } else {
                    adjustLeft(rect, x, bounds, snapMargin, aspectRatio, true, false);
                    adjustTopByAspectRatio(rect, aspectRatio);
                    break;
                }
            case 2:
                if (INSTANCE.calculateAspectRatio$cropper_release(rect.left, y, x, rect.bottom) < aspectRatio) {
                    adjustTop(rect, y, bounds, snapMargin, aspectRatio, false, true);
                    adjustRightByAspectRatio(rect, aspectRatio);
                    break;
                } else {
                    adjustRight(rect, x, bounds, viewWidth, snapMargin, aspectRatio, true, false);
                    adjustTopByAspectRatio(rect, aspectRatio);
                    break;
                }
            case 3:
                if (INSTANCE.calculateAspectRatio$cropper_release(x, rect.top, rect.right, y) < aspectRatio) {
                    adjustBottom(rect, y, bounds, viewHeight, snapMargin, aspectRatio, true, false);
                    adjustLeftByAspectRatio(rect, aspectRatio);
                    break;
                } else {
                    adjustLeft(rect, x, bounds, snapMargin, aspectRatio, false, true);
                    adjustBottomByAspectRatio(rect, aspectRatio);
                    break;
                }
            case 4:
                if (INSTANCE.calculateAspectRatio$cropper_release(rect.left, rect.top, x, y) < aspectRatio) {
                    adjustBottom(rect, y, bounds, viewHeight, snapMargin, aspectRatio, false, true);
                    adjustRightByAspectRatio(rect, aspectRatio);
                    break;
                } else {
                    adjustRight(rect, x, bounds, viewWidth, snapMargin, aspectRatio, false, true);
                    adjustBottomByAspectRatio(rect, aspectRatio);
                    break;
                }
            case 5:
                adjustLeft(rect, x, bounds, snapMargin, aspectRatio, true, true);
                adjustTopBottomByAspectRatio(rect, bounds, aspectRatio);
                break;
            case 6:
                adjustTop(rect, y, bounds, snapMargin, aspectRatio, true, true);
                adjustLeftRightByAspectRatio(rect, bounds, aspectRatio);
                break;
            case 7:
                adjustRight(rect, x, bounds, viewWidth, snapMargin, aspectRatio, true, true);
                adjustTopBottomByAspectRatio(rect, bounds, aspectRatio);
                break;
            case 8:
                adjustBottom(rect, y, bounds, viewHeight, snapMargin, aspectRatio, true, true);
                adjustLeftRightByAspectRatio(rect, bounds, aspectRatio);
                break;
        }
    }

    private final void snapEdgesToBounds(RectF edges, RectF bounds, float margin) {
        float f = edges.left;
        float f2 = bounds.left;
        if (f < f2 + margin) {
            edges.offset(f2 - f, 0.0f);
        }
        float f3 = edges.top;
        float f4 = bounds.top;
        if (f3 < f4 + margin) {
            edges.offset(0.0f, f4 - f3);
        }
        float f5 = edges.right;
        float f6 = bounds.right;
        if (f5 > f6 - margin) {
            edges.offset(f6 - f5, 0.0f);
        }
        float f7 = edges.bottom;
        float f8 = bounds.bottom;
        if (f7 > f8 - margin) {
            edges.offset(0.0f, f8 - f7);
        }
    }

    private final void adjustLeft(RectF rect, float left, RectF bounds, float snapMargin, float aspectRatio, boolean topMoves, boolean bottomMoves) {
        if (left < 0.0f) {
            left /= 1.05f;
            this.mTouchOffset.x -= left / 1.1f;
        }
        float f = bounds.left;
        if (left < f) {
            this.mTouchOffset.x -= (left - f) / 2.0f;
        }
        if (left - f < snapMargin) {
            left = f;
        }
        float f2 = rect.right;
        float f3 = f2 - left;
        float f4 = this.mMinCropWidth;
        if (f3 < f4) {
            left = f2 - f4;
        }
        float f5 = f2 - left;
        float f6 = this.mMaxCropWidth;
        if (f5 > f6) {
            left = f2 - f6;
        }
        if (left - f < snapMargin) {
            left = f;
        }
        if (aspectRatio > 0.0f) {
            float f7 = (f2 - left) / aspectRatio;
            float f8 = this.mMinCropHeight;
            if (f7 < f8) {
                left = Math.max(f, f2 - (f8 * aspectRatio));
                f7 = (rect.right - left) / aspectRatio;
            }
            float f9 = this.mMaxCropHeight;
            if (f7 > f9) {
                left = Math.max(bounds.left, rect.right - (f9 * aspectRatio));
                f7 = (rect.right - left) / aspectRatio;
            }
            if (topMoves && bottomMoves) {
                left = Math.max(left, Math.max(bounds.left, rect.right - (bounds.height() * aspectRatio)));
            } else {
                if (topMoves) {
                    float f10 = rect.bottom;
                    float f11 = f10 - f7;
                    float f12 = bounds.top;
                    if (f11 < f12) {
                        left = Math.max(bounds.left, rect.right - ((f10 - f12) * aspectRatio));
                        f7 = (rect.right - left) / aspectRatio;
                    }
                }
                if (bottomMoves) {
                    float f13 = rect.top;
                    float f14 = f7 + f13;
                    float f15 = bounds.bottom;
                    if (f14 > f15) {
                        left = Math.max(left, Math.max(bounds.left, rect.right - ((f15 - f13) * aspectRatio)));
                    }
                }
            }
        }
        rect.left = left;
    }

    private final void adjustRight(RectF rect, float right, RectF bounds, int viewWidth, float snapMargin, float aspectRatio, boolean topMoves, boolean bottomMoves) {
        float f = viewWidth;
        if (right > f) {
            right = ((right - f) / 1.05f) + f;
            this.mTouchOffset.x -= (right - f) / 1.1f;
        }
        float f2 = bounds.right;
        if (right > f2) {
            this.mTouchOffset.x -= (right - f2) / 2.0f;
        }
        if (f2 - right < snapMargin) {
            right = f2;
        }
        float f3 = rect.left;
        float f4 = right - f3;
        float f5 = this.mMinCropWidth;
        if (f4 < f5) {
            right = f3 + f5;
        }
        float f6 = right - f3;
        float f7 = this.mMaxCropWidth;
        if (f6 > f7) {
            right = f3 + f7;
        }
        if (f2 - right < snapMargin) {
            right = f2;
        }
        if (aspectRatio > 0.0f) {
            float f8 = (right - f3) / aspectRatio;
            float f9 = this.mMinCropHeight;
            if (f8 < f9) {
                right = Math.min(f2, f3 + (f9 * aspectRatio));
                f8 = (right - rect.left) / aspectRatio;
            }
            float f10 = this.mMaxCropHeight;
            if (f8 > f10) {
                right = Math.min(bounds.right, rect.left + (f10 * aspectRatio));
                f8 = (right - rect.left) / aspectRatio;
            }
            if (topMoves && bottomMoves) {
                right = Math.min(right, Math.min(bounds.right, rect.left + (bounds.height() * aspectRatio)));
            } else {
                if (topMoves) {
                    float f11 = rect.bottom;
                    float f12 = f11 - f8;
                    float f13 = bounds.top;
                    if (f12 < f13) {
                        right = Math.min(bounds.right, rect.left + ((f11 - f13) * aspectRatio));
                        f8 = (right - rect.left) / aspectRatio;
                    }
                }
                if (bottomMoves) {
                    float f14 = rect.top;
                    float f15 = f8 + f14;
                    float f16 = bounds.bottom;
                    if (f15 > f16) {
                        right = Math.min(right, Math.min(bounds.right, rect.left + ((f16 - f14) * aspectRatio)));
                    }
                }
            }
        }
        rect.right = right;
    }

    private final void adjustTop(RectF rect, float top, RectF bounds, float snapMargin, float aspectRatio, boolean leftMoves, boolean rightMoves) {
        if (top < 0.0f) {
            top /= 1.05f;
            this.mTouchOffset.y -= top / 1.1f;
        }
        float f = bounds.top;
        if (top < f) {
            this.mTouchOffset.y -= (top - f) / 2.0f;
        }
        if (top - f < snapMargin) {
            top = f;
        }
        float f2 = rect.bottom;
        float f3 = f2 - top;
        float f4 = this.mMinCropHeight;
        if (f3 < f4) {
            top = f2 - f4;
        }
        float f5 = f2 - top;
        float f6 = this.mMaxCropHeight;
        if (f5 > f6) {
            top = f2 - f6;
        }
        if (top - f < snapMargin) {
            top = f;
        }
        if (aspectRatio > 0.0f) {
            float f7 = (f2 - top) * aspectRatio;
            float f8 = this.mMinCropWidth;
            if (f7 < f8) {
                top = Math.max(f, f2 - (f8 / aspectRatio));
                f7 = (rect.bottom - top) * aspectRatio;
            }
            float f9 = this.mMaxCropWidth;
            if (f7 > f9) {
                top = Math.max(bounds.top, rect.bottom - (f9 / aspectRatio));
                f7 = (rect.bottom - top) * aspectRatio;
            }
            if (leftMoves && rightMoves) {
                top = Math.max(top, Math.max(bounds.top, rect.bottom - (bounds.width() / aspectRatio)));
            } else {
                if (leftMoves) {
                    float f10 = rect.right;
                    float f11 = f10 - f7;
                    float f12 = bounds.left;
                    if (f11 < f12) {
                        top = Math.max(bounds.top, rect.bottom - ((f10 - f12) / aspectRatio));
                        f7 = (rect.bottom - top) * aspectRatio;
                    }
                }
                if (rightMoves) {
                    float f13 = rect.left;
                    float f14 = f7 + f13;
                    float f15 = bounds.right;
                    if (f14 > f15) {
                        top = Math.max(top, Math.max(bounds.top, rect.bottom - ((f15 - f13) / aspectRatio)));
                    }
                }
            }
        }
        rect.top = top;
    }

    private final void adjustBottom(RectF rect, float bottom, RectF bounds, int viewHeight, float snapMargin, float aspectRatio, boolean leftMoves, boolean rightMoves) {
        float f = viewHeight;
        if (bottom > f) {
            bottom = ((bottom - f) / 1.05f) + f;
            this.mTouchOffset.y -= (bottom - f) / 1.1f;
        }
        float f2 = bounds.bottom;
        if (bottom > f2) {
            this.mTouchOffset.y -= (bottom - f2) / 2.0f;
        }
        if (f2 - bottom < snapMargin) {
            bottom = f2;
        }
        float f3 = rect.top;
        float f4 = bottom - f3;
        float f5 = this.mMinCropHeight;
        if (f4 < f5) {
            bottom = f3 + f5;
        }
        float f6 = bottom - f3;
        float f7 = this.mMaxCropHeight;
        if (f6 > f7) {
            bottom = f3 + f7;
        }
        if (f2 - bottom < snapMargin) {
            bottom = f2;
        }
        if (aspectRatio > 0.0f) {
            float f8 = (bottom - f3) * aspectRatio;
            float f9 = this.mMinCropWidth;
            if (f8 < f9) {
                bottom = Math.min(f2, f3 + (f9 / aspectRatio));
                f8 = (bottom - rect.top) * aspectRatio;
            }
            float f10 = this.mMaxCropWidth;
            if (f8 > f10) {
                bottom = Math.min(bounds.bottom, rect.top + (f10 / aspectRatio));
                f8 = (bottom - rect.top) * aspectRatio;
            }
            if (leftMoves && rightMoves) {
                bottom = Math.min(bottom, Math.min(bounds.bottom, rect.top + (bounds.width() / aspectRatio)));
            } else {
                if (leftMoves) {
                    float f11 = rect.right;
                    float f12 = f11 - f8;
                    float f13 = bounds.left;
                    if (f12 < f13) {
                        bottom = Math.min(bounds.bottom, rect.top + ((f11 - f13) / aspectRatio));
                        f8 = (bottom - rect.top) * aspectRatio;
                    }
                }
                if (rightMoves) {
                    float f14 = rect.left;
                    float f15 = f8 + f14;
                    float f16 = bounds.right;
                    if (f15 > f16) {
                        bottom = Math.min(bottom, Math.min(bounds.bottom, rect.top + ((f16 - f14) / aspectRatio)));
                    }
                }
            }
        }
        rect.bottom = bottom;
    }

    private final void adjustLeftByAspectRatio(RectF rect, float aspectRatio) {
        rect.left = rect.right - (rect.height() * aspectRatio);
    }

    private final void adjustTopByAspectRatio(RectF rect, float aspectRatio) {
        rect.top = rect.bottom - (rect.width() / aspectRatio);
    }

    private final void adjustRightByAspectRatio(RectF rect, float aspectRatio) {
        rect.right = rect.left + (rect.height() * aspectRatio);
    }

    private final void adjustBottomByAspectRatio(RectF rect, float aspectRatio) {
        rect.bottom = rect.top + (rect.width() / aspectRatio);
    }

    private final void adjustLeftRightByAspectRatio(RectF rect, RectF bounds, float aspectRatio) {
        rect.inset((rect.width() - (rect.height() * aspectRatio)) / 2, 0.0f);
        float f = rect.left;
        float f2 = bounds.left;
        if (f < f2) {
            rect.offset(f2 - f, 0.0f);
        }
        float f3 = rect.right;
        float f4 = bounds.right;
        if (f3 > f4) {
            rect.offset(f4 - f3, 0.0f);
        }
    }

    private final void adjustTopBottomByAspectRatio(RectF rect, RectF bounds, float aspectRatio) {
        rect.inset(0.0f, (rect.height() - (rect.width() / aspectRatio)) / 2);
        float f = rect.top;
        float f2 = bounds.top;
        if (f < f2) {
            rect.offset(0.0f, f2 - f);
        }
        float f3 = rect.bottom;
        float f4 = bounds.bottom;
        if (f3 > f4) {
            rect.offset(0.0f, f4 - f3);
        }
    }
}
