package com.canhub.cropper;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.TypedValue;
import com.canhub.cropper.CropImageView;
import com.plaid.internal.EnumC7081g;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CropImageOptions.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B×\u0005\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\n\u001a\u00020\t\u0012\b\b\u0003\u0010\u000b\u001a\u00020\t\u0012\b\b\u0003\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0014\u0012\b\b\u0003\u0010\u001e\u001a\u00020\t\u0012\b\b\u0003\u0010\u001f\u001a\u00020\u0014\u0012\b\b\u0003\u0010 \u001a\u00020\t\u0012\b\b\u0003\u0010!\u001a\u00020\t\u0012\b\b\u0003\u0010\"\u001a\u00020\t\u0012\b\b\u0003\u0010#\u001a\u00020\u0014\u0012\b\b\u0003\u0010$\u001a\u00020\u0014\u0012\b\b\u0003\u0010%\u001a\u00020\t\u0012\b\b\u0003\u0010&\u001a\u00020\u0014\u0012\b\b\u0003\u0010'\u001a\u00020\u0014\u0012\b\b\u0003\u0010(\u001a\u00020\u0014\u0012\b\b\u0003\u0010)\u001a\u00020\u0014\u0012\b\b\u0003\u0010*\u001a\u00020\u0014\u0012\b\b\u0003\u0010+\u001a\u00020\u0014\u0012\b\b\u0003\u0010,\u001a\u00020\u0014\u0012\b\b\u0003\u0010-\u001a\u00020\u0014\u0012\b\b\u0002\u0010/\u001a\u00020.\u0012\b\b\u0003\u00100\u001a\u00020\u0014\u0012\n\b\u0003\u00101\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\b\b\u0002\u00105\u001a\u000204\u0012\b\b\u0002\u00106\u001a\u00020\u0014\u0012\b\b\u0003\u00107\u001a\u00020\u0014\u0012\b\b\u0003\u00108\u001a\u00020\u0014\u0012\b\b\u0002\u0010:\u001a\u000209\u0012\b\b\u0002\u0010;\u001a\u00020\u0002\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<\u0012\b\b\u0002\u0010>\u001a\u00020\u0014\u0012\b\b\u0002\u0010?\u001a\u00020\u0002\u0012\b\b\u0002\u0010@\u001a\u00020\u0002\u0012\b\b\u0002\u0010A\u001a\u00020\u0002\u0012\b\b\u0002\u0010B\u001a\u00020\u0014\u0012\b\b\u0002\u0010C\u001a\u00020\u0002\u0012\b\b\u0002\u0010D\u001a\u00020\u0002\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010.\u0012\b\b\u0003\u0010F\u001a\u00020\u0014\u0012\b\b\u0002\u0010G\u001a\u00020\u0002\u0012\b\b\u0002\u0010H\u001a\u00020\u0002\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010I\u0012\u0010\b\u0002\u0010L\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010K\u0012\b\b\u0003\u0010M\u001a\u00020\t\u0012\b\b\u0003\u0010N\u001a\u00020\u0014\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010I\u0012\b\b\u0003\u0010P\u001a\u00020\u0014\u0012\n\b\u0003\u0010Q\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0003\u0010R\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0003\u0010S\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0003\u0010T\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\bU\u0010VJ\u0010\u0010W\u001a\u00020IHÖ\u0001¢\u0006\u0004\bW\u0010XJ\u0010\u0010Y\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\bY\u0010ZJ\u001a\u0010]\u001a\u00020\u00022\b\u0010\\\u001a\u0004\u0018\u00010[HÖ\u0003¢\u0006\u0004\b]\u0010^J\u0010\u0010_\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b_\u0010ZJ \u0010d\u001a\u00020c2\u0006\u0010a\u001a\u00020`2\u0006\u0010b\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\bd\u0010eR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010fR\u0016\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010gR\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\b\u0010hR\u0016\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010iR\u0016\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010iR\u0016\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010iR\u0016\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010jR\u0016\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010kR\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010fR\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010fR\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010fR\u0016\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010lR\u0016\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010fR\u0016\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010fR\u0016\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010fR\u0016\u0010\u0019\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010lR\u0016\u0010\u001a\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010iR\u0016\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010fR\u0016\u0010\u001c\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010lR\u0016\u0010\u001d\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010lR\u0016\u0010\u001e\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010iR\u0016\u0010\u001f\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010lR\u0016\u0010 \u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010iR\u0016\u0010!\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b!\u0010iR\u0016\u0010\"\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\"\u0010iR\u0016\u0010#\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b#\u0010lR\u0016\u0010$\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b$\u0010lR\u0016\u0010%\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b%\u0010iR\u0016\u0010&\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b&\u0010lR\u0016\u0010'\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b'\u0010lR\u0016\u0010(\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b(\u0010lR\u0016\u0010)\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b)\u0010lR\u0016\u0010*\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b*\u0010lR\u0016\u0010+\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b+\u0010lR\u0016\u0010,\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b,\u0010lR\u0016\u0010-\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b-\u0010lR\u0016\u0010/\u001a\u00020.8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b/\u0010mR\u0016\u00100\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b0\u0010lR\u0018\u00101\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b1\u0010nR\u0018\u00103\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b3\u0010oR\u0016\u00105\u001a\u0002048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b5\u0010pR\u0016\u00106\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b6\u0010lR\u0016\u00107\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b7\u0010lR\u0016\u00108\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b8\u0010lR\u0016\u0010:\u001a\u0002098\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b:\u0010qR\u0016\u0010;\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b;\u0010fR\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b=\u0010rR\u0016\u0010>\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b>\u0010lR\u0016\u0010?\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b?\u0010fR\u0016\u0010@\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b@\u0010fR\u0016\u0010A\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bA\u0010fR\u0016\u0010B\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bB\u0010lR\u0016\u0010C\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bC\u0010fR\u0016\u0010D\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bD\u0010fR\u0018\u0010E\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bE\u0010mR\u0016\u0010F\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bF\u0010lR\u0016\u0010G\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bG\u0010fR\u0016\u0010H\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bH\u0010fR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bJ\u0010sR\u001e\u0010L\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010K8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bL\u0010tR\u0016\u0010M\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bM\u0010iR\u0016\u0010N\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bN\u0010lR\u0018\u0010O\u001a\u0004\u0018\u00010I8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bO\u0010sR\u0016\u0010P\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bP\u0010lR\u0018\u0010Q\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bQ\u0010nR\u0018\u0010R\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bR\u0010nR\u0018\u0010S\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bS\u0010nR\u0018\u0010T\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bT\u0010n¨\u0006u"}, m3636d2 = {"Lcom/canhub/cropper/CropImageOptions;", "Landroid/os/Parcelable;", "", "imageSourceIncludeGallery", "imageSourceIncludeCamera", "Lcom/canhub/cropper/CropImageView$CropShape;", "cropShape", "Lcom/canhub/cropper/CropImageView$CropCornerShape;", "cornerShape", "", "cropCornerRadius", "snapRadius", "touchRadius", "Lcom/canhub/cropper/CropImageView$Guidelines;", "guidelines", "Lcom/canhub/cropper/CropImageView$ScaleType;", "scaleType", "showCropOverlay", "showCropLabel", "showProgressBar", "", "progressBarColor", "autoZoomEnabled", "multiTouchEnabled", "centerMoveEnabled", "maxZoom", "initialCropWindowPaddingRatio", "fixAspectRatio", "aspectRatioX", "aspectRatioY", "borderLineThickness", "borderLineColor", "borderCornerThickness", "borderCornerOffset", "borderCornerLength", "borderCornerColor", "circleCornerFillColorHexValue", "guidelinesThickness", "guidelinesColor", "backgroundColor", "minCropWindowWidth", "minCropWindowHeight", "minCropResultWidth", "minCropResultHeight", "maxCropResultWidth", "maxCropResultHeight", "", "activityTitle", "activityMenuIconColor", "activityMenuTextColor", "Landroid/net/Uri;", "customOutputUri", "Landroid/graphics/Bitmap$CompressFormat;", "outputCompressFormat", "outputCompressQuality", "outputRequestWidth", "outputRequestHeight", "Lcom/canhub/cropper/CropImageView$RequestSizeOptions;", "outputRequestSizeOptions", "noOutputImage", "Landroid/graphics/Rect;", "initialCropWindowRectangle", "initialRotation", "allowRotation", "allowFlipping", "allowCounterRotation", "rotationDegrees", "flipHorizontally", "flipVertically", "cropMenuCropButtonTitle", "cropMenuCropButtonIcon", "skipEditing", "showIntentChooser", "", "intentChooserTitle", "", "intentChooserPriorityList", "cropperLabelTextSize", "cropperLabelTextColor", "cropperLabelText", "activityBackgroundColor", "toolbarColor", "toolbarTitleColor", "toolbarBackButtonColor", "toolbarTintColor", "<init>", "(ZZLcom/canhub/cropper/CropImageView$CropShape;Lcom/canhub/cropper/CropImageView$CropCornerShape;FFFLcom/canhub/cropper/CropImageView$Guidelines;Lcom/canhub/cropper/CropImageView$ScaleType;ZZZIZZZIFZIIFIFFFIIFIIIIIIIILjava/lang/CharSequence;ILjava/lang/Integer;Landroid/net/Uri;Landroid/graphics/Bitmap$CompressFormat;IIILcom/canhub/cropper/CropImageView$RequestSizeOptions;ZLandroid/graphics/Rect;IZZZIZZLjava/lang/CharSequence;IZZLjava/lang/String;Ljava/util/List;FILjava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "Lcom/canhub/cropper/CropImageView$CropShape;", "Lcom/canhub/cropper/CropImageView$CropCornerShape;", "F", "Lcom/canhub/cropper/CropImageView$Guidelines;", "Lcom/canhub/cropper/CropImageView$ScaleType;", "I", "Ljava/lang/CharSequence;", "Ljava/lang/Integer;", "Landroid/net/Uri;", "Landroid/graphics/Bitmap$CompressFormat;", "Lcom/canhub/cropper/CropImageView$RequestSizeOptions;", "Landroid/graphics/Rect;", "Ljava/lang/String;", "Ljava/util/List;", "cropper_release"}, m3637k = 1, m3638mv = {1, 7, 1}, m3640xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class CropImageOptions implements Parcelable {
    public static final Parcelable.Creator<CropImageOptions> CREATOR = new Creator();

    @JvmField
    public int activityBackgroundColor;

    @JvmField
    public int activityMenuIconColor;

    @JvmField
    public Integer activityMenuTextColor;

    @JvmField
    public CharSequence activityTitle;

    @JvmField
    public boolean allowCounterRotation;

    @JvmField
    public boolean allowFlipping;

    @JvmField
    public boolean allowRotation;

    @JvmField
    public int aspectRatioX;

    @JvmField
    public int aspectRatioY;

    @JvmField
    public boolean autoZoomEnabled;

    @JvmField
    public int backgroundColor;

    @JvmField
    public int borderCornerColor;

    @JvmField
    public float borderCornerLength;

    @JvmField
    public float borderCornerOffset;

    @JvmField
    public float borderCornerThickness;

    @JvmField
    public int borderLineColor;

    @JvmField
    public float borderLineThickness;

    @JvmField
    public boolean centerMoveEnabled;

    @JvmField
    public int circleCornerFillColorHexValue;

    @JvmField
    public CropImageView.CropCornerShape cornerShape;

    @JvmField
    public float cropCornerRadius;

    @JvmField
    public int cropMenuCropButtonIcon;

    @JvmField
    public CharSequence cropMenuCropButtonTitle;

    @JvmField
    public CropImageView.CropShape cropShape;

    @JvmField
    public String cropperLabelText;

    @JvmField
    public int cropperLabelTextColor;

    @JvmField
    public float cropperLabelTextSize;

    @JvmField
    public Uri customOutputUri;

    @JvmField
    public boolean fixAspectRatio;

    @JvmField
    public boolean flipHorizontally;

    @JvmField
    public boolean flipVertically;

    @JvmField
    public CropImageView.Guidelines guidelines;

    @JvmField
    public int guidelinesColor;

    @JvmField
    public float guidelinesThickness;

    @JvmField
    public boolean imageSourceIncludeCamera;

    @JvmField
    public boolean imageSourceIncludeGallery;

    @JvmField
    public float initialCropWindowPaddingRatio;

    @JvmField
    public Rect initialCropWindowRectangle;

    @JvmField
    public int initialRotation;

    @JvmField
    public List<String> intentChooserPriorityList;

    @JvmField
    public String intentChooserTitle;

    @JvmField
    public int maxCropResultHeight;

    @JvmField
    public int maxCropResultWidth;

    @JvmField
    public int maxZoom;

    @JvmField
    public int minCropResultHeight;

    @JvmField
    public int minCropResultWidth;

    @JvmField
    public int minCropWindowHeight;

    @JvmField
    public int minCropWindowWidth;

    @JvmField
    public boolean multiTouchEnabled;

    @JvmField
    public boolean noOutputImage;

    @JvmField
    public Bitmap.CompressFormat outputCompressFormat;

    @JvmField
    public int outputCompressQuality;

    @JvmField
    public int outputRequestHeight;

    @JvmField
    public CropImageView.RequestSizeOptions outputRequestSizeOptions;

    @JvmField
    public int outputRequestWidth;

    @JvmField
    public int progressBarColor;

    @JvmField
    public int rotationDegrees;

    @JvmField
    public CropImageView.ScaleType scaleType;

    @JvmField
    public boolean showCropLabel;

    @JvmField
    public boolean showCropOverlay;

    @JvmField
    public boolean showIntentChooser;

    @JvmField
    public boolean showProgressBar;

    @JvmField
    public boolean skipEditing;

    @JvmField
    public float snapRadius;

    @JvmField
    public Integer toolbarBackButtonColor;

    @JvmField
    public Integer toolbarColor;

    @JvmField
    public Integer toolbarTintColor;

    @JvmField
    public Integer toolbarTitleColor;

    @JvmField
    public float touchRadius;

    /* compiled from: CropImageOptions.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 7, 1}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<CropImageOptions> {
        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.canhub.cropper.CropImageOptions createFromParcel(android.os.Parcel r73) {
            /*
                Method dump skipped, instructions count: 657
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageOptions.Creator.createFromParcel(android.os.Parcel):com.canhub.cropper.CropImageOptions");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CropImageOptions[] newArray(int i) {
            return new CropImageOptions[i];
        }
    }

    @JvmOverloads
    public CropImageOptions() {
        this(false, false, null, null, 0.0f, 0.0f, 0.0f, null, null, false, false, false, 0, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, -1, -1, 31, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CropImageOptions)) {
            return false;
        }
        CropImageOptions cropImageOptions = (CropImageOptions) other;
        return this.imageSourceIncludeGallery == cropImageOptions.imageSourceIncludeGallery && this.imageSourceIncludeCamera == cropImageOptions.imageSourceIncludeCamera && this.cropShape == cropImageOptions.cropShape && this.cornerShape == cropImageOptions.cornerShape && Float.compare(this.cropCornerRadius, cropImageOptions.cropCornerRadius) == 0 && Float.compare(this.snapRadius, cropImageOptions.snapRadius) == 0 && Float.compare(this.touchRadius, cropImageOptions.touchRadius) == 0 && this.guidelines == cropImageOptions.guidelines && this.scaleType == cropImageOptions.scaleType && this.showCropOverlay == cropImageOptions.showCropOverlay && this.showCropLabel == cropImageOptions.showCropLabel && this.showProgressBar == cropImageOptions.showProgressBar && this.progressBarColor == cropImageOptions.progressBarColor && this.autoZoomEnabled == cropImageOptions.autoZoomEnabled && this.multiTouchEnabled == cropImageOptions.multiTouchEnabled && this.centerMoveEnabled == cropImageOptions.centerMoveEnabled && this.maxZoom == cropImageOptions.maxZoom && Float.compare(this.initialCropWindowPaddingRatio, cropImageOptions.initialCropWindowPaddingRatio) == 0 && this.fixAspectRatio == cropImageOptions.fixAspectRatio && this.aspectRatioX == cropImageOptions.aspectRatioX && this.aspectRatioY == cropImageOptions.aspectRatioY && Float.compare(this.borderLineThickness, cropImageOptions.borderLineThickness) == 0 && this.borderLineColor == cropImageOptions.borderLineColor && Float.compare(this.borderCornerThickness, cropImageOptions.borderCornerThickness) == 0 && Float.compare(this.borderCornerOffset, cropImageOptions.borderCornerOffset) == 0 && Float.compare(this.borderCornerLength, cropImageOptions.borderCornerLength) == 0 && this.borderCornerColor == cropImageOptions.borderCornerColor && this.circleCornerFillColorHexValue == cropImageOptions.circleCornerFillColorHexValue && Float.compare(this.guidelinesThickness, cropImageOptions.guidelinesThickness) == 0 && this.guidelinesColor == cropImageOptions.guidelinesColor && this.backgroundColor == cropImageOptions.backgroundColor && this.minCropWindowWidth == cropImageOptions.minCropWindowWidth && this.minCropWindowHeight == cropImageOptions.minCropWindowHeight && this.minCropResultWidth == cropImageOptions.minCropResultWidth && this.minCropResultHeight == cropImageOptions.minCropResultHeight && this.maxCropResultWidth == cropImageOptions.maxCropResultWidth && this.maxCropResultHeight == cropImageOptions.maxCropResultHeight && Intrinsics.areEqual(this.activityTitle, cropImageOptions.activityTitle) && this.activityMenuIconColor == cropImageOptions.activityMenuIconColor && Intrinsics.areEqual(this.activityMenuTextColor, cropImageOptions.activityMenuTextColor) && Intrinsics.areEqual(this.customOutputUri, cropImageOptions.customOutputUri) && this.outputCompressFormat == cropImageOptions.outputCompressFormat && this.outputCompressQuality == cropImageOptions.outputCompressQuality && this.outputRequestWidth == cropImageOptions.outputRequestWidth && this.outputRequestHeight == cropImageOptions.outputRequestHeight && this.outputRequestSizeOptions == cropImageOptions.outputRequestSizeOptions && this.noOutputImage == cropImageOptions.noOutputImage && Intrinsics.areEqual(this.initialCropWindowRectangle, cropImageOptions.initialCropWindowRectangle) && this.initialRotation == cropImageOptions.initialRotation && this.allowRotation == cropImageOptions.allowRotation && this.allowFlipping == cropImageOptions.allowFlipping && this.allowCounterRotation == cropImageOptions.allowCounterRotation && this.rotationDegrees == cropImageOptions.rotationDegrees && this.flipHorizontally == cropImageOptions.flipHorizontally && this.flipVertically == cropImageOptions.flipVertically && Intrinsics.areEqual(this.cropMenuCropButtonTitle, cropImageOptions.cropMenuCropButtonTitle) && this.cropMenuCropButtonIcon == cropImageOptions.cropMenuCropButtonIcon && this.skipEditing == cropImageOptions.skipEditing && this.showIntentChooser == cropImageOptions.showIntentChooser && Intrinsics.areEqual(this.intentChooserTitle, cropImageOptions.intentChooserTitle) && Intrinsics.areEqual(this.intentChooserPriorityList, cropImageOptions.intentChooserPriorityList) && Float.compare(this.cropperLabelTextSize, cropImageOptions.cropperLabelTextSize) == 0 && this.cropperLabelTextColor == cropImageOptions.cropperLabelTextColor && Intrinsics.areEqual(this.cropperLabelText, cropImageOptions.cropperLabelText) && this.activityBackgroundColor == cropImageOptions.activityBackgroundColor && Intrinsics.areEqual(this.toolbarColor, cropImageOptions.toolbarColor) && Intrinsics.areEqual(this.toolbarTitleColor, cropImageOptions.toolbarTitleColor) && Intrinsics.areEqual(this.toolbarBackButtonColor, cropImageOptions.toolbarBackButtonColor) && Intrinsics.areEqual(this.toolbarTintColor, cropImageOptions.toolbarTintColor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v138 */
    /* JADX WARN: Type inference failed for: r0v139 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v101, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v103, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v107, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v109, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v116, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v92, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v99, types: [boolean] */
    public int hashCode() {
        boolean z = this.imageSourceIncludeGallery;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.imageSourceIncludeCamera;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int iHashCode = (((((((((((((((i + i2) * 31) + this.cropShape.hashCode()) * 31) + this.cornerShape.hashCode()) * 31) + Float.hashCode(this.cropCornerRadius)) * 31) + Float.hashCode(this.snapRadius)) * 31) + Float.hashCode(this.touchRadius)) * 31) + this.guidelines.hashCode()) * 31) + this.scaleType.hashCode()) * 31;
        ?? r22 = this.showCropOverlay;
        int i3 = r22;
        if (r22 != 0) {
            i3 = 1;
        }
        int i4 = (iHashCode + i3) * 31;
        ?? r23 = this.showCropLabel;
        int i5 = r23;
        if (r23 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        ?? r24 = this.showProgressBar;
        int i7 = r24;
        if (r24 != 0) {
            i7 = 1;
        }
        int iHashCode2 = (((i6 + i7) * 31) + Integer.hashCode(this.progressBarColor)) * 31;
        ?? r25 = this.autoZoomEnabled;
        int i8 = r25;
        if (r25 != 0) {
            i8 = 1;
        }
        int i9 = (iHashCode2 + i8) * 31;
        ?? r26 = this.multiTouchEnabled;
        int i10 = r26;
        if (r26 != 0) {
            i10 = 1;
        }
        int i11 = (i9 + i10) * 31;
        ?? r27 = this.centerMoveEnabled;
        int i12 = r27;
        if (r27 != 0) {
            i12 = 1;
        }
        int iHashCode3 = (((((i11 + i12) * 31) + Integer.hashCode(this.maxZoom)) * 31) + Float.hashCode(this.initialCropWindowPaddingRatio)) * 31;
        ?? r28 = this.fixAspectRatio;
        int i13 = r28;
        if (r28 != 0) {
            i13 = 1;
        }
        int iHashCode4 = (((((((((((((((((((((((((((((((((((((((((iHashCode3 + i13) * 31) + Integer.hashCode(this.aspectRatioX)) * 31) + Integer.hashCode(this.aspectRatioY)) * 31) + Float.hashCode(this.borderLineThickness)) * 31) + Integer.hashCode(this.borderLineColor)) * 31) + Float.hashCode(this.borderCornerThickness)) * 31) + Float.hashCode(this.borderCornerOffset)) * 31) + Float.hashCode(this.borderCornerLength)) * 31) + Integer.hashCode(this.borderCornerColor)) * 31) + Integer.hashCode(this.circleCornerFillColorHexValue)) * 31) + Float.hashCode(this.guidelinesThickness)) * 31) + Integer.hashCode(this.guidelinesColor)) * 31) + Integer.hashCode(this.backgroundColor)) * 31) + Integer.hashCode(this.minCropWindowWidth)) * 31) + Integer.hashCode(this.minCropWindowHeight)) * 31) + Integer.hashCode(this.minCropResultWidth)) * 31) + Integer.hashCode(this.minCropResultHeight)) * 31) + Integer.hashCode(this.maxCropResultWidth)) * 31) + Integer.hashCode(this.maxCropResultHeight)) * 31) + this.activityTitle.hashCode()) * 31) + Integer.hashCode(this.activityMenuIconColor)) * 31;
        Integer num = this.activityMenuTextColor;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Uri uri = this.customOutputUri;
        int iHashCode6 = (((((((((((iHashCode5 + (uri == null ? 0 : uri.hashCode())) * 31) + this.outputCompressFormat.hashCode()) * 31) + Integer.hashCode(this.outputCompressQuality)) * 31) + Integer.hashCode(this.outputRequestWidth)) * 31) + Integer.hashCode(this.outputRequestHeight)) * 31) + this.outputRequestSizeOptions.hashCode()) * 31;
        ?? r29 = this.noOutputImage;
        int i14 = r29;
        if (r29 != 0) {
            i14 = 1;
        }
        int i15 = (iHashCode6 + i14) * 31;
        Rect rect = this.initialCropWindowRectangle;
        int iHashCode7 = (((i15 + (rect == null ? 0 : rect.hashCode())) * 31) + Integer.hashCode(this.initialRotation)) * 31;
        ?? r210 = this.allowRotation;
        int i16 = r210;
        if (r210 != 0) {
            i16 = 1;
        }
        int i17 = (iHashCode7 + i16) * 31;
        ?? r211 = this.allowFlipping;
        int i18 = r211;
        if (r211 != 0) {
            i18 = 1;
        }
        int i19 = (i17 + i18) * 31;
        ?? r212 = this.allowCounterRotation;
        int i20 = r212;
        if (r212 != 0) {
            i20 = 1;
        }
        int iHashCode8 = (((i19 + i20) * 31) + Integer.hashCode(this.rotationDegrees)) * 31;
        ?? r213 = this.flipHorizontally;
        int i21 = r213;
        if (r213 != 0) {
            i21 = 1;
        }
        int i22 = (iHashCode8 + i21) * 31;
        ?? r214 = this.flipVertically;
        int i23 = r214;
        if (r214 != 0) {
            i23 = 1;
        }
        int i24 = (i22 + i23) * 31;
        CharSequence charSequence = this.cropMenuCropButtonTitle;
        int iHashCode9 = (((i24 + (charSequence == null ? 0 : charSequence.hashCode())) * 31) + Integer.hashCode(this.cropMenuCropButtonIcon)) * 31;
        ?? r215 = this.skipEditing;
        int i25 = r215;
        if (r215 != 0) {
            i25 = 1;
        }
        int i26 = (iHashCode9 + i25) * 31;
        boolean z2 = this.showIntentChooser;
        int i27 = (i26 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        String str = this.intentChooserTitle;
        int iHashCode10 = (i27 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.intentChooserPriorityList;
        int iHashCode11 = (((((iHashCode10 + (list == null ? 0 : list.hashCode())) * 31) + Float.hashCode(this.cropperLabelTextSize)) * 31) + Integer.hashCode(this.cropperLabelTextColor)) * 31;
        String str2 = this.cropperLabelText;
        int iHashCode12 = (((iHashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.activityBackgroundColor)) * 31;
        Integer num2 = this.toolbarColor;
        int iHashCode13 = (iHashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.toolbarTitleColor;
        int iHashCode14 = (iHashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.toolbarBackButtonColor;
        int iHashCode15 = (iHashCode14 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.toolbarTintColor;
        return iHashCode15 + (num5 != null ? num5.hashCode() : 0);
    }

    public String toString() {
        return "CropImageOptions(imageSourceIncludeGallery=" + this.imageSourceIncludeGallery + ", imageSourceIncludeCamera=" + this.imageSourceIncludeCamera + ", cropShape=" + this.cropShape + ", cornerShape=" + this.cornerShape + ", cropCornerRadius=" + this.cropCornerRadius + ", snapRadius=" + this.snapRadius + ", touchRadius=" + this.touchRadius + ", guidelines=" + this.guidelines + ", scaleType=" + this.scaleType + ", showCropOverlay=" + this.showCropOverlay + ", showCropLabel=" + this.showCropLabel + ", showProgressBar=" + this.showProgressBar + ", progressBarColor=" + this.progressBarColor + ", autoZoomEnabled=" + this.autoZoomEnabled + ", multiTouchEnabled=" + this.multiTouchEnabled + ", centerMoveEnabled=" + this.centerMoveEnabled + ", maxZoom=" + this.maxZoom + ", initialCropWindowPaddingRatio=" + this.initialCropWindowPaddingRatio + ", fixAspectRatio=" + this.fixAspectRatio + ", aspectRatioX=" + this.aspectRatioX + ", aspectRatioY=" + this.aspectRatioY + ", borderLineThickness=" + this.borderLineThickness + ", borderLineColor=" + this.borderLineColor + ", borderCornerThickness=" + this.borderCornerThickness + ", borderCornerOffset=" + this.borderCornerOffset + ", borderCornerLength=" + this.borderCornerLength + ", borderCornerColor=" + this.borderCornerColor + ", circleCornerFillColorHexValue=" + this.circleCornerFillColorHexValue + ", guidelinesThickness=" + this.guidelinesThickness + ", guidelinesColor=" + this.guidelinesColor + ", backgroundColor=" + this.backgroundColor + ", minCropWindowWidth=" + this.minCropWindowWidth + ", minCropWindowHeight=" + this.minCropWindowHeight + ", minCropResultWidth=" + this.minCropResultWidth + ", minCropResultHeight=" + this.minCropResultHeight + ", maxCropResultWidth=" + this.maxCropResultWidth + ", maxCropResultHeight=" + this.maxCropResultHeight + ", activityTitle=" + ((Object) this.activityTitle) + ", activityMenuIconColor=" + this.activityMenuIconColor + ", activityMenuTextColor=" + this.activityMenuTextColor + ", customOutputUri=" + this.customOutputUri + ", outputCompressFormat=" + this.outputCompressFormat + ", outputCompressQuality=" + this.outputCompressQuality + ", outputRequestWidth=" + this.outputRequestWidth + ", outputRequestHeight=" + this.outputRequestHeight + ", outputRequestSizeOptions=" + this.outputRequestSizeOptions + ", noOutputImage=" + this.noOutputImage + ", initialCropWindowRectangle=" + this.initialCropWindowRectangle + ", initialRotation=" + this.initialRotation + ", allowRotation=" + this.allowRotation + ", allowFlipping=" + this.allowFlipping + ", allowCounterRotation=" + this.allowCounterRotation + ", rotationDegrees=" + this.rotationDegrees + ", flipHorizontally=" + this.flipHorizontally + ", flipVertically=" + this.flipVertically + ", cropMenuCropButtonTitle=" + ((Object) this.cropMenuCropButtonTitle) + ", cropMenuCropButtonIcon=" + this.cropMenuCropButtonIcon + ", skipEditing=" + this.skipEditing + ", showIntentChooser=" + this.showIntentChooser + ", intentChooserTitle=" + this.intentChooserTitle + ", intentChooserPriorityList=" + this.intentChooserPriorityList + ", cropperLabelTextSize=" + this.cropperLabelTextSize + ", cropperLabelTextColor=" + this.cropperLabelTextColor + ", cropperLabelText=" + this.cropperLabelText + ", activityBackgroundColor=" + this.activityBackgroundColor + ", toolbarColor=" + this.toolbarColor + ", toolbarTitleColor=" + this.toolbarTitleColor + ", toolbarBackButtonColor=" + this.toolbarBackButtonColor + ", toolbarTintColor=" + this.toolbarTintColor + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.imageSourceIncludeGallery ? 1 : 0);
        parcel.writeInt(this.imageSourceIncludeCamera ? 1 : 0);
        parcel.writeString(this.cropShape.name());
        parcel.writeString(this.cornerShape.name());
        parcel.writeFloat(this.cropCornerRadius);
        parcel.writeFloat(this.snapRadius);
        parcel.writeFloat(this.touchRadius);
        parcel.writeString(this.guidelines.name());
        parcel.writeString(this.scaleType.name());
        parcel.writeInt(this.showCropOverlay ? 1 : 0);
        parcel.writeInt(this.showCropLabel ? 1 : 0);
        parcel.writeInt(this.showProgressBar ? 1 : 0);
        parcel.writeInt(this.progressBarColor);
        parcel.writeInt(this.autoZoomEnabled ? 1 : 0);
        parcel.writeInt(this.multiTouchEnabled ? 1 : 0);
        parcel.writeInt(this.centerMoveEnabled ? 1 : 0);
        parcel.writeInt(this.maxZoom);
        parcel.writeFloat(this.initialCropWindowPaddingRatio);
        parcel.writeInt(this.fixAspectRatio ? 1 : 0);
        parcel.writeInt(this.aspectRatioX);
        parcel.writeInt(this.aspectRatioY);
        parcel.writeFloat(this.borderLineThickness);
        parcel.writeInt(this.borderLineColor);
        parcel.writeFloat(this.borderCornerThickness);
        parcel.writeFloat(this.borderCornerOffset);
        parcel.writeFloat(this.borderCornerLength);
        parcel.writeInt(this.borderCornerColor);
        parcel.writeInt(this.circleCornerFillColorHexValue);
        parcel.writeFloat(this.guidelinesThickness);
        parcel.writeInt(this.guidelinesColor);
        parcel.writeInt(this.backgroundColor);
        parcel.writeInt(this.minCropWindowWidth);
        parcel.writeInt(this.minCropWindowHeight);
        parcel.writeInt(this.minCropResultWidth);
        parcel.writeInt(this.minCropResultHeight);
        parcel.writeInt(this.maxCropResultWidth);
        parcel.writeInt(this.maxCropResultHeight);
        TextUtils.writeToParcel(this.activityTitle, parcel, flags);
        parcel.writeInt(this.activityMenuIconColor);
        Integer num = this.activityMenuTextColor;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeParcelable(this.customOutputUri, flags);
        parcel.writeString(this.outputCompressFormat.name());
        parcel.writeInt(this.outputCompressQuality);
        parcel.writeInt(this.outputRequestWidth);
        parcel.writeInt(this.outputRequestHeight);
        parcel.writeString(this.outputRequestSizeOptions.name());
        parcel.writeInt(this.noOutputImage ? 1 : 0);
        parcel.writeParcelable(this.initialCropWindowRectangle, flags);
        parcel.writeInt(this.initialRotation);
        parcel.writeInt(this.allowRotation ? 1 : 0);
        parcel.writeInt(this.allowFlipping ? 1 : 0);
        parcel.writeInt(this.allowCounterRotation ? 1 : 0);
        parcel.writeInt(this.rotationDegrees);
        parcel.writeInt(this.flipHorizontally ? 1 : 0);
        parcel.writeInt(this.flipVertically ? 1 : 0);
        TextUtils.writeToParcel(this.cropMenuCropButtonTitle, parcel, flags);
        parcel.writeInt(this.cropMenuCropButtonIcon);
        parcel.writeInt(this.skipEditing ? 1 : 0);
        parcel.writeInt(this.showIntentChooser ? 1 : 0);
        parcel.writeString(this.intentChooserTitle);
        parcel.writeStringList(this.intentChooserPriorityList);
        parcel.writeFloat(this.cropperLabelTextSize);
        parcel.writeInt(this.cropperLabelTextColor);
        parcel.writeString(this.cropperLabelText);
        parcel.writeInt(this.activityBackgroundColor);
        Integer num2 = this.toolbarColor;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.toolbarTitleColor;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.toolbarBackButtonColor;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Integer num5 = this.toolbarTintColor;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
    }

    @JvmOverloads
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape, CropImageView.CropCornerShape cornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines, CropImageView.ScaleType scaleType, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, int i2, float f4, boolean z9, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, CharSequence activityTitle, int i16, Integer num, Uri uri, Bitmap.CompressFormat outputCompressFormat, int i17, int i18, int i19, CropImageView.RequestSizeOptions outputRequestSizeOptions, boolean z10, Rect rect, int i20, boolean z11, boolean z12, boolean z13, int i21, boolean z14, boolean z15, CharSequence charSequence, int i22, boolean z16, boolean z17, String str, List<String> list, float f10, int i23, String str2, int i24, Integer num2, Integer num3, Integer num4, Integer num5) {
        Intrinsics.checkNotNullParameter(cropShape, "cropShape");
        Intrinsics.checkNotNullParameter(cornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        Intrinsics.checkNotNullParameter(activityTitle, "activityTitle");
        Intrinsics.checkNotNullParameter(outputCompressFormat, "outputCompressFormat");
        Intrinsics.checkNotNullParameter(outputRequestSizeOptions, "outputRequestSizeOptions");
        this.imageSourceIncludeGallery = z;
        this.imageSourceIncludeCamera = z2;
        this.cropShape = cropShape;
        this.cornerShape = cornerShape;
        this.cropCornerRadius = f;
        this.snapRadius = f2;
        this.touchRadius = f3;
        this.guidelines = guidelines;
        this.scaleType = scaleType;
        this.showCropOverlay = z3;
        this.showCropLabel = z4;
        this.showProgressBar = z5;
        this.progressBarColor = i;
        this.autoZoomEnabled = z6;
        this.multiTouchEnabled = z7;
        this.centerMoveEnabled = z8;
        this.maxZoom = i2;
        this.initialCropWindowPaddingRatio = f4;
        this.fixAspectRatio = z9;
        this.aspectRatioX = i3;
        this.aspectRatioY = i4;
        this.borderLineThickness = f5;
        this.borderLineColor = i5;
        this.borderCornerThickness = f6;
        this.borderCornerOffset = f7;
        this.borderCornerLength = f8;
        this.borderCornerColor = i6;
        this.circleCornerFillColorHexValue = i7;
        this.guidelinesThickness = f9;
        this.guidelinesColor = i8;
        this.backgroundColor = i9;
        this.minCropWindowWidth = i10;
        this.minCropWindowHeight = i11;
        this.minCropResultWidth = i12;
        this.minCropResultHeight = i13;
        this.maxCropResultWidth = i14;
        this.maxCropResultHeight = i15;
        this.activityTitle = activityTitle;
        this.activityMenuIconColor = i16;
        this.activityMenuTextColor = num;
        this.customOutputUri = uri;
        this.outputCompressFormat = outputCompressFormat;
        this.outputCompressQuality = i17;
        this.outputRequestWidth = i18;
        this.outputRequestHeight = i19;
        this.outputRequestSizeOptions = outputRequestSizeOptions;
        this.noOutputImage = z10;
        this.initialCropWindowRectangle = rect;
        this.initialRotation = i20;
        this.allowRotation = z11;
        this.allowFlipping = z12;
        this.allowCounterRotation = z13;
        this.rotationDegrees = i21;
        this.flipHorizontally = z14;
        this.flipVertically = z15;
        this.cropMenuCropButtonTitle = charSequence;
        this.cropMenuCropButtonIcon = i22;
        this.skipEditing = z16;
        this.showIntentChooser = z17;
        this.intentChooserTitle = str;
        this.intentChooserPriorityList = list;
        this.cropperLabelTextSize = f10;
        this.cropperLabelTextColor = i23;
        this.cropperLabelText = str2;
        this.activityBackgroundColor = i24;
        this.toolbarColor = num2;
        this.toolbarTitleColor = num3;
        this.toolbarBackButtonColor = num4;
        this.toolbarTintColor = num5;
        if (i2 < 0) {
            throw new IllegalArgumentException("Cannot set max zoom to a number < 1");
        }
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("Cannot set touch radius value to a number <= 0 ");
        }
        if (f4 < 0.0f || f4 >= 0.5d) {
            throw new IllegalArgumentException("Cannot set initial crop window padding value to a number < 0 or >= 0.5");
        }
        if (i3 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (i4 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (f5 < 0.0f) {
            throw new IllegalArgumentException("Cannot set line thickness value to a number less than 0.");
        }
        if (f6 < 0.0f) {
            throw new IllegalArgumentException("Cannot set corner thickness value to a number less than 0.");
        }
        if (f9 < 0.0f) {
            throw new IllegalArgumentException("Cannot set guidelines thickness value to a number less than 0.");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("Cannot set min crop window height value to a number < 0 ");
        }
        if (i12 < 0) {
            throw new IllegalArgumentException("Cannot set min crop result width value to a number < 0 ");
        }
        if (i13 < 0) {
            throw new IllegalArgumentException("Cannot set min crop result height value to a number < 0 ");
        }
        if (i14 < i12) {
            throw new IllegalArgumentException("Cannot set max crop result width to smaller value than min crop result width");
        }
        if (i15 < i13) {
            throw new IllegalArgumentException("Cannot set max crop result height to smaller value than min crop result height");
        }
        if (i18 < 0) {
            throw new IllegalArgumentException("Cannot set request width value to a number < 0 ");
        }
        if (i19 < 0) {
            throw new IllegalArgumentException("Cannot set request height value to a number < 0 ");
        }
        if (i21 < 0 || i21 > 360) {
            throw new IllegalArgumentException("Cannot set rotation degrees value to a number < 0 or > 360");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines, CropImageView.ScaleType scaleType, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, int i2, float f4, boolean z9, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, Integer num, Uri uri, Bitmap.CompressFormat compressFormat, int i17, int i18, int i19, CropImageView.RequestSizeOptions requestSizeOptions, boolean z10, Rect rect, int i20, boolean z11, boolean z12, boolean z13, int i21, boolean z14, boolean z15, CharSequence charSequence2, int i22, boolean z16, boolean z17, String str, List list, float f10, int i23, String str2, int i24, Integer num2, Integer num3, Integer num4, Integer num5, int i25, int i26, int i27, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z18;
        int i28;
        float fApplyDimension;
        float f11;
        int i29;
        int i30;
        float fApplyDimension2;
        float f12;
        float fApplyDimension3;
        float f13;
        float fApplyDimension4;
        float f14;
        int i31;
        float fApplyDimension5;
        float f15;
        int iArgb;
        int i32;
        int i33;
        int i34;
        int iApplyDimension;
        int i35;
        int iApplyDimension2;
        boolean z19;
        int i36;
        float fApplyDimension6;
        boolean z20 = (i25 & 1) != 0 ? true : z;
        boolean z21 = (i25 & 2) != 0 ? true : z2;
        CropImageView.CropShape cropShape2 = (i25 & 4) != 0 ? CropImageView.CropShape.RECTANGLE : cropShape;
        CropImageView.CropCornerShape cropCornerShape2 = (i25 & 8) != 0 ? CropImageView.CropCornerShape.RECTANGLE : cropCornerShape;
        float fApplyDimension7 = (i25 & 16) != 0 ? TypedValue.applyDimension(1, 10.0f, Resources.getSystem().getDisplayMetrics()) : f;
        float fApplyDimension8 = (i25 & 32) != 0 ? TypedValue.applyDimension(1, 3.0f, Resources.getSystem().getDisplayMetrics()) : f2;
        float fApplyDimension9 = (i25 & 64) != 0 ? TypedValue.applyDimension(1, 24.0f, Resources.getSystem().getDisplayMetrics()) : f3;
        CropImageView.Guidelines guidelines2 = (i25 & 128) != 0 ? CropImageView.Guidelines.f582ON : guidelines;
        CropImageView.ScaleType scaleType2 = (i25 & 256) != 0 ? CropImageView.ScaleType.FIT_CENTER : scaleType;
        boolean z22 = (i25 & 512) != 0 ? true : z3;
        boolean z23 = (i25 & 1024) != 0 ? false : z4;
        boolean z24 = (i25 & 2048) != 0 ? true : z5;
        int iRgb = (i25 & 4096) != 0 ? Color.rgb(EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE, 51, EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE) : i;
        boolean z25 = (i25 & 8192) != 0 ? true : z6;
        boolean z26 = z20;
        boolean z27 = (i25 & 16384) != 0 ? false : z7;
        boolean z28 = (i25 & 32768) != 0 ? true : z8;
        int i37 = (i25 & 65536) != 0 ? 4 : i2;
        float f16 = (i25 & 131072) != 0 ? 0.0f : f4;
        boolean z29 = (i25 & 262144) != 0 ? false : z9;
        int i38 = (i25 & 524288) != 0 ? 1 : i3;
        int i39 = (i25 & 1048576) != 0 ? 1 : i4;
        if ((i25 & 2097152) != 0) {
            z18 = z27;
            i28 = iRgb;
            fApplyDimension = TypedValue.applyDimension(1, 3.0f, Resources.getSystem().getDisplayMetrics());
        } else {
            z18 = z27;
            i28 = iRgb;
            fApplyDimension = f5;
        }
        int iArgb2 = (i25 & 4194304) != 0 ? Color.argb(EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, 255, 255, 255) : i5;
        if ((i25 & 8388608) != 0) {
            f11 = fApplyDimension;
            i29 = iArgb2;
            i30 = 1;
            fApplyDimension2 = TypedValue.applyDimension(1, 2.0f, Resources.getSystem().getDisplayMetrics());
        } else {
            f11 = fApplyDimension;
            i29 = iArgb2;
            i30 = 1;
            fApplyDimension2 = f6;
        }
        if ((i25 & 16777216) != 0) {
            f12 = fApplyDimension2;
            fApplyDimension3 = TypedValue.applyDimension(i30, 5.0f, Resources.getSystem().getDisplayMetrics());
        } else {
            f12 = fApplyDimension2;
            fApplyDimension3 = f7;
        }
        if ((i25 & 33554432) != 0) {
            f13 = fApplyDimension3;
            fApplyDimension4 = TypedValue.applyDimension(i30, 14.0f, Resources.getSystem().getDisplayMetrics());
        } else {
            f13 = fApplyDimension3;
            fApplyDimension4 = f8;
        }
        int i40 = (i25 & 67108864) != 0 ? -1 : i6;
        int i41 = (i25 & 134217728) != 0 ? -1 : i7;
        if ((i25 & 268435456) != 0) {
            f14 = fApplyDimension4;
            i31 = i40;
            fApplyDimension5 = TypedValue.applyDimension(1, 1.0f, Resources.getSystem().getDisplayMetrics());
        } else {
            f14 = fApplyDimension4;
            i31 = i40;
            fApplyDimension5 = f9;
        }
        int iArgb3 = (i25 & 536870912) != 0 ? Color.argb(EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, 255, 255, 255) : i8;
        if ((i25 & 1073741824) != 0) {
            f15 = fApplyDimension5;
            iArgb = Color.argb(119, 0, 0, 0);
        } else {
            f15 = fApplyDimension5;
            iArgb = i9;
        }
        if ((i25 & Integer.MIN_VALUE) != 0) {
            i32 = iArgb3;
            i33 = iArgb;
            i34 = 1;
            iApplyDimension = (int) TypedValue.applyDimension(1, 42.0f, Resources.getSystem().getDisplayMetrics());
        } else {
            i32 = iArgb3;
            i33 = iArgb;
            i34 = 1;
            iApplyDimension = i10;
        }
        if ((i26 & 1) != 0) {
            i35 = iApplyDimension;
            iApplyDimension2 = (int) TypedValue.applyDimension(i34, 42.0f, Resources.getSystem().getDisplayMetrics());
        } else {
            i35 = iApplyDimension;
            iApplyDimension2 = i11;
        }
        int i42 = (i26 & 2) != 0 ? 40 : i12;
        int i43 = (i26 & 4) != 0 ? 40 : i13;
        int i44 = (i26 & 8) != 0 ? 99999 : i14;
        int i45 = (i26 & 16) != 0 ? 99999 : i15;
        CharSequence charSequence3 = (i26 & 32) != 0 ? "" : charSequence;
        int i46 = (i26 & 64) != 0 ? 0 : i16;
        Integer num6 = (i26 & 128) != 0 ? null : num;
        int i47 = iApplyDimension2;
        Uri uri2 = (i26 & 256) != 0 ? null : uri;
        Bitmap.CompressFormat compressFormat2 = (i26 & 512) != 0 ? Bitmap.CompressFormat.JPEG : compressFormat;
        int i48 = (i26 & 1024) != 0 ? 90 : i17;
        int i49 = (i26 & 2048) != 0 ? 0 : i18;
        int i50 = (i26 & 4096) != 0 ? 0 : i19;
        CropImageView.RequestSizeOptions requestSizeOptions2 = (i26 & 8192) != 0 ? CropImageView.RequestSizeOptions.NONE : requestSizeOptions;
        boolean z30 = (i26 & 16384) != 0 ? false : z10;
        Rect rect2 = (i26 & 32768) != 0 ? null : rect;
        int i51 = (i26 & 65536) != 0 ? -1 : i20;
        boolean z31 = (i26 & 131072) != 0 ? true : z11;
        boolean z32 = (i26 & 262144) != 0 ? true : z12;
        boolean z33 = (i26 & 524288) != 0 ? false : z13;
        int i52 = (i26 & 1048576) != 0 ? 90 : i21;
        boolean z34 = (i26 & 2097152) != 0 ? false : z14;
        boolean z35 = (i26 & 4194304) != 0 ? false : z15;
        CharSequence charSequence4 = (i26 & 8388608) != 0 ? null : charSequence2;
        int i53 = (i26 & 16777216) != 0 ? 0 : i22;
        boolean z36 = (i26 & 33554432) != 0 ? false : z16;
        boolean z37 = (i26 & 67108864) != 0 ? false : z17;
        String str3 = (i26 & 134217728) != 0 ? null : str;
        List listEmptyList = (i26 & 268435456) != 0 ? CollectionsKt.emptyList() : list;
        if ((i26 & 536870912) != 0) {
            z19 = z30;
            i36 = i42;
            fApplyDimension6 = TypedValue.applyDimension(2, 20.0f, Resources.getSystem().getDisplayMetrics());
        } else {
            z19 = z30;
            i36 = i42;
            fApplyDimension6 = f10;
        }
        this(z26, z21, cropShape2, cropCornerShape2, fApplyDimension7, fApplyDimension8, fApplyDimension9, guidelines2, scaleType2, z22, z23, z24, i28, z25, z18, z28, i37, f16, z29, i38, i39, f11, i29, f12, f13, f14, i31, i41, f15, i32, i33, i35, i47, i36, i43, i44, i45, charSequence3, i46, num6, uri2, compressFormat2, i48, i49, i50, requestSizeOptions2, z19, rect2, i51, z31, z32, z33, i52, z34, z35, charSequence4, i53, z36, z37, str3, listEmptyList, fApplyDimension6, (i26 & 1073741824) != 0 ? -1 : i23, (i26 & Integer.MIN_VALUE) != 0 ? "" : str2, (i27 & 1) != 0 ? -1 : i24, (i27 & 2) != 0 ? null : num2, (i27 & 4) != 0 ? null : num3, (i27 & 8) != 0 ? null : num4, (i27 & 16) != 0 ? null : num5);
    }
}
