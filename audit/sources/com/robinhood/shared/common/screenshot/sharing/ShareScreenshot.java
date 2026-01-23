package com.robinhood.shared.common.screenshot.sharing;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcelable;
import android.widget.Toast;
import com.plaid.internal.EnumC7081g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* compiled from: ShareScreenshot.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a6\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0086@¢\u0006\u0002\u0010\t\u001a6\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0086@¢\u0006\u0002\u0010\t\u001a\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0007\u001a>\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00072\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0086@¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"shareScreenshot", "", "context", "Landroid/content/Context;", "bitmap", "Landroid/graphics/Bitmap;", "shareTitle", "", "message", "(Landroid/content/Context;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shareScreenshotViaSms", "isAppInstalled", "", "packageName", "shareScreenshotToExternalApp", "(Landroid/content/Context;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-screenshot-sharing_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.common.screenshot.sharing.ShareScreenshotKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class ShareScreenshot {
    public static /* synthetic */ Object shareScreenshot$default(Context context, Bitmap bitmap, String str, String str2, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return shareScreenshot(context, bitmap, str, str2, continuation);
    }

    /* compiled from: ShareScreenshot.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.common.screenshot.sharing.ShareScreenshotKt$shareScreenshot$2", m3645f = "ShareScreenshot.kt", m3646l = {19, 20}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.common.screenshot.sharing.ShareScreenshotKt$shareScreenshot$2 */
    static final class C374802 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Bitmap $bitmap;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $message;
        final /* synthetic */ String $shareTitle;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C374802(Bitmap bitmap, Context context, String str, String str2, Continuation<? super C374802> continuation) {
            super(2, continuation);
            this.$bitmap = bitmap;
            this.$context = context;
            this.$shareTitle = str;
            this.$message = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C374802(this.$bitmap, this.$context, this.$shareTitle, this.$message, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C374802) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r10, r3, r9) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Bitmap bitmap = this.$bitmap;
                Context context = this.$context;
                this.label = 1;
                obj = CaptureScreenshot.toFileUri(bitmap, context, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            Uri uri = (Uri) obj;
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, this.$shareTitle, uri, this.$message, null);
            this.label = 2;
        }

        /* compiled from: ShareScreenshot.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.common.screenshot.sharing.ShareScreenshotKt$shareScreenshot$2$1", m3645f = "ShareScreenshot.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.common.screenshot.sharing.ShareScreenshotKt$shareScreenshot$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Context $context;
            final /* synthetic */ String $message;
            final /* synthetic */ String $shareTitle;
            final /* synthetic */ Uri $uri;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Context context, String str, Uri uri, String str2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$context = context;
                this.$shareTitle = str;
                this.$uri = uri;
                this.$message = str2;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$context, this.$shareTitle, this.$uri, this.$message, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Intent intent = new Intent("android.intent.action.SEND");
                Uri uri = this.$uri;
                String str = this.$message;
                intent.setType("image/*");
                intent.putExtra("android.intent.extra.STREAM", uri);
                intent.putExtra("android.intent.extra.TEXT", str);
                intent.addFlags(1);
                if (intent.resolveActivity(this.$context.getPackageManager()) == null) {
                    Context context = this.$context;
                    Toast.makeText(context, context.getString(C37479R.string.share_screenshot_toast_unavailable), 0).show();
                } else {
                    this.$context.startActivity(Intent.createChooser(intent, this.$shareTitle));
                }
                return Unit.INSTANCE;
            }
        }
    }

    public static final Object shareScreenshot(Context context, Bitmap bitmap, String str, String str2, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C374802(bitmap, context, str, str2, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public static /* synthetic */ Object shareScreenshotViaSms$default(Context context, Bitmap bitmap, String str, String str2, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return shareScreenshotViaSms(context, bitmap, str, str2, continuation);
    }

    /* compiled from: ShareScreenshot.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.common.screenshot.sharing.ShareScreenshotKt$shareScreenshotViaSms$2", m3645f = "ShareScreenshot.kt", m3646l = {55, 56}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.common.screenshot.sharing.ShareScreenshotKt$shareScreenshotViaSms$2 */
    static final class C374822 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Bitmap $bitmap;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $message;
        final /* synthetic */ String $shareTitle;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C374822(Bitmap bitmap, Context context, String str, String str2, Continuation<? super C374822> continuation) {
            super(2, continuation);
            this.$bitmap = bitmap;
            this.$context = context;
            this.$shareTitle = str;
            this.$message = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C374822(this.$bitmap, this.$context, this.$shareTitle, this.$message, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C374822) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r11, r3, r10) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Bitmap bitmap = this.$bitmap;
                Context context = this.$context;
                this.label = 1;
                obj = CaptureScreenshot.toFileUri(bitmap, context, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            Uri uri = (Uri) obj;
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, uri, this.$shareTitle, this.$bitmap, this.$message, null);
            this.label = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object invokeSuspend$fallbackToGeneralShare(Context context, Bitmap bitmap, String str, String str2, Continuation<? super Unit> continuation) {
            Object objShareScreenshot = ShareScreenshot.shareScreenshot(context, bitmap, str, str2, continuation);
            return objShareScreenshot == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objShareScreenshot : Unit.INSTANCE;
        }

        /* compiled from: ShareScreenshot.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.common.screenshot.sharing.ShareScreenshotKt$shareScreenshotViaSms$2$1", m3645f = "ShareScreenshot.kt", m3646l = {63, 84, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.shared.common.screenshot.sharing.ShareScreenshotKt$shareScreenshotViaSms$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Bitmap $bitmap;
            final /* synthetic */ Context $context;
            final /* synthetic */ Uri $imageUri;
            final /* synthetic */ String $message;
            final /* synthetic */ String $shareTitle;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Context context, Uri uri, String str, Bitmap bitmap, String str2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$context = context;
                this.$imageUri = uri;
                this.$shareTitle = str;
                this.$bitmap = bitmap;
                this.$message = str2;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$context, this.$imageUri, this.$shareTitle, this.$bitmap, this.$message, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
            
                if (com.robinhood.shared.common.screenshot.sharing.ShareScreenshot.C374822.invokeSuspend$fallbackToGeneralShare(r15, r1, r2, r3, r14) == r0) goto L59;
             */
            /* JADX WARN: Code restructure failed: missing block: B:58:0x01a0, code lost:
            
                if (com.robinhood.shared.common.screenshot.sharing.ShareScreenshot.C374822.invokeSuspend$fallbackToGeneralShare(r15, r1, r3, r4, r14) != r0) goto L60;
             */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                } catch (Exception unused) {
                    Context context = this.$context;
                    Bitmap bitmap = this.$bitmap;
                    String str = this.$shareTitle;
                    String str2 = this.$message;
                    this.label = 3;
                }
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    List<ResolveInfo> listQueryIntentActivities = this.$context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.SENDTO", Uri.parse("smsto:")), 0);
                    Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "queryIntentActivities(...)");
                    if (listQueryIntentActivities.isEmpty()) {
                        Context context2 = this.$context;
                        Bitmap bitmap2 = this.$bitmap;
                        String str3 = this.$shareTitle;
                        String str4 = this.$message;
                        this.label = 1;
                    } else {
                        Intent intent = new Intent("android.intent.action.SEND");
                        String str5 = this.$message;
                        Uri uri = this.$imageUri;
                        intent.setType("image/*");
                        intent.putExtra("sms_body", str5);
                        intent.putExtra("android.intent.extra.STREAM", uri);
                        intent.addFlags(1);
                        List<ResolveInfo> listQueryIntentActivities2 = this.$context.getPackageManager().queryIntentActivities(intent, 0);
                        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities2, "queryIntentActivities(...)");
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : listQueryIntentActivities2) {
                            ResolveInfo resolveInfo = (ResolveInfo) obj2;
                            List<ResolveInfo> list = listQueryIntentActivities;
                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                Iterator<T> it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    if (Intrinsics.areEqual(((ResolveInfo) it.next()).activityInfo.packageName, resolveInfo.activityInfo.packageName)) {
                                        arrayList.add(obj2);
                                        break;
                                    }
                                }
                            }
                        }
                        if (arrayList.isEmpty()) {
                            Context context3 = this.$context;
                            Bitmap bitmap3 = this.$bitmap;
                            String str6 = this.$shareTitle;
                            String str7 = this.$message;
                            this.label = 2;
                            if (C374822.invokeSuspend$fallbackToGeneralShare(context3, bitmap3, str6, str7, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else if (arrayList.size() == 1) {
                            ResolveInfo resolveInfo2 = (ResolveInfo) CollectionsKt.first((List) arrayList);
                            this.$context.grantUriPermission(resolveInfo2.activityInfo.packageName, this.$imageUri, 1);
                            Context context4 = this.$context;
                            ActivityInfo activityInfo = resolveInfo2.activityInfo;
                            intent.setClassName(activityInfo.packageName, activityInfo.name);
                            context4.startActivity(intent);
                        } else {
                            Context context5 = this.$context;
                            Uri uri2 = this.$imageUri;
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                context5.grantUriPermission(((ResolveInfo) it2.next()).activityInfo.packageName, uri2, 1);
                            }
                            Intent intentCreateChooser = Intent.createChooser(intent, this.$shareTitle);
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj3 : listQueryIntentActivities2) {
                                if (!arrayList.contains((ResolveInfo) obj3)) {
                                    arrayList2.add(obj3);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                ActivityInfo activityInfo2 = ((ResolveInfo) it3.next()).activityInfo;
                                arrayList3.add(new ComponentName(activityInfo2.packageName, activityInfo2.name));
                            }
                            intentCreateChooser.putExtra("android.intent.extra.EXCLUDE_COMPONENTS", (Parcelable[]) arrayList3.toArray(new ComponentName[0]));
                            this.$context.startActivity(intentCreateChooser);
                        }
                    }
                } else {
                    if (i != 1 && i != 2 && i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
    }

    public static final Object shareScreenshotViaSms(Context context, Bitmap bitmap, String str, String str2, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C374822(bitmap, context, str, str2, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public static final boolean isAppInstalled(Context context, String packageName) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            context.getPackageManager().getPackageInfo(packageName, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static /* synthetic */ Object shareScreenshotToExternalApp$default(Context context, Bitmap bitmap, String str, String str2, String str3, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        return shareScreenshotToExternalApp(context, bitmap, str, str2, str3, continuation);
    }

    /* compiled from: ShareScreenshot.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.common.screenshot.sharing.ShareScreenshotKt$shareScreenshotToExternalApp$2", m3645f = "ShareScreenshot.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.common.screenshot.sharing.ShareScreenshotKt$shareScreenshotToExternalApp$2 */
    static final class C374812 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Bitmap $bitmap;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $message;
        final /* synthetic */ String $packageName;
        final /* synthetic */ String $shareTitle;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C374812(Bitmap bitmap, Context context, String str, String str2, String str3, Continuation<? super C374812> continuation) {
            super(2, continuation);
            this.$bitmap = bitmap;
            this.$context = context;
            this.$packageName = str;
            this.$shareTitle = str2;
            this.$message = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C374812(this.$bitmap, this.$context, this.$packageName, this.$shareTitle, this.$message, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C374812) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r12, r3, r11) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Bitmap bitmap = this.$bitmap;
                Context context = this.$context;
                this.label = 1;
                obj = CaptureScreenshot.toFileUri(bitmap, context, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            Uri uri = (Uri) obj;
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, this.$packageName, this.$shareTitle, uri, this.$message, this.$bitmap, null);
            this.label = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object invokeSuspend$fallbackToGeneralShare(Context context, Bitmap bitmap, String str, String str2, Continuation<? super Unit> continuation) {
            Object objShareScreenshot = ShareScreenshot.shareScreenshot(context, bitmap, str, str2, continuation);
            return objShareScreenshot == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objShareScreenshot : Unit.INSTANCE;
        }

        /* compiled from: ShareScreenshot.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.common.screenshot.sharing.ShareScreenshotKt$shareScreenshotToExternalApp$2$1", m3645f = "ShareScreenshot.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.common.screenshot.sharing.ShareScreenshotKt$shareScreenshotToExternalApp$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Bitmap $bitmap;
            final /* synthetic */ Context $context;
            final /* synthetic */ Uri $imageUri;
            final /* synthetic */ String $message;
            final /* synthetic */ String $packageName;
            final /* synthetic */ String $shareTitle;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Context context, String str, String str2, Uri uri, String str3, Bitmap bitmap, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$context = context;
                this.$packageName = str;
                this.$shareTitle = str2;
                this.$imageUri = uri;
                this.$message = str3;
                this.$bitmap = bitmap;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$context, this.$packageName, this.$shareTitle, this.$imageUri, this.$message, this.$bitmap, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
            
                if (com.robinhood.shared.common.screenshot.sharing.ShareScreenshot.C374812.invokeSuspend$fallbackToGeneralShare(r8, r1, r4, r5, r7) == r0) goto L23;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
            
                if (com.robinhood.shared.common.screenshot.sharing.ShareScreenshot.C374812.invokeSuspend$fallbackToGeneralShare(r8, r1, r3, r4, r7) != r0) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
            
                return r0;
             */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                } catch (Exception unused) {
                    Context context = this.$context;
                    Bitmap bitmap = this.$bitmap;
                    String str = this.$shareTitle;
                    String str2 = this.$message;
                    this.label = 2;
                }
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Intent intent = new Intent("android.intent.action.SEND");
                    Uri uri = this.$imageUri;
                    String str3 = this.$message;
                    String str4 = this.$packageName;
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", uri);
                    intent.putExtra("android.intent.extra.TEXT", str3);
                    intent.addFlags(1);
                    intent.setPackage(str4);
                    if (ShareScreenshot.isAppInstalled(this.$context, this.$packageName)) {
                        Context context2 = this.$context;
                        String str5 = this.$shareTitle;
                        if (str5 == null) {
                            str5 = "";
                        }
                        context2.startActivity(Intent.createChooser(intent, str5));
                    } else {
                        Context context3 = this.$context;
                        Bitmap bitmap2 = this.$bitmap;
                        String str6 = this.$shareTitle;
                        String str7 = this.$message;
                        this.label = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
    }

    public static final Object shareScreenshotToExternalApp(Context context, Bitmap bitmap, String str, String str2, String str3, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C374812(bitmap, context, str, str2, str3, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }
}
