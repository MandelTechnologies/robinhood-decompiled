package com.robinhood.android.equitydetail.p123ui.about.p124v2;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: AboutV2StateProvider.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aO\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u0001H\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00060\nH\u0002¢\u0006\u0002\u0010\u000b\u001a0\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002¨\u0006\f"}, m3636d2 = {"addItem", "", "T", "", "Lcom/robinhood/android/equitydetail/ui/about/v2/AboutV2Info;", AnnotatedPrivateKey.LABEL, "", "value", "educationTourId", "transform", "Lkotlin/Function1;", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "feature-equity-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.about.v2.AboutV2StateProviderKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class AboutV2StateProvider5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String addItem$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }

    static /* synthetic */ void addItem$default(List list, String str, Object obj, String str2, Function1 function1, int i, Object obj2) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        addItem(list, str, obj, str2, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> void addItem(List<AboutV2Info> list, String str, T t, String str2, Function1<? super T, String> function1) {
        if (t != null) {
            list.add(new AboutV2Info(str, function1.invoke(t), str2));
        }
    }

    static /* synthetic */ void addItem$default(List list, String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        addItem(list, str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addItem(List<AboutV2Info> list, String str, String str2, String str3) {
        addItem(list, str, str2, str3, new Function1() { // from class: com.robinhood.android.equitydetail.ui.about.v2.AboutV2StateProviderKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AboutV2StateProvider5.addItem$lambda$0((String) obj);
            }
        });
    }
}
