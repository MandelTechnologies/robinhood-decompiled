package com.robinhood.compose.bento.theme;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.account.p060ui.AccountNavigationViewState;
import com.robinhood.compose.theme.SduiColors;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

/* compiled from: BentoSduiColors.kt */
@Metadata(m3635d1 = {"\u0000\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0003\bÕ\u0001\n\u0002\u0010\u000b\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0007R\u0014\u0010\u001a\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0007R\u0014\u0010\u001c\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0007R\u0014\u0010\u001e\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0007R\u0014\u0010 \u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0007R\u0014\u0010\"\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0007R\u0014\u0010$\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0007R\u0014\u0010&\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0007R\u0014\u0010(\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0007R\u0014\u0010*\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0007R\u0014\u0010,\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0007R\u0014\u0010.\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0007R\u0014\u00100\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0007R\u0014\u00102\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0007R\u0014\u00104\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0007R\u0014\u00106\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0007R\u0014\u00108\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u0007R\u0014\u0010:\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u0007R\u0014\u0010<\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u0007R\u0014\u0010>\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u0007R\u0014\u0010@\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\u0007R\u0014\u0010B\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\u0007R\u0014\u0010D\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\u0007R\u0014\u0010F\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\u0007R\u0014\u0010H\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010\u0007R\u0014\u0010J\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\u0007R\u0014\u0010L\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010\u0007R\u0014\u0010N\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010\u0007R\u0014\u0010P\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010\u0007R\u0014\u0010R\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010\u0007R\u0014\u0010T\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010\u0007R\u0014\u0010V\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010\u0007R\u0014\u0010X\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010\u0007R\u0014\u0010Z\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\u0007R\u0014\u0010\\\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010\u0007R\u0014\u0010^\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010\u0007R\u0014\u0010`\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010\u0007R\u0014\u0010b\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010\u0007R\u0014\u0010d\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010\u0007R\u0014\u0010f\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010\u0007R\u0014\u0010h\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010\u0007R\u0014\u0010j\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010\u0007R\u0014\u0010l\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010\u0007R\u0014\u0010n\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010\u0007R\u0014\u0010p\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bq\u0010\u0007R\u0014\u0010r\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bs\u0010\u0007R\u0014\u0010t\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bu\u0010\u0007R\u0014\u0010v\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bw\u0010\u0007R\u0014\u0010x\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010\u0007R\u0014\u0010z\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b{\u0010\u0007R\u0014\u0010|\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b}\u0010\u0007R\u0014\u0010~\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010\u0007R\u0016\u0010\u0080\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010\u0007R\u0016\u0010\u0082\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010\u0007R\u0016\u0010\u0084\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010\u0007R\u0016\u0010\u0086\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010\u0007R\u0016\u0010\u0088\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010\u0007R\u0016\u0010\u008a\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010\u0007R\u0016\u0010\u008c\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010\u0007R\u0016\u0010\u008e\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u0010\u0007R\u0016\u0010\u0090\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0091\u0001\u0010\u0007R\u0016\u0010\u0092\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010\u0007R\u0016\u0010\u0094\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010\u0007R\u0016\u0010\u0096\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010\u0007R\u0016\u0010\u0098\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010\u0007R\u0016\u0010\u009a\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u0010\u0007R\u0016\u0010\u009c\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010\u0007R\u0016\u0010\u009e\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009f\u0001\u0010\u0007R\u0016\u0010 \u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¡\u0001\u0010\u0007R\u0016\u0010¢\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b£\u0001\u0010\u0007R\u0016\u0010¤\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¥\u0001\u0010\u0007R\u0016\u0010¦\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b§\u0001\u0010\u0007R\u0016\u0010¨\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b©\u0001\u0010\u0007R\u0016\u0010ª\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b«\u0001\u0010\u0007R\u0016\u0010¬\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u00ad\u0001\u0010\u0007R\u0016\u0010®\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¯\u0001\u0010\u0007R\u0016\u0010°\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b±\u0001\u0010\u0007R\u0016\u0010²\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b³\u0001\u0010\u0007R\u0016\u0010´\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bµ\u0001\u0010\u0007R\u0016\u0010¶\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b·\u0001\u0010\u0007R\u0016\u0010¸\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¹\u0001\u0010\u0007R\u0016\u0010º\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b»\u0001\u0010\u0007R\u0016\u0010¼\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b½\u0001\u0010\u0007R\u0016\u0010¾\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¿\u0001\u0010\u0007R\u0016\u0010À\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÁ\u0001\u0010\u0007R\u0016\u0010Â\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÃ\u0001\u0010\u0007R\u0016\u0010Ä\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÅ\u0001\u0010\u0007R\u0016\u0010Æ\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÇ\u0001\u0010\u0007R\u0016\u0010È\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÉ\u0001\u0010\u0007R\u0016\u0010Ê\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bË\u0001\u0010\u0007R\u0016\u0010Ì\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÍ\u0001\u0010\u0007R\u0016\u0010Î\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÏ\u0001\u0010\u0007R\u0016\u0010Ð\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÑ\u0001\u0010\u0007R\u0016\u0010Ò\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÓ\u0001\u0010\u0007R\u0016\u0010Ô\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÕ\u0001\u0010\u0007R\u0016\u0010Ö\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b×\u0001\u0010\u0007R\u0016\u0010Ø\u0001\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÙ\u0001\u0010\u0007R\u0018\u0010Ú\u0001\u001a\u00030Û\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bÚ\u0001\u0010Ü\u0001¨\u0006Ý\u0001"}, m3636d2 = {"Lcom/robinhood/compose/bento/theme/BentoSduiColors;", "Lcom/robinhood/compose/theme/SduiColors;", "<init>", "()V", "accent", "Landroidx/compose/ui/graphics/Color;", "getAccent", "(Landroidx/compose/runtime/Composer;I)J", AccountNavigationViewState.LOG_OUT_TEXT_COLOR, "getPositive", "negative", "getNegative", "fg", "getFg", "fg2", "getFg2", "fg3", "getFg3", "bg3", "getBg3", "bg2", "getBg2", "bg", "getBg", "jet", "getJet", "nova", "getNova", "jouleLight", "getJouleLight", "joule", "getJoule", "jouleDark", "getJouleDark", "solLight", "getSolLight", "sol", "getSol", "solDark", "getSolDark", "lumenLight", "getLumenLight", "lumen", "getLumen", "lumenDark", "getLumenDark", "xrayLight", "getXrayLight", "xray", "getXray", "xrayDark", "getXrayDark", "primeLight", "getPrimeLight", "prime", "getPrime", "primeDark", "getPrimeDark", "biomeLight", "getBiomeLight", "biome", "getBiome", "biomeDark", "getBiomeDark", "dotLight", "getDotLight", "dot", "getDot", "dotDark", "getDotDark", "hydroLight", "getHydroLight", "hydro", "getHydro", "hydroDark", "getHydroDark", "cosmonautLight", "getCosmonautLight", "cosmonaut", "getCosmonaut", "cosmonautDark", "getCosmonautDark", "uvLight", "getUvLight", "uv", "getUv", "uvDark", "getUvDark", "irisLight", "getIrisLight", "iris", "getIris", "irisDark", "getIrisDark", "milleniumLight", "getMilleniumLight", "millenium", "getMillenium", "milleniumDark", "getMilleniumDark", "resinLight", "getResinLight", "resin", "getResin", "resinDark", "getResinDark", "droidLight", "getDroidLight", "droid", "getDroid", "droidDark", "getDroidDark", "cloneLight", "getCloneLight", "clone", "getClone", "cloneDark", "getCloneDark", "mineral", "getMineral", "andros", "getAndros", "ion", "getIon", "jade", "getJade", "stratos", "getStratos", "exos", "getExos", "ruby", "getRuby", "gaia", "getGaia", "neon", "getNeon", "bloom", "getBloom", "flare", "getFlare", "moon", "getMoon", "morph", "getMorph", "astro", "getAstro", "neptune", "getNeptune", "synth", "getSynth", "c1", "getC1", "c2", "getC2", "c3", "getC3", "c4", "getC4", "c5", "getC5", "c6", "getC6", "c7", "getC7", "c8", "getC8", "c9", "getC9", "c10", "getC10", "c11", "getC11", "c12", "getC12", "c13", "getC13", "c14", "getC14", "c15", "getC15", "c16", "getC16", "c17", "getC17", "c18", "getC18", "c19", "getC19", "c20", "getC20", "ccGoldFg", "getCcGoldFg", "ccGoldFg2", "getCcGoldFg2", "ccGoldFg3", "getCcGoldFg3", "ccGoldBg", "getCcGoldBg", "ccGoldBg2", "getCcGoldBg2", "ccGoldBg3", "getCcGoldBg3", "ccGoldAccent", "getCcGoldAccent", "ccSilverAccent", "getCcSilverAccent", "ccSilverFg", "getCcSilverFg", "ccSilverFg2", "getCcSilverFg2", "ccSilverFg3", "getCcSilverFg3", "ccSilverBg", "getCcSilverBg", "ccSilverBg2", "getCcSilverBg2", "ccSilverBg3", "getCcSilverBg3", "isDay", "", "(Landroidx/compose/runtime/Composer;I)Z", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class BentoSduiColors implements SduiColors {
    public static final int $stable = 0;
    public static final BentoSduiColors INSTANCE = new BentoSduiColors();

    private BentoSduiColors() {
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getAccent, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21480getAccent(Composer composer, int i) {
        return Color.m6701boximpl(getAccent(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getAndros, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21481getAndros(Composer composer, int i) {
        return Color.m6701boximpl(getAndros(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getAstro, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21482getAstro(Composer composer, int i) {
        return Color.m6701boximpl(getAstro(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getBiome, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21483getBiome(Composer composer, int i) {
        return Color.m6701boximpl(getBiome(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getBiomeDark, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21484getBiomeDark(Composer composer, int i) {
        return Color.m6701boximpl(getBiomeDark(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getBiomeLight, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21485getBiomeLight(Composer composer, int i) {
        return Color.m6701boximpl(getBiomeLight(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getBloom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21486getBloom(Composer composer, int i) {
        return Color.m6701boximpl(getBloom(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getC1, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21487getC1(Composer composer, int i) {
        return Color.m6701boximpl(getC1(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getC10, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21488getC10(Composer composer, int i) {
        return Color.m6701boximpl(getC10(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getC11, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21489getC11(Composer composer, int i) {
        return Color.m6701boximpl(getC11(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getC12, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21490getC12(Composer composer, int i) {
        return Color.m6701boximpl(getC12(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getC13, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21491getC13(Composer composer, int i) {
        return Color.m6701boximpl(getC13(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getC14, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21492getC14(Composer composer, int i) {
        return Color.m6701boximpl(getC14(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getC15, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21493getC15(Composer composer, int i) {
        return Color.m6701boximpl(getC15(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getC16, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21494getC16(Composer composer, int i) {
        return Color.m6701boximpl(getC16(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getC17, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21495getC17(Composer composer, int i) {
        return Color.m6701boximpl(getC17(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getC18, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21496getC18(Composer composer, int i) {
        return Color.m6701boximpl(getC18(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getC19, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21497getC19(Composer composer, int i) {
        return Color.m6701boximpl(getC19(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getC2, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21498getC2(Composer composer, int i) {
        return Color.m6701boximpl(getC2(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getC20, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21499getC20(Composer composer, int i) {
        return Color.m6701boximpl(getC20(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getC3, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21500getC3(Composer composer, int i) {
        return Color.m6701boximpl(getC3(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getC4, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21501getC4(Composer composer, int i) {
        return Color.m6701boximpl(getC4(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getC5, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21502getC5(Composer composer, int i) {
        return Color.m6701boximpl(getC5(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getC6, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21503getC6(Composer composer, int i) {
        return Color.m6701boximpl(getC6(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getC7, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21504getC7(Composer composer, int i) {
        return Color.m6701boximpl(getC7(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getC8, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21505getC8(Composer composer, int i) {
        return Color.m6701boximpl(getC8(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getC9, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21506getC9(Composer composer, int i) {
        return Color.m6701boximpl(getC9(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getCcGoldAccent, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21507getCcGoldAccent(Composer composer, int i) {
        return Color.m6701boximpl(getCcGoldAccent(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getCcGoldBg, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21508getCcGoldBg(Composer composer, int i) {
        return Color.m6701boximpl(getCcGoldBg(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getCcGoldBg2, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21509getCcGoldBg2(Composer composer, int i) {
        return Color.m6701boximpl(getCcGoldBg2(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getCcGoldBg3, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21510getCcGoldBg3(Composer composer, int i) {
        return Color.m6701boximpl(getCcGoldBg3(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getCcGoldFg, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21511getCcGoldFg(Composer composer, int i) {
        return Color.m6701boximpl(getCcGoldFg(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getCcGoldFg2, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21512getCcGoldFg2(Composer composer, int i) {
        return Color.m6701boximpl(getCcGoldFg2(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getCcGoldFg3, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21513getCcGoldFg3(Composer composer, int i) {
        return Color.m6701boximpl(getCcGoldFg3(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getCcSilverAccent, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21514getCcSilverAccent(Composer composer, int i) {
        return Color.m6701boximpl(getCcSilverAccent(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getCcSilverBg, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21515getCcSilverBg(Composer composer, int i) {
        return Color.m6701boximpl(getCcSilverBg(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getCcSilverBg2, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21516getCcSilverBg2(Composer composer, int i) {
        return Color.m6701boximpl(getCcSilverBg2(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getCcSilverBg3, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21517getCcSilverBg3(Composer composer, int i) {
        return Color.m6701boximpl(getCcSilverBg3(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getCcSilverFg, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21518getCcSilverFg(Composer composer, int i) {
        return Color.m6701boximpl(getCcSilverFg(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getCcSilverFg2, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21519getCcSilverFg2(Composer composer, int i) {
        return Color.m6701boximpl(getCcSilverFg2(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getCcSilverFg3, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21520getCcSilverFg3(Composer composer, int i) {
        return Color.m6701boximpl(getCcSilverFg3(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getClone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21521getClone(Composer composer, int i) {
        return Color.m6701boximpl(getClone(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getCloneDark, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21522getCloneDark(Composer composer, int i) {
        return Color.m6701boximpl(getCloneDark(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getCloneLight, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21523getCloneLight(Composer composer, int i) {
        return Color.m6701boximpl(getCloneLight(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getCosmonaut, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21524getCosmonaut(Composer composer, int i) {
        return Color.m6701boximpl(getCosmonaut(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getCosmonautDark, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21525getCosmonautDark(Composer composer, int i) {
        return Color.m6701boximpl(getCosmonautDark(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getCosmonautLight, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21526getCosmonautLight(Composer composer, int i) {
        return Color.m6701boximpl(getCosmonautLight(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getDot, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21527getDot(Composer composer, int i) {
        return Color.m6701boximpl(getDot(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getDotDark, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21528getDotDark(Composer composer, int i) {
        return Color.m6701boximpl(getDotDark(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getDotLight, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21529getDotLight(Composer composer, int i) {
        return Color.m6701boximpl(getDotLight(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getDroid, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21530getDroid(Composer composer, int i) {
        return Color.m6701boximpl(getDroid(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getDroidDark, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21531getDroidDark(Composer composer, int i) {
        return Color.m6701boximpl(getDroidDark(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getDroidLight, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21532getDroidLight(Composer composer, int i) {
        return Color.m6701boximpl(getDroidLight(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getExos, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21533getExos(Composer composer, int i) {
        return Color.m6701boximpl(getExos(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getFlare, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21534getFlare(Composer composer, int i) {
        return Color.m6701boximpl(getFlare(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getGaia, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21535getGaia(Composer composer, int i) {
        return Color.m6701boximpl(getGaia(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getHydro, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21536getHydro(Composer composer, int i) {
        return Color.m6701boximpl(getHydro(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getHydroDark, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21537getHydroDark(Composer composer, int i) {
        return Color.m6701boximpl(getHydroDark(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getHydroLight, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21538getHydroLight(Composer composer, int i) {
        return Color.m6701boximpl(getHydroLight(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getIon, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21539getIon(Composer composer, int i) {
        return Color.m6701boximpl(getIon(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getIris, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21540getIris(Composer composer, int i) {
        return Color.m6701boximpl(getIris(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getIrisDark, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21541getIrisDark(Composer composer, int i) {
        return Color.m6701boximpl(getIrisDark(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getIrisLight, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21542getIrisLight(Composer composer, int i) {
        return Color.m6701boximpl(getIrisLight(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getJade, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21543getJade(Composer composer, int i) {
        return Color.m6701boximpl(getJade(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getJet, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21544getJet(Composer composer, int i) {
        return Color.m6701boximpl(getJet(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getJoule, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21545getJoule(Composer composer, int i) {
        return Color.m6701boximpl(getJoule(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getJouleDark, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21546getJouleDark(Composer composer, int i) {
        return Color.m6701boximpl(getJouleDark(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getJouleLight, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21547getJouleLight(Composer composer, int i) {
        return Color.m6701boximpl(getJouleLight(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getLumen, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21548getLumen(Composer composer, int i) {
        return Color.m6701boximpl(getLumen(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getLumenDark, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21549getLumenDark(Composer composer, int i) {
        return Color.m6701boximpl(getLumenDark(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getLumenLight, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21550getLumenLight(Composer composer, int i) {
        return Color.m6701boximpl(getLumenLight(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getMillenium, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21551getMillenium(Composer composer, int i) {
        return Color.m6701boximpl(getMillenium(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getMilleniumDark, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21552getMilleniumDark(Composer composer, int i) {
        return Color.m6701boximpl(getMilleniumDark(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getMilleniumLight, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21553getMilleniumLight(Composer composer, int i) {
        return Color.m6701boximpl(getMilleniumLight(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getMineral, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21554getMineral(Composer composer, int i) {
        return Color.m6701boximpl(getMineral(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getMoon, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21555getMoon(Composer composer, int i) {
        return Color.m6701boximpl(getMoon(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getMorph, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21556getMorph(Composer composer, int i) {
        return Color.m6701boximpl(getMorph(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getNegative, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21557getNegative(Composer composer, int i) {
        return Color.m6701boximpl(getNegative(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getNeon, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21558getNeon(Composer composer, int i) {
        return Color.m6701boximpl(getNeon(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getNeptune, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21559getNeptune(Composer composer, int i) {
        return Color.m6701boximpl(getNeptune(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getNova, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21560getNova(Composer composer, int i) {
        return Color.m6701boximpl(getNova(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getPositive, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21561getPositive(Composer composer, int i) {
        return Color.m6701boximpl(getPositive(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getPrime, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21562getPrime(Composer composer, int i) {
        return Color.m6701boximpl(getPrime(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getPrimeDark, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21563getPrimeDark(Composer composer, int i) {
        return Color.m6701boximpl(getPrimeDark(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getPrimeLight, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21564getPrimeLight(Composer composer, int i) {
        return Color.m6701boximpl(getPrimeLight(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getResin, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21565getResin(Composer composer, int i) {
        return Color.m6701boximpl(getResin(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getResinDark, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21566getResinDark(Composer composer, int i) {
        return Color.m6701boximpl(getResinDark(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getResinLight, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21567getResinLight(Composer composer, int i) {
        return Color.m6701boximpl(getResinLight(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getRuby, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21568getRuby(Composer composer, int i) {
        return Color.m6701boximpl(getRuby(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getSol, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21569getSol(Composer composer, int i) {
        return Color.m6701boximpl(getSol(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getSolDark, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21570getSolDark(Composer composer, int i) {
        return Color.m6701boximpl(getSolDark(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getSolLight, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21571getSolLight(Composer composer, int i) {
        return Color.m6701boximpl(getSolLight(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getStratos, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21572getStratos(Composer composer, int i) {
        return Color.m6701boximpl(getStratos(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getSynth, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21573getSynth(Composer composer, int i) {
        return Color.m6701boximpl(getSynth(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getUv, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21574getUv(Composer composer, int i) {
        return Color.m6701boximpl(getUv(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getUvDark, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21575getUvDark(Composer composer, int i) {
        return Color.m6701boximpl(getUvDark(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getUvLight, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21576getUvLight(Composer composer, int i) {
        return Color.m6701boximpl(getUvLight(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getXray, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21577getXray(Composer composer, int i) {
        return Color.m6701boximpl(getXray(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getXrayDark, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21578getXrayDark(Composer composer, int i) {
        return Color.m6701boximpl(getXrayDark(composer, i));
    }

    @Override // com.robinhood.compose.theme.SduiColors
    /* renamed from: getXrayLight, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Color mo21579getXrayLight(Composer composer, int i) {
        return Color.m6701boximpl(getXrayLight(composer, i));
    }

    @JvmName
    public long getAccent(Composer composer, int i) {
        composer.startReplaceGroup(-1708660482);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1708660482, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-accent> (BentoSduiColors.kt:14)");
        }
        long jM21368getAccent0d7_KjU = BentoTheme.INSTANCE.getColors(composer, 6).m21368getAccent0d7_KjU();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM21368getAccent0d7_KjU;
    }

    @JvmName
    public long getPositive(Composer composer, int i) {
        composer.startReplaceGroup(-83714210);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-83714210, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-positive> (BentoSduiColors.kt:17)");
        }
        long jM21456getPositive0d7_KjU = BentoTheme.INSTANCE.getColors(composer, 6).m21456getPositive0d7_KjU();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM21456getPositive0d7_KjU;
    }

    @JvmName
    public long getNegative(Composer composer, int i) {
        composer.startReplaceGroup(-1842767138);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1842767138, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-negative> (BentoSduiColors.kt:20)");
        }
        long jM21452getNegative0d7_KjU = BentoTheme.INSTANCE.getColors(composer, 6).m21452getNegative0d7_KjU();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM21452getNegative0d7_KjU;
    }

    @Override // com.robinhood.compose.theme.SduiColors
    @JvmName
    public long getFg(Composer composer, int i) {
        composer.startReplaceGroup(1004816542);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1004816542, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-fg> (BentoSduiColors.kt:26)");
        }
        long jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, 6).m21425getFg0d7_KjU();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM21425getFg0d7_KjU;
    }

    @Override // com.robinhood.compose.theme.SduiColors
    @JvmName
    public long getFg2(Composer composer, int i) {
        composer.startReplaceGroup(-494305548);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-494305548, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-fg2> (BentoSduiColors.kt:30)");
        }
        long jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composer, 6).m21426getFg20d7_KjU();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM21426getFg20d7_KjU;
    }

    @Override // com.robinhood.compose.theme.SduiColors
    @JvmName
    public long getFg3(Composer composer, int i) {
        composer.startReplaceGroup(-1644327050);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1644327050, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-fg3> (BentoSduiColors.kt:34)");
        }
        long jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer, 6).m21427getFg30d7_KjU();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM21427getFg30d7_KjU;
    }

    @Override // com.robinhood.compose.theme.SduiColors
    @JvmName
    public long getBg3(Composer composer, int i) {
        composer.startReplaceGroup(-483020946);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-483020946, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-bg3> (BentoSduiColors.kt:38)");
        }
        long jM21373getBg30d7_KjU = BentoTheme.INSTANCE.getColors(composer, 6).m21373getBg30d7_KjU();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM21373getBg30d7_KjU;
    }

    @Override // com.robinhood.compose.theme.SduiColors
    @JvmName
    public long getBg2(Composer composer, int i) {
        composer.startReplaceGroup(667000556);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(667000556, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-bg2> (BentoSduiColors.kt:42)");
        }
        long jM21372getBg20d7_KjU = BentoTheme.INSTANCE.getColors(composer, 6).m21372getBg20d7_KjU();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM21372getBg20d7_KjU;
    }

    @Override // com.robinhood.compose.theme.SduiColors
    @JvmName
    public long getBg(Composer composer, int i) {
        composer.startReplaceGroup(390115870);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(390115870, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-bg> (BentoSduiColors.kt:46)");
        }
        long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, 6).m21371getBg0d7_KjU();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM21371getBg0d7_KjU;
    }

    @JvmName
    public long getJet(Composer composer, int i) {
        composer.startReplaceGroup(-1960730364);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1960730364, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-jet> (BentoSduiColors.kt:52)");
        }
        long jet = BentoTheme.INSTANCE.getColors(composer, 6).getJet();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jet;
    }

    @JvmName
    public long getNova(Composer composer, int i) {
        composer.startReplaceGroup(-1196779842);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1196779842, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-nova> (BentoSduiColors.kt:56)");
        }
        long nova = BentoTheme.INSTANCE.getColors(composer, 6).getNova();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return nova;
    }

    @JvmName
    public long getJouleLight(Composer composer, int i) {
        composer.startReplaceGroup(1878844958);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1878844958, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-jouleLight> (BentoSduiColors.kt:60)");
        }
        long jouleLight = BentoTheme.INSTANCE.getColors(composer, 6).getJouleLight();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jouleLight;
    }

    @JvmName
    public long getJoule(Composer composer, int i) {
        composer.startReplaceGroup(-1297996764);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1297996764, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-joule> (BentoSduiColors.kt:63)");
        }
        long joule = BentoTheme.INSTANCE.getColors(composer, 6).getJoule();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return joule;
    }

    @JvmName
    public long getJouleDark(Composer composer, int i) {
        composer.startReplaceGroup(-1077325744);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1077325744, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-jouleDark> (BentoSduiColors.kt:66)");
        }
        long jouleDark = BentoTheme.INSTANCE.getColors(composer, 6).getJouleDark();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jouleDark;
    }

    @JvmName
    public long getSolLight(Composer composer, int i) {
        composer.startReplaceGroup(566711294);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(566711294, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-solLight> (BentoSduiColors.kt:70)");
        }
        long solLight = BentoTheme.INSTANCE.getColors(composer, 6).getSolLight();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return solLight;
    }

    @JvmName
    public long getSol(Composer composer, int i) {
        composer.startReplaceGroup(-766586254);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-766586254, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-sol> (BentoSduiColors.kt:73)");
        }
        long sol = BentoTheme.INSTANCE.getColors(composer, 6).getSol();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return sol;
    }

    @JvmName
    public long getSolDark(Composer composer, int i) {
        composer.startReplaceGroup(1333811614);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1333811614, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-solDark> (BentoSduiColors.kt:76)");
        }
        long solDark = BentoTheme.INSTANCE.getColors(composer, 6).getSolDark();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return solDark;
    }

    @JvmName
    public long getLumenLight(Composer composer, int i) {
        composer.startReplaceGroup(1115747486);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1115747486, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-lumenLight> (BentoSduiColors.kt:80)");
        }
        long lumenLight = BentoTheme.INSTANCE.getColors(composer, 6).getLumenLight();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return lumenLight;
    }

    @JvmName
    public long getLumen(Composer composer, int i) {
        composer.startReplaceGroup(-470343188);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-470343188, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-lumen> (BentoSduiColors.kt:83)");
        }
        long lumen = BentoTheme.INSTANCE.getColors(composer, 6).getLumen();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return lumen;
    }

    @JvmName
    public long getLumenDark(Composer composer, int i) {
        composer.startReplaceGroup(1305860120);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1305860120, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-lumenDark> (BentoSduiColors.kt:86)");
        }
        long lumenDark = BentoTheme.INSTANCE.getColors(composer, 6).getLumenDark();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return lumenDark;
    }

    @JvmName
    public long getXrayLight(Composer composer, int i) {
        composer.startReplaceGroup(716663130);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(716663130, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-xrayLight> (BentoSduiColors.kt:90)");
        }
        long xrayLight = BentoTheme.INSTANCE.getColors(composer, 6).getXrayLight();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return xrayLight;
    }

    @JvmName
    public long getXray(Composer composer, int i) {
        composer.startReplaceGroup(2088461950);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2088461950, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-xray> (BentoSduiColors.kt:95)");
        }
        long jM21456getPositive0d7_KjU = BentoTheme.INSTANCE.getColors(composer, 6).m21456getPositive0d7_KjU();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM21456getPositive0d7_KjU;
    }

    @JvmName
    public long getXrayDark(Composer composer, int i) {
        composer.startReplaceGroup(-475023810);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-475023810, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-xrayDark> (BentoSduiColors.kt:98)");
        }
        long xrayDark = BentoTheme.INSTANCE.getColors(composer, 6).getXrayDark();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return xrayDark;
    }

    @JvmName
    public long getPrimeLight(Composer composer, int i) {
        composer.startReplaceGroup(1494351838);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1494351838, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-primeLight> (BentoSduiColors.kt:102)");
        }
        long primeLight = BentoTheme.INSTANCE.getColors(composer, 6).getPrimeLight();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return primeLight;
    }

    @JvmName
    public long getPrime(Composer composer, int i) {
        composer.startReplaceGroup(984392720);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(984392720, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-prime> (BentoSduiColors.kt:105)");
        }
        long prime = BentoTheme.INSTANCE.getColors(composer, 6).getPrime();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return prime;
    }

    @JvmName
    public long getPrimeDark(Composer composer, int i) {
        composer.startReplaceGroup(-518017220);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-518017220, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-primeDark> (BentoSduiColors.kt:108)");
        }
        long primeDark = BentoTheme.INSTANCE.getColors(composer, 6).getPrimeDark();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return primeDark;
    }

    @JvmName
    public long getBiomeLight(Composer composer, int i) {
        composer.startReplaceGroup(-660907906);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-660907906, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-biomeLight> (BentoSduiColors.kt:112)");
        }
        long biomeLight = BentoTheme.INSTANCE.getColors(composer, 6).getBiomeLight();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return biomeLight;
    }

    @JvmName
    public long getBiome(Composer composer, int i) {
        composer.startReplaceGroup(1333882002);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1333882002, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-biome> (BentoSduiColors.kt:115)");
        }
        long biome = BentoTheme.INSTANCE.getColors(composer, 6).getBiome();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return biome;
    }

    @JvmName
    public long getBiomeDark(Composer composer, int i) {
        composer.startReplaceGroup(1335971390);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1335971390, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-biomeDark> (BentoSduiColors.kt:118)");
        }
        long biomeDark = BentoTheme.INSTANCE.getColors(composer, 6).getBiomeDark();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return biomeDark;
    }

    @JvmName
    public long getDotLight(Composer composer, int i) {
        composer.startReplaceGroup(1002178014);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1002178014, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-dotLight> (BentoSduiColors.kt:122)");
        }
        long dotLight = BentoTheme.INSTANCE.getColors(composer, 6).getDotLight();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return dotLight;
    }

    @JvmName
    public long getDot(Composer composer, int i) {
        composer.startReplaceGroup(1904332388);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1904332388, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-dot> (BentoSduiColors.kt:125)");
        }
        long dot = BentoTheme.INSTANCE.getColors(composer, 6).getDot();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return dot;
    }

    @JvmName
    public long getDotDark(Composer composer, int i) {
        composer.startReplaceGroup(-1195620336);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1195620336, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-dotDark> (BentoSduiColors.kt:128)");
        }
        long dotDark = BentoTheme.INSTANCE.getColors(composer, 6).getDotDark();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return dotDark;
    }

    @JvmName
    public long getHydroLight(Composer composer, int i) {
        composer.startReplaceGroup(-2009134466);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2009134466, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-hydroLight> (BentoSduiColors.kt:132)");
        }
        long hydroLight = BentoTheme.INSTANCE.getColors(composer, 6).getHydroLight();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return hydroLight;
    }

    @JvmName
    public long getHydro(Composer composer, int i) {
        composer.startReplaceGroup(1211471154);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1211471154, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-hydro> (BentoSduiColors.kt:135)");
        }
        long hydro = BentoTheme.INSTANCE.getColors(composer, 6).getHydro();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return hydro;
    }

    @JvmName
    public long getHydroDark(Composer composer, int i) {
        composer.startReplaceGroup(1077444318);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1077444318, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-hydroDark> (BentoSduiColors.kt:138)");
        }
        long hydroDark = BentoTheme.INSTANCE.getColors(composer, 6).getHydroDark();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return hydroDark;
    }

    @JvmName
    public long getCosmonautLight(Composer composer, int i) {
        composer.startReplaceGroup(1494283486);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1494283486, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-cosmonautLight> (BentoSduiColors.kt:142)");
        }
        long cosmonautLight = BentoTheme.INSTANCE.getColors(composer, 6).getCosmonautLight();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return cosmonautLight;
    }

    @JvmName
    public long getCosmonaut(Composer composer, int i) {
        composer.startReplaceGroup(172380552);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(172380552, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-cosmonaut> (BentoSduiColors.kt:145)");
        }
        long cosmonaut = BentoTheme.INSTANCE.getColors(composer, 6).getCosmonaut();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return cosmonaut;
    }

    @JvmName
    public long getCosmonautDark(Composer composer, int i) {
        composer.startReplaceGroup(-450443340);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-450443340, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-cosmonautDark> (BentoSduiColors.kt:148)");
        }
        long cosmonautDark = BentoTheme.INSTANCE.getColors(composer, 6).getCosmonautDark();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return cosmonautDark;
    }

    @JvmName
    public long getUvLight(Composer composer, int i) {
        composer.startReplaceGroup(990963004);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(990963004, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-uvLight> (BentoSduiColors.kt:152)");
        }
        long uvLight = BentoTheme.INSTANCE.getColors(composer, 6).getUvLight();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return uvLight;
    }

    @JvmName
    public long getUv(Composer composer, int i) {
        composer.startReplaceGroup(-1187758946);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1187758946, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-uv> (BentoSduiColors.kt:157)");
        }
        long jM21452getNegative0d7_KjU = BentoTheme.INSTANCE.getColors(composer, 6).m21452getNegative0d7_KjU();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM21452getNegative0d7_KjU;
    }

    @JvmName
    public long getUvDark(Composer composer, int i) {
        composer.startReplaceGroup(-697221538);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-697221538, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-uvDark> (BentoSduiColors.kt:160)");
        }
        long uvDark = BentoTheme.INSTANCE.getColors(composer, 6).getUvDark();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return uvDark;
    }

    @JvmName
    public long getIrisLight(Composer composer, int i) {
        composer.startReplaceGroup(1970640920);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1970640920, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-irisLight> (BentoSduiColors.kt:164)");
        }
        long irisLight = BentoTheme.INSTANCE.getColors(composer, 6).getIrisLight();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return irisLight;
    }

    @JvmName
    public long getIris(Composer composer, int i) {
        composer.startReplaceGroup(-675812066);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-675812066, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-iris> (BentoSduiColors.kt:167)");
        }
        long iris = BentoTheme.INSTANCE.getColors(composer, 6).getIris();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return iris;
    }

    @JvmName
    public long getIrisDark(Composer composer, int i) {
        composer.startReplaceGroup(561952094);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(561952094, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-irisDark> (BentoSduiColors.kt:170)");
        }
        long irisDark = BentoTheme.INSTANCE.getColors(composer, 6).getIrisDark();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return irisDark;
    }

    @JvmName
    public long getMilleniumLight(Composer composer, int i) {
        composer.startReplaceGroup(-90153730);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-90153730, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-milleniumLight> (BentoSduiColors.kt:174)");
        }
        long milleniumLight = BentoTheme.INSTANCE.getColors(composer, 6).getMilleniumLight();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return milleniumLight;
    }

    @JvmName
    public long getMillenium(Composer composer, int i) {
        composer.startReplaceGroup(-1468150262);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1468150262, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-millenium> (BentoSduiColors.kt:177)");
        }
        long millenium = BentoTheme.INSTANCE.getColors(composer, 6).getMillenium();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return millenium;
    }

    @JvmName
    public long getMilleniumDark(Composer composer, int i) {
        composer.startReplaceGroup(-1333249354);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1333249354, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-milleniumDark> (BentoSduiColors.kt:180)");
        }
        long milleniumDark = BentoTheme.INSTANCE.getColors(composer, 6).getMilleniumDark();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return milleniumDark;
    }

    @JvmName
    public long getResinLight(Composer composer, int i) {
        composer.startReplaceGroup(2033984414);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2033984414, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-resinLight> (BentoSduiColors.kt:184)");
        }
        long resinLight = BentoTheme.INSTANCE.getColors(composer, 6).getResinLight();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return resinLight;
    }

    @JvmName
    public long getResin(Composer composer, int i) {
        composer.startReplaceGroup(250692636);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(250692636, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-resin> (BentoSduiColors.kt:187)");
        }
        long resin = BentoTheme.INSTANCE.getColors(composer, 6).getResin();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return resin;
    }

    @JvmName
    public long getResinDark(Composer composer, int i) {
        composer.startReplaceGroup(1877710408);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1877710408, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-resinDark> (BentoSduiColors.kt:190)");
        }
        long resinDark = BentoTheme.INSTANCE.getColors(composer, 6).getResinDark();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return resinDark;
    }

    @JvmName
    public long getDroidLight(Composer composer, int i) {
        composer.startReplaceGroup(1099067902);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1099067902, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-droidLight> (BentoSduiColors.kt:194)");
        }
        long droidLight = BentoTheme.INSTANCE.getColors(composer, 6).getDroidLight();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return droidLight;
    }

    @JvmName
    public long getDroid(Composer composer, int i) {
        composer.startReplaceGroup(1434689354);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1434689354, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-droid> (BentoSduiColors.kt:197)");
        }
        long droid = BentoTheme.INSTANCE.getColors(composer, 6).getDroid();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return droid;
    }

    @JvmName
    public long getDroidDark(Composer composer, int i) {
        composer.startReplaceGroup(-32139530);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-32139530, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-droidDark> (BentoSduiColors.kt:200)");
        }
        long droidDark = BentoTheme.INSTANCE.getColors(composer, 6).getDroidDark();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return droidDark;
    }

    @JvmName
    public long getCloneLight(Composer composer, int i) {
        composer.startReplaceGroup(360333982);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(360333982, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-cloneLight> (BentoSduiColors.kt:204)");
        }
        long cloneLight = BentoTheme.INSTANCE.getColors(composer, 6).getCloneLight();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return cloneLight;
    }

    @JvmName
    public long getClone(Composer composer, int i) {
        composer.startReplaceGroup(-87652020);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-87652020, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-clone> (BentoSduiColors.kt:207)");
        }
        long clone = BentoTheme.INSTANCE.getColors(composer, 6).getClone();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return clone;
    }

    @JvmName
    public long getCloneDark(Composer composer, int i) {
        composer.startReplaceGroup(-1781123208);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1781123208, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-cloneDark> (BentoSduiColors.kt:210)");
        }
        long cloneDark = BentoTheme.INSTANCE.getColors(composer, 6).getCloneDark();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return cloneDark;
    }

    @JvmName
    public long getMineral(Composer composer, int i) {
        composer.startReplaceGroup(398124326);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(398124326, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-mineral> (BentoSduiColors.kt:214)");
        }
        long mineral = BentoTheme.INSTANCE.getColors(composer, 6).getMineral();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return mineral;
    }

    @JvmName
    public long getAndros(Composer composer, int i) {
        composer.startReplaceGroup(-168756898);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-168756898, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-andros> (BentoSduiColors.kt:217)");
        }
        long andros = BentoTheme.INSTANCE.getColors(composer, 6).getAndros();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return andros;
    }

    @JvmName
    public long getIon(Composer composer, int i) {
        composer.startReplaceGroup(1984119650);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1984119650, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-ion> (BentoSduiColors.kt:220)");
        }
        long ion = BentoTheme.INSTANCE.getColors(composer, 6).getIon();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return ion;
    }

    @JvmName
    public long getJade(Composer composer, int i) {
        composer.startReplaceGroup(66645566);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(66645566, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-jade> (BentoSduiColors.kt:223)");
        }
        long jade = BentoTheme.INSTANCE.getColors(composer, 6).getJade();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jade;
    }

    @JvmName
    public long getStratos(Composer composer, int i) {
        composer.startReplaceGroup(1021388130);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1021388130, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-stratos> (BentoSduiColors.kt:226)");
        }
        long stratos = BentoTheme.INSTANCE.getColors(composer, 6).getStratos();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stratos;
    }

    @JvmName
    public long getExos(Composer composer, int i) {
        composer.startReplaceGroup(590983070);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(590983070, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-exos> (BentoSduiColors.kt:229)");
        }
        long exos = BentoTheme.INSTANCE.getColors(composer, 6).getExos();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return exos;
    }

    @JvmName
    public long getRuby(Composer composer, int i) {
        composer.startReplaceGroup(151433086);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(151433086, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-ruby> (BentoSduiColors.kt:232)");
        }
        long ruby = BentoTheme.INSTANCE.getColors(composer, 6).getRuby();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return ruby;
    }

    @JvmName
    public long getGaia(Composer composer, int i) {
        composer.startReplaceGroup(1096490622);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1096490622, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-gaia> (BentoSduiColors.kt:235)");
        }
        long gaia = BentoTheme.INSTANCE.getColors(composer, 6).getGaia();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return gaia;
    }

    @JvmName
    public long getNeon(Composer composer, int i) {
        composer.startReplaceGroup(-261978882);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-261978882, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-neon> (BentoSduiColors.kt:238)");
        }
        long neon = BentoTheme.INSTANCE.getColors(composer, 6).getNeon();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return neon;
    }

    @JvmName
    public long getBloom(Composer composer, int i) {
        composer.startReplaceGroup(241499160);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(241499160, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-bloom> (BentoSduiColors.kt:244)");
        }
        long bloom = BentoTheme.INSTANCE.getColors(composer, 6).getBloom();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return bloom;
    }

    @JvmName
    public long getFlare(Composer composer, int i) {
        composer.startReplaceGroup(-204251538);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-204251538, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-flare> (BentoSduiColors.kt:247)");
        }
        long flare = BentoTheme.INSTANCE.getColors(composer, 6).getFlare();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return flare;
    }

    @JvmName
    public long getMoon(Composer composer, int i) {
        composer.startReplaceGroup(-1305129506);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1305129506, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-moon> (BentoSduiColors.kt:250)");
        }
        long moon = BentoTheme.INSTANCE.getColors(composer, 6).getMoon();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return moon;
    }

    @JvmName
    public long getMorph(Composer composer, int i) {
        composer.startReplaceGroup(-11978910);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-11978910, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-morph> (BentoSduiColors.kt:253)");
        }
        long morph = BentoTheme.INSTANCE.getColors(composer, 6).getMorph();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return morph;
    }

    @JvmName
    public long getAstro(Composer composer, int i) {
        composer.startReplaceGroup(1759088528);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1759088528, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-astro> (BentoSduiColors.kt:256)");
        }
        long astro = BentoTheme.INSTANCE.getColors(composer, 6).getAstro();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return astro;
    }

    @JvmName
    public long getNeptune(Composer composer, int i) {
        composer.startReplaceGroup(-252163724);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-252163724, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-neptune> (BentoSduiColors.kt:259)");
        }
        long neptune = BentoTheme.INSTANCE.getColors(composer, 6).getNeptune();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return neptune;
    }

    @JvmName
    public long getSynth(Composer composer, int i) {
        composer.startReplaceGroup(-1740445494);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1740445494, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-synth> (BentoSduiColors.kt:262)");
        }
        long synth = BentoTheme.INSTANCE.getColors(composer, 6).getSynth();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return synth;
    }

    @JvmName
    public long getC1(Composer composer, int i) {
        composer.startReplaceGroup(-659095682);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-659095682, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-c1> (BentoSduiColors.kt:268)");
        }
        long c1 = BentoTheme.INSTANCE.getColors(composer, 6).getC1();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return c1;
    }

    @JvmName
    public long getC2(Composer composer, int i) {
        composer.startReplaceGroup(-1173690914);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1173690914, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-c2> (BentoSduiColors.kt:271)");
        }
        long c2 = BentoTheme.INSTANCE.getColors(composer, 6).getC2();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return c2;
    }

    @JvmName
    public long getC3(Composer composer, int i) {
        composer.startReplaceGroup(-1688286146);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1688286146, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-c3> (BentoSduiColors.kt:274)");
        }
        long c3 = BentoTheme.INSTANCE.getColors(composer, 6).getC3();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return c3;
    }

    @JvmName
    public long getC4(Composer composer, int i) {
        composer.startReplaceGroup(2092085918);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2092085918, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-c4> (BentoSduiColors.kt:277)");
        }
        long c4 = BentoTheme.INSTANCE.getColors(composer, 6).getC4();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return c4;
    }

    @JvmName
    public long getC5(Composer composer, int i) {
        composer.startReplaceGroup(1577490686);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1577490686, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-c5> (BentoSduiColors.kt:280)");
        }
        long c5 = BentoTheme.INSTANCE.getColors(composer, 6).getC5();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return c5;
    }

    @JvmName
    public long getC6(Composer composer, int i) {
        composer.startReplaceGroup(1062895454);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1062895454, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-c6> (BentoSduiColors.kt:283)");
        }
        long c6 = BentoTheme.INSTANCE.getColors(composer, 6).getC6();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return c6;
    }

    @JvmName
    public long getC7(Composer composer, int i) {
        composer.startReplaceGroup(548300222);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(548300222, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-c7> (BentoSduiColors.kt:286)");
        }
        long c7 = BentoTheme.INSTANCE.getColors(composer, 6).getC7();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return c7;
    }

    @JvmName
    public long getC8(Composer composer, int i) {
        composer.startReplaceGroup(33704990);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(33704990, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-c8> (BentoSduiColors.kt:289)");
        }
        long c8 = BentoTheme.INSTANCE.getColors(composer, 6).getC8();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return c8;
    }

    @JvmName
    public long getC9(Composer composer, int i) {
        composer.startReplaceGroup(-480890242);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-480890242, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-c9> (BentoSduiColors.kt:292)");
        }
        long c9 = BentoTheme.INSTANCE.getColors(composer, 6).getC9();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return c9;
    }

    @JvmName
    public long getC10(Composer composer, int i) {
        composer.startReplaceGroup(-1701346346);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1701346346, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-c10> (BentoSduiColors.kt:295)");
        }
        long c10 = BentoTheme.INSTANCE.getColors(composer, 6).getC10();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return c10;
    }

    @JvmName
    public long getC11(Composer composer, int i) {
        composer.startReplaceGroup(1443599448);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1443599448, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-c11> (BentoSduiColors.kt:298)");
        }
        long c11 = BentoTheme.INSTANCE.getColors(composer, 6).getC11();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return c11;
    }

    @JvmName
    public long getC12(Composer composer, int i) {
        composer.startReplaceGroup(293577946);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(293577946, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-c12> (BentoSduiColors.kt:301)");
        }
        long c12 = BentoTheme.INSTANCE.getColors(composer, 6).getC12();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return c12;
    }

    @JvmName
    public long getC13(Composer composer, int i) {
        composer.startReplaceGroup(-856443556);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-856443556, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-c13> (BentoSduiColors.kt:304)");
        }
        long c13 = BentoTheme.INSTANCE.getColors(composer, 6).getC13();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return c13;
    }

    @JvmName
    public long getC14(Composer composer, int i) {
        composer.startReplaceGroup(-2006465058);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2006465058, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-c14> (BentoSduiColors.kt:307)");
        }
        long c14 = BentoTheme.INSTANCE.getColors(composer, 6).getC14();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return c14;
    }

    @JvmName
    public long getC15(Composer composer, int i) {
        composer.startReplaceGroup(1138480736);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1138480736, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-c15> (BentoSduiColors.kt:310)");
        }
        long c15 = BentoTheme.INSTANCE.getColors(composer, 6).getC15();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return c15;
    }

    @JvmName
    public long getC16(Composer composer, int i) {
        composer.startReplaceGroup(-11540766);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-11540766, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-c16> (BentoSduiColors.kt:313)");
        }
        long c16 = BentoTheme.INSTANCE.getColors(composer, 6).getC16();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return c16;
    }

    @JvmName
    public long getC17(Composer composer, int i) {
        composer.startReplaceGroup(-1161562268);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1161562268, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-c17> (BentoSduiColors.kt:316)");
        }
        long c17 = BentoTheme.INSTANCE.getColors(composer, 6).getC17();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return c17;
    }

    @JvmName
    public long getC18(Composer composer, int i) {
        composer.startReplaceGroup(1983383526);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1983383526, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-c18> (BentoSduiColors.kt:319)");
        }
        long c18 = BentoTheme.INSTANCE.getColors(composer, 6).getC18();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return c18;
    }

    @JvmName
    public long getC19(Composer composer, int i) {
        composer.startReplaceGroup(833362024);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(833362024, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-c19> (BentoSduiColors.kt:322)");
        }
        long c19 = BentoTheme.INSTANCE.getColors(composer, 6).getC19();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return c19;
    }

    @JvmName
    public long getC20(Composer composer, int i) {
        composer.startReplaceGroup(1302692756);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1302692756, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-c20> (BentoSduiColors.kt:325)");
        }
        long c20 = BentoTheme.INSTANCE.getColors(composer, 6).getC20();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return c20;
    }

    @JvmName
    public long getCcGoldFg(Composer composer, int i) {
        composer.startReplaceGroup(-1524174754);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1524174754, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-ccGoldFg> (BentoSduiColors.kt:331)");
        }
        long ccGoldFg = BentoTheme.INSTANCE.getColors(composer, 6).getCcGoldFg();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return ccGoldFg;
    }

    @JvmName
    public long getCcGoldFg2(Composer composer, int i) {
        composer.startReplaceGroup(-967823308);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-967823308, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-ccGoldFg2> (BentoSduiColors.kt:334)");
        }
        long ccGoldFg2 = BentoTheme.INSTANCE.getColors(composer, 6).getCcGoldFg2();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return ccGoldFg2;
    }

    @JvmName
    public long getCcGoldFg3(Composer composer, int i) {
        composer.startReplaceGroup(1294220278);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1294220278, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-ccGoldFg3> (BentoSduiColors.kt:337)");
        }
        long ccGoldFg3 = BentoTheme.INSTANCE.getColors(composer, 6).getCcGoldFg3();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return ccGoldFg3;
    }

    @JvmName
    public long getCcGoldBg(Composer composer, int i) {
        composer.startReplaceGroup(1392733406);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1392733406, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-ccGoldBg> (BentoSduiColors.kt:340)");
        }
        long ccGoldBg = BentoTheme.INSTANCE.getColors(composer, 6).getCcGoldBg();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return ccGoldBg;
    }

    @JvmName
    public long getCcGoldBg2(Composer composer, int i) {
        composer.startReplaceGroup(1045406508);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1045406508, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-ccGoldBg2> (BentoSduiColors.kt:343)");
        }
        long ccGoldBg2 = BentoTheme.INSTANCE.getColors(composer, 6).getCcGoldBg2();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return ccGoldBg2;
    }

    @JvmName
    public long getCcGoldBg3(Composer composer, int i) {
        composer.startReplaceGroup(-987517202);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-987517202, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-ccGoldBg3> (BentoSduiColors.kt:346)");
        }
        long ccGoldBg3 = BentoTheme.INSTANCE.getColors(composer, 6).getCcGoldBg3();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return ccGoldBg3;
    }

    @JvmName
    public long getCcGoldAccent(Composer composer, int i) {
        composer.startReplaceGroup(-1055878274);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1055878274, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-ccGoldAccent> (BentoSduiColors.kt:349)");
        }
        long ccGoldAccent = BentoTheme.INSTANCE.getColors(composer, 6).getCcGoldAccent();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return ccGoldAccent;
    }

    @JvmName
    public long getCcSilverAccent(Composer composer, int i) {
        composer.startReplaceGroup(1121585502);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1121585502, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-ccSilverAccent> (BentoSduiColors.kt:352)");
        }
        long ccSilverAccent = BentoTheme.INSTANCE.getColors(composer, 6).getCcSilverAccent();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return ccSilverAccent;
    }

    @JvmName
    public long getCcSilverFg(Composer composer, int i) {
        composer.startReplaceGroup(432640382);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(432640382, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-ccSilverFg> (BentoSduiColors.kt:355)");
        }
        long ccSilverFg = BentoTheme.INSTANCE.getColors(composer, 6).getCcSilverFg();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return ccSilverFg;
    }

    @JvmName
    public long getCcSilverFg2(Composer composer, int i) {
        composer.startReplaceGroup(-239628582);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-239628582, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-ccSilverFg2> (BentoSduiColors.kt:358)");
        }
        long ccSilverFg2 = BentoTheme.INSTANCE.getColors(composer, 6).getCcSilverFg2();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return ccSilverFg2;
    }

    @JvmName
    public long getCcSilverFg3(Composer composer, int i) {
        composer.startReplaceGroup(1562185308);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1562185308, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-ccSilverFg3> (BentoSduiColors.kt:361)");
        }
        long ccSilverFg3 = BentoTheme.INSTANCE.getColors(composer, 6).getCcSilverFg3();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return ccSilverFg3;
    }

    @JvmName
    public long getCcSilverBg(Composer composer, int i) {
        composer.startReplaceGroup(895500030);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(895500030, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-ccSilverBg> (BentoSduiColors.kt:364)");
        }
        long ccSilverBg = BentoTheme.INSTANCE.getColors(composer, 6).getCcSilverBg();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return ccSilverBg;
    }

    @JvmName
    public long getCcSilverBg2(Composer composer, int i) {
        composer.startReplaceGroup(1370026706);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1370026706, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-ccSilverBg2> (BentoSduiColors.kt:367)");
        }
        long ccSilverBg2 = BentoTheme.INSTANCE.getColors(composer, 6).getCcSilverBg2();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return ccSilverBg2;
    }

    @JvmName
    public long getCcSilverBg3(Composer composer, int i) {
        composer.startReplaceGroup(-1123126700);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1123126700, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-ccSilverBg3> (BentoSduiColors.kt:370)");
        }
        long ccSilverBg3 = BentoTheme.INSTANCE.getColors(composer, 6).getCcSilverBg3();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return ccSilverBg3;
    }

    @Override // com.robinhood.compose.theme.SduiColors
    @JvmName
    public boolean isDay(Composer composer, int i) {
        composer.startReplaceGroup(1606543227);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1606543227, i, -1, "com.robinhood.compose.bento.theme.BentoSduiColors.<get-isDay> (BentoSduiColors.kt:375)");
        }
        boolean isDay = BentoTheme.INSTANCE.getColors(composer, 6).getIsDay();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return isDay;
    }
}
