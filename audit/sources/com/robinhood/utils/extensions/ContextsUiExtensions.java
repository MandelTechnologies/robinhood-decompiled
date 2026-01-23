package com.robinhood.utils.extensions;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.IBinder;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import androidx.core.content.res.ResourcesCompat;
import com.robinhood.utils.system.RemoteResultData;
import com.robinhood.utils.system.ResultReceivers2;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.io.FileNotFoundException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ContextsUiExtensions.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0001\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0001¢\u0006\u0002\u0010\u0005\u001a\u0014\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0001\u001a\u0016\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0001\u001a\u0014\u0010\u000b\u001a\u00020\n*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0001\u001a\u0014\u0010\f\u001a\u00020\n*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0001\u001a\u0016\u0010\r\u001a\u0004\u0018\u00010\n*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0001\u001a\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u001a$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f*\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0013\u001a\u0012\u0010\u0018\u001a\u00020\u0019*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0001\u001a\u0012\u0010\u0018\u001a\u00020\u0019*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c\u001a\u0012\u0010\u001d\u001a\u00020\u0019*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0001\u001a\u0012\u0010\u001d\u001a\u00020\u0019*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c\u001a1\u0010\u001e\u001a\u0004\u0018\u00010\u001f*\u00020\u00022\u0006\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010%\u001a\n\u0010&\u001a\u00020'*\u00020\u0002\u001a\u0014\u0010(\u001a\u00020)*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0001\u001a\n\u0010*\u001a\u00020+*\u00020\u0002\u001a\u0016\u0010,\u001a\u00020+*\u00020\u00022\b\b\u0002\u0010-\u001a\u00020\u0013H\u0007\u001a\u0012\u0010.\u001a\u00020+*\u00020\u00022\u0006\u0010/\u001a\u000200¨\u00061"}, m3636d2 = {"requireThemeAttribute", "", "Landroid/content/Context;", "resId", "getThemeAttribute", "(Landroid/content/Context;I)Ljava/lang/Integer;", "getThemeValue", "Landroid/util/TypedValue;", ResourceTypes.ATTRIBUTE, "getFont", "Landroid/graphics/Typeface;", "requireFont", "getThemeTypeface", "getThemeTypefaceOrNull", "showKeyboard", "Lio/reactivex/Observable;", "view", "Landroid/view/View;", "force", "", "hideKeyboard", "windowToken", "Landroid/os/IBinder;", "implicitOnly", "showShortToast", "Landroid/widget/Toast;", "messageId", "message", "", "showLongToast", "getBitmapFromContentUri", "Landroid/graphics/Bitmap;", "imageUri", "Landroid/net/Uri;", "maxBytes", "", "rotationDegrees", "(Landroid/content/Context;Landroid/net/Uri;JLjava/lang/Integer;)Landroid/graphics/Bitmap;", "getDensitySpec", "Lcom/robinhood/utils/extensions/DensitySpec;", "requireDrawable", "Landroid/graphics/drawable/Drawable;", "openAppSystemSettings", "", "openAppNotificationSettings", "openInNewTask", "openShareIntent", "text", "", "lib-utils-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.extensions.ContextsUiExtensionsKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class ContextsUiExtensions {
    public static final Observable<Integer> hideKeyboard(Context context, IBinder iBinder, boolean z) {
        Observable<RemoteResultData> observableEmpty;
        Intrinsics.checkNotNullParameter(context, "<this>");
        ResultReceivers2 resultReceivers2 = new ResultReceivers2();
        Object systemService = context.getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        if (((InputMethodManager) systemService).hideSoftInputFromWindow(iBinder, z ? 1 : 0, resultReceivers2)) {
            observableEmpty = resultReceivers2.asObservable();
        } else {
            observableEmpty = Observable.empty();
            Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
        }
        Observable map = observableEmpty.map(new Function() { // from class: com.robinhood.utils.extensions.ContextsUiExtensionsKt.hideKeyboard.2
            @Override // io.reactivex.functions.Function
            public final Integer apply(RemoteResultData it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Integer.valueOf(it.getResultCode());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public static final Observable<Integer> showKeyboard(Context context, View view, boolean z) {
        Observable<RemoteResultData> observableEmpty;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        ResultReceivers2 resultReceivers2 = new ResultReceivers2();
        if (ContextSystemServices.getInputMethodManager(context).showSoftInput(view, z ? 2 : 1, resultReceivers2)) {
            observableEmpty = resultReceivers2.asObservable();
        } else {
            observableEmpty = Observable.empty();
            Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
        }
        Observable map = observableEmpty.map(new Function() { // from class: com.robinhood.utils.extensions.ContextsUiExtensionsKt.showKeyboard.2
            @Override // io.reactivex.functions.Function
            public final Integer apply(RemoteResultData it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Integer.valueOf(it.getResultCode());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public static final int requireThemeAttribute(Context context, int i) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            throw new IllegalStateException(("Could not resolve typeface attribute: " + context.getResources().getResourceName(i)).toString());
        }
        return typedValue.resourceId;
    }

    public static final Integer getThemeAttribute(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return Integer.valueOf(typedValue.resourceId);
        }
        return null;
    }

    public static final TypedValue getThemeValue(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue;
    }

    public static final Typeface getFont(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return ResourcesCompat.getFont(context, i);
    }

    public static final Typeface requireFont(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Typeface font = getFont(context, i);
        if (font != null) {
            return font;
        }
        throw new IllegalStateException(("Couldn't resolve font id: " + i).toString());
    }

    public static final Typeface getThemeTypeface(Context context, int i) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Typeface font = getFont(context, requireThemeAttribute(context, i));
        if (font != null) {
            return font;
        }
        throw new Resources.NotFoundException("Couldn't resolve resource: " + context.getResources().getResourceName(i));
    }

    public static final Typeface getThemeTypefaceOrNull(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Integer themeAttribute = getThemeAttribute(context, i);
        if (themeAttribute != null) {
            return getFont(context, themeAttribute.intValue());
        }
        return null;
    }

    public static /* synthetic */ Observable showKeyboard$default(Context context, View view, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return showKeyboard(context, view, z);
    }

    public static /* synthetic */ Observable hideKeyboard$default(Context context, IBinder iBinder, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return hideKeyboard(context, iBinder, z);
    }

    public static final Toast showShortToast(Context context, int i) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Toast toastMakeText = Toast.makeText(context, i, 0);
        toastMakeText.show();
        Intrinsics.checkNotNull(toastMakeText);
        return toastMakeText;
    }

    public static final Toast showShortToast(Context context, CharSequence message) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        Toast toastMakeText = Toast.makeText(context, message, 0);
        toastMakeText.show();
        Intrinsics.checkNotNull(toastMakeText);
        return toastMakeText;
    }

    public static final Toast showLongToast(Context context, int i) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Toast toastMakeText = Toast.makeText(context, i, 1);
        toastMakeText.show();
        Intrinsics.checkNotNull(toastMakeText);
        return toastMakeText;
    }

    public static final Toast showLongToast(Context context, CharSequence message) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        Toast toastMakeText = Toast.makeText(context, message, 1);
        toastMakeText.show();
        Intrinsics.checkNotNull(toastMakeText);
        return toastMakeText;
    }

    public static /* synthetic */ Bitmap getBitmapFromContentUri$default(Context context, Uri uri, long j, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 5000000;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        return getBitmapFromContentUri(context, uri, j, num);
    }

    public static final Bitmap getBitmapFromContentUri(Context context, Uri imageUri, long j, Integer num) throws FileNotFoundException {
        InputStream inputStreamOpenInputStream;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        InputStream inputStreamOpenInputStream2 = context.getContentResolver().openInputStream(imageUri);
        if (inputStreamOpenInputStream2 == null || (inputStreamOpenInputStream = context.getContentResolver().openInputStream(imageUri)) == null) {
            return null;
        }
        int iCalculateSampleSize$default = BitmapFactoryUtils.calculateSampleSize$default(BitmapFactoryUtils.INSTANCE, inputStreamOpenInputStream2, null, j, 2, null);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = iCalculateSampleSize$default;
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
        if (num == null || num.intValue() == 0 || bitmapDecodeStream == null) {
            return bitmapDecodeStream;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(num.intValue());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        bitmapDecodeStream.recycle();
        return bitmapCreateBitmap;
    }

    public static final ContextsUiExtensions2 getDensitySpec(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        int i = context.getResources().getDisplayMetrics().densityDpi;
        if (Integer.MIN_VALUE <= i && i < 240) {
            return ContextsUiExtensions2.MDPI;
        }
        if (240 <= i && i < 320) {
            return ContextsUiExtensions2.HDPI;
        }
        if (320 <= i && i < 480) {
            return ContextsUiExtensions2.XHDPI;
        }
        return ContextsUiExtensions2.XXHDPI;
    }

    public static final Drawable requireDrawable(Context context, int i) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Drawable drawable = context.getDrawable(i);
        if (drawable != null) {
            return drawable;
        }
        throw new IllegalArgumentException(("The drawable at " + context.getResources().getResourceName(i) + " was in a format that the image decoder did not recognize").toString());
    }

    public static final void openAppSystemSettings(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        context.startActivity(intent);
    }

    public static /* synthetic */ void openAppNotificationSettings$default(Context context, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        openAppNotificationSettings(context, z);
    }

    public static final void openAppNotificationSettings(Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        if (z) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    public static final void openShareIntent(Context context, String text) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", text);
        intent.setType("text/plain");
        context.startActivity(Intent.createChooser(intent, null));
    }
}
